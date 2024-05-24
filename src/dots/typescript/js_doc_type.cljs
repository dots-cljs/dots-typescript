(ns dots.typescript.js-doc-type)

(defn kind
  ^js [js-doc-type]
  (.-kind ^js js-doc-type))

(defn flags
  ^js [js-doc-type]
  (.-flags ^js js-doc-type))

(defn parent
  ^js [js-doc-type]
  (.-parent ^js js-doc-type))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [js-doc-type]
  (.getSourceFile ^js js-doc-type))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [js-doc-type]
   (.getChildCount ^js js-doc-type))
  (^js [js-doc-type source-file]
   (.getChildCount ^js js-doc-type source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [js-doc-type index]
   (.getChildAt ^js js-doc-type index))
  (^js [js-doc-type index source-file]
   (.getChildAt ^js js-doc-type index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [js-doc-type]
   (.getChildren ^js js-doc-type))
  (^js [js-doc-type source-file]
   (.getChildren ^js js-doc-type source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [js-doc-type]
   (.getStart ^js js-doc-type))
  (^js [js-doc-type source-file]
   (.getStart ^js js-doc-type source-file))
  (^js [js-doc-type source-file include-js-doc-comment?]
   (.getStart ^js js-doc-type source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [js-doc-type]
  (.getFullStart ^js js-doc-type))

(defn get-end
  "**Returns:** `number`"
  ^js [js-doc-type]
  (.getEnd ^js js-doc-type))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [js-doc-type]
   (.getWidth ^js js-doc-type))
  (^js [js-doc-type source-file]
   (.getWidth ^js js-doc-type source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [js-doc-type]
  (.getFullWidth ^js js-doc-type))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [js-doc-type]
   (.getLeadingTriviaWidth ^js js-doc-type))
  (^js [js-doc-type source-file]
   (.getLeadingTriviaWidth ^js js-doc-type source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [js-doc-type]
   (.getFullText ^js js-doc-type))
  (^js [js-doc-type source-file]
   (.getFullText ^js js-doc-type source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [js-doc-type]
   (.getText ^js js-doc-type))
  (^js [js-doc-type source-file]
   (.getText ^js js-doc-type source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [js-doc-type]
   (.getFirstToken ^js js-doc-type))
  (^js [js-doc-type source-file]
   (.getFirstToken ^js js-doc-type source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [js-doc-type]
   (.getLastToken ^js js-doc-type))
  (^js [js-doc-type source-file]
   (.getLastToken ^js js-doc-type source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [js-doc-type cb-node]
   (.forEachChild ^js js-doc-type cb-node))
  (^js [js-doc-type cb-node cb-node-array]
   (.forEachChild ^js js-doc-type cb-node cb-node-array)))

(defn pos
  ^js [js-doc-type]
  (.-pos ^js js-doc-type))

(defn end
  ^js [js-doc-type]
  (.-end ^js js-doc-type))
