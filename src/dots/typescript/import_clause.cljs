(ns dots.typescript.import-clause
  (:refer-clojure :exclude [name]))

(defn kind
  "**Returns:** `SyntaxKind.ImportClause`"
  ^js [import-clause]
  (.-kind ^js import-clause))

(defn parent
  "**Returns:** `ImportDeclaration`"
  ^js [import-clause]
  (.-parent ^js import-clause))

(defn type-only?
  "**Returns:** `boolean`"
  ^js [import-clause]
  (.-isTypeOnly ^js import-clause))

(defn name
  "**Returns:** `Identifier | undefined`"
  ^js [import-clause]
  (.-name ^js import-clause))

(defn named-bindings
  "**Returns:** `NamedImportBindings | undefined`"
  ^js [import-clause]
  (.-namedBindings ^js import-clause))

(defn flags
  "**Returns:** `NodeFlags`"
  ^js [import-clause]
  (.-flags ^js import-clause))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [import-clause]
  (.getSourceFile ^js import-clause))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [import-clause]
   (.getChildCount ^js import-clause))
  (^js [import-clause source-file]
   (.getChildCount ^js import-clause source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [import-clause index]
   (.getChildAt ^js import-clause index))
  (^js [import-clause index source-file]
   (.getChildAt ^js import-clause index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [import-clause]
   (.getChildren ^js import-clause))
  (^js [import-clause source-file]
   (.getChildren ^js import-clause source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [import-clause]
   (.getStart ^js import-clause))
  (^js [import-clause source-file]
   (.getStart ^js import-clause source-file))
  (^js [import-clause source-file include-js-doc-comment?]
   (.getStart ^js import-clause source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [import-clause]
  (.getFullStart ^js import-clause))

(defn get-end
  "**Returns:** `number`"
  ^js [import-clause]
  (.getEnd ^js import-clause))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [import-clause]
   (.getWidth ^js import-clause))
  (^js [import-clause source-file]
   (.getWidth ^js import-clause source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [import-clause]
  (.getFullWidth ^js import-clause))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [import-clause]
   (.getLeadingTriviaWidth ^js import-clause))
  (^js [import-clause source-file]
   (.getLeadingTriviaWidth ^js import-clause source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [import-clause]
   (.getFullText ^js import-clause))
  (^js [import-clause source-file]
   (.getFullText ^js import-clause source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [import-clause]
   (.getText ^js import-clause))
  (^js [import-clause source-file]
   (.getText ^js import-clause source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [import-clause]
   (.getFirstToken ^js import-clause))
  (^js [import-clause source-file]
   (.getFirstToken ^js import-clause source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [import-clause]
   (.getLastToken ^js import-clause))
  (^js [import-clause source-file]
   (.getLastToken ^js import-clause source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [import-clause cb-node]
   (.forEachChild ^js import-clause cb-node))
  (^js [import-clause cb-node cb-node-array]
   (.forEachChild ^js import-clause cb-node cb-node-array)))

(defn pos
  "**Returns:** `number`"
  ^js [import-clause]
  (.-pos ^js import-clause))

(defn end
  "**Returns:** `number`"
  ^js [import-clause]
  (.-end ^js import-clause))
