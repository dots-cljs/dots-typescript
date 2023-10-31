(ns dots.typescript.module-resolution-cache
  (:refer-clojure :exclude [update]))

(defn package-json-info-cache
  ^js [module-resolution-cache]
  (.getPackageJsonInfoCache ^js module-resolution-cache))

(defn from-directory-cache
  (^js [module-resolution-cache name]
   (.getFromDirectoryCache ^js module-resolution-cache name))
  (^js [module-resolution-cache name mode]
   (.getFromDirectoryCache ^js module-resolution-cache name mode))
  (^js [module-resolution-cache name mode directory-name]
   (.getFromDirectoryCache ^js module-resolution-cache name mode directory-name))
  (^js [module-resolution-cache name mode directory-name redirected-reference]
   (.getFromDirectoryCache ^js module-resolution-cache name mode directory-name redirected-reference)))

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

(defn from-non-relative-name-cache
  (^js [module-resolution-cache non-relative-name]
   (.getFromNonRelativeNameCache ^js module-resolution-cache non-relative-name))
  (^js [module-resolution-cache non-relative-name mode]
   (.getFromNonRelativeNameCache ^js module-resolution-cache non-relative-name mode))
  (^js [module-resolution-cache non-relative-name mode directory-name]
   (.getFromNonRelativeNameCache ^js module-resolution-cache non-relative-name mode directory-name))
  (^js [module-resolution-cache non-relative-name mode directory-name redirected-reference]
   (.getFromNonRelativeNameCache ^js module-resolution-cache non-relative-name mode directory-name redirected-reference)))

(defn or-create-cache-for-non-relative-name
  (^js [module-resolution-cache non-relative-name]
   (.getOrCreateCacheForNonRelativeName ^js module-resolution-cache non-relative-name))
  (^js [module-resolution-cache non-relative-name mode]
   (.getOrCreateCacheForNonRelativeName ^js module-resolution-cache non-relative-name mode))
  (^js [module-resolution-cache non-relative-name mode redirected-reference]
   (.getOrCreateCacheForNonRelativeName ^js module-resolution-cache non-relative-name mode redirected-reference)))
