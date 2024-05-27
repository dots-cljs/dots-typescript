(ns dots.typescript.update-expression)

(defn kind
  "**Returns:** `SyntaxKind`"
  ^js [update-expression]
  (.-kind ^js update-expression))

(defn flags
  "**Returns:** `NodeFlags`"
  ^js [update-expression]
  (.-flags ^js update-expression))

(defn parent
  "**Returns:** `Node`"
  ^js [update-expression]
  (.-parent ^js update-expression))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [update-expression]
  (.getSourceFile ^js update-expression))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [update-expression]
   (.getChildCount ^js update-expression))
  (^js [update-expression source-file]
   (.getChildCount ^js update-expression source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [update-expression index]
   (.getChildAt ^js update-expression index))
  (^js [update-expression index source-file]
   (.getChildAt ^js update-expression index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [update-expression]
   (.getChildren ^js update-expression))
  (^js [update-expression source-file]
   (.getChildren ^js update-expression source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [update-expression]
   (.getStart ^js update-expression))
  (^js [update-expression source-file]
   (.getStart ^js update-expression source-file))
  (^js [update-expression source-file include-js-doc-comment?]
   (.getStart ^js update-expression source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [update-expression]
  (.getFullStart ^js update-expression))

(defn get-end
  "**Returns:** `number`"
  ^js [update-expression]
  (.getEnd ^js update-expression))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [update-expression]
   (.getWidth ^js update-expression))
  (^js [update-expression source-file]
   (.getWidth ^js update-expression source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [update-expression]
  (.getFullWidth ^js update-expression))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [update-expression]
   (.getLeadingTriviaWidth ^js update-expression))
  (^js [update-expression source-file]
   (.getLeadingTriviaWidth ^js update-expression source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [update-expression]
   (.getFullText ^js update-expression))
  (^js [update-expression source-file]
   (.getFullText ^js update-expression source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [update-expression]
   (.getText ^js update-expression))
  (^js [update-expression source-file]
   (.getText ^js update-expression source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [update-expression]
   (.getFirstToken ^js update-expression))
  (^js [update-expression source-file]
   (.getFirstToken ^js update-expression source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [update-expression]
   (.getLastToken ^js update-expression))
  (^js [update-expression source-file]
   (.getLastToken ^js update-expression source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [update-expression cb-node]
   (.forEachChild ^js update-expression cb-node))
  (^js [update-expression cb-node cb-node-array]
   (.forEachChild ^js update-expression cb-node cb-node-array)))

(defn pos
  "**Returns:** `number`"
  ^js [update-expression]
  (.-pos ^js update-expression))

(defn end
  "**Returns:** `number`"
  ^js [update-expression]
  (.-end ^js update-expression))
