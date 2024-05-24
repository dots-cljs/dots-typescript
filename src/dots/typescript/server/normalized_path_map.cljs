(ns dots.typescript.server.normalized-path-map
  (:refer-clojure :exclude [contains? get remove set]))

(defn get
  "**Parameters:**
   - `path`: `NormalizedPath`
   
   **Returns:** `T | undefined`"
  ^js [normalized-path-map path]
  (.get ^js normalized-path-map path))

(defn set
  "**Parameters:**
   - `path`: `NormalizedPath`
   - `value`: `T`
   
   **Returns:** `void`"
  ^js [normalized-path-map path value]
  (.set ^js normalized-path-map path value))

(defn contains?
  "**Parameters:**
   - `path`: `NormalizedPath`
   
   **Returns:** `boolean`"
  ^js [normalized-path-map path]
  (.contains ^js normalized-path-map path))

(defn remove
  "**Parameters:**
   - `path`: `NormalizedPath`
   
   **Returns:** `void`"
  ^js [normalized-path-map path]
  (.remove ^js normalized-path-map path))
