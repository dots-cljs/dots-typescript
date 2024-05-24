(ns dots.typescript.js-doc-type-expression
  (:refer-clojure :exclude [type]))

(defn kind
  ^js [js-doc-type-expression]
  (.-kind ^js js-doc-type-expression))

(defn type
  ^js [js-doc-type-expression]
  (.-type ^js js-doc-type-expression))

(defn flags
  ^js [js-doc-type-expression]
  (.-flags ^js js-doc-type-expression))

(defn parent
  ^js [js-doc-type-expression]
  (.-parent ^js js-doc-type-expression))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [js-doc-type-expression]
  (.getSourceFile ^js js-doc-type-expression))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [js-doc-type-expression]
   (.getChildCount ^js js-doc-type-expression))
  (^js [js-doc-type-expression source-file]
   (.getChildCount ^js js-doc-type-expression source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [js-doc-type-expression index]
   (.getChildAt ^js js-doc-type-expression index))
  (^js [js-doc-type-expression index source-file]
   (.getChildAt ^js js-doc-type-expression index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [js-doc-type-expression]
   (.getChildren ^js js-doc-type-expression))
  (^js [js-doc-type-expression source-file]
   (.getChildren ^js js-doc-type-expression source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [js-doc-type-expression]
   (.getStart ^js js-doc-type-expression))
  (^js [js-doc-type-expression source-file]
   (.getStart ^js js-doc-type-expression source-file))
  (^js [js-doc-type-expression source-file include-js-doc-comment?]
   (.getStart ^js js-doc-type-expression source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [js-doc-type-expression]
  (.getFullStart ^js js-doc-type-expression))

(defn get-end
  "**Returns:** `number`"
  ^js [js-doc-type-expression]
  (.getEnd ^js js-doc-type-expression))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [js-doc-type-expression]
   (.getWidth ^js js-doc-type-expression))
  (^js [js-doc-type-expression source-file]
   (.getWidth ^js js-doc-type-expression source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [js-doc-type-expression]
  (.getFullWidth ^js js-doc-type-expression))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [js-doc-type-expression]
   (.getLeadingTriviaWidth ^js js-doc-type-expression))
  (^js [js-doc-type-expression source-file]
   (.getLeadingTriviaWidth ^js js-doc-type-expression source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [js-doc-type-expression]
   (.getFullText ^js js-doc-type-expression))
  (^js [js-doc-type-expression source-file]
   (.getFullText ^js js-doc-type-expression source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [js-doc-type-expression]
   (.getText ^js js-doc-type-expression))
  (^js [js-doc-type-expression source-file]
   (.getText ^js js-doc-type-expression source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [js-doc-type-expression]
   (.getFirstToken ^js js-doc-type-expression))
  (^js [js-doc-type-expression source-file]
   (.getFirstToken ^js js-doc-type-expression source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [js-doc-type-expression]
   (.getLastToken ^js js-doc-type-expression))
  (^js [js-doc-type-expression source-file]
   (.getLastToken ^js js-doc-type-expression source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [js-doc-type-expression cb-node]
   (.forEachChild ^js js-doc-type-expression cb-node))
  (^js [js-doc-type-expression cb-node cb-node-array]
   (.forEachChild ^js js-doc-type-expression cb-node cb-node-array)))

(defn pos
  ^js [js-doc-type-expression]
  (.-pos ^js js-doc-type-expression))

(defn end
  ^js [js-doc-type-expression]
  (.-end ^js js-doc-type-expression))
