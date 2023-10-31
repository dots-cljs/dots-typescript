(ns dots.typescript.read-build-program-host)

(defn use-case-sensitive-file-names?
  ^js [read-build-program-host]
  (.useCaseSensitiveFileNames ^js read-build-program-host))

(defn current-directory
  ^js [read-build-program-host]
  (.getCurrentDirectory ^js read-build-program-host))

(defn read-file
  ^js [read-build-program-host file-name]
  (.readFile ^js read-build-program-host file-name))
