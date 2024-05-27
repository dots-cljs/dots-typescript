(ns dots.typescript.server.discover-typings)

(defn file-names
  "**Returns:** `string[]`"
  ^js [discover-typings]
  (.-fileNames ^js discover-typings))

(defn project-root-path
  "**Returns:** `Path`"
  ^js [discover-typings]
  (.-projectRootPath ^js discover-typings))

(defn compiler-options
  "**Returns:** `CompilerOptions`"
  ^js [discover-typings]
  (.-compilerOptions ^js discover-typings))

(defn type-acquisition
  "**Returns:** `TypeAcquisition`"
  ^js [discover-typings]
  (.-typeAcquisition ^js discover-typings))

(defn unresolved-imports
  "**Returns:** `SortedReadonlyArray<string>`"
  ^js [discover-typings]
  (.-unresolvedImports ^js discover-typings))

(defn cache-path
  "**Returns:** `string | undefined`"
  ^js [discover-typings]
  (.-cachePath ^js discover-typings))

(defn kind
  "**Returns:** `\"discover\"`"
  ^js [discover-typings]
  (.-kind ^js discover-typings))

(defn project-name
  "**Returns:** `string`"
  ^js [discover-typings]
  (.-projectName ^js discover-typings))
