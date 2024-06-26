(ns dots.typescript.js-doc-this-tag
  (:refer-clojure :exclude [comment]))

(defn kind
  "**Returns:** `SyntaxKind.JSDocThisTag`"
  ^js [js-doc-this-tag]
  (.-kind ^js js-doc-this-tag))

(defn type-expression
  "**Returns:** `JSDocTypeExpression`"
  ^js [js-doc-this-tag]
  (.-typeExpression ^js js-doc-this-tag))

(defn parent
  "**Returns:** `JSDoc | JSDocTypeLiteral`"
  ^js [js-doc-this-tag]
  (.-parent ^js js-doc-this-tag))

(defn tag-name
  "**Returns:** `Identifier`"
  ^js [js-doc-this-tag]
  (.-tagName ^js js-doc-this-tag))

(defn comment
  "**Returns:** `string | NodeArray<JSDocComment> | undefined`"
  ^js [js-doc-this-tag]
  (.-comment ^js js-doc-this-tag))

(defn flags
  "**Returns:** `NodeFlags`"
  ^js [js-doc-this-tag]
  (.-flags ^js js-doc-this-tag))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [js-doc-this-tag]
  (.getSourceFile ^js js-doc-this-tag))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [js-doc-this-tag]
   (.getChildCount ^js js-doc-this-tag))
  (^js [js-doc-this-tag source-file]
   (.getChildCount ^js js-doc-this-tag source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [js-doc-this-tag index]
   (.getChildAt ^js js-doc-this-tag index))
  (^js [js-doc-this-tag index source-file]
   (.getChildAt ^js js-doc-this-tag index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [js-doc-this-tag]
   (.getChildren ^js js-doc-this-tag))
  (^js [js-doc-this-tag source-file]
   (.getChildren ^js js-doc-this-tag source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [js-doc-this-tag]
   (.getStart ^js js-doc-this-tag))
  (^js [js-doc-this-tag source-file]
   (.getStart ^js js-doc-this-tag source-file))
  (^js [js-doc-this-tag source-file include-js-doc-comment?]
   (.getStart ^js js-doc-this-tag source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [js-doc-this-tag]
  (.getFullStart ^js js-doc-this-tag))

(defn get-end
  "**Returns:** `number`"
  ^js [js-doc-this-tag]
  (.getEnd ^js js-doc-this-tag))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [js-doc-this-tag]
   (.getWidth ^js js-doc-this-tag))
  (^js [js-doc-this-tag source-file]
   (.getWidth ^js js-doc-this-tag source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [js-doc-this-tag]
  (.getFullWidth ^js js-doc-this-tag))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [js-doc-this-tag]
   (.getLeadingTriviaWidth ^js js-doc-this-tag))
  (^js [js-doc-this-tag source-file]
   (.getLeadingTriviaWidth ^js js-doc-this-tag source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [js-doc-this-tag]
   (.getFullText ^js js-doc-this-tag))
  (^js [js-doc-this-tag source-file]
   (.getFullText ^js js-doc-this-tag source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [js-doc-this-tag]
   (.getText ^js js-doc-this-tag))
  (^js [js-doc-this-tag source-file]
   (.getText ^js js-doc-this-tag source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [js-doc-this-tag]
   (.getFirstToken ^js js-doc-this-tag))
  (^js [js-doc-this-tag source-file]
   (.getFirstToken ^js js-doc-this-tag source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [js-doc-this-tag]
   (.getLastToken ^js js-doc-this-tag))
  (^js [js-doc-this-tag source-file]
   (.getLastToken ^js js-doc-this-tag source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [js-doc-this-tag cb-node]
   (.forEachChild ^js js-doc-this-tag cb-node))
  (^js [js-doc-this-tag cb-node cb-node-array]
   (.forEachChild ^js js-doc-this-tag cb-node cb-node-array)))

(defn pos
  "**Returns:** `number`"
  ^js [js-doc-this-tag]
  (.-pos ^js js-doc-this-tag))

(defn end
  "**Returns:** `number`"
  ^js [js-doc-this-tag]
  (.-end ^js js-doc-this-tag))
