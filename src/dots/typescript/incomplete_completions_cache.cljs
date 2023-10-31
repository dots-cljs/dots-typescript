(ns dots.typescript.incomplete-completions-cache
  (:refer-clojure :exclude [get set]))

(defn get
  ^js [incomplete-completions-cache]
  (.get ^js incomplete-completions-cache))

(defn set
  ^js [incomplete-completions-cache response]
  (.set ^js incomplete-completions-cache response))

(defn clear
  ^js [incomplete-completions-cache]
  (.clear ^js incomplete-completions-cache))
