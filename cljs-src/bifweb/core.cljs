(ns bifweb.core
  (:require [reagent.core :as reagent :refer [atom]]
            [secretary.core :as secretary :refer-macros [defroute]]
            [bifweb.session :as session]
            [bifweb.pages.common :refer [header-jumbotron footer navbar]]
            [bifweb.pages.home :refer [home-page]]
            [bifweb.pages.faq :refer [faq-page]]
            [bifweb.pages.about :refer [about-page]]
            [bifweb.pages.contact :refer [contact-page]]
            [bifweb.util :refer [on-load]]

            [bifweb.pages.schedule :refer [schedule-page]]
            [bifweb.pages.allshows :refer [allshows-page]]

            [bifweb.util :refer [hook-browser-navigation!]])
  (:import goog.History))

(enable-console-print!)


;; define your app data so that it doesn't get over-written on reload
(defonce app-state (atom {:text "TEXT"}))


(def pages
  {:home #'home-page
   :schedule #'schedule-page
   :faq #'faq-page
   :about #'about-page
   :contact #'contact-page
   :allshows #'allshows-page
   :default #'home-page})

(defn page []
  [:div.container
   [header-jumbotron]
   [(pages (session/get :page))]])

;; -------------------------
;; Routes

; (secretary/set-config! :prefix "#")

(defroute "/" []
          (session/put! :page :home))
(defroute "/schedule" []
          (session/put! :page :schedule))
(defroute "/faq" []
          (session/put! :page :faq))
(defroute "/about" []
          (session/put! :page :about))
(defroute "/contact" []
          (session/put! :page :contact))

(defroute "/allshows" []
          (session/put! :page :allshows))
;(defroute "/venue/:id" {:as params}
;          (session/put! :page :venue))


;; Initialize app
(on-load)

(defn mount-components []
  (reagent/render [#'navbar] (.getElementById js/document "navbar"))
  (reagent/render [#'page] (.getElementById js/document "app"))
  (reagent/render [#'footer] (.getElementById js/document "footer")))

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
