(defproject bifweb "0.1.0-SNAPSHOT"
  :description "FIXME: write this!"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  :min-lein-version "2.6.1"

  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/clojurescript "1.7.228"]
                 [org.clojure/core.async "0.2.374" :exclusions [org.clojure/tools.reader]]
                 [reagent "0.6.1" :exclusions [org.clojure/tools.reader cljsjs/react cljsjs/react-dom]]
                 [secretary "1.2.3"]
                 [cljs-ajax "0.5.4"]
                 [prismatic/dommy "1.1.0"]
                 [hickory "0.6.0"]
                 [cljs-react-material-ui "0.2.38"]
                 [enlive "1.1.6"]]

  :plugins [[lein-figwheel "0.5.2"]
            [lein-cljsbuild "1.1.3" :exclusions [[org.clojure/clojure]]]
            [lein-less "1.7.5"]]

  :source-paths ["cljs-src"]

  :profiles {:dev { :dependencies [[com.cemerick/piggieback "0.2.1"]
                                   [figwheel-sidecar "0.5.2"]
                                   [proto-repl "0.3.1"]
                                   [clj-http "2.2.0"]
                                   [hickory "0.6.0"]]

                    :source-paths ["cljs-src"]}}

  :repl-options {:nrepl-middleware [cemerick.piggieback/wrap-cljs-repl]}

  :clean-targets ^{:protect false} ["resources/public/js" "resources/public/js/compiled" "target" "resources/public/css"]

  :cljsbuild {:builds
              [
                {
                  :id "dev"
                  :source-paths ["cljs-src"]

                  ;; If no code is to be run, set :figwheel true for continued automagical reloading
                  :figwheel {:on-jsload "bifweb.core/fig-reload"}

                  :compiler {:main bifweb.core
                             :asset-path "js/compiled/out"
                             :output-to "resources/public/js/compiled/bifweb.js"
                             :output-dir "resources/public/js/compiled/out"
                             :optimizations :none
                             :source-map-timestamp true}}
                 ;; This next build is an compressed minified build for
                 ;; production. You can build this with:
                 ;; lein cljsbuild once release

                {
                  :id "release"
                  :source-paths ["cljs-src"]
                  :compiler {:output-to "resources/public/js/compiled/bifweb.js"
                             :output-dir "resources/public/prod-out"
                             :main bifweb.core
                             :optimizations :advanced
                             :pretty-print false}}]}
              ; :prod
              ;   {
              ;     :source-paths ["cljs-src"]
              ;     :compiler { :output-to "resources/public/js/bifweb.js"
              ;                 :optimizations :advanced
              ;                 :pretty-print false}
              ;                 }
              ;               }


  :figwheel {;; :http-server-root "public" ;; default and assumes "resources"
             ;; :server-port 3449 ;; default
             ;; :server-ip "127.0.0.1"

             :css-dirs ["resources/public/css"]} ;; watch and update CSS

             ;; Start an nREPL server into the running figwheel process
             ;; :nrepl-port 7888

             ;; Server Ring Handler (optional)
             ;; if you want to embed a ring handler into the figwheel http-kit
             ;; server, this is for simple ring servers, if this
             ;; doesn't work for you just run your own server :)
             ;; :ring-handler hello_world.server/handler

             ;; To be able to open files in your editor from the heads up display
             ;; you will need to put a script on your path.
             ;; that script will have to take a file path and a line number
             ;; ie. in  ~/bin/myfile-opener
             ;; #! /bin/sh
             ;; emacsclient -n +$2 $1
             ;;
             ;; :open-file-command "myfile-opener"

             ;; if you want to disable the REPL
             ;; :repl false

             ;; to configure a different figwheel logfile path
             ;; :server-logfile "tmp/logs/figwheel-logfile.log"

  :less {:source-paths ["resources/less"]
         :target-path "resources/public/css"
          :auto true}

  :hooks [leiningen.less])


; http://paletton.com/palette.php?uid=73q2c0kiKKee-jK2zZwASvzuemP
