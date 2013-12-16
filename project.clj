(defproject hello-world "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :plugins      [[lein-ring "0.8.7"]]
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [ring "1.2.0"]
                 [tailrecursion/hoplon "4.0.6"]]  
  :war-resources-path "public"
  :ring         {:handler hello-world.core/app  })
