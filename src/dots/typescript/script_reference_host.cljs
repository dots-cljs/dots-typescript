(ns dots.typescript.script-reference-host)

(defn compiler-options
  "**Returns:** `CompilerOptions`"
  ^js [script-reference-host]
  (.getCompilerOptions ^js script-reference-host))

(defn source-file
  "**Parameters:**
   - `file-name`: `string`
   
   **Returns:** `SourceFile | undefined`"
  ^js [script-reference-host file-name]
  (.getSourceFile ^js script-reference-host file-name))

(defn source-file-by-path
  "**Parameters:**
   - `path`: `Path`
   
   **Returns:** `SourceFile | undefined`"
  ^js [script-reference-host path]
  (.getSourceFileByPath ^js script-reference-host path))

(defn current-directory
  "**Returns:** `string`"
  ^js [script-reference-host]
  (.getCurrentDirectory ^js script-reference-host))
