(ns dots.typescript.object-literal-expression)

(defn kind
  "**Returns:** `SyntaxKind.ObjectLiteralExpression`"
  ^js [object-literal-expression]
  (.-kind ^js object-literal-expression))

(defn properties
  "**Returns:** `NodeArray<ObjectLiteralElementLike>`"
  ^js [object-literal-expression]
  (.-properties ^js object-literal-expression))

(defn flags
  "**Returns:** `NodeFlags`"
  ^js [object-literal-expression]
  (.-flags ^js object-literal-expression))

(defn parent
  "**Returns:** `Node`"
  ^js [object-literal-expression]
  (.-parent ^js object-literal-expression))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [object-literal-expression]
  (.getSourceFile ^js object-literal-expression))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [object-literal-expression]
   (.getChildCount ^js object-literal-expression))
  (^js [object-literal-expression source-file]
   (.getChildCount ^js object-literal-expression source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [object-literal-expression index]
   (.getChildAt ^js object-literal-expression index))
  (^js [object-literal-expression index source-file]
   (.getChildAt ^js object-literal-expression index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [object-literal-expression]
   (.getChildren ^js object-literal-expression))
  (^js [object-literal-expression source-file]
   (.getChildren ^js object-literal-expression source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [object-literal-expression]
   (.getStart ^js object-literal-expression))
  (^js [object-literal-expression source-file]
   (.getStart ^js object-literal-expression source-file))
  (^js [object-literal-expression source-file include-js-doc-comment?]
   (.getStart ^js object-literal-expression source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [object-literal-expression]
  (.getFullStart ^js object-literal-expression))

(defn get-end
  "**Returns:** `number`"
  ^js [object-literal-expression]
  (.getEnd ^js object-literal-expression))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [object-literal-expression]
   (.getWidth ^js object-literal-expression))
  (^js [object-literal-expression source-file]
   (.getWidth ^js object-literal-expression source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [object-literal-expression]
  (.getFullWidth ^js object-literal-expression))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [object-literal-expression]
   (.getLeadingTriviaWidth ^js object-literal-expression))
  (^js [object-literal-expression source-file]
   (.getLeadingTriviaWidth ^js object-literal-expression source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [object-literal-expression]
   (.getFullText ^js object-literal-expression))
  (^js [object-literal-expression source-file]
   (.getFullText ^js object-literal-expression source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [object-literal-expression]
   (.getText ^js object-literal-expression))
  (^js [object-literal-expression source-file]
   (.getText ^js object-literal-expression source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [object-literal-expression]
   (.getFirstToken ^js object-literal-expression))
  (^js [object-literal-expression source-file]
   (.getFirstToken ^js object-literal-expression source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [object-literal-expression]
   (.getLastToken ^js object-literal-expression))
  (^js [object-literal-expression source-file]
   (.getLastToken ^js object-literal-expression source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [object-literal-expression cb-node]
   (.forEachChild ^js object-literal-expression cb-node))
  (^js [object-literal-expression cb-node cb-node-array]
   (.forEachChild ^js object-literal-expression cb-node cb-node-array)))

(defn pos
  "**Returns:** `number`"
  ^js [object-literal-expression]
  (.-pos ^js object-literal-expression))

(defn end
  "**Returns:** `number`"
  ^js [object-literal-expression]
  (.-end ^js object-literal-expression))
