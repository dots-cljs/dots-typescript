(ns dots.typescript.call-expression)

(defn kind
  ^js [call-expression]
  (.-kind ^js call-expression))

(defn expression
  ^js [call-expression]
  (.-expression ^js call-expression))

(defn question-dot-token
  ^js [call-expression]
  (.-questionDotToken ^js call-expression))

(defn type-arguments
  ^js [call-expression]
  (.-typeArguments ^js call-expression))

(defn arguments
  ^js [call-expression]
  (.-arguments ^js call-expression))

(defn flags
  ^js [call-expression]
  (.-flags ^js call-expression))

(defn parent
  ^js [call-expression]
  (.-parent ^js call-expression))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [call-expression]
  (.getSourceFile ^js call-expression))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [call-expression]
   (.getChildCount ^js call-expression))
  (^js [call-expression source-file]
   (.getChildCount ^js call-expression source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [call-expression index]
   (.getChildAt ^js call-expression index))
  (^js [call-expression index source-file]
   (.getChildAt ^js call-expression index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [call-expression]
   (.getChildren ^js call-expression))
  (^js [call-expression source-file]
   (.getChildren ^js call-expression source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [call-expression]
   (.getStart ^js call-expression))
  (^js [call-expression source-file]
   (.getStart ^js call-expression source-file))
  (^js [call-expression source-file include-js-doc-comment?]
   (.getStart ^js call-expression source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [call-expression]
  (.getFullStart ^js call-expression))

(defn get-end
  "**Returns:** `number`"
  ^js [call-expression]
  (.getEnd ^js call-expression))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [call-expression]
   (.getWidth ^js call-expression))
  (^js [call-expression source-file]
   (.getWidth ^js call-expression source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [call-expression]
  (.getFullWidth ^js call-expression))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [call-expression]
   (.getLeadingTriviaWidth ^js call-expression))
  (^js [call-expression source-file]
   (.getLeadingTriviaWidth ^js call-expression source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [call-expression]
   (.getFullText ^js call-expression))
  (^js [call-expression source-file]
   (.getFullText ^js call-expression source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [call-expression]
   (.getText ^js call-expression))
  (^js [call-expression source-file]
   (.getText ^js call-expression source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [call-expression]
   (.getFirstToken ^js call-expression))
  (^js [call-expression source-file]
   (.getFirstToken ^js call-expression source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [call-expression]
   (.getLastToken ^js call-expression))
  (^js [call-expression source-file]
   (.getLastToken ^js call-expression source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [call-expression cb-node]
   (.forEachChild ^js call-expression cb-node))
  (^js [call-expression cb-node cb-node-array]
   (.forEachChild ^js call-expression cb-node cb-node-array)))

(defn pos
  ^js [call-expression]
  (.-pos ^js call-expression))

(defn end
  ^js [call-expression]
  (.-end ^js call-expression))
