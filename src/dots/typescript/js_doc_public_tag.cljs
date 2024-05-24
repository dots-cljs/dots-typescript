(ns dots.typescript.js-doc-public-tag
  (:refer-clojure :exclude [comment]))

(defn kind
  ^js [js-doc-public-tag]
  (.-kind ^js js-doc-public-tag))

(defn parent
  ^js [js-doc-public-tag]
  (.-parent ^js js-doc-public-tag))

(defn tag-name
  ^js [js-doc-public-tag]
  (.-tagName ^js js-doc-public-tag))

(defn comment
  ^js [js-doc-public-tag]
  (.-comment ^js js-doc-public-tag))

(defn flags
  ^js [js-doc-public-tag]
  (.-flags ^js js-doc-public-tag))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [js-doc-public-tag]
  (.getSourceFile ^js js-doc-public-tag))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [js-doc-public-tag]
   (.getChildCount ^js js-doc-public-tag))
  (^js [js-doc-public-tag source-file]
   (.getChildCount ^js js-doc-public-tag source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [js-doc-public-tag index]
   (.getChildAt ^js js-doc-public-tag index))
  (^js [js-doc-public-tag index source-file]
   (.getChildAt ^js js-doc-public-tag index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [js-doc-public-tag]
   (.getChildren ^js js-doc-public-tag))
  (^js [js-doc-public-tag source-file]
   (.getChildren ^js js-doc-public-tag source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [js-doc-public-tag]
   (.getStart ^js js-doc-public-tag))
  (^js [js-doc-public-tag source-file]
   (.getStart ^js js-doc-public-tag source-file))
  (^js [js-doc-public-tag source-file include-js-doc-comment?]
   (.getStart ^js js-doc-public-tag source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [js-doc-public-tag]
  (.getFullStart ^js js-doc-public-tag))

(defn get-end
  "**Returns:** `number`"
  ^js [js-doc-public-tag]
  (.getEnd ^js js-doc-public-tag))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [js-doc-public-tag]
   (.getWidth ^js js-doc-public-tag))
  (^js [js-doc-public-tag source-file]
   (.getWidth ^js js-doc-public-tag source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [js-doc-public-tag]
  (.getFullWidth ^js js-doc-public-tag))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [js-doc-public-tag]
   (.getLeadingTriviaWidth ^js js-doc-public-tag))
  (^js [js-doc-public-tag source-file]
   (.getLeadingTriviaWidth ^js js-doc-public-tag source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [js-doc-public-tag]
   (.getFullText ^js js-doc-public-tag))
  (^js [js-doc-public-tag source-file]
   (.getFullText ^js js-doc-public-tag source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [js-doc-public-tag]
   (.getText ^js js-doc-public-tag))
  (^js [js-doc-public-tag source-file]
   (.getText ^js js-doc-public-tag source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [js-doc-public-tag]
   (.getFirstToken ^js js-doc-public-tag))
  (^js [js-doc-public-tag source-file]
   (.getFirstToken ^js js-doc-public-tag source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [js-doc-public-tag]
   (.getLastToken ^js js-doc-public-tag))
  (^js [js-doc-public-tag source-file]
   (.getLastToken ^js js-doc-public-tag source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [js-doc-public-tag cb-node]
   (.forEachChild ^js js-doc-public-tag cb-node))
  (^js [js-doc-public-tag cb-node cb-node-array]
   (.forEachChild ^js js-doc-public-tag cb-node cb-node-array)))

(defn pos
  ^js [js-doc-public-tag]
  (.-pos ^js js-doc-public-tag))

(defn end
  ^js [js-doc-public-tag]
  (.-end ^js js-doc-public-tag))
