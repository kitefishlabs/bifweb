(ns kitefishlabs.scrape-and-render-venues
  (:require [clojure.walk]
            [clj-http.client :as client]
            [net.cgrand.enlive-html :as html]
            [clojure.data.json :as json]))

(defn login-to-db []
  (client/post
    "http://test.infringebuffalo.org/db2/login.php"
    {:form-params
      {:username "tms@kitefishlabs.com" :password "freQ432"}}))

(defn login-and-return-cookie []
  (let [resp (login-to-db)]
       (:cookies resp)))

(def bif-cookie (login-and-return-cookie))

(defn remove-newlines [unescaped-body]
  (clojure.string/replace unescaped-body "\n" ""))

; (def content-blacklist-venueslist {"Proposals" "Contact" "sheet" "sign"})

(defn venues-names-and-links [n]
  (let [venues-list-page (html/html-resource
                          (client/get "http://test.infringebuffalo.org/db2/listVenues.php"
                                      {:cookies bif-cookie}))
        escaped-body (remove-newlines (:body (first venues-list-page)))
        venues-list-html (html/html-resource (java.io.StringReader. escaped-body))]
     (html/select venues-list-html [:table :tr :td :a])))


(defn recognize-venue? [row]
  (not (clojure.string/blank? (re-find #"venue.php\?id=[0-9]+" row))))

(defn extract-venue [link]
  (let [venue-detail-page (html/html-resource
                           (client/get (str "http://test.infringebuffalo.org/db2/" link)
                                       {:cookies bif-cookie}))
        escaped-body (remove-newlines (:body (first venue-detail-page)))
        venue-detail-html (html/html-resource (java.io.StringReader. escaped-body))]
    venue-detail-html))


(defn venue-links [limit]
  (map
    #(str (get-in % [:attrs :href]))
    (venues-names-and-links limit)))

(def just-links
  (filter recognize-venue? (venue-links 1000)))

(defn convert-strs-to-ints [istr] (->> istr (re-find #"\d+") Integer.))

(defn just-ids-for-all-venues []
 (map convert-strs-to-ints just-links))



(defn first-four-labels [all-rows]
  (map
   #(-> % first :content)
   (take 4 all-rows)))

(defn first-four-values [all-rows]
  (map
   #(-> % second :content)
   (take 4 all-rows)))




; (def link "venue.php?id=14710")

(defn extract-and-form-venue-hash [link]
  (let
   [linked-venue (extract-venue link)
    all-venue-rows (html/select linked-venue {[:tr :th] [:tr :td]})
    clean-labels
     (flatten
      (map
       first
       (partition 2 (first-four-labels all-venue-rows))))
    clean-name-values
     (flatten
      (map
       #((nth (-> % first first :content) 2) :content)
       (partition 2 (first-four-values all-venue-rows))))
    general-labels
     (map
      #(-> % first :content)
      (drop 4 all-venue-rows))
    clean-general-labels
     (flatten
      (map
       first
       (partition 2 general-labels)))
    general-values
     (map
      #(-> % second :content)
      (drop 4 all-venue-rows))
    clean-general-values
     (flatten
      (map
       #((nth (-> % first first :content) 3) :content)
       (partition 2 general-values)))]

   ; take the 4 lists and merge to form labels-data mapping
   (zipmap
    (concat clean-labels clean-general-labels)
    (concat clean-name-values clean-general-values))))

(def public-keys (set ["Address" "latitude" "longitude" "Website" "Description for web" "Name" "Short name" "FB Page"]))

(defn filter-key [k yesset]
 (contains? yesset k))

(defn public-venue-hash [link]
 (printf "link: %s" link)
 (filter
  #(filter-key (first %) public-keys)
  (extract-and-form-venue-hash link)))

(defn gather-all-venues [ids-list]
 (map
  #(spit
    (str "/Users/kfl/dev/git/bifweb/scraper/venues/" % ".json")
    (json/write (public-venue-hash (str "venue.php?id=" %))))
   ids-list))

(defn recognize-confirmed? [row]
  (clojure.string/blank? (re-find #"zzz" row)))

(defn just-names [ids]
 (let [all-data
               (map
                #(->
                  (slurp
                   (str "/Users/kfl/dev/git/bifweb/scraper/venues/" % ".json"))
                  (json/read-str))
                (vec ids))
       filtered-data
                    (filter #(-> (second %) recognize-confirmed?) (map last all-data))]
  (map second filtered-data)))

(defn gather-venue-info []
 (spit
  "/Users/kfl/dev/git/bifweb/scraper/venue-list.json"
  (json/write-str
   (partition
    3
    (interleave
     (just-ids-for-all-venues)
     (just-names (just-ids-for-all-venues))
     just-links)))))
