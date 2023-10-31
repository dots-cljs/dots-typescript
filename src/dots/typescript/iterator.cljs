(ns dots.typescript.iterator
  "ES6 Iterator type."
  (:refer-clojure :exclude [next]))

(defn next
  ^js [iterator]
  (.next ^js iterator))
