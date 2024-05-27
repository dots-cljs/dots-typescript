(ns dots.typescript.null-literal)

(defn kind
  "**Returns:** `SyntaxKind.NullKeyword`"
  ^js [null-literal]
  (.-kind ^js null-literal))

(defn flags
  "**Returns:** `NodeFlags`"
  ^js [null-literal]
  (.-flags ^js null-literal))

(defn parent
  "**Returns:** `Node`"
  ^js [null-literal]
  (.-parent ^js null-literal))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [null-literal]
  (.getSourceFile ^js null-literal))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [null-literal]
   (.getChildCount ^js null-literal))
  (^js [null-literal source-file]
   (.getChildCount ^js null-literal source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [null-literal index]
   (.getChildAt ^js null-literal index))
  (^js [null-literal index source-file]
   (.getChildAt ^js null-literal index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [null-literal]
   (.getChildren ^js null-literal))
  (^js [null-literal source-file]
   (.getChildren ^js null-literal source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [null-literal]
   (.getStart ^js null-literal))
  (^js [null-literal source-file]
   (.getStart ^js null-literal source-file))
  (^js [null-literal source-file include-js-doc-comment?]
   (.getStart ^js null-literal source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [null-literal]
  (.getFullStart ^js null-literal))

(defn get-end
  "**Returns:** `number`"
  ^js [null-literal]
  (.getEnd ^js null-literal))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [null-literal]
   (.getWidth ^js null-literal))
  (^js [null-literal source-file]
   (.getWidth ^js null-literal source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [null-literal]
  (.getFullWidth ^js null-literal))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [null-literal]
   (.getLeadingTriviaWidth ^js null-literal))
  (^js [null-literal source-file]
   (.getLeadingTriviaWidth ^js null-literal source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [null-literal]
   (.getFullText ^js null-literal))
  (^js [null-literal source-file]
   (.getFullText ^js null-literal source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [null-literal]
   (.getText ^js null-literal))
  (^js [null-literal source-file]
   (.getText ^js null-literal source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [null-literal]
   (.getFirstToken ^js null-literal))
  (^js [null-literal source-file]
   (.getFirstToken ^js null-literal source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [null-literal]
   (.getLastToken ^js null-literal))
  (^js [null-literal source-file]
   (.getLastToken ^js null-literal source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [null-literal cb-node]
   (.forEachChild ^js null-literal cb-node))
  (^js [null-literal cb-node cb-node-array]
   (.forEachChild ^js null-literal cb-node cb-node-array)))

(defn pos
  "**Returns:** `number`"
  ^js [null-literal]
  (.-pos ^js null-literal))

(defn end
  "**Returns:** `number`"
  ^js [null-literal]
  (.-end ^js null-literal))
