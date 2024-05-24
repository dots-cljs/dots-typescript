(ns dots.typescript.js-doc-variadic-type
  (:refer-clojure :exclude [type]))

(defn kind
  ^js [js-doc-variadic-type]
  (.-kind ^js js-doc-variadic-type))

(defn type
  ^js [js-doc-variadic-type]
  (.-type ^js js-doc-variadic-type))

(defn flags
  ^js [js-doc-variadic-type]
  (.-flags ^js js-doc-variadic-type))

(defn parent
  ^js [js-doc-variadic-type]
  (.-parent ^js js-doc-variadic-type))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [js-doc-variadic-type]
  (.getSourceFile ^js js-doc-variadic-type))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [js-doc-variadic-type]
   (.getChildCount ^js js-doc-variadic-type))
  (^js [js-doc-variadic-type source-file]
   (.getChildCount ^js js-doc-variadic-type source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [js-doc-variadic-type index]
   (.getChildAt ^js js-doc-variadic-type index))
  (^js [js-doc-variadic-type index source-file]
   (.getChildAt ^js js-doc-variadic-type index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [js-doc-variadic-type]
   (.getChildren ^js js-doc-variadic-type))
  (^js [js-doc-variadic-type source-file]
   (.getChildren ^js js-doc-variadic-type source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [js-doc-variadic-type]
   (.getStart ^js js-doc-variadic-type))
  (^js [js-doc-variadic-type source-file]
   (.getStart ^js js-doc-variadic-type source-file))
  (^js [js-doc-variadic-type source-file include-js-doc-comment?]
   (.getStart ^js js-doc-variadic-type source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [js-doc-variadic-type]
  (.getFullStart ^js js-doc-variadic-type))

(defn get-end
  "**Returns:** `number`"
  ^js [js-doc-variadic-type]
  (.getEnd ^js js-doc-variadic-type))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [js-doc-variadic-type]
   (.getWidth ^js js-doc-variadic-type))
  (^js [js-doc-variadic-type source-file]
   (.getWidth ^js js-doc-variadic-type source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [js-doc-variadic-type]
  (.getFullWidth ^js js-doc-variadic-type))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [js-doc-variadic-type]
   (.getLeadingTriviaWidth ^js js-doc-variadic-type))
  (^js [js-doc-variadic-type source-file]
   (.getLeadingTriviaWidth ^js js-doc-variadic-type source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [js-doc-variadic-type]
   (.getFullText ^js js-doc-variadic-type))
  (^js [js-doc-variadic-type source-file]
   (.getFullText ^js js-doc-variadic-type source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [js-doc-variadic-type]
   (.getText ^js js-doc-variadic-type))
  (^js [js-doc-variadic-type source-file]
   (.getText ^js js-doc-variadic-type source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [js-doc-variadic-type]
   (.getFirstToken ^js js-doc-variadic-type))
  (^js [js-doc-variadic-type source-file]
   (.getFirstToken ^js js-doc-variadic-type source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [js-doc-variadic-type]
   (.getLastToken ^js js-doc-variadic-type))
  (^js [js-doc-variadic-type source-file]
   (.getLastToken ^js js-doc-variadic-type source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [js-doc-variadic-type cb-node]
   (.forEachChild ^js js-doc-variadic-type cb-node))
  (^js [js-doc-variadic-type cb-node cb-node-array]
   (.forEachChild ^js js-doc-variadic-type cb-node cb-node-array)))

(defn pos
  ^js [js-doc-variadic-type]
  (.-pos ^js js-doc-variadic-type))

(defn end
  ^js [js-doc-variadic-type]
  (.-end ^js js-doc-variadic-type))
