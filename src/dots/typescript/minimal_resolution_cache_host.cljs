(ns dots.typescript.minimal-resolution-cache-host
  "Used by services to specify the minimum host area required to set up source files under any compilation settings")

(defn compilation-settings
  "**Returns:** `CompilerOptions`"
  ^js [minimal-resolution-cache-host]
  (.getCompilationSettings ^js minimal-resolution-cache-host))

(defn compiler-host
  "**Returns:** `CompilerHost | undefined`"
  ^js [minimal-resolution-cache-host]
  (.getCompilerHost ^js minimal-resolution-cache-host))

(defn file-exists?
  "**Parameters:**
   - `file-name`: `string`
   
   **Returns:** `boolean`"
  ^js [minimal-resolution-cache-host file-name]
  (.fileExists ^js minimal-resolution-cache-host file-name))

(defn read-file
  "**Parameters:**
   - `file-name`: `string`
   
   **Returns:** `string | undefined`"
  ^js [minimal-resolution-cache-host file-name]
  (.readFile ^js minimal-resolution-cache-host file-name))

(defn trace
  "**Parameters:**
   - `s`: `string`
   
   **Returns:** `void`"
  ^js [minimal-resolution-cache-host s]
  (.trace ^js minimal-resolution-cache-host s))

(defn directory-exists?
  "**Parameters:**
   - `directory-name`: `string`
   
   **Returns:** `boolean`"
  ^js [minimal-resolution-cache-host directory-name]
  (.directoryExists ^js minimal-resolution-cache-host directory-name))

(defn realpath
  "Resolve a symbolic link.
   
   **Parameters:**
   - `path`: `string`
   
   **Returns:** `string`"
  ^js [minimal-resolution-cache-host path]
  (.realpath ^js minimal-resolution-cache-host path))

(defn current-directory
  "**Returns:** `string`"
  ^js [minimal-resolution-cache-host]
  (.getCurrentDirectory ^js minimal-resolution-cache-host))

(defn directories
  "**Parameters:**
   - `path`: `string`
   
   **Returns:** `string[]`"
  ^js [minimal-resolution-cache-host path]
  (.getDirectories ^js minimal-resolution-cache-host path))

(defn use-case-sensitive-file-names?
  "**Returns:** `boolean | (() => boolean) | undefined`"
  ^js [minimal-resolution-cache-host]
  (.-useCaseSensitiveFileNames ^js minimal-resolution-cache-host))

(defn set-use-case-sensitive-file-names!
  ^js [minimal-resolution-cache-host value]
  (set! (.-useCaseSensitiveFileNames ^js minimal-resolution-cache-host) value))
