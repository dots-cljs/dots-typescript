(ns dots.typescript.js-doc-tag
  (:refer-clojure :exclude [comment]))

(defn parent
  "**Returns:** `JSDoc | JSDocTypeLiteral`"
  ^js [js-doc-tag]
  (.-parent ^js js-doc-tag))

(defn tag-name
  "**Returns:** `Identifier`"
  ^js [js-doc-tag]
  (.-tagName ^js js-doc-tag))

(defn comment
  "**Returns:** `string | NodeArray<JSDocComment> | undefined`"
  ^js [js-doc-tag]
  (.-comment ^js js-doc-tag))

(defn kind
  "**Returns:** `SyntaxKind`"
  ^js [js-doc-tag]
  (.-kind ^js js-doc-tag))

(defn flags
  "**Returns:** `NodeFlags`"
  ^js [js-doc-tag]
  (.-flags ^js js-doc-tag))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [js-doc-tag]
  (.getSourceFile ^js js-doc-tag))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [js-doc-tag]
   (.getChildCount ^js js-doc-tag))
  (^js [js-doc-tag source-file]
   (.getChildCount ^js js-doc-tag source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [js-doc-tag index]
   (.getChildAt ^js js-doc-tag index))
  (^js [js-doc-tag index source-file]
   (.getChildAt ^js js-doc-tag index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [js-doc-tag]
   (.getChildren ^js js-doc-tag))
  (^js [js-doc-tag source-file]
   (.getChildren ^js js-doc-tag source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [js-doc-tag]
   (.getStart ^js js-doc-tag))
  (^js [js-doc-tag source-file]
   (.getStart ^js js-doc-tag source-file))
  (^js [js-doc-tag source-file include-js-doc-comment?]
   (.getStart ^js js-doc-tag source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [js-doc-tag]
  (.getFullStart ^js js-doc-tag))

(defn get-end
  "**Returns:** `number`"
  ^js [js-doc-tag]
  (.getEnd ^js js-doc-tag))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [js-doc-tag]
   (.getWidth ^js js-doc-tag))
  (^js [js-doc-tag source-file]
   (.getWidth ^js js-doc-tag source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [js-doc-tag]
  (.getFullWidth ^js js-doc-tag))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [js-doc-tag]
   (.getLeadingTriviaWidth ^js js-doc-tag))
  (^js [js-doc-tag source-file]
   (.getLeadingTriviaWidth ^js js-doc-tag source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [js-doc-tag]
   (.getFullText ^js js-doc-tag))
  (^js [js-doc-tag source-file]
   (.getFullText ^js js-doc-tag source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [js-doc-tag]
   (.getText ^js js-doc-tag))
  (^js [js-doc-tag source-file]
   (.getText ^js js-doc-tag source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [js-doc-tag]
   (.getFirstToken ^js js-doc-tag))
  (^js [js-doc-tag source-file]
   (.getFirstToken ^js js-doc-tag source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [js-doc-tag]
   (.getLastToken ^js js-doc-tag))
  (^js [js-doc-tag source-file]
   (.getLastToken ^js js-doc-tag source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [js-doc-tag cb-node]
   (.forEachChild ^js js-doc-tag cb-node))
  (^js [js-doc-tag cb-node cb-node-array]
   (.forEachChild ^js js-doc-tag cb-node cb-node-array)))

(defn pos
  "**Returns:** `number`"
  ^js [js-doc-tag]
  (.-pos ^js js-doc-tag))

(defn end
  "**Returns:** `number`"
  ^js [js-doc-tag]
  (.-end ^js js-doc-tag))
