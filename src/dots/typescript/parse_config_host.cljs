(ns dots.typescript.parse-config-host)

(defn use-case-sensitive-file-names?
  "**Returns:** `boolean`"
  ^js [parse-config-host]
  (.-useCaseSensitiveFileNames ^js parse-config-host))

(defn set-use-case-sensitive-file-names!
  ^js [parse-config-host value]
  (set! (.-useCaseSensitiveFileNames ^js parse-config-host) value))

(defn read-directory
  "**Parameters:**
   - `root-dir`: `string`
   - `extensions`: `readonly string[]`
   - `excludes`: `readonly string[] | undefined`
   - `includes`: `readonly string[]`
   - `depth`: `number | undefined`
   
   **Returns:** `readonly string[]`"
  (^js [parse-config-host root-dir extensions]
   (.readDirectory ^js parse-config-host root-dir extensions))
  (^js [parse-config-host root-dir extensions excludes]
   (.readDirectory ^js parse-config-host root-dir extensions excludes))
  (^js [parse-config-host root-dir extensions excludes includes]
   (.readDirectory ^js parse-config-host root-dir extensions excludes includes))
  (^js [parse-config-host root-dir extensions excludes includes depth]
   (.readDirectory ^js parse-config-host root-dir extensions excludes includes depth)))

(defn file-exists?
  "Gets a value indicating whether the specified path exists and is a file.
   
   **Parameters:**
   - `path`: `string` - The path to test.
   
   **Returns:** `boolean`"
  ^js [parse-config-host path]
  (.fileExists ^js parse-config-host path))

(defn read-file
  "**Parameters:**
   - `path`: `string`
   
   **Returns:** `string | undefined`"
  ^js [parse-config-host path]
  (.readFile ^js parse-config-host path))

(defn trace
  "**Parameters:**
   - `s`: `string`
   
   **Returns:** `void`"
  ^js [parse-config-host s]
  (.trace ^js parse-config-host s))

(defn directory-exists?
  "**Parameters:**
   - `directory-name`: `string`
   
   **Returns:** `boolean`"
  ^js [parse-config-host directory-name]
  (.directoryExists ^js parse-config-host directory-name))

(defn realpath
  "Resolve a symbolic link.
   
   **Parameters:**
   - `path`: `string`
   
   **Returns:** `string`"
  ^js [parse-config-host path]
  (.realpath ^js parse-config-host path))

(defn current-directory
  "**Returns:** `string`"
  ^js [parse-config-host]
  (.getCurrentDirectory ^js parse-config-host))

(defn directories
  "**Parameters:**
   - `path`: `string`
   
   **Returns:** `string[]`"
  ^js [parse-config-host path]
  (.getDirectories ^js parse-config-host path))
