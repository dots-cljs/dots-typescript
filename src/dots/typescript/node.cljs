(ns dots.typescript.node)

(defn kind
  ^js [node]
  (.-kind ^js node))

(defn flags
  ^js [node]
  (.-flags ^js node))

(defn parent
  ^js [node]
  (.-parent ^js node))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [node]
  (.getSourceFile ^js node))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [node]
   (.getChildCount ^js node))
  (^js [node source-file]
   (.getChildCount ^js node source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [node index]
   (.getChildAt ^js node index))
  (^js [node index source-file]
   (.getChildAt ^js node index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [node]
   (.getChildren ^js node))
  (^js [node source-file]
   (.getChildren ^js node source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [node]
   (.getStart ^js node))
  (^js [node source-file]
   (.getStart ^js node source-file))
  (^js [node source-file include-js-doc-comment?]
   (.getStart ^js node source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [node]
  (.getFullStart ^js node))

(defn get-end
  "**Returns:** `number`"
  ^js [node]
  (.getEnd ^js node))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [node]
   (.getWidth ^js node))
  (^js [node source-file]
   (.getWidth ^js node source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [node]
  (.getFullWidth ^js node))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [node]
   (.getLeadingTriviaWidth ^js node))
  (^js [node source-file]
   (.getLeadingTriviaWidth ^js node source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [node]
   (.getFullText ^js node))
  (^js [node source-file]
   (.getFullText ^js node source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [node]
   (.getText ^js node))
  (^js [node source-file]
   (.getText ^js node source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [node]
   (.getFirstToken ^js node))
  (^js [node source-file]
   (.getFirstToken ^js node source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [node]
   (.getLastToken ^js node))
  (^js [node source-file]
   (.getLastToken ^js node source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [node cb-node]
   (.forEachChild ^js node cb-node))
  (^js [node cb-node cb-node-array]
   (.forEachChild ^js node cb-node cb-node-array)))

(defn pos
  ^js [node]
  (.-pos ^js node))

(defn end
  ^js [node]
  (.-end ^js node))
