(ns dots.typescript.js-doc-type-literal)

(defn kind
  "**Returns:** `SyntaxKind.JSDocTypeLiteral`"
  ^js [js-doc-type-literal]
  (.-kind ^js js-doc-type-literal))

(defn js-doc-property-tags
  "**Returns:** `readonly JSDocPropertyLikeTag[] | undefined`"
  ^js [js-doc-type-literal]
  (.-jsDocPropertyTags ^js js-doc-type-literal))

(defn array-type?
  "If true, then this type literal represents an *array* of its type.
   
   **Returns:** `boolean`"
  ^js [js-doc-type-literal]
  (.-isArrayType ^js js-doc-type-literal))

(defn flags
  "**Returns:** `NodeFlags`"
  ^js [js-doc-type-literal]
  (.-flags ^js js-doc-type-literal))

(defn parent
  "**Returns:** `Node`"
  ^js [js-doc-type-literal]
  (.-parent ^js js-doc-type-literal))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [js-doc-type-literal]
  (.getSourceFile ^js js-doc-type-literal))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [js-doc-type-literal]
   (.getChildCount ^js js-doc-type-literal))
  (^js [js-doc-type-literal source-file]
   (.getChildCount ^js js-doc-type-literal source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [js-doc-type-literal index]
   (.getChildAt ^js js-doc-type-literal index))
  (^js [js-doc-type-literal index source-file]
   (.getChildAt ^js js-doc-type-literal index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [js-doc-type-literal]
   (.getChildren ^js js-doc-type-literal))
  (^js [js-doc-type-literal source-file]
   (.getChildren ^js js-doc-type-literal source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [js-doc-type-literal]
   (.getStart ^js js-doc-type-literal))
  (^js [js-doc-type-literal source-file]
   (.getStart ^js js-doc-type-literal source-file))
  (^js [js-doc-type-literal source-file include-js-doc-comment?]
   (.getStart ^js js-doc-type-literal source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [js-doc-type-literal]
  (.getFullStart ^js js-doc-type-literal))

(defn get-end
  "**Returns:** `number`"
  ^js [js-doc-type-literal]
  (.getEnd ^js js-doc-type-literal))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [js-doc-type-literal]
   (.getWidth ^js js-doc-type-literal))
  (^js [js-doc-type-literal source-file]
   (.getWidth ^js js-doc-type-literal source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [js-doc-type-literal]
  (.getFullWidth ^js js-doc-type-literal))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [js-doc-type-literal]
   (.getLeadingTriviaWidth ^js js-doc-type-literal))
  (^js [js-doc-type-literal source-file]
   (.getLeadingTriviaWidth ^js js-doc-type-literal source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [js-doc-type-literal]
   (.getFullText ^js js-doc-type-literal))
  (^js [js-doc-type-literal source-file]
   (.getFullText ^js js-doc-type-literal source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [js-doc-type-literal]
   (.getText ^js js-doc-type-literal))
  (^js [js-doc-type-literal source-file]
   (.getText ^js js-doc-type-literal source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [js-doc-type-literal]
   (.getFirstToken ^js js-doc-type-literal))
  (^js [js-doc-type-literal source-file]
   (.getFirstToken ^js js-doc-type-literal source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [js-doc-type-literal]
   (.getLastToken ^js js-doc-type-literal))
  (^js [js-doc-type-literal source-file]
   (.getLastToken ^js js-doc-type-literal source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [js-doc-type-literal cb-node]
   (.forEachChild ^js js-doc-type-literal cb-node))
  (^js [js-doc-type-literal cb-node cb-node-array]
   (.forEachChild ^js js-doc-type-literal cb-node cb-node-array)))

(defn pos
  "**Returns:** `number`"
  ^js [js-doc-type-literal]
  (.-pos ^js js-doc-type-literal))

(defn end
  "**Returns:** `number`"
  ^js [js-doc-type-literal]
  (.-end ^js js-doc-type-literal))
