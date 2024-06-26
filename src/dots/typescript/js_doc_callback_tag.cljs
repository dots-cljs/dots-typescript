(ns dots.typescript.js-doc-callback-tag
  (:refer-clojure :exclude [comment name]))

(defn kind
  "**Returns:** `SyntaxKind.JSDocCallbackTag`"
  ^js [js-doc-callback-tag]
  (.-kind ^js js-doc-callback-tag))

(defn parent
  "**Returns:** `JSDoc`"
  ^js [js-doc-callback-tag]
  (.-parent ^js js-doc-callback-tag))

(defn full-name
  "**Returns:** `Identifier | JSDocNamespaceDeclaration | undefined`"
  ^js [js-doc-callback-tag]
  (.-fullName ^js js-doc-callback-tag))

(defn name
  "**Returns:** `Identifier | undefined`"
  ^js [js-doc-callback-tag]
  (.-name ^js js-doc-callback-tag))

(defn type-expression
  "**Returns:** `JSDocSignature`"
  ^js [js-doc-callback-tag]
  (.-typeExpression ^js js-doc-callback-tag))

(defn tag-name
  "**Returns:** `Identifier`"
  ^js [js-doc-callback-tag]
  (.-tagName ^js js-doc-callback-tag))

(defn comment
  "**Returns:** `string | NodeArray<JSDocComment> | undefined`"
  ^js [js-doc-callback-tag]
  (.-comment ^js js-doc-callback-tag))

(defn flags
  "**Returns:** `NodeFlags`"
  ^js [js-doc-callback-tag]
  (.-flags ^js js-doc-callback-tag))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [js-doc-callback-tag]
  (.getSourceFile ^js js-doc-callback-tag))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [js-doc-callback-tag]
   (.getChildCount ^js js-doc-callback-tag))
  (^js [js-doc-callback-tag source-file]
   (.getChildCount ^js js-doc-callback-tag source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [js-doc-callback-tag index]
   (.getChildAt ^js js-doc-callback-tag index))
  (^js [js-doc-callback-tag index source-file]
   (.getChildAt ^js js-doc-callback-tag index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [js-doc-callback-tag]
   (.getChildren ^js js-doc-callback-tag))
  (^js [js-doc-callback-tag source-file]
   (.getChildren ^js js-doc-callback-tag source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [js-doc-callback-tag]
   (.getStart ^js js-doc-callback-tag))
  (^js [js-doc-callback-tag source-file]
   (.getStart ^js js-doc-callback-tag source-file))
  (^js [js-doc-callback-tag source-file include-js-doc-comment?]
   (.getStart ^js js-doc-callback-tag source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [js-doc-callback-tag]
  (.getFullStart ^js js-doc-callback-tag))

(defn get-end
  "**Returns:** `number`"
  ^js [js-doc-callback-tag]
  (.getEnd ^js js-doc-callback-tag))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [js-doc-callback-tag]
   (.getWidth ^js js-doc-callback-tag))
  (^js [js-doc-callback-tag source-file]
   (.getWidth ^js js-doc-callback-tag source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [js-doc-callback-tag]
  (.getFullWidth ^js js-doc-callback-tag))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [js-doc-callback-tag]
   (.getLeadingTriviaWidth ^js js-doc-callback-tag))
  (^js [js-doc-callback-tag source-file]
   (.getLeadingTriviaWidth ^js js-doc-callback-tag source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [js-doc-callback-tag]
   (.getFullText ^js js-doc-callback-tag))
  (^js [js-doc-callback-tag source-file]
   (.getFullText ^js js-doc-callback-tag source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [js-doc-callback-tag]
   (.getText ^js js-doc-callback-tag))
  (^js [js-doc-callback-tag source-file]
   (.getText ^js js-doc-callback-tag source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [js-doc-callback-tag]
   (.getFirstToken ^js js-doc-callback-tag))
  (^js [js-doc-callback-tag source-file]
   (.getFirstToken ^js js-doc-callback-tag source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [js-doc-callback-tag]
   (.getLastToken ^js js-doc-callback-tag))
  (^js [js-doc-callback-tag source-file]
   (.getLastToken ^js js-doc-callback-tag source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [js-doc-callback-tag cb-node]
   (.forEachChild ^js js-doc-callback-tag cb-node))
  (^js [js-doc-callback-tag cb-node cb-node-array]
   (.forEachChild ^js js-doc-callback-tag cb-node cb-node-array)))

(defn pos
  "**Returns:** `number`"
  ^js [js-doc-callback-tag]
  (.-pos ^js js-doc-callback-tag))

(defn end
  "**Returns:** `number`"
  ^js [js-doc-callback-tag]
  (.-end ^js js-doc-callback-tag))
