(ns dots.typescript.jsx-expression)

(defn kind
  "**Returns:** `SyntaxKind.JsxExpression`"
  ^js [jsx-expression]
  (.-kind ^js jsx-expression))

(defn parent
  "**Returns:** `JsxElement | JsxFragment | JsxAttributeLike`"
  ^js [jsx-expression]
  (.-parent ^js jsx-expression))

(defn dot-dot-dot-token
  "**Returns:** `Token<SyntaxKind.DotDotDotToken> | undefined`"
  ^js [jsx-expression]
  (.-dotDotDotToken ^js jsx-expression))

(defn expression
  "**Returns:** `Expression | undefined`"
  ^js [jsx-expression]
  (.-expression ^js jsx-expression))

(defn flags
  "**Returns:** `NodeFlags`"
  ^js [jsx-expression]
  (.-flags ^js jsx-expression))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [jsx-expression]
  (.getSourceFile ^js jsx-expression))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [jsx-expression]
   (.getChildCount ^js jsx-expression))
  (^js [jsx-expression source-file]
   (.getChildCount ^js jsx-expression source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [jsx-expression index]
   (.getChildAt ^js jsx-expression index))
  (^js [jsx-expression index source-file]
   (.getChildAt ^js jsx-expression index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [jsx-expression]
   (.getChildren ^js jsx-expression))
  (^js [jsx-expression source-file]
   (.getChildren ^js jsx-expression source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [jsx-expression]
   (.getStart ^js jsx-expression))
  (^js [jsx-expression source-file]
   (.getStart ^js jsx-expression source-file))
  (^js [jsx-expression source-file include-js-doc-comment?]
   (.getStart ^js jsx-expression source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [jsx-expression]
  (.getFullStart ^js jsx-expression))

(defn get-end
  "**Returns:** `number`"
  ^js [jsx-expression]
  (.getEnd ^js jsx-expression))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [jsx-expression]
   (.getWidth ^js jsx-expression))
  (^js [jsx-expression source-file]
   (.getWidth ^js jsx-expression source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [jsx-expression]
  (.getFullWidth ^js jsx-expression))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [jsx-expression]
   (.getLeadingTriviaWidth ^js jsx-expression))
  (^js [jsx-expression source-file]
   (.getLeadingTriviaWidth ^js jsx-expression source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [jsx-expression]
   (.getFullText ^js jsx-expression))
  (^js [jsx-expression source-file]
   (.getFullText ^js jsx-expression source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [jsx-expression]
   (.getText ^js jsx-expression))
  (^js [jsx-expression source-file]
   (.getText ^js jsx-expression source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [jsx-expression]
   (.getFirstToken ^js jsx-expression))
  (^js [jsx-expression source-file]
   (.getFirstToken ^js jsx-expression source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [jsx-expression]
   (.getLastToken ^js jsx-expression))
  (^js [jsx-expression source-file]
   (.getLastToken ^js jsx-expression source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [jsx-expression cb-node]
   (.forEachChild ^js jsx-expression cb-node))
  (^js [jsx-expression cb-node cb-node-array]
   (.forEachChild ^js jsx-expression cb-node cb-node-array)))

(defn pos
  "**Returns:** `number`"
  ^js [jsx-expression]
  (.-pos ^js jsx-expression))

(defn end
  "**Returns:** `number`"
  ^js [jsx-expression]
  (.-end ^js jsx-expression))
