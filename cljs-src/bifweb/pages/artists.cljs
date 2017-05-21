(ns bifweb.pages.artists
  (:require [cljsjs.material-ui]
            [cljs-react-material-ui.core :refer [get-mui-theme color]]
            [cljs-react-material-ui.reagent :as ui]
            [cljs-react-material-ui.icons :as ic]
            [reagent.core :as r]
            [bifweb.util :refer [set-title! standard-col-class]]
            [bifweb.session :as session]))

(defn artists-page []
  (set-title! "Artists - Buffalo Infringement Festival")
  [:div
    [ui/paper
      standard-col-class
      [:div.row
        [:h2 "Artists and Performers"]
        [:p "We will post the official list of participating artists in early April."]]]])
