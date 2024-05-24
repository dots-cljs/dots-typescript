(ns dots.typescript.unary-expression)

(defn kind
  ^js [unary-expression]
  (.-kind ^js unary-expression))

(defn flags
  ^js [unary-expression]
  (.-flags ^js unary-expression))

(defn parent
  ^js [unary-expression]
  (.-parent ^js unary-expression))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [unary-expression]
  (.getSourceFile ^js unary-expression))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [unary-expression]
   (.getChildCount ^js unary-expression))
  (^js [unary-expression source-file]
   (.getChildCount ^js unary-expression source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [unary-expression index]
   (.getChildAt ^js unary-expression index))
  (^js [unary-expression index source-file]
   (.getChildAt ^js unary-expression index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [unary-expression]
   (.getChildren ^js unary-expression))
  (^js [unary-expression source-file]
   (.getChildren ^js unary-expression source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [unary-expression]
   (.getStart ^js unary-expression))
  (^js [unary-expression source-file]
   (.getStart ^js unary-expression source-file))
  (^js [unary-expression source-file include-js-doc-comment?]
   (.getStart ^js unary-expression source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [unary-expression]
  (.getFullStart ^js unary-expression))

(defn get-end
  "**Returns:** `number`"
  ^js [unary-expression]
  (.getEnd ^js unary-expression))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [unary-expression]
   (.getWidth ^js unary-expression))
  (^js [unary-expression source-file]
   (.getWidth ^js unary-expression source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [unary-expression]
  (.getFullWidth ^js unary-expression))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [unary-expression]
   (.getLeadingTriviaWidth ^js unary-expression))
  (^js [unary-expression source-file]
   (.getLeadingTriviaWidth ^js unary-expression source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [unary-expression]
   (.getFullText ^js unary-expression))
  (^js [unary-expression source-file]
   (.getFullText ^js unary-expression source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [unary-expression]
   (.getText ^js unary-expression))
  (^js [unary-expression source-file]
   (.getText ^js unary-expression source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [unary-expression]
   (.getFirstToken ^js unary-expression))
  (^js [unary-expression source-file]
   (.getFirstToken ^js unary-expression source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [unary-expression]
   (.getLastToken ^js unary-expression))
  (^js [unary-expression source-file]
   (.getLastToken ^js unary-expression source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [unary-expression cb-node]
   (.forEachChild ^js unary-expression cb-node))
  (^js [unary-expression cb-node cb-node-array]
   (.forEachChild ^js unary-expression cb-node cb-node-array)))

(defn pos
  ^js [unary-expression]
  (.-pos ^js unary-expression))

(defn end
  ^js [unary-expression]
  (.-end ^js unary-expression))
