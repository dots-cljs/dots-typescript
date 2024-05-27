(ns dots.typescript.super-call)

(defn expression
  "**Returns:** `SuperExpression`"
  ^js [super-call]
  (.-expression ^js super-call))

(defn kind
  "**Returns:** `SyntaxKind.CallExpression`"
  ^js [super-call]
  (.-kind ^js super-call))

(defn question-dot-token
  "**Returns:** `QuestionDotToken | undefined`"
  ^js [super-call]
  (.-questionDotToken ^js super-call))

(defn type-arguments
  "**Returns:** `NodeArray<TypeNode> | undefined`"
  ^js [super-call]
  (.-typeArguments ^js super-call))

(defn arguments
  "**Returns:** `NodeArray<Expression>`"
  ^js [super-call]
  (.-arguments ^js super-call))

(defn flags
  "**Returns:** `NodeFlags`"
  ^js [super-call]
  (.-flags ^js super-call))

(defn parent
  "**Returns:** `Node`"
  ^js [super-call]
  (.-parent ^js super-call))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [super-call]
  (.getSourceFile ^js super-call))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [super-call]
   (.getChildCount ^js super-call))
  (^js [super-call source-file]
   (.getChildCount ^js super-call source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [super-call index]
   (.getChildAt ^js super-call index))
  (^js [super-call index source-file]
   (.getChildAt ^js super-call index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [super-call]
   (.getChildren ^js super-call))
  (^js [super-call source-file]
   (.getChildren ^js super-call source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [super-call]
   (.getStart ^js super-call))
  (^js [super-call source-file]
   (.getStart ^js super-call source-file))
  (^js [super-call source-file include-js-doc-comment?]
   (.getStart ^js super-call source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [super-call]
  (.getFullStart ^js super-call))

(defn get-end
  "**Returns:** `number`"
  ^js [super-call]
  (.getEnd ^js super-call))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [super-call]
   (.getWidth ^js super-call))
  (^js [super-call source-file]
   (.getWidth ^js super-call source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [super-call]
  (.getFullWidth ^js super-call))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [super-call]
   (.getLeadingTriviaWidth ^js super-call))
  (^js [super-call source-file]
   (.getLeadingTriviaWidth ^js super-call source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [super-call]
   (.getFullText ^js super-call))
  (^js [super-call source-file]
   (.getFullText ^js super-call source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [super-call]
   (.getText ^js super-call))
  (^js [super-call source-file]
   (.getText ^js super-call source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [super-call]
   (.getFirstToken ^js super-call))
  (^js [super-call source-file]
   (.getFirstToken ^js super-call source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [super-call]
   (.getLastToken ^js super-call))
  (^js [super-call source-file]
   (.getLastToken ^js super-call source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [super-call cb-node]
   (.forEachChild ^js super-call cb-node))
  (^js [super-call cb-node cb-node-array]
   (.forEachChild ^js super-call cb-node cb-node-array)))

(defn pos
  "**Returns:** `number`"
  ^js [super-call]
  (.-pos ^js super-call))

(defn end
  "**Returns:** `number`"
  ^js [super-call]
  (.-end ^js super-call))
