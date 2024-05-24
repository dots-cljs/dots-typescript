(ns dots.typescript.keyword-token)

(defn kind
  ^js [keyword-token]
  (.-kind ^js keyword-token))

(defn flags
  ^js [keyword-token]
  (.-flags ^js keyword-token))

(defn parent
  ^js [keyword-token]
  (.-parent ^js keyword-token))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [keyword-token]
  (.getSourceFile ^js keyword-token))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [keyword-token]
   (.getChildCount ^js keyword-token))
  (^js [keyword-token source-file]
   (.getChildCount ^js keyword-token source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [keyword-token index]
   (.getChildAt ^js keyword-token index))
  (^js [keyword-token index source-file]
   (.getChildAt ^js keyword-token index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [keyword-token]
   (.getChildren ^js keyword-token))
  (^js [keyword-token source-file]
   (.getChildren ^js keyword-token source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [keyword-token]
   (.getStart ^js keyword-token))
  (^js [keyword-token source-file]
   (.getStart ^js keyword-token source-file))
  (^js [keyword-token source-file include-js-doc-comment?]
   (.getStart ^js keyword-token source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [keyword-token]
  (.getFullStart ^js keyword-token))

(defn get-end
  "**Returns:** `number`"
  ^js [keyword-token]
  (.getEnd ^js keyword-token))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [keyword-token]
   (.getWidth ^js keyword-token))
  (^js [keyword-token source-file]
   (.getWidth ^js keyword-token source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [keyword-token]
  (.getFullWidth ^js keyword-token))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [keyword-token]
   (.getLeadingTriviaWidth ^js keyword-token))
  (^js [keyword-token source-file]
   (.getLeadingTriviaWidth ^js keyword-token source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [keyword-token]
   (.getFullText ^js keyword-token))
  (^js [keyword-token source-file]
   (.getFullText ^js keyword-token source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [keyword-token]
   (.getText ^js keyword-token))
  (^js [keyword-token source-file]
   (.getText ^js keyword-token source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [keyword-token]
   (.getFirstToken ^js keyword-token))
  (^js [keyword-token source-file]
   (.getFirstToken ^js keyword-token source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [keyword-token]
   (.getLastToken ^js keyword-token))
  (^js [keyword-token source-file]
   (.getLastToken ^js keyword-token source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [keyword-token cb-node]
   (.forEachChild ^js keyword-token cb-node))
  (^js [keyword-token cb-node cb-node-array]
   (.forEachChild ^js keyword-token cb-node cb-node-array)))

(defn pos
  ^js [keyword-token]
  (.-pos ^js keyword-token))

(defn end
  ^js [keyword-token]
  (.-end ^js keyword-token))
