(ns dots.typescript.namespace-import
  (:refer-clojure :exclude [name]))

(defn kind
  ^js [namespace-import]
  (.-kind ^js namespace-import))

(defn parent
  ^js [namespace-import]
  (.-parent ^js namespace-import))

(defn name
  ^js [namespace-import]
  (.-name ^js namespace-import))

(defn flags
  ^js [namespace-import]
  (.-flags ^js namespace-import))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [namespace-import]
  (.getSourceFile ^js namespace-import))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [namespace-import]
   (.getChildCount ^js namespace-import))
  (^js [namespace-import source-file]
   (.getChildCount ^js namespace-import source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [namespace-import index]
   (.getChildAt ^js namespace-import index))
  (^js [namespace-import index source-file]
   (.getChildAt ^js namespace-import index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [namespace-import]
   (.getChildren ^js namespace-import))
  (^js [namespace-import source-file]
   (.getChildren ^js namespace-import source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [namespace-import]
   (.getStart ^js namespace-import))
  (^js [namespace-import source-file]
   (.getStart ^js namespace-import source-file))
  (^js [namespace-import source-file include-js-doc-comment?]
   (.getStart ^js namespace-import source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [namespace-import]
  (.getFullStart ^js namespace-import))

(defn get-end
  "**Returns:** `number`"
  ^js [namespace-import]
  (.getEnd ^js namespace-import))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [namespace-import]
   (.getWidth ^js namespace-import))
  (^js [namespace-import source-file]
   (.getWidth ^js namespace-import source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [namespace-import]
  (.getFullWidth ^js namespace-import))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [namespace-import]
   (.getLeadingTriviaWidth ^js namespace-import))
  (^js [namespace-import source-file]
   (.getLeadingTriviaWidth ^js namespace-import source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [namespace-import]
   (.getFullText ^js namespace-import))
  (^js [namespace-import source-file]
   (.getFullText ^js namespace-import source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [namespace-import]
   (.getText ^js namespace-import))
  (^js [namespace-import source-file]
   (.getText ^js namespace-import source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [namespace-import]
   (.getFirstToken ^js namespace-import))
  (^js [namespace-import source-file]
   (.getFirstToken ^js namespace-import source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [namespace-import]
   (.getLastToken ^js namespace-import))
  (^js [namespace-import source-file]
   (.getLastToken ^js namespace-import source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [namespace-import cb-node]
   (.forEachChild ^js namespace-import cb-node))
  (^js [namespace-import cb-node cb-node-array]
   (.forEachChild ^js namespace-import cb-node cb-node-array)))

(defn pos
  ^js [namespace-import]
  (.-pos ^js namespace-import))

(defn end
  ^js [namespace-import]
  (.-end ^js namespace-import))
