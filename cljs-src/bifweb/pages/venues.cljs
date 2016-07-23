(ns bifweb.pages.venues
  (:require [reagent.core :as r]
            [bifweb.util :refer [set-title!]]
            [bifweb.session :as session]
            [bifweb.mocks :as mock]))

(defn venues-page []
  (let [all-events (:schedule mock/artist)]
   [:h2 (:name mock/venue)]
   [:div.col-md-12
     [:div.row
       [:div.col-md-3
         [:h4 "venue"]
         [:p ""]]
       [:div.col-md-4
         [:h4 "perf dates"]]
       [:div.col-md-4
         [:h4 "install dates"]]]]))
