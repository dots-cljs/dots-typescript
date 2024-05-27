(ns dots.typescript.js-doc-type-tag
  (:refer-clojure :exclude [comment]))

(defn kind
  "**Returns:** `SyntaxKind.JSDocTypeTag`"
  ^js [js-doc-type-tag]
  (.-kind ^js js-doc-type-tag))

(defn type-expression
  "**Returns:** `JSDocTypeExpression`"
  ^js [js-doc-type-tag]
  (.-typeExpression ^js js-doc-type-tag))

(defn parent
  "**Returns:** `JSDoc | JSDocTypeLiteral`"
  ^js [js-doc-type-tag]
  (.-parent ^js js-doc-type-tag))

(defn tag-name
  "**Returns:** `Identifier`"
  ^js [js-doc-type-tag]
  (.-tagName ^js js-doc-type-tag))

(defn comment
  "**Returns:** `string | NodeArray<JSDocComment> | undefined`"
  ^js [js-doc-type-tag]
  (.-comment ^js js-doc-type-tag))

(defn flags
  "**Returns:** `NodeFlags`"
  ^js [js-doc-type-tag]
  (.-flags ^js js-doc-type-tag))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [js-doc-type-tag]
  (.getSourceFile ^js js-doc-type-tag))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [js-doc-type-tag]
   (.getChildCount ^js js-doc-type-tag))
  (^js [js-doc-type-tag source-file]
   (.getChildCount ^js js-doc-type-tag source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [js-doc-type-tag index]
   (.getChildAt ^js js-doc-type-tag index))
  (^js [js-doc-type-tag index source-file]
   (.getChildAt ^js js-doc-type-tag index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [js-doc-type-tag]
   (.getChildren ^js js-doc-type-tag))
  (^js [js-doc-type-tag source-file]
   (.getChildren ^js js-doc-type-tag source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [js-doc-type-tag]
   (.getStart ^js js-doc-type-tag))
  (^js [js-doc-type-tag source-file]
   (.getStart ^js js-doc-type-tag source-file))
  (^js [js-doc-type-tag source-file include-js-doc-comment?]
   (.getStart ^js js-doc-type-tag source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [js-doc-type-tag]
  (.getFullStart ^js js-doc-type-tag))

(defn get-end
  "**Returns:** `number`"
  ^js [js-doc-type-tag]
  (.getEnd ^js js-doc-type-tag))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [js-doc-type-tag]
   (.getWidth ^js js-doc-type-tag))
  (^js [js-doc-type-tag source-file]
   (.getWidth ^js js-doc-type-tag source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [js-doc-type-tag]
  (.getFullWidth ^js js-doc-type-tag))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [js-doc-type-tag]
   (.getLeadingTriviaWidth ^js js-doc-type-tag))
  (^js [js-doc-type-tag source-file]
   (.getLeadingTriviaWidth ^js js-doc-type-tag source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [js-doc-type-tag]
   (.getFullText ^js js-doc-type-tag))
  (^js [js-doc-type-tag source-file]
   (.getFullText ^js js-doc-type-tag source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [js-doc-type-tag]
   (.getText ^js js-doc-type-tag))
  (^js [js-doc-type-tag source-file]
   (.getText ^js js-doc-type-tag source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [js-doc-type-tag]
   (.getFirstToken ^js js-doc-type-tag))
  (^js [js-doc-type-tag source-file]
   (.getFirstToken ^js js-doc-type-tag source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [js-doc-type-tag]
   (.getLastToken ^js js-doc-type-tag))
  (^js [js-doc-type-tag source-file]
   (.getLastToken ^js js-doc-type-tag source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [js-doc-type-tag cb-node]
   (.forEachChild ^js js-doc-type-tag cb-node))
  (^js [js-doc-type-tag cb-node cb-node-array]
   (.forEachChild ^js js-doc-type-tag cb-node cb-node-array)))

(defn pos
  "**Returns:** `number`"
  ^js [js-doc-type-tag]
  (.-pos ^js js-doc-type-tag))

(defn end
  "**Returns:** `number`"
  ^js [js-doc-type-tag]
  (.-end ^js js-doc-type-tag))
