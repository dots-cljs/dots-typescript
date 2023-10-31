(ns dots.typescript.non-relative-module-name-resolution-cache
  "Stored map from non-relative module name to a table: directory -> result of module lookup in this directory
   We support only non-relative module names because resolution of relative module names is usually more deterministic and thus less expensive."
  (:refer-clojure :exclude [update]))

(defn or-create-cache-for-module-name
  (^js [non-relative-module-name-resolution-cache non-relative-module-name]
   (.getOrCreateCacheForModuleName ^js non-relative-module-name-resolution-cache non-relative-module-name))
  (^js [non-relative-module-name-resolution-cache non-relative-module-name mode]
   (.getOrCreateCacheForModuleName ^js non-relative-module-name-resolution-cache non-relative-module-name mode))
  (^js [non-relative-module-name-resolution-cache non-relative-module-name mode redirected-reference]
   (.getOrCreateCacheForModuleName ^js non-relative-module-name-resolution-cache non-relative-module-name mode redirected-reference)))

(defn from-non-relative-name-cache
  (^js [non-relative-module-name-resolution-cache non-relative-name]
   (.getFromNonRelativeNameCache ^js non-relative-module-name-resolution-cache non-relative-name))
  (^js [non-relative-module-name-resolution-cache non-relative-name mode]
   (.getFromNonRelativeNameCache ^js non-relative-module-name-resolution-cache non-relative-name mode))
  (^js [non-relative-module-name-resolution-cache non-relative-name mode directory-name]
   (.getFromNonRelativeNameCache ^js non-relative-module-name-resolution-cache non-relative-name mode directory-name))
  (^js [non-relative-module-name-resolution-cache non-relative-name mode directory-name redirected-reference]
   (.getFromNonRelativeNameCache ^js non-relative-module-name-resolution-cache non-relative-name mode directory-name redirected-reference)))

(defn or-create-cache-for-non-relative-name
  (^js [non-relative-module-name-resolution-cache non-relative-name]
   (.getOrCreateCacheForNonRelativeName ^js non-relative-module-name-resolution-cache non-relative-name))
  (^js [non-relative-module-name-resolution-cache non-relative-name mode]
   (.getOrCreateCacheForNonRelativeName ^js non-relative-module-name-resolution-cache non-relative-name mode))
  (^js [non-relative-module-name-resolution-cache non-relative-name mode redirected-reference]
   (.getOrCreateCacheForNonRelativeName ^js non-relative-module-name-resolution-cache non-relative-name mode redirected-reference)))

(defn clear
  ^js [non-relative-module-name-resolution-cache]
  (.clear ^js non-relative-module-name-resolution-cache))

(defn update
  "Updates with the current compilerOptions the cache will operate with.
   This updates the redirects map as well if needed so module resolutions are cached if they can across the projects"
  ^js [non-relative-module-name-resolution-cache options]
  (.update ^js non-relative-module-name-resolution-cache options))
