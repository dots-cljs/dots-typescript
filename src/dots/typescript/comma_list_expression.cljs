(ns dots.typescript.comma-list-expression
  "A list of comma-separated expressions. This node is only created by transformations.")

(defn kind
  ^js [comma-list-expression]
  (.-kind ^js comma-list-expression))

(defn elements
  ^js [comma-list-expression]
  (.-elements ^js comma-list-expression))

(defn flags
  ^js [comma-list-expression]
  (.-flags ^js comma-list-expression))

(defn parent
  ^js [comma-list-expression]
  (.-parent ^js comma-list-expression))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [comma-list-expression]
  (.getSourceFile ^js comma-list-expression))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [comma-list-expression]
   (.getChildCount ^js comma-list-expression))
  (^js [comma-list-expression source-file]
   (.getChildCount ^js comma-list-expression source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [comma-list-expression index]
   (.getChildAt ^js comma-list-expression index))
  (^js [comma-list-expression index source-file]
   (.getChildAt ^js comma-list-expression index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [comma-list-expression]
   (.getChildren ^js comma-list-expression))
  (^js [comma-list-expression source-file]
   (.getChildren ^js comma-list-expression source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [comma-list-expression]
   (.getStart ^js comma-list-expression))
  (^js [comma-list-expression source-file]
   (.getStart ^js comma-list-expression source-file))
  (^js [comma-list-expression source-file include-js-doc-comment?]
   (.getStart ^js comma-list-expression source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [comma-list-expression]
  (.getFullStart ^js comma-list-expression))

(defn get-end
  "**Returns:** `number`"
  ^js [comma-list-expression]
  (.getEnd ^js comma-list-expression))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [comma-list-expression]
   (.getWidth ^js comma-list-expression))
  (^js [comma-list-expression source-file]
   (.getWidth ^js comma-list-expression source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [comma-list-expression]
  (.getFullWidth ^js comma-list-expression))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [comma-list-expression]
   (.getLeadingTriviaWidth ^js comma-list-expression))
  (^js [comma-list-expression source-file]
   (.getLeadingTriviaWidth ^js comma-list-expression source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [comma-list-expression]
   (.getFullText ^js comma-list-expression))
  (^js [comma-list-expression source-file]
   (.getFullText ^js comma-list-expression source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [comma-list-expression]
   (.getText ^js comma-list-expression))
  (^js [comma-list-expression source-file]
   (.getText ^js comma-list-expression source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [comma-list-expression]
   (.getFirstToken ^js comma-list-expression))
  (^js [comma-list-expression source-file]
   (.getFirstToken ^js comma-list-expression source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [comma-list-expression]
   (.getLastToken ^js comma-list-expression))
  (^js [comma-list-expression source-file]
   (.getLastToken ^js comma-list-expression source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [comma-list-expression cb-node]
   (.forEachChild ^js comma-list-expression cb-node))
  (^js [comma-list-expression cb-node cb-node-array]
   (.forEachChild ^js comma-list-expression cb-node cb-node-array)))

(defn pos
  ^js [comma-list-expression]
  (.-pos ^js comma-list-expression))

(defn end
  ^js [comma-list-expression]
  (.-end ^js comma-list-expression))
