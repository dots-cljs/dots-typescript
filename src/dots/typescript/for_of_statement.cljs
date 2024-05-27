(ns dots.typescript.for-of-statement)

(defn kind
  "**Returns:** `SyntaxKind.ForOfStatement`"
  ^js [for-of-statement]
  (.-kind ^js for-of-statement))

(defn await-modifier
  "**Returns:** `AwaitKeyword | undefined`"
  ^js [for-of-statement]
  (.-awaitModifier ^js for-of-statement))

(defn initializer
  "**Returns:** `ForInitializer`"
  ^js [for-of-statement]
  (.-initializer ^js for-of-statement))

(defn expression
  "**Returns:** `Expression`"
  ^js [for-of-statement]
  (.-expression ^js for-of-statement))

(defn statement
  "**Returns:** `Statement`"
  ^js [for-of-statement]
  (.-statement ^js for-of-statement))

(defn flags
  "**Returns:** `NodeFlags`"
  ^js [for-of-statement]
  (.-flags ^js for-of-statement))

(defn parent
  "**Returns:** `Node`"
  ^js [for-of-statement]
  (.-parent ^js for-of-statement))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [for-of-statement]
  (.getSourceFile ^js for-of-statement))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [for-of-statement]
   (.getChildCount ^js for-of-statement))
  (^js [for-of-statement source-file]
   (.getChildCount ^js for-of-statement source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [for-of-statement index]
   (.getChildAt ^js for-of-statement index))
  (^js [for-of-statement index source-file]
   (.getChildAt ^js for-of-statement index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [for-of-statement]
   (.getChildren ^js for-of-statement))
  (^js [for-of-statement source-file]
   (.getChildren ^js for-of-statement source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [for-of-statement]
   (.getStart ^js for-of-statement))
  (^js [for-of-statement source-file]
   (.getStart ^js for-of-statement source-file))
  (^js [for-of-statement source-file include-js-doc-comment?]
   (.getStart ^js for-of-statement source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [for-of-statement]
  (.getFullStart ^js for-of-statement))

(defn get-end
  "**Returns:** `number`"
  ^js [for-of-statement]
  (.getEnd ^js for-of-statement))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [for-of-statement]
   (.getWidth ^js for-of-statement))
  (^js [for-of-statement source-file]
   (.getWidth ^js for-of-statement source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [for-of-statement]
  (.getFullWidth ^js for-of-statement))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [for-of-statement]
   (.getLeadingTriviaWidth ^js for-of-statement))
  (^js [for-of-statement source-file]
   (.getLeadingTriviaWidth ^js for-of-statement source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [for-of-statement]
   (.getFullText ^js for-of-statement))
  (^js [for-of-statement source-file]
   (.getFullText ^js for-of-statement source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [for-of-statement]
   (.getText ^js for-of-statement))
  (^js [for-of-statement source-file]
   (.getText ^js for-of-statement source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [for-of-statement]
   (.getFirstToken ^js for-of-statement))
  (^js [for-of-statement source-file]
   (.getFirstToken ^js for-of-statement source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [for-of-statement]
   (.getLastToken ^js for-of-statement))
  (^js [for-of-statement source-file]
   (.getLastToken ^js for-of-statement source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [for-of-statement cb-node]
   (.forEachChild ^js for-of-statement cb-node))
  (^js [for-of-statement cb-node cb-node-array]
   (.forEachChild ^js for-of-statement cb-node cb-node-array)))

(defn pos
  "**Returns:** `number`"
  ^js [for-of-statement]
  (.-pos ^js for-of-statement))

(defn end
  "**Returns:** `number`"
  ^js [for-of-statement]
  (.-end ^js for-of-statement))
