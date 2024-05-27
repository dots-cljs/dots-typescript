(ns dots.typescript.throw-statement)

(defn kind
  "**Returns:** `SyntaxKind.ThrowStatement`"
  ^js [throw-statement]
  (.-kind ^js throw-statement))

(defn expression
  "**Returns:** `Expression`"
  ^js [throw-statement]
  (.-expression ^js throw-statement))

(defn flags
  "**Returns:** `NodeFlags`"
  ^js [throw-statement]
  (.-flags ^js throw-statement))

(defn parent
  "**Returns:** `Node`"
  ^js [throw-statement]
  (.-parent ^js throw-statement))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [throw-statement]
  (.getSourceFile ^js throw-statement))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [throw-statement]
   (.getChildCount ^js throw-statement))
  (^js [throw-statement source-file]
   (.getChildCount ^js throw-statement source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [throw-statement index]
   (.getChildAt ^js throw-statement index))
  (^js [throw-statement index source-file]
   (.getChildAt ^js throw-statement index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [throw-statement]
   (.getChildren ^js throw-statement))
  (^js [throw-statement source-file]
   (.getChildren ^js throw-statement source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [throw-statement]
   (.getStart ^js throw-statement))
  (^js [throw-statement source-file]
   (.getStart ^js throw-statement source-file))
  (^js [throw-statement source-file include-js-doc-comment?]
   (.getStart ^js throw-statement source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [throw-statement]
  (.getFullStart ^js throw-statement))

(defn get-end
  "**Returns:** `number`"
  ^js [throw-statement]
  (.getEnd ^js throw-statement))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [throw-statement]
   (.getWidth ^js throw-statement))
  (^js [throw-statement source-file]
   (.getWidth ^js throw-statement source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [throw-statement]
  (.getFullWidth ^js throw-statement))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [throw-statement]
   (.getLeadingTriviaWidth ^js throw-statement))
  (^js [throw-statement source-file]
   (.getLeadingTriviaWidth ^js throw-statement source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [throw-statement]
   (.getFullText ^js throw-statement))
  (^js [throw-statement source-file]
   (.getFullText ^js throw-statement source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [throw-statement]
   (.getText ^js throw-statement))
  (^js [throw-statement source-file]
   (.getText ^js throw-statement source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [throw-statement]
   (.getFirstToken ^js throw-statement))
  (^js [throw-statement source-file]
   (.getFirstToken ^js throw-statement source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [throw-statement]
   (.getLastToken ^js throw-statement))
  (^js [throw-statement source-file]
   (.getLastToken ^js throw-statement source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [throw-statement cb-node]
   (.forEachChild ^js throw-statement cb-node))
  (^js [throw-statement cb-node cb-node-array]
   (.forEachChild ^js throw-statement cb-node cb-node-array)))

(defn pos
  "**Returns:** `number`"
  ^js [throw-statement]
  (.-pos ^js throw-statement))

(defn end
  "**Returns:** `number`"
  ^js [throw-statement]
  (.-end ^js throw-statement))
