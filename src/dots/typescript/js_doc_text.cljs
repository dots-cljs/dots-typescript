(ns dots.typescript.js-doc-text)

(defn kind
  "**Returns:** `SyntaxKind.JSDocText`"
  ^js [js-doc-text]
  (.-kind ^js js-doc-text))

(defn text
  "**Returns:** `string`"
  ^js [js-doc-text]
  (.-text ^js js-doc-text))

(defn set-text!
  ^js [js-doc-text value]
  (set! (.-text ^js js-doc-text) value))

(defn flags
  "**Returns:** `NodeFlags`"
  ^js [js-doc-text]
  (.-flags ^js js-doc-text))

(defn parent
  "**Returns:** `Node`"
  ^js [js-doc-text]
  (.-parent ^js js-doc-text))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [js-doc-text]
  (.getSourceFile ^js js-doc-text))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [js-doc-text]
   (.getChildCount ^js js-doc-text))
  (^js [js-doc-text source-file]
   (.getChildCount ^js js-doc-text source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [js-doc-text index]
   (.getChildAt ^js js-doc-text index))
  (^js [js-doc-text index source-file]
   (.getChildAt ^js js-doc-text index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [js-doc-text]
   (.getChildren ^js js-doc-text))
  (^js [js-doc-text source-file]
   (.getChildren ^js js-doc-text source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [js-doc-text]
   (.getStart ^js js-doc-text))
  (^js [js-doc-text source-file]
   (.getStart ^js js-doc-text source-file))
  (^js [js-doc-text source-file include-js-doc-comment?]
   (.getStart ^js js-doc-text source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [js-doc-text]
  (.getFullStart ^js js-doc-text))

(defn get-end
  "**Returns:** `number`"
  ^js [js-doc-text]
  (.getEnd ^js js-doc-text))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [js-doc-text]
   (.getWidth ^js js-doc-text))
  (^js [js-doc-text source-file]
   (.getWidth ^js js-doc-text source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [js-doc-text]
  (.getFullWidth ^js js-doc-text))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [js-doc-text]
   (.getLeadingTriviaWidth ^js js-doc-text))
  (^js [js-doc-text source-file]
   (.getLeadingTriviaWidth ^js js-doc-text source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [js-doc-text]
   (.getFullText ^js js-doc-text))
  (^js [js-doc-text source-file]
   (.getFullText ^js js-doc-text source-file)))

(defn get-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [js-doc-text]
   (.getText ^js js-doc-text))
  (^js [js-doc-text source-file]
   (.getText ^js js-doc-text source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [js-doc-text]
   (.getFirstToken ^js js-doc-text))
  (^js [js-doc-text source-file]
   (.getFirstToken ^js js-doc-text source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [js-doc-text]
   (.getLastToken ^js js-doc-text))
  (^js [js-doc-text source-file]
   (.getLastToken ^js js-doc-text source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [js-doc-text cb-node]
   (.forEachChild ^js js-doc-text cb-node))
  (^js [js-doc-text cb-node cb-node-array]
   (.forEachChild ^js js-doc-text cb-node cb-node-array)))

(defn pos
  "**Returns:** `number`"
  ^js [js-doc-text]
  (.-pos ^js js-doc-text))

(defn end
  "**Returns:** `number`"
  ^js [js-doc-text]
  (.-end ^js js-doc-text))
