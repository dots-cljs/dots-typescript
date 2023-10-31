(ns dots.typescript.es-map
  "ES6 Map interface."
  (:refer-clojure :exclude [get keys set]))

(defn set
  ^js [es-map key value]
  (.set ^js es-map key value))

(defn get
  ^js [es-map key]
  (.get ^js es-map key))

(defn values
  ^js [es-map]
  (.values ^js es-map))

(defn entries
  ^js [es-map]
  (.entries ^js es-map))

(defn for-each
  ^js [es-map action]
  (.forEach ^js es-map action))

(defn size
  ^js [es-map]
  (.-size ^js es-map))

(defn has?
  ^js [es-map key]
  (.has ^js es-map key))

(defn keys
  ^js [es-map]
  (.keys ^js es-map))

(defn delete?
  ^js [es-map key]
  (.delete ^js es-map key))

(defn clear
  ^js [es-map]
  (.clear ^js es-map))
