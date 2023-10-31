(ns dots.typescript.readonly-collection
  "Common read methods for ES6 Map/Set."
  (:refer-clojure :exclude [keys]))

(defn size
  ^js [readonly-collection]
  (.-size ^js readonly-collection))

(defn has?
  ^js [readonly-collection key]
  (.has ^js readonly-collection key))

(defn keys
  ^js [readonly-collection]
  (.keys ^js readonly-collection))
