(ns bifweb.core
  (:require [reagent.core :as reagent :refer [atom]]
  					[secretary.core :as secretary :refer-macros [defroute]]
  					[bifweb.session :as session]
  					[bifweb.pages.home :refer [home-page]]
        	  [bifweb.pages.about :refer [about-page]]
          	[bifweb.util :refer [hook-browser-navigation!]])
  (:import goog.History))

(enable-console-print!)


;; define your app data so that it doesn't get over-written on reload
(defonce app-state (atom {:text "TEXT"}))


(defn header-page-header []
  [:div.page-header
   [:h1 "Buffalo Infringement"]
   [:p "11 days of art under the radar"]])

(defn header-jumbotron []
  [:div.header
   [:div.jumbotron
    [:h1 "Buffalo Infringement"]
    [:p "11 days of art under the radar"]]])


(defn footer []
  [:div.footer
   [:p (str "Copyright © 2016.  ") ;(.getFullYear (js/Date.)) " ")
    " - Powered by: " [:a {:href "http://github.com/kitefishlabs"} " Kitefish Labs"]]])

(defn nav-link [uri title page collapsed?]
  [:li {:class (when (= page (session/get :page)) "active")}
   [:a {:href uri
        :on-click #(reset! collapsed? true)}
    title]])

(defn navbar []
  (let [collapsed? (atom true)]
    (fn []
      [:nav.navbar.navbar-inverse.navbar-fixed-top
       [:div.container
        [:div.navbar-header
         [:button.navbar-toggle
          {:class         (when-not @collapsed? "collapsed")
           :data-toggle   "collapse"
           :aria-expanded @collapsed?
           :aria-controls "navbar"
           :on-click      #(swap! collapsed? not)}
          [:span.sr-only "Toggle Navigation"]
          [:span.icon-bar]
          [:span.icon-bar]
          [:span.icon-bar]]
         [:a.navbar-brand {:href "#/"} "bifweb"]]
        [:div.navbar-collapse.collapse
         (when-not @collapsed? {:class "in"})
         [:ul.nav.navbar-nav
          [nav-link "#/" "Home" :home collapsed?]
          [nav-link "#/about" "About" :about collapsed?]
          ; [nav-link "#/login" "Login" :login collapsed?]
          ; [nav-link "#/register" "Register" :register collapsed?]
          ; [nav-link "#/forum" "Forum" :forum collapsed?]
          ]]]])))




(def pages
  {:home #'home-page
   ; :login #'login-page
   ; :register #'register-page
   ; :forum #'forum-page
   :about #'about-page
   :default #'home-page})

(defn page []
  [:div.container
   [header-page-header]
   [(pages (session/get :page))]
   [footer]])

;; -------------------------
;; Routes
;(secretary/set-config! :prefix "#")

(secretary/defroute "/" []
                    (.log js/console "base route")
                    (session/put! :page :home))

(secretary/defroute "/about" []
                    (.log js/console "about route")
                    (session/put! :page :about))


; (defn main-page []
;   [:div
;   	[:h1 (:title @app-state)]
;   	[:p "test"]])


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

  (defn fig-reload []
  	(swap! app-state update-in [:__figwheel_counter] inc))
