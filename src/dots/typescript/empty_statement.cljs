(ns dots.typescript.empty-statement)

(defn kind
  ^js [empty-statement]
  (.-kind ^js empty-statement))

(defn flags
  ^js [empty-statement]
  (.-flags ^js empty-statement))

(defn parent
  ^js [empty-statement]
  (.-parent ^js empty-statement))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [empty-statement]
  (.getSourceFile ^js empty-statement))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [empty-statement]
   (.getChildCount ^js empty-statement))
  (^js [empty-statement source-file]
   (.getChildCount ^js empty-statement source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [empty-statement index]
   (.getChildAt ^js empty-statement index))
  (^js [empty-statement index source-file]
   (.getChildAt ^js empty-statement index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [empty-statement]
   (.getChildren ^js empty-statement))
  (^js [empty-statement source-file]
   (.getChildren ^js empty-statement source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [empty-statement]
   (.getStart ^js empty-statement))
  (^js [empty-statement source-file]
   (.getStart ^js empty-statement source-file))
  (^js [empty-statement source-file include-js-doc-comment?]
   (.getStart ^js empty-statement source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [empty-statement]
  (.getFullStart ^js empty-statement))

(defn get-end
  "**Returns:** `number`"
  ^js [empty-statement]
  (.getEnd ^js empty-statement))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [empty-statement]
   (.getWidth ^js empty-statement))
  (^js [empty-statement source-file]
   (.getWidth ^js empty-statement source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [empty-statement]
  (.getFullWidth ^js empty-statement))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [empty-statement]
   (.getLeadingTriviaWidth ^js empty-statement))
  (^js [empty-statement source-file]
   (.getLeadingTriviaWidth ^js empty-statement source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [empty-statement]
   (.getFullText ^js empty-statement))
  (^js [empty-statement source-file]
   (.getFullText ^js empty-statement source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [empty-statement]
   (.getText ^js empty-statement))
  (^js [empty-statement source-file]
   (.getText ^js empty-statement source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [empty-statement]
   (.getFirstToken ^js empty-statement))
  (^js [empty-statement source-file]
   (.getFirstToken ^js empty-statement source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [empty-statement]
   (.getLastToken ^js empty-statement))
  (^js [empty-statement source-file]
   (.getLastToken ^js empty-statement source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [empty-statement cb-node]
   (.forEachChild ^js empty-statement cb-node))
  (^js [empty-statement cb-node cb-node-array]
   (.forEachChild ^js empty-statement cb-node cb-node-array)))

(defn pos
  ^js [empty-statement]
  (.-pos ^js empty-statement))

(defn end
  ^js [empty-statement]
  (.-end ^js empty-statement))
