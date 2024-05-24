(ns dots.typescript.debugger-statement)

(defn kind
  ^js [debugger-statement]
  (.-kind ^js debugger-statement))

(defn flags
  ^js [debugger-statement]
  (.-flags ^js debugger-statement))

(defn parent
  ^js [debugger-statement]
  (.-parent ^js debugger-statement))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [debugger-statement]
  (.getSourceFile ^js debugger-statement))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [debugger-statement]
   (.getChildCount ^js debugger-statement))
  (^js [debugger-statement source-file]
   (.getChildCount ^js debugger-statement source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [debugger-statement index]
   (.getChildAt ^js debugger-statement index))
  (^js [debugger-statement index source-file]
   (.getChildAt ^js debugger-statement index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [debugger-statement]
   (.getChildren ^js debugger-statement))
  (^js [debugger-statement source-file]
   (.getChildren ^js debugger-statement source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [debugger-statement]
   (.getStart ^js debugger-statement))
  (^js [debugger-statement source-file]
   (.getStart ^js debugger-statement source-file))
  (^js [debugger-statement source-file include-js-doc-comment?]
   (.getStart ^js debugger-statement source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [debugger-statement]
  (.getFullStart ^js debugger-statement))

(defn get-end
  "**Returns:** `number`"
  ^js [debugger-statement]
  (.getEnd ^js debugger-statement))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [debugger-statement]
   (.getWidth ^js debugger-statement))
  (^js [debugger-statement source-file]
   (.getWidth ^js debugger-statement source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [debugger-statement]
  (.getFullWidth ^js debugger-statement))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [debugger-statement]
   (.getLeadingTriviaWidth ^js debugger-statement))
  (^js [debugger-statement source-file]
   (.getLeadingTriviaWidth ^js debugger-statement source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [debugger-statement]
   (.getFullText ^js debugger-statement))
  (^js [debugger-statement source-file]
   (.getFullText ^js debugger-statement source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [debugger-statement]
   (.getText ^js debugger-statement))
  (^js [debugger-statement source-file]
   (.getText ^js debugger-statement source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [debugger-statement]
   (.getFirstToken ^js debugger-statement))
  (^js [debugger-statement source-file]
   (.getFirstToken ^js debugger-statement source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [debugger-statement]
   (.getLastToken ^js debugger-statement))
  (^js [debugger-statement source-file]
   (.getLastToken ^js debugger-statement source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [debugger-statement cb-node]
   (.forEachChild ^js debugger-statement cb-node))
  (^js [debugger-statement cb-node cb-node-array]
   (.forEachChild ^js debugger-statement cb-node cb-node-array)))

(defn pos
  ^js [debugger-statement]
  (.-pos ^js debugger-statement))

(defn end
  ^js [debugger-statement]
  (.-end ^js debugger-statement))
