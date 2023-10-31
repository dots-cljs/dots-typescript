(ns dots.typescript.module-resolution-host)

(defn file-exists?
  ^js [module-resolution-host file-name]
  (.fileExists ^js module-resolution-host file-name))

(defn read-file
  ^js [module-resolution-host file-name]
  (.readFile ^js module-resolution-host file-name))

(defn trace
  ^js [module-resolution-host s]
  (.trace ^js module-resolution-host s))

(defn directory-exists?
  ^js [module-resolution-host directory-name]
  (.directoryExists ^js module-resolution-host directory-name))

(defn realpath
  "Resolve a symbolic link."
  ^js [module-resolution-host path]
  (.realpath ^js module-resolution-host path))

(defn current-directory
  ^js [module-resolution-host]
  (.getCurrentDirectory ^js module-resolution-host))

(defn directories
  ^js [module-resolution-host path]
  (.getDirectories ^js module-resolution-host path))

(defn use-case-sensitive-file-names?
  ^js [module-resolution-host]
  (.-useCaseSensitiveFileNames ^js module-resolution-host))

(defn set-use-case-sensitive-file-names!
  ^js [module-resolution-host value]
  (set! (.-useCaseSensitiveFileNames ^js module-resolution-host) value))
