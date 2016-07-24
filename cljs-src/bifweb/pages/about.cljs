(ns bifweb.pages.about
  (:require [reagent.core :as reagent :refer [atom]]
            [bifweb.pages.common :refer [social-links]]))

(defn about-page []
  (fn []
    [:div.col-md-12
      [:div.row
        [:h2 "What is Infringement?"]
        [:p "The buffalo “infringement” festival is a non-profit-driven, non-hierarchical grassroots endeavor bringing
          together a broad range of eclectic, independent, experimental, and controversial art of all forms. Visual,
          performing, musical, and media arts are all welcome here. Taking place in multiple venues in and around Buffalo’s
          Allentown District, the festival is an annual eleven-day event running from the last weekend of July through the
          first weekend of August. See the Infringement Festival International's "
          [:a {:href "#mandate"} "mandate"]
          " and our 2006 Mission Statement to learn more."]
        [:p "Read more about "
          [:a {:href "http://www.infringementfestival.com/history/" :target "_blank"} "the history"]
          " of Infringement from the original festival."]]

      [:div.row {:id "organizers"}
        [:h2 "Organizers"]]


      [:div.row {:id "mandate"}
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

        [:p "To avoid being co-opted, the infringement festival follows a mandate that looks like this:"

          [:ol
            [:li "The infringement festival is free for all artists and activists to participate in. The festival will never
              charge a registration fee and participants will keep 100% of their box office."]
            [:li "The festival is open to all critical artists and will never discriminate, set entry criteria or censor."]
            [:li "The festival is run as a non-hierarchical arts democracy."]
            [:li "The festival will only accept ethical companies that pose no conflict of interest as sponsors, as the
              interests of the festival’s participants come before those of the sponsors. (Our criteria for ethical sponsorship
              is available here[TBA].)"]

           [:li "The festival will encourage, although not be limited to, progressive acts that encourage discussion and
            oppose oppressive structures."]]]]


      [:div.row
        [:h2 "Press and Promotion"]
        [:p "We are active on multiple social media outlets..."]
        [social-links]]

      [:div.row
        [:h2 "Sponsors"]
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
        [:p "Here is a (partial) list of our Indie GoGo donors who helped make Infringement possible in 2016:"]
        [:p "Matt szlachetka, patrickmuldowney, Andrea Turnbull, Susan J. Blackley, Chuck Tingley, Alejandro Gutierrez,
          John Schmitt, Jessica Knoerl, Lonny Lewis, Mermaid & Weasel, Nancy Fernandez, Barbara Miller, Salvatore Sciandra,
          sbader3, russianhands1, m.a.holsinger, Nicole Dionne, Julian Burgio, Michele Costa, ssgring, Alex Mead, Donald Kreger,
          The Good Neighbors (band), Melissa Delmonte, Andrew Delmonte, Susan Holler, Michael Schenkel, Peter Cohen, jazzcog"]]]))
