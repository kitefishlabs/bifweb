(ns bifweb.core
  (:require [reagent.core :as reagent :refer [atom]]
  					[secretary.core :as secretary :refer-macros [defroute]]
  					[bifweb.session :as session]
						[bifweb.common :refer [header-jumbotron footer navbar]]
  					[bifweb.pages.home :refer [home-page]]
        	  [bifweb.pages.faq :refer [faq-page]]
						[bifweb.pages.history :refer [history-page]]
						[bifweb.pages.contact :refer [contact-page]]
						[bifweb.util :refer [hook-browser-navigation!]])
  (:import goog.History))

(enable-console-print!)


;; define your app data so that it doesn't get over-written on reload
(defonce app-state (atom {:text "TEXT"}))


(def pages
  {:home #'home-page
	 :faq #'faq-page
   :history #'history-page
	 :contact #'contact-page
   :default #'home-page})

(defn page []
  [:div.container
   [header-jumbotron]
   [(pages (session/get :page))]
   [footer]])

;; -------------------------
;; Routes
;(secretary/set-config! :prefix "#")

(defroute "/" []
					(session/put! :page :home))
(defroute "/faq" []
					(session/put! :page :faq))
(defroute "/history" []
					(session/put! :page :history))
(defroute "/about" []
					(session/put! :page :about))
(defroute "/contact" []
					(session/put! :page :contact))


;; Initialize app

(defn mount-components []
	(reagent/render [#'navbar] (.getElementById js/document "navbar"))
	(reagent/render [#'page] (.getElementById js/document "app")))

; (defn init! []
  ;; optionally touch your app-state to force rerendering depending on
  ;; your application
  (hook-browser-navigation!)
  ; additional GETs
  ; yuggoth fetches here based on the URL
  ;(fetch-venue ID set=venue-and-home-page!)
  (session/reset! {:page :home})
  (mount-components)

  ;(defn fig-reload []
  ;	(swap! app-state update-in [:__figwheel_counter] inc))
