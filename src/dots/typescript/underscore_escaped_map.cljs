(ns dots.typescript.underscore-escaped-map
  "Map where keys are `__String`s."
  (:refer-clojure :exclude [get keys set]))

(defn set
  ^js [underscore-escaped-map key value]
  (.set ^js underscore-escaped-map key value))

(defn get
  ^js [underscore-escaped-map key]
  (.get ^js underscore-escaped-map key))

(defn values
  ^js [underscore-escaped-map]
  (.values ^js underscore-escaped-map))

(defn entries
  ^js [underscore-escaped-map]
  (.entries ^js underscore-escaped-map))

(defn for-each
  ^js [underscore-escaped-map action]
  (.forEach ^js underscore-escaped-map action))

(defn size
  ^js [underscore-escaped-map]
  (.-size ^js underscore-escaped-map))

(defn has?
  ^js [underscore-escaped-map key]
  (.has ^js underscore-escaped-map key))

(defn keys
  ^js [underscore-escaped-map]
  (.keys ^js underscore-escaped-map))

(defn delete?
  ^js [underscore-escaped-map key]
  (.delete ^js underscore-escaped-map key))

(defn clear
  ^js [underscore-escaped-map]
  (.clear ^js underscore-escaped-map))
