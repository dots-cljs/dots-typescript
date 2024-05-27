(ns dots.typescript.js-doc-implements-tag
  (:refer-clojure :exclude [comment]))

(defn kind
  "**Returns:** `SyntaxKind.JSDocImplementsTag`"
  ^js [js-doc-implements-tag]
  (.-kind ^js js-doc-implements-tag))

(defn class
  "**Returns:** `ExpressionWithTypeArguments & { readonly expression: Identifier | PropertyAccessEntityNameExpression; }`"
  ^js [js-doc-implements-tag]
  (.-class ^js js-doc-implements-tag))

(defn parent
  "**Returns:** `JSDoc | JSDocTypeLiteral`"
  ^js [js-doc-implements-tag]
  (.-parent ^js js-doc-implements-tag))

(defn tag-name
  "**Returns:** `Identifier`"
  ^js [js-doc-implements-tag]
  (.-tagName ^js js-doc-implements-tag))

(defn comment
  "**Returns:** `string | NodeArray<JSDocComment> | undefined`"
  ^js [js-doc-implements-tag]
  (.-comment ^js js-doc-implements-tag))

(defn flags
  "**Returns:** `NodeFlags`"
  ^js [js-doc-implements-tag]
  (.-flags ^js js-doc-implements-tag))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [js-doc-implements-tag]
  (.getSourceFile ^js js-doc-implements-tag))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [js-doc-implements-tag]
   (.getChildCount ^js js-doc-implements-tag))
  (^js [js-doc-implements-tag source-file]
   (.getChildCount ^js js-doc-implements-tag source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [js-doc-implements-tag index]
   (.getChildAt ^js js-doc-implements-tag index))
  (^js [js-doc-implements-tag index source-file]
   (.getChildAt ^js js-doc-implements-tag index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [js-doc-implements-tag]
   (.getChildren ^js js-doc-implements-tag))
  (^js [js-doc-implements-tag source-file]
   (.getChildren ^js js-doc-implements-tag source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [js-doc-implements-tag]
   (.getStart ^js js-doc-implements-tag))
  (^js [js-doc-implements-tag source-file]
   (.getStart ^js js-doc-implements-tag source-file))
  (^js [js-doc-implements-tag source-file include-js-doc-comment?]
   (.getStart ^js js-doc-implements-tag source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [js-doc-implements-tag]
  (.getFullStart ^js js-doc-implements-tag))

(defn get-end
  "**Returns:** `number`"
  ^js [js-doc-implements-tag]
  (.getEnd ^js js-doc-implements-tag))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [js-doc-implements-tag]
   (.getWidth ^js js-doc-implements-tag))
  (^js [js-doc-implements-tag source-file]
   (.getWidth ^js js-doc-implements-tag source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [js-doc-implements-tag]
  (.getFullWidth ^js js-doc-implements-tag))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [js-doc-implements-tag]
   (.getLeadingTriviaWidth ^js js-doc-implements-tag))
  (^js [js-doc-implements-tag source-file]
   (.getLeadingTriviaWidth ^js js-doc-implements-tag source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [js-doc-implements-tag]
   (.getFullText ^js js-doc-implements-tag))
  (^js [js-doc-implements-tag source-file]
   (.getFullText ^js js-doc-implements-tag source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [js-doc-implements-tag]
   (.getText ^js js-doc-implements-tag))
  (^js [js-doc-implements-tag source-file]
   (.getText ^js js-doc-implements-tag source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [js-doc-implements-tag]
   (.getFirstToken ^js js-doc-implements-tag))
  (^js [js-doc-implements-tag source-file]
   (.getFirstToken ^js js-doc-implements-tag source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [js-doc-implements-tag]
   (.getLastToken ^js js-doc-implements-tag))
  (^js [js-doc-implements-tag source-file]
   (.getLastToken ^js js-doc-implements-tag source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [js-doc-implements-tag cb-node]
   (.forEachChild ^js js-doc-implements-tag cb-node))
  (^js [js-doc-implements-tag cb-node cb-node-array]
   (.forEachChild ^js js-doc-implements-tag cb-node cb-node-array)))

(defn pos
  "**Returns:** `number`"
  ^js [js-doc-implements-tag]
  (.-pos ^js js-doc-implements-tag))

(defn end
  "**Returns:** `number`"
  ^js [js-doc-implements-tag]
  (.-end ^js js-doc-implements-tag))
