(ns dots.typescript.collection
  "Common write methods for ES6 Map/Set."
  (:refer-clojure :exclude [keys]))

(defn delete?
  ^js [collection key]
  (.delete ^js collection key))

(defn clear
  ^js [collection]
  (.clear ^js collection))

(defn size
  ^js [collection]
  (.-size ^js collection))

(defn has?
  ^js [collection key]
  (.has ^js collection key))

(defn keys
  ^js [collection]
  (.keys ^js collection))
