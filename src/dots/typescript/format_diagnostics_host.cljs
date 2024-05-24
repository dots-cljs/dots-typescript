(ns dots.typescript.format-diagnostics-host)

(defn current-directory
  "**Returns:** `string`"
  ^js [format-diagnostics-host]
  (.getCurrentDirectory ^js format-diagnostics-host))

(defn canonical-file-name
  "**Parameters:**
   - `file-name`: `string`
   
   **Returns:** `string`"
  ^js [format-diagnostics-host file-name]
  (.getCanonicalFileName ^js format-diagnostics-host file-name))

(defn new-line
  "**Returns:** `string`"
  ^js [format-diagnostics-host]
  (.getNewLine ^js format-diagnostics-host))
