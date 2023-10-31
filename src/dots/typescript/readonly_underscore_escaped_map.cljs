(ns dots.typescript.readonly-underscore-escaped-map
  "ReadonlyMap where keys are `__String`s."
  (:refer-clojure :exclude [get keys]))

(defn get
  ^js [readonly-underscore-escaped-map key]
  (.get ^js readonly-underscore-escaped-map key))

(defn values
  ^js [readonly-underscore-escaped-map]
  (.values ^js readonly-underscore-escaped-map))

(defn entries
  ^js [readonly-underscore-escaped-map]
  (.entries ^js readonly-underscore-escaped-map))

(defn for-each
  ^js [readonly-underscore-escaped-map action]
  (.forEach ^js readonly-underscore-escaped-map action))

(defn size
  ^js [readonly-underscore-escaped-map]
  (.-size ^js readonly-underscore-escaped-map))

(defn has?
  ^js [readonly-underscore-escaped-map key]
  (.has ^js readonly-underscore-escaped-map key))

(defn keys
  ^js [readonly-underscore-escaped-map]
  (.keys ^js readonly-underscore-escaped-map))
