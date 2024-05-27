(ns dots.typescript.expression-with-type-arguments)

(defn kind
  "**Returns:** `SyntaxKind.ExpressionWithTypeArguments`"
  ^js [expression-with-type-arguments]
  (.-kind ^js expression-with-type-arguments))

(defn expression
  "**Returns:** `LeftHandSideExpression`"
  ^js [expression-with-type-arguments]
  (.-expression ^js expression-with-type-arguments))

(defn flags
  "**Returns:** `NodeFlags`"
  ^js [expression-with-type-arguments]
  (.-flags ^js expression-with-type-arguments))

(defn parent
  "**Returns:** `Node`"
  ^js [expression-with-type-arguments]
  (.-parent ^js expression-with-type-arguments))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [expression-with-type-arguments]
  (.getSourceFile ^js expression-with-type-arguments))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [expression-with-type-arguments]
   (.getChildCount ^js expression-with-type-arguments))
  (^js [expression-with-type-arguments source-file]
   (.getChildCount ^js expression-with-type-arguments source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [expression-with-type-arguments index]
   (.getChildAt ^js expression-with-type-arguments index))
  (^js [expression-with-type-arguments index source-file]
   (.getChildAt ^js expression-with-type-arguments index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [expression-with-type-arguments]
   (.getChildren ^js expression-with-type-arguments))
  (^js [expression-with-type-arguments source-file]
   (.getChildren ^js expression-with-type-arguments source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [expression-with-type-arguments]
   (.getStart ^js expression-with-type-arguments))
  (^js [expression-with-type-arguments source-file]
   (.getStart ^js expression-with-type-arguments source-file))
  (^js [expression-with-type-arguments source-file include-js-doc-comment?]
   (.getStart ^js expression-with-type-arguments source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [expression-with-type-arguments]
  (.getFullStart ^js expression-with-type-arguments))

(defn get-end
  "**Returns:** `number`"
  ^js [expression-with-type-arguments]
  (.getEnd ^js expression-with-type-arguments))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [expression-with-type-arguments]
   (.getWidth ^js expression-with-type-arguments))
  (^js [expression-with-type-arguments source-file]
   (.getWidth ^js expression-with-type-arguments source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [expression-with-type-arguments]
  (.getFullWidth ^js expression-with-type-arguments))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [expression-with-type-arguments]
   (.getLeadingTriviaWidth ^js expression-with-type-arguments))
  (^js [expression-with-type-arguments source-file]
   (.getLeadingTriviaWidth ^js expression-with-type-arguments source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [expression-with-type-arguments]
   (.getFullText ^js expression-with-type-arguments))
  (^js [expression-with-type-arguments source-file]
   (.getFullText ^js expression-with-type-arguments source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [expression-with-type-arguments]
   (.getText ^js expression-with-type-arguments))
  (^js [expression-with-type-arguments source-file]
   (.getText ^js expression-with-type-arguments source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [expression-with-type-arguments]
   (.getFirstToken ^js expression-with-type-arguments))
  (^js [expression-with-type-arguments source-file]
   (.getFirstToken ^js expression-with-type-arguments source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [expression-with-type-arguments]
   (.getLastToken ^js expression-with-type-arguments))
  (^js [expression-with-type-arguments source-file]
   (.getLastToken ^js expression-with-type-arguments source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [expression-with-type-arguments cb-node]
   (.forEachChild ^js expression-with-type-arguments cb-node))
  (^js [expression-with-type-arguments cb-node cb-node-array]
   (.forEachChild ^js expression-with-type-arguments cb-node cb-node-array)))

(defn pos
  "**Returns:** `number`"
  ^js [expression-with-type-arguments]
  (.-pos ^js expression-with-type-arguments))

(defn end
  "**Returns:** `number`"
  ^js [expression-with-type-arguments]
  (.-end ^js expression-with-type-arguments))

(defn type-arguments
  "**Returns:** `NodeArray<TypeNode> | undefined`"
  ^js [expression-with-type-arguments]
  (.-typeArguments ^js expression-with-type-arguments))
