(ns dots.typescript.true-literal)

(defn kind
  ^js [true-literal]
  (.-kind ^js true-literal))

(defn flags
  ^js [true-literal]
  (.-flags ^js true-literal))

(defn parent
  ^js [true-literal]
  (.-parent ^js true-literal))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [true-literal]
  (.getSourceFile ^js true-literal))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [true-literal]
   (.getChildCount ^js true-literal))
  (^js [true-literal source-file]
   (.getChildCount ^js true-literal source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [true-literal index]
   (.getChildAt ^js true-literal index))
  (^js [true-literal index source-file]
   (.getChildAt ^js true-literal index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [true-literal]
   (.getChildren ^js true-literal))
  (^js [true-literal source-file]
   (.getChildren ^js true-literal source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [true-literal]
   (.getStart ^js true-literal))
  (^js [true-literal source-file]
   (.getStart ^js true-literal source-file))
  (^js [true-literal source-file include-js-doc-comment?]
   (.getStart ^js true-literal source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [true-literal]
  (.getFullStart ^js true-literal))

(defn get-end
  "**Returns:** `number`"
  ^js [true-literal]
  (.getEnd ^js true-literal))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [true-literal]
   (.getWidth ^js true-literal))
  (^js [true-literal source-file]
   (.getWidth ^js true-literal source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [true-literal]
  (.getFullWidth ^js true-literal))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [true-literal]
   (.getLeadingTriviaWidth ^js true-literal))
  (^js [true-literal source-file]
   (.getLeadingTriviaWidth ^js true-literal source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [true-literal]
   (.getFullText ^js true-literal))
  (^js [true-literal source-file]
   (.getFullText ^js true-literal source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [true-literal]
   (.getText ^js true-literal))
  (^js [true-literal source-file]
   (.getText ^js true-literal source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [true-literal]
   (.getFirstToken ^js true-literal))
  (^js [true-literal source-file]
   (.getFirstToken ^js true-literal source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [true-literal]
   (.getLastToken ^js true-literal))
  (^js [true-literal source-file]
   (.getLastToken ^js true-literal source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [true-literal cb-node]
   (.forEachChild ^js true-literal cb-node))
  (^js [true-literal cb-node cb-node-array]
   (.forEachChild ^js true-literal cb-node cb-node-array)))

(defn pos
  ^js [true-literal]
  (.-pos ^js true-literal))

(defn end
  ^js [true-literal]
  (.-end ^js true-literal))
