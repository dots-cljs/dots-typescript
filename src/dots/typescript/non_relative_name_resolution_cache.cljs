(ns dots.typescript.non-relative-name-resolution-cache
  (:refer-clojure :exclude [update]))

(defn from-non-relative-name-cache
  (^js [non-relative-name-resolution-cache non-relative-name]
   (.getFromNonRelativeNameCache ^js non-relative-name-resolution-cache non-relative-name))
  (^js [non-relative-name-resolution-cache non-relative-name mode]
   (.getFromNonRelativeNameCache ^js non-relative-name-resolution-cache non-relative-name mode))
  (^js [non-relative-name-resolution-cache non-relative-name mode directory-name]
   (.getFromNonRelativeNameCache ^js non-relative-name-resolution-cache non-relative-name mode directory-name))
  (^js [non-relative-name-resolution-cache non-relative-name mode directory-name redirected-reference]
   (.getFromNonRelativeNameCache ^js non-relative-name-resolution-cache non-relative-name mode directory-name redirected-reference)))

(defn or-create-cache-for-non-relative-name
  (^js [non-relative-name-resolution-cache non-relative-name]
   (.getOrCreateCacheForNonRelativeName ^js non-relative-name-resolution-cache non-relative-name))
  (^js [non-relative-name-resolution-cache non-relative-name mode]
   (.getOrCreateCacheForNonRelativeName ^js non-relative-name-resolution-cache non-relative-name mode))
  (^js [non-relative-name-resolution-cache non-relative-name mode redirected-reference]
   (.getOrCreateCacheForNonRelativeName ^js non-relative-name-resolution-cache non-relative-name mode redirected-reference)))

(defn clear
  ^js [non-relative-name-resolution-cache]
  (.clear ^js non-relative-name-resolution-cache))

(defn update
  "Updates with the current compilerOptions the cache will operate with.
   This updates the redirects map as well if needed so module resolutions are cached if they can across the projects"
  ^js [non-relative-name-resolution-cache options]
  (.update ^js non-relative-name-resolution-cache options))
