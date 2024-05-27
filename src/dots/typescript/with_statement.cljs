(ns dots.typescript.with-statement)

(defn kind
  "**Returns:** `SyntaxKind.WithStatement`"
  ^js [with-statement]
  (.-kind ^js with-statement))

(defn expression
  "**Returns:** `Expression`"
  ^js [with-statement]
  (.-expression ^js with-statement))

(defn statement
  "**Returns:** `Statement`"
  ^js [with-statement]
  (.-statement ^js with-statement))

(defn flags
  "**Returns:** `NodeFlags`"
  ^js [with-statement]
  (.-flags ^js with-statement))

(defn parent
  "**Returns:** `Node`"
  ^js [with-statement]
  (.-parent ^js with-statement))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [with-statement]
  (.getSourceFile ^js with-statement))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [with-statement]
   (.getChildCount ^js with-statement))
  (^js [with-statement source-file]
   (.getChildCount ^js with-statement source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [with-statement index]
   (.getChildAt ^js with-statement index))
  (^js [with-statement index source-file]
   (.getChildAt ^js with-statement index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [with-statement]
   (.getChildren ^js with-statement))
  (^js [with-statement source-file]
   (.getChildren ^js with-statement source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [with-statement]
   (.getStart ^js with-statement))
  (^js [with-statement source-file]
   (.getStart ^js with-statement source-file))
  (^js [with-statement source-file include-js-doc-comment?]
   (.getStart ^js with-statement source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [with-statement]
  (.getFullStart ^js with-statement))

(defn get-end
  "**Returns:** `number`"
  ^js [with-statement]
  (.getEnd ^js with-statement))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [with-statement]
   (.getWidth ^js with-statement))
  (^js [with-statement source-file]
   (.getWidth ^js with-statement source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [with-statement]
  (.getFullWidth ^js with-statement))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [with-statement]
   (.getLeadingTriviaWidth ^js with-statement))
  (^js [with-statement source-file]
   (.getLeadingTriviaWidth ^js with-statement source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [with-statement]
   (.getFullText ^js with-statement))
  (^js [with-statement source-file]
   (.getFullText ^js with-statement source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [with-statement]
   (.getText ^js with-statement))
  (^js [with-statement source-file]
   (.getText ^js with-statement source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [with-statement]
   (.getFirstToken ^js with-statement))
  (^js [with-statement source-file]
   (.getFirstToken ^js with-statement source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [with-statement]
   (.getLastToken ^js with-statement))
  (^js [with-statement source-file]
   (.getLastToken ^js with-statement source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [with-statement cb-node]
   (.forEachChild ^js with-statement cb-node))
  (^js [with-statement cb-node cb-node-array]
   (.forEachChild ^js with-statement cb-node cb-node-array)))

(defn pos
  "**Returns:** `number`"
  ^js [with-statement]
  (.-pos ^js with-statement))

(defn end
  "**Returns:** `number`"
  ^js [with-statement]
  (.-end ^js with-statement))
