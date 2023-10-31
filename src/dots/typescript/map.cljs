(ns dots.typescript.map
  "ES6 Map interface."
  (:refer-clojure :exclude [get keys set]))

(defn set
  ^js [map key value]
  (.set ^js map key value))

(defn get
  ^js [map key]
  (.get ^js map key))

(defn values
  ^js [map]
  (.values ^js map))

(defn entries
  ^js [map]
  (.entries ^js map))

(defn for-each
  ^js [map action]
  (.forEach ^js map action))

(defn size
  ^js [map]
  (.-size ^js map))

(defn has?
  ^js [map key]
  (.has ^js map key))

(defn keys
  ^js [map]
  (.keys ^js map))

(defn delete?
  ^js [map key]
  (.delete ^js map key))

(defn clear
  ^js [map]
  (.clear ^js map))
