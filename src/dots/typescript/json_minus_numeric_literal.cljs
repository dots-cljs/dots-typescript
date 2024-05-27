(ns dots.typescript.json-minus-numeric-literal)

(defn kind
  "**Returns:** `SyntaxKind.PrefixUnaryExpression`"
  ^js [json-minus-numeric-literal]
  (.-kind ^js json-minus-numeric-literal))

(defn operator
  "**Returns:** `SyntaxKind.MinusToken`"
  ^js [json-minus-numeric-literal]
  (.-operator ^js json-minus-numeric-literal))

(defn operand
  "**Returns:** `NumericLiteral`"
  ^js [json-minus-numeric-literal]
  (.-operand ^js json-minus-numeric-literal))

(defn flags
  "**Returns:** `NodeFlags`"
  ^js [json-minus-numeric-literal]
  (.-flags ^js json-minus-numeric-literal))

(defn parent
  "**Returns:** `Node`"
  ^js [json-minus-numeric-literal]
  (.-parent ^js json-minus-numeric-literal))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [json-minus-numeric-literal]
  (.getSourceFile ^js json-minus-numeric-literal))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [json-minus-numeric-literal]
   (.getChildCount ^js json-minus-numeric-literal))
  (^js [json-minus-numeric-literal source-file]
   (.getChildCount ^js json-minus-numeric-literal source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [json-minus-numeric-literal index]
   (.getChildAt ^js json-minus-numeric-literal index))
  (^js [json-minus-numeric-literal index source-file]
   (.getChildAt ^js json-minus-numeric-literal index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [json-minus-numeric-literal]
   (.getChildren ^js json-minus-numeric-literal))
  (^js [json-minus-numeric-literal source-file]
   (.getChildren ^js json-minus-numeric-literal source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [json-minus-numeric-literal]
   (.getStart ^js json-minus-numeric-literal))
  (^js [json-minus-numeric-literal source-file]
   (.getStart ^js json-minus-numeric-literal source-file))
  (^js [json-minus-numeric-literal source-file include-js-doc-comment?]
   (.getStart ^js json-minus-numeric-literal source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [json-minus-numeric-literal]
  (.getFullStart ^js json-minus-numeric-literal))

(defn get-end
  "**Returns:** `number`"
  ^js [json-minus-numeric-literal]
  (.getEnd ^js json-minus-numeric-literal))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [json-minus-numeric-literal]
   (.getWidth ^js json-minus-numeric-literal))
  (^js [json-minus-numeric-literal source-file]
   (.getWidth ^js json-minus-numeric-literal source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [json-minus-numeric-literal]
  (.getFullWidth ^js json-minus-numeric-literal))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [json-minus-numeric-literal]
   (.getLeadingTriviaWidth ^js json-minus-numeric-literal))
  (^js [json-minus-numeric-literal source-file]
   (.getLeadingTriviaWidth ^js json-minus-numeric-literal source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [json-minus-numeric-literal]
   (.getFullText ^js json-minus-numeric-literal))
  (^js [json-minus-numeric-literal source-file]
   (.getFullText ^js json-minus-numeric-literal source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [json-minus-numeric-literal]
   (.getText ^js json-minus-numeric-literal))
  (^js [json-minus-numeric-literal source-file]
   (.getText ^js json-minus-numeric-literal source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [json-minus-numeric-literal]
   (.getFirstToken ^js json-minus-numeric-literal))
  (^js [json-minus-numeric-literal source-file]
   (.getFirstToken ^js json-minus-numeric-literal source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [json-minus-numeric-literal]
   (.getLastToken ^js json-minus-numeric-literal))
  (^js [json-minus-numeric-literal source-file]
   (.getLastToken ^js json-minus-numeric-literal source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [json-minus-numeric-literal cb-node]
   (.forEachChild ^js json-minus-numeric-literal cb-node))
  (^js [json-minus-numeric-literal cb-node cb-node-array]
   (.forEachChild ^js json-minus-numeric-literal cb-node cb-node-array)))

(defn pos
  "**Returns:** `number`"
  ^js [json-minus-numeric-literal]
  (.-pos ^js json-minus-numeric-literal))

(defn end
  "**Returns:** `number`"
  ^js [json-minus-numeric-literal]
  (.-end ^js json-minus-numeric-literal))
