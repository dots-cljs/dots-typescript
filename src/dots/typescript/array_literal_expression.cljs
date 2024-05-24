(ns dots.typescript.array-literal-expression)

(defn kind
  ^js [array-literal-expression]
  (.-kind ^js array-literal-expression))

(defn elements
  ^js [array-literal-expression]
  (.-elements ^js array-literal-expression))

(defn flags
  ^js [array-literal-expression]
  (.-flags ^js array-literal-expression))

(defn parent
  ^js [array-literal-expression]
  (.-parent ^js array-literal-expression))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [array-literal-expression]
  (.getSourceFile ^js array-literal-expression))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [array-literal-expression]
   (.getChildCount ^js array-literal-expression))
  (^js [array-literal-expression source-file]
   (.getChildCount ^js array-literal-expression source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [array-literal-expression index]
   (.getChildAt ^js array-literal-expression index))
  (^js [array-literal-expression index source-file]
   (.getChildAt ^js array-literal-expression index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [array-literal-expression]
   (.getChildren ^js array-literal-expression))
  (^js [array-literal-expression source-file]
   (.getChildren ^js array-literal-expression source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [array-literal-expression]
   (.getStart ^js array-literal-expression))
  (^js [array-literal-expression source-file]
   (.getStart ^js array-literal-expression source-file))
  (^js [array-literal-expression source-file include-js-doc-comment?]
   (.getStart ^js array-literal-expression source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [array-literal-expression]
  (.getFullStart ^js array-literal-expression))

(defn get-end
  "**Returns:** `number`"
  ^js [array-literal-expression]
  (.getEnd ^js array-literal-expression))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [array-literal-expression]
   (.getWidth ^js array-literal-expression))
  (^js [array-literal-expression source-file]
   (.getWidth ^js array-literal-expression source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [array-literal-expression]
  (.getFullWidth ^js array-literal-expression))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [array-literal-expression]
   (.getLeadingTriviaWidth ^js array-literal-expression))
  (^js [array-literal-expression source-file]
   (.getLeadingTriviaWidth ^js array-literal-expression source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [array-literal-expression]
   (.getFullText ^js array-literal-expression))
  (^js [array-literal-expression source-file]
   (.getFullText ^js array-literal-expression source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [array-literal-expression]
   (.getText ^js array-literal-expression))
  (^js [array-literal-expression source-file]
   (.getText ^js array-literal-expression source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [array-literal-expression]
   (.getFirstToken ^js array-literal-expression))
  (^js [array-literal-expression source-file]
   (.getFirstToken ^js array-literal-expression source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [array-literal-expression]
   (.getLastToken ^js array-literal-expression))
  (^js [array-literal-expression source-file]
   (.getLastToken ^js array-literal-expression source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [array-literal-expression cb-node]
   (.forEachChild ^js array-literal-expression cb-node))
  (^js [array-literal-expression cb-node cb-node-array]
   (.forEachChild ^js array-literal-expression cb-node cb-node-array)))

(defn pos
  ^js [array-literal-expression]
  (.-pos ^js array-literal-expression))

(defn end
  ^js [array-literal-expression]
  (.-end ^js array-literal-expression))
