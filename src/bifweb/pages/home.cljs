(ns bifweb.pages.home
  (:require [reagent.core :as r]
            [bifweb.util :refer [set-title!]]
            [bifweb.session :as session]))

(defn home-page []
  (fn []
    (set-title! "HOME")
    [:div.row
    	[:div.col-md-12
				[:div.row
				  [:h2 "HOME"]
				  [:p "Where the Buffalo roam."]]]]))
