(ns dots.typescript.js-doc-author-tag
  (:refer-clojure :exclude [comment]))

(defn kind
  "**Returns:** `SyntaxKind.JSDocAuthorTag`"
  ^js [js-doc-author-tag]
  (.-kind ^js js-doc-author-tag))

(defn parent
  "**Returns:** `JSDoc | JSDocTypeLiteral`"
  ^js [js-doc-author-tag]
  (.-parent ^js js-doc-author-tag))

(defn tag-name
  "**Returns:** `Identifier`"
  ^js [js-doc-author-tag]
  (.-tagName ^js js-doc-author-tag))

(defn comment
  "**Returns:** `string | NodeArray<JSDocComment> | undefined`"
  ^js [js-doc-author-tag]
  (.-comment ^js js-doc-author-tag))

(defn flags
  "**Returns:** `NodeFlags`"
  ^js [js-doc-author-tag]
  (.-flags ^js js-doc-author-tag))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [js-doc-author-tag]
  (.getSourceFile ^js js-doc-author-tag))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [js-doc-author-tag]
   (.getChildCount ^js js-doc-author-tag))
  (^js [js-doc-author-tag source-file]
   (.getChildCount ^js js-doc-author-tag source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [js-doc-author-tag index]
   (.getChildAt ^js js-doc-author-tag index))
  (^js [js-doc-author-tag index source-file]
   (.getChildAt ^js js-doc-author-tag index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [js-doc-author-tag]
   (.getChildren ^js js-doc-author-tag))
  (^js [js-doc-author-tag source-file]
   (.getChildren ^js js-doc-author-tag source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [js-doc-author-tag]
   (.getStart ^js js-doc-author-tag))
  (^js [js-doc-author-tag source-file]
   (.getStart ^js js-doc-author-tag source-file))
  (^js [js-doc-author-tag source-file include-js-doc-comment?]
   (.getStart ^js js-doc-author-tag source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [js-doc-author-tag]
  (.getFullStart ^js js-doc-author-tag))

(defn get-end
  "**Returns:** `number`"
  ^js [js-doc-author-tag]
  (.getEnd ^js js-doc-author-tag))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [js-doc-author-tag]
   (.getWidth ^js js-doc-author-tag))
  (^js [js-doc-author-tag source-file]
   (.getWidth ^js js-doc-author-tag source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [js-doc-author-tag]
  (.getFullWidth ^js js-doc-author-tag))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [js-doc-author-tag]
   (.getLeadingTriviaWidth ^js js-doc-author-tag))
  (^js [js-doc-author-tag source-file]
   (.getLeadingTriviaWidth ^js js-doc-author-tag source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [js-doc-author-tag]
   (.getFullText ^js js-doc-author-tag))
  (^js [js-doc-author-tag source-file]
   (.getFullText ^js js-doc-author-tag source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [js-doc-author-tag]
   (.getText ^js js-doc-author-tag))
  (^js [js-doc-author-tag source-file]
   (.getText ^js js-doc-author-tag source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [js-doc-author-tag]
   (.getFirstToken ^js js-doc-author-tag))
  (^js [js-doc-author-tag source-file]
   (.getFirstToken ^js js-doc-author-tag source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [js-doc-author-tag]
   (.getLastToken ^js js-doc-author-tag))
  (^js [js-doc-author-tag source-file]
   (.getLastToken ^js js-doc-author-tag source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [js-doc-author-tag cb-node]
   (.forEachChild ^js js-doc-author-tag cb-node))
  (^js [js-doc-author-tag cb-node cb-node-array]
   (.forEachChild ^js js-doc-author-tag cb-node cb-node-array)))

(defn pos
  "**Returns:** `number`"
  ^js [js-doc-author-tag]
  (.-pos ^js js-doc-author-tag))

(defn end
  "**Returns:** `number`"
  ^js [js-doc-author-tag]
  (.-end ^js js-doc-author-tag))
