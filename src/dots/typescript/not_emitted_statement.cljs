(ns dots.typescript.not-emitted-statement)

(defn kind
  "**Returns:** `SyntaxKind.NotEmittedStatement`"
  ^js [not-emitted-statement]
  (.-kind ^js not-emitted-statement))

(defn flags
  "**Returns:** `NodeFlags`"
  ^js [not-emitted-statement]
  (.-flags ^js not-emitted-statement))

(defn parent
  "**Returns:** `Node`"
  ^js [not-emitted-statement]
  (.-parent ^js not-emitted-statement))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [not-emitted-statement]
  (.getSourceFile ^js not-emitted-statement))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [not-emitted-statement]
   (.getChildCount ^js not-emitted-statement))
  (^js [not-emitted-statement source-file]
   (.getChildCount ^js not-emitted-statement source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [not-emitted-statement index]
   (.getChildAt ^js not-emitted-statement index))
  (^js [not-emitted-statement index source-file]
   (.getChildAt ^js not-emitted-statement index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [not-emitted-statement]
   (.getChildren ^js not-emitted-statement))
  (^js [not-emitted-statement source-file]
   (.getChildren ^js not-emitted-statement source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [not-emitted-statement]
   (.getStart ^js not-emitted-statement))
  (^js [not-emitted-statement source-file]
   (.getStart ^js not-emitted-statement source-file))
  (^js [not-emitted-statement source-file include-js-doc-comment?]
   (.getStart ^js not-emitted-statement source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [not-emitted-statement]
  (.getFullStart ^js not-emitted-statement))

(defn get-end
  "**Returns:** `number`"
  ^js [not-emitted-statement]
  (.getEnd ^js not-emitted-statement))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [not-emitted-statement]
   (.getWidth ^js not-emitted-statement))
  (^js [not-emitted-statement source-file]
   (.getWidth ^js not-emitted-statement source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [not-emitted-statement]
  (.getFullWidth ^js not-emitted-statement))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [not-emitted-statement]
   (.getLeadingTriviaWidth ^js not-emitted-statement))
  (^js [not-emitted-statement source-file]
   (.getLeadingTriviaWidth ^js not-emitted-statement source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [not-emitted-statement]
   (.getFullText ^js not-emitted-statement))
  (^js [not-emitted-statement source-file]
   (.getFullText ^js not-emitted-statement source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [not-emitted-statement]
   (.getText ^js not-emitted-statement))
  (^js [not-emitted-statement source-file]
   (.getText ^js not-emitted-statement source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [not-emitted-statement]
   (.getFirstToken ^js not-emitted-statement))
  (^js [not-emitted-statement source-file]
   (.getFirstToken ^js not-emitted-statement source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [not-emitted-statement]
   (.getLastToken ^js not-emitted-statement))
  (^js [not-emitted-statement source-file]
   (.getLastToken ^js not-emitted-statement source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [not-emitted-statement cb-node]
   (.forEachChild ^js not-emitted-statement cb-node))
  (^js [not-emitted-statement cb-node cb-node-array]
   (.forEachChild ^js not-emitted-statement cb-node cb-node-array)))

(defn pos
  "**Returns:** `number`"
  ^js [not-emitted-statement]
  (.-pos ^js not-emitted-statement))

(defn end
  "**Returns:** `number`"
  ^js [not-emitted-statement]
  (.-end ^js not-emitted-statement))
