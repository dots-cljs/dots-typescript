(ns dots.typescript.while-statement)

(defn kind
  "**Returns:** `SyntaxKind.WhileStatement`"
  ^js [while-statement]
  (.-kind ^js while-statement))

(defn expression
  "**Returns:** `Expression`"
  ^js [while-statement]
  (.-expression ^js while-statement))

(defn statement
  "**Returns:** `Statement`"
  ^js [while-statement]
  (.-statement ^js while-statement))

(defn flags
  "**Returns:** `NodeFlags`"
  ^js [while-statement]
  (.-flags ^js while-statement))

(defn parent
  "**Returns:** `Node`"
  ^js [while-statement]
  (.-parent ^js while-statement))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [while-statement]
  (.getSourceFile ^js while-statement))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [while-statement]
   (.getChildCount ^js while-statement))
  (^js [while-statement source-file]
   (.getChildCount ^js while-statement source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [while-statement index]
   (.getChildAt ^js while-statement index))
  (^js [while-statement index source-file]
   (.getChildAt ^js while-statement index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [while-statement]
   (.getChildren ^js while-statement))
  (^js [while-statement source-file]
   (.getChildren ^js while-statement source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [while-statement]
   (.getStart ^js while-statement))
  (^js [while-statement source-file]
   (.getStart ^js while-statement source-file))
  (^js [while-statement source-file include-js-doc-comment?]
   (.getStart ^js while-statement source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [while-statement]
  (.getFullStart ^js while-statement))

(defn get-end
  "**Returns:** `number`"
  ^js [while-statement]
  (.getEnd ^js while-statement))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [while-statement]
   (.getWidth ^js while-statement))
  (^js [while-statement source-file]
   (.getWidth ^js while-statement source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [while-statement]
  (.getFullWidth ^js while-statement))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [while-statement]
   (.getLeadingTriviaWidth ^js while-statement))
  (^js [while-statement source-file]
   (.getLeadingTriviaWidth ^js while-statement source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [while-statement]
   (.getFullText ^js while-statement))
  (^js [while-statement source-file]
   (.getFullText ^js while-statement source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [while-statement]
   (.getText ^js while-statement))
  (^js [while-statement source-file]
   (.getText ^js while-statement source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [while-statement]
   (.getFirstToken ^js while-statement))
  (^js [while-statement source-file]
   (.getFirstToken ^js while-statement source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [while-statement]
   (.getLastToken ^js while-statement))
  (^js [while-statement source-file]
   (.getLastToken ^js while-statement source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [while-statement cb-node]
   (.forEachChild ^js while-statement cb-node))
  (^js [while-statement cb-node cb-node-array]
   (.forEachChild ^js while-statement cb-node cb-node-array)))

(defn pos
  "**Returns:** `number`"
  ^js [while-statement]
  (.-pos ^js while-statement))

(defn end
  "**Returns:** `number`"
  ^js [while-statement]
  (.-end ^js while-statement))
