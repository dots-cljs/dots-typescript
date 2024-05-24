(ns dots.typescript.yield-expression)

(defn kind
  ^js [yield-expression]
  (.-kind ^js yield-expression))

(defn asterisk-token
  ^js [yield-expression]
  (.-asteriskToken ^js yield-expression))

(defn expression
  ^js [yield-expression]
  (.-expression ^js yield-expression))

(defn flags
  ^js [yield-expression]
  (.-flags ^js yield-expression))

(defn parent
  ^js [yield-expression]
  (.-parent ^js yield-expression))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [yield-expression]
  (.getSourceFile ^js yield-expression))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [yield-expression]
   (.getChildCount ^js yield-expression))
  (^js [yield-expression source-file]
   (.getChildCount ^js yield-expression source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [yield-expression index]
   (.getChildAt ^js yield-expression index))
  (^js [yield-expression index source-file]
   (.getChildAt ^js yield-expression index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [yield-expression]
   (.getChildren ^js yield-expression))
  (^js [yield-expression source-file]
   (.getChildren ^js yield-expression source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [yield-expression]
   (.getStart ^js yield-expression))
  (^js [yield-expression source-file]
   (.getStart ^js yield-expression source-file))
  (^js [yield-expression source-file include-js-doc-comment?]
   (.getStart ^js yield-expression source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [yield-expression]
  (.getFullStart ^js yield-expression))

(defn get-end
  "**Returns:** `number`"
  ^js [yield-expression]
  (.getEnd ^js yield-expression))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [yield-expression]
   (.getWidth ^js yield-expression))
  (^js [yield-expression source-file]
   (.getWidth ^js yield-expression source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [yield-expression]
  (.getFullWidth ^js yield-expression))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [yield-expression]
   (.getLeadingTriviaWidth ^js yield-expression))
  (^js [yield-expression source-file]
   (.getLeadingTriviaWidth ^js yield-expression source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [yield-expression]
   (.getFullText ^js yield-expression))
  (^js [yield-expression source-file]
   (.getFullText ^js yield-expression source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [yield-expression]
   (.getText ^js yield-expression))
  (^js [yield-expression source-file]
   (.getText ^js yield-expression source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [yield-expression]
   (.getFirstToken ^js yield-expression))
  (^js [yield-expression source-file]
   (.getFirstToken ^js yield-expression source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [yield-expression]
   (.getLastToken ^js yield-expression))
  (^js [yield-expression source-file]
   (.getLastToken ^js yield-expression source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [yield-expression cb-node]
   (.forEachChild ^js yield-expression cb-node))
  (^js [yield-expression cb-node cb-node-array]
   (.forEachChild ^js yield-expression cb-node cb-node-array)))

(defn pos
  ^js [yield-expression]
  (.-pos ^js yield-expression))

(defn end
  ^js [yield-expression]
  (.-end ^js yield-expression))
