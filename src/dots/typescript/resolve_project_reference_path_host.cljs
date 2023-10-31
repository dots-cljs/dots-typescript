(ns dots.typescript.resolve-project-reference-path-host)

(defn file-exists?
  ^js [resolve-project-reference-path-host file-name]
  (.fileExists ^js resolve-project-reference-path-host file-name))
