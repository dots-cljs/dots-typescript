(ns dots.typescript.json-object-expression-statement)

(defn expression
  "**Returns:** `JsonObjectExpression`"
  ^js [json-object-expression-statement]
  (.-expression ^js json-object-expression-statement))

(defn kind
  "**Returns:** `SyntaxKind.ExpressionStatement`"
  ^js [json-object-expression-statement]
  (.-kind ^js json-object-expression-statement))

(defn flags
  "**Returns:** `NodeFlags`"
  ^js [json-object-expression-statement]
  (.-flags ^js json-object-expression-statement))

(defn parent
  "**Returns:** `Node`"
  ^js [json-object-expression-statement]
  (.-parent ^js json-object-expression-statement))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [json-object-expression-statement]
  (.getSourceFile ^js json-object-expression-statement))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [json-object-expression-statement]
   (.getChildCount ^js json-object-expression-statement))
  (^js [json-object-expression-statement source-file]
   (.getChildCount ^js json-object-expression-statement source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [json-object-expression-statement index]
   (.getChildAt ^js json-object-expression-statement index))
  (^js [json-object-expression-statement index source-file]
   (.getChildAt ^js json-object-expression-statement index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [json-object-expression-statement]
   (.getChildren ^js json-object-expression-statement))
  (^js [json-object-expression-statement source-file]
   (.getChildren ^js json-object-expression-statement source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [json-object-expression-statement]
   (.getStart ^js json-object-expression-statement))
  (^js [json-object-expression-statement source-file]
   (.getStart ^js json-object-expression-statement source-file))
  (^js [json-object-expression-statement source-file include-js-doc-comment?]
   (.getStart ^js json-object-expression-statement source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [json-object-expression-statement]
  (.getFullStart ^js json-object-expression-statement))

(defn get-end
  "**Returns:** `number`"
  ^js [json-object-expression-statement]
  (.getEnd ^js json-object-expression-statement))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [json-object-expression-statement]
   (.getWidth ^js json-object-expression-statement))
  (^js [json-object-expression-statement source-file]
   (.getWidth ^js json-object-expression-statement source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [json-object-expression-statement]
  (.getFullWidth ^js json-object-expression-statement))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [json-object-expression-statement]
   (.getLeadingTriviaWidth ^js json-object-expression-statement))
  (^js [json-object-expression-statement source-file]
   (.getLeadingTriviaWidth ^js json-object-expression-statement source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [json-object-expression-statement]
   (.getFullText ^js json-object-expression-statement))
  (^js [json-object-expression-statement source-file]
   (.getFullText ^js json-object-expression-statement source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [json-object-expression-statement]
   (.getText ^js json-object-expression-statement))
  (^js [json-object-expression-statement source-file]
   (.getText ^js json-object-expression-statement source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [json-object-expression-statement]
   (.getFirstToken ^js json-object-expression-statement))
  (^js [json-object-expression-statement source-file]
   (.getFirstToken ^js json-object-expression-statement source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [json-object-expression-statement]
   (.getLastToken ^js json-object-expression-statement))
  (^js [json-object-expression-statement source-file]
   (.getLastToken ^js json-object-expression-statement source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [json-object-expression-statement cb-node]
   (.forEachChild ^js json-object-expression-statement cb-node))
  (^js [json-object-expression-statement cb-node cb-node-array]
   (.forEachChild ^js json-object-expression-statement cb-node cb-node-array)))

(defn pos
  "**Returns:** `number`"
  ^js [json-object-expression-statement]
  (.-pos ^js json-object-expression-statement))

(defn end
  "**Returns:** `number`"
  ^js [json-object-expression-statement]
  (.-end ^js json-object-expression-statement))
