(ns dots.typescript.js-doc-satisfies-tag
  (:refer-clojure :exclude [comment]))

(defn kind
  "**Returns:** `SyntaxKind.JSDocSatisfiesTag`"
  ^js [js-doc-satisfies-tag]
  (.-kind ^js js-doc-satisfies-tag))

(defn type-expression
  "**Returns:** `JSDocTypeExpression`"
  ^js [js-doc-satisfies-tag]
  (.-typeExpression ^js js-doc-satisfies-tag))

(defn parent
  "**Returns:** `JSDoc | JSDocTypeLiteral`"
  ^js [js-doc-satisfies-tag]
  (.-parent ^js js-doc-satisfies-tag))

(defn tag-name
  "**Returns:** `Identifier`"
  ^js [js-doc-satisfies-tag]
  (.-tagName ^js js-doc-satisfies-tag))

(defn comment
  "**Returns:** `string | NodeArray<JSDocComment> | undefined`"
  ^js [js-doc-satisfies-tag]
  (.-comment ^js js-doc-satisfies-tag))

(defn flags
  "**Returns:** `NodeFlags`"
  ^js [js-doc-satisfies-tag]
  (.-flags ^js js-doc-satisfies-tag))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [js-doc-satisfies-tag]
  (.getSourceFile ^js js-doc-satisfies-tag))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [js-doc-satisfies-tag]
   (.getChildCount ^js js-doc-satisfies-tag))
  (^js [js-doc-satisfies-tag source-file]
   (.getChildCount ^js js-doc-satisfies-tag source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [js-doc-satisfies-tag index]
   (.getChildAt ^js js-doc-satisfies-tag index))
  (^js [js-doc-satisfies-tag index source-file]
   (.getChildAt ^js js-doc-satisfies-tag index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [js-doc-satisfies-tag]
   (.getChildren ^js js-doc-satisfies-tag))
  (^js [js-doc-satisfies-tag source-file]
   (.getChildren ^js js-doc-satisfies-tag source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [js-doc-satisfies-tag]
   (.getStart ^js js-doc-satisfies-tag))
  (^js [js-doc-satisfies-tag source-file]
   (.getStart ^js js-doc-satisfies-tag source-file))
  (^js [js-doc-satisfies-tag source-file include-js-doc-comment?]
   (.getStart ^js js-doc-satisfies-tag source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [js-doc-satisfies-tag]
  (.getFullStart ^js js-doc-satisfies-tag))

(defn get-end
  "**Returns:** `number`"
  ^js [js-doc-satisfies-tag]
  (.getEnd ^js js-doc-satisfies-tag))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [js-doc-satisfies-tag]
   (.getWidth ^js js-doc-satisfies-tag))
  (^js [js-doc-satisfies-tag source-file]
   (.getWidth ^js js-doc-satisfies-tag source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [js-doc-satisfies-tag]
  (.getFullWidth ^js js-doc-satisfies-tag))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [js-doc-satisfies-tag]
   (.getLeadingTriviaWidth ^js js-doc-satisfies-tag))
  (^js [js-doc-satisfies-tag source-file]
   (.getLeadingTriviaWidth ^js js-doc-satisfies-tag source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [js-doc-satisfies-tag]
   (.getFullText ^js js-doc-satisfies-tag))
  (^js [js-doc-satisfies-tag source-file]
   (.getFullText ^js js-doc-satisfies-tag source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [js-doc-satisfies-tag]
   (.getText ^js js-doc-satisfies-tag))
  (^js [js-doc-satisfies-tag source-file]
   (.getText ^js js-doc-satisfies-tag source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [js-doc-satisfies-tag]
   (.getFirstToken ^js js-doc-satisfies-tag))
  (^js [js-doc-satisfies-tag source-file]
   (.getFirstToken ^js js-doc-satisfies-tag source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [js-doc-satisfies-tag]
   (.getLastToken ^js js-doc-satisfies-tag))
  (^js [js-doc-satisfies-tag source-file]
   (.getLastToken ^js js-doc-satisfies-tag source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [js-doc-satisfies-tag cb-node]
   (.forEachChild ^js js-doc-satisfies-tag cb-node))
  (^js [js-doc-satisfies-tag cb-node cb-node-array]
   (.forEachChild ^js js-doc-satisfies-tag cb-node cb-node-array)))

(defn pos
  "**Returns:** `number`"
  ^js [js-doc-satisfies-tag]
  (.-pos ^js js-doc-satisfies-tag))

(defn end
  "**Returns:** `number`"
  ^js [js-doc-satisfies-tag]
  (.-end ^js js-doc-satisfies-tag))
