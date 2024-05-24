(ns dots.typescript.object-binding-pattern)

(defn kind
  ^js [object-binding-pattern]
  (.-kind ^js object-binding-pattern))

(defn parent
  ^js [object-binding-pattern]
  (.-parent ^js object-binding-pattern))

(defn elements
  ^js [object-binding-pattern]
  (.-elements ^js object-binding-pattern))

(defn flags
  ^js [object-binding-pattern]
  (.-flags ^js object-binding-pattern))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [object-binding-pattern]
  (.getSourceFile ^js object-binding-pattern))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [object-binding-pattern]
   (.getChildCount ^js object-binding-pattern))
  (^js [object-binding-pattern source-file]
   (.getChildCount ^js object-binding-pattern source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [object-binding-pattern index]
   (.getChildAt ^js object-binding-pattern index))
  (^js [object-binding-pattern index source-file]
   (.getChildAt ^js object-binding-pattern index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [object-binding-pattern]
   (.getChildren ^js object-binding-pattern))
  (^js [object-binding-pattern source-file]
   (.getChildren ^js object-binding-pattern source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [object-binding-pattern]
   (.getStart ^js object-binding-pattern))
  (^js [object-binding-pattern source-file]
   (.getStart ^js object-binding-pattern source-file))
  (^js [object-binding-pattern source-file include-js-doc-comment?]
   (.getStart ^js object-binding-pattern source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [object-binding-pattern]
  (.getFullStart ^js object-binding-pattern))

(defn get-end
  "**Returns:** `number`"
  ^js [object-binding-pattern]
  (.getEnd ^js object-binding-pattern))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [object-binding-pattern]
   (.getWidth ^js object-binding-pattern))
  (^js [object-binding-pattern source-file]
   (.getWidth ^js object-binding-pattern source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [object-binding-pattern]
  (.getFullWidth ^js object-binding-pattern))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [object-binding-pattern]
   (.getLeadingTriviaWidth ^js object-binding-pattern))
  (^js [object-binding-pattern source-file]
   (.getLeadingTriviaWidth ^js object-binding-pattern source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [object-binding-pattern]
   (.getFullText ^js object-binding-pattern))
  (^js [object-binding-pattern source-file]
   (.getFullText ^js object-binding-pattern source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [object-binding-pattern]
   (.getText ^js object-binding-pattern))
  (^js [object-binding-pattern source-file]
   (.getText ^js object-binding-pattern source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [object-binding-pattern]
   (.getFirstToken ^js object-binding-pattern))
  (^js [object-binding-pattern source-file]
   (.getFirstToken ^js object-binding-pattern source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [object-binding-pattern]
   (.getLastToken ^js object-binding-pattern))
  (^js [object-binding-pattern source-file]
   (.getLastToken ^js object-binding-pattern source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [object-binding-pattern cb-node]
   (.forEachChild ^js object-binding-pattern cb-node))
  (^js [object-binding-pattern cb-node cb-node-array]
   (.forEachChild ^js object-binding-pattern cb-node cb-node-array)))

(defn pos
  ^js [object-binding-pattern]
  (.-pos ^js object-binding-pattern))

(defn end
  ^js [object-binding-pattern]
  (.-end ^js object-binding-pattern))
