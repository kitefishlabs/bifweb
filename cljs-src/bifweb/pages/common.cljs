(ns bifweb.pages.common
  (:require [reagent.core :as reagent :refer [atom]]
            [secretary.core :as secretary :refer-macros [defroute]]
            [bifweb.session :as session])
  (:import goog.History))

(defn social-link [url icn]
  (fn []
    [:a {:href url :class "social-link"}
      [:i {:class (str "fa " icn " fa-2x fa-fw")}]]))


(defn social-links []
  (fn []
    [:div
     {:class "social-links-bar"}
     [social-link "http://www.facebook.com/InfringeEveryDay" "fa-facebook"]
     [social-link "http://www.twitter.com/infringebuffalo" "fa-twitter"]
     [social-link "https://www.flickr.com/groups/infringebuffalo/" "fa-flickr"]
     [social-link "https://soundcloud.com/buffalo-infringement" "fa-soundcloud"]
     [social-link "https://www.youtube.com/channel/UCS1cbOLCnemeraCwCSmW4kQ" "fa-youtube"]
     [social-link "https://www.instagram.com/explore/tags/infringeeveryday/?hl=en" "fa-instagram"]
     [social-link "https://vimeo.com/search?q=%23infringeeveryday" "fa-vimeo"]
     [social-link "https://www.pinterest.com/search/?q=buffalo%20infringement" "fa-pinterest"]]))


(defn footer []
  [:div.footer
   [social-links]
   [:p (str "Copyright © " (.getFullYear (js/Date.)))

    " - Powered by: " [:a {:href "http://github.com/kitefishlabs"}
                       "Kitefish Labs"]]])

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
         [:a.navbar-brand {:href "#/"}
          [:img
            { :id "sitelogo"
              :src "/img/bif_2016_header_center.png"
              :alt "bif-icon"}]]]
        [:div.navbar-collapse.collapse
         (when-not @collapsed? {:class "in"})
         [:ul.nav.navbar-nav
          [nav-link "#/" "Home" :home collapsed?]
          [nav-link "schedule.php" "Schedule" :schedulephp collapsed?]
          ;[nav-link "#/schedule" "Experimental" :schedule collapsed?]
          [nav-link "#/faq" "FAQ" :faq collapsed?]
          [nav-link "#/about" "About" :about collapsed?]
          [nav-link "#/contact" "Contact" :contact collapsed?]
          ;[nav-link "#/forum" "Forum" :forum collapsed?]
          [nav-link "db2/" "Database" :database collapsed?]]]]])))

(defn header-jumbotron []
  (fn []
    ;(let [w (if (> (.innerWidth js/window) 0) (.innerWidth js/window) (.width js/screen))]
    [:div.header
        [:div.jumbotron
           [:img
            {:class "banner"
             :id "banner-left"
             :src "/img/bif_2016_header_left.png"}]
           [:img
            {:class "banner"
             :id "banner-right"
             :src "/img/bif_2016_header_center.png"}]]]))
