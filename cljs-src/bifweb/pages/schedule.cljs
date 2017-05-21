(ns bifweb.pages.schedule
  (:require [cljsjs.material-ui]
            [cljs-react-material-ui.core :refer [get-mui-theme color]]
            [cljs-react-material-ui.reagent :as ui]
            [cljs-react-material-ui.icons :as ic]
            [reagent.core :as r]
            [bifweb.util :refer [set-title! standard-col-class]]
            [bifweb.session :as session]))


(defn schedule-page []
  (fn []
   [:div
    [ui/paper
      standard-col-class
      [:h2 "2017 Festival Schedule"]
      [:p "The 2017 Buffalo Infringement Festival runs from Thursday, July 27,
           through Sunday, August 6. We will release a full schedule in June."]]]))
