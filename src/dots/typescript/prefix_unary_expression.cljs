(ns dots.typescript.prefix-unary-expression)

(defn kind
  ^js [prefix-unary-expression]
  (.-kind ^js prefix-unary-expression))

(defn operator
  ^js [prefix-unary-expression]
  (.-operator ^js prefix-unary-expression))

(defn operand
  ^js [prefix-unary-expression]
  (.-operand ^js prefix-unary-expression))

(defn flags
  ^js [prefix-unary-expression]
  (.-flags ^js prefix-unary-expression))

(defn parent
  ^js [prefix-unary-expression]
  (.-parent ^js prefix-unary-expression))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [prefix-unary-expression]
  (.getSourceFile ^js prefix-unary-expression))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [prefix-unary-expression]
   (.getChildCount ^js prefix-unary-expression))
  (^js [prefix-unary-expression source-file]
   (.getChildCount ^js prefix-unary-expression source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [prefix-unary-expression index]
   (.getChildAt ^js prefix-unary-expression index))
  (^js [prefix-unary-expression index source-file]
   (.getChildAt ^js prefix-unary-expression index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [prefix-unary-expression]
   (.getChildren ^js prefix-unary-expression))
  (^js [prefix-unary-expression source-file]
   (.getChildren ^js prefix-unary-expression source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [prefix-unary-expression]
   (.getStart ^js prefix-unary-expression))
  (^js [prefix-unary-expression source-file]
   (.getStart ^js prefix-unary-expression source-file))
  (^js [prefix-unary-expression source-file include-js-doc-comment?]
   (.getStart ^js prefix-unary-expression source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [prefix-unary-expression]
  (.getFullStart ^js prefix-unary-expression))

(defn get-end
  "**Returns:** `number`"
  ^js [prefix-unary-expression]
  (.getEnd ^js prefix-unary-expression))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [prefix-unary-expression]
   (.getWidth ^js prefix-unary-expression))
  (^js [prefix-unary-expression source-file]
   (.getWidth ^js prefix-unary-expression source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [prefix-unary-expression]
  (.getFullWidth ^js prefix-unary-expression))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [prefix-unary-expression]
   (.getLeadingTriviaWidth ^js prefix-unary-expression))
  (^js [prefix-unary-expression source-file]
   (.getLeadingTriviaWidth ^js prefix-unary-expression source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [prefix-unary-expression]
   (.getFullText ^js prefix-unary-expression))
  (^js [prefix-unary-expression source-file]
   (.getFullText ^js prefix-unary-expression source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [prefix-unary-expression]
   (.getText ^js prefix-unary-expression))
  (^js [prefix-unary-expression source-file]
   (.getText ^js prefix-unary-expression source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [prefix-unary-expression]
   (.getFirstToken ^js prefix-unary-expression))
  (^js [prefix-unary-expression source-file]
   (.getFirstToken ^js prefix-unary-expression source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [prefix-unary-expression]
   (.getLastToken ^js prefix-unary-expression))
  (^js [prefix-unary-expression source-file]
   (.getLastToken ^js prefix-unary-expression source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [prefix-unary-expression cb-node]
   (.forEachChild ^js prefix-unary-expression cb-node))
  (^js [prefix-unary-expression cb-node cb-node-array]
   (.forEachChild ^js prefix-unary-expression cb-node cb-node-array)))

(defn pos
  ^js [prefix-unary-expression]
  (.-pos ^js prefix-unary-expression))

(defn end
  ^js [prefix-unary-expression]
  (.-end ^js prefix-unary-expression))
