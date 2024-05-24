(ns dots.typescript.js-doc-link
  (:refer-clojure :exclude [name]))

(defn kind
  ^js [js-doc-link]
  (.-kind ^js js-doc-link))

(defn name
  ^js [js-doc-link]
  (.-name ^js js-doc-link))

(defn text
  ^js [js-doc-link]
  (.-text ^js js-doc-link))

(defn set-text!
  ^js [js-doc-link value]
  (set! (.-text ^js js-doc-link) value))

(defn flags
  ^js [js-doc-link]
  (.-flags ^js js-doc-link))

(defn parent
  ^js [js-doc-link]
  (.-parent ^js js-doc-link))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [js-doc-link]
  (.getSourceFile ^js js-doc-link))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [js-doc-link]
   (.getChildCount ^js js-doc-link))
  (^js [js-doc-link source-file]
   (.getChildCount ^js js-doc-link source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [js-doc-link index]
   (.getChildAt ^js js-doc-link index))
  (^js [js-doc-link index source-file]
   (.getChildAt ^js js-doc-link index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [js-doc-link]
   (.getChildren ^js js-doc-link))
  (^js [js-doc-link source-file]
   (.getChildren ^js js-doc-link source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [js-doc-link]
   (.getStart ^js js-doc-link))
  (^js [js-doc-link source-file]
   (.getStart ^js js-doc-link source-file))
  (^js [js-doc-link source-file include-js-doc-comment?]
   (.getStart ^js js-doc-link source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [js-doc-link]
  (.getFullStart ^js js-doc-link))

(defn get-end
  "**Returns:** `number`"
  ^js [js-doc-link]
  (.getEnd ^js js-doc-link))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [js-doc-link]
   (.getWidth ^js js-doc-link))
  (^js [js-doc-link source-file]
   (.getWidth ^js js-doc-link source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [js-doc-link]
  (.getFullWidth ^js js-doc-link))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [js-doc-link]
   (.getLeadingTriviaWidth ^js js-doc-link))
  (^js [js-doc-link source-file]
   (.getLeadingTriviaWidth ^js js-doc-link source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [js-doc-link]
   (.getFullText ^js js-doc-link))
  (^js [js-doc-link source-file]
   (.getFullText ^js js-doc-link source-file)))

(defn get-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [js-doc-link]
   (.getText ^js js-doc-link))
  (^js [js-doc-link source-file]
   (.getText ^js js-doc-link source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [js-doc-link]
   (.getFirstToken ^js js-doc-link))
  (^js [js-doc-link source-file]
   (.getFirstToken ^js js-doc-link source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [js-doc-link]
   (.getLastToken ^js js-doc-link))
  (^js [js-doc-link source-file]
   (.getLastToken ^js js-doc-link source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [js-doc-link cb-node]
   (.forEachChild ^js js-doc-link cb-node))
  (^js [js-doc-link cb-node cb-node-array]
   (.forEachChild ^js js-doc-link cb-node cb-node-array)))

(defn pos
  ^js [js-doc-link]
  (.-pos ^js js-doc-link))

(defn end
  ^js [js-doc-link]
  (.-end ^js js-doc-link))
