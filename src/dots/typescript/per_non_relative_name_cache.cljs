(ns dots.typescript.per-non-relative-name-cache
  (:refer-clojure :exclude [get set]))

(defn get
  ^js [per-non-relative-name-cache directory]
  (.get ^js per-non-relative-name-cache directory))

(defn set
  ^js [per-non-relative-name-cache directory result]
  (.set ^js per-non-relative-name-cache directory result))
