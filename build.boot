#!/usr/bin/env boot

#tailrecursion.boot.core/version "2.0.0"

(set-env!
  :dependencies '[[tailrecursion/boot.task   "2.0.0"]
                  [tailrecursion/hoplon      "5.0.0"]
                  [ring                      "1.2.0"]
                  [org.clojure/clojurescript "0.0-2138"]]
  :out-path     "resources/public"
  :src-paths    #{"src"})

;; Static resources synced to output dir
(add-sync! (get-env :out-path) #{"resources/assets"})

(require '[tailrecursion.hoplon.boot :refer :all])

(deftask war
  "Build project war file."
  []
  (set-env!
    :src-paths #{"resources"}
    :lein      '{:war-resources-path "public"
                 :plugins            [[lein-ring "0.8.7"]]
                 :ring               {:handler hello-world.core/app}})
  (comp
    (hoplon {:optimizations :advanced})
    (lein "ring" "uberwar" "hello.war")))

(deftask dev
  "Open repl in project 'hello-world.core ns."
  []
  (repl 'hello-world.core))
