(ns bifweb.pages.venues
  (:require [cljsjs.material-ui]
            [cljs-react-material-ui.core :refer [get-mui-theme color]]
            [cljs-react-material-ui.reagent :as ui]
            [cljs-react-material-ui.icons :as ic]
            [reagent.core :as r]
            [bifweb.util :refer [set-title! standard-col-class]]
            [bifweb.session :as session]))

(def venues-master-list
 [
   [
     14705,
     "9th Ward @ BABEVILLE",
     "venue.php?id=14705"]
   ,
   [
     14706,
     "Allen Street Consulting",
     "venue.php?id=14706"]
   ,
   [
     14283,
     "Allen Street Poutine",
     "venue.php?id=14283"]
   ,
   [
     14707,
     "Allentown Music",
     "venue.php?id=14707"]
   ,
   [
     14202,
     "Allentown Pizza",
     "venue.php?id=14202"]
   ,
   [
     14207,
     "Amity Club",
     "venue.php?id=14207"]
   ,
   [
     14285,
     "Antique Man",
     "venue.php?id=14285"]
   ,
   [
     17597,
     "Art Under the Stars ",
     "venue.php?id=17597"]
   ,
   [
     15574,
     "Artspace Buffalo",
     "venue.php?id=15574"]
   ,
   [
     17919,
     "BCAT",
     "venue.php?id=17919"]
   ,
   [
     14268,
     "Bidwell Park",
     "venue.php?id=14268"]
   ,
   [
     15276,
     "Broadway Market",
     "venue.php?id=15276"]
   ,
   [
     15578,
     "Buffalo Barfly",
     "venue.php?id=15578"]
   ,
   [
     14709,
     "Burchfield Penney Art Center",
     "venue.php?id=14709"]
   ,
   [
     14710,
     "Burning Books",
     "venue.php?id=14710"]
   ,
   [
     14711,
     "Cafe Taza",
     "venue.php?id=14711"]
   ,
   [
     14712,
     "Caffe Aroma",
     "venue.php?id=14712"]
   ,
   [
     14714,
     "Caffeology",
     "venue.php?id=14714"]
   ,
   [
     15579,
     "Cantina Loco Patio",
     "venue.php?id=15579"]
   ,
   [
     14713,
     "Casa de Arte",
     "venue.php?id=14713"]
   ,
   [
     14715,
     "Crane Branch Library",
     "venue.php?id=14715"]
   ,
   [
     14170,
     "Daily Planet Coffee Co., Inc.",
     "venue.php?id=14170"]
   ,
   [
     15715,
     "Days Park",
     "venue.php?id=15715"]
   ,
   [
     15592,
     "Delaware Park - Hoyt Lake",
     "venue.php?id=15592"]
   ,
   [
     14287,
     "Dreamland",
     "venue.php?id=14287"]
   ,
   [
     14716,
     "El Buen Amigo",
     "venue.php?id=14716"]
   ,
   [
     14717,
     "El Museo",
     "venue.php?id=14717"]
   ,
   [
     14718,
     "Electric Avenue",
     "venue.php?id=14718"]
   ,
   [
     15585,
     "Essex Street Pub",
     "venue.php?id=15585"]
   ,
   [
     17703,
     "Expo Market",
     "venue.php?id=17703"]
   ,
   [
     15604,
     "Frank E. Merriweather Library",
     "venue.php?id=15604"]
   ,
   [
     15586,
     "G & L Flooring Center",
     "venue.php?id=15586"]
   ,
   [
     14719,
     "GCR Studios",
     "venue.php?id=14719"]
   ,
   [
     15587,
     "Geoff Kelly's House",
     "venue.php?id=15587"]
   ,
   [
     15588,
     "Global Chic",
     "venue.php?id=15588"]
   ,
   [
     14721,
     "Global Justice Ecology Project/?Buen Vivir!",
     "venue.php?id=14721"]
   ,
   [
     15590,
     "Global Villages",
     "venue.php?id=15590"]
   ,
   [
     14722,
     "Grant Street Community Center",
     "venue.php?id=14722"]
   ,
   [
     15363,
     "Hallwalls' Cinema",
     "venue.php?id=15363"]
   ,
   [
     14720,
     "Hi Temp Fabrication",
     "venue.php?id=14720"]
   ,
   [
     15641,
     "Hickory Urban Sanctuary",
     "venue.php?id=15641"]
   ,
   [
     15591,
     "Holley Farms Parking Lot",
     "venue.php?id=15591"]
   ,
   [
     14290,
     "Hostel Buffalo-Niagara",
     "venue.php?id=14290"]
   ,
   [
     14723,
     "Hot Mama's Canteen",
     "venue.php?id=14723"]
   ,
   [
     14724,
     "Hydraulic Hearth",
     "venue.php?id=14724"]
   ,
   [
     14228,
     "Indigo Art",
     "venue.php?id=14228"]
   ,
   [
     14725,
     "Karpeles Manuscript Library - North Street",
     "venue.php?id=14725"]
   ,
   [
     14726,
     "Karpeles Manuscript Library - Porter Avenue",
     "venue.php?id=14726"]
   ,
   [
     15597,
     "Kleinhans Parking Lot",
     "venue.php?id=15597"]
   ,
   [
     15598,
     "Lafayette Square",
     "venue.php?id=15598"]
   ,
   [
     15600,
     "LaSalle Park",
     "venue.php?id=15600"]
   ,
   [
     15649,
     "Locust Street Art",
     "venue.php?id=15649"]
   ,
   [
     14224,
     "Main Street Gallery",
     "venue.php?id=14224"]
   ,
   [
     14728,
     "Manny Fried Theatre",
     "venue.php?id=14728"]
   ,
   [
     15917,
     "Merge",
     "venue.php?id=15917"]
   ,
   [
     14226,
     "Milkie's",
     "venue.php?id=14226"]
   ,
   [
     15313,
     "Mister Goodbar",
     "venue.php?id=15313"]
   ,
   [
     15699,
     "Mod Dance",
     "venue.php?id=15699"]
   ,
   [
     14704,
     "Mohawk Place",
     "venue.php?id=14704"]
   ,
   [
     15608,
     "Nickel City Housing Cooperative: Ol'Wondermoth",
     "venue.php?id=15608"]
   ,
   [
     15902,
     "Nickel City Housing Cooperative: Plankton House",
     "venue.php?id=15902"]
   ,
   [
     14169,
     "Nietzsche's",
     "venue.php?id=14169"]
   ,
   [
     16554,
     "Old Editions Bookshop and Cafe",
     "venue.php?id=16554"]
   ,
   [
     15442,
     "Paw Prints by Penny",
     "venue.php?id=15442"]
   ,
   [
     15611,
     "Perks Cafe",
     "venue.php?id=15611"]
   ,
   [
     14729,
     "Queen City Gallery",
     "venue.php?id=14729"]
   ,
   [
     15612,
     "Rhonda's backyard",
     "venue.php?id=15612"]
   ,
   [
     16560,
     "RUDEBOYZ ARTWORKS",
     "venue.php?id=16560"]
   ,
   [
     14240,
     "Rust Belt Books",
     "venue.php?id=14240"]
   ,
   [
     14735,
     "Sewing Souls Studio",
     "venue.php?id=14735"]
   ,
   [
     18604,
     "Shakti Yoga",
     "venue.php?id=18604"]
   ,
   [
     15617,
     "Shianne Wax Studio",
     "venue.php?id=15617"]
   ,
   [
     17012,
     "Silo City",
     "venue.php?id=17012"]
   ,
   [
     15619,
     "Spiral Scratch",
     "venue.php?id=15619"]
   ,
   [
     15547,
     "Sportsmen's Tavern",
     "venue.php?id=15547"]
   ,
   [
     18806,
     "St. John's Grace",
     "venue.php?id=18806"]
   ,
   [
     15626,
     "Streets of Buffalo",
     "venue.php?id=15626"]
   ,
   [
     15366,
     "Sugar City",
     "venue.php?id=15366"]
   ,
   [
     14289,
     "Sweet Temptations Du Jour",
     "venue.php?id=14289"]
   ,
   [
     14730,
     "Sweetness 7",
     "venue.php?id=14730"]
   ,
   [
     15627,
     "Symphony Circle",
     "venue.php?id=15627"]
   ,
   [
     15629,
     "The Alley Cat",
     "venue.php?id=15629"]
   ,
   [
     14731,
     "The Could Be Wild Building",
     "venue.php?id=14731"]
   ,
   [
     14732,
     "The Dress Shop",
     "venue.php?id=14732"]
   ,
   [
     14703,
     "The Gypsy Parlor",
     "venue.php?id=14703"]
   ,
   [
     15632,
     "The Melting Point",
     "venue.php?id=15632"]
   ,
   [
     15633,
     "The Tudor Lounge",
     "venue.php?id=15633"]
   ,
   [
     15697,
     "The Underground",
     "venue.php?id=15697"]
   ,
   [
     14733,
     "Uncle Sams Army Navy",
     "venue.php?id=14733"]
   ,
   [
     15635,
     "Under the Pine Tree",
     "venue.php?id=15635"]
   ,
   [
     14734,
     "Urban Roots",
     "venue.php?id=14734"]
   ,
   [
     15639,
     "West Side Bazaar",
     "venue.php?id=15639"]
   ,
   [
     16385,
     "WestSide Herbs and Alliums",
     "venue.php?id=16385"]
   ,
   [
     14736,
     "Westside Stories Used Books and Games",
     "venue.php?id=14736"]
   ,
   [
     15640,
     "WNY Book Arts Center",
     "venue.php?id=15640"]
   ,
   [
     14467,
     "1045 Elmwood Gallery for the Arts",
     "venue.php?id=14467"]
   ,
   [
     15570,
     "Allen St. (between Wadsworth & Elmwoood)",
     "venue.php?id=15570"]
   ,
   [
     14708,
     "Bidwell Park",
     "venue.php?id=14708"]
   ,
   [
     16566,
     "Karpeles Manuscript Library - North Street (outside)",
     "venue.php?id=16566"]
   ,
   [
     14727,
     "Larkin Square",
     "venue.php?id=14727"]
   ,
   [
     15607,
     "Niagara Square",
     "venue.php?id=15607"]
   ,
   [
     15620,
     "Spirits of Allentown",
     "venue.php?id=15620"]
   ,
   [
     15724,
     "Spot Coffee Delaware",
     "venue.php?id=15724"]
   ,
   [
     15723,
     "Spot Coffee Elmwood",
     "venue.php?id=15723"]
   ,
   [
     15360,
     "Spot Coffee Hertel",
     "venue.php?id=15360"]
   ,
   [
     15625,
     "Starlight Studio & Art Gallery",
     "venue.php?id=15625"]
   ,
   [
     14399,
     "Test",
     "venue.php?id=14399"]
   ,
   [
     14252,
     "The Foundry",
     "venue.php?id=14252"]])


(defn venues-page []
  (set-title! "Venues - Buffalo Infringement Festival")
  [:div
    [ui/paper
      standard-col-class
       [:div.row
        [:h2 "2017 Venues"]]
       ; (js/console "asd")
       (for [venue venues-master-list]
        ^{:key (first venue)} [:div.row [:a {:href (str "venues/" (first venue))} (second venue)]])]])
