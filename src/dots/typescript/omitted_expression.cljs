(ns dots.typescript.omitted-expression)

(defn kind
  ^js [omitted-expression]
  (.-kind ^js omitted-expression))

(defn flags
  ^js [omitted-expression]
  (.-flags ^js omitted-expression))

(defn parent
  ^js [omitted-expression]
  (.-parent ^js omitted-expression))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [omitted-expression]
  (.getSourceFile ^js omitted-expression))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [omitted-expression]
   (.getChildCount ^js omitted-expression))
  (^js [omitted-expression source-file]
   (.getChildCount ^js omitted-expression source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [omitted-expression index]
   (.getChildAt ^js omitted-expression index))
  (^js [omitted-expression index source-file]
   (.getChildAt ^js omitted-expression index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [omitted-expression]
   (.getChildren ^js omitted-expression))
  (^js [omitted-expression source-file]
   (.getChildren ^js omitted-expression source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [omitted-expression]
   (.getStart ^js omitted-expression))
  (^js [omitted-expression source-file]
   (.getStart ^js omitted-expression source-file))
  (^js [omitted-expression source-file include-js-doc-comment?]
   (.getStart ^js omitted-expression source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [omitted-expression]
  (.getFullStart ^js omitted-expression))

(defn get-end
  "**Returns:** `number`"
  ^js [omitted-expression]
  (.getEnd ^js omitted-expression))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [omitted-expression]
   (.getWidth ^js omitted-expression))
  (^js [omitted-expression source-file]
   (.getWidth ^js omitted-expression source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [omitted-expression]
  (.getFullWidth ^js omitted-expression))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [omitted-expression]
   (.getLeadingTriviaWidth ^js omitted-expression))
  (^js [omitted-expression source-file]
   (.getLeadingTriviaWidth ^js omitted-expression source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [omitted-expression]
   (.getFullText ^js omitted-expression))
  (^js [omitted-expression source-file]
   (.getFullText ^js omitted-expression source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [omitted-expression]
   (.getText ^js omitted-expression))
  (^js [omitted-expression source-file]
   (.getText ^js omitted-expression source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [omitted-expression]
   (.getFirstToken ^js omitted-expression))
  (^js [omitted-expression source-file]
   (.getFirstToken ^js omitted-expression source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [omitted-expression]
   (.getLastToken ^js omitted-expression))
  (^js [omitted-expression source-file]
   (.getLastToken ^js omitted-expression source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [omitted-expression cb-node]
   (.forEachChild ^js omitted-expression cb-node))
  (^js [omitted-expression cb-node cb-node-array]
   (.forEachChild ^js omitted-expression cb-node cb-node-array)))

(defn pos
  ^js [omitted-expression]
  (.-pos ^js omitted-expression))

(defn end
  ^js [omitted-expression]
  (.-end ^js omitted-expression))
