(ns dots.typescript.parse-config-file-host
  "Interface extending ParseConfigHost to support ParseConfigFile that reads config file and reports errors")

(defn current-directory
  ^js [parse-config-file-host]
  (.getCurrentDirectory ^js parse-config-file-host))

(defn use-case-sensitive-file-names?
  ^js [parse-config-file-host]
  (.-useCaseSensitiveFileNames ^js parse-config-file-host))

(defn set-use-case-sensitive-file-names!
  ^js [parse-config-file-host value]
  (set! (.-useCaseSensitiveFileNames ^js parse-config-file-host) value))

(defn read-directory
  (^js [parse-config-file-host root-dir extensions]
   (.readDirectory ^js parse-config-file-host root-dir extensions))
  (^js [parse-config-file-host root-dir extensions excludes]
   (.readDirectory ^js parse-config-file-host root-dir extensions excludes))
  (^js [parse-config-file-host root-dir extensions excludes includes]
   (.readDirectory ^js parse-config-file-host root-dir extensions excludes includes))
  (^js [parse-config-file-host root-dir extensions excludes includes depth]
   (.readDirectory ^js parse-config-file-host root-dir extensions excludes includes depth)))

(defn file-exists?
  "Gets a value indicating whether the specified path exists and is a file."
  ^js [parse-config-file-host path]
  (.fileExists ^js parse-config-file-host path))

(defn read-file
  ^js [parse-config-file-host path]
  (.readFile ^js parse-config-file-host path))

(defn trace
  ^js [parse-config-file-host s]
  (.trace ^js parse-config-file-host s))

(defn on-un-recoverable-config-file-diagnostic
  "Reports unrecoverable error when parsing config file"
  ^js [parse-config-file-host]
  (.-onUnRecoverableConfigFileDiagnostic ^js parse-config-file-host))

(defn set-on-un-recoverable-config-file-diagnostic!
  "Reports unrecoverable error when parsing config file"
  ^js [parse-config-file-host value]
  (set! (.-onUnRecoverableConfigFileDiagnostic ^js parse-config-file-host) value))
