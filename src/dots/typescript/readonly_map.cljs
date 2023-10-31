(ns dots.typescript.readonly-map
  "ES6 Map interface, only read methods included."
  (:refer-clojure :exclude [get keys]))

(defn get
  ^js [readonly-map key]
  (.get ^js readonly-map key))

(defn values
  ^js [readonly-map]
  (.values ^js readonly-map))

(defn entries
  ^js [readonly-map]
  (.entries ^js readonly-map))

(defn for-each
  ^js [readonly-map action]
  (.forEach ^js readonly-map action))

(defn size
  ^js [readonly-map]
  (.-size ^js readonly-map))

(defn has?
  ^js [readonly-map key]
  (.has ^js readonly-map key))

(defn keys
  ^js [readonly-map]
  (.keys ^js readonly-map))
