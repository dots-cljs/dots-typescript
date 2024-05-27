(ns dots.typescript.indexed-access-type-node)

(defn kind
  "**Returns:** `SyntaxKind.IndexedAccessType`"
  ^js [indexed-access-type-node]
  (.-kind ^js indexed-access-type-node))

(defn object-type
  "**Returns:** `TypeNode`"
  ^js [indexed-access-type-node]
  (.-objectType ^js indexed-access-type-node))

(defn index-type
  "**Returns:** `TypeNode`"
  ^js [indexed-access-type-node]
  (.-indexType ^js indexed-access-type-node))

(defn flags
  "**Returns:** `NodeFlags`"
  ^js [indexed-access-type-node]
  (.-flags ^js indexed-access-type-node))

(defn parent
  "**Returns:** `Node`"
  ^js [indexed-access-type-node]
  (.-parent ^js indexed-access-type-node))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [indexed-access-type-node]
  (.getSourceFile ^js indexed-access-type-node))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [indexed-access-type-node]
   (.getChildCount ^js indexed-access-type-node))
  (^js [indexed-access-type-node source-file]
   (.getChildCount ^js indexed-access-type-node source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [indexed-access-type-node index]
   (.getChildAt ^js indexed-access-type-node index))
  (^js [indexed-access-type-node index source-file]
   (.getChildAt ^js indexed-access-type-node index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [indexed-access-type-node]
   (.getChildren ^js indexed-access-type-node))
  (^js [indexed-access-type-node source-file]
   (.getChildren ^js indexed-access-type-node source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [indexed-access-type-node]
   (.getStart ^js indexed-access-type-node))
  (^js [indexed-access-type-node source-file]
   (.getStart ^js indexed-access-type-node source-file))
  (^js [indexed-access-type-node source-file include-js-doc-comment?]
   (.getStart ^js indexed-access-type-node source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [indexed-access-type-node]
  (.getFullStart ^js indexed-access-type-node))

(defn get-end
  "**Returns:** `number`"
  ^js [indexed-access-type-node]
  (.getEnd ^js indexed-access-type-node))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [indexed-access-type-node]
   (.getWidth ^js indexed-access-type-node))
  (^js [indexed-access-type-node source-file]
   (.getWidth ^js indexed-access-type-node source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [indexed-access-type-node]
  (.getFullWidth ^js indexed-access-type-node))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [indexed-access-type-node]
   (.getLeadingTriviaWidth ^js indexed-access-type-node))
  (^js [indexed-access-type-node source-file]
   (.getLeadingTriviaWidth ^js indexed-access-type-node source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [indexed-access-type-node]
   (.getFullText ^js indexed-access-type-node))
  (^js [indexed-access-type-node source-file]
   (.getFullText ^js indexed-access-type-node source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [indexed-access-type-node]
   (.getText ^js indexed-access-type-node))
  (^js [indexed-access-type-node source-file]
   (.getText ^js indexed-access-type-node source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [indexed-access-type-node]
   (.getFirstToken ^js indexed-access-type-node))
  (^js [indexed-access-type-node source-file]
   (.getFirstToken ^js indexed-access-type-node source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [indexed-access-type-node]
   (.getLastToken ^js indexed-access-type-node))
  (^js [indexed-access-type-node source-file]
   (.getLastToken ^js indexed-access-type-node source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [indexed-access-type-node cb-node]
   (.forEachChild ^js indexed-access-type-node cb-node))
  (^js [indexed-access-type-node cb-node cb-node-array]
   (.forEachChild ^js indexed-access-type-node cb-node cb-node-array)))

(defn pos
  "**Returns:** `number`"
  ^js [indexed-access-type-node]
  (.-pos ^js indexed-access-type-node))

(defn end
  "**Returns:** `number`"
  ^js [indexed-access-type-node]
  (.-end ^js indexed-access-type-node))
