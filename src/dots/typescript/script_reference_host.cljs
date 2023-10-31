(ns dots.typescript.script-reference-host)

(defn compiler-options
  ^js [script-reference-host]
  (.getCompilerOptions ^js script-reference-host))

(defn source-file
  ^js [script-reference-host file-name]
  (.getSourceFile ^js script-reference-host file-name))

(defn source-file-by-path
  ^js [script-reference-host path]
  (.getSourceFileByPath ^js script-reference-host path))

(defn current-directory
  ^js [script-reference-host]
  (.getCurrentDirectory ^js script-reference-host))
