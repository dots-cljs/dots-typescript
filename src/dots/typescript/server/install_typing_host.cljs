(ns dots.typescript.server.install-typing-host)

(defn use-case-sensitive-file-names?
  ^js [install-typing-host]
  (.-useCaseSensitiveFileNames ^js install-typing-host))

(defn set-use-case-sensitive-file-names!
  ^js [install-typing-host value]
  (set! (.-useCaseSensitiveFileNames ^js install-typing-host) value))

(defn write-file
  "**Parameters:**
   - `path`: `string`
   - `content`: `string`
   
   **Returns:** `void`"
  ^js [install-typing-host path content]
  (.writeFile ^js install-typing-host path content))

(defn create-directory
  "**Parameters:**
   - `path`: `string`
   
   **Returns:** `void`"
  ^js [install-typing-host path]
  (.createDirectory ^js install-typing-host path))

(defn current-directory
  "**Returns:** `string`"
  ^js [install-typing-host]
  (.getCurrentDirectory ^js install-typing-host))

(defn directory-exists?
  "**Parameters:**
   - `path`: `string`
   
   **Returns:** `boolean`"
  ^js [install-typing-host path]
  (.directoryExists ^js install-typing-host path))

(defn file-exists?
  "**Parameters:**
   - `file-name`: `string`
   
   **Returns:** `boolean`"
  ^js [install-typing-host file-name]
  (.fileExists ^js install-typing-host file-name))

(defn read-file
  "**Parameters:**
   - `path`: `string`
   - `encoding`: `string | undefined`
   
   **Returns:** `string | undefined`"
  (^js [install-typing-host path]
   (.readFile ^js install-typing-host path))
  (^js [install-typing-host path encoding]
   (.readFile ^js install-typing-host path encoding)))

(defn read-directory
  "**Parameters:**
   - `root-dir`: `string`
   - `extensions`: `readonly string[]`
   - `excludes`: `readonly string[] | undefined`
   - `includes`: `readonly string[] | undefined`
   - `depth`: `number | undefined`
   
   **Returns:** `string[]`"
  (^js [install-typing-host root-dir extensions]
   (.readDirectory ^js install-typing-host root-dir extensions))
  (^js [install-typing-host root-dir extensions excludes]
   (.readDirectory ^js install-typing-host root-dir extensions excludes))
  (^js [install-typing-host root-dir extensions excludes includes]
   (.readDirectory ^js install-typing-host root-dir extensions excludes includes))
  (^js [install-typing-host root-dir extensions excludes includes depth]
   (.readDirectory ^js install-typing-host root-dir extensions excludes includes depth)))
