(ns test-ulog.core
  (:require [com.brunobonacci.mulog :as u]))


(u/set-global-context! {:version "0.0.1" :app-name "TEST"})

(u/start-publisher!
  ;{:type :console :pretty? true})
  {:type :multi
   :publishers
         [{:type :console :pretty? true}
          {:type :zipkin
           :url  "http://localhost:9411/"}]})



(u/log :start!)