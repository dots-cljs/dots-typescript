(ns dots.typescript.js-doc-container)

(defn kind
  ^js [js-doc-container]
  (.-kind ^js js-doc-container))

(defn flags
  ^js [js-doc-container]
  (.-flags ^js js-doc-container))

(defn parent
  ^js [js-doc-container]
  (.-parent ^js js-doc-container))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [js-doc-container]
  (.getSourceFile ^js js-doc-container))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [js-doc-container]
   (.getChildCount ^js js-doc-container))
  (^js [js-doc-container source-file]
   (.getChildCount ^js js-doc-container source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [js-doc-container index]
   (.getChildAt ^js js-doc-container index))
  (^js [js-doc-container index source-file]
   (.getChildAt ^js js-doc-container index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [js-doc-container]
   (.getChildren ^js js-doc-container))
  (^js [js-doc-container source-file]
   (.getChildren ^js js-doc-container source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [js-doc-container]
   (.getStart ^js js-doc-container))
  (^js [js-doc-container source-file]
   (.getStart ^js js-doc-container source-file))
  (^js [js-doc-container source-file include-js-doc-comment?]
   (.getStart ^js js-doc-container source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [js-doc-container]
  (.getFullStart ^js js-doc-container))

(defn get-end
  "**Returns:** `number`"
  ^js [js-doc-container]
  (.getEnd ^js js-doc-container))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [js-doc-container]
   (.getWidth ^js js-doc-container))
  (^js [js-doc-container source-file]
   (.getWidth ^js js-doc-container source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [js-doc-container]
  (.getFullWidth ^js js-doc-container))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [js-doc-container]
   (.getLeadingTriviaWidth ^js js-doc-container))
  (^js [js-doc-container source-file]
   (.getLeadingTriviaWidth ^js js-doc-container source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [js-doc-container]
   (.getFullText ^js js-doc-container))
  (^js [js-doc-container source-file]
   (.getFullText ^js js-doc-container source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [js-doc-container]
   (.getText ^js js-doc-container))
  (^js [js-doc-container source-file]
   (.getText ^js js-doc-container source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [js-doc-container]
   (.getFirstToken ^js js-doc-container))
  (^js [js-doc-container source-file]
   (.getFirstToken ^js js-doc-container source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [js-doc-container]
   (.getLastToken ^js js-doc-container))
  (^js [js-doc-container source-file]
   (.getLastToken ^js js-doc-container source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [js-doc-container cb-node]
   (.forEachChild ^js js-doc-container cb-node))
  (^js [js-doc-container cb-node cb-node-array]
   (.forEachChild ^js js-doc-container cb-node cb-node-array)))

(defn pos
  ^js [js-doc-container]
  (.-pos ^js js-doc-container))

(defn end
  ^js [js-doc-container]
  (.-end ^js js-doc-container))
