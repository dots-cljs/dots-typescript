(ns dots.typescript.non-relative-module-name-resolution-cache
  "Stored map from non-relative module name to a table: directory -> result of module lookup in this directory
   We support only non-relative module names because resolution of relative module names is usually more deterministic and thus less expensive.")

(defn or-create-cache-for-module-name
  (^js [non-relative-module-name-resolution-cache non-relative-module-name]
   (.getOrCreateCacheForModuleName ^js non-relative-module-name-resolution-cache non-relative-module-name))
  (^js [non-relative-module-name-resolution-cache non-relative-module-name mode]
   (.getOrCreateCacheForModuleName ^js non-relative-module-name-resolution-cache non-relative-module-name mode))
  (^js [non-relative-module-name-resolution-cache non-relative-module-name mode redirected-reference]
   (.getOrCreateCacheForModuleName ^js non-relative-module-name-resolution-cache non-relative-module-name mode redirected-reference)))

(defn clear
  ^js [non-relative-module-name-resolution-cache]
  (.clear ^js non-relative-module-name-resolution-cache))
