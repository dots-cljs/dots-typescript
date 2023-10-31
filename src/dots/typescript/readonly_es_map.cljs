(ns dots.typescript.readonly-es-map
  "ES6 Map interface, only read methods included."
  (:refer-clojure :exclude [get keys]))

(defn get
  ^js [readonly-es-map key]
  (.get ^js readonly-es-map key))

(defn values
  ^js [readonly-es-map]
  (.values ^js readonly-es-map))

(defn entries
  ^js [readonly-es-map]
  (.entries ^js readonly-es-map))

(defn for-each
  ^js [readonly-es-map action]
  (.forEach ^js readonly-es-map action))

(defn size
  ^js [readonly-es-map]
  (.-size ^js readonly-es-map))

(defn has?
  ^js [readonly-es-map key]
  (.has ^js readonly-es-map key))

(defn keys
  ^js [readonly-es-map]
  (.keys ^js readonly-es-map))
