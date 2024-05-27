(ns dots.typescript.server.set-typings)

(defn type-acquisition
  "**Returns:** `TypeAcquisition`"
  ^js [set-typings]
  (.-typeAcquisition ^js set-typings))

(defn compiler-options
  "**Returns:** `CompilerOptions`"
  ^js [set-typings]
  (.-compilerOptions ^js set-typings))

(defn typings
  "**Returns:** `string[]`"
  ^js [set-typings]
  (.-typings ^js set-typings))

(defn unresolved-imports
  "**Returns:** `SortedReadonlyArray<string>`"
  ^js [set-typings]
  (.-unresolvedImports ^js set-typings))

(defn kind
  "**Returns:** `\"action::set\"`"
  ^js [set-typings]
  (.-kind ^js set-typings))

(defn project-name
  "**Returns:** `string`"
  ^js [set-typings]
  (.-projectName ^js set-typings))
