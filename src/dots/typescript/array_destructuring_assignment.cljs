(ns dots.typescript.array-destructuring-assignment)

(defn left
  ^js [array-destructuring-assignment]
  (.-left ^js array-destructuring-assignment))

(defn operator-token
  ^js [array-destructuring-assignment]
  (.-operatorToken ^js array-destructuring-assignment))

(defn kind
  ^js [array-destructuring-assignment]
  (.-kind ^js array-destructuring-assignment))

(defn right
  ^js [array-destructuring-assignment]
  (.-right ^js array-destructuring-assignment))

(defn flags
  ^js [array-destructuring-assignment]
  (.-flags ^js array-destructuring-assignment))

(defn parent
  ^js [array-destructuring-assignment]
  (.-parent ^js array-destructuring-assignment))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [array-destructuring-assignment]
  (.getSourceFile ^js array-destructuring-assignment))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [array-destructuring-assignment]
   (.getChildCount ^js array-destructuring-assignment))
  (^js [array-destructuring-assignment source-file]
   (.getChildCount ^js array-destructuring-assignment source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [array-destructuring-assignment index]
   (.getChildAt ^js array-destructuring-assignment index))
  (^js [array-destructuring-assignment index source-file]
   (.getChildAt ^js array-destructuring-assignment index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [array-destructuring-assignment]
   (.getChildren ^js array-destructuring-assignment))
  (^js [array-destructuring-assignment source-file]
   (.getChildren ^js array-destructuring-assignment source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [array-destructuring-assignment]
   (.getStart ^js array-destructuring-assignment))
  (^js [array-destructuring-assignment source-file]
   (.getStart ^js array-destructuring-assignment source-file))
  (^js [array-destructuring-assignment source-file include-js-doc-comment?]
   (.getStart ^js array-destructuring-assignment source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [array-destructuring-assignment]
  (.getFullStart ^js array-destructuring-assignment))

(defn get-end
  "**Returns:** `number`"
  ^js [array-destructuring-assignment]
  (.getEnd ^js array-destructuring-assignment))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [array-destructuring-assignment]
   (.getWidth ^js array-destructuring-assignment))
  (^js [array-destructuring-assignment source-file]
   (.getWidth ^js array-destructuring-assignment source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [array-destructuring-assignment]
  (.getFullWidth ^js array-destructuring-assignment))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [array-destructuring-assignment]
   (.getLeadingTriviaWidth ^js array-destructuring-assignment))
  (^js [array-destructuring-assignment source-file]
   (.getLeadingTriviaWidth ^js array-destructuring-assignment source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [array-destructuring-assignment]
   (.getFullText ^js array-destructuring-assignment))
  (^js [array-destructuring-assignment source-file]
   (.getFullText ^js array-destructuring-assignment source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [array-destructuring-assignment]
   (.getText ^js array-destructuring-assignment))
  (^js [array-destructuring-assignment source-file]
   (.getText ^js array-destructuring-assignment source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [array-destructuring-assignment]
   (.getFirstToken ^js array-destructuring-assignment))
  (^js [array-destructuring-assignment source-file]
   (.getFirstToken ^js array-destructuring-assignment source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [array-destructuring-assignment]
   (.getLastToken ^js array-destructuring-assignment))
  (^js [array-destructuring-assignment source-file]
   (.getLastToken ^js array-destructuring-assignment source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [array-destructuring-assignment cb-node]
   (.forEachChild ^js array-destructuring-assignment cb-node))
  (^js [array-destructuring-assignment cb-node cb-node-array]
   (.forEachChild ^js array-destructuring-assignment cb-node cb-node-array)))

(defn pos
  ^js [array-destructuring-assignment]
  (.-pos ^js array-destructuring-assignment))

(defn end
  ^js [array-destructuring-assignment]
  (.-end ^js array-destructuring-assignment))
