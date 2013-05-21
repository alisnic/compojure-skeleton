(ns app.views.index
  (:use [hiccup.core :only (h)]
        [hiccup.form :only (form-to label text-area submit-button)])
  (:require [app.views.layout :as layout]))

(defn index []
  (layout/common "Hello clojure"
                 [:div {:class "clear"} "Hello"]))
