(ns dots.typescript.mode-aware-cache
  (:refer-clojure :exclude [get set]))

(defn get
  (^js [mode-aware-cache key]
   (.get ^js mode-aware-cache key))
  (^js [mode-aware-cache key mode]
   (.get ^js mode-aware-cache key mode)))

(defn set
  (^js [mode-aware-cache key]
   (.set ^js mode-aware-cache key))
  (^js [mode-aware-cache key mode]
   (.set ^js mode-aware-cache key mode))
  (^js [mode-aware-cache key mode value]
   (.set ^js mode-aware-cache key mode value)))

(defn delete
  (^js [mode-aware-cache key]
   (.delete ^js mode-aware-cache key))
  (^js [mode-aware-cache key mode]
   (.delete ^js mode-aware-cache key mode)))

(defn has?
  (^js [mode-aware-cache key]
   (.has ^js mode-aware-cache key))
  (^js [mode-aware-cache key mode]
   (.has ^js mode-aware-cache key mode)))

(defn for-each
  ^js [mode-aware-cache cb]
  (.forEach ^js mode-aware-cache cb))

(defn size
  ^js [mode-aware-cache]
  (.size ^js mode-aware-cache))
