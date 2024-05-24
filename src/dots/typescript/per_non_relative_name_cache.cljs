(ns dots.typescript.per-non-relative-name-cache
  (:refer-clojure :exclude [get set]))

(defn get
  "**Parameters:**
   - `directory`: `string`
   
   **Returns:** `T | undefined`"
  ^js [per-non-relative-name-cache directory]
  (.get ^js per-non-relative-name-cache directory))

(defn set
  "**Parameters:**
   - `directory`: `string`
   - `result`: `T`
   
   **Returns:** `void`"
  ^js [per-non-relative-name-cache directory result]
  (.set ^js per-non-relative-name-cache directory result))
