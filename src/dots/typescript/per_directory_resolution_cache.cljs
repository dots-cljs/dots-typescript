(ns dots.typescript.per-directory-resolution-cache
  "Cached resolutions per containing directory.
   This assumes that any module id will have the same resolution for sibling files located in the same folder."
  (:refer-clojure :exclude [update]))

(defn from-directory-cache
  "**Parameters:**
   - `name`: `string`
   - `mode`: `ResolutionMode`
   - `directory-name`: `string`
   - `redirected-reference`: `ResolvedProjectReference | undefined`
   
   **Returns:** `T | undefined`"
  (^js [per-directory-resolution-cache name]
   (.getFromDirectoryCache ^js per-directory-resolution-cache name))
  (^js [per-directory-resolution-cache name mode]
   (.getFromDirectoryCache ^js per-directory-resolution-cache name mode))
  (^js [per-directory-resolution-cache name mode directory-name]
   (.getFromDirectoryCache ^js per-directory-resolution-cache name mode directory-name))
  (^js [per-directory-resolution-cache name mode directory-name redirected-reference]
   (.getFromDirectoryCache ^js per-directory-resolution-cache name mode directory-name redirected-reference)))

(defn or-create-cache-for-directory
  "**Parameters:**
   - `directory-name`: `string`
   - `redirected-reference`: `ResolvedProjectReference | undefined`
   
   **Returns:** `ModeAwareCache<T>`"
  (^js [per-directory-resolution-cache directory-name]
   (.getOrCreateCacheForDirectory ^js per-directory-resolution-cache directory-name))
  (^js [per-directory-resolution-cache directory-name redirected-reference]
   (.getOrCreateCacheForDirectory ^js per-directory-resolution-cache directory-name redirected-reference)))

(defn clear
  "**Returns:** `void`"
  ^js [per-directory-resolution-cache]
  (.clear ^js per-directory-resolution-cache))

(defn update
  "Updates with the current compilerOptions the cache will operate with.
   This updates the redirects map as well if needed so module resolutions are cached if they can across the projects
   
   **Parameters:**
   - `options`: `CompilerOptions`
   
   **Returns:** `void`"
  ^js [per-directory-resolution-cache options]
  (.update ^js per-directory-resolution-cache options))
