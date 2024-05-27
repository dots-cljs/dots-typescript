(ns dots.typescript.spread-element)

(defn kind
  "**Returns:** `SyntaxKind.SpreadElement`"
  ^js [spread-element]
  (.-kind ^js spread-element))

(defn parent
  "**Returns:** `CallExpression | NewExpression | ArrayLiteralExpression`"
  ^js [spread-element]
  (.-parent ^js spread-element))

(defn expression
  "**Returns:** `Expression`"
  ^js [spread-element]
  (.-expression ^js spread-element))

(defn flags
  "**Returns:** `NodeFlags`"
  ^js [spread-element]
  (.-flags ^js spread-element))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [spread-element]
  (.getSourceFile ^js spread-element))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [spread-element]
   (.getChildCount ^js spread-element))
  (^js [spread-element source-file]
   (.getChildCount ^js spread-element source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [spread-element index]
   (.getChildAt ^js spread-element index))
  (^js [spread-element index source-file]
   (.getChildAt ^js spread-element index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [spread-element]
   (.getChildren ^js spread-element))
  (^js [spread-element source-file]
   (.getChildren ^js spread-element source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [spread-element]
   (.getStart ^js spread-element))
  (^js [spread-element source-file]
   (.getStart ^js spread-element source-file))
  (^js [spread-element source-file include-js-doc-comment?]
   (.getStart ^js spread-element source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [spread-element]
  (.getFullStart ^js spread-element))

(defn get-end
  "**Returns:** `number`"
  ^js [spread-element]
  (.getEnd ^js spread-element))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [spread-element]
   (.getWidth ^js spread-element))
  (^js [spread-element source-file]
   (.getWidth ^js spread-element source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [spread-element]
  (.getFullWidth ^js spread-element))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [spread-element]
   (.getLeadingTriviaWidth ^js spread-element))
  (^js [spread-element source-file]
   (.getLeadingTriviaWidth ^js spread-element source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [spread-element]
   (.getFullText ^js spread-element))
  (^js [spread-element source-file]
   (.getFullText ^js spread-element source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [spread-element]
   (.getText ^js spread-element))
  (^js [spread-element source-file]
   (.getText ^js spread-element source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [spread-element]
   (.getFirstToken ^js spread-element))
  (^js [spread-element source-file]
   (.getFirstToken ^js spread-element source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [spread-element]
   (.getLastToken ^js spread-element))
  (^js [spread-element source-file]
   (.getLastToken ^js spread-element source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [spread-element cb-node]
   (.forEachChild ^js spread-element cb-node))
  (^js [spread-element cb-node cb-node-array]
   (.forEachChild ^js spread-element cb-node cb-node-array)))

(defn pos
  "**Returns:** `number`"
  ^js [spread-element]
  (.-pos ^js spread-element))

(defn end
  "**Returns:** `number`"
  ^js [spread-element]
  (.-end ^js spread-element))
