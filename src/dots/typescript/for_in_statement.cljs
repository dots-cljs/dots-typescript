(ns dots.typescript.for-in-statement)

(defn kind
  ^js [for-in-statement]
  (.-kind ^js for-in-statement))

(defn initializer
  ^js [for-in-statement]
  (.-initializer ^js for-in-statement))

(defn expression
  ^js [for-in-statement]
  (.-expression ^js for-in-statement))

(defn statement
  ^js [for-in-statement]
  (.-statement ^js for-in-statement))

(defn flags
  ^js [for-in-statement]
  (.-flags ^js for-in-statement))

(defn parent
  ^js [for-in-statement]
  (.-parent ^js for-in-statement))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [for-in-statement]
  (.getSourceFile ^js for-in-statement))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [for-in-statement]
   (.getChildCount ^js for-in-statement))
  (^js [for-in-statement source-file]
   (.getChildCount ^js for-in-statement source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [for-in-statement index]
   (.getChildAt ^js for-in-statement index))
  (^js [for-in-statement index source-file]
   (.getChildAt ^js for-in-statement index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [for-in-statement]
   (.getChildren ^js for-in-statement))
  (^js [for-in-statement source-file]
   (.getChildren ^js for-in-statement source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [for-in-statement]
   (.getStart ^js for-in-statement))
  (^js [for-in-statement source-file]
   (.getStart ^js for-in-statement source-file))
  (^js [for-in-statement source-file include-js-doc-comment?]
   (.getStart ^js for-in-statement source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [for-in-statement]
  (.getFullStart ^js for-in-statement))

(defn get-end
  "**Returns:** `number`"
  ^js [for-in-statement]
  (.getEnd ^js for-in-statement))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [for-in-statement]
   (.getWidth ^js for-in-statement))
  (^js [for-in-statement source-file]
   (.getWidth ^js for-in-statement source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [for-in-statement]
  (.getFullWidth ^js for-in-statement))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [for-in-statement]
   (.getLeadingTriviaWidth ^js for-in-statement))
  (^js [for-in-statement source-file]
   (.getLeadingTriviaWidth ^js for-in-statement source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [for-in-statement]
   (.getFullText ^js for-in-statement))
  (^js [for-in-statement source-file]
   (.getFullText ^js for-in-statement source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [for-in-statement]
   (.getText ^js for-in-statement))
  (^js [for-in-statement source-file]
   (.getText ^js for-in-statement source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [for-in-statement]
   (.getFirstToken ^js for-in-statement))
  (^js [for-in-statement source-file]
   (.getFirstToken ^js for-in-statement source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [for-in-statement]
   (.getLastToken ^js for-in-statement))
  (^js [for-in-statement source-file]
   (.getLastToken ^js for-in-statement source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [for-in-statement cb-node]
   (.forEachChild ^js for-in-statement cb-node))
  (^js [for-in-statement cb-node cb-node-array]
   (.forEachChild ^js for-in-statement cb-node cb-node-array)))

(defn pos
  ^js [for-in-statement]
  (.-pos ^js for-in-statement))

(defn end
  ^js [for-in-statement]
  (.-end ^js for-in-statement))
