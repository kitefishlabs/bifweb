(ns bifweb.pages.faq
  (:require [reagent.core :as r]
            [bifweb.util :refer [set-title!]]
            [bifweb.session :as session]))

(defn faq-page []
  [:h1 "FAQs"])