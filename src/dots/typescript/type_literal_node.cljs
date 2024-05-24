(ns dots.typescript.type-literal-node)

(defn kind
  ^js [type-literal-node]
  (.-kind ^js type-literal-node))

(defn members
  ^js [type-literal-node]
  (.-members ^js type-literal-node))

(defn flags
  ^js [type-literal-node]
  (.-flags ^js type-literal-node))

(defn parent
  ^js [type-literal-node]
  (.-parent ^js type-literal-node))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [type-literal-node]
  (.getSourceFile ^js type-literal-node))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [type-literal-node]
   (.getChildCount ^js type-literal-node))
  (^js [type-literal-node source-file]
   (.getChildCount ^js type-literal-node source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [type-literal-node index]
   (.getChildAt ^js type-literal-node index))
  (^js [type-literal-node index source-file]
   (.getChildAt ^js type-literal-node index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [type-literal-node]
   (.getChildren ^js type-literal-node))
  (^js [type-literal-node source-file]
   (.getChildren ^js type-literal-node source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [type-literal-node]
   (.getStart ^js type-literal-node))
  (^js [type-literal-node source-file]
   (.getStart ^js type-literal-node source-file))
  (^js [type-literal-node source-file include-js-doc-comment?]
   (.getStart ^js type-literal-node source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [type-literal-node]
  (.getFullStart ^js type-literal-node))

(defn get-end
  "**Returns:** `number`"
  ^js [type-literal-node]
  (.getEnd ^js type-literal-node))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [type-literal-node]
   (.getWidth ^js type-literal-node))
  (^js [type-literal-node source-file]
   (.getWidth ^js type-literal-node source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [type-literal-node]
  (.getFullWidth ^js type-literal-node))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [type-literal-node]
   (.getLeadingTriviaWidth ^js type-literal-node))
  (^js [type-literal-node source-file]
   (.getLeadingTriviaWidth ^js type-literal-node source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [type-literal-node]
   (.getFullText ^js type-literal-node))
  (^js [type-literal-node source-file]
   (.getFullText ^js type-literal-node source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [type-literal-node]
   (.getText ^js type-literal-node))
  (^js [type-literal-node source-file]
   (.getText ^js type-literal-node source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [type-literal-node]
   (.getFirstToken ^js type-literal-node))
  (^js [type-literal-node source-file]
   (.getFirstToken ^js type-literal-node source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [type-literal-node]
   (.getLastToken ^js type-literal-node))
  (^js [type-literal-node source-file]
   (.getLastToken ^js type-literal-node source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [type-literal-node cb-node]
   (.forEachChild ^js type-literal-node cb-node))
  (^js [type-literal-node cb-node cb-node-array]
   (.forEachChild ^js type-literal-node cb-node cb-node-array)))

(defn pos
  ^js [type-literal-node]
  (.-pos ^js type-literal-node))

(defn end
  ^js [type-literal-node]
  (.-end ^js type-literal-node))
