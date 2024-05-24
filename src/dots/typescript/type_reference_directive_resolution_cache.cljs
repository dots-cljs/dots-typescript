(ns dots.typescript.type-reference-directive-resolution-cache
  (:refer-clojure :exclude [update]))

(defn from-directory-cache
  "**Parameters:**
   - `name`: `string`
   - `mode`: `ResolutionMode`
   - `directory-name`: `string`
   - `redirected-reference`: `ResolvedProjectReference | undefined`
   
   **Returns:** `ResolvedTypeReferenceDirectiveWithFailedLookupLocations | undefined`"
  (^js [type-reference-directive-resolution-cache name]
   (.getFromDirectoryCache ^js type-reference-directive-resolution-cache name))
  (^js [type-reference-directive-resolution-cache name mode]
   (.getFromDirectoryCache ^js type-reference-directive-resolution-cache name mode))
  (^js [type-reference-directive-resolution-cache name mode directory-name]
   (.getFromDirectoryCache ^js type-reference-directive-resolution-cache name mode directory-name))
  (^js [type-reference-directive-resolution-cache name mode directory-name redirected-reference]
   (.getFromDirectoryCache ^js type-reference-directive-resolution-cache name mode directory-name redirected-reference)))

(defn or-create-cache-for-directory
  "**Parameters:**
   - `directory-name`: `string`
   - `redirected-reference`: `ResolvedProjectReference | undefined`
   
   **Returns:** `ModeAwareCache<ResolvedTypeReferenceDirectiveWithFailedLookupLocations>`"
  (^js [type-reference-directive-resolution-cache directory-name]
   (.getOrCreateCacheForDirectory ^js type-reference-directive-resolution-cache directory-name))
  (^js [type-reference-directive-resolution-cache directory-name redirected-reference]
   (.getOrCreateCacheForDirectory ^js type-reference-directive-resolution-cache directory-name redirected-reference)))

(defn clear
  "**Returns:** `void`"
  ^js [type-reference-directive-resolution-cache]
  (.clear ^js type-reference-directive-resolution-cache))

(defn update
  "Updates with the current compilerOptions the cache will operate with.
   This updates the redirects map as well if needed so module resolutions are cached if they can across the projects
   
   **Parameters:**
   - `options`: `CompilerOptions`
   
   **Returns:** `void`"
  ^js [type-reference-directive-resolution-cache options]
  (.update ^js type-reference-directive-resolution-cache options))

(defn from-non-relative-name-cache
  "**Parameters:**
   - `non-relative-name`: `string`
   - `mode`: `ResolutionMode`
   - `directory-name`: `string`
   - `redirected-reference`: `ResolvedProjectReference | undefined`
   
   **Returns:** `ResolvedTypeReferenceDirectiveWithFailedLookupLocations | undefined`"
  (^js [type-reference-directive-resolution-cache non-relative-name]
   (.getFromNonRelativeNameCache ^js type-reference-directive-resolution-cache non-relative-name))
  (^js [type-reference-directive-resolution-cache non-relative-name mode]
   (.getFromNonRelativeNameCache ^js type-reference-directive-resolution-cache non-relative-name mode))
  (^js [type-reference-directive-resolution-cache non-relative-name mode directory-name]
   (.getFromNonRelativeNameCache ^js type-reference-directive-resolution-cache non-relative-name mode directory-name))
  (^js [type-reference-directive-resolution-cache non-relative-name mode directory-name redirected-reference]
   (.getFromNonRelativeNameCache ^js type-reference-directive-resolution-cache non-relative-name mode directory-name redirected-reference)))

(defn or-create-cache-for-non-relative-name
  "**Parameters:**
   - `non-relative-name`: `string`
   - `mode`: `ResolutionMode`
   - `redirected-reference`: `ResolvedProjectReference | undefined`
   
   **Returns:** `PerNonRelativeNameCache<ResolvedTypeReferenceDirectiveWithFailedLookupLocations>`"
  (^js [type-reference-directive-resolution-cache non-relative-name]
   (.getOrCreateCacheForNonRelativeName ^js type-reference-directive-resolution-cache non-relative-name))
  (^js [type-reference-directive-resolution-cache non-relative-name mode]
   (.getOrCreateCacheForNonRelativeName ^js type-reference-directive-resolution-cache non-relative-name mode))
  (^js [type-reference-directive-resolution-cache non-relative-name mode redirected-reference]
   (.getOrCreateCacheForNonRelativeName ^js type-reference-directive-resolution-cache non-relative-name mode redirected-reference)))
