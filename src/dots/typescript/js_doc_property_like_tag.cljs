(ns dots.typescript.js-doc-property-like-tag
  (:refer-clojure :exclude [comment name]))

(defn parent
  "**Returns:** `JSDoc`"
  ^js [js-doc-property-like-tag]
  (.-parent ^js js-doc-property-like-tag))

(defn name
  "**Returns:** `EntityName`"
  ^js [js-doc-property-like-tag]
  (.-name ^js js-doc-property-like-tag))

(defn type-expression
  "**Returns:** `JSDocTypeExpression | undefined`"
  ^js [js-doc-property-like-tag]
  (.-typeExpression ^js js-doc-property-like-tag))

(defn name-first?
  "Whether the property name came before the type -- non-standard for JSDoc, but Typescript-like
   
   **Returns:** `boolean`"
  ^js [js-doc-property-like-tag]
  (.-isNameFirst ^js js-doc-property-like-tag))

(defn bracketed?
  "**Returns:** `boolean`"
  ^js [js-doc-property-like-tag]
  (.-isBracketed ^js js-doc-property-like-tag))

(defn tag-name
  "**Returns:** `Identifier`"
  ^js [js-doc-property-like-tag]
  (.-tagName ^js js-doc-property-like-tag))

(defn comment
  "**Returns:** `string | NodeArray<JSDocComment> | undefined`"
  ^js [js-doc-property-like-tag]
  (.-comment ^js js-doc-property-like-tag))

(defn kind
  "**Returns:** `SyntaxKind`"
  ^js [js-doc-property-like-tag]
  (.-kind ^js js-doc-property-like-tag))

(defn flags
  "**Returns:** `NodeFlags`"
  ^js [js-doc-property-like-tag]
  (.-flags ^js js-doc-property-like-tag))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [js-doc-property-like-tag]
  (.getSourceFile ^js js-doc-property-like-tag))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [js-doc-property-like-tag]
   (.getChildCount ^js js-doc-property-like-tag))
  (^js [js-doc-property-like-tag source-file]
   (.getChildCount ^js js-doc-property-like-tag source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [js-doc-property-like-tag index]
   (.getChildAt ^js js-doc-property-like-tag index))
  (^js [js-doc-property-like-tag index source-file]
   (.getChildAt ^js js-doc-property-like-tag index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [js-doc-property-like-tag]
   (.getChildren ^js js-doc-property-like-tag))
  (^js [js-doc-property-like-tag source-file]
   (.getChildren ^js js-doc-property-like-tag source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [js-doc-property-like-tag]
   (.getStart ^js js-doc-property-like-tag))
  (^js [js-doc-property-like-tag source-file]
   (.getStart ^js js-doc-property-like-tag source-file))
  (^js [js-doc-property-like-tag source-file include-js-doc-comment?]
   (.getStart ^js js-doc-property-like-tag source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [js-doc-property-like-tag]
  (.getFullStart ^js js-doc-property-like-tag))

(defn get-end
  "**Returns:** `number`"
  ^js [js-doc-property-like-tag]
  (.getEnd ^js js-doc-property-like-tag))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [js-doc-property-like-tag]
   (.getWidth ^js js-doc-property-like-tag))
  (^js [js-doc-property-like-tag source-file]
   (.getWidth ^js js-doc-property-like-tag source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [js-doc-property-like-tag]
  (.getFullWidth ^js js-doc-property-like-tag))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [js-doc-property-like-tag]
   (.getLeadingTriviaWidth ^js js-doc-property-like-tag))
  (^js [js-doc-property-like-tag source-file]
   (.getLeadingTriviaWidth ^js js-doc-property-like-tag source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [js-doc-property-like-tag]
   (.getFullText ^js js-doc-property-like-tag))
  (^js [js-doc-property-like-tag source-file]
   (.getFullText ^js js-doc-property-like-tag source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [js-doc-property-like-tag]
   (.getText ^js js-doc-property-like-tag))
  (^js [js-doc-property-like-tag source-file]
   (.getText ^js js-doc-property-like-tag source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [js-doc-property-like-tag]
   (.getFirstToken ^js js-doc-property-like-tag))
  (^js [js-doc-property-like-tag source-file]
   (.getFirstToken ^js js-doc-property-like-tag source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [js-doc-property-like-tag]
   (.getLastToken ^js js-doc-property-like-tag))
  (^js [js-doc-property-like-tag source-file]
   (.getLastToken ^js js-doc-property-like-tag source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [js-doc-property-like-tag cb-node]
   (.forEachChild ^js js-doc-property-like-tag cb-node))
  (^js [js-doc-property-like-tag cb-node cb-node-array]
   (.forEachChild ^js js-doc-property-like-tag cb-node cb-node-array)))

(defn pos
  "**Returns:** `number`"
  ^js [js-doc-property-like-tag]
  (.-pos ^js js-doc-property-like-tag))

(defn end
  "**Returns:** `number`"
  ^js [js-doc-property-like-tag]
  (.-end ^js js-doc-property-like-tag))
