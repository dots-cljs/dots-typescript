(ns dots.typescript.set
  "ES6 Set interface."
  (:refer-clojure :exclude [keys]))

(defn add
  ^js [set value]
  (.add ^js set value))

(defn delete?
  ^js [set value]
  (.delete ^js set value))

(defn has?
  ^js [set value]
  (.has ^js set value))

(defn values
  ^js [set]
  (.values ^js set))

(defn entries
  ^js [set]
  (.entries ^js set))

(defn for-each
  ^js [set action]
  (.forEach ^js set action))

(defn size
  ^js [set]
  (.-size ^js set))

(defn keys
  ^js [set]
  (.keys ^js set))

(defn clear
  ^js [set]
  (.clear ^js set))
