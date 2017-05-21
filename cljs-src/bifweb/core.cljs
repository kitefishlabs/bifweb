(ns bifweb.core
  (:require
            [cljsjs.material-ui]
            [cljs-react-material-ui.core :refer [get-mui-theme color]]
            [cljs-react-material-ui.reagent :as ui]
            [cljs-react-material-ui.icons :as ic]

            [reagent.core :as reagent :refer [atom]]
            [secretary.core :as secretary :refer-macros [defroute]]
            [bifweb.session :as session]
            [bifweb.pages.common :refer [header-jumbotron footer navbar]]
            [bifweb.pages.schedule :refer [schedule-page]]
            [bifweb.pages.venues :refer [venues-page]]
            [bifweb.pages.artists :refer [artists-page]]
            [bifweb.pages.home :refer [home-page]]
            [bifweb.pages.faq :refer [faq-page]]
            [bifweb.pages.about :refer [about-page]]
            [bifweb.pages.contact :refer [contact-page]]
            [bifweb.util :refer [on-load]]

            ; [bifweb.pages.schedule :refer [schedule-page]]
            ; [bifweb.pages.allshows :refer [allshows-page]]

            [bifweb.util :refer [hook-browser-navigation!]])

  (:import goog.History))

(enable-console-print!)


;; define your app data so that it doesn't get over-written on reload
(defonce app-state (atom {:drawer-open? false}))


(defn navigate-to-page [page-key page-name]
  [ui/menu-item
    {:on-touch-tap #(do
                      (session/put! :page page-key)
                      (swap! app-state assoc-in [:drawer-open?] false))} page-name])


(def pages
  {:home #'home-page
   :schedule #'schedule-page
   :venues #'venues-page
   :artists #'artists-page
   :faq #'faq-page
   :about #'about-page
   :contact #'contact-page
   :default #'home-page})


(defn page []
  (fn []
    (let [drawer-open? false]
      [ui/mui-theme-provider
        {:mui-theme (get-mui-theme
                      {:palette
                        {
                          :primary1-color       (color :light-blue-500)
                          :dark-primary-color   (color :light-blue-700)
                          :light-primary-color  (color :light-blue-200)
                          :text-primary-color   (color :grey-50)
                          :accent-color         (color :yellow-500)
                          :primary-text-color   (color :grey-900)
                          :secondary-text-color (color :grey-600)
                          :divider-color        (color :grey-400)}})}

        [:div

          [ui/app-bar
            {:title "Buffalo Infringement Festival"
            ;  :icon-element-right
            ;             (reagent/as-element
            ;               [ui/raised-button
            ;                 {:label "Submit a proposal"
            ;                  :href  "/db2/Infringement_Proposal.php"
            ;                 ;  :secondary true
            ;                  :target :_blank}])
            
             :on-left-icon-button-touch-tap #(swap! app-state assoc-in [:drawer-open?] true)}]

          [ui/drawer
            {:docked      false
             :open        (:drawer-open? @app-state)
             :on-request-change #(swap! app-state assoc-in [:drawer-open?] false)}
            ;  :onNavClose (fn [] (js/console.log "onNavClose "))}

            [navigate-to-page :home "Home"]
            [ui/menu-item {:href "db2/index.php" :target "_blank"} "Submit a Proposal"]
            ; [navigate-to-page :proposal-db "Proposals DB"]
            [navigate-to-page :schedule "Schedule"]
            ; [navigate-to-page :calendar "Calendar"]
            [navigate-to-page :venues "Venues"]
            [navigate-to-page :artists "Artists"]
            [navigate-to-page :faq "F.A.Q."]
            [navigate-to-page :about "About"]
            [navigate-to-page :contact "Contact"]]

          [(pages (session/get :page))]

          [:footer
            [:div.col-xs-12
              [:p "© 2017 by the authors."]]]]])))


;; -------------------------
;; Routes

(secretary/set-config! :prefix "#")

(defroute "/" []
          (session/put! :page :home))
(defroute "/faq" []
          (session/put! :page :faq))
(defroute "/about" []
          (session/put! :page :about))
(defroute "/contact" []
          (session/put! :page :contact))


;; Initialize app
(on-load)

(defn mount-components []
  ; (reagent/render [#'navbar] (.getElementById js/document "navbar"))
  (reagent/render [#'page] (.getElementById js/document "app")))
  ; (reagent/render [#'footer] (.getElementById js/document "footer")))

; (defn init! []
  ;; optionally touch your app-state to force rerendering depending on
  ;; your application
(hook-browser-navigation!)
  ; additional GETs
  ; yuggoth fetches here based on the URL
  ;(fetch-venue ID set=venue-and-home-page!)
; (session/reset! {:page :home})
(mount-components)

(defn fig-reload []
  (swap! app-state update-in [:__figwheel_counter] inc))
