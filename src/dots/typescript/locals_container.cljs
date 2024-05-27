(ns dots.typescript.locals-container)

(defn kind
  "**Returns:** `SyntaxKind`"
  ^js [locals-container]
  (.-kind ^js locals-container))

(defn flags
  "**Returns:** `NodeFlags`"
  ^js [locals-container]
  (.-flags ^js locals-container))

(defn parent
  "**Returns:** `Node`"
  ^js [locals-container]
  (.-parent ^js locals-container))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [locals-container]
  (.getSourceFile ^js locals-container))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [locals-container]
   (.getChildCount ^js locals-container))
  (^js [locals-container source-file]
   (.getChildCount ^js locals-container source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [locals-container index]
   (.getChildAt ^js locals-container index))
  (^js [locals-container index source-file]
   (.getChildAt ^js locals-container index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [locals-container]
   (.getChildren ^js locals-container))
  (^js [locals-container source-file]
   (.getChildren ^js locals-container source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [locals-container]
   (.getStart ^js locals-container))
  (^js [locals-container source-file]
   (.getStart ^js locals-container source-file))
  (^js [locals-container source-file include-js-doc-comment?]
   (.getStart ^js locals-container source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [locals-container]
  (.getFullStart ^js locals-container))

(defn get-end
  "**Returns:** `number`"
  ^js [locals-container]
  (.getEnd ^js locals-container))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [locals-container]
   (.getWidth ^js locals-container))
  (^js [locals-container source-file]
   (.getWidth ^js locals-container source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [locals-container]
  (.getFullWidth ^js locals-container))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [locals-container]
   (.getLeadingTriviaWidth ^js locals-container))
  (^js [locals-container source-file]
   (.getLeadingTriviaWidth ^js locals-container source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [locals-container]
   (.getFullText ^js locals-container))
  (^js [locals-container source-file]
   (.getFullText ^js locals-container source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [locals-container]
   (.getText ^js locals-container))
  (^js [locals-container source-file]
   (.getText ^js locals-container source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [locals-container]
   (.getFirstToken ^js locals-container))
  (^js [locals-container source-file]
   (.getFirstToken ^js locals-container source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [locals-container]
   (.getLastToken ^js locals-container))
  (^js [locals-container source-file]
   (.getLastToken ^js locals-container source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [locals-container cb-node]
   (.forEachChild ^js locals-container cb-node))
  (^js [locals-container cb-node cb-node-array]
   (.forEachChild ^js locals-container cb-node cb-node-array)))

(defn pos
  "**Returns:** `number`"
  ^js [locals-container]
  (.-pos ^js locals-container))

(defn end
  "**Returns:** `number`"
  ^js [locals-container]
  (.-end ^js locals-container))
