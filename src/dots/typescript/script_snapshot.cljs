(ns dots.typescript.script-snapshot
  (:require ["typescript" :as typescript]))

(defn from-string
  "**Parameters:**
   - `text`: `string`
   
   **Returns:** `IScriptSnapshot`"
  ^js [text]
  (.fromString typescript/ScriptSnapshot text))
