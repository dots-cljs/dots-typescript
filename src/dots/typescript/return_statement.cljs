(ns dots.typescript.return-statement)

(defn kind
  "**Returns:** `SyntaxKind.ReturnStatement`"
  ^js [return-statement]
  (.-kind ^js return-statement))

(defn expression
  "**Returns:** `Expression | undefined`"
  ^js [return-statement]
  (.-expression ^js return-statement))

(defn flags
  "**Returns:** `NodeFlags`"
  ^js [return-statement]
  (.-flags ^js return-statement))

(defn parent
  "**Returns:** `Node`"
  ^js [return-statement]
  (.-parent ^js return-statement))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [return-statement]
  (.getSourceFile ^js return-statement))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [return-statement]
   (.getChildCount ^js return-statement))
  (^js [return-statement source-file]
   (.getChildCount ^js return-statement source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [return-statement index]
   (.getChildAt ^js return-statement index))
  (^js [return-statement index source-file]
   (.getChildAt ^js return-statement index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [return-statement]
   (.getChildren ^js return-statement))
  (^js [return-statement source-file]
   (.getChildren ^js return-statement source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [return-statement]
   (.getStart ^js return-statement))
  (^js [return-statement source-file]
   (.getStart ^js return-statement source-file))
  (^js [return-statement source-file include-js-doc-comment?]
   (.getStart ^js return-statement source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [return-statement]
  (.getFullStart ^js return-statement))

(defn get-end
  "**Returns:** `number`"
  ^js [return-statement]
  (.getEnd ^js return-statement))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [return-statement]
   (.getWidth ^js return-statement))
  (^js [return-statement source-file]
   (.getWidth ^js return-statement source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [return-statement]
  (.getFullWidth ^js return-statement))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [return-statement]
   (.getLeadingTriviaWidth ^js return-statement))
  (^js [return-statement source-file]
   (.getLeadingTriviaWidth ^js return-statement source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [return-statement]
   (.getFullText ^js return-statement))
  (^js [return-statement source-file]
   (.getFullText ^js return-statement source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [return-statement]
   (.getText ^js return-statement))
  (^js [return-statement source-file]
   (.getText ^js return-statement source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [return-statement]
   (.getFirstToken ^js return-statement))
  (^js [return-statement source-file]
   (.getFirstToken ^js return-statement source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [return-statement]
   (.getLastToken ^js return-statement))
  (^js [return-statement source-file]
   (.getLastToken ^js return-statement source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [return-statement cb-node]
   (.forEachChild ^js return-statement cb-node))
  (^js [return-statement cb-node cb-node-array]
   (.forEachChild ^js return-statement cb-node cb-node-array)))

(defn pos
  "**Returns:** `number`"
  ^js [return-statement]
  (.-pos ^js return-statement))

(defn end
  "**Returns:** `number`"
  ^js [return-statement]
  (.-end ^js return-statement))
