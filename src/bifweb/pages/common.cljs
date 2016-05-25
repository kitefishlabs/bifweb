(ns bifweb.common
  (:require [reagent.core :as reagent :refer [atom]]
            [secretary.core :as secretary :refer-macros [defroute]]
            [bifweb.session :as session])
  (:import goog.History))


(defn footer []
  [:div.footer
   [:p (str "Copyright © " (.getFullYear (js/Date.)))

    " - Powered by: " [:a {:href "http://github.com/kitefishlabs"}
                       " Kitefish Labs"]]])

(defn social-links []
  [:div
   {:class "quick-links"}
   [:div
    {:class "social-links-bar"}
    [:a {:href "http://www.facebook.com/InfringeEveryDay"}
     [:img
      {	:src "/img/Facebook.gif",
       :width "32px",
       :class "social-circle"
       :alt "fb" }]]
    [:a {:href "http://www.facebook.com/InfringeEveryDay"}
     [:img
      {	:src "/img/Twitter.gif"
       :width "32px"
       :class "social-circle"
       :alt "tw" }]]
    [:a {:href "http://www.facebook.com/InfringeEveryDay"}
     [:img
      {	:src "/img/Soundcloud.png"
       :width "32px"
       :class "social-circle"
       :alt "sc" }]]]])

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
          [nav-link "#/faq" "FAQ" :faq collapsed?]
          [nav-link "#/history" "History" :history collapsed?]
          [nav-link "#/contact" "Contact" :contact collapsed?]
          [nav-link "#/forum" "Forum" :forum collapsed?]
          [nav-link "#/scheduler" "Scheduler Login" :scheduler collapsed?]
          [social-links]]]]])))


(defn header-page-header []
  [:div.page-header
   [:img ]
   [:h1 "Buffalo Infringement"]
   [:p "11 days of art under the radar"]])

(defn header-jumbotron []
  [:div.header
   [:div.jumbotron
    [:img
     { :class "banner"
      :src "/img/bif_2016_header_left.png"
      :width "160px" }]
    [:img
     { :class "banner"
      :src "/img/bif_2016_header_center.png"
      :width "600px" }]]])