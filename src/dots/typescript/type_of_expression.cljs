(ns dots.typescript.type-of-expression)

(defn kind
  "**Returns:** `SyntaxKind.TypeOfExpression`"
  ^js [type-of-expression]
  (.-kind ^js type-of-expression))

(defn expression
  "**Returns:** `UnaryExpression`"
  ^js [type-of-expression]
  (.-expression ^js type-of-expression))

(defn flags
  "**Returns:** `NodeFlags`"
  ^js [type-of-expression]
  (.-flags ^js type-of-expression))

(defn parent
  "**Returns:** `Node`"
  ^js [type-of-expression]
  (.-parent ^js type-of-expression))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [type-of-expression]
  (.getSourceFile ^js type-of-expression))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [type-of-expression]
   (.getChildCount ^js type-of-expression))
  (^js [type-of-expression source-file]
   (.getChildCount ^js type-of-expression source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [type-of-expression index]
   (.getChildAt ^js type-of-expression index))
  (^js [type-of-expression index source-file]
   (.getChildAt ^js type-of-expression index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [type-of-expression]
   (.getChildren ^js type-of-expression))
  (^js [type-of-expression source-file]
   (.getChildren ^js type-of-expression source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [type-of-expression]
   (.getStart ^js type-of-expression))
  (^js [type-of-expression source-file]
   (.getStart ^js type-of-expression source-file))
  (^js [type-of-expression source-file include-js-doc-comment?]
   (.getStart ^js type-of-expression source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [type-of-expression]
  (.getFullStart ^js type-of-expression))

(defn get-end
  "**Returns:** `number`"
  ^js [type-of-expression]
  (.getEnd ^js type-of-expression))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [type-of-expression]
   (.getWidth ^js type-of-expression))
  (^js [type-of-expression source-file]
   (.getWidth ^js type-of-expression source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [type-of-expression]
  (.getFullWidth ^js type-of-expression))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [type-of-expression]
   (.getLeadingTriviaWidth ^js type-of-expression))
  (^js [type-of-expression source-file]
   (.getLeadingTriviaWidth ^js type-of-expression source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [type-of-expression]
   (.getFullText ^js type-of-expression))
  (^js [type-of-expression source-file]
   (.getFullText ^js type-of-expression source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [type-of-expression]
   (.getText ^js type-of-expression))
  (^js [type-of-expression source-file]
   (.getText ^js type-of-expression source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [type-of-expression]
   (.getFirstToken ^js type-of-expression))
  (^js [type-of-expression source-file]
   (.getFirstToken ^js type-of-expression source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [type-of-expression]
   (.getLastToken ^js type-of-expression))
  (^js [type-of-expression source-file]
   (.getLastToken ^js type-of-expression source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [type-of-expression cb-node]
   (.forEachChild ^js type-of-expression cb-node))
  (^js [type-of-expression cb-node cb-node-array]
   (.forEachChild ^js type-of-expression cb-node cb-node-array)))

(defn pos
  "**Returns:** `number`"
  ^js [type-of-expression]
  (.-pos ^js type-of-expression))

(defn end
  "**Returns:** `number`"
  ^js [type-of-expression]
  (.-end ^js type-of-expression))
