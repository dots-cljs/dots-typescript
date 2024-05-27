(ns dots.typescript.assert-clause)

(defn token
  "**Returns:** `SyntaxKind.WithKeyword | SyntaxKind.AssertKeyword`"
  ^js [assert-clause]
  (.-token ^js assert-clause))

(defn kind
  "**Returns:** `SyntaxKind.ImportAttributes`"
  ^js [assert-clause]
  (.-kind ^js assert-clause))

(defn parent
  "**Returns:** `ExportDeclaration | ImportDeclaration`"
  ^js [assert-clause]
  (.-parent ^js assert-clause))

(defn elements
  "**Returns:** `NodeArray<ImportAttribute>`"
  ^js [assert-clause]
  (.-elements ^js assert-clause))

(defn multi-line?
  "**Returns:** `boolean | undefined`"
  ^js [assert-clause]
  (.-multiLine ^js assert-clause))

(defn flags
  "**Returns:** `NodeFlags`"
  ^js [assert-clause]
  (.-flags ^js assert-clause))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [assert-clause]
  (.getSourceFile ^js assert-clause))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [assert-clause]
   (.getChildCount ^js assert-clause))
  (^js [assert-clause source-file]
   (.getChildCount ^js assert-clause source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [assert-clause index]
   (.getChildAt ^js assert-clause index))
  (^js [assert-clause index source-file]
   (.getChildAt ^js assert-clause index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [assert-clause]
   (.getChildren ^js assert-clause))
  (^js [assert-clause source-file]
   (.getChildren ^js assert-clause source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [assert-clause]
   (.getStart ^js assert-clause))
  (^js [assert-clause source-file]
   (.getStart ^js assert-clause source-file))
  (^js [assert-clause source-file include-js-doc-comment?]
   (.getStart ^js assert-clause source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [assert-clause]
  (.getFullStart ^js assert-clause))

(defn get-end
  "**Returns:** `number`"
  ^js [assert-clause]
  (.getEnd ^js assert-clause))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [assert-clause]
   (.getWidth ^js assert-clause))
  (^js [assert-clause source-file]
   (.getWidth ^js assert-clause source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [assert-clause]
  (.getFullWidth ^js assert-clause))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [assert-clause]
   (.getLeadingTriviaWidth ^js assert-clause))
  (^js [assert-clause source-file]
   (.getLeadingTriviaWidth ^js assert-clause source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [assert-clause]
   (.getFullText ^js assert-clause))
  (^js [assert-clause source-file]
   (.getFullText ^js assert-clause source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [assert-clause]
   (.getText ^js assert-clause))
  (^js [assert-clause source-file]
   (.getText ^js assert-clause source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [assert-clause]
   (.getFirstToken ^js assert-clause))
  (^js [assert-clause source-file]
   (.getFirstToken ^js assert-clause source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [assert-clause]
   (.getLastToken ^js assert-clause))
  (^js [assert-clause source-file]
   (.getLastToken ^js assert-clause source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [assert-clause cb-node]
   (.forEachChild ^js assert-clause cb-node))
  (^js [assert-clause cb-node cb-node-array]
   (.forEachChild ^js assert-clause cb-node cb-node-array)))

(defn pos
  "**Returns:** `number`"
  ^js [assert-clause]
  (.-pos ^js assert-clause))

(defn end
  "**Returns:** `number`"
  ^js [assert-clause]
  (.-end ^js assert-clause))
