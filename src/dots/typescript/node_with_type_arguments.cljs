(ns dots.typescript.node-with-type-arguments)

(defn type-arguments
  ^js [node-with-type-arguments]
  (.-typeArguments ^js node-with-type-arguments))

(defn kind
  ^js [node-with-type-arguments]
  (.-kind ^js node-with-type-arguments))

(defn flags
  ^js [node-with-type-arguments]
  (.-flags ^js node-with-type-arguments))

(defn parent
  ^js [node-with-type-arguments]
  (.-parent ^js node-with-type-arguments))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [node-with-type-arguments]
  (.getSourceFile ^js node-with-type-arguments))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [node-with-type-arguments]
   (.getChildCount ^js node-with-type-arguments))
  (^js [node-with-type-arguments source-file]
   (.getChildCount ^js node-with-type-arguments source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [node-with-type-arguments index]
   (.getChildAt ^js node-with-type-arguments index))
  (^js [node-with-type-arguments index source-file]
   (.getChildAt ^js node-with-type-arguments index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [node-with-type-arguments]
   (.getChildren ^js node-with-type-arguments))
  (^js [node-with-type-arguments source-file]
   (.getChildren ^js node-with-type-arguments source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [node-with-type-arguments]
   (.getStart ^js node-with-type-arguments))
  (^js [node-with-type-arguments source-file]
   (.getStart ^js node-with-type-arguments source-file))
  (^js [node-with-type-arguments source-file include-js-doc-comment?]
   (.getStart ^js node-with-type-arguments source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [node-with-type-arguments]
  (.getFullStart ^js node-with-type-arguments))

(defn get-end
  "**Returns:** `number`"
  ^js [node-with-type-arguments]
  (.getEnd ^js node-with-type-arguments))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [node-with-type-arguments]
   (.getWidth ^js node-with-type-arguments))
  (^js [node-with-type-arguments source-file]
   (.getWidth ^js node-with-type-arguments source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [node-with-type-arguments]
  (.getFullWidth ^js node-with-type-arguments))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [node-with-type-arguments]
   (.getLeadingTriviaWidth ^js node-with-type-arguments))
  (^js [node-with-type-arguments source-file]
   (.getLeadingTriviaWidth ^js node-with-type-arguments source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [node-with-type-arguments]
   (.getFullText ^js node-with-type-arguments))
  (^js [node-with-type-arguments source-file]
   (.getFullText ^js node-with-type-arguments source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [node-with-type-arguments]
   (.getText ^js node-with-type-arguments))
  (^js [node-with-type-arguments source-file]
   (.getText ^js node-with-type-arguments source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [node-with-type-arguments]
   (.getFirstToken ^js node-with-type-arguments))
  (^js [node-with-type-arguments source-file]
   (.getFirstToken ^js node-with-type-arguments source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [node-with-type-arguments]
   (.getLastToken ^js node-with-type-arguments))
  (^js [node-with-type-arguments source-file]
   (.getLastToken ^js node-with-type-arguments source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [node-with-type-arguments cb-node]
   (.forEachChild ^js node-with-type-arguments cb-node))
  (^js [node-with-type-arguments cb-node cb-node-array]
   (.forEachChild ^js node-with-type-arguments cb-node cb-node-array)))

(defn pos
  ^js [node-with-type-arguments]
  (.-pos ^js node-with-type-arguments))

(defn end
  ^js [node-with-type-arguments]
  (.-end ^js node-with-type-arguments))
