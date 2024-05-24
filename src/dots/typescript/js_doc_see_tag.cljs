(ns dots.typescript.js-doc-see-tag
  (:refer-clojure :exclude [comment name]))

(defn kind
  ^js [js-doc-see-tag]
  (.-kind ^js js-doc-see-tag))

(defn name
  ^js [js-doc-see-tag]
  (.-name ^js js-doc-see-tag))

(defn parent
  ^js [js-doc-see-tag]
  (.-parent ^js js-doc-see-tag))

(defn tag-name
  ^js [js-doc-see-tag]
  (.-tagName ^js js-doc-see-tag))

(defn comment
  ^js [js-doc-see-tag]
  (.-comment ^js js-doc-see-tag))

(defn flags
  ^js [js-doc-see-tag]
  (.-flags ^js js-doc-see-tag))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [js-doc-see-tag]
  (.getSourceFile ^js js-doc-see-tag))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [js-doc-see-tag]
   (.getChildCount ^js js-doc-see-tag))
  (^js [js-doc-see-tag source-file]
   (.getChildCount ^js js-doc-see-tag source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [js-doc-see-tag index]
   (.getChildAt ^js js-doc-see-tag index))
  (^js [js-doc-see-tag index source-file]
   (.getChildAt ^js js-doc-see-tag index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [js-doc-see-tag]
   (.getChildren ^js js-doc-see-tag))
  (^js [js-doc-see-tag source-file]
   (.getChildren ^js js-doc-see-tag source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [js-doc-see-tag]
   (.getStart ^js js-doc-see-tag))
  (^js [js-doc-see-tag source-file]
   (.getStart ^js js-doc-see-tag source-file))
  (^js [js-doc-see-tag source-file include-js-doc-comment?]
   (.getStart ^js js-doc-see-tag source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [js-doc-see-tag]
  (.getFullStart ^js js-doc-see-tag))

(defn get-end
  "**Returns:** `number`"
  ^js [js-doc-see-tag]
  (.getEnd ^js js-doc-see-tag))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [js-doc-see-tag]
   (.getWidth ^js js-doc-see-tag))
  (^js [js-doc-see-tag source-file]
   (.getWidth ^js js-doc-see-tag source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [js-doc-see-tag]
  (.getFullWidth ^js js-doc-see-tag))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [js-doc-see-tag]
   (.getLeadingTriviaWidth ^js js-doc-see-tag))
  (^js [js-doc-see-tag source-file]
   (.getLeadingTriviaWidth ^js js-doc-see-tag source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [js-doc-see-tag]
   (.getFullText ^js js-doc-see-tag))
  (^js [js-doc-see-tag source-file]
   (.getFullText ^js js-doc-see-tag source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [js-doc-see-tag]
   (.getText ^js js-doc-see-tag))
  (^js [js-doc-see-tag source-file]
   (.getText ^js js-doc-see-tag source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [js-doc-see-tag]
   (.getFirstToken ^js js-doc-see-tag))
  (^js [js-doc-see-tag source-file]
   (.getFirstToken ^js js-doc-see-tag source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [js-doc-see-tag]
   (.getLastToken ^js js-doc-see-tag))
  (^js [js-doc-see-tag source-file]
   (.getLastToken ^js js-doc-see-tag source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [js-doc-see-tag cb-node]
   (.forEachChild ^js js-doc-see-tag cb-node))
  (^js [js-doc-see-tag cb-node cb-node-array]
   (.forEachChild ^js js-doc-see-tag cb-node cb-node-array)))

(defn pos
  ^js [js-doc-see-tag]
  (.-pos ^js js-doc-see-tag))

(defn end
  ^js [js-doc-see-tag]
  (.-end ^js js-doc-see-tag))
