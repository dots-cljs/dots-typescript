(ns dots.typescript.system)

(defn args
  "**Returns:** `string[]`"
  ^js [system]
  (.-args ^js system))

(defn set-args!
  ^js [system value]
  (set! (.-args ^js system) value))

(defn new-line
  "**Returns:** `string`"
  ^js [system]
  (.-newLine ^js system))

(defn set-new-line!
  ^js [system value]
  (set! (.-newLine ^js system) value))

(defn use-case-sensitive-file-names?
  "**Returns:** `boolean`"
  ^js [system]
  (.-useCaseSensitiveFileNames ^js system))

(defn set-use-case-sensitive-file-names!
  ^js [system value]
  (set! (.-useCaseSensitiveFileNames ^js system) value))

(defn write
  "**Parameters:**
   - `s`: `string`
   
   **Returns:** `void`"
  ^js [system s]
  (.write ^js system s))

(defn write-output-is-tty?
  "**Returns:** `boolean`"
  ^js [system]
  (.writeOutputIsTTY ^js system))

(defn width-of-terminal
  "**Returns:** `number`"
  ^js [system]
  (.getWidthOfTerminal ^js system))

(defn read-file
  "**Parameters:**
   - `path`: `string`
   - `encoding`: `string | undefined`
   
   **Returns:** `string | undefined`"
  (^js [system path]
   (.readFile ^js system path))
  (^js [system path encoding]
   (.readFile ^js system path encoding)))

(defn file-size
  "**Parameters:**
   - `path`: `string`
   
   **Returns:** `number`"
  ^js [system path]
  (.getFileSize ^js system path))

(defn write-file
  "**Parameters:**
   - `path`: `string`
   - `data`: `string`
   - `write-byte-order-mark?`: `boolean | undefined`
   
   **Returns:** `void`"
  (^js [system path data]
   (.writeFile ^js system path data))
  (^js [system path data write-byte-order-mark?]
   (.writeFile ^js system path data write-byte-order-mark?)))

(defn watch-file
  "**Parameters:**
   - `path`: `string`
   - `callback`: `FileWatcherCallback`
   - `polling-interval`: `number | undefined`
   - `options`: `WatchOptions | undefined`
   
   **Returns:** `FileWatcher`"
  (^js [system path callback]
   (.watchFile ^js system path callback))
  (^js [system path callback polling-interval]
   (.watchFile ^js system path callback polling-interval))
  (^js [system path callback polling-interval options]
   (.watchFile ^js system path callback polling-interval options)))

(defn watch-directory
  "**Parameters:**
   - `path`: `string`
   - `callback`: `DirectoryWatcherCallback`
   - `recursive?`: `boolean | undefined`
   - `options`: `WatchOptions | undefined`
   
   **Returns:** `FileWatcher`"
  (^js [system path callback]
   (.watchDirectory ^js system path callback))
  (^js [system path callback recursive?]
   (.watchDirectory ^js system path callback recursive?))
  (^js [system path callback recursive? options]
   (.watchDirectory ^js system path callback recursive? options)))

(defn resolve-path
  "**Parameters:**
   - `path`: `string`
   
   **Returns:** `string`"
  ^js [system path]
  (.resolvePath ^js system path))

(defn file-exists?
  "**Parameters:**
   - `path`: `string`
   
   **Returns:** `boolean`"
  ^js [system path]
  (.fileExists ^js system path))

(defn directory-exists?
  "**Parameters:**
   - `path`: `string`
   
   **Returns:** `boolean`"
  ^js [system path]
  (.directoryExists ^js system path))

(defn create-directory
  "**Parameters:**
   - `path`: `string`
   
   **Returns:** `void`"
  ^js [system path]
  (.createDirectory ^js system path))

(defn executing-file-path
  "**Returns:** `string`"
  ^js [system]
  (.getExecutingFilePath ^js system))

(defn current-directory
  "**Returns:** `string`"
  ^js [system]
  (.getCurrentDirectory ^js system))

(defn directories
  "**Parameters:**
   - `path`: `string`
   
   **Returns:** `string[]`"
  ^js [system path]
  (.getDirectories ^js system path))

(defn read-directory
  "**Parameters:**
   - `path`: `string`
   - `extensions`: `readonly string[] | undefined`
   - `exclude`: `readonly string[] | undefined`
   - `include`: `readonly string[] | undefined`
   - `depth`: `number | undefined`
   
   **Returns:** `string[]`"
  (^js [system path]
   (.readDirectory ^js system path))
  (^js [system path extensions]
   (.readDirectory ^js system path extensions))
  (^js [system path extensions exclude]
   (.readDirectory ^js system path extensions exclude))
  (^js [system path extensions exclude include]
   (.readDirectory ^js system path extensions exclude include))
  (^js [system path extensions exclude include depth]
   (.readDirectory ^js system path extensions exclude include depth)))

(defn modified-time
  "**Parameters:**
   - `path`: `string`
   
   **Returns:** `Date | undefined`"
  ^js [system path]
  (.getModifiedTime ^js system path))

(defn set-modified-time
  "**Parameters:**
   - `path`: `string`
   - `time`: `Date`
   
   **Returns:** `void`"
  ^js [system path time]
  (.setModifiedTime ^js system path time))

(defn delete-file
  "**Parameters:**
   - `path`: `string`
   
   **Returns:** `void`"
  ^js [system path]
  (.deleteFile ^js system path))

(defn create-hash
  "A good implementation is node.js' `crypto.createHash`. (https://nodejs.org/api/crypto.html#crypto_crypto_createhash_algorithm)
   
   **Parameters:**
   - `data`: `string`
   
   **Returns:** `string`"
  ^js [system data]
  (.createHash ^js system data))

(defn create-sha-256-hash
  "This must be cryptographically secure. Only implement this method using `crypto.createHash(\"sha256\")`.
   
   **Parameters:**
   - `data`: `string`
   
   **Returns:** `string`"
  ^js [system data]
  (.createSHA256Hash ^js system data))

(defn memory-usage
  "**Returns:** `number`"
  ^js [system]
  (.getMemoryUsage ^js system))

(defn exit
  "**Parameters:**
   - `exit-code`: `number | undefined`
   
   **Returns:** `void`"
  (^js [system]
   (.exit ^js system))
  (^js [system exit-code]
   (.exit ^js system exit-code)))

(defn realpath
  "**Parameters:**
   - `path`: `string`
   
   **Returns:** `string`"
  ^js [system path]
  (.realpath ^js system path))

(defn set-timeout
  "**Parameters:**
   - `callback`: `(...args: any[]) => void`
   - `ms`: `number`
   - `args`: `any[]`
   
   **Returns:** `any`"
  ^js [system callback ms & args]
  (.. ^js system -setTimeout (apply ^js system (to-array (list* callback ms args)))))

(defn clear-timeout
  "**Parameters:**
   - `timeout-id`: `any`
   
   **Returns:** `void`"
  ^js [system timeout-id]
  (.clearTimeout ^js system timeout-id))

(defn clear-screen
  "**Returns:** `void`"
  ^js [system]
  (.clearScreen ^js system))

(defn base-64decode
  "**Parameters:**
   - `input`: `string`
   
   **Returns:** `string`"
  ^js [system input]
  (.base64decode ^js system input))

(defn base-64encode
  "**Parameters:**
   - `input`: `string`
   
   **Returns:** `string`"
  ^js [system input]
  (.base64encode ^js system input))
