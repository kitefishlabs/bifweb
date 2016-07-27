(ns bifweb.pages.schedule
  (:require [reagent.core :as r]
            [bifweb.util :refer [set-title!]]
            [bifweb.session :as session]))

(defn datebox-day [daynum date]
 (fn []
   [:div.datebox
    [:a {:href (str daynum)} date]]))

(defn schedule-page []
  (fn []
   [:div.col-md-12
    [:div.row
      [:h2 "2016 Festival Schedule"]
      [:p "The 2016 Buffalo Infringement Festival runs from Thursday, July 28,
           through Sunday, August 7."]]
    ; [:div.row
      ; [:h3 "Search"]
      ; [:p "..."]]
    [:div.row
      [:h3 "Calendar"]
      [:div.daterow
        [:div.emptybox]
        [:div.emptybox]
        [:div.emptybox]
        [:div.emptybox]
        [datebox-day 1 28]
        [datebox-day 2 29]
        [datebox-day 3 30]]

      [:div.daterow
        [datebox-day 4 31]
        [datebox-day 5 1]
        [datebox-day 6 2]
        [datebox-day 8 3]
        [datebox-day 9 4]
        [datebox-day 10 5]
        [datebox-day 11 6]]

     [:div.]]
    [:div.row
      [:p [:a {:href "#/allshows"} "All Shows"]]
      [:p [:a {:href "allcategories.php"} "Categories of Shows"]]
      [:p [:a {:href "allvenues.php"} "All Venues"]]]
    [:div.row
      [:p "EMBEDDED MAP [coming soon]"]]]))
