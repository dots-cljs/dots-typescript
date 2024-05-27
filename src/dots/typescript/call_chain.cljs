(ns dots.typescript.call-chain)

(defn kind
  "**Returns:** `SyntaxKind.CallExpression`"
  ^js [call-chain]
  (.-kind ^js call-chain))

(defn expression
  "**Returns:** `LeftHandSideExpression`"
  ^js [call-chain]
  (.-expression ^js call-chain))

(defn question-dot-token
  "**Returns:** `QuestionDotToken | undefined`"
  ^js [call-chain]
  (.-questionDotToken ^js call-chain))

(defn type-arguments
  "**Returns:** `NodeArray<TypeNode> | undefined`"
  ^js [call-chain]
  (.-typeArguments ^js call-chain))

(defn arguments
  "**Returns:** `NodeArray<Expression>`"
  ^js [call-chain]
  (.-arguments ^js call-chain))

(defn flags
  "**Returns:** `NodeFlags`"
  ^js [call-chain]
  (.-flags ^js call-chain))

(defn parent
  "**Returns:** `Node`"
  ^js [call-chain]
  (.-parent ^js call-chain))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [call-chain]
  (.getSourceFile ^js call-chain))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [call-chain]
   (.getChildCount ^js call-chain))
  (^js [call-chain source-file]
   (.getChildCount ^js call-chain source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [call-chain index]
   (.getChildAt ^js call-chain index))
  (^js [call-chain index source-file]
   (.getChildAt ^js call-chain index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [call-chain]
   (.getChildren ^js call-chain))
  (^js [call-chain source-file]
   (.getChildren ^js call-chain source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [call-chain]
   (.getStart ^js call-chain))
  (^js [call-chain source-file]
   (.getStart ^js call-chain source-file))
  (^js [call-chain source-file include-js-doc-comment?]
   (.getStart ^js call-chain source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [call-chain]
  (.getFullStart ^js call-chain))

(defn get-end
  "**Returns:** `number`"
  ^js [call-chain]
  (.getEnd ^js call-chain))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [call-chain]
   (.getWidth ^js call-chain))
  (^js [call-chain source-file]
   (.getWidth ^js call-chain source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [call-chain]
  (.getFullWidth ^js call-chain))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [call-chain]
   (.getLeadingTriviaWidth ^js call-chain))
  (^js [call-chain source-file]
   (.getLeadingTriviaWidth ^js call-chain source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [call-chain]
   (.getFullText ^js call-chain))
  (^js [call-chain source-file]
   (.getFullText ^js call-chain source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [call-chain]
   (.getText ^js call-chain))
  (^js [call-chain source-file]
   (.getText ^js call-chain source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [call-chain]
   (.getFirstToken ^js call-chain))
  (^js [call-chain source-file]
   (.getFirstToken ^js call-chain source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [call-chain]
   (.getLastToken ^js call-chain))
  (^js [call-chain source-file]
   (.getLastToken ^js call-chain source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [call-chain cb-node]
   (.forEachChild ^js call-chain cb-node))
  (^js [call-chain cb-node cb-node-array]
   (.forEachChild ^js call-chain cb-node cb-node-array)))

(defn pos
  "**Returns:** `number`"
  ^js [call-chain]
  (.-pos ^js call-chain))

(defn end
  "**Returns:** `number`"
  ^js [call-chain]
  (.-end ^js call-chain))
