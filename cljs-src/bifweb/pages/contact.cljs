(ns bifweb.pages.contact
  (:require [reagent.core :as r]
            [bifweb.util :refer [set-title!]]
            [bifweb.session :as session]))

(defn contact-page []
  (fn []
    (set-title! "Buffalo Infringement Festival - Home")[:h1 "Contact Us"]
    [:div.col-md-12
      [:div.row
        [:h2 "General Contacts?"]
        [:p "The following email addresses are the general contact points for the festival:"]
        [:div {:class "who"}
         [:ul
          [:li {:class "who" } [:a {:href "mailto:info@infringebuffalo.org?Subject=Infringement%202016"} "info@infringebuffalo.org - An organizer will respond."]]
          [:li {:class "who" } [:a {:href "mailto:pr@infringebuffalo.org?Subject=Infringement%202016"} "pr@infringebuffalo.org - Send us PR materials."]]]]]

      [:div.row
        [:h2 "Who is Infringement?"]
        [:p "These are your first points of contact if you are a performer, volunteer, or venue owner. This year's organizers include..."
          [:div {:class "who"}
           [:ul
            [:li {:class "who" } [:a {:href "mailto:dga8787@aol.com?Subject=Infringement%202016"} "David Adamczyk - Music & Street Performance Czar"]]
            [:li {:class "who" } [:a {:href "mailto:deathranch@roadrunner.com?Subject=Infringement%202016"} "Marty Boratin - Music Czar"]]
            [:li {:class "who" } [:a {:href "mailto:visualinfringement@live.com?Subject=Infringement%202016"} "Amy Duengfelder & Cat Mcarthy - Visual Art Czars"]]
            [:li {:class "who" } [:a {:href "mailto:danceundertheradar@Gmail.com?Subject=Infringement%202016"} "Leslie Fineberg - Dance Czar"]]
            [:li {:class "who" } [:a {:href "mailto:pr@infringement.org?Subject=Infringement%202016"} "Heather Gring - Meeting chair, PR, Theater Contact*"]]
            [:li {:class "who" } [:a {:href "mailto:undividedwholness@gmail.com?Subject=Infringement%202016"} "George Hampton - Housing"]]
            [:li {:class "who" } [:a {:href "mailto:jessicaknoerl@gmail.com?Subject=Infringement%202016"} "Jessica Knoerl - Theater Czar*"]]
            [:li {:class "who" } [:a {:href "https://www.facebook.com/james.moffitt.73?fref=ts"} "James Moffit - Graphic Design, Posters, Art"]]
            [:li {:class "who" } [:a {:href "mailto:depape@buffalo.edu?Subject=Infringement%202016"} "Dave Pape - Treasurer / Web Design"]]
            [:li {:class "who" } [:a {:href "mailto:b00bflo@gmail.com?Subject=Infringement%202016"} "Marek Parker - Poetry & Literature Czar"]]
            [:li {:class "who" } [:a {:href "mailto:merlinsbooking@Gmail.com?Subject=Infringement%202016"} "Curt Rodderdam - Music Czar"]]
            [:li {:class "who" } [:a {:href "mailto:whsmythe@gmail.com?Subject=Infringement%202016"} "Bill Smythe - Venue Czar"]]
            [:li {:class "who" } [:a {:href "mailto:buffaloinfringementfilms@gmail.com?Subject=Infringement%202016"} "Tom Stoll - Film Czar, Fundraising & Web"]]]]
         [:p "* Heather is the emergency/last minute contact for theater performers until Aug. 2, 2016."]
         [:p "Plus, of course, the hundreds of performers, and thousands of audience, family, and community that support the arts in Buffalo!"]]]]))
