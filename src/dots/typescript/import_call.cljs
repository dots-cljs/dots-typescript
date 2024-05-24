(ns dots.typescript.import-call)

(defn expression
  ^js [import-call]
  (.-expression ^js import-call))

(defn kind
  ^js [import-call]
  (.-kind ^js import-call))

(defn question-dot-token
  ^js [import-call]
  (.-questionDotToken ^js import-call))

(defn type-arguments
  ^js [import-call]
  (.-typeArguments ^js import-call))

(defn arguments
  ^js [import-call]
  (.-arguments ^js import-call))

(defn flags
  ^js [import-call]
  (.-flags ^js import-call))

(defn parent
  ^js [import-call]
  (.-parent ^js import-call))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [import-call]
  (.getSourceFile ^js import-call))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [import-call]
   (.getChildCount ^js import-call))
  (^js [import-call source-file]
   (.getChildCount ^js import-call source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [import-call index]
   (.getChildAt ^js import-call index))
  (^js [import-call index source-file]
   (.getChildAt ^js import-call index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [import-call]
   (.getChildren ^js import-call))
  (^js [import-call source-file]
   (.getChildren ^js import-call source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [import-call]
   (.getStart ^js import-call))
  (^js [import-call source-file]
   (.getStart ^js import-call source-file))
  (^js [import-call source-file include-js-doc-comment?]
   (.getStart ^js import-call source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [import-call]
  (.getFullStart ^js import-call))

(defn get-end
  "**Returns:** `number`"
  ^js [import-call]
  (.getEnd ^js import-call))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [import-call]
   (.getWidth ^js import-call))
  (^js [import-call source-file]
   (.getWidth ^js import-call source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [import-call]
  (.getFullWidth ^js import-call))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [import-call]
   (.getLeadingTriviaWidth ^js import-call))
  (^js [import-call source-file]
   (.getLeadingTriviaWidth ^js import-call source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [import-call]
   (.getFullText ^js import-call))
  (^js [import-call source-file]
   (.getFullText ^js import-call source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [import-call]
   (.getText ^js import-call))
  (^js [import-call source-file]
   (.getText ^js import-call source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [import-call]
   (.getFirstToken ^js import-call))
  (^js [import-call source-file]
   (.getFirstToken ^js import-call source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [import-call]
   (.getLastToken ^js import-call))
  (^js [import-call source-file]
   (.getLastToken ^js import-call source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [import-call cb-node]
   (.forEachChild ^js import-call cb-node))
  (^js [import-call cb-node cb-node-array]
   (.forEachChild ^js import-call cb-node cb-node-array)))

(defn pos
  ^js [import-call]
  (.-pos ^js import-call))

(defn end
  ^js [import-call]
  (.-end ^js import-call))
