(ns dots.typescript.for-statement)

(defn kind
  "**Returns:** `SyntaxKind.ForStatement`"
  ^js [for-statement]
  (.-kind ^js for-statement))

(defn initializer
  "**Returns:** `ForInitializer | undefined`"
  ^js [for-statement]
  (.-initializer ^js for-statement))

(defn condition
  "**Returns:** `Expression | undefined`"
  ^js [for-statement]
  (.-condition ^js for-statement))

(defn incrementor
  "**Returns:** `Expression | undefined`"
  ^js [for-statement]
  (.-incrementor ^js for-statement))

(defn statement
  "**Returns:** `Statement`"
  ^js [for-statement]
  (.-statement ^js for-statement))

(defn flags
  "**Returns:** `NodeFlags`"
  ^js [for-statement]
  (.-flags ^js for-statement))

(defn parent
  "**Returns:** `Node`"
  ^js [for-statement]
  (.-parent ^js for-statement))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [for-statement]
  (.getSourceFile ^js for-statement))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [for-statement]
   (.getChildCount ^js for-statement))
  (^js [for-statement source-file]
   (.getChildCount ^js for-statement source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [for-statement index]
   (.getChildAt ^js for-statement index))
  (^js [for-statement index source-file]
   (.getChildAt ^js for-statement index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [for-statement]
   (.getChildren ^js for-statement))
  (^js [for-statement source-file]
   (.getChildren ^js for-statement source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [for-statement]
   (.getStart ^js for-statement))
  (^js [for-statement source-file]
   (.getStart ^js for-statement source-file))
  (^js [for-statement source-file include-js-doc-comment?]
   (.getStart ^js for-statement source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [for-statement]
  (.getFullStart ^js for-statement))

(defn get-end
  "**Returns:** `number`"
  ^js [for-statement]
  (.getEnd ^js for-statement))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [for-statement]
   (.getWidth ^js for-statement))
  (^js [for-statement source-file]
   (.getWidth ^js for-statement source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [for-statement]
  (.getFullWidth ^js for-statement))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [for-statement]
   (.getLeadingTriviaWidth ^js for-statement))
  (^js [for-statement source-file]
   (.getLeadingTriviaWidth ^js for-statement source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [for-statement]
   (.getFullText ^js for-statement))
  (^js [for-statement source-file]
   (.getFullText ^js for-statement source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [for-statement]
   (.getText ^js for-statement))
  (^js [for-statement source-file]
   (.getText ^js for-statement source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [for-statement]
   (.getFirstToken ^js for-statement))
  (^js [for-statement source-file]
   (.getFirstToken ^js for-statement source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [for-statement]
   (.getLastToken ^js for-statement))
  (^js [for-statement source-file]
   (.getLastToken ^js for-statement source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [for-statement cb-node]
   (.forEachChild ^js for-statement cb-node))
  (^js [for-statement cb-node cb-node-array]
   (.forEachChild ^js for-statement cb-node cb-node-array)))

(defn pos
  "**Returns:** `number`"
  ^js [for-statement]
  (.-pos ^js for-statement))

(defn end
  "**Returns:** `number`"
  ^js [for-statement]
  (.-end ^js for-statement))
