(ns bifweb.pages.home
  (:require [cljsjs.material-ui]
            [cljs-react-material-ui.core :refer [get-mui-theme color]]
            [cljs-react-material-ui.reagent :as ui]
            [cljs-react-material-ui.icons :as ic]
            [reagent.core :as r]
            [bifweb.util :refer [set-title! standard-col-class]]
            [bifweb.session :as session]
            [bifweb.pages.common :as common]))


(defn home-page []
  (fn []
    (set-title! "Buffalo Infringement Festival")
    [:div
      [ui/paper
        standard-col-class

        [:div.row
          [:h2 "Proposal Submission Closed"]
          [:img
            {:src "img/Cat_cupcake.jpg"
             :style {:width "60px" :float "left"}}]
          [:p "The deadline for 2017 Infringement Festival proposals has passed. Thank you to all who applied."]
          [:p "To edit information in a submitted proposal, " [:a {:href "db2/index.php"} "login here."]]
          [:p "This year's dates: " [:strong "Thursday July 27 - Sunday August 6, 2017"]]]

        [:div.row
          [:h2 "Upcoming Events & Meetings"]
          [:div.box-text
             [:ul

               [:li "Sat Apr 1, 11:59pm - Final Deadline for Proposals"]
               [:li "Thu Apr 13, 7:30pm - PR @ Ol' Wondermoth"]
               [:li "Mon Apr 17, 6:30pm - Schedulers"]
               [:li "Mon Apr 24, 6:30pm - Schedulers, as needed"]
               [:li "Mon May 1 - Scheduling confirmations begin"]
               [:li "Mon May 8, 6:30pm - Schedulers, as needed"]
               [:li "Mon May 15, 6:30pm - Organizers Meeting @ Ol' Wondermoth"]
               [:li "Wed Jun 8 - Scheduling finalized with artists"]
               [:li "Wed Jun 15 - Schedule published online."]
               [:li "Mon Jun 26, 6:30pm - Organizers Meeting @ Ol' Wondermoth"]
               [:li "July - General meeting and press conferences."]
               [:li "Mon Jul 24, 6:00pm - Pre-festival organizers dinner/meeting."]
               [:li "Wed Jul 26 - Schedule published in the Public."]]]]

        [:div.row
          [:h2 "Volunteer"]
          [:p "Email us at "
            [:a {:href "mailto:info@infringebuffalo.org?Subject=Volunteer%20at%20BIF%202017"} "info@infringebuffalo.org"]
            ". We need people to help run shows, to help us publicize the festival, hang posters, and other tasks."]]

        [:div.row
          [:h2 "Venues"]
          [:p "In 2016, we had close to 100 venues. New venues include Amity Club, Merriweather Library, Cafeology, Daily Planet."]]

        [:div.row
          [:h2 "Find us on social media!"]
          [:p "Promote your shows. Find things to do during the festival. Discover artists."]
          [common/social-links]]

        [:div.row
          [:h2 "Want to know more?"]
          [:p "Check out our "
            [:a {:href "#/faq" :alt "faq"} "FAQ"]
            ". We try to answer many of your questions there."]]

        [:div.row
          [:h2 "About Infringement"]
          [:p
            "The 2017 Festival is the 14th running of a festival that has its roots in Montreal, QC and beyond. "
            [:a {:href "#/about"} "Read more"]
            " about the history, funders, and founding documents of the Buffalo Infringement Festival."]]]]))
