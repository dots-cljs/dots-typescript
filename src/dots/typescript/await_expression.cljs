(ns dots.typescript.await-expression)

(defn kind
  "**Returns:** `SyntaxKind.AwaitExpression`"
  ^js [await-expression]
  (.-kind ^js await-expression))

(defn expression
  "**Returns:** `UnaryExpression`"
  ^js [await-expression]
  (.-expression ^js await-expression))

(defn flags
  "**Returns:** `NodeFlags`"
  ^js [await-expression]
  (.-flags ^js await-expression))

(defn parent
  "**Returns:** `Node`"
  ^js [await-expression]
  (.-parent ^js await-expression))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [await-expression]
  (.getSourceFile ^js await-expression))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [await-expression]
   (.getChildCount ^js await-expression))
  (^js [await-expression source-file]
   (.getChildCount ^js await-expression source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [await-expression index]
   (.getChildAt ^js await-expression index))
  (^js [await-expression index source-file]
   (.getChildAt ^js await-expression index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [await-expression]
   (.getChildren ^js await-expression))
  (^js [await-expression source-file]
   (.getChildren ^js await-expression source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [await-expression]
   (.getStart ^js await-expression))
  (^js [await-expression source-file]
   (.getStart ^js await-expression source-file))
  (^js [await-expression source-file include-js-doc-comment?]
   (.getStart ^js await-expression source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [await-expression]
  (.getFullStart ^js await-expression))

(defn get-end
  "**Returns:** `number`"
  ^js [await-expression]
  (.getEnd ^js await-expression))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [await-expression]
   (.getWidth ^js await-expression))
  (^js [await-expression source-file]
   (.getWidth ^js await-expression source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [await-expression]
  (.getFullWidth ^js await-expression))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [await-expression]
   (.getLeadingTriviaWidth ^js await-expression))
  (^js [await-expression source-file]
   (.getLeadingTriviaWidth ^js await-expression source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [await-expression]
   (.getFullText ^js await-expression))
  (^js [await-expression source-file]
   (.getFullText ^js await-expression source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [await-expression]
   (.getText ^js await-expression))
  (^js [await-expression source-file]
   (.getText ^js await-expression source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [await-expression]
   (.getFirstToken ^js await-expression))
  (^js [await-expression source-file]
   (.getFirstToken ^js await-expression source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [await-expression]
   (.getLastToken ^js await-expression))
  (^js [await-expression source-file]
   (.getLastToken ^js await-expression source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [await-expression cb-node]
   (.forEachChild ^js await-expression cb-node))
  (^js [await-expression cb-node cb-node-array]
   (.forEachChild ^js await-expression cb-node cb-node-array)))

(defn pos
  "**Returns:** `number`"
  ^js [await-expression]
  (.-pos ^js await-expression))

(defn end
  "**Returns:** `number`"
  ^js [await-expression]
  (.-end ^js await-expression))
