(ns dots.typescript.js-typing.typing-resolution-host)

(defn directory-exists?
  ^js [typing-resolution-host path]
  (.directoryExists ^js typing-resolution-host path))

(defn file-exists?
  ^js [typing-resolution-host file-name]
  (.fileExists ^js typing-resolution-host file-name))

(defn read-file
  (^js [typing-resolution-host path]
   (.readFile ^js typing-resolution-host path))
  (^js [typing-resolution-host path encoding]
   (.readFile ^js typing-resolution-host path encoding)))

(defn read-directory
  (^js [typing-resolution-host root-dir extensions]
   (.readDirectory ^js typing-resolution-host root-dir extensions))
  (^js [typing-resolution-host root-dir extensions excludes]
   (.readDirectory ^js typing-resolution-host root-dir extensions excludes))
  (^js [typing-resolution-host root-dir extensions excludes includes]
   (.readDirectory ^js typing-resolution-host root-dir extensions excludes includes))
  (^js [typing-resolution-host root-dir extensions excludes includes depth]
   (.readDirectory ^js typing-resolution-host root-dir extensions excludes includes depth)))
