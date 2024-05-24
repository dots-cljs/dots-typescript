(ns dots.typescript.spread-assignment
  (:refer-clojure :exclude [name]))

(defn kind
  ^js [spread-assignment]
  (.-kind ^js spread-assignment))

(defn parent
  ^js [spread-assignment]
  (.-parent ^js spread-assignment))

(defn expression
  ^js [spread-assignment]
  (.-expression ^js spread-assignment))

(defn name
  ^js [spread-assignment]
  (.-name ^js spread-assignment))

(defn flags
  ^js [spread-assignment]
  (.-flags ^js spread-assignment))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [spread-assignment]
  (.getSourceFile ^js spread-assignment))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [spread-assignment]
   (.getChildCount ^js spread-assignment))
  (^js [spread-assignment source-file]
   (.getChildCount ^js spread-assignment source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [spread-assignment index]
   (.getChildAt ^js spread-assignment index))
  (^js [spread-assignment index source-file]
   (.getChildAt ^js spread-assignment index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [spread-assignment]
   (.getChildren ^js spread-assignment))
  (^js [spread-assignment source-file]
   (.getChildren ^js spread-assignment source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [spread-assignment]
   (.getStart ^js spread-assignment))
  (^js [spread-assignment source-file]
   (.getStart ^js spread-assignment source-file))
  (^js [spread-assignment source-file include-js-doc-comment?]
   (.getStart ^js spread-assignment source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [spread-assignment]
  (.getFullStart ^js spread-assignment))

(defn get-end
  "**Returns:** `number`"
  ^js [spread-assignment]
  (.getEnd ^js spread-assignment))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [spread-assignment]
   (.getWidth ^js spread-assignment))
  (^js [spread-assignment source-file]
   (.getWidth ^js spread-assignment source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [spread-assignment]
  (.getFullWidth ^js spread-assignment))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [spread-assignment]
   (.getLeadingTriviaWidth ^js spread-assignment))
  (^js [spread-assignment source-file]
   (.getLeadingTriviaWidth ^js spread-assignment source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [spread-assignment]
   (.getFullText ^js spread-assignment))
  (^js [spread-assignment source-file]
   (.getFullText ^js spread-assignment source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [spread-assignment]
   (.getText ^js spread-assignment))
  (^js [spread-assignment source-file]
   (.getText ^js spread-assignment source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [spread-assignment]
   (.getFirstToken ^js spread-assignment))
  (^js [spread-assignment source-file]
   (.getFirstToken ^js spread-assignment source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [spread-assignment]
   (.getLastToken ^js spread-assignment))
  (^js [spread-assignment source-file]
   (.getLastToken ^js spread-assignment source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [spread-assignment cb-node]
   (.forEachChild ^js spread-assignment cb-node))
  (^js [spread-assignment cb-node cb-node-array]
   (.forEachChild ^js spread-assignment cb-node cb-node-array)))

(defn pos
  ^js [spread-assignment]
  (.-pos ^js spread-assignment))

(defn end
  ^js [spread-assignment]
  (.-end ^js spread-assignment))
