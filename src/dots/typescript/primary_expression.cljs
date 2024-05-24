(ns dots.typescript.primary-expression)

(defn kind
  ^js [primary-expression]
  (.-kind ^js primary-expression))

(defn flags
  ^js [primary-expression]
  (.-flags ^js primary-expression))

(defn parent
  ^js [primary-expression]
  (.-parent ^js primary-expression))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [primary-expression]
  (.getSourceFile ^js primary-expression))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [primary-expression]
   (.getChildCount ^js primary-expression))
  (^js [primary-expression source-file]
   (.getChildCount ^js primary-expression source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [primary-expression index]
   (.getChildAt ^js primary-expression index))
  (^js [primary-expression index source-file]
   (.getChildAt ^js primary-expression index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [primary-expression]
   (.getChildren ^js primary-expression))
  (^js [primary-expression source-file]
   (.getChildren ^js primary-expression source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [primary-expression]
   (.getStart ^js primary-expression))
  (^js [primary-expression source-file]
   (.getStart ^js primary-expression source-file))
  (^js [primary-expression source-file include-js-doc-comment?]
   (.getStart ^js primary-expression source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [primary-expression]
  (.getFullStart ^js primary-expression))

(defn get-end
  "**Returns:** `number`"
  ^js [primary-expression]
  (.getEnd ^js primary-expression))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [primary-expression]
   (.getWidth ^js primary-expression))
  (^js [primary-expression source-file]
   (.getWidth ^js primary-expression source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [primary-expression]
  (.getFullWidth ^js primary-expression))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [primary-expression]
   (.getLeadingTriviaWidth ^js primary-expression))
  (^js [primary-expression source-file]
   (.getLeadingTriviaWidth ^js primary-expression source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [primary-expression]
   (.getFullText ^js primary-expression))
  (^js [primary-expression source-file]
   (.getFullText ^js primary-expression source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [primary-expression]
   (.getText ^js primary-expression))
  (^js [primary-expression source-file]
   (.getText ^js primary-expression source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [primary-expression]
   (.getFirstToken ^js primary-expression))
  (^js [primary-expression source-file]
   (.getFirstToken ^js primary-expression source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [primary-expression]
   (.getLastToken ^js primary-expression))
  (^js [primary-expression source-file]
   (.getLastToken ^js primary-expression source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [primary-expression cb-node]
   (.forEachChild ^js primary-expression cb-node))
  (^js [primary-expression cb-node cb-node-array]
   (.forEachChild ^js primary-expression cb-node cb-node-array)))

(defn pos
  ^js [primary-expression]
  (.-pos ^js primary-expression))

(defn end
  ^js [primary-expression]
  (.-end ^js primary-expression))
