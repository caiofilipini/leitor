(ns leitor.web
  (:use
    [compojure.core]
    [ring.adapter.jetty :only [run-jetty]])
  (:require
    [compojure.route      :as route]
    [clostache.parser     :as template]
    [leitor.subscriptions :as subscriptions]))

(defn index []
  (template/render-resource "templates/index.mustache" {}))

(defn subscriptions-for [owner]
  (template/render-resource
    "templates/subscriptions.mustache"
    {:subscriptions (subscriptions/for-user owner)}))

(defroutes app-routes
  (GET "/" []
       (index))
  (GET "/subscriptions/:owner" [owner]
       (subscriptions-for owner))
  (route/resources "/"))

(defn -main [& args]
  (run-jetty app-routes {:port 8080}))
