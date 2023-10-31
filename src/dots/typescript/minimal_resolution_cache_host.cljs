(ns dots.typescript.minimal-resolution-cache-host
  "Used by services to specify the minimum host area required to set up source files under any compilation settings")

(defn compilation-settings
  ^js [minimal-resolution-cache-host]
  (.getCompilationSettings ^js minimal-resolution-cache-host))

(defn compiler-host
  ^js [minimal-resolution-cache-host]
  (.getCompilerHost ^js minimal-resolution-cache-host))

(defn file-exists?
  ^js [minimal-resolution-cache-host file-name]
  (.fileExists ^js minimal-resolution-cache-host file-name))

(defn read-file
  ^js [minimal-resolution-cache-host file-name]
  (.readFile ^js minimal-resolution-cache-host file-name))

(defn trace
  ^js [minimal-resolution-cache-host s]
  (.trace ^js minimal-resolution-cache-host s))

(defn directory-exists?
  ^js [minimal-resolution-cache-host directory-name]
  (.directoryExists ^js minimal-resolution-cache-host directory-name))

(defn realpath
  "Resolve a symbolic link."
  ^js [minimal-resolution-cache-host path]
  (.realpath ^js minimal-resolution-cache-host path))

(defn current-directory
  ^js [minimal-resolution-cache-host]
  (.getCurrentDirectory ^js minimal-resolution-cache-host))

(defn directories
  ^js [minimal-resolution-cache-host path]
  (.getDirectories ^js minimal-resolution-cache-host path))

(defn use-case-sensitive-file-names?
  ^js [minimal-resolution-cache-host]
  (.-useCaseSensitiveFileNames ^js minimal-resolution-cache-host))

(defn set-use-case-sensitive-file-names!
  ^js [minimal-resolution-cache-host value]
  (set! (.-useCaseSensitiveFileNames ^js minimal-resolution-cache-host) value))
