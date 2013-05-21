(ns app.controllers.root
  (:use [compojure.core :only (defroutes GET POST)])
  (:require [clojure.string :as str]
            [ring.util.response :as ring]
            [app.views.index :as view]))

(defn index []
  (view/index))

(defroutes routes
  (GET  "/" [] (index)))
