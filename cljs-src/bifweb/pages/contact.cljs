(ns bifweb.pages.contact
  (:require [cljsjs.material-ui]
            [cljs-react-material-ui.core :refer [get-mui-theme color]]
            [cljs-react-material-ui.reagent :as ui]
            [cljs-react-material-ui.icons :as ic]
            [reagent.core :as r]
            [bifweb.util :refer [set-title! standard-col-class]]
            [bifweb.session :as session]
            [bifweb.pages.common :refer [social-links]]))

(defn contact-page []
  (fn []
    (set-title! "Contacts - Buffalo Infringement Festival")
    [:div
      [ui/paper
        standard-col-class
        [:div.row
          [:h2 "General Contacts"]
          [:p "The following email addresses are the general contact points for the festival:"]
           [:ul
            [:li ; .who
             [:a {:href "mailto:info@infringebuffalo.org?Subject=Infringement%202016"} "info@infringebuffalo.org - An organizer will respond."]]
            [:li ; .who
             [:a {:href "mailto:pr@infringebuffalo.org?Subject=Infringement%202016"} "pr@infringebuffalo.org - Send us PR materials."]]]]

        [:div.row
          [:h2 "Organizer Roles and Contact Info"]
          [:p "These are your first points of contact if you are a performer, volunteer, or venue owner. This year's organizers include..."]
          [:ul
            [:li [:a {:href "mailto:dga8787@aol.com?Subject=Infringement%202016"} "David Adamczyk - Street Performance"]]
            [:li [:a {:href "mailto:visualinfringement@live.com?Subject=Infringement%202016"} "Amy Duengfelder & Cat McCarthy - Visual Art"]]
            [:li [:a {:href "mailto:danceundertheradar@Gmail.com?Subject=Infringement%202016"} "Leslie Fineberg - Dance"]]
            [:li [:a {:href "mailto:pr@infringement.org?Subject=Infringement%202016"} "Heather Gring - Outreach"]]
            [:li [:a {:href "mailto:jessicaknoerl@gmail.com?Subject=Infringement%202016"} "Jessica Knoerl - Theater"]]
            [:li [:a {:href "mailto:depape@buffalo.edu?Subject=Infringement%202016"} "Dave Pape - Treasurer/Database"]]
            [:li [:a {:href "mailto:b00bflo@gmail.com?Subject=Infringement%202016"} "Marek Parker - Poetry & Literature"]]
            [:li [:a {:href "mailto:merlinsbooking@Gmail.com?Subject=Infringement%202016"} "Curt Rodderdam - Music"]]
            [:li [:a {:href "mailto:whsmythe@gmail.com?Subject=Infringement%202016"} "Bill Smythe - Venues"]]
            [:li [:a {:href "mailto:buffaloinfringementfilms@gmail.com?Subject=Infringement%202016"} "Tom Stoll - Herder/Web"]]]]]]))



        ; [social-links]]
