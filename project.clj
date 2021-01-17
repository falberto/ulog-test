(defproject test-ulog "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.1"]
                 [clj-http "3.11.0"]
                 [cheshire "5.10.0"]
                 [com.brunobonacci/mulog "0.6.4"]
                 [com.brunobonacci/mulog-zipkin "0.6.4"]]
  :repl-options {:init-ns test-ulog.core})
