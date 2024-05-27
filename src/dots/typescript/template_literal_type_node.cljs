(ns dots.typescript.template-literal-type-node)

(defn kind
  "**Returns:** `SyntaxKind.TemplateLiteralType`"
  ^js [template-literal-type-node]
  (.-kind ^js template-literal-type-node))

(defn set-kind!
  ^js [template-literal-type-node value]
  (set! (.-kind ^js template-literal-type-node) value))

(defn head
  "**Returns:** `TemplateHead`"
  ^js [template-literal-type-node]
  (.-head ^js template-literal-type-node))

(defn template-spans
  "**Returns:** `NodeArray<TemplateLiteralTypeSpan>`"
  ^js [template-literal-type-node]
  (.-templateSpans ^js template-literal-type-node))

(defn flags
  "**Returns:** `NodeFlags`"
  ^js [template-literal-type-node]
  (.-flags ^js template-literal-type-node))

(defn parent
  "**Returns:** `Node`"
  ^js [template-literal-type-node]
  (.-parent ^js template-literal-type-node))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [template-literal-type-node]
  (.getSourceFile ^js template-literal-type-node))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [template-literal-type-node]
   (.getChildCount ^js template-literal-type-node))
  (^js [template-literal-type-node source-file]
   (.getChildCount ^js template-literal-type-node source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [template-literal-type-node index]
   (.getChildAt ^js template-literal-type-node index))
  (^js [template-literal-type-node index source-file]
   (.getChildAt ^js template-literal-type-node index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [template-literal-type-node]
   (.getChildren ^js template-literal-type-node))
  (^js [template-literal-type-node source-file]
   (.getChildren ^js template-literal-type-node source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [template-literal-type-node]
   (.getStart ^js template-literal-type-node))
  (^js [template-literal-type-node source-file]
   (.getStart ^js template-literal-type-node source-file))
  (^js [template-literal-type-node source-file include-js-doc-comment?]
   (.getStart ^js template-literal-type-node source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [template-literal-type-node]
  (.getFullStart ^js template-literal-type-node))

(defn get-end
  "**Returns:** `number`"
  ^js [template-literal-type-node]
  (.getEnd ^js template-literal-type-node))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [template-literal-type-node]
   (.getWidth ^js template-literal-type-node))
  (^js [template-literal-type-node source-file]
   (.getWidth ^js template-literal-type-node source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [template-literal-type-node]
  (.getFullWidth ^js template-literal-type-node))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [template-literal-type-node]
   (.getLeadingTriviaWidth ^js template-literal-type-node))
  (^js [template-literal-type-node source-file]
   (.getLeadingTriviaWidth ^js template-literal-type-node source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [template-literal-type-node]
   (.getFullText ^js template-literal-type-node))
  (^js [template-literal-type-node source-file]
   (.getFullText ^js template-literal-type-node source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [template-literal-type-node]
   (.getText ^js template-literal-type-node))
  (^js [template-literal-type-node source-file]
   (.getText ^js template-literal-type-node source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [template-literal-type-node]
   (.getFirstToken ^js template-literal-type-node))
  (^js [template-literal-type-node source-file]
   (.getFirstToken ^js template-literal-type-node source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [template-literal-type-node]
   (.getLastToken ^js template-literal-type-node))
  (^js [template-literal-type-node source-file]
   (.getLastToken ^js template-literal-type-node source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [template-literal-type-node cb-node]
   (.forEachChild ^js template-literal-type-node cb-node))
  (^js [template-literal-type-node cb-node cb-node-array]
   (.forEachChild ^js template-literal-type-node cb-node cb-node-array)))

(defn pos
  "**Returns:** `number`"
  ^js [template-literal-type-node]
  (.-pos ^js template-literal-type-node))

(defn end
  "**Returns:** `number`"
  ^js [template-literal-type-node]
  (.-end ^js template-literal-type-node))
