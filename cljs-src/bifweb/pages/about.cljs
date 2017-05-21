(ns bifweb.pages.about
  (:require [cljsjs.material-ui]
            [cljs-react-material-ui.core :refer [get-mui-theme color]]
            [cljs-react-material-ui.reagent :as ui]
            [cljs-react-material-ui.icons :as ic]
            [reagent.core :as reagent :refer [atom]]
            [bifweb.util :refer [set-title! standard-col-class]]
            [bifweb.pages.common :as common]))

(defn about-page []
  (fn []
    (set-title! "About - Buffalo Infringement Festival")
    [:div
      [ui/paper
        standard-col-class
        [:div.row
          [:h2 "What is Infringement?"]
          [:p "The buffalo “infringement” festival is a non-profit-driven, non-hierarchical grassroots endeavor bringing
            together a broad range of eclectic, independent, experimental, and controversial art of all forms. Visual,
            performing, musical, and media arts are all welcome here."]
          [:p "Taking place in multiple venues in and around Buffalo’s Allentown District, Grant St., Elmwood, Main St., and beyond,
            the festival is an annual eleven day event running from the last weekend of July through the
            first weekend of August. See the Infringement Festival International's "
            [:a {:href "#mandate"} "mandate"]
            " and our 2006 Mission Statement to learn more."]
          [:p "Read more about "
            [:a {:href "http://www.infringementfestival.com/history/" :target "_blank"} "the history"]
            " of Infringement from the original festival."]]

        [:div.row
          [:h2 "Organizers"]
          [:ul                                                                                                    ; .who
            [:li "Street Coordinator & Tidy Systems Breaker: David Adamczyk"]
            [:li "Visual Arts & Kung-Fu Feng-Shui: Amy Duengfelder & Cat McCarthy"]
            [:li "Dance & Social-Media-Mass-Tagger: Leslie Fineberg"]
            [:li "Outreach: Heather Gring"]
            [:li "Theater & Umlaut Denier: Jessica Knoerl"]
            [:li "Database, Treasurer, Omniscient Narration: Dave Pape"]
            [:li "Literary & Motherly Love: Marek Parker"]
            [:li "Music & Always Right: Curt Rotterdam"]
            [:li "Venues & City Paperwork Wizard: Bill Smythe"]
            [:li "Graphic Design: Amanda Sterzyck"]
            [:li "Herder, Web, Tech: Tom Stoll"]
            [:li "Paper Schedule Design: Janna Willoughby-Lohr"]
            [:li "2017 Poster Design: Cat McCarthy"]
            [:li "AND ALL THOSE WE HAVE (NOT) FORGOTTEN! Thank you!"]]]

        [:div.row
          [:h2 "Mandate"]
          [:p "The infringement Festival is an interdisciplinary festival open to all critical artists. Celebrating freedom of
            expression and designed as a real arts democracy, this festival is a critical response to the oppressive neoliberal
            worldview and all its billboard trucks, televisions, flyers, advertisements, jingles, made-for-TV Wars; and the
            depoliticisation of people through this diversionary Spectacle."]
          [:p "The infringement welcomes a variety of performances
            and cultural resistance: theatre groups, performers, street activism, political theatre, musicians, radical performance,
            visual artists, films, marginalized arts, spoken-word, puppet shows, disadvantaged groups, and anyone wishing to
            artistically infringe on the monoculture that creeps into every corner of our lives."]
          [:p "The festival aims to emphasize both critical practice in the arts, and artistic practice in activism. It also
            aims to provide a positive environment that encourages and nurtures critical art."]
          [:p "To avoid being co-opted, the infringement festival follows a mandate that looks like this:"]
          [:ol
            [:li "The infringement festival is free for all artists and activists to participate in. The festival will never
                charge a registration fee and participants will keep 100% of their box office."]
            [:li "The festival is open to all critical artists and will never discriminate, set entry criteria or censor."]
            [:li "The festival is run as a non-hierarchical arts democracy."]
            [:li "The festival will only accept ethical companies that pose no conflict of interest as sponsors, as the
                interests of the festival’s participants come before those of the sponsors."]
           [:li "The festival will encourage, although not be limited to, progressive acts that encourage discussion and
              oppose oppressive structures."]]]

        [:div.row
          [:h2 "Press and Promotion"]
          [:p "We are active on multiple social media outlets..."]
          [common/social-links]]

        [:div.row
          [:h2 "Sponsors 2016"]
          [:ul
            [:li "Allentown Music"]
            [:li "Allen St. Consulting"]
            [:li "Illos Pianos"]
            [:li "Lovejoy Pizza"]
            [:li "Villardo Printing"]
            [:li "Wasteland Studios"]
            [:li "Dr. Werder Chiropractic"]
            [:li "YarMo's Muse"]
            [:li "James Moffitt"]
            [:li "Rob Peters - madjack3dprints.com"]
            [:li "JR Audio - Jesse Rejewski"]]]

        [:div.row
          [:h2 "Direct Monetary Donations"]
          [:p "This festival is run completely on unicorn wishes and happy sunshine rays! Just kidding! There are real
            dollars that have to go into this grassroots festival for things like equipment, technicians, and most importaintly the printed
            schedule."]
          [:p "Here is a (partial) list of our IndieGoGo donors who helped make Infringement possible in 2016:"]
          [:p "Matt szlachetka, patrickmuldowney, Andrea Turnbull, Susan J. Blackley, Chuck Tingley, Alejandro Gutierrez,
            John Schmitt, Jessica Knoerl, Lonny Lewis, Mermaid & Weasel, Nancy Fernandez, Barbara Miller, Salvatore Sciandra,
            sbader3, russianhands1, m.a.holsinger, Nicole Dionne, Julian Burgio, Michele Costa, ssgring, Alex Mead, Donald Kreger,
            The Good Neighbors (band), Melissa Delmonte, Andrew Delmonte, Susan Holler, Michael Schenkel, Peter Cohen, jazzcog"]]]]))

      ;   [:div.col-md-8
      ;    [:div.row
      ;
      ;     [:div.ad.ad-left
      ;      [:img
      ;       {:src "img/AllenAssoc.jpg"
      ;        :width "200px;"
      ;        :alt "Allentown Association Ad"}]]
      ;     [:div.ad.ad-right
      ;      [:img
      ;       {:src "img/allenconsult.jpg"
      ;        :width "200px"
      ;        :alt "Allentown Consulting"}]]
      ;
      ;     [:div.ad.ad-full
      ;      [:img
      ;       {:src "img/allentown_music.jpg"
      ;        :width "600px"
      ;        :alt "Allentown Music"}]]
      ;
      ;     [:div.ad.ad-left
      ;      [:img
      ;       {:src "img/illios.png"
      ;        :width "200px"
      ;        :alt "Illios Pianos"}]]
      ;     [:div.ad.ad-right
      ;      [:img
      ;       {:src "img/TAZA_logo.jpg"
      ;        :width "200px"
      ;        :alt "TAZA Coffee and Tea"}]]
      ;
      ;     [:div.ad.ad-full
      ;      [:img
      ;       {:src "img/lovejoy.jpg"
      ;        :width "200px"
      ;        :alt "Lovejoy Pizza"}]]
      ;
      ;     [:div.ad.ad-left
      ;      [:img
      ;       {:src "img/Wasteland_Studios.jpg"
      ;        :width "200px"
      ;        :alt "Wasteland Studios"}]]
      ;     [:div.ad.ad-right
      ;      [:img
      ;       {:src "img/werder-chiro.jpg"
      ;        :width "200px"
      ;        :alt "Werder Chiropractic"}]]
      ;
      ;     [:div.ad.ad-left
      ;      [:img
      ;       {:src "img/YarMos.jpg"
      ;        :width "200px"
      ;        :alt "YarMo's"}]]]]]
      ;
