(ns dots.typescript.this-expression)

(defn kind
  "**Returns:** `SyntaxKind.ThisKeyword`"
  ^js [this-expression]
  (.-kind ^js this-expression))

(defn flags
  "**Returns:** `NodeFlags`"
  ^js [this-expression]
  (.-flags ^js this-expression))

(defn parent
  "**Returns:** `Node`"
  ^js [this-expression]
  (.-parent ^js this-expression))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [this-expression]
  (.getSourceFile ^js this-expression))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [this-expression]
   (.getChildCount ^js this-expression))
  (^js [this-expression source-file]
   (.getChildCount ^js this-expression source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [this-expression index]
   (.getChildAt ^js this-expression index))
  (^js [this-expression index source-file]
   (.getChildAt ^js this-expression index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [this-expression]
   (.getChildren ^js this-expression))
  (^js [this-expression source-file]
   (.getChildren ^js this-expression source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [this-expression]
   (.getStart ^js this-expression))
  (^js [this-expression source-file]
   (.getStart ^js this-expression source-file))
  (^js [this-expression source-file include-js-doc-comment?]
   (.getStart ^js this-expression source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [this-expression]
  (.getFullStart ^js this-expression))

(defn get-end
  "**Returns:** `number`"
  ^js [this-expression]
  (.getEnd ^js this-expression))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [this-expression]
   (.getWidth ^js this-expression))
  (^js [this-expression source-file]
   (.getWidth ^js this-expression source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [this-expression]
  (.getFullWidth ^js this-expression))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [this-expression]
   (.getLeadingTriviaWidth ^js this-expression))
  (^js [this-expression source-file]
   (.getLeadingTriviaWidth ^js this-expression source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [this-expression]
   (.getFullText ^js this-expression))
  (^js [this-expression source-file]
   (.getFullText ^js this-expression source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [this-expression]
   (.getText ^js this-expression))
  (^js [this-expression source-file]
   (.getText ^js this-expression source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [this-expression]
   (.getFirstToken ^js this-expression))
  (^js [this-expression source-file]
   (.getFirstToken ^js this-expression source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [this-expression]
   (.getLastToken ^js this-expression))
  (^js [this-expression source-file]
   (.getLastToken ^js this-expression source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [this-expression cb-node]
   (.forEachChild ^js this-expression cb-node))
  (^js [this-expression cb-node cb-node-array]
   (.forEachChild ^js this-expression cb-node cb-node-array)))

(defn pos
  "**Returns:** `number`"
  ^js [this-expression]
  (.-pos ^js this-expression))

(defn end
  "**Returns:** `number`"
  ^js [this-expression]
  (.-end ^js this-expression))
