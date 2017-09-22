(defproject clj-data-science "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[expound "0.3.0"]
                 [org.clojure/clojure "1.9.0-beta1"]
                 [org.clojure/core.specs.alpha "0.1.24"]
                 [spec-provider "0.4.9"]]
  :main ^:skip-aot clj-data-science.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
