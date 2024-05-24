(ns dots.typescript.object-destructuring-assignment)

(defn left
  ^js [object-destructuring-assignment]
  (.-left ^js object-destructuring-assignment))

(defn operator-token
  ^js [object-destructuring-assignment]
  (.-operatorToken ^js object-destructuring-assignment))

(defn kind
  ^js [object-destructuring-assignment]
  (.-kind ^js object-destructuring-assignment))

(defn right
  ^js [object-destructuring-assignment]
  (.-right ^js object-destructuring-assignment))

(defn flags
  ^js [object-destructuring-assignment]
  (.-flags ^js object-destructuring-assignment))

(defn parent
  ^js [object-destructuring-assignment]
  (.-parent ^js object-destructuring-assignment))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [object-destructuring-assignment]
  (.getSourceFile ^js object-destructuring-assignment))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [object-destructuring-assignment]
   (.getChildCount ^js object-destructuring-assignment))
  (^js [object-destructuring-assignment source-file]
   (.getChildCount ^js object-destructuring-assignment source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [object-destructuring-assignment index]
   (.getChildAt ^js object-destructuring-assignment index))
  (^js [object-destructuring-assignment index source-file]
   (.getChildAt ^js object-destructuring-assignment index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [object-destructuring-assignment]
   (.getChildren ^js object-destructuring-assignment))
  (^js [object-destructuring-assignment source-file]
   (.getChildren ^js object-destructuring-assignment source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [object-destructuring-assignment]
   (.getStart ^js object-destructuring-assignment))
  (^js [object-destructuring-assignment source-file]
   (.getStart ^js object-destructuring-assignment source-file))
  (^js [object-destructuring-assignment source-file include-js-doc-comment?]
   (.getStart ^js object-destructuring-assignment source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [object-destructuring-assignment]
  (.getFullStart ^js object-destructuring-assignment))

(defn get-end
  "**Returns:** `number`"
  ^js [object-destructuring-assignment]
  (.getEnd ^js object-destructuring-assignment))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [object-destructuring-assignment]
   (.getWidth ^js object-destructuring-assignment))
  (^js [object-destructuring-assignment source-file]
   (.getWidth ^js object-destructuring-assignment source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [object-destructuring-assignment]
  (.getFullWidth ^js object-destructuring-assignment))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [object-destructuring-assignment]
   (.getLeadingTriviaWidth ^js object-destructuring-assignment))
  (^js [object-destructuring-assignment source-file]
   (.getLeadingTriviaWidth ^js object-destructuring-assignment source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [object-destructuring-assignment]
   (.getFullText ^js object-destructuring-assignment))
  (^js [object-destructuring-assignment source-file]
   (.getFullText ^js object-destructuring-assignment source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [object-destructuring-assignment]
   (.getText ^js object-destructuring-assignment))
  (^js [object-destructuring-assignment source-file]
   (.getText ^js object-destructuring-assignment source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [object-destructuring-assignment]
   (.getFirstToken ^js object-destructuring-assignment))
  (^js [object-destructuring-assignment source-file]
   (.getFirstToken ^js object-destructuring-assignment source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [object-destructuring-assignment]
   (.getLastToken ^js object-destructuring-assignment))
  (^js [object-destructuring-assignment source-file]
   (.getLastToken ^js object-destructuring-assignment source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [object-destructuring-assignment cb-node]
   (.forEachChild ^js object-destructuring-assignment cb-node))
  (^js [object-destructuring-assignment cb-node cb-node-array]
   (.forEachChild ^js object-destructuring-assignment cb-node cb-node-array)))

(defn pos
  ^js [object-destructuring-assignment]
  (.-pos ^js object-destructuring-assignment))

(defn end
  ^js [object-destructuring-assignment]
  (.-end ^js object-destructuring-assignment))
