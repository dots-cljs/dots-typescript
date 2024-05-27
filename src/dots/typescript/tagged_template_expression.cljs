(ns dots.typescript.tagged-template-expression)

(defn kind
  "**Returns:** `SyntaxKind.TaggedTemplateExpression`"
  ^js [tagged-template-expression]
  (.-kind ^js tagged-template-expression))

(defn tag
  "**Returns:** `LeftHandSideExpression`"
  ^js [tagged-template-expression]
  (.-tag ^js tagged-template-expression))

(defn type-arguments
  "**Returns:** `NodeArray<TypeNode> | undefined`"
  ^js [tagged-template-expression]
  (.-typeArguments ^js tagged-template-expression))

(defn template
  "**Returns:** `TemplateLiteral`"
  ^js [tagged-template-expression]
  (.-template ^js tagged-template-expression))

(defn flags
  "**Returns:** `NodeFlags`"
  ^js [tagged-template-expression]
  (.-flags ^js tagged-template-expression))

(defn parent
  "**Returns:** `Node`"
  ^js [tagged-template-expression]
  (.-parent ^js tagged-template-expression))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [tagged-template-expression]
  (.getSourceFile ^js tagged-template-expression))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [tagged-template-expression]
   (.getChildCount ^js tagged-template-expression))
  (^js [tagged-template-expression source-file]
   (.getChildCount ^js tagged-template-expression source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [tagged-template-expression index]
   (.getChildAt ^js tagged-template-expression index))
  (^js [tagged-template-expression index source-file]
   (.getChildAt ^js tagged-template-expression index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [tagged-template-expression]
   (.getChildren ^js tagged-template-expression))
  (^js [tagged-template-expression source-file]
   (.getChildren ^js tagged-template-expression source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [tagged-template-expression]
   (.getStart ^js tagged-template-expression))
  (^js [tagged-template-expression source-file]
   (.getStart ^js tagged-template-expression source-file))
  (^js [tagged-template-expression source-file include-js-doc-comment?]
   (.getStart ^js tagged-template-expression source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [tagged-template-expression]
  (.getFullStart ^js tagged-template-expression))

(defn get-end
  "**Returns:** `number`"
  ^js [tagged-template-expression]
  (.getEnd ^js tagged-template-expression))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [tagged-template-expression]
   (.getWidth ^js tagged-template-expression))
  (^js [tagged-template-expression source-file]
   (.getWidth ^js tagged-template-expression source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [tagged-template-expression]
  (.getFullWidth ^js tagged-template-expression))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [tagged-template-expression]
   (.getLeadingTriviaWidth ^js tagged-template-expression))
  (^js [tagged-template-expression source-file]
   (.getLeadingTriviaWidth ^js tagged-template-expression source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [tagged-template-expression]
   (.getFullText ^js tagged-template-expression))
  (^js [tagged-template-expression source-file]
   (.getFullText ^js tagged-template-expression source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [tagged-template-expression]
   (.getText ^js tagged-template-expression))
  (^js [tagged-template-expression source-file]
   (.getText ^js tagged-template-expression source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [tagged-template-expression]
   (.getFirstToken ^js tagged-template-expression))
  (^js [tagged-template-expression source-file]
   (.getFirstToken ^js tagged-template-expression source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [tagged-template-expression]
   (.getLastToken ^js tagged-template-expression))
  (^js [tagged-template-expression source-file]
   (.getLastToken ^js tagged-template-expression source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [tagged-template-expression cb-node]
   (.forEachChild ^js tagged-template-expression cb-node))
  (^js [tagged-template-expression cb-node cb-node-array]
   (.forEachChild ^js tagged-template-expression cb-node cb-node-array)))

(defn pos
  "**Returns:** `number`"
  ^js [tagged-template-expression]
  (.-pos ^js tagged-template-expression))

(defn end
  "**Returns:** `number`"
  ^js [tagged-template-expression]
  (.-end ^js tagged-template-expression))
