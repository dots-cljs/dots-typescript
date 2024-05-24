(ns dots.typescript.assignment-expression)

(defn left
  ^js [assignment-expression]
  (.-left ^js assignment-expression))

(defn operator-token
  ^js [assignment-expression]
  (.-operatorToken ^js assignment-expression))

(defn kind
  ^js [assignment-expression]
  (.-kind ^js assignment-expression))

(defn right
  ^js [assignment-expression]
  (.-right ^js assignment-expression))

(defn flags
  ^js [assignment-expression]
  (.-flags ^js assignment-expression))

(defn parent
  ^js [assignment-expression]
  (.-parent ^js assignment-expression))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [assignment-expression]
  (.getSourceFile ^js assignment-expression))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [assignment-expression]
   (.getChildCount ^js assignment-expression))
  (^js [assignment-expression source-file]
   (.getChildCount ^js assignment-expression source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [assignment-expression index]
   (.getChildAt ^js assignment-expression index))
  (^js [assignment-expression index source-file]
   (.getChildAt ^js assignment-expression index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [assignment-expression]
   (.getChildren ^js assignment-expression))
  (^js [assignment-expression source-file]
   (.getChildren ^js assignment-expression source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [assignment-expression]
   (.getStart ^js assignment-expression))
  (^js [assignment-expression source-file]
   (.getStart ^js assignment-expression source-file))
  (^js [assignment-expression source-file include-js-doc-comment?]
   (.getStart ^js assignment-expression source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [assignment-expression]
  (.getFullStart ^js assignment-expression))

(defn get-end
  "**Returns:** `number`"
  ^js [assignment-expression]
  (.getEnd ^js assignment-expression))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [assignment-expression]
   (.getWidth ^js assignment-expression))
  (^js [assignment-expression source-file]
   (.getWidth ^js assignment-expression source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [assignment-expression]
  (.getFullWidth ^js assignment-expression))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [assignment-expression]
   (.getLeadingTriviaWidth ^js assignment-expression))
  (^js [assignment-expression source-file]
   (.getLeadingTriviaWidth ^js assignment-expression source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [assignment-expression]
   (.getFullText ^js assignment-expression))
  (^js [assignment-expression source-file]
   (.getFullText ^js assignment-expression source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [assignment-expression]
   (.getText ^js assignment-expression))
  (^js [assignment-expression source-file]
   (.getText ^js assignment-expression source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [assignment-expression]
   (.getFirstToken ^js assignment-expression))
  (^js [assignment-expression source-file]
   (.getFirstToken ^js assignment-expression source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [assignment-expression]
   (.getLastToken ^js assignment-expression))
  (^js [assignment-expression source-file]
   (.getLastToken ^js assignment-expression source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [assignment-expression cb-node]
   (.forEachChild ^js assignment-expression cb-node))
  (^js [assignment-expression cb-node cb-node-array]
   (.forEachChild ^js assignment-expression cb-node cb-node-array)))

(defn pos
  ^js [assignment-expression]
  (.-pos ^js assignment-expression))

(defn end
  ^js [assignment-expression]
  (.-end ^js assignment-expression))
