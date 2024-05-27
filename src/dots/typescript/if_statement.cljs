(ns dots.typescript.if-statement)

(defn kind
  "**Returns:** `SyntaxKind.IfStatement`"
  ^js [if-statement]
  (.-kind ^js if-statement))

(defn expression
  "**Returns:** `Expression`"
  ^js [if-statement]
  (.-expression ^js if-statement))

(defn then-statement
  "**Returns:** `Statement`"
  ^js [if-statement]
  (.-thenStatement ^js if-statement))

(defn else-statement
  "**Returns:** `Statement | undefined`"
  ^js [if-statement]
  (.-elseStatement ^js if-statement))

(defn flags
  "**Returns:** `NodeFlags`"
  ^js [if-statement]
  (.-flags ^js if-statement))

(defn parent
  "**Returns:** `Node`"
  ^js [if-statement]
  (.-parent ^js if-statement))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [if-statement]
  (.getSourceFile ^js if-statement))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [if-statement]
   (.getChildCount ^js if-statement))
  (^js [if-statement source-file]
   (.getChildCount ^js if-statement source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [if-statement index]
   (.getChildAt ^js if-statement index))
  (^js [if-statement index source-file]
   (.getChildAt ^js if-statement index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [if-statement]
   (.getChildren ^js if-statement))
  (^js [if-statement source-file]
   (.getChildren ^js if-statement source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [if-statement]
   (.getStart ^js if-statement))
  (^js [if-statement source-file]
   (.getStart ^js if-statement source-file))
  (^js [if-statement source-file include-js-doc-comment?]
   (.getStart ^js if-statement source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [if-statement]
  (.getFullStart ^js if-statement))

(defn get-end
  "**Returns:** `number`"
  ^js [if-statement]
  (.getEnd ^js if-statement))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [if-statement]
   (.getWidth ^js if-statement))
  (^js [if-statement source-file]
   (.getWidth ^js if-statement source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [if-statement]
  (.getFullWidth ^js if-statement))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [if-statement]
   (.getLeadingTriviaWidth ^js if-statement))
  (^js [if-statement source-file]
   (.getLeadingTriviaWidth ^js if-statement source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [if-statement]
   (.getFullText ^js if-statement))
  (^js [if-statement source-file]
   (.getFullText ^js if-statement source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [if-statement]
   (.getText ^js if-statement))
  (^js [if-statement source-file]
   (.getText ^js if-statement source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [if-statement]
   (.getFirstToken ^js if-statement))
  (^js [if-statement source-file]
   (.getFirstToken ^js if-statement source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [if-statement]
   (.getLastToken ^js if-statement))
  (^js [if-statement source-file]
   (.getLastToken ^js if-statement source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [if-statement cb-node]
   (.forEachChild ^js if-statement cb-node))
  (^js [if-statement cb-node cb-node-array]
   (.forEachChild ^js if-statement cb-node cb-node-array)))

(defn pos
  "**Returns:** `number`"
  ^js [if-statement]
  (.-pos ^js if-statement))

(defn end
  "**Returns:** `number`"
  ^js [if-statement]
  (.-end ^js if-statement))
