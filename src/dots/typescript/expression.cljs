(ns dots.typescript.expression)

(defn kind
  ^js [expression]
  (.-kind ^js expression))

(defn flags
  ^js [expression]
  (.-flags ^js expression))

(defn parent
  ^js [expression]
  (.-parent ^js expression))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [expression]
  (.getSourceFile ^js expression))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [expression]
   (.getChildCount ^js expression))
  (^js [expression source-file]
   (.getChildCount ^js expression source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [expression index]
   (.getChildAt ^js expression index))
  (^js [expression index source-file]
   (.getChildAt ^js expression index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [expression]
   (.getChildren ^js expression))
  (^js [expression source-file]
   (.getChildren ^js expression source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [expression]
   (.getStart ^js expression))
  (^js [expression source-file]
   (.getStart ^js expression source-file))
  (^js [expression source-file include-js-doc-comment?]
   (.getStart ^js expression source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [expression]
  (.getFullStart ^js expression))

(defn get-end
  "**Returns:** `number`"
  ^js [expression]
  (.getEnd ^js expression))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [expression]
   (.getWidth ^js expression))
  (^js [expression source-file]
   (.getWidth ^js expression source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [expression]
  (.getFullWidth ^js expression))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [expression]
   (.getLeadingTriviaWidth ^js expression))
  (^js [expression source-file]
   (.getLeadingTriviaWidth ^js expression source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [expression]
   (.getFullText ^js expression))
  (^js [expression source-file]
   (.getFullText ^js expression source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [expression]
   (.getText ^js expression))
  (^js [expression source-file]
   (.getText ^js expression source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [expression]
   (.getFirstToken ^js expression))
  (^js [expression source-file]
   (.getFirstToken ^js expression source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [expression]
   (.getLastToken ^js expression))
  (^js [expression source-file]
   (.getLastToken ^js expression source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [expression cb-node]
   (.forEachChild ^js expression cb-node))
  (^js [expression cb-node cb-node-array]
   (.forEachChild ^js expression cb-node cb-node-array)))

(defn pos
  ^js [expression]
  (.-pos ^js expression))

(defn end
  ^js [expression]
  (.-end ^js expression))
