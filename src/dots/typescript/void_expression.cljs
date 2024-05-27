(ns dots.typescript.void-expression)

(defn kind
  "**Returns:** `SyntaxKind.VoidExpression`"
  ^js [void-expression]
  (.-kind ^js void-expression))

(defn expression
  "**Returns:** `UnaryExpression`"
  ^js [void-expression]
  (.-expression ^js void-expression))

(defn flags
  "**Returns:** `NodeFlags`"
  ^js [void-expression]
  (.-flags ^js void-expression))

(defn parent
  "**Returns:** `Node`"
  ^js [void-expression]
  (.-parent ^js void-expression))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [void-expression]
  (.getSourceFile ^js void-expression))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [void-expression]
   (.getChildCount ^js void-expression))
  (^js [void-expression source-file]
   (.getChildCount ^js void-expression source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [void-expression index]
   (.getChildAt ^js void-expression index))
  (^js [void-expression index source-file]
   (.getChildAt ^js void-expression index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [void-expression]
   (.getChildren ^js void-expression))
  (^js [void-expression source-file]
   (.getChildren ^js void-expression source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [void-expression]
   (.getStart ^js void-expression))
  (^js [void-expression source-file]
   (.getStart ^js void-expression source-file))
  (^js [void-expression source-file include-js-doc-comment?]
   (.getStart ^js void-expression source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [void-expression]
  (.getFullStart ^js void-expression))

(defn get-end
  "**Returns:** `number`"
  ^js [void-expression]
  (.getEnd ^js void-expression))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [void-expression]
   (.getWidth ^js void-expression))
  (^js [void-expression source-file]
   (.getWidth ^js void-expression source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [void-expression]
  (.getFullWidth ^js void-expression))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [void-expression]
   (.getLeadingTriviaWidth ^js void-expression))
  (^js [void-expression source-file]
   (.getLeadingTriviaWidth ^js void-expression source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [void-expression]
   (.getFullText ^js void-expression))
  (^js [void-expression source-file]
   (.getFullText ^js void-expression source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [void-expression]
   (.getText ^js void-expression))
  (^js [void-expression source-file]
   (.getText ^js void-expression source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [void-expression]
   (.getFirstToken ^js void-expression))
  (^js [void-expression source-file]
   (.getFirstToken ^js void-expression source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [void-expression]
   (.getLastToken ^js void-expression))
  (^js [void-expression source-file]
   (.getLastToken ^js void-expression source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [void-expression cb-node]
   (.forEachChild ^js void-expression cb-node))
  (^js [void-expression cb-node cb-node-array]
   (.forEachChild ^js void-expression cb-node cb-node-array)))

(defn pos
  "**Returns:** `number`"
  ^js [void-expression]
  (.-pos ^js void-expression))

(defn end
  "**Returns:** `number`"
  ^js [void-expression]
  (.-end ^js void-expression))
