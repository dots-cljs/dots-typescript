(ns dots.typescript.sys
  (:require ["typescript" :as typescript]))

(defn args
  ^js []
  (.-args typescript/sys))

(defn set-args!
  ^js [value]
  (set! (.-args typescript/sys) value))

(defn new-line
  ^js []
  (.-newLine typescript/sys))

(defn set-new-line!
  ^js [value]
  (set! (.-newLine typescript/sys) value))

(defn use-case-sensitive-file-names?
  ^js []
  (.-useCaseSensitiveFileNames typescript/sys))

(defn set-use-case-sensitive-file-names!
  ^js [value]
  (set! (.-useCaseSensitiveFileNames typescript/sys) value))

(defn write
  "**Parameters:**
   - `s`: `string`
   
   **Returns:** `void`"
  ^js [s]
  (.write typescript/sys s))

(defn write-output-is-tty?
  "**Returns:** `boolean`"
  ^js []
  (.writeOutputIsTTY typescript/sys))

(defn width-of-terminal
  "**Returns:** `number`"
  ^js []
  (.getWidthOfTerminal typescript/sys))

(defn read-file
  "**Parameters:**
   - `path`: `string`
   - `encoding`: `string | undefined`
   
   **Returns:** `string | undefined`"
  (^js [path]
   (.readFile typescript/sys path))
  (^js [path encoding]
   (.readFile typescript/sys path encoding)))

(defn file-size
  "**Parameters:**
   - `path`: `string`
   
   **Returns:** `number`"
  ^js [path]
  (.getFileSize typescript/sys path))

(defn write-file
  "**Parameters:**
   - `path`: `string`
   - `data`: `string`
   - `write-byte-order-mark?`: `boolean | undefined`
   
   **Returns:** `void`"
  (^js [path data]
   (.writeFile typescript/sys path data))
  (^js [path data write-byte-order-mark?]
   (.writeFile typescript/sys path data write-byte-order-mark?)))

(defn watch-file
  "**Parameters:**
   - `path`: `string`
   - `callback`: `FileWatcherCallback`
   - `polling-interval`: `number | undefined`
   - `options`: `WatchOptions | undefined`
   
   **Returns:** `FileWatcher`"
  (^js [path callback]
   (.watchFile typescript/sys path callback))
  (^js [path callback polling-interval]
   (.watchFile typescript/sys path callback polling-interval))
  (^js [path callback polling-interval options]
   (.watchFile typescript/sys path callback polling-interval options)))

(defn watch-directory
  "**Parameters:**
   - `path`: `string`
   - `callback`: `DirectoryWatcherCallback`
   - `recursive?`: `boolean | undefined`
   - `options`: `WatchOptions | undefined`
   
   **Returns:** `FileWatcher`"
  (^js [path callback]
   (.watchDirectory typescript/sys path callback))
  (^js [path callback recursive?]
   (.watchDirectory typescript/sys path callback recursive?))
  (^js [path callback recursive? options]
   (.watchDirectory typescript/sys path callback recursive? options)))

(defn resolve-path
  "**Parameters:**
   - `path`: `string`
   
   **Returns:** `string`"
  ^js [path]
  (.resolvePath typescript/sys path))

(defn file-exists?
  "**Parameters:**
   - `path`: `string`
   
   **Returns:** `boolean`"
  ^js [path]
  (.fileExists typescript/sys path))

(defn directory-exists?
  "**Parameters:**
   - `path`: `string`
   
   **Returns:** `boolean`"
  ^js [path]
  (.directoryExists typescript/sys path))

(defn create-directory
  "**Parameters:**
   - `path`: `string`
   
   **Returns:** `void`"
  ^js [path]
  (.createDirectory typescript/sys path))

(defn executing-file-path
  "**Returns:** `string`"
  ^js []
  (.getExecutingFilePath typescript/sys))

(defn current-directory
  "**Returns:** `string`"
  ^js []
  (.getCurrentDirectory typescript/sys))

(defn directories
  "**Parameters:**
   - `path`: `string`
   
   **Returns:** `string[]`"
  ^js [path]
  (.getDirectories typescript/sys path))

(defn read-directory
  "**Parameters:**
   - `path`: `string`
   - `extensions`: `readonly string[] | undefined`
   - `exclude`: `readonly string[] | undefined`
   - `include`: `readonly string[] | undefined`
   - `depth`: `number | undefined`
   
   **Returns:** `string[]`"
  (^js [path]
   (.readDirectory typescript/sys path))
  (^js [path extensions]
   (.readDirectory typescript/sys path extensions))
  (^js [path extensions exclude]
   (.readDirectory typescript/sys path extensions exclude))
  (^js [path extensions exclude include]
   (.readDirectory typescript/sys path extensions exclude include))
  (^js [path extensions exclude include depth]
   (.readDirectory typescript/sys path extensions exclude include depth)))

(defn modified-time
  "**Parameters:**
   - `path`: `string`
   
   **Returns:** `Date | undefined`"
  ^js [path]
  (.getModifiedTime typescript/sys path))

(defn set-modified-time
  "**Parameters:**
   - `path`: `string`
   - `time`: `Date`
   
   **Returns:** `void`"
  ^js [path time]
  (.setModifiedTime typescript/sys path time))

(defn delete-file
  "**Parameters:**
   - `path`: `string`
   
   **Returns:** `void`"
  ^js [path]
  (.deleteFile typescript/sys path))

(defn create-hash
  "A good implementation is node.js' `crypto.createHash`. (https://nodejs.org/api/crypto.html#crypto_crypto_createhash_algorithm)
   
   **Parameters:**
   - `data`: `string`
   
   **Returns:** `string`"
  ^js [data]
  (.createHash typescript/sys data))

(defn create-sha-256-hash
  "This must be cryptographically secure. Only implement this method using `crypto.createHash(\"sha256\")`.
   
   **Parameters:**
   - `data`: `string`
   
   **Returns:** `string`"
  ^js [data]
  (.createSHA256Hash typescript/sys data))

(defn memory-usage
  "**Returns:** `number`"
  ^js []
  (.getMemoryUsage typescript/sys))

(defn exit
  "**Parameters:**
   - `exit-code`: `number | undefined`
   
   **Returns:** `void`"
  (^js []
   (.exit typescript/sys))
  (^js [exit-code]
   (.exit typescript/sys exit-code)))

(defn realpath
  "**Parameters:**
   - `path`: `string`
   
   **Returns:** `string`"
  ^js [path]
  (.realpath typescript/sys path))

(defn set-timeout
  "**Parameters:**
   - `callback`: `(...args: any[]) => void`
   - `ms`: `number`
   - `args`: `any[]`
   
   **Returns:** `any`"
  ^js [callback ms & args]
  (.. typescript/sys -setTimeout (apply typescript/sys (to-array (list* callback ms args)))))

(defn clear-timeout
  "**Parameters:**
   - `timeout-id`: `any`
   
   **Returns:** `void`"
  ^js [timeout-id]
  (.clearTimeout typescript/sys timeout-id))

(defn clear-screen
  "**Returns:** `void`"
  ^js []
  (.clearScreen typescript/sys))

(defn base-64decode
  "**Parameters:**
   - `input`: `string`
   
   **Returns:** `string`"
  ^js [input]
  (.base64decode typescript/sys input))

(defn base-64encode
  "**Parameters:**
   - `input`: `string`
   
   **Returns:** `string`"
  ^js [input]
  (.base64encode typescript/sys input))
