(ns dots.typescript.catch-clause)

(defn kind
  "**Returns:** `SyntaxKind.CatchClause`"
  ^js [catch-clause]
  (.-kind ^js catch-clause))

(defn parent
  "**Returns:** `TryStatement`"
  ^js [catch-clause]
  (.-parent ^js catch-clause))

(defn variable-declaration
  "**Returns:** `VariableDeclaration | undefined`"
  ^js [catch-clause]
  (.-variableDeclaration ^js catch-clause))

(defn block
  "**Returns:** `Block`"
  ^js [catch-clause]
  (.-block ^js catch-clause))

(defn flags
  "**Returns:** `NodeFlags`"
  ^js [catch-clause]
  (.-flags ^js catch-clause))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [catch-clause]
  (.getSourceFile ^js catch-clause))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [catch-clause]
   (.getChildCount ^js catch-clause))
  (^js [catch-clause source-file]
   (.getChildCount ^js catch-clause source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [catch-clause index]
   (.getChildAt ^js catch-clause index))
  (^js [catch-clause index source-file]
   (.getChildAt ^js catch-clause index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [catch-clause]
   (.getChildren ^js catch-clause))
  (^js [catch-clause source-file]
   (.getChildren ^js catch-clause source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [catch-clause]
   (.getStart ^js catch-clause))
  (^js [catch-clause source-file]
   (.getStart ^js catch-clause source-file))
  (^js [catch-clause source-file include-js-doc-comment?]
   (.getStart ^js catch-clause source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [catch-clause]
  (.getFullStart ^js catch-clause))

(defn get-end
  "**Returns:** `number`"
  ^js [catch-clause]
  (.getEnd ^js catch-clause))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [catch-clause]
   (.getWidth ^js catch-clause))
  (^js [catch-clause source-file]
   (.getWidth ^js catch-clause source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [catch-clause]
  (.getFullWidth ^js catch-clause))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [catch-clause]
   (.getLeadingTriviaWidth ^js catch-clause))
  (^js [catch-clause source-file]
   (.getLeadingTriviaWidth ^js catch-clause source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [catch-clause]
   (.getFullText ^js catch-clause))
  (^js [catch-clause source-file]
   (.getFullText ^js catch-clause source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [catch-clause]
   (.getText ^js catch-clause))
  (^js [catch-clause source-file]
   (.getText ^js catch-clause source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [catch-clause]
   (.getFirstToken ^js catch-clause))
  (^js [catch-clause source-file]
   (.getFirstToken ^js catch-clause source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [catch-clause]
   (.getLastToken ^js catch-clause))
  (^js [catch-clause source-file]
   (.getLastToken ^js catch-clause source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [catch-clause cb-node]
   (.forEachChild ^js catch-clause cb-node))
  (^js [catch-clause cb-node cb-node-array]
   (.forEachChild ^js catch-clause cb-node cb-node-array)))

(defn pos
  "**Returns:** `number`"
  ^js [catch-clause]
  (.-pos ^js catch-clause))

(defn end
  "**Returns:** `number`"
  ^js [catch-clause]
  (.-end ^js catch-clause))
