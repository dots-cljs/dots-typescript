(ns dots.typescript.parse-config-host)

(defn use-case-sensitive-file-names?
  ^js [parse-config-host]
  (.-useCaseSensitiveFileNames ^js parse-config-host))

(defn set-use-case-sensitive-file-names!
  ^js [parse-config-host value]
  (set! (.-useCaseSensitiveFileNames ^js parse-config-host) value))

(defn read-directory
  (^js [parse-config-host root-dir extensions]
   (.readDirectory ^js parse-config-host root-dir extensions))
  (^js [parse-config-host root-dir extensions excludes]
   (.readDirectory ^js parse-config-host root-dir extensions excludes))
  (^js [parse-config-host root-dir extensions excludes includes]
   (.readDirectory ^js parse-config-host root-dir extensions excludes includes))
  (^js [parse-config-host root-dir extensions excludes includes depth]
   (.readDirectory ^js parse-config-host root-dir extensions excludes includes depth)))

(defn file-exists?
  "Gets a value indicating whether the specified path exists and is a file."
  ^js [parse-config-host path]
  (.fileExists ^js parse-config-host path))

(defn read-file
  ^js [parse-config-host path]
  (.readFile ^js parse-config-host path))

(defn trace
  ^js [parse-config-host s]
  (.trace ^js parse-config-host s))
