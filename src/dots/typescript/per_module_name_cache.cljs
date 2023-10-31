(ns dots.typescript.per-module-name-cache
  (:refer-clojure :exclude [get set]))

(defn get
  ^js [per-module-name-cache directory]
  (.get ^js per-module-name-cache directory))

(defn set
  ^js [per-module-name-cache directory result]
  (.set ^js per-module-name-cache directory result))
