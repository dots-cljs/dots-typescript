(ns dots.typescript.server.typings-installer.log)

(defn enabled?
  "**Returns:** `boolean`"
  ^js [log]
  (.isEnabled ^js log))

(defn write-line
  "**Parameters:**
   - `text`: `string`
   
   **Returns:** `void`"
  ^js [log text]
  (.writeLine ^js log text))
