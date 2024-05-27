(ns dots.typescript.try-statement)

(defn kind
  "**Returns:** `SyntaxKind.TryStatement`"
  ^js [try-statement]
  (.-kind ^js try-statement))

(defn try-block
  "**Returns:** `Block`"
  ^js [try-statement]
  (.-tryBlock ^js try-statement))

(defn catch-clause
  "**Returns:** `CatchClause | undefined`"
  ^js [try-statement]
  (.-catchClause ^js try-statement))

(defn finally-block
  "**Returns:** `Block | undefined`"
  ^js [try-statement]
  (.-finallyBlock ^js try-statement))

(defn flags
  "**Returns:** `NodeFlags`"
  ^js [try-statement]
  (.-flags ^js try-statement))

(defn parent
  "**Returns:** `Node`"
  ^js [try-statement]
  (.-parent ^js try-statement))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [try-statement]
  (.getSourceFile ^js try-statement))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [try-statement]
   (.getChildCount ^js try-statement))
  (^js [try-statement source-file]
   (.getChildCount ^js try-statement source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [try-statement index]
   (.getChildAt ^js try-statement index))
  (^js [try-statement index source-file]
   (.getChildAt ^js try-statement index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [try-statement]
   (.getChildren ^js try-statement))
  (^js [try-statement source-file]
   (.getChildren ^js try-statement source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [try-statement]
   (.getStart ^js try-statement))
  (^js [try-statement source-file]
   (.getStart ^js try-statement source-file))
  (^js [try-statement source-file include-js-doc-comment?]
   (.getStart ^js try-statement source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [try-statement]
  (.getFullStart ^js try-statement))

(defn get-end
  "**Returns:** `number`"
  ^js [try-statement]
  (.getEnd ^js try-statement))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [try-statement]
   (.getWidth ^js try-statement))
  (^js [try-statement source-file]
   (.getWidth ^js try-statement source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [try-statement]
  (.getFullWidth ^js try-statement))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [try-statement]
   (.getLeadingTriviaWidth ^js try-statement))
  (^js [try-statement source-file]
   (.getLeadingTriviaWidth ^js try-statement source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [try-statement]
   (.getFullText ^js try-statement))
  (^js [try-statement source-file]
   (.getFullText ^js try-statement source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [try-statement]
   (.getText ^js try-statement))
  (^js [try-statement source-file]
   (.getText ^js try-statement source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [try-statement]
   (.getFirstToken ^js try-statement))
  (^js [try-statement source-file]
   (.getFirstToken ^js try-statement source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [try-statement]
   (.getLastToken ^js try-statement))
  (^js [try-statement source-file]
   (.getLastToken ^js try-statement source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [try-statement cb-node]
   (.forEachChild ^js try-statement cb-node))
  (^js [try-statement cb-node cb-node-array]
   (.forEachChild ^js try-statement cb-node cb-node-array)))

(defn pos
  "**Returns:** `number`"
  ^js [try-statement]
  (.-pos ^js try-statement))

(defn end
  "**Returns:** `number`"
  ^js [try-statement]
  (.-end ^js try-statement))
