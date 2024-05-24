(ns dots.typescript.default-clause)

(defn kind
  ^js [default-clause]
  (.-kind ^js default-clause))

(defn parent
  ^js [default-clause]
  (.-parent ^js default-clause))

(defn statements
  ^js [default-clause]
  (.-statements ^js default-clause))

(defn flags
  ^js [default-clause]
  (.-flags ^js default-clause))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [default-clause]
  (.getSourceFile ^js default-clause))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [default-clause]
   (.getChildCount ^js default-clause))
  (^js [default-clause source-file]
   (.getChildCount ^js default-clause source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [default-clause index]
   (.getChildAt ^js default-clause index))
  (^js [default-clause index source-file]
   (.getChildAt ^js default-clause index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [default-clause]
   (.getChildren ^js default-clause))
  (^js [default-clause source-file]
   (.getChildren ^js default-clause source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [default-clause]
   (.getStart ^js default-clause))
  (^js [default-clause source-file]
   (.getStart ^js default-clause source-file))
  (^js [default-clause source-file include-js-doc-comment?]
   (.getStart ^js default-clause source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [default-clause]
  (.getFullStart ^js default-clause))

(defn get-end
  "**Returns:** `number`"
  ^js [default-clause]
  (.getEnd ^js default-clause))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [default-clause]
   (.getWidth ^js default-clause))
  (^js [default-clause source-file]
   (.getWidth ^js default-clause source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [default-clause]
  (.getFullWidth ^js default-clause))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [default-clause]
   (.getLeadingTriviaWidth ^js default-clause))
  (^js [default-clause source-file]
   (.getLeadingTriviaWidth ^js default-clause source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [default-clause]
   (.getFullText ^js default-clause))
  (^js [default-clause source-file]
   (.getFullText ^js default-clause source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [default-clause]
   (.getText ^js default-clause))
  (^js [default-clause source-file]
   (.getText ^js default-clause source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [default-clause]
   (.getFirstToken ^js default-clause))
  (^js [default-clause source-file]
   (.getFirstToken ^js default-clause source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [default-clause]
   (.getLastToken ^js default-clause))
  (^js [default-clause source-file]
   (.getLastToken ^js default-clause source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [default-clause cb-node]
   (.forEachChild ^js default-clause cb-node))
  (^js [default-clause cb-node cb-node-array]
   (.forEachChild ^js default-clause cb-node cb-node-array)))

(defn pos
  ^js [default-clause]
  (.-pos ^js default-clause))

(defn end
  ^js [default-clause]
  (.-end ^js default-clause))
