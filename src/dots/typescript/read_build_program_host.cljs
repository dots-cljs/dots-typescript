(ns dots.typescript.read-build-program-host)

(defn use-case-sensitive-file-names?
  "**Returns:** `boolean`"
  ^js [read-build-program-host]
  (.useCaseSensitiveFileNames ^js read-build-program-host))

(defn current-directory
  "**Returns:** `string`"
  ^js [read-build-program-host]
  (.getCurrentDirectory ^js read-build-program-host))

(defn read-file
  "**Parameters:**
   - `file-name`: `string`
   
   **Returns:** `string | undefined`"
  ^js [read-build-program-host file-name]
  (.readFile ^js read-build-program-host file-name))
