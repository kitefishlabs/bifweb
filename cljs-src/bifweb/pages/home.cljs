  (ns bifweb.pages.home
   (:require [reagent.core :as r]
             [bifweb.util :refer [set-title!]]
             [bifweb.session :as session]
             [bifweb.pages.common :refer [social-links]]))

(defonce day 86400000)

(defonce start-time (js/Date. 2016 6 28 20 0 0))

;(defonce timer (r/atom (js/Date.)))
(defn calc-days-til [datenow]
  (->>
    (->
      (-
        (.getTime start-time)
        (.getTime datenow))
      (/ day)
      (str))
    (take 8)))

(def days-til-bif-timer (r/atom (calc-days-til (js/Date.))))

(defonce time-updater (js/setInterval
                       #(reset! days-til-bif-timer (calc-days-til (js/Date.))) 5000))


(defn clock []
  (fn []
    (let [time-str @days-til-bif-timer]
        [:span time-str])))

(defn home-page []
  (fn []
    (set-title! "HOME")

    [social-links]

    [:div.rowr

     [:div.left-column.col-md-6

       [:div.row
         {:class "box featured-1"}

         [:h2 "Find us on social media!"]
         [:p "Promote your shows. Find things to do during the festival. Make new friends."]
         [social-links]]

       [:div.row
         {:class "box featured-2"}

         [:h2 "Infringement Draws Near!"]
         [:p
           "Just "
           [clock]
           " days until Opening Ceremonies."]]

       [:div.row
         {:class "box"}

         [:h2 "Organizers Meetings"]
         [:div.box-text
           [:ul
             [:li "Tue July 26, 7pm - Organizers @ Wondermoth"]
             [:li "Thu July 28, 8pm - Opening Ceremonies, 8pm @ Nietzsche's"]]]]

        ;[:div.row
        ;	{:class "box"}
        ;
        ; [:h2 ""]
        ;	[:p ""]]

       [:div.row
         {:class "box"}

         [:h2 "Venues"]
         [:p "In 2016, we have close to 100 venues. New venues this year include Amity Club, Merriweather Library, Cafeology, Daily Planet "]]

       [:div.row
         {:class "box"}

         [:h2 "Thanks for applying"]
         [:p "Submissions are now closed. This year we had over 350 applicants. Next year's application will be due May 1."]]]

     [:div.right-column.col-md-6

       [:div.row
         {:class "box featured-2"}

         [:h2 "Infringement Schedule"]
         [:p [:a {:href "schedule.php"} "The schedule is now live."] " The schedule will appear as an insert in the Public on July 26."]]

       [:div.row
         {:class "box"}

         [:h2 "Want to know more?"]

         [:p "Check out our "
          [:a {:href "#/faq" :alt "faq"} "FAQ"]
          ". We try to answer many of your questions there."]]

       [:div.row
         {:class "box"}

         [:h2 "Volunteer"]
         [:p "Email us at "
           [:a {:href "mailto:info@infringebuffalo.org?Subject=Volunteer%20at%20BIF%202016"} "info@infringebuffalo.org"]
           ". We need people to help run shows, to help us publicize the festival, hang posters, and other tasks."]]

       [:div.row
         {:class "box"}

         [:h2 "About Infringement"]
         [:p
           "The 2016 Festival is the 13th running of a festival that has its roots in Montreal, QC and beyond. "
           [:a {:href "#/about"} "Read more"]
           " about the history, funders, and founding documents of the Buffalo Infringement Festival."]]]]))
