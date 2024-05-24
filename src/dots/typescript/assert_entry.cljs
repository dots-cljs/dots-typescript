(ns dots.typescript.assert-entry
  (:refer-clojure :exclude [name]))

(defn kind
  ^js [assert-entry]
  (.-kind ^js assert-entry))

(defn parent
  ^js [assert-entry]
  (.-parent ^js assert-entry))

(defn name
  ^js [assert-entry]
  (.-name ^js assert-entry))

(defn value
  ^js [assert-entry]
  (.-value ^js assert-entry))

(defn flags
  ^js [assert-entry]
  (.-flags ^js assert-entry))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [assert-entry]
  (.getSourceFile ^js assert-entry))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [assert-entry]
   (.getChildCount ^js assert-entry))
  (^js [assert-entry source-file]
   (.getChildCount ^js assert-entry source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [assert-entry index]
   (.getChildAt ^js assert-entry index))
  (^js [assert-entry index source-file]
   (.getChildAt ^js assert-entry index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [assert-entry]
   (.getChildren ^js assert-entry))
  (^js [assert-entry source-file]
   (.getChildren ^js assert-entry source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [assert-entry]
   (.getStart ^js assert-entry))
  (^js [assert-entry source-file]
   (.getStart ^js assert-entry source-file))
  (^js [assert-entry source-file include-js-doc-comment?]
   (.getStart ^js assert-entry source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [assert-entry]
  (.getFullStart ^js assert-entry))

(defn get-end
  "**Returns:** `number`"
  ^js [assert-entry]
  (.getEnd ^js assert-entry))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [assert-entry]
   (.getWidth ^js assert-entry))
  (^js [assert-entry source-file]
   (.getWidth ^js assert-entry source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [assert-entry]
  (.getFullWidth ^js assert-entry))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [assert-entry]
   (.getLeadingTriviaWidth ^js assert-entry))
  (^js [assert-entry source-file]
   (.getLeadingTriviaWidth ^js assert-entry source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [assert-entry]
   (.getFullText ^js assert-entry))
  (^js [assert-entry source-file]
   (.getFullText ^js assert-entry source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [assert-entry]
   (.getText ^js assert-entry))
  (^js [assert-entry source-file]
   (.getText ^js assert-entry source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [assert-entry]
   (.getFirstToken ^js assert-entry))
  (^js [assert-entry source-file]
   (.getFirstToken ^js assert-entry source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [assert-entry]
   (.getLastToken ^js assert-entry))
  (^js [assert-entry source-file]
   (.getLastToken ^js assert-entry source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [assert-entry cb-node]
   (.forEachChild ^js assert-entry cb-node))
  (^js [assert-entry cb-node cb-node-array]
   (.forEachChild ^js assert-entry cb-node cb-node-array)))

(defn pos
  ^js [assert-entry]
  (.-pos ^js assert-entry))

(defn end
  ^js [assert-entry]
  (.-end ^js assert-entry))
