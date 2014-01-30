(ns hello-world.api
  (:refer-clojure :exclude [defn])
  (:require [hello-world.rules :refer [allow deny]])
  (:require [tailrecursion.castra :refer [defn]])
)

(defn doit []
  {:rpc/pre [(allow)]}
  "This came from the server.")
