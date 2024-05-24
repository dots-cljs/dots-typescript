(ns dots.typescript.incomplete-completions-cache
  (:refer-clojure :exclude [get set]))

(defn get
  "**Returns:** `CompletionInfo | undefined`"
  ^js [incomplete-completions-cache]
  (.get ^js incomplete-completions-cache))

(defn set
  "**Parameters:**
   - `response`: `CompletionInfo`
   
   **Returns:** `void`"
  ^js [incomplete-completions-cache response]
  (.set ^js incomplete-completions-cache response))

(defn clear
  "**Returns:** `void`"
  ^js [incomplete-completions-cache]
  (.clear ^js incomplete-completions-cache))
