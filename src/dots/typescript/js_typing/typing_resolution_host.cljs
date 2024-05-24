(ns dots.typescript.js-typing.typing-resolution-host)

(defn directory-exists?
  "**Parameters:**
   - `path`: `string`
   
   **Returns:** `boolean`"
  ^js [typing-resolution-host path]
  (.directoryExists ^js typing-resolution-host path))

(defn file-exists?
  "**Parameters:**
   - `file-name`: `string`
   
   **Returns:** `boolean`"
  ^js [typing-resolution-host file-name]
  (.fileExists ^js typing-resolution-host file-name))

(defn read-file
  "**Parameters:**
   - `path`: `string`
   - `encoding`: `string | undefined`
   
   **Returns:** `string | undefined`"
  (^js [typing-resolution-host path]
   (.readFile ^js typing-resolution-host path))
  (^js [typing-resolution-host path encoding]
   (.readFile ^js typing-resolution-host path encoding)))

(defn read-directory
  "**Parameters:**
   - `root-dir`: `string`
   - `extensions`: `readonly string[]`
   - `excludes`: `readonly string[] | undefined`
   - `includes`: `readonly string[] | undefined`
   - `depth`: `number | undefined`
   
   **Returns:** `string[]`"
  (^js [typing-resolution-host root-dir extensions]
   (.readDirectory ^js typing-resolution-host root-dir extensions))
  (^js [typing-resolution-host root-dir extensions excludes]
   (.readDirectory ^js typing-resolution-host root-dir extensions excludes))
  (^js [typing-resolution-host root-dir extensions excludes includes]
   (.readDirectory ^js typing-resolution-host root-dir extensions excludes includes))
  (^js [typing-resolution-host root-dir extensions excludes includes depth]
   (.readDirectory ^js typing-resolution-host root-dir extensions excludes includes depth)))
