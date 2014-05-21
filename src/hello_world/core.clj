(ns hello-world.core
  (:gen-class)
  (:require
   [ring.adapter.jetty              :refer [run-jetty]]
   [ring.middleware.resource        :refer [wrap-resource]]
   [ring.middleware.session         :refer [wrap-session]]
   [ring.middleware.session.cookie  :refer [cookie-store]]
   [ring.middleware.file            :refer [wrap-file]]
   [ring.middleware.file-info       :refer [wrap-file-info]]
   [tailrecursion.castra.handler    :refer [castra]]))

(def app
  (->
    (castra  'hello-world.api)
    (wrap-session {:store (cookie-store {:key "a 16-byte secret"})})
    (wrap-resource "public")    
    (wrap-file-info)))

(defn dev-server [& [port]]
  (->
    (castra  'hello-world.api)
    (wrap-session {:store (cookie-store {:key "a 16-byte secret"})})
    (wrap-file "resources/public")
    (wrap-file-info)
    (run-jetty {:join? false :port (or port 33333)})))

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))
