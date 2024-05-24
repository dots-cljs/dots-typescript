(ns dots.typescript.js-doc-throws-tag
  (:refer-clojure :exclude [comment]))

(defn kind
  ^js [js-doc-throws-tag]
  (.-kind ^js js-doc-throws-tag))

(defn type-expression
  ^js [js-doc-throws-tag]
  (.-typeExpression ^js js-doc-throws-tag))

(defn parent
  ^js [js-doc-throws-tag]
  (.-parent ^js js-doc-throws-tag))

(defn tag-name
  ^js [js-doc-throws-tag]
  (.-tagName ^js js-doc-throws-tag))

(defn comment
  ^js [js-doc-throws-tag]
  (.-comment ^js js-doc-throws-tag))

(defn flags
  ^js [js-doc-throws-tag]
  (.-flags ^js js-doc-throws-tag))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [js-doc-throws-tag]
  (.getSourceFile ^js js-doc-throws-tag))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [js-doc-throws-tag]
   (.getChildCount ^js js-doc-throws-tag))
  (^js [js-doc-throws-tag source-file]
   (.getChildCount ^js js-doc-throws-tag source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [js-doc-throws-tag index]
   (.getChildAt ^js js-doc-throws-tag index))
  (^js [js-doc-throws-tag index source-file]
   (.getChildAt ^js js-doc-throws-tag index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [js-doc-throws-tag]
   (.getChildren ^js js-doc-throws-tag))
  (^js [js-doc-throws-tag source-file]
   (.getChildren ^js js-doc-throws-tag source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [js-doc-throws-tag]
   (.getStart ^js js-doc-throws-tag))
  (^js [js-doc-throws-tag source-file]
   (.getStart ^js js-doc-throws-tag source-file))
  (^js [js-doc-throws-tag source-file include-js-doc-comment?]
   (.getStart ^js js-doc-throws-tag source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [js-doc-throws-tag]
  (.getFullStart ^js js-doc-throws-tag))

(defn get-end
  "**Returns:** `number`"
  ^js [js-doc-throws-tag]
  (.getEnd ^js js-doc-throws-tag))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [js-doc-throws-tag]
   (.getWidth ^js js-doc-throws-tag))
  (^js [js-doc-throws-tag source-file]
   (.getWidth ^js js-doc-throws-tag source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [js-doc-throws-tag]
  (.getFullWidth ^js js-doc-throws-tag))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [js-doc-throws-tag]
   (.getLeadingTriviaWidth ^js js-doc-throws-tag))
  (^js [js-doc-throws-tag source-file]
   (.getLeadingTriviaWidth ^js js-doc-throws-tag source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [js-doc-throws-tag]
   (.getFullText ^js js-doc-throws-tag))
  (^js [js-doc-throws-tag source-file]
   (.getFullText ^js js-doc-throws-tag source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [js-doc-throws-tag]
   (.getText ^js js-doc-throws-tag))
  (^js [js-doc-throws-tag source-file]
   (.getText ^js js-doc-throws-tag source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [js-doc-throws-tag]
   (.getFirstToken ^js js-doc-throws-tag))
  (^js [js-doc-throws-tag source-file]
   (.getFirstToken ^js js-doc-throws-tag source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [js-doc-throws-tag]
   (.getLastToken ^js js-doc-throws-tag))
  (^js [js-doc-throws-tag source-file]
   (.getLastToken ^js js-doc-throws-tag source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [js-doc-throws-tag cb-node]
   (.forEachChild ^js js-doc-throws-tag cb-node))
  (^js [js-doc-throws-tag cb-node cb-node-array]
   (.forEachChild ^js js-doc-throws-tag cb-node cb-node-array)))

(defn pos
  ^js [js-doc-throws-tag]
  (.-pos ^js js-doc-throws-tag))

(defn end
  ^js [js-doc-throws-tag]
  (.-end ^js js-doc-throws-tag))
