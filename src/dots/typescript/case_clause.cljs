(ns dots.typescript.case-clause)

(defn kind
  "**Returns:** `SyntaxKind.CaseClause`"
  ^js [case-clause]
  (.-kind ^js case-clause))

(defn parent
  "**Returns:** `CaseBlock`"
  ^js [case-clause]
  (.-parent ^js case-clause))

(defn expression
  "**Returns:** `Expression`"
  ^js [case-clause]
  (.-expression ^js case-clause))

(defn statements
  "**Returns:** `NodeArray<Statement>`"
  ^js [case-clause]
  (.-statements ^js case-clause))

(defn flags
  "**Returns:** `NodeFlags`"
  ^js [case-clause]
  (.-flags ^js case-clause))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [case-clause]
  (.getSourceFile ^js case-clause))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [case-clause]
   (.getChildCount ^js case-clause))
  (^js [case-clause source-file]
   (.getChildCount ^js case-clause source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [case-clause index]
   (.getChildAt ^js case-clause index))
  (^js [case-clause index source-file]
   (.getChildAt ^js case-clause index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [case-clause]
   (.getChildren ^js case-clause))
  (^js [case-clause source-file]
   (.getChildren ^js case-clause source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [case-clause]
   (.getStart ^js case-clause))
  (^js [case-clause source-file]
   (.getStart ^js case-clause source-file))
  (^js [case-clause source-file include-js-doc-comment?]
   (.getStart ^js case-clause source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [case-clause]
  (.getFullStart ^js case-clause))

(defn get-end
  "**Returns:** `number`"
  ^js [case-clause]
  (.getEnd ^js case-clause))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [case-clause]
   (.getWidth ^js case-clause))
  (^js [case-clause source-file]
   (.getWidth ^js case-clause source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [case-clause]
  (.getFullWidth ^js case-clause))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [case-clause]
   (.getLeadingTriviaWidth ^js case-clause))
  (^js [case-clause source-file]
   (.getLeadingTriviaWidth ^js case-clause source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [case-clause]
   (.getFullText ^js case-clause))
  (^js [case-clause source-file]
   (.getFullText ^js case-clause source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [case-clause]
   (.getText ^js case-clause))
  (^js [case-clause source-file]
   (.getText ^js case-clause source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [case-clause]
   (.getFirstToken ^js case-clause))
  (^js [case-clause source-file]
   (.getFirstToken ^js case-clause source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [case-clause]
   (.getLastToken ^js case-clause))
  (^js [case-clause source-file]
   (.getLastToken ^js case-clause source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [case-clause cb-node]
   (.forEachChild ^js case-clause cb-node))
  (^js [case-clause cb-node cb-node-array]
   (.forEachChild ^js case-clause cb-node cb-node-array)))

(defn pos
  "**Returns:** `number`"
  ^js [case-clause]
  (.-pos ^js case-clause))

(defn end
  "**Returns:** `number`"
  ^js [case-clause]
  (.-end ^js case-clause))
