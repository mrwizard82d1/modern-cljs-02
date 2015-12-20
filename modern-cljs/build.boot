(set-env!
 :source-paths #{"src/cljs"}
 :resource-paths #{"html"}

 :dependencies '[[org.clojure/clojure "1.7.0"] ;; The author of boot-cljs-repl suggests we explicitly 
                 [org.clojure/clojurescript "1.7.170"] ;; require Clojure and ClojureScript.
                 [adzerk/boot-cljs "1.7.170-3"]
                 [pandeiro/boot-http "0.7.0"]
                 [adzerk/boot-reload "0.4.2"]
                 [adzerk/boot-cljs-repl "0.3.0"] ;; add bREPL
                 [com.cemerick/piggieback "0.2.1"] ;; In addition, we must include the TRANSITIVE
                 [weasel "0.7.0"] ;; dependencies of boot-cljs-repl (that is, we must specifically
                 [org.clojure/tools.nrepl "0.2.12"] ;; include the projects on which boot-cljs-repl depends
                 ]) 

(require '[adzerk.boot-cljs :refer [cljs]]
         '[pandeiro.boot-http :refer [serve]]
         '[adzerk.boot-reload :refer [reload]]
         '[adzerk.boot-cljs-repl :refer [cljs-repl start-repl]]) ;; make bREPL visible 
