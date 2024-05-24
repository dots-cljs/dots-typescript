(ns dots.typescript.js-doc-return-tag
  (:refer-clojure :exclude [comment]))

(defn kind
  ^js [js-doc-return-tag]
  (.-kind ^js js-doc-return-tag))

(defn type-expression
  ^js [js-doc-return-tag]
  (.-typeExpression ^js js-doc-return-tag))

(defn parent
  ^js [js-doc-return-tag]
  (.-parent ^js js-doc-return-tag))

(defn tag-name
  ^js [js-doc-return-tag]
  (.-tagName ^js js-doc-return-tag))

(defn comment
  ^js [js-doc-return-tag]
  (.-comment ^js js-doc-return-tag))

(defn flags
  ^js [js-doc-return-tag]
  (.-flags ^js js-doc-return-tag))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [js-doc-return-tag]
  (.getSourceFile ^js js-doc-return-tag))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [js-doc-return-tag]
   (.getChildCount ^js js-doc-return-tag))
  (^js [js-doc-return-tag source-file]
   (.getChildCount ^js js-doc-return-tag source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [js-doc-return-tag index]
   (.getChildAt ^js js-doc-return-tag index))
  (^js [js-doc-return-tag index source-file]
   (.getChildAt ^js js-doc-return-tag index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [js-doc-return-tag]
   (.getChildren ^js js-doc-return-tag))
  (^js [js-doc-return-tag source-file]
   (.getChildren ^js js-doc-return-tag source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [js-doc-return-tag]
   (.getStart ^js js-doc-return-tag))
  (^js [js-doc-return-tag source-file]
   (.getStart ^js js-doc-return-tag source-file))
  (^js [js-doc-return-tag source-file include-js-doc-comment?]
   (.getStart ^js js-doc-return-tag source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [js-doc-return-tag]
  (.getFullStart ^js js-doc-return-tag))

(defn get-end
  "**Returns:** `number`"
  ^js [js-doc-return-tag]
  (.getEnd ^js js-doc-return-tag))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [js-doc-return-tag]
   (.getWidth ^js js-doc-return-tag))
  (^js [js-doc-return-tag source-file]
   (.getWidth ^js js-doc-return-tag source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [js-doc-return-tag]
  (.getFullWidth ^js js-doc-return-tag))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [js-doc-return-tag]
   (.getLeadingTriviaWidth ^js js-doc-return-tag))
  (^js [js-doc-return-tag source-file]
   (.getLeadingTriviaWidth ^js js-doc-return-tag source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [js-doc-return-tag]
   (.getFullText ^js js-doc-return-tag))
  (^js [js-doc-return-tag source-file]
   (.getFullText ^js js-doc-return-tag source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [js-doc-return-tag]
   (.getText ^js js-doc-return-tag))
  (^js [js-doc-return-tag source-file]
   (.getText ^js js-doc-return-tag source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [js-doc-return-tag]
   (.getFirstToken ^js js-doc-return-tag))
  (^js [js-doc-return-tag source-file]
   (.getFirstToken ^js js-doc-return-tag source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [js-doc-return-tag]
   (.getLastToken ^js js-doc-return-tag))
  (^js [js-doc-return-tag source-file]
   (.getLastToken ^js js-doc-return-tag source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [js-doc-return-tag cb-node]
   (.forEachChild ^js js-doc-return-tag cb-node))
  (^js [js-doc-return-tag cb-node cb-node-array]
   (.forEachChild ^js js-doc-return-tag cb-node cb-node-array)))

(defn pos
  ^js [js-doc-return-tag]
  (.-pos ^js js-doc-return-tag))

(defn end
  ^js [js-doc-return-tag]
  (.-end ^js js-doc-return-tag))
