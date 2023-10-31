(ns dots.typescript.type-reference-directive-resolution-cache
  (:refer-clojure :exclude [update]))

(defn from-directory-cache
  (^js [type-reference-directive-resolution-cache name]
   (.getFromDirectoryCache ^js type-reference-directive-resolution-cache name))
  (^js [type-reference-directive-resolution-cache name mode]
   (.getFromDirectoryCache ^js type-reference-directive-resolution-cache name mode))
  (^js [type-reference-directive-resolution-cache name mode directory-name]
   (.getFromDirectoryCache ^js type-reference-directive-resolution-cache name mode directory-name))
  (^js [type-reference-directive-resolution-cache name mode directory-name redirected-reference]
   (.getFromDirectoryCache ^js type-reference-directive-resolution-cache name mode directory-name redirected-reference)))

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

(defn from-non-relative-name-cache
  (^js [type-reference-directive-resolution-cache non-relative-name]
   (.getFromNonRelativeNameCache ^js type-reference-directive-resolution-cache non-relative-name))
  (^js [type-reference-directive-resolution-cache non-relative-name mode]
   (.getFromNonRelativeNameCache ^js type-reference-directive-resolution-cache non-relative-name mode))
  (^js [type-reference-directive-resolution-cache non-relative-name mode directory-name]
   (.getFromNonRelativeNameCache ^js type-reference-directive-resolution-cache non-relative-name mode directory-name))
  (^js [type-reference-directive-resolution-cache non-relative-name mode directory-name redirected-reference]
   (.getFromNonRelativeNameCache ^js type-reference-directive-resolution-cache non-relative-name mode directory-name redirected-reference)))

(defn or-create-cache-for-non-relative-name
  (^js [type-reference-directive-resolution-cache non-relative-name]
   (.getOrCreateCacheForNonRelativeName ^js type-reference-directive-resolution-cache non-relative-name))
  (^js [type-reference-directive-resolution-cache non-relative-name mode]
   (.getOrCreateCacheForNonRelativeName ^js type-reference-directive-resolution-cache non-relative-name mode))
  (^js [type-reference-directive-resolution-cache non-relative-name mode redirected-reference]
   (.getOrCreateCacheForNonRelativeName ^js type-reference-directive-resolution-cache non-relative-name mode redirected-reference)))
