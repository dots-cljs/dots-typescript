(ns dots.typescript.statement)

(defn kind
  ^js [statement]
  (.-kind ^js statement))

(defn flags
  ^js [statement]
  (.-flags ^js statement))

(defn parent
  ^js [statement]
  (.-parent ^js statement))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [statement]
  (.getSourceFile ^js statement))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [statement]
   (.getChildCount ^js statement))
  (^js [statement source-file]
   (.getChildCount ^js statement source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [statement index]
   (.getChildAt ^js statement index))
  (^js [statement index source-file]
   (.getChildAt ^js statement index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [statement]
   (.getChildren ^js statement))
  (^js [statement source-file]
   (.getChildren ^js statement source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [statement]
   (.getStart ^js statement))
  (^js [statement source-file]
   (.getStart ^js statement source-file))
  (^js [statement source-file include-js-doc-comment?]
   (.getStart ^js statement source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [statement]
  (.getFullStart ^js statement))

(defn get-end
  "**Returns:** `number`"
  ^js [statement]
  (.getEnd ^js statement))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [statement]
   (.getWidth ^js statement))
  (^js [statement source-file]
   (.getWidth ^js statement source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [statement]
  (.getFullWidth ^js statement))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [statement]
   (.getLeadingTriviaWidth ^js statement))
  (^js [statement source-file]
   (.getLeadingTriviaWidth ^js statement source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [statement]
   (.getFullText ^js statement))
  (^js [statement source-file]
   (.getFullText ^js statement source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [statement]
   (.getText ^js statement))
  (^js [statement source-file]
   (.getText ^js statement source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [statement]
   (.getFirstToken ^js statement))
  (^js [statement source-file]
   (.getFirstToken ^js statement source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [statement]
   (.getLastToken ^js statement))
  (^js [statement source-file]
   (.getLastToken ^js statement source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [statement cb-node]
   (.forEachChild ^js statement cb-node))
  (^js [statement cb-node cb-node-array]
   (.forEachChild ^js statement cb-node cb-node-array)))

(defn pos
  ^js [statement]
  (.-pos ^js statement))

(defn end
  ^js [statement]
  (.-end ^js statement))
