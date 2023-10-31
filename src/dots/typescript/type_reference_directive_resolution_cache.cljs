(ns dots.typescript.type-reference-directive-resolution-cache
  (:refer-clojure :exclude [update]))

(defn or-create-cache-for-directory
  (^js [type-reference-directive-resolution-cache directory-name]
   (.getOrCreateCacheForDirectory ^js type-reference-directive-resolution-cache directory-name))
  (^js [type-reference-directive-resolution-cache directory-name redirected-reference]
   (.getOrCreateCacheForDirectory ^js type-reference-directive-resolution-cache directory-name redirected-reference)))

(defn clear
  ^js [type-reference-directive-resolution-cache]
  (.clear ^js type-reference-directive-resolution-cache))

(defn update
  "Updates with the current compilerOptions the cache will operate with.
   This updates the redirects map as well if needed so module resolutions are cached if they can across the projects"
  ^js [type-reference-directive-resolution-cache options]
  (.update ^js type-reference-directive-resolution-cache options))
