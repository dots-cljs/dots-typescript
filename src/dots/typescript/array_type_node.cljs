(ns dots.typescript.array-type-node)

(defn kind
  "**Returns:** `SyntaxKind.ArrayType`"
  ^js [array-type-node]
  (.-kind ^js array-type-node))

(defn element-type
  "**Returns:** `TypeNode`"
  ^js [array-type-node]
  (.-elementType ^js array-type-node))

(defn flags
  "**Returns:** `NodeFlags`"
  ^js [array-type-node]
  (.-flags ^js array-type-node))

(defn parent
  "**Returns:** `Node`"
  ^js [array-type-node]
  (.-parent ^js array-type-node))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [array-type-node]
  (.getSourceFile ^js array-type-node))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [array-type-node]
   (.getChildCount ^js array-type-node))
  (^js [array-type-node source-file]
   (.getChildCount ^js array-type-node source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [array-type-node index]
   (.getChildAt ^js array-type-node index))
  (^js [array-type-node index source-file]
   (.getChildAt ^js array-type-node index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [array-type-node]
   (.getChildren ^js array-type-node))
  (^js [array-type-node source-file]
   (.getChildren ^js array-type-node source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [array-type-node]
   (.getStart ^js array-type-node))
  (^js [array-type-node source-file]
   (.getStart ^js array-type-node source-file))
  (^js [array-type-node source-file include-js-doc-comment?]
   (.getStart ^js array-type-node source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [array-type-node]
  (.getFullStart ^js array-type-node))

(defn get-end
  "**Returns:** `number`"
  ^js [array-type-node]
  (.getEnd ^js array-type-node))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [array-type-node]
   (.getWidth ^js array-type-node))
  (^js [array-type-node source-file]
   (.getWidth ^js array-type-node source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [array-type-node]
  (.getFullWidth ^js array-type-node))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [array-type-node]
   (.getLeadingTriviaWidth ^js array-type-node))
  (^js [array-type-node source-file]
   (.getLeadingTriviaWidth ^js array-type-node source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [array-type-node]
   (.getFullText ^js array-type-node))
  (^js [array-type-node source-file]
   (.getFullText ^js array-type-node source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [array-type-node]
   (.getText ^js array-type-node))
  (^js [array-type-node source-file]
   (.getText ^js array-type-node source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [array-type-node]
   (.getFirstToken ^js array-type-node))
  (^js [array-type-node source-file]
   (.getFirstToken ^js array-type-node source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [array-type-node]
   (.getLastToken ^js array-type-node))
  (^js [array-type-node source-file]
   (.getLastToken ^js array-type-node source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [array-type-node cb-node]
   (.forEachChild ^js array-type-node cb-node))
  (^js [array-type-node cb-node cb-node-array]
   (.forEachChild ^js array-type-node cb-node cb-node-array)))

(defn pos
  "**Returns:** `number`"
  ^js [array-type-node]
  (.-pos ^js array-type-node))

(defn end
  "**Returns:** `number`"
  ^js [array-type-node]
  (.-end ^js array-type-node))
