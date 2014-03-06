(defproject hello-world "0.1.0-SNAPSHOT"
  :description  "FIXME: add description"
  :url          "http://example.com/FIXME"
  :license      {:name  "Eclipse Public License"
                 :url   "http://www.eclipse.org/legal/epl-v10.html"}
  :plugins      [[lein-ring "0.8.7"]]
  :min-lein-version "2.0.0"
  :dependencies [[org.clojure/clojure     "1.5.1"]
                 [ring "1.2.0"]
                 [org.immutant/immutant "1.1.0"]
                  [tailrecursion/hoplon "5.1.1"]]
  :immutant     {:resolve-dependencies true
                 :lein-profiles [:dev]
                 :context-path "/hello-world/"
                 :nrepl-port 4321}          
  :source-paths ["src"])
