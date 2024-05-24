(ns dots.typescript.type-query-node)

(defn kind
  ^js [type-query-node]
  (.-kind ^js type-query-node))

(defn expr-name
  ^js [type-query-node]
  (.-exprName ^js type-query-node))

(defn type-arguments
  ^js [type-query-node]
  (.-typeArguments ^js type-query-node))

(defn flags
  ^js [type-query-node]
  (.-flags ^js type-query-node))

(defn parent
  ^js [type-query-node]
  (.-parent ^js type-query-node))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [type-query-node]
  (.getSourceFile ^js type-query-node))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [type-query-node]
   (.getChildCount ^js type-query-node))
  (^js [type-query-node source-file]
   (.getChildCount ^js type-query-node source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [type-query-node index]
   (.getChildAt ^js type-query-node index))
  (^js [type-query-node index source-file]
   (.getChildAt ^js type-query-node index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [type-query-node]
   (.getChildren ^js type-query-node))
  (^js [type-query-node source-file]
   (.getChildren ^js type-query-node source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [type-query-node]
   (.getStart ^js type-query-node))
  (^js [type-query-node source-file]
   (.getStart ^js type-query-node source-file))
  (^js [type-query-node source-file include-js-doc-comment?]
   (.getStart ^js type-query-node source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [type-query-node]
  (.getFullStart ^js type-query-node))

(defn get-end
  "**Returns:** `number`"
  ^js [type-query-node]
  (.getEnd ^js type-query-node))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [type-query-node]
   (.getWidth ^js type-query-node))
  (^js [type-query-node source-file]
   (.getWidth ^js type-query-node source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [type-query-node]
  (.getFullWidth ^js type-query-node))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [type-query-node]
   (.getLeadingTriviaWidth ^js type-query-node))
  (^js [type-query-node source-file]
   (.getLeadingTriviaWidth ^js type-query-node source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [type-query-node]
   (.getFullText ^js type-query-node))
  (^js [type-query-node source-file]
   (.getFullText ^js type-query-node source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [type-query-node]
   (.getText ^js type-query-node))
  (^js [type-query-node source-file]
   (.getText ^js type-query-node source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [type-query-node]
   (.getFirstToken ^js type-query-node))
  (^js [type-query-node source-file]
   (.getFirstToken ^js type-query-node source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [type-query-node]
   (.getLastToken ^js type-query-node))
  (^js [type-query-node source-file]
   (.getLastToken ^js type-query-node source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [type-query-node cb-node]
   (.forEachChild ^js type-query-node cb-node))
  (^js [type-query-node cb-node cb-node-array]
   (.forEachChild ^js type-query-node cb-node cb-node-array)))

(defn pos
  ^js [type-query-node]
  (.-pos ^js type-query-node))

(defn end
  ^js [type-query-node]
  (.-end ^js type-query-node))
