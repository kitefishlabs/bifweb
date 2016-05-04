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
				  [:div.col-md-4 
				  	{:class "featured" :id "featured-left"}
				  	[:h2 "Thanks for applying"]
					  [:p "Submissions are now closed."]]
					[:div.col-md-4.featured
				  	{:class "featured" :id "featured-center"}
				  	[:h2 "Test block 2"]
					  [:p "Submissions are now closed."]]
					[:div.col-md-4.featured
				  	{:class "featured" :id "featured-right"}
				  	[:h2 "Test block 3"]
					  [:p "But we are working on scheduling."]]]
				  
				]]))
