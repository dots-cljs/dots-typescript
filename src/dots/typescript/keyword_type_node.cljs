(ns dots.typescript.keyword-type-node)

(defn kind
  "**Returns:** `TKind`"
  ^js [keyword-type-node]
  (.-kind ^js keyword-type-node))

(defn flags
  "**Returns:** `NodeFlags`"
  ^js [keyword-type-node]
  (.-flags ^js keyword-type-node))

(defn parent
  "**Returns:** `Node`"
  ^js [keyword-type-node]
  (.-parent ^js keyword-type-node))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [keyword-type-node]
  (.getSourceFile ^js keyword-type-node))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [keyword-type-node]
   (.getChildCount ^js keyword-type-node))
  (^js [keyword-type-node source-file]
   (.getChildCount ^js keyword-type-node source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [keyword-type-node index]
   (.getChildAt ^js keyword-type-node index))
  (^js [keyword-type-node index source-file]
   (.getChildAt ^js keyword-type-node index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [keyword-type-node]
   (.getChildren ^js keyword-type-node))
  (^js [keyword-type-node source-file]
   (.getChildren ^js keyword-type-node source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [keyword-type-node]
   (.getStart ^js keyword-type-node))
  (^js [keyword-type-node source-file]
   (.getStart ^js keyword-type-node source-file))
  (^js [keyword-type-node source-file include-js-doc-comment?]
   (.getStart ^js keyword-type-node source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [keyword-type-node]
  (.getFullStart ^js keyword-type-node))

(defn get-end
  "**Returns:** `number`"
  ^js [keyword-type-node]
  (.getEnd ^js keyword-type-node))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [keyword-type-node]
   (.getWidth ^js keyword-type-node))
  (^js [keyword-type-node source-file]
   (.getWidth ^js keyword-type-node source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [keyword-type-node]
  (.getFullWidth ^js keyword-type-node))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [keyword-type-node]
   (.getLeadingTriviaWidth ^js keyword-type-node))
  (^js [keyword-type-node source-file]
   (.getLeadingTriviaWidth ^js keyword-type-node source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [keyword-type-node]
   (.getFullText ^js keyword-type-node))
  (^js [keyword-type-node source-file]
   (.getFullText ^js keyword-type-node source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [keyword-type-node]
   (.getText ^js keyword-type-node))
  (^js [keyword-type-node source-file]
   (.getText ^js keyword-type-node source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [keyword-type-node]
   (.getFirstToken ^js keyword-type-node))
  (^js [keyword-type-node source-file]
   (.getFirstToken ^js keyword-type-node source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [keyword-type-node]
   (.getLastToken ^js keyword-type-node))
  (^js [keyword-type-node source-file]
   (.getLastToken ^js keyword-type-node source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [keyword-type-node cb-node]
   (.forEachChild ^js keyword-type-node cb-node))
  (^js [keyword-type-node cb-node cb-node-array]
   (.forEachChild ^js keyword-type-node cb-node cb-node-array)))

(defn pos
  "**Returns:** `number`"
  ^js [keyword-type-node]
  (.-pos ^js keyword-type-node))

(defn end
  "**Returns:** `number`"
  ^js [keyword-type-node]
  (.-end ^js keyword-type-node))
