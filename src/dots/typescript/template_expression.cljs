(ns dots.typescript.template-expression)

(defn kind
  "**Returns:** `SyntaxKind.TemplateExpression`"
  ^js [template-expression]
  (.-kind ^js template-expression))

(defn head
  "**Returns:** `TemplateHead`"
  ^js [template-expression]
  (.-head ^js template-expression))

(defn template-spans
  "**Returns:** `NodeArray<TemplateSpan>`"
  ^js [template-expression]
  (.-templateSpans ^js template-expression))

(defn flags
  "**Returns:** `NodeFlags`"
  ^js [template-expression]
  (.-flags ^js template-expression))

(defn parent
  "**Returns:** `Node`"
  ^js [template-expression]
  (.-parent ^js template-expression))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [template-expression]
  (.getSourceFile ^js template-expression))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [template-expression]
   (.getChildCount ^js template-expression))
  (^js [template-expression source-file]
   (.getChildCount ^js template-expression source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [template-expression index]
   (.getChildAt ^js template-expression index))
  (^js [template-expression index source-file]
   (.getChildAt ^js template-expression index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [template-expression]
   (.getChildren ^js template-expression))
  (^js [template-expression source-file]
   (.getChildren ^js template-expression source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [template-expression]
   (.getStart ^js template-expression))
  (^js [template-expression source-file]
   (.getStart ^js template-expression source-file))
  (^js [template-expression source-file include-js-doc-comment?]
   (.getStart ^js template-expression source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [template-expression]
  (.getFullStart ^js template-expression))

(defn get-end
  "**Returns:** `number`"
  ^js [template-expression]
  (.getEnd ^js template-expression))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [template-expression]
   (.getWidth ^js template-expression))
  (^js [template-expression source-file]
   (.getWidth ^js template-expression source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [template-expression]
  (.getFullWidth ^js template-expression))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [template-expression]
   (.getLeadingTriviaWidth ^js template-expression))
  (^js [template-expression source-file]
   (.getLeadingTriviaWidth ^js template-expression source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [template-expression]
   (.getFullText ^js template-expression))
  (^js [template-expression source-file]
   (.getFullText ^js template-expression source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [template-expression]
   (.getText ^js template-expression))
  (^js [template-expression source-file]
   (.getText ^js template-expression source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [template-expression]
   (.getFirstToken ^js template-expression))
  (^js [template-expression source-file]
   (.getFirstToken ^js template-expression source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [template-expression]
   (.getLastToken ^js template-expression))
  (^js [template-expression source-file]
   (.getLastToken ^js template-expression source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [template-expression cb-node]
   (.forEachChild ^js template-expression cb-node))
  (^js [template-expression cb-node cb-node-array]
   (.forEachChild ^js template-expression cb-node cb-node-array)))

(defn pos
  "**Returns:** `number`"
  ^js [template-expression]
  (.-pos ^js template-expression))

(defn end
  "**Returns:** `number`"
  ^js [template-expression]
  (.-end ^js template-expression))
