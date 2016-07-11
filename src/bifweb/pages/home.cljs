(ns bifweb.pages.home
  (:require [reagent.core :as r]
            [bifweb.util :refer [set-title!]]
            [bifweb.session :as session]
            [bifweb.pages.common :refer [social-links]]))

(defn home-page []
  (fn []
  	(set-title! "HOME")

		[social-links]

 		[:div.row
	
			[:div.left-column.col-md-6
			  [:div.row
	  			{:class "box" :id "featured-left"}
	  	
			  	[:h2 "Thanks for applying"]
				  [:p "Submissions are now closed. This year we had over 350 applicants. Next year's application will be due May 1."]]

				[:div.row
			  	{:class "box" :id "featured-left"}
			  	
			  	[:h2 "Find us on social media!"]
          [:p "Promote your shows. Find things to do during the festival."]
          [social-links]]
	
				[:div.row
					{:class "box"}
          
          [:h2 "Organizers Meetings"]
          [:div.box-text
					  [:ul 
					  	[:li "Tue July 12, 7pm - General Artists' Meeting @ Hallwalls"]
					  	[:li "Wed July 13, 7pm - Press Conference @ Hallwalls"]
					  	[:li "Tue July 19, 7pm - Organizers @ Wondermoth"]
					  	[:li "Wed July 27, 7pm - Organizers @ Wondermoth"]]]]          
				
				[:div.row
					{:class "box"}
          
        	[:h2 "Thing 1c"]
          [:p "is simply dummy text of the printing and typesetting industry. 
					  Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown 
					  printer took a galley of type and scrambled it to make a type specimen book. 
					  It has survived not only five centuries, but also the leap into electronic typesetting, 
					  remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset 
					  sheets containing Lorem Ipsum passages."]]
				[:div.row
					{:class "box"}
          
          [:h2 "Thing 3a"]

				  [:p "is simply dummy text of the printing and typesetting industry. 
					  Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown 
					  printer took a galley of type and scrambled it to make a type specimen book. 
					  It has survived not only five centuries, but also the leap into electronic typesetting, 
					  remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset 
					  sheets containing Lorem Ipsum passages."]]

				[:div.row
					{:class "box"}
          
        	[:h2 "Thing 3b"]
            [:p "is simply dummy text of the printing and typesetting industry. 
					  Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown 
					  printer took a galley of type and scrambled it to make a type specimen book. 
					  It has survived not only five centuries, but also the leap into electronic typesetting, 
					  remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset 
					  sheets containing Lorem Ipsum passages."]]]
			
			[:div.right-column.col-md-6
			
			  [:div.row
			  	{:class "box" :id "featured-right"}
			  	
			  	[:h2 "Infringement Schedule"]
				  [:p "Performers are confirming their shows. The schedule will appear as an insert in the Public on July 26 and on this site."]]
			
				[:div.row
					{:class "box"}
          
          [:h2 "Want to know more?"]

				  [:p "Check out our "
				   [:a {:href "#/faq" :alt "faq"} "FAQ"]
				   ". We try to answer many of your questions there."]]

				[:div.row
					{:class "box"}
          
        	[:h2 "Thing 2b"]
            [:p "is simply dummy text of the printing and typesetting industry. 
					  Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown 
					  printer took a galley of type and scrambled it to make a type specimen book. 
					  It has survived not only five centuries, but also the leap into electronic typesetting, 
					  remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset 
					  sheets containing Lorem Ipsum passages."]]
				[:div.row
					{:class "box"}
          
        	[:h2 "Thing 2c"]
            [:p "is simply dummy text of the printing and typesetting industry. 
					  Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown 
					  printer took a galley of type and scrambled it to make a type specimen book. 
					  It has survived not only five centuries, but also the leap into electronic typesetting, 
					  remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset 
					  sheets containing Lorem Ipsum passages."]]				
				[:div.row
					{:class "box"}
          
        	[:h2 "Thing 3c"]
            [:p "is simply dummy text of the printing and typesetting industry. 
					  Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown 
					  printer took a galley of type and scrambled it to make a type specimen book. 
					  It has survived not only five centuries, but also the leap into electronic typesetting, 
					  remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset 
					  sheets containing Lorem Ipsum passages."]]]]))
