(ns dots.typescript.server.server-host
  (:refer-clojure :exclude [require]))

(defn watch-file
  "**Parameters:**
   - `path`: `string`
   - `callback`: `FileWatcherCallback`
   - `polling-interval`: `number | undefined`
   - `options`: `WatchOptions | undefined`
   
   **Returns:** `FileWatcher`"
  (^js [server-host path callback]
   (.watchFile ^js server-host path callback))
  (^js [server-host path callback polling-interval]
   (.watchFile ^js server-host path callback polling-interval))
  (^js [server-host path callback polling-interval options]
   (.watchFile ^js server-host path callback polling-interval options)))

(defn watch-directory
  "**Parameters:**
   - `path`: `string`
   - `callback`: `DirectoryWatcherCallback`
   - `recursive?`: `boolean | undefined`
   - `options`: `WatchOptions | undefined`
   
   **Returns:** `FileWatcher`"
  (^js [server-host path callback]
   (.watchDirectory ^js server-host path callback))
  (^js [server-host path callback recursive?]
   (.watchDirectory ^js server-host path callback recursive?))
  (^js [server-host path callback recursive? options]
   (.watchDirectory ^js server-host path callback recursive? options)))

(defn set-timeout
  "**Parameters:**
   - `callback`: `(...args: any[]) => void`
   - `ms`: `number`
   - `args`: `any[]`
   
   **Returns:** `any`"
  ^js [server-host callback ms & args]
  (.. ^js server-host -setTimeout (apply ^js server-host (to-array (list* callback ms args)))))

(defn clear-timeout
  "**Parameters:**
   - `timeout-id`: `any`
   
   **Returns:** `void`"
  ^js [server-host timeout-id]
  (.clearTimeout ^js server-host timeout-id))

(defn set-immediate
  "**Parameters:**
   - `callback`: `(...args: any[]) => void`
   - `args`: `any[]`
   
   **Returns:** `any`"
  ^js [server-host callback & args]
  (.. ^js server-host -setImmediate (apply ^js server-host (to-array (cons callback args)))))

(defn clear-immediate
  "**Parameters:**
   - `timeout-id`: `any`
   
   **Returns:** `void`"
  ^js [server-host timeout-id]
  (.clearImmediate ^js server-host timeout-id))

(defn gc
  "**Returns:** `void`"
  ^js [server-host]
  (.gc ^js server-host))

(defn trace
  "**Parameters:**
   - `s`: `string`
   
   **Returns:** `void`"
  ^js [server-host s]
  (.trace ^js server-host s))

(defn require
  "**Parameters:**
   - `initial-path`: `string`
   - `module-name`: `string`
   
   **Returns:** `ModuleImportResult`"
  ^js [server-host initial-path module-name]
  (.require ^js server-host initial-path module-name))

(defn args
  ^js [server-host]
  (.-args ^js server-host))

(defn set-args!
  ^js [server-host value]
  (set! (.-args ^js server-host) value))

(defn new-line
  ^js [server-host]
  (.-newLine ^js server-host))

(defn set-new-line!
  ^js [server-host value]
  (set! (.-newLine ^js server-host) value))

(defn use-case-sensitive-file-names?
  ^js [server-host]
  (.-useCaseSensitiveFileNames ^js server-host))

(defn set-use-case-sensitive-file-names!
  ^js [server-host value]
  (set! (.-useCaseSensitiveFileNames ^js server-host) value))

(defn write
  "**Parameters:**
   - `s`: `string`
   
   **Returns:** `void`"
  ^js [server-host s]
  (.write ^js server-host s))

(defn write-output-is-tty?
  "**Returns:** `boolean`"
  ^js [server-host]
  (.writeOutputIsTTY ^js server-host))

(defn width-of-terminal
  "**Returns:** `number`"
  ^js [server-host]
  (.getWidthOfTerminal ^js server-host))

(defn read-file
  "**Parameters:**
   - `path`: `string`
   - `encoding`: `string | undefined`
   
   **Returns:** `string | undefined`"
  (^js [server-host path]
   (.readFile ^js server-host path))
  (^js [server-host path encoding]
   (.readFile ^js server-host path encoding)))

(defn file-size
  "**Parameters:**
   - `path`: `string`
   
   **Returns:** `number`"
  ^js [server-host path]
  (.getFileSize ^js server-host path))

