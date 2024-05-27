(ns dots.typescript.element-access-expression)

(defn kind
  "**Returns:** `SyntaxKind.ElementAccessExpression`"
  ^js [element-access-expression]
  (.-kind ^js element-access-expression))

(defn expression
  "**Returns:** `LeftHandSideExpression`"
  ^js [element-access-expression]
  (.-expression ^js element-access-expression))

(defn question-dot-token
  "**Returns:** `QuestionDotToken | undefined`"
  ^js [element-access-expression]
  (.-questionDotToken ^js element-access-expression))

(defn argument-expression
  "**Returns:** `Expression`"
  ^js [element-access-expression]
  (.-argumentExpression ^js element-access-expression))

(defn flags
  "**Returns:** `NodeFlags`"
  ^js [element-access-expression]
  (.-flags ^js element-access-expression))

(defn parent
  "**Returns:** `Node`"
  ^js [element-access-expression]
  (.-parent ^js element-access-expression))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [element-access-expression]
  (.getSourceFile ^js element-access-expression))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [element-access-expression]
   (.getChildCount ^js element-access-expression))
  (^js [element-access-expression source-file]
   (.getChildCount ^js element-access-expression source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [element-access-expression index]
   (.getChildAt ^js element-access-expression index))
  (^js [element-access-expression index source-file]
   (.getChildAt ^js element-access-expression index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [element-access-expression]
   (.getChildren ^js element-access-expression))
  (^js [element-access-expression source-file]
   (.getChildren ^js element-access-expression source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [element-access-expression]
   (.getStart ^js element-access-expression))
  (^js [element-access-expression source-file]
   (.getStart ^js element-access-expression source-file))
  (^js [element-access-expression source-file include-js-doc-comment?]
   (.getStart ^js element-access-expression source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [element-access-expression]
  (.getFullStart ^js element-access-expression))

(defn get-end
  "**Returns:** `number`"
  ^js [element-access-expression]
  (.getEnd ^js element-access-expression))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [element-access-expression]
   (.getWidth ^js element-access-expression))
  (^js [element-access-expression source-file]
   (.getWidth ^js element-access-expression source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [element-access-expression]
  (.getFullWidth ^js element-access-expression))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [element-access-expression]
   (.getLeadingTriviaWidth ^js element-access-expression))
  (^js [element-access-expression source-file]
   (.getLeadingTriviaWidth ^js element-access-expression source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [element-access-expression]
   (.getFullText ^js element-access-expression))
  (^js [element-access-expression source-file]
   (.getFullText ^js element-access-expression source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [element-access-expression]
   (.getText ^js element-access-expression))
  (^js [element-access-expression source-file]
   (.getText ^js element-access-expression source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [element-access-expression]
   (.getFirstToken ^js element-access-expression))
  (^js [element-access-expression source-file]
   (.getFirstToken ^js element-access-expression source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [element-access-expression]
   (.getLastToken ^js element-access-expression))
  (^js [element-access-expression source-file]
   (.getLastToken ^js element-access-expression source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [element-access-expression cb-node]
   (.forEachChild ^js element-access-expression cb-node))
  (^js [element-access-expression cb-node cb-node-array]
   (.forEachChild ^js element-access-expression cb-node cb-node-array)))

(defn pos
  "**Returns:** `number`"
  ^js [element-access-expression]
  (.-pos ^js element-access-expression))

(defn end
  "**Returns:** `number`"
  ^js [element-access-expression]
  (.-end ^js element-access-expression))
