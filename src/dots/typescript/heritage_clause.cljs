(ns dots.typescript.heritage-clause)

(defn kind
  "**Returns:** `SyntaxKind.HeritageClause`"
  ^js [heritage-clause]
  (.-kind ^js heritage-clause))

(defn parent
  "**Returns:** `ClassLikeDeclaration | InterfaceDeclaration`"
  ^js [heritage-clause]
  (.-parent ^js heritage-clause))

(defn token
  "**Returns:** `SyntaxKind.ExtendsKeyword | SyntaxKind.ImplementsKeyword`"
  ^js [heritage-clause]
  (.-token ^js heritage-clause))

(defn types
  "**Returns:** `NodeArray<ExpressionWithTypeArguments>`"
  ^js [heritage-clause]
  (.-types ^js heritage-clause))

(defn flags
  "**Returns:** `NodeFlags`"
  ^js [heritage-clause]
  (.-flags ^js heritage-clause))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [heritage-clause]
  (.getSourceFile ^js heritage-clause))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [heritage-clause]
   (.getChildCount ^js heritage-clause))
  (^js [heritage-clause source-file]
   (.getChildCount ^js heritage-clause source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [heritage-clause index]
   (.getChildAt ^js heritage-clause index))
  (^js [heritage-clause index source-file]
   (.getChildAt ^js heritage-clause index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [heritage-clause]
   (.getChildren ^js heritage-clause))
  (^js [heritage-clause source-file]
   (.getChildren ^js heritage-clause source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [heritage-clause]
   (.getStart ^js heritage-clause))
  (^js [heritage-clause source-file]
   (.getStart ^js heritage-clause source-file))
  (^js [heritage-clause source-file include-js-doc-comment?]
   (.getStart ^js heritage-clause source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [heritage-clause]
  (.getFullStart ^js heritage-clause))

(defn get-end
  "**Returns:** `number`"
  ^js [heritage-clause]
  (.getEnd ^js heritage-clause))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [heritage-clause]
   (.getWidth ^js heritage-clause))
  (^js [heritage-clause source-file]
   (.getWidth ^js heritage-clause source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [heritage-clause]
  (.getFullWidth ^js heritage-clause))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [heritage-clause]
   (.getLeadingTriviaWidth ^js heritage-clause))
  (^js [heritage-clause source-file]
   (.getLeadingTriviaWidth ^js heritage-clause source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [heritage-clause]
   (.getFullText ^js heritage-clause))
  (^js [heritage-clause source-file]
   (.getFullText ^js heritage-clause source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [heritage-clause]
   (.getText ^js heritage-clause))
  (^js [heritage-clause source-file]
   (.getText ^js heritage-clause source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [heritage-clause]
   (.getFirstToken ^js heritage-clause))
  (^js [heritage-clause source-file]
   (.getFirstToken ^js heritage-clause source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [heritage-clause]
   (.getLastToken ^js heritage-clause))
  (^js [heritage-clause source-file]
   (.getLastToken ^js heritage-clause source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [heritage-clause cb-node]
   (.forEachChild ^js heritage-clause cb-node))
  (^js [heritage-clause cb-node cb-node-array]
   (.forEachChild ^js heritage-clause cb-node cb-node-array)))

(defn pos
  "**Returns:** `number`"
  ^js [heritage-clause]
  (.-pos ^js heritage-clause))

(defn end
  "**Returns:** `number`"
  ^js [heritage-clause]
  (.-end ^js heritage-clause))
