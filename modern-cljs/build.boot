(set-env!
 :source-paths #{"src/cljs"}
 :resource-paths #{"html"}

 :dependencies '[[adzerk/boot-cljs "1.7.170-3"]
                 [pandeiro/boot-http "0.7.0"]])

(require '[adzerk.boot-cljs :refer [cljs]]
         '[pandeiro.boot-http :refer [serve]])
