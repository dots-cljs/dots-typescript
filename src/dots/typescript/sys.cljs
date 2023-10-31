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
  ^js [s]
  (.write typescript/sys s))

(defn write-output-is-tty?
  ^js []
  (.writeOutputIsTTY typescript/sys))

(defn width-of-terminal
  ^js []
  (.getWidthOfTerminal typescript/sys))

(defn read-file
  (^js [path]
   (.readFile typescript/sys path))
  (^js [path encoding]
   (.readFile typescript/sys path encoding)))

(defn file-size
  ^js [path]
  (.getFileSize typescript/sys path))

(defn write-file
  (^js [path data]
   (.writeFile typescript/sys path data))
  (^js [path data write-byte-order-mark?]
   (.writeFile typescript/sys path data write-byte-order-mark?)))

(defn watch-file
  (^js [path callback]
   (.watchFile typescript/sys path callback))
  (^js [path callback polling-interval]
   (.watchFile typescript/sys path callback polling-interval))
  (^js [path callback polling-interval options]
   (.watchFile typescript/sys path callback polling-interval options)))

(defn watch-directory
  (^js [path callback]
   (.watchDirectory typescript/sys path callback))
  (^js [path callback recursive?]
   (.watchDirectory typescript/sys path callback recursive?))
  (^js [path callback recursive? options]
   (.watchDirectory typescript/sys path callback recursive? options)))

(defn resolve-path
  ^js [path]
  (.resolvePath typescript/sys path))

(defn file-exists?
  ^js [path]
  (.fileExists typescript/sys path))

(defn directory-exists?
  ^js [path]
  (.directoryExists typescript/sys path))

(defn create-directory
  ^js [path]
  (.createDirectory typescript/sys path))

(defn executing-file-path
  ^js []
  (.getExecutingFilePath typescript/sys))

(defn current-directory
  ^js []
  (.getCurrentDirectory typescript/sys))

(defn directories
  ^js [path]
  (.getDirectories typescript/sys path))

(defn read-directory
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
  ^js [path]
  (.getModifiedTime typescript/sys path))

(defn set-modified-time
  ^js [path time]
  (.setModifiedTime typescript/sys path time))

(defn delete-file
  ^js [path]
  (.deleteFile typescript/sys path))

(defn create-hash
  "A good implementation is node.js' `crypto.createHash`. (https://nodejs.org/api/crypto.html#crypto_crypto_createhash_algorithm)"
  ^js [data]
  (.createHash typescript/sys data))

(defn create-sha-256-hash
  "This must be cryptographically secure. Only implement this method using `crypto.createHash(\"sha256\")`."
  ^js [data]
  (.createSHA256Hash typescript/sys data))

(defn memory-usage
  ^js []
  (.getMemoryUsage typescript/sys))

(defn exit
  (^js []
   (.exit typescript/sys))
  (^js [exit-code]
   (.exit typescript/sys exit-code)))

(defn realpath
  ^js [path]
  (.realpath typescript/sys path))

(defn set-timeout
  ^js [callback ms & args]
  (.. typescript/sys -setTimeout (apply typescript/sys (to-array (list* callback ms args)))))

(defn clear-timeout
  ^js [timeout-id]
  (.clearTimeout typescript/sys timeout-id))

(defn clear-screen
  ^js []
  (.clearScreen typescript/sys))

(defn base-64decode
  ^js [input]
  (.base64decode typescript/sys input))

(defn base-64encode
  ^js [input]
  (.base64encode typescript/sys input))
