(ns dots.typescript.conditional-expression)

(defn kind
  ^js [conditional-expression]
  (.-kind ^js conditional-expression))

(defn condition
  ^js [conditional-expression]
  (.-condition ^js conditional-expression))

(defn question-token
  ^js [conditional-expression]
  (.-questionToken ^js conditional-expression))

(defn when-true
  ^js [conditional-expression]
  (.-whenTrue ^js conditional-expression))

(defn colon-token
  ^js [conditional-expression]
  (.-colonToken ^js conditional-expression))

(defn when-false
  ^js [conditional-expression]
  (.-whenFalse ^js conditional-expression))

(defn flags
  ^js [conditional-expression]
  (.-flags ^js conditional-expression))

(defn parent
  ^js [conditional-expression]
  (.-parent ^js conditional-expression))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [conditional-expression]
  (.getSourceFile ^js conditional-expression))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [conditional-expression]
   (.getChildCount ^js conditional-expression))
  (^js [conditional-expression source-file]
   (.getChildCount ^js conditional-expression source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [conditional-expression index]
   (.getChildAt ^js conditional-expression index))
  (^js [conditional-expression index source-file]
   (.getChildAt ^js conditional-expression index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [conditional-expression]
   (.getChildren ^js conditional-expression))
  (^js [conditional-expression source-file]
   (.getChildren ^js conditional-expression source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [conditional-expression]
   (.getStart ^js conditional-expression))
  (^js [conditional-expression source-file]
   (.getStart ^js conditional-expression source-file))
  (^js [conditional-expression source-file include-js-doc-comment?]
   (.getStart ^js conditional-expression source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [conditional-expression]
  (.getFullStart ^js conditional-expression))

(defn get-end
  "**Returns:** `number`"
  ^js [conditional-expression]
  (.getEnd ^js conditional-expression))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [conditional-expression]
   (.getWidth ^js conditional-expression))
  (^js [conditional-expression source-file]
   (.getWidth ^js conditional-expression source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [conditional-expression]
  (.getFullWidth ^js conditional-expression))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [conditional-expression]
   (.getLeadingTriviaWidth ^js conditional-expression))
  (^js [conditional-expression source-file]
   (.getLeadingTriviaWidth ^js conditional-expression source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [conditional-expression]
   (.getFullText ^js conditional-expression))
  (^js [conditional-expression source-file]
   (.getFullText ^js conditional-expression source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [conditional-expression]
   (.getText ^js conditional-expression))
  (^js [conditional-expression source-file]
   (.getText ^js conditional-expression source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [conditional-expression]
   (.getFirstToken ^js conditional-expression))
  (^js [conditional-expression source-file]
   (.getFirstToken ^js conditional-expression source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [conditional-expression]
   (.getLastToken ^js conditional-expression))
  (^js [conditional-expression source-file]
   (.getLastToken ^js conditional-expression source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [conditional-expression cb-node]
   (.forEachChild ^js conditional-expression cb-node))
  (^js [conditional-expression cb-node cb-node-array]
   (.forEachChild ^js conditional-expression cb-node cb-node-array)))

(defn pos
  ^js [conditional-expression]
  (.-pos ^js conditional-expression))

(defn end
  ^js [conditional-expression]
  (.-end ^js conditional-expression))
