(ns dots.typescript.enum-member
  (:refer-clojure :exclude [name]))

(defn kind
  ^js [enum-member]
  (.-kind ^js enum-member))

(defn parent
  ^js [enum-member]
  (.-parent ^js enum-member))

(defn name
  ^js [enum-member]
  (.-name ^js enum-member))

(defn initializer
  ^js [enum-member]
  (.-initializer ^js enum-member))

(defn flags
  ^js [enum-member]
  (.-flags ^js enum-member))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [enum-member]
  (.getSourceFile ^js enum-member))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [enum-member]
   (.getChildCount ^js enum-member))
  (^js [enum-member source-file]
   (.getChildCount ^js enum-member source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [enum-member index]
   (.getChildAt ^js enum-member index))
  (^js [enum-member index source-file]
   (.getChildAt ^js enum-member index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [enum-member]
   (.getChildren ^js enum-member))
  (^js [enum-member source-file]
   (.getChildren ^js enum-member source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [enum-member]
   (.getStart ^js enum-member))
  (^js [enum-member source-file]
   (.getStart ^js enum-member source-file))
  (^js [enum-member source-file include-js-doc-comment?]
   (.getStart ^js enum-member source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [enum-member]
  (.getFullStart ^js enum-member))

(defn get-end
  "**Returns:** `number`"
  ^js [enum-member]
  (.getEnd ^js enum-member))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [enum-member]
   (.getWidth ^js enum-member))
  (^js [enum-member source-file]
   (.getWidth ^js enum-member source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [enum-member]
  (.getFullWidth ^js enum-member))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [enum-member]
   (.getLeadingTriviaWidth ^js enum-member))
  (^js [enum-member source-file]
   (.getLeadingTriviaWidth ^js enum-member source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [enum-member]
   (.getFullText ^js enum-member))
  (^js [enum-member source-file]
   (.getFullText ^js enum-member source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [enum-member]
   (.getText ^js enum-member))
  (^js [enum-member source-file]
   (.getText ^js enum-member source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [enum-member]
   (.getFirstToken ^js enum-member))
  (^js [enum-member source-file]
   (.getFirstToken ^js enum-member source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [enum-member]
   (.getLastToken ^js enum-member))
  (^js [enum-member source-file]
   (.getLastToken ^js enum-member source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [enum-member cb-node]
   (.forEachChild ^js enum-member cb-node))
  (^js [enum-member cb-node cb-node-array]
   (.forEachChild ^js enum-member cb-node cb-node-array)))

(defn pos
  ^js [enum-member]
  (.-pos ^js enum-member))

(defn end
  ^js [enum-member]
  (.-end ^js enum-member))
