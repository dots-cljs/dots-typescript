(ns dots.typescript.js-doc-enum-tag
  (:refer-clojure :exclude [comment]))

(defn kind
  ^js [js-doc-enum-tag]
  (.-kind ^js js-doc-enum-tag))

(defn parent
  ^js [js-doc-enum-tag]
  (.-parent ^js js-doc-enum-tag))

(defn type-expression
  ^js [js-doc-enum-tag]
  (.-typeExpression ^js js-doc-enum-tag))

(defn tag-name
  ^js [js-doc-enum-tag]
  (.-tagName ^js js-doc-enum-tag))

(defn comment
  ^js [js-doc-enum-tag]
  (.-comment ^js js-doc-enum-tag))

(defn flags
  ^js [js-doc-enum-tag]
  (.-flags ^js js-doc-enum-tag))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [js-doc-enum-tag]
  (.getSourceFile ^js js-doc-enum-tag))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [js-doc-enum-tag]
   (.getChildCount ^js js-doc-enum-tag))
  (^js [js-doc-enum-tag source-file]
   (.getChildCount ^js js-doc-enum-tag source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [js-doc-enum-tag index]
   (.getChildAt ^js js-doc-enum-tag index))
  (^js [js-doc-enum-tag index source-file]
   (.getChildAt ^js js-doc-enum-tag index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [js-doc-enum-tag]
   (.getChildren ^js js-doc-enum-tag))
  (^js [js-doc-enum-tag source-file]
   (.getChildren ^js js-doc-enum-tag source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [js-doc-enum-tag]
   (.getStart ^js js-doc-enum-tag))
  (^js [js-doc-enum-tag source-file]
   (.getStart ^js js-doc-enum-tag source-file))
  (^js [js-doc-enum-tag source-file include-js-doc-comment?]
   (.getStart ^js js-doc-enum-tag source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [js-doc-enum-tag]
  (.getFullStart ^js js-doc-enum-tag))

(defn get-end
  "**Returns:** `number`"
  ^js [js-doc-enum-tag]
  (.getEnd ^js js-doc-enum-tag))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [js-doc-enum-tag]
   (.getWidth ^js js-doc-enum-tag))
  (^js [js-doc-enum-tag source-file]
   (.getWidth ^js js-doc-enum-tag source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [js-doc-enum-tag]
  (.getFullWidth ^js js-doc-enum-tag))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [js-doc-enum-tag]
   (.getLeadingTriviaWidth ^js js-doc-enum-tag))
  (^js [js-doc-enum-tag source-file]
   (.getLeadingTriviaWidth ^js js-doc-enum-tag source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [js-doc-enum-tag]
   (.getFullText ^js js-doc-enum-tag))
  (^js [js-doc-enum-tag source-file]
   (.getFullText ^js js-doc-enum-tag source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [js-doc-enum-tag]
   (.getText ^js js-doc-enum-tag))
  (^js [js-doc-enum-tag source-file]
   (.getText ^js js-doc-enum-tag source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [js-doc-enum-tag]
   (.getFirstToken ^js js-doc-enum-tag))
  (^js [js-doc-enum-tag source-file]
   (.getFirstToken ^js js-doc-enum-tag source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [js-doc-enum-tag]
   (.getLastToken ^js js-doc-enum-tag))
  (^js [js-doc-enum-tag source-file]
   (.getLastToken ^js js-doc-enum-tag source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [js-doc-enum-tag cb-node]
   (.forEachChild ^js js-doc-enum-tag cb-node))
  (^js [js-doc-enum-tag cb-node cb-node-array]
   (.forEachChild ^js js-doc-enum-tag cb-node cb-node-array)))

(defn pos
  ^js [js-doc-enum-tag]
  (.-pos ^js js-doc-enum-tag))

(defn end
  ^js [js-doc-enum-tag]
  (.-end ^js js-doc-enum-tag))
