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
            {:class "box" :id "featured-left"}
				  	[:h2 "Thanks for applying"]
					  [:p "Submissions are now closed."]]
					[:div.col-md-4
            {:class "box" :id "featured-center"}
				  	[:h2 "Test block 2"]
					  [:p "Submissions are now closed."]]
					[:div.col-md-4
            {:class "box end-box" :id "featured-right"}
				  	[:h2 "Test block 3"]
					  [:p "But we are working on scheduling."]]]
				[:div.row
				  [:div.col-md-4
				  	{:class "box"}
            [:h2 "Thing 1"]
					  [:p "is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum."]]
					[:div.col-md-4
				  	{:class "box"}
            [:h2 "Thing 2"]
					  [:p "is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages."]]
					[:div.col-md-4
				  	{:class "box end-box"}
            [:h2 "Thing the 3rd"]
					  [:p "is simply dummy text of the printing and typesetting industry. It has survived not only five centuries. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum."]]]]]))
