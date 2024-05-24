(ns dots.typescript.iteration-statement)

(defn statement
  ^js [iteration-statement]
  (.-statement ^js iteration-statement))

(defn kind
  ^js [iteration-statement]
  (.-kind ^js iteration-statement))

(defn flags
  ^js [iteration-statement]
  (.-flags ^js iteration-statement))

(defn parent
  ^js [iteration-statement]
  (.-parent ^js iteration-statement))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [iteration-statement]
  (.getSourceFile ^js iteration-statement))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [iteration-statement]
   (.getChildCount ^js iteration-statement))
  (^js [iteration-statement source-file]
   (.getChildCount ^js iteration-statement source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [iteration-statement index]
   (.getChildAt ^js iteration-statement index))
  (^js [iteration-statement index source-file]
   (.getChildAt ^js iteration-statement index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [iteration-statement]
   (.getChildren ^js iteration-statement))
  (^js [iteration-statement source-file]
   (.getChildren ^js iteration-statement source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [iteration-statement]
   (.getStart ^js iteration-statement))
  (^js [iteration-statement source-file]
   (.getStart ^js iteration-statement source-file))
  (^js [iteration-statement source-file include-js-doc-comment?]
   (.getStart ^js iteration-statement source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [iteration-statement]
  (.getFullStart ^js iteration-statement))

(defn get-end
  "**Returns:** `number`"
  ^js [iteration-statement]
  (.getEnd ^js iteration-statement))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [iteration-statement]
   (.getWidth ^js iteration-statement))
  (^js [iteration-statement source-file]
   (.getWidth ^js iteration-statement source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [iteration-statement]
  (.getFullWidth ^js iteration-statement))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [iteration-statement]
   (.getLeadingTriviaWidth ^js iteration-statement))
  (^js [iteration-statement source-file]
   (.getLeadingTriviaWidth ^js iteration-statement source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [iteration-statement]
   (.getFullText ^js iteration-statement))
  (^js [iteration-statement source-file]
   (.getFullText ^js iteration-statement source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [iteration-statement]
   (.getText ^js iteration-statement))
  (^js [iteration-statement source-file]
   (.getText ^js iteration-statement source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [iteration-statement]
   (.getFirstToken ^js iteration-statement))
  (^js [iteration-statement source-file]
   (.getFirstToken ^js iteration-statement source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [iteration-statement]
   (.getLastToken ^js iteration-statement))
  (^js [iteration-statement source-file]
   (.getLastToken ^js iteration-statement source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [iteration-statement cb-node]
   (.forEachChild ^js iteration-statement cb-node))
  (^js [iteration-statement cb-node cb-node-array]
   (.forEachChild ^js iteration-statement cb-node cb-node-array)))

(defn pos
  ^js [iteration-statement]
  (.-pos ^js iteration-statement))

(defn end
  ^js [iteration-statement]
  (.-end ^js iteration-statement))
