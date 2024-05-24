(ns dots.typescript.module-resolution-cache
  (:refer-clojure :exclude [update]))

(defn package-json-info-cache
  "**Returns:** `PackageJsonInfoCache`"
  ^js [module-resolution-cache]
  (.getPackageJsonInfoCache ^js module-resolution-cache))

(defn from-directory-cache
  "**Parameters:**
   - `name`: `string`
   - `mode`: `ResolutionMode`
   - `directory-name`: `string`
   - `redirected-reference`: `ResolvedProjectReference | undefined`
   
   **Returns:** `ResolvedModuleWithFailedLookupLocations | undefined`"
  (^js [module-resolution-cache name]
   (.getFromDirectoryCache ^js module-resolution-cache name))
  (^js [module-resolution-cache name mode]
   (.getFromDirectoryCache ^js module-resolution-cache name mode))
  (^js [module-resolution-cache name mode directory-name]
   (.getFromDirectoryCache ^js module-resolution-cache name mode directory-name))
  (^js [module-resolution-cache name mode directory-name redirected-reference]
   (.getFromDirectoryCache ^js module-resolution-cache name mode directory-name redirected-reference)))

(defn or-create-cache-for-directory
  "**Parameters:**
   - `directory-name`: `string`
   - `redirected-reference`: `ResolvedProjectReference | undefined`
   
   **Returns:** `ModeAwareCache<ResolvedModuleWithFailedLookupLocations>`"
  (^js [module-resolution-cache directory-name]
   (.getOrCreateCacheForDirectory ^js module-resolution-cache directory-name))
  (^js [module-resolution-cache directory-name redirected-reference]
   (.getOrCreateCacheForDirectory ^js module-resolution-cache directory-name redirected-reference)))

(defn clear
  "**Returns:** `void`"
  ^js [module-resolution-cache]
  (.clear ^js module-resolution-cache))

(defn update
  "Updates with the current compilerOptions the cache will operate with.
   This updates the redirects map as well if needed so module resolutions are cached if they can across the projects
   
   **Parameters:**
   - `options`: `CompilerOptions`
   
   **Returns:** `void`"
  ^js [module-resolution-cache options]
  (.update ^js module-resolution-cache options))

(defn or-create-cache-for-module-name
  "**Parameters:**
   - `non-relative-module-name`: `string`
   - `mode`: `ResolutionMode`
   - `redirected-reference`: `ResolvedProjectReference | undefined`
   
   **Returns:** `PerModuleNameCache`"
  (^js [module-resolution-cache non-relative-module-name]
   (.getOrCreateCacheForModuleName ^js module-resolution-cache non-relative-module-name))
  (^js [module-resolution-cache non-relative-module-name mode]
   (.getOrCreateCacheForModuleName ^js module-resolution-cache non-relative-module-name mode))
  (^js [module-resolution-cache non-relative-module-name mode redirected-reference]
   (.getOrCreateCacheForModuleName ^js module-resolution-cache non-relative-module-name mode redirected-reference)))

(defn from-non-relative-name-cache
  "**Parameters:**
   - `non-relative-name`: `string`
   - `mode`: `ResolutionMode`
   - `directory-name`: `string`
   - `redirected-reference`: `ResolvedProjectReference | undefined`
   
   **Returns:** `ResolvedModuleWithFailedLookupLocations | undefined`"
  (^js [module-resolution-cache non-relative-name]
   (.getFromNonRelativeNameCache ^js module-resolution-cache non-relative-name))
  (^js [module-resolution-cache non-relative-name mode]
   (.getFromNonRelativeNameCache ^js module-resolution-cache non-relative-name mode))
  (^js [module-resolution-cache non-relative-name mode directory-name]
   (.getFromNonRelativeNameCache ^js module-resolution-cache non-relative-name mode directory-name))
  (^js [module-resolution-cache non-relative-name mode directory-name redirected-reference]
   (.getFromNonRelativeNameCache ^js module-resolution-cache non-relative-name mode directory-name redirected-reference)))

(defn or-create-cache-for-non-relative-name
  "**Parameters:**
   - `non-relative-name`: `string`
   - `mode`: `ResolutionMode`
   - `redirected-reference`: `ResolvedProjectReference | undefined`
   
   **Returns:** `PerNonRelativeNameCache<ResolvedModuleWithFailedLookupLocations>`"
  (^js [module-resolution-cache non-relative-name]
   (.getOrCreateCacheForNonRelativeName ^js module-resolution-cache non-relative-name))
  (^js [module-resolution-cache non-relative-name mode]
   (.getOrCreateCacheForNonRelativeName ^js module-resolution-cache non-relative-name mode))
  (^js [module-resolution-cache non-relative-name mode redirected-reference]
   (.getOrCreateCacheForNonRelativeName ^js module-resolution-cache non-relative-name mode redirected-reference)))