(defn write-file
  "**Parameters:**
   - `path`: `string`
   - `data`: `string`
   - `write-byte-order-mark?`: `boolean | undefined`
   
   **Returns:** `void`"
  (^js [server-host path data]
   (.writeFile ^js server-host path data))
  (^js [server-host path data write-byte-order-mark?]
   (.writeFile ^js server-host path data write-byte-order-mark?)))

(defn resolve-path
  "**Parameters:**
   - `path`: `string`
   
   **Returns:** `string`"
  ^js [server-host path]
  (.resolvePath ^js server-host path))

(defn file-exists?
  "**Parameters:**
   - `path`: `string`
   
   **Returns:** `boolean`"
  ^js [server-host path]
  (.fileExists ^js server-host path))

(defn directory-exists?
  "**Parameters:**
   - `path`: `string`
   
   **Returns:** `boolean`"
  ^js [server-host path]
  (.directoryExists ^js server-host path))

(defn create-directory
  "**Parameters:**
   - `path`: `string`
   
   **Returns:** `void`"
  ^js [server-host path]
  (.createDirectory ^js server-host path))

(defn executing-file-path
  "**Returns:** `string`"
  ^js [server-host]
  (.getExecutingFilePath ^js server-host))

(defn current-directory
  "**Returns:** `string`"
  ^js [server-host]
  (.getCurrentDirectory ^js server-host))

(defn directories
  "**Parameters:**
   - `path`: `string`
   
   **Returns:** `string[]`"
  ^js [server-host path]
  (.getDirectories ^js server-host path))

(defn read-directory
  "**Parameters:**
   - `path`: `string`
   - `extensions`: `readonly string[] | undefined`
   - `exclude`: `readonly string[] | undefined`
   - `include`: `readonly string[] | undefined`
   - `depth`: `number | undefined`
   
   **Returns:** `string[]`"
  (^js [server-host path]
   (.readDirectory ^js server-host path))
  (^js [server-host path extensions]
   (.readDirectory ^js server-host path extensions))
  (^js [server-host path extensions exclude]
   (.readDirectory ^js server-host path extensions exclude))
  (^js [server-host path extensions exclude include]
   (.readDirectory ^js server-host path extensions exclude include))
  (^js [server-host path extensions exclude include depth]
   (.readDirectory ^js server-host path extensions exclude include depth)))

(defn modified-time
  "**Parameters:**
   - `path`: `string`
   
   **Returns:** `Date | undefined`"
  ^js [server-host path]
  (.getModifiedTime ^js server-host path))

(defn set-modified-time
  "**Parameters:**
   - `path`: `string`
   - `time`: `Date`
   
   **Returns:** `void`"
  ^js [server-host path time]
  (.setModifiedTime ^js server-host path time))

(defn delete-file
  "**Parameters:**
   - `path`: `string`
   
   **Returns:** `void`"
  ^js [server-host path]
  (.deleteFile ^js server-host path))

(defn create-hash
  "A good implementation is node.js' `crypto.createHash`. (https://nodejs.org/api/crypto.html#crypto_crypto_createhash_algorithm)
   
   **Parameters:**
   - `data`: `string`
   
   **Returns:** `string`"
  ^js [server-host data]
  (.createHash ^js server-host data))

(defn create-sha-256-hash
  "This must be cryptographically secure. Only implement this method using `crypto.createHash(\"sha256\")`.
   
   **Parameters:**
   - `data`: `string`
   
   **Returns:** `string`"
  ^js [server-host data]
  (.createSHA256Hash ^js server-host data))

(defn memory-usage
  "**Returns:** `number`"
  ^js [server-host]
  (.getMemoryUsage ^js server-host))

(defn exit
  "**Parameters:**
   - `exit-code`: `number | undefined`
   
   **Returns:** `void`"
  (^js [server-host]
   (.exit ^js server-host))
  (^js [server-host exit-code]
   (.exit ^js server-host exit-code)))

(defn realpath
  "**Parameters:**
   - `path`: `string`
   
   **Returns:** `string`"
  ^js [server-host path]
  (.realpath ^js server-host path))

(defn clear-screen
  "**Returns:** `void`"
  ^js [server-host]
  (.clearScreen ^js server-host))

(defn base-64decode
  "**Parameters:**
   - `input`: `string`
   
   **Returns:** `string`"
  ^js [server-host input]
  (.base64decode ^js server-host input))

(defn base-64encode
  "**Parameters:**
   - `input`: `string`
   
   **Returns:** `string`"
  ^js [server-host input]
  (.base64encode ^js server-host input))
