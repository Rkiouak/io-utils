(defproject protojure/io-utils "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.1"]
                 [org.clojure/core.async "1.3.610" :scope "provided"]
                 [org.clojure/tools.logging "1.1.0"]
                 [io.undertow/undertow-servlet "2.2.5.Final" :scope "provided"]]
  :aot [protojure.io-utils.internal.grpc.codec.io
        protojure.io-utils.internal.pedestal.io]
  :repl-options {:init-ns async-io-utils.core})
