(ns dots.typescript.mode-aware-cache
  (:refer-clojure :exclude [get set]))

(defn get
  "**Parameters:**
   - `key`: `string`
   - `mode`: `ResolutionMode`
   
   **Returns:** `T | undefined`"
  (^js [mode-aware-cache key]
   (.get ^js mode-aware-cache key))
  (^js [mode-aware-cache key mode]
   (.get ^js mode-aware-cache key mode)))

(defn set
  "**Parameters:**
   - `key`: `string`
   - `mode`: `ResolutionMode`
   - `value`: `T`
   
   **Returns:** `ModeAwareCache<T>`"
  (^js [mode-aware-cache key]
   (.set ^js mode-aware-cache key))
  (^js [mode-aware-cache key mode]
   (.set ^js mode-aware-cache key mode))
  (^js [mode-aware-cache key mode value]
   (.set ^js mode-aware-cache key mode value)))

(defn delete
  "**Parameters:**
   - `key`: `string`
   - `mode`: `ResolutionMode`
   
   **Returns:** `ModeAwareCache<T>`"
  (^js [mode-aware-cache key]
   (.delete ^js mode-aware-cache key))
  (^js [mode-aware-cache key mode]
   (.delete ^js mode-aware-cache key mode)))

(defn has?
  "**Parameters:**
   - `key`: `string`
   - `mode`: `ResolutionMode`
   
   **Returns:** `boolean`"
  (^js [mode-aware-cache key]
   (.has ^js mode-aware-cache key))
  (^js [mode-aware-cache key mode]
   (.has ^js mode-aware-cache key mode)))

(defn for-each
  "**Parameters:**
   - `cb`: `(elem: T, key: string, mode: ResolutionMode) => void`
   
   **Returns:** `void`"
  ^js [mode-aware-cache cb]
  (.forEach ^js mode-aware-cache cb))

(defn size
  "**Returns:** `number`"
  ^js [mode-aware-cache]
  (.size ^js mode-aware-cache))
