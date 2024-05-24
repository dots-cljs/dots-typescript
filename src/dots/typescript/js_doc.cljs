(ns dots.typescript.js-doc
  (:refer-clojure :exclude [comment]))

(defn kind
  ^js [js-doc]
  (.-kind ^js js-doc))

(defn parent
  ^js [js-doc]
  (.-parent ^js js-doc))

(defn tags
  ^js [js-doc]
  (.-tags ^js js-doc))

(defn comment
  ^js [js-doc]
  (.-comment ^js js-doc))

(defn flags
  ^js [js-doc]
  (.-flags ^js js-doc))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [js-doc]
  (.getSourceFile ^js js-doc))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [js-doc]
   (.getChildCount ^js js-doc))
  (^js [js-doc source-file]
   (.getChildCount ^js js-doc source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [js-doc index]
   (.getChildAt ^js js-doc index))
  (^js [js-doc index source-file]
   (.getChildAt ^js js-doc index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [js-doc]
   (.getChildren ^js js-doc))
  (^js [js-doc source-file]
   (.getChildren ^js js-doc source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [js-doc]
   (.getStart ^js js-doc))
  (^js [js-doc source-file]
   (.getStart ^js js-doc source-file))
  (^js [js-doc source-file include-js-doc-comment?]
   (.getStart ^js js-doc source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [js-doc]
  (.getFullStart ^js js-doc))

(defn get-end
  "**Returns:** `number`"
  ^js [js-doc]
  (.getEnd ^js js-doc))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [js-doc]
   (.getWidth ^js js-doc))
  (^js [js-doc source-file]
   (.getWidth ^js js-doc source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [js-doc]
  (.getFullWidth ^js js-doc))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [js-doc]
   (.getLeadingTriviaWidth ^js js-doc))
  (^js [js-doc source-file]
   (.getLeadingTriviaWidth ^js js-doc source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [js-doc]
   (.getFullText ^js js-doc))
  (^js [js-doc source-file]
   (.getFullText ^js js-doc source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [js-doc]
   (.getText ^js js-doc))
  (^js [js-doc source-file]
   (.getText ^js js-doc source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [js-doc]
   (.getFirstToken ^js js-doc))
  (^js [js-doc source-file]
   (.getFirstToken ^js js-doc source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [js-doc]
   (.getLastToken ^js js-doc))
  (^js [js-doc source-file]
   (.getLastToken ^js js-doc source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [js-doc cb-node]
   (.forEachChild ^js js-doc cb-node))
  (^js [js-doc cb-node cb-node-array]
   (.forEachChild ^js js-doc cb-node cb-node-array)))

(defn pos
  ^js [js-doc]
  (.-pos ^js js-doc))

(defn end
  ^js [js-doc]
  (.-end ^js js-doc))
