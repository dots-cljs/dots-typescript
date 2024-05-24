(ns dots.typescript.break-statement)

(defn kind
  ^js [break-statement]
  (.-kind ^js break-statement))

(defn label
  ^js [break-statement]
  (.-label ^js break-statement))

(defn flags
  ^js [break-statement]
  (.-flags ^js break-statement))

(defn parent
  ^js [break-statement]
  (.-parent ^js break-statement))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [break-statement]
  (.getSourceFile ^js break-statement))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [break-statement]
   (.getChildCount ^js break-statement))
  (^js [break-statement source-file]
   (.getChildCount ^js break-statement source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [break-statement index]
   (.getChildAt ^js break-statement index))
  (^js [break-statement index source-file]
   (.getChildAt ^js break-statement index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [break-statement]
   (.getChildren ^js break-statement))
  (^js [break-statement source-file]
   (.getChildren ^js break-statement source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [break-statement]
   (.getStart ^js break-statement))
  (^js [break-statement source-file]
   (.getStart ^js break-statement source-file))
  (^js [break-statement source-file include-js-doc-comment?]
   (.getStart ^js break-statement source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [break-statement]
  (.getFullStart ^js break-statement))

(defn get-end
  "**Returns:** `number`"
  ^js [break-statement]
  (.getEnd ^js break-statement))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [break-statement]
   (.getWidth ^js break-statement))
  (^js [break-statement source-file]
   (.getWidth ^js break-statement source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [break-statement]
  (.getFullWidth ^js break-statement))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [break-statement]
   (.getLeadingTriviaWidth ^js break-statement))
  (^js [break-statement source-file]
   (.getLeadingTriviaWidth ^js break-statement source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [break-statement]
   (.getFullText ^js break-statement))
  (^js [break-statement source-file]
   (.getFullText ^js break-statement source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [break-statement]
   (.getText ^js break-statement))
  (^js [break-statement source-file]
   (.getText ^js break-statement source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [break-statement]
   (.getFirstToken ^js break-statement))
  (^js [break-statement source-file]
   (.getFirstToken ^js break-statement source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [break-statement]
   (.getLastToken ^js break-statement))
  (^js [break-statement source-file]
   (.getLastToken ^js break-statement source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [break-statement cb-node]
   (.forEachChild ^js break-statement cb-node))
  (^js [break-statement cb-node cb-node-array]
   (.forEachChild ^js break-statement cb-node cb-node-array)))

(defn pos
  ^js [break-statement]
  (.-pos ^js break-statement))

(defn end
  ^js [break-statement]
  (.-end ^js break-statement))
