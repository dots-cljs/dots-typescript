(ns dots.typescript.expression-statement)

(defn kind
  "**Returns:** `SyntaxKind.ExpressionStatement`"
  ^js [expression-statement]
  (.-kind ^js expression-statement))

(defn expression
  "**Returns:** `Expression`"
  ^js [expression-statement]
  (.-expression ^js expression-statement))

(defn flags
  "**Returns:** `NodeFlags`"
  ^js [expression-statement]
  (.-flags ^js expression-statement))

(defn parent
  "**Returns:** `Node`"
  ^js [expression-statement]
  (.-parent ^js expression-statement))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [expression-statement]
  (.getSourceFile ^js expression-statement))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [expression-statement]
   (.getChildCount ^js expression-statement))
  (^js [expression-statement source-file]
   (.getChildCount ^js expression-statement source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [expression-statement index]
   (.getChildAt ^js expression-statement index))
  (^js [expression-statement index source-file]
   (.getChildAt ^js expression-statement index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [expression-statement]
   (.getChildren ^js expression-statement))
  (^js [expression-statement source-file]
   (.getChildren ^js expression-statement source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [expression-statement]
   (.getStart ^js expression-statement))
  (^js [expression-statement source-file]
   (.getStart ^js expression-statement source-file))
  (^js [expression-statement source-file include-js-doc-comment?]
   (.getStart ^js expression-statement source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [expression-statement]
  (.getFullStart ^js expression-statement))

(defn get-end
  "**Returns:** `number`"
  ^js [expression-statement]
  (.getEnd ^js expression-statement))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [expression-statement]
   (.getWidth ^js expression-statement))
  (^js [expression-statement source-file]
   (.getWidth ^js expression-statement source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [expression-statement]
  (.getFullWidth ^js expression-statement))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [expression-statement]
   (.getLeadingTriviaWidth ^js expression-statement))
  (^js [expression-statement source-file]
   (.getLeadingTriviaWidth ^js expression-statement source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [expression-statement]
   (.getFullText ^js expression-statement))
  (^js [expression-statement source-file]
   (.getFullText ^js expression-statement source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [expression-statement]
   (.getText ^js expression-statement))
  (^js [expression-statement source-file]
   (.getText ^js expression-statement source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [expression-statement]
   (.getFirstToken ^js expression-statement))
  (^js [expression-statement source-file]
   (.getFirstToken ^js expression-statement source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [expression-statement]
   (.getLastToken ^js expression-statement))
  (^js [expression-statement source-file]
   (.getLastToken ^js expression-statement source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [expression-statement cb-node]
   (.forEachChild ^js expression-statement cb-node))
  (^js [expression-statement cb-node cb-node-array]
   (.forEachChild ^js expression-statement cb-node cb-node-array)))

(defn pos
  "**Returns:** `number`"
  ^js [expression-statement]
  (.-pos ^js expression-statement))

(defn end
  "**Returns:** `number`"
  ^js [expression-statement]
  (.-end ^js expression-statement))
