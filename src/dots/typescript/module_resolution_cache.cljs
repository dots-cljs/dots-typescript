(ns dots.typescript.module-resolution-cache
  (:refer-clojure :exclude [update]))

(defn package-json-info-cache
  ^js [module-resolution-cache]
  (.getPackageJsonInfoCache ^js module-resolution-cache))

(defn or-create-cache-for-directory
  (^js [module-resolution-cache directory-name]
   (.getOrCreateCacheForDirectory ^js module-resolution-cache directory-name))
  (^js [module-resolution-cache directory-name redirected-reference]
   (.getOrCreateCacheForDirectory ^js module-resolution-cache directory-name redirected-reference)))

(defn clear
  ^js [module-resolution-cache]
  (.clear ^js module-resolution-cache))

(defn update
  "Updates with the current compilerOptions the cache will operate with.
   This updates the redirects map as well if needed so module resolutions are cached if they can across the projects"
  ^js [module-resolution-cache options]
  (.update ^js module-resolution-cache options))

(defn or-create-cache-for-module-name
  (^js [module-resolution-cache non-relative-module-name]
   (.getOrCreateCacheForModuleName ^js module-resolution-cache non-relative-module-name))
  (^js [module-resolution-cache non-relative-module-name mode]
   (.getOrCreateCacheForModuleName ^js module-resolution-cache non-relative-module-name mode))
  (^js [module-resolution-cache non-relative-module-name mode redirected-reference]
   (.getOrCreateCacheForModuleName ^js module-resolution-cache non-relative-module-name mode redirected-reference)))
