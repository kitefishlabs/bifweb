(ns bifweb.pages.schedule
  (:require [reagent.core :as r]
            [bifweb.util :refer [set-title!]]
            [bifweb.session :as session]))

(defn schedule-page []
  (fn [] [:div.col-md-12]
    [:div.row
      [:h2 "2016 Festival Schedule"]
      [:p "..."]]
    [:div.row
      [:h3 "Search"]
      [:p "..."]]
    [:div.row
      [:h3 "Calendar"]
      [:div.daterow
        [:div.datebox.empty]
        [:div.datebox.empty]
        [:div.datebox.empty]
        [:div.datebox
         [:a {:href "#/day/1"} "28"]]
        [:div.datebox
         [:a {:href "#/day/2"} "29"]]
        [:div.datebox
         [:a {:href "#/day/3"} "30"]]
        [:div.datebox
         [:a {:href "#/day/4"} "31"]]]

      [:div.daterow
        [:div.datebox
          [:a {:href "#/day/5"} "1"]]
        [:div.datebox
         [:a {:href "#/day/6"} "2"]]
        [:div.datebox
          [:a {:href "#/day/7"} "3"]]
        [:div.datebox
          [:a {:href "#/day/8"} "4"]]
        [:div.datebox
          [:a {:href "#/day/9"} "5"]]
        [:div.datebox
          [:a {:href "#/day/10"} "6"]]
        [:div.datebox
          [:a {:href "#/day/11"} "7"]]]]
    [:div.row
      [:p [:a {:href "#/shows/all"} "All"]]
      [:p [:a {:href "#/genres/all"} "Categories"]]
      [:p [:a {:href "#/venues"} "Venues"]]]
    [:div.row
      [:p "EMBEDDED MAP"]]))
