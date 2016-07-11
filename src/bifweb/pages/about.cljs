(ns bifweb.pages.about
  (:require [reagent.core :as reagent :refer [atom]]
            [bifweb.pages.common :refer [social-links]]))

(defn about-page []
  (fn []
    [:div.col-sm-12
     [:div.row
      [:h2 "What is Infringement?"]
      [:p "The buffalo “infringement” festival is a non-profit-driven, non-hierarchical grassroots endeavor bringing
         together a broad range of eclectic, independent, experimental, and controversial art of all forms. Visual,
         performing, musical, and media arts are all welcome here. Taking place in multiple venues in and around Buffalo’s
         Allentown District, the festival is an annual eleven-day event running from the last weekend of July through the
         first weekend of August. See the Infringement Festival International's mandate and our 2006 Mission Statement to
         learn more."]]
     [:div.row
      [:h2 "Who is Infringement?"]
      [:p "This year's organizers include..."
       [:ul {:class "who"}
        [:li {:class "who lt" } [:a {:href "mailto:dga8787@aol.com?Subject=Infringement%20Help"} "David Adamczyk - Music & Street Performances"]]
        [:li {:class "who rt" } [:a {:href "mailto:deathranch@roadrunner.com?Subject=Infringement%20Help"} "Marty Boratin - Music"]]
        [:li {:class "who lt" } [:a {:href "mailto:visualinfringement@live.com?Subject=Infringement%20Help"} "Amy Duengfelder & Cat Mcarthy - Visual Art"]]
        [:li {:class "who rt" } [:a {:href "mailto:danceundertheradar@Gmail.com?Subject=Infringement%20Help"} "Leslie Fineberg - Dance"]]
        [:li {:class "who lt" } [:a {:href "mailto:pr@infringement.org?Subject=Infringement%20Help"} "Heather Gring - PR, etc."]]
        [:li {:class "who rt" } [:a {:href "mailto:undividedwholness@gmail.com?Subject=Infringement%20Help"} "George Hampton - Housing"]]
        [:li {:class "who lt" } [:a {:href "#"} "James Moffit - Graphic Design, Posters, Art"]]
        [:li {:class "who rt" } [:a {:href "mailto:depape@buffalo.edu?Subject=Infringement%20Help"} "Dave Pape - Treasurer / Web Design"]]
        [:li {:class "who lt" } [:a {:href "mailto:b00bflo@gmail.com?Subject=Infringement%20Help"} "Marek Parker - Poetry & Literature"]]
        [:li {:class "who rt" } [:a {:href "mailto:merlinsbooking@Gmail.com?Subject=Infringement%20Help"} "Curt Rodderdam - Music & Fundrasing"]]
        [:li {:class "who lt" } [:a {:href "#"} "Bill Smythe - Venue Coordinator"]]
        [:li {:class "who rt" } [:a {:href "mailto:buffaloinfringementfilms@gmail.com?Subject=Infringement%20Help"} "Tom Stoll - Volunteers, Fundraising & Web"]]]]
      ;[:p "Plus, of course, the hundreds of performers, and thousands of audience, family, and community that support the arts in Buffalo!"]
      ]
     [:div.row
      [:h2 "Sponsors"]
      [:p "Allentown Music"]]
     [:div.row
      [:h2 "Direct Monetary Donations"]
      [:p "This festival is run completely on unicorn wishes and happy sunshine rays! Just kidding! There are real
         dollars that have to go into this grassroots festival for things like equipment, technicians, and most importaintly the printed
         schedule."]
      [:p "Here is a (partial) list of our Indie GoGo donors who helped make Infringement possible in 2015:\n\nravi padmanabha, Lisa M Cruz,
         David Rivers, isaiah37@gmail.com, Jonathan M Filbert, Kerry Rubinstein, Roger Paolini, Vanessa R Oswald, Wit Wichaidit, Lynette Seliger,
         Christina E Rausa, michael fanelli, Shea Akers, John R Hastings, Deborah Obarka, michele costa, Andrew Delmonte, mary c uebbing,
         Jenece C Gerber, Robin G Jansma, Dennis J Reed Jr, Janna Willoughby-Lohr, Jennifer Whitmore, curt rotterdam, James A. marzo, Laura Lonski,
         Richard R. Haynes, Dave Pape"]]
     [:div.row
      [:h2 "Infringement Mandate"]
      [:p "Coming soon."]]
     [:div.row
      [:h2 "Press and Promotion"]
      [:p "We are active on multiple social media outlets..."]
      [social-links]]]))