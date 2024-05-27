(ns dots.typescript.js-doc-all-type)

(defn kind
  "**Returns:** `SyntaxKind.JSDocAllType`"
  ^js [js-doc-all-type]
  (.-kind ^js js-doc-all-type))

(defn flags
  "**Returns:** `NodeFlags`"
  ^js [js-doc-all-type]
  (.-flags ^js js-doc-all-type))

(defn parent
  "**Returns:** `Node`"
  ^js [js-doc-all-type]
  (.-parent ^js js-doc-all-type))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [js-doc-all-type]
  (.getSourceFile ^js js-doc-all-type))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [js-doc-all-type]
   (.getChildCount ^js js-doc-all-type))
  (^js [js-doc-all-type source-file]
   (.getChildCount ^js js-doc-all-type source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [js-doc-all-type index]
   (.getChildAt ^js js-doc-all-type index))
  (^js [js-doc-all-type index source-file]
   (.getChildAt ^js js-doc-all-type index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [js-doc-all-type]
   (.getChildren ^js js-doc-all-type))
  (^js [js-doc-all-type source-file]
   (.getChildren ^js js-doc-all-type source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [js-doc-all-type]
   (.getStart ^js js-doc-all-type))
  (^js [js-doc-all-type source-file]
   (.getStart ^js js-doc-all-type source-file))
  (^js [js-doc-all-type source-file include-js-doc-comment?]
   (.getStart ^js js-doc-all-type source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [js-doc-all-type]
  (.getFullStart ^js js-doc-all-type))

(defn get-end
  "**Returns:** `number`"
  ^js [js-doc-all-type]
  (.getEnd ^js js-doc-all-type))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [js-doc-all-type]
   (.getWidth ^js js-doc-all-type))
  (^js [js-doc-all-type source-file]
   (.getWidth ^js js-doc-all-type source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [js-doc-all-type]
  (.getFullWidth ^js js-doc-all-type))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [js-doc-all-type]
   (.getLeadingTriviaWidth ^js js-doc-all-type))
  (^js [js-doc-all-type source-file]
   (.getLeadingTriviaWidth ^js js-doc-all-type source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [js-doc-all-type]
   (.getFullText ^js js-doc-all-type))
  (^js [js-doc-all-type source-file]
   (.getFullText ^js js-doc-all-type source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [js-doc-all-type]
   (.getText ^js js-doc-all-type))
  (^js [js-doc-all-type source-file]
   (.getText ^js js-doc-all-type source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [js-doc-all-type]
   (.getFirstToken ^js js-doc-all-type))
  (^js [js-doc-all-type source-file]
   (.getFirstToken ^js js-doc-all-type source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [js-doc-all-type]
   (.getLastToken ^js js-doc-all-type))
  (^js [js-doc-all-type source-file]
   (.getLastToken ^js js-doc-all-type source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [js-doc-all-type cb-node]
   (.forEachChild ^js js-doc-all-type cb-node))
  (^js [js-doc-all-type cb-node cb-node-array]
   (.forEachChild ^js js-doc-all-type cb-node cb-node-array)))

(defn pos
  "**Returns:** `number`"
  ^js [js-doc-all-type]
  (.-pos ^js js-doc-all-type))

(defn end
  "**Returns:** `number`"
  ^js [js-doc-all-type]
  (.-end ^js js-doc-all-type))
