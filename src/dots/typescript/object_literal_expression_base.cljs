(ns dots.typescript.object-literal-expression-base
  "This interface is a base interface for ObjectLiteralExpression and JSXAttributes to extend from. JSXAttributes is similar to
   ObjectLiteralExpression in that it contains array of properties; however, JSXAttributes' properties can only be
   JSXAttribute or JSXSpreadAttribute. ObjectLiteralExpression, on the other hand, can only have properties of type
   ObjectLiteralElement (e.g. PropertyAssignment, ShorthandPropertyAssignment etc.)")

(defn properties
  "**Returns:** `NodeArray<T>`"
  ^js [object-literal-expression-base]
  (.-properties ^js object-literal-expression-base))

(defn kind
  "**Returns:** `SyntaxKind`"
  ^js [object-literal-expression-base]
  (.-kind ^js object-literal-expression-base))

(defn flags
  "**Returns:** `NodeFlags`"
  ^js [object-literal-expression-base]
  (.-flags ^js object-literal-expression-base))

(defn parent
  "**Returns:** `Node`"
  ^js [object-literal-expression-base]
  (.-parent ^js object-literal-expression-base))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [object-literal-expression-base]
  (.getSourceFile ^js object-literal-expression-base))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [object-literal-expression-base]
   (.getChildCount ^js object-literal-expression-base))
  (^js [object-literal-expression-base source-file]
   (.getChildCount ^js object-literal-expression-base source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [object-literal-expression-base index]
   (.getChildAt ^js object-literal-expression-base index))
  (^js [object-literal-expression-base index source-file]
   (.getChildAt ^js object-literal-expression-base index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [object-literal-expression-base]
   (.getChildren ^js object-literal-expression-base))
  (^js [object-literal-expression-base source-file]
   (.getChildren ^js object-literal-expression-base source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [object-literal-expression-base]
   (.getStart ^js object-literal-expression-base))
  (^js [object-literal-expression-base source-file]
   (.getStart ^js object-literal-expression-base source-file))
  (^js [object-literal-expression-base source-file include-js-doc-comment?]
   (.getStart ^js object-literal-expression-base source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [object-literal-expression-base]
  (.getFullStart ^js object-literal-expression-base))

(defn get-end
  "**Returns:** `number`"
  ^js [object-literal-expression-base]
  (.getEnd ^js object-literal-expression-base))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [object-literal-expression-base]
   (.getWidth ^js object-literal-expression-base))
  (^js [object-literal-expression-base source-file]
   (.getWidth ^js object-literal-expression-base source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [object-literal-expression-base]
  (.getFullWidth ^js object-literal-expression-base))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [object-literal-expression-base]
   (.getLeadingTriviaWidth ^js object-literal-expression-base))
  (^js [object-literal-expression-base source-file]
   (.getLeadingTriviaWidth ^js object-literal-expression-base source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [object-literal-expression-base]
   (.getFullText ^js object-literal-expression-base))
  (^js [object-literal-expression-base source-file]
   (.getFullText ^js object-literal-expression-base source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [object-literal-expression-base]
   (.getText ^js object-literal-expression-base))
  (^js [object-literal-expression-base source-file]
   (.getText ^js object-literal-expression-base source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [object-literal-expression-base]
   (.getFirstToken ^js object-literal-expression-base))
  (^js [object-literal-expression-base source-file]
   (.getFirstToken ^js object-literal-expression-base source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [object-literal-expression-base]
   (.getLastToken ^js object-literal-expression-base))
  (^js [object-literal-expression-base source-file]
   (.getLastToken ^js object-literal-expression-base source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [object-literal-expression-base cb-node]
   (.forEachChild ^js object-literal-expression-base cb-node))
  (^js [object-literal-expression-base cb-node cb-node-array]
   (.forEachChild ^js object-literal-expression-base cb-node cb-node-array)))

(defn pos
  "**Returns:** `number`"
  ^js [object-literal-expression-base]
  (.-pos ^js object-literal-expression-base))

(defn end
  "**Returns:** `number`"
  ^js [object-literal-expression-base]
  (.-end ^js object-literal-expression-base))
