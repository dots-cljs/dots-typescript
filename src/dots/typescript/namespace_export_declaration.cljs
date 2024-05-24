(ns dots.typescript.namespace-export-declaration
  (:refer-clojure :exclude [name]))

(defn kind
  ^js [namespace-export-declaration]
  (.-kind ^js namespace-export-declaration))

(defn name
  ^js [namespace-export-declaration]
  (.-name ^js namespace-export-declaration))

(defn flags
  ^js [namespace-export-declaration]
  (.-flags ^js namespace-export-declaration))

(defn parent
  ^js [namespace-export-declaration]
  (.-parent ^js namespace-export-declaration))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [namespace-export-declaration]
  (.getSourceFile ^js namespace-export-declaration))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [namespace-export-declaration]
   (.getChildCount ^js namespace-export-declaration))
  (^js [namespace-export-declaration source-file]
   (.getChildCount ^js namespace-export-declaration source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [namespace-export-declaration index]
   (.getChildAt ^js namespace-export-declaration index))
  (^js [namespace-export-declaration index source-file]
   (.getChildAt ^js namespace-export-declaration index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [namespace-export-declaration]
   (.getChildren ^js namespace-export-declaration))
  (^js [namespace-export-declaration source-file]
   (.getChildren ^js namespace-export-declaration source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [namespace-export-declaration]
   (.getStart ^js namespace-export-declaration))
  (^js [namespace-export-declaration source-file]
   (.getStart ^js namespace-export-declaration source-file))
  (^js [namespace-export-declaration source-file include-js-doc-comment?]
   (.getStart ^js namespace-export-declaration source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [namespace-export-declaration]
  (.getFullStart ^js namespace-export-declaration))

(defn get-end
  "**Returns:** `number`"
  ^js [namespace-export-declaration]
  (.getEnd ^js namespace-export-declaration))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [namespace-export-declaration]
   (.getWidth ^js namespace-export-declaration))
  (^js [namespace-export-declaration source-file]
   (.getWidth ^js namespace-export-declaration source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [namespace-export-declaration]
  (.getFullWidth ^js namespace-export-declaration))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [namespace-export-declaration]
   (.getLeadingTriviaWidth ^js namespace-export-declaration))
  (^js [namespace-export-declaration source-file]
   (.getLeadingTriviaWidth ^js namespace-export-declaration source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [namespace-export-declaration]
   (.getFullText ^js namespace-export-declaration))
  (^js [namespace-export-declaration source-file]
   (.getFullText ^js namespace-export-declaration source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [namespace-export-declaration]
   (.getText ^js namespace-export-declaration))
  (^js [namespace-export-declaration source-file]
   (.getText ^js namespace-export-declaration source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [namespace-export-declaration]
   (.getFirstToken ^js namespace-export-declaration))
  (^js [namespace-export-declaration source-file]
   (.getFirstToken ^js namespace-export-declaration source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [namespace-export-declaration]
   (.getLastToken ^js namespace-export-declaration))
  (^js [namespace-export-declaration source-file]
   (.getLastToken ^js namespace-export-declaration source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [namespace-export-declaration cb-node]
   (.forEachChild ^js namespace-export-declaration cb-node))
  (^js [namespace-export-declaration cb-node cb-node-array]
   (.forEachChild ^js namespace-export-declaration cb-node cb-node-array)))

(defn pos
  ^js [namespace-export-declaration]
  (.-pos ^js namespace-export-declaration))

(defn end
  ^js [namespace-export-declaration]
  (.-end ^js namespace-export-declaration))
