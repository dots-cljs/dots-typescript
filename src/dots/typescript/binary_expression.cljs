(ns dots.typescript.binary-expression)

(defn kind
  "**Returns:** `SyntaxKind.BinaryExpression`"
  ^js [binary-expression]
  (.-kind ^js binary-expression))

(defn left
  "**Returns:** `Expression`"
  ^js [binary-expression]
  (.-left ^js binary-expression))

(defn operator-token
  "**Returns:** `BinaryOperatorToken`"
  ^js [binary-expression]
  (.-operatorToken ^js binary-expression))

(defn right
  "**Returns:** `Expression`"
  ^js [binary-expression]
  (.-right ^js binary-expression))

(defn flags
  "**Returns:** `NodeFlags`"
  ^js [binary-expression]
  (.-flags ^js binary-expression))

(defn parent
  "**Returns:** `Node`"
  ^js [binary-expression]
  (.-parent ^js binary-expression))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [binary-expression]
  (.getSourceFile ^js binary-expression))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [binary-expression]
   (.getChildCount ^js binary-expression))
  (^js [binary-expression source-file]
   (.getChildCount ^js binary-expression source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [binary-expression index]
   (.getChildAt ^js binary-expression index))
  (^js [binary-expression index source-file]
   (.getChildAt ^js binary-expression index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [binary-expression]
   (.getChildren ^js binary-expression))
  (^js [binary-expression source-file]
   (.getChildren ^js binary-expression source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [binary-expression]
   (.getStart ^js binary-expression))
  (^js [binary-expression source-file]
   (.getStart ^js binary-expression source-file))
  (^js [binary-expression source-file include-js-doc-comment?]
   (.getStart ^js binary-expression source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [binary-expression]
  (.getFullStart ^js binary-expression))

(defn get-end
  "**Returns:** `number`"
  ^js [binary-expression]
  (.getEnd ^js binary-expression))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [binary-expression]
   (.getWidth ^js binary-expression))
  (^js [binary-expression source-file]
   (.getWidth ^js binary-expression source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [binary-expression]
  (.getFullWidth ^js binary-expression))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [binary-expression]
   (.getLeadingTriviaWidth ^js binary-expression))
  (^js [binary-expression source-file]
   (.getLeadingTriviaWidth ^js binary-expression source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [binary-expression]
   (.getFullText ^js binary-expression))
  (^js [binary-expression source-file]
   (.getFullText ^js binary-expression source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [binary-expression]
   (.getText ^js binary-expression))
  (^js [binary-expression source-file]
   (.getText ^js binary-expression source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [binary-expression]
   (.getFirstToken ^js binary-expression))
  (^js [binary-expression source-file]
   (.getFirstToken ^js binary-expression source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [binary-expression]
   (.getLastToken ^js binary-expression))
  (^js [binary-expression source-file]
   (.getLastToken ^js binary-expression source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [binary-expression cb-node]
   (.forEachChild ^js binary-expression cb-node))
  (^js [binary-expression cb-node cb-node-array]
   (.forEachChild ^js binary-expression cb-node cb-node-array)))

(defn pos
  "**Returns:** `number`"
  ^js [binary-expression]
  (.-pos ^js binary-expression))

(defn end
  "**Returns:** `number`"
  ^js [binary-expression]
  (.-end ^js binary-expression))
