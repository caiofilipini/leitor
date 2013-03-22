(defproject leitor "0.0.1-SNAPSHOT"
  :description "Basic RSS Reader webapp"
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [compojure "1.1.5"]
                 [de.ubercode.clostache/clostache "1.3.1"]
                 [ring/ring-jetty-adapter "1.1.8"]]
  :main leitor.web)
