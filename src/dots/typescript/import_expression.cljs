(ns dots.typescript.import-expression)

(defn kind
  "**Returns:** `SyntaxKind.ImportKeyword`"
  ^js [import-expression]
  (.-kind ^js import-expression))

(defn flags
  "**Returns:** `NodeFlags`"
  ^js [import-expression]
  (.-flags ^js import-expression))

(defn parent
  "**Returns:** `Node`"
  ^js [import-expression]
  (.-parent ^js import-expression))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [import-expression]
  (.getSourceFile ^js import-expression))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [import-expression]
   (.getChildCount ^js import-expression))
  (^js [import-expression source-file]
   (.getChildCount ^js import-expression source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [import-expression index]
   (.getChildAt ^js import-expression index))
  (^js [import-expression index source-file]
   (.getChildAt ^js import-expression index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [import-expression]
   (.getChildren ^js import-expression))
  (^js [import-expression source-file]
   (.getChildren ^js import-expression source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [import-expression]
   (.getStart ^js import-expression))
  (^js [import-expression source-file]
   (.getStart ^js import-expression source-file))
  (^js [import-expression source-file include-js-doc-comment?]
   (.getStart ^js import-expression source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [import-expression]
  (.getFullStart ^js import-expression))

(defn get-end
  "**Returns:** `number`"
  ^js [import-expression]
  (.getEnd ^js import-expression))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [import-expression]
   (.getWidth ^js import-expression))
  (^js [import-expression source-file]
   (.getWidth ^js import-expression source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [import-expression]
  (.getFullWidth ^js import-expression))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [import-expression]
   (.getLeadingTriviaWidth ^js import-expression))
  (^js [import-expression source-file]
   (.getLeadingTriviaWidth ^js import-expression source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [import-expression]
   (.getFullText ^js import-expression))
  (^js [import-expression source-file]
   (.getFullText ^js import-expression source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [import-expression]
   (.getText ^js import-expression))
  (^js [import-expression source-file]
   (.getText ^js import-expression source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [import-expression]
   (.getFirstToken ^js import-expression))
  (^js [import-expression source-file]
   (.getFirstToken ^js import-expression source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [import-expression]
   (.getLastToken ^js import-expression))
  (^js [import-expression source-file]
   (.getLastToken ^js import-expression source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [import-expression cb-node]
   (.forEachChild ^js import-expression cb-node))
  (^js [import-expression cb-node cb-node-array]
   (.forEachChild ^js import-expression cb-node cb-node-array)))

(defn pos
  "**Returns:** `number`"
  ^js [import-expression]
  (.-pos ^js import-expression))

(defn end
  "**Returns:** `number`"
  ^js [import-expression]
  (.-end ^js import-expression))
