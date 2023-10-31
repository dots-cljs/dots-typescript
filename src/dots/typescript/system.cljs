(ns dots.typescript.system)

(defn args
  ^js [system]
  (.-args ^js system))

(defn set-args!
  ^js [system value]
  (set! (.-args ^js system) value))

(defn new-line
  ^js [system]
  (.-newLine ^js system))

(defn set-new-line!
  ^js [system value]
  (set! (.-newLine ^js system) value))

(defn use-case-sensitive-file-names?
  ^js [system]
  (.-useCaseSensitiveFileNames ^js system))

(defn set-use-case-sensitive-file-names!
  ^js [system value]
  (set! (.-useCaseSensitiveFileNames ^js system) value))

(defn write
  ^js [system s]
  (.write ^js system s))

(defn write-output-is-tty?
  ^js [system]
  (.writeOutputIsTTY ^js system))

(defn width-of-terminal
  ^js [system]
  (.getWidthOfTerminal ^js system))

(defn read-file
  (^js [system path]
   (.readFile ^js system path))
  (^js [system path encoding]
   (.readFile ^js system path encoding)))

(defn file-size
  ^js [system path]
  (.getFileSize ^js system path))

(defn write-file
  (^js [system path data]
   (.writeFile ^js system path data))
  (^js [system path data write-byte-order-mark?]
   (.writeFile ^js system path data write-byte-order-mark?)))

(defn watch-file
  (^js [system path callback]
   (.watchFile ^js system path callback))
  (^js [system path callback polling-interval]
   (.watchFile ^js system path callback polling-interval))
  (^js [system path callback polling-interval options]
   (.watchFile ^js system path callback polling-interval options)))

(defn watch-directory
  (^js [system path callback]
   (.watchDirectory ^js system path callback))
  (^js [system path callback recursive?]
   (.watchDirectory ^js system path callback recursive?))
  (^js [system path callback recursive? options]
   (.watchDirectory ^js system path callback recursive? options)))

(defn resolve-path
  ^js [system path]
  (.resolvePath ^js system path))

(defn file-exists?
  ^js [system path]
  (.fileExists ^js system path))

(defn directory-exists?
  ^js [system path]
  (.directoryExists ^js system path))

(defn create-directory
  ^js [system path]
  (.createDirectory ^js system path))

(defn executing-file-path
  ^js [system]
  (.getExecutingFilePath ^js system))

(defn current-directory
  ^js [system]
  (.getCurrentDirectory ^js system))

(defn directories
  ^js [system path]
  (.getDirectories ^js system path))

(defn read-directory
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
  ^js [system path]
  (.getModifiedTime ^js system path))

(defn set-modified-time
  ^js [system path time]
  (.setModifiedTime ^js system path time))

(defn delete-file
  ^js [system path]
  (.deleteFile ^js system path))

(defn create-hash
  "A good implementation is node.js' `crypto.createHash`. (https://nodejs.org/api/crypto.html#crypto_crypto_createhash_algorithm)"
  ^js [system data]
  (.createHash ^js system data))

(defn create-sha-256-hash
  "This must be cryptographically secure. Only implement this method using `crypto.createHash(\"sha256\")`."
  ^js [system data]
  (.createSHA256Hash ^js system data))

(defn memory-usage
  ^js [system]
  (.getMemoryUsage ^js system))

(defn exit
  (^js [system]
   (.exit ^js system))
  (^js [system exit-code]
   (.exit ^js system exit-code)))

(defn realpath
  ^js [system path]
  (.realpath ^js system path))

(defn set-timeout
  ^js [system callback ms & args]
  (.. ^js system -setTimeout (apply ^js system (to-array (list* callback ms args)))))

(defn clear-timeout
  ^js [system timeout-id]
  (.clearTimeout ^js system timeout-id))

(defn clear-screen
  ^js [system]
  (.clearScreen ^js system))

(defn base-64decode
  ^js [system input]
  (.base64decode ^js system input))

(defn base-64encode
  ^js [system input]
  (.base64encode ^js system input))
