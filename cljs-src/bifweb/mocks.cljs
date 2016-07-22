(ns bifweb.mocks
	(:require [reagent.core :as r]
            [bifweb.util :refer [set-title!]]
            [bifweb.session :as session]))

(def groupshow 
	{
		:category "Street/Outdoor Group Shows"
		:description "DESCRIBE"
		:photo-url "" ;;;
	
		;; :schedule
		:performers
			[{
				:time "4p"
				:name "MC Vendetta"
				:note "" ;;;
			 }
		 	{
		 		:time "4p"
				:name "Radical Roots"
				:note "" ;;;
			 }
			 {
		 		:time "4p"
				:name "Buffalo Yarn Brigade: Pull the yarn over the trees - not your eyes"
				:note "" ;;;
			 }
		 ;...
		 	]})

(def artist
	{
		:name "The Study of Vodka in French"
		:description "..."
		:website "https://www.facebook.com/dominique.v.woods"
		:photo-url ""
		:category "Literary"

		:schedule 
			{
				:day1 {
					:time "3-3:30p"
					:venue "Burning Books"
					:note "" ;;;
				}
				:day7 {
					:time "4-9p"
					:venue "WestSide Herbs and Alliums"
					:groupshow "Weeding Through Differences"
					:note "" ;;;
				}
				:day9 {
					:time "5-7p"
					:venue "Burning Books"
					:groupshow "What the Friday?!?"
					:note "" ;;;
				}
				:day11 {
					:time "5:30-6p" 
					:venue "Antique Man"
					:note "" ;;;
				}

				;;;
				;:day3 {
				; 	:time "install"
				; 	:venue "College St Gallery"
				;   :note "not really :("
				
				}})



(def venue
	{	:name "Antique Man"
		:latitude ""
		:longitude ""
		:website "http://www.facebook.com/pages/antique-man/134050123314112"
		;; :schedule
	})

