(ns immutant.init
  (:require
    [hello-world.core :as core]
    [immutant.web :as web]))

(web/start "/" core/app)
