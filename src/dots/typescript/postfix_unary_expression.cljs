(ns dots.typescript.postfix-unary-expression)

(defn kind
  "**Returns:** `SyntaxKind.PostfixUnaryExpression`"
  ^js [postfix-unary-expression]
  (.-kind ^js postfix-unary-expression))

(defn operand
  "**Returns:** `LeftHandSideExpression`"
  ^js [postfix-unary-expression]
  (.-operand ^js postfix-unary-expression))

(defn operator
  "**Returns:** `PostfixUnaryOperator`"
  ^js [postfix-unary-expression]
  (.-operator ^js postfix-unary-expression))

(defn flags
  "**Returns:** `NodeFlags`"
  ^js [postfix-unary-expression]
  (.-flags ^js postfix-unary-expression))

(defn parent
  "**Returns:** `Node`"
  ^js [postfix-unary-expression]
  (.-parent ^js postfix-unary-expression))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [postfix-unary-expression]
  (.getSourceFile ^js postfix-unary-expression))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [postfix-unary-expression]
   (.getChildCount ^js postfix-unary-expression))
  (^js [postfix-unary-expression source-file]
   (.getChildCount ^js postfix-unary-expression source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [postfix-unary-expression index]
   (.getChildAt ^js postfix-unary-expression index))
  (^js [postfix-unary-expression index source-file]
   (.getChildAt ^js postfix-unary-expression index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [postfix-unary-expression]
   (.getChildren ^js postfix-unary-expression))
  (^js [postfix-unary-expression source-file]
   (.getChildren ^js postfix-unary-expression source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [postfix-unary-expression]
   (.getStart ^js postfix-unary-expression))
  (^js [postfix-unary-expression source-file]
   (.getStart ^js postfix-unary-expression source-file))
  (^js [postfix-unary-expression source-file include-js-doc-comment?]
   (.getStart ^js postfix-unary-expression source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [postfix-unary-expression]
  (.getFullStart ^js postfix-unary-expression))

(defn get-end
  "**Returns:** `number`"
  ^js [postfix-unary-expression]
  (.getEnd ^js postfix-unary-expression))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [postfix-unary-expression]
   (.getWidth ^js postfix-unary-expression))
  (^js [postfix-unary-expression source-file]
   (.getWidth ^js postfix-unary-expression source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [postfix-unary-expression]
  (.getFullWidth ^js postfix-unary-expression))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [postfix-unary-expression]
   (.getLeadingTriviaWidth ^js postfix-unary-expression))
  (^js [postfix-unary-expression source-file]
   (.getLeadingTriviaWidth ^js postfix-unary-expression source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [postfix-unary-expression]
   (.getFullText ^js postfix-unary-expression))
  (^js [postfix-unary-expression source-file]
   (.getFullText ^js postfix-unary-expression source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [postfix-unary-expression]
   (.getText ^js postfix-unary-expression))
  (^js [postfix-unary-expression source-file]
   (.getText ^js postfix-unary-expression source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [postfix-unary-expression]
   (.getFirstToken ^js postfix-unary-expression))
  (^js [postfix-unary-expression source-file]
   (.getFirstToken ^js postfix-unary-expression source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [postfix-unary-expression]
   (.getLastToken ^js postfix-unary-expression))
  (^js [postfix-unary-expression source-file]
   (.getLastToken ^js postfix-unary-expression source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [postfix-unary-expression cb-node]
   (.forEachChild ^js postfix-unary-expression cb-node))
  (^js [postfix-unary-expression cb-node cb-node-array]
   (.forEachChild ^js postfix-unary-expression cb-node cb-node-array)))

(defn pos
  "**Returns:** `number`"
  ^js [postfix-unary-expression]
  (.-pos ^js postfix-unary-expression))

(defn end
  "**Returns:** `number`"
  ^js [postfix-unary-expression]
  (.-end ^js postfix-unary-expression))
