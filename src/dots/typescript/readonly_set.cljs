(ns dots.typescript.readonly-set
  "ES6 Set interface, only read methods included."
  (:refer-clojure :exclude [keys]))

(defn has?
  ^js [readonly-set value]
  (.has ^js readonly-set value))

(defn values
  ^js [readonly-set]
  (.values ^js readonly-set))

(defn entries
  ^js [readonly-set]
  (.entries ^js readonly-set))

(defn for-each
  ^js [readonly-set action]
  (.forEach ^js readonly-set action))

(defn size
  ^js [readonly-set]
  (.-size ^js readonly-set))

(defn keys
  ^js [readonly-set]
  (.keys ^js readonly-set))
