(ns dots.typescript.js-doc-overload-tag
  (:refer-clojure :exclude [comment]))

(defn kind
  "**Returns:** `SyntaxKind.JSDocOverloadTag`"
  ^js [js-doc-overload-tag]
  (.-kind ^js js-doc-overload-tag))

(defn parent
  "**Returns:** `JSDoc`"
  ^js [js-doc-overload-tag]
  (.-parent ^js js-doc-overload-tag))

(defn type-expression
  "**Returns:** `JSDocSignature`"
  ^js [js-doc-overload-tag]
  (.-typeExpression ^js js-doc-overload-tag))

(defn tag-name
  "**Returns:** `Identifier`"
  ^js [js-doc-overload-tag]
  (.-tagName ^js js-doc-overload-tag))

(defn comment
  "**Returns:** `string | NodeArray<JSDocComment> | undefined`"
  ^js [js-doc-overload-tag]
  (.-comment ^js js-doc-overload-tag))

(defn flags
  "**Returns:** `NodeFlags`"
  ^js [js-doc-overload-tag]
  (.-flags ^js js-doc-overload-tag))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [js-doc-overload-tag]
  (.getSourceFile ^js js-doc-overload-tag))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [js-doc-overload-tag]
   (.getChildCount ^js js-doc-overload-tag))
  (^js [js-doc-overload-tag source-file]
   (.getChildCount ^js js-doc-overload-tag source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [js-doc-overload-tag index]
   (.getChildAt ^js js-doc-overload-tag index))
  (^js [js-doc-overload-tag index source-file]
   (.getChildAt ^js js-doc-overload-tag index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [js-doc-overload-tag]
   (.getChildren ^js js-doc-overload-tag))
  (^js [js-doc-overload-tag source-file]
   (.getChildren ^js js-doc-overload-tag source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [js-doc-overload-tag]
   (.getStart ^js js-doc-overload-tag))
  (^js [js-doc-overload-tag source-file]
   (.getStart ^js js-doc-overload-tag source-file))
  (^js [js-doc-overload-tag source-file include-js-doc-comment?]
   (.getStart ^js js-doc-overload-tag source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [js-doc-overload-tag]
  (.getFullStart ^js js-doc-overload-tag))

(defn get-end
  "**Returns:** `number`"
  ^js [js-doc-overload-tag]
  (.getEnd ^js js-doc-overload-tag))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [js-doc-overload-tag]
   (.getWidth ^js js-doc-overload-tag))
  (^js [js-doc-overload-tag source-file]
   (.getWidth ^js js-doc-overload-tag source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [js-doc-overload-tag]
  (.getFullWidth ^js js-doc-overload-tag))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [js-doc-overload-tag]
   (.getLeadingTriviaWidth ^js js-doc-overload-tag))
  (^js [js-doc-overload-tag source-file]
   (.getLeadingTriviaWidth ^js js-doc-overload-tag source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [js-doc-overload-tag]
   (.getFullText ^js js-doc-overload-tag))
  (^js [js-doc-overload-tag source-file]
   (.getFullText ^js js-doc-overload-tag source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [js-doc-overload-tag]
   (.getText ^js js-doc-overload-tag))
  (^js [js-doc-overload-tag source-file]
   (.getText ^js js-doc-overload-tag source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [js-doc-overload-tag]
   (.getFirstToken ^js js-doc-overload-tag))
  (^js [js-doc-overload-tag source-file]
   (.getFirstToken ^js js-doc-overload-tag source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [js-doc-overload-tag]
   (.getLastToken ^js js-doc-overload-tag))
  (^js [js-doc-overload-tag source-file]
   (.getLastToken ^js js-doc-overload-tag source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [js-doc-overload-tag cb-node]
   (.forEachChild ^js js-doc-overload-tag cb-node))
  (^js [js-doc-overload-tag cb-node cb-node-array]
   (.forEachChild ^js js-doc-overload-tag cb-node cb-node-array)))

(defn pos
  "**Returns:** `number`"
  ^js [js-doc-overload-tag]
  (.-pos ^js js-doc-overload-tag))

(defn end
  "**Returns:** `number`"
  ^js [js-doc-overload-tag]
  (.-end ^js js-doc-overload-tag))
