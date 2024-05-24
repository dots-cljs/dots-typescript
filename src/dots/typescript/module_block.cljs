(ns dots.typescript.module-block)

(defn kind
  ^js [module-block]
  (.-kind ^js module-block))

(defn parent
  ^js [module-block]
  (.-parent ^js module-block))

(defn statements
  ^js [module-block]
  (.-statements ^js module-block))

(defn flags
  ^js [module-block]
  (.-flags ^js module-block))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [module-block]
  (.getSourceFile ^js module-block))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [module-block]
   (.getChildCount ^js module-block))
  (^js [module-block source-file]
   (.getChildCount ^js module-block source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [module-block index]
   (.getChildAt ^js module-block index))
  (^js [module-block index source-file]
   (.getChildAt ^js module-block index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [module-block]
   (.getChildren ^js module-block))
  (^js [module-block source-file]
   (.getChildren ^js module-block source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [module-block]
   (.getStart ^js module-block))
  (^js [module-block source-file]
   (.getStart ^js module-block source-file))
  (^js [module-block source-file include-js-doc-comment?]
   (.getStart ^js module-block source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [module-block]
  (.getFullStart ^js module-block))

(defn get-end
  "**Returns:** `number`"
  ^js [module-block]
  (.getEnd ^js module-block))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [module-block]
   (.getWidth ^js module-block))
  (^js [module-block source-file]
   (.getWidth ^js module-block source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [module-block]
  (.getFullWidth ^js module-block))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [module-block]
   (.getLeadingTriviaWidth ^js module-block))
  (^js [module-block source-file]
   (.getLeadingTriviaWidth ^js module-block source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [module-block]
   (.getFullText ^js module-block))
  (^js [module-block source-file]
   (.getFullText ^js module-block source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [module-block]
   (.getText ^js module-block))
  (^js [module-block source-file]
   (.getText ^js module-block source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [module-block]
   (.getFirstToken ^js module-block))
  (^js [module-block source-file]
   (.getFirstToken ^js module-block source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [module-block]
   (.getLastToken ^js module-block))
  (^js [module-block source-file]
   (.getLastToken ^js module-block source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [module-block cb-node]
   (.forEachChild ^js module-block cb-node))
  (^js [module-block cb-node cb-node-array]
   (.forEachChild ^js module-block cb-node cb-node-array)))

(defn pos
  ^js [module-block]
  (.-pos ^js module-block))

(defn end
  ^js [module-block]
  (.-end ^js module-block))
