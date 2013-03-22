(ns leitor.web
  (:use
    [compojure.core]
    [ring.adapter.jetty :only [run-jetty]])
  (:require
    [compojure.route :as route]
    [clostache.parser :as template]))

(defn index []
  (template/render-resource "templates/index.mustache" {}))

(defroutes app-routes
  (GET "/" [] (index))
  (route/resources "/"))

(defn -main [& args]
  (run-jetty app-routes {:port 8080}))
