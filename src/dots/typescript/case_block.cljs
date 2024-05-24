(ns dots.typescript.case-block)

(defn kind
  ^js [case-block]
  (.-kind ^js case-block))

(defn parent
  ^js [case-block]
  (.-parent ^js case-block))

(defn clauses
  ^js [case-block]
  (.-clauses ^js case-block))

(defn flags
  ^js [case-block]
  (.-flags ^js case-block))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [case-block]
  (.getSourceFile ^js case-block))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [case-block]
   (.getChildCount ^js case-block))
  (^js [case-block source-file]
   (.getChildCount ^js case-block source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [case-block index]
   (.getChildAt ^js case-block index))
  (^js [case-block index source-file]
   (.getChildAt ^js case-block index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [case-block]
   (.getChildren ^js case-block))
  (^js [case-block source-file]
   (.getChildren ^js case-block source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [case-block]
   (.getStart ^js case-block))
  (^js [case-block source-file]
   (.getStart ^js case-block source-file))
  (^js [case-block source-file include-js-doc-comment?]
   (.getStart ^js case-block source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [case-block]
  (.getFullStart ^js case-block))

(defn get-end
  "**Returns:** `number`"
  ^js [case-block]
  (.getEnd ^js case-block))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [case-block]
   (.getWidth ^js case-block))
  (^js [case-block source-file]
   (.getWidth ^js case-block source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [case-block]
  (.getFullWidth ^js case-block))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [case-block]
   (.getLeadingTriviaWidth ^js case-block))
  (^js [case-block source-file]
   (.getLeadingTriviaWidth ^js case-block source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [case-block]
   (.getFullText ^js case-block))
  (^js [case-block source-file]
   (.getFullText ^js case-block source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [case-block]
   (.getText ^js case-block))
  (^js [case-block source-file]
   (.getText ^js case-block source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [case-block]
   (.getFirstToken ^js case-block))
  (^js [case-block source-file]
   (.getFirstToken ^js case-block source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [case-block]
   (.getLastToken ^js case-block))
  (^js [case-block source-file]
   (.getLastToken ^js case-block source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [case-block cb-node]
   (.forEachChild ^js case-block cb-node))
  (^js [case-block cb-node cb-node-array]
   (.forEachChild ^js case-block cb-node cb-node-array)))

(defn pos
  ^js [case-block]
  (.-pos ^js case-block))

(defn end
  ^js [case-block]
  (.-end ^js case-block))
