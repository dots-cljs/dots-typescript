(ns dots.typescript.token)

(defn kind
  "**Returns:** `TKind`"
  ^js [token]
  (.-kind ^js token))

(defn flags
  "**Returns:** `NodeFlags`"
  ^js [token]
  (.-flags ^js token))

(defn parent
  "**Returns:** `Node`"
  ^js [token]
  (.-parent ^js token))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [token]
  (.getSourceFile ^js token))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [token]
   (.getChildCount ^js token))
  (^js [token source-file]
   (.getChildCount ^js token source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [token index]
   (.getChildAt ^js token index))
  (^js [token index source-file]
   (.getChildAt ^js token index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [token]
   (.getChildren ^js token))
  (^js [token source-file]
   (.getChildren ^js token source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [token]
   (.getStart ^js token))
  (^js [token source-file]
   (.getStart ^js token source-file))
  (^js [token source-file include-js-doc-comment?]
   (.getStart ^js token source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [token]
  (.getFullStart ^js token))

(defn get-end
  "**Returns:** `number`"
  ^js [token]
  (.getEnd ^js token))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [token]
   (.getWidth ^js token))
  (^js [token source-file]
   (.getWidth ^js token source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [token]
  (.getFullWidth ^js token))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [token]
   (.getLeadingTriviaWidth ^js token))
  (^js [token source-file]
   (.getLeadingTriviaWidth ^js token source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [token]
   (.getFullText ^js token))
  (^js [token source-file]
   (.getFullText ^js token source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [token]
   (.getText ^js token))
  (^js [token source-file]
   (.getText ^js token source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [token]
   (.getFirstToken ^js token))
  (^js [token source-file]
   (.getFirstToken ^js token source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [token]
   (.getLastToken ^js token))
  (^js [token source-file]
   (.getLastToken ^js token source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [token cb-node]
   (.forEachChild ^js token cb-node))
  (^js [token cb-node cb-node-array]
   (.forEachChild ^js token cb-node cb-node-array)))

(defn pos
  "**Returns:** `number`"
  ^js [token]
  (.-pos ^js token))

(defn end
  "**Returns:** `number`"
  ^js [token]
  (.-end ^js token))
