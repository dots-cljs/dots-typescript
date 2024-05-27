(ns dots.typescript.js-doc-property-tag
  (:refer-clojure :exclude [comment name]))

(defn kind
  "**Returns:** `SyntaxKind.JSDocPropertyTag`"
  ^js [js-doc-property-tag]
  (.-kind ^js js-doc-property-tag))

(defn parent
  "**Returns:** `JSDoc`"
  ^js [js-doc-property-tag]
  (.-parent ^js js-doc-property-tag))

(defn name
  "**Returns:** `EntityName`"
  ^js [js-doc-property-tag]
  (.-name ^js js-doc-property-tag))

(defn type-expression
  "**Returns:** `JSDocTypeExpression | undefined`"
  ^js [js-doc-property-tag]
  (.-typeExpression ^js js-doc-property-tag))

(defn name-first?
  "Whether the property name came before the type -- non-standard for JSDoc, but Typescript-like
   
   **Returns:** `boolean`"
  ^js [js-doc-property-tag]
  (.-isNameFirst ^js js-doc-property-tag))

(defn bracketed?
  "**Returns:** `boolean`"
  ^js [js-doc-property-tag]
  (.-isBracketed ^js js-doc-property-tag))

(defn tag-name
  "**Returns:** `Identifier`"
  ^js [js-doc-property-tag]
  (.-tagName ^js js-doc-property-tag))

(defn comment
  "**Returns:** `string | NodeArray<JSDocComment> | undefined`"
  ^js [js-doc-property-tag]
  (.-comment ^js js-doc-property-tag))

(defn flags
  "**Returns:** `NodeFlags`"
  ^js [js-doc-property-tag]
  (.-flags ^js js-doc-property-tag))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [js-doc-property-tag]
  (.getSourceFile ^js js-doc-property-tag))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [js-doc-property-tag]
   (.getChildCount ^js js-doc-property-tag))
  (^js [js-doc-property-tag source-file]
   (.getChildCount ^js js-doc-property-tag source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [js-doc-property-tag index]
   (.getChildAt ^js js-doc-property-tag index))
  (^js [js-doc-property-tag index source-file]
   (.getChildAt ^js js-doc-property-tag index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [js-doc-property-tag]
   (.getChildren ^js js-doc-property-tag))
  (^js [js-doc-property-tag source-file]
   (.getChildren ^js js-doc-property-tag source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [js-doc-property-tag]
   (.getStart ^js js-doc-property-tag))
  (^js [js-doc-property-tag source-file]
   (.getStart ^js js-doc-property-tag source-file))
  (^js [js-doc-property-tag source-file include-js-doc-comment?]
   (.getStart ^js js-doc-property-tag source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [js-doc-property-tag]
  (.getFullStart ^js js-doc-property-tag))

(defn get-end
  "**Returns:** `number`"
  ^js [js-doc-property-tag]
  (.getEnd ^js js-doc-property-tag))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [js-doc-property-tag]
   (.getWidth ^js js-doc-property-tag))
  (^js [js-doc-property-tag source-file]
   (.getWidth ^js js-doc-property-tag source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [js-doc-property-tag]
  (.getFullWidth ^js js-doc-property-tag))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [js-doc-property-tag]
   (.getLeadingTriviaWidth ^js js-doc-property-tag))
  (^js [js-doc-property-tag source-file]
   (.getLeadingTriviaWidth ^js js-doc-property-tag source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [js-doc-property-tag]
   (.getFullText ^js js-doc-property-tag))
  (^js [js-doc-property-tag source-file]
   (.getFullText ^js js-doc-property-tag source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [js-doc-property-tag]
   (.getText ^js js-doc-property-tag))
  (^js [js-doc-property-tag source-file]
   (.getText ^js js-doc-property-tag source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [js-doc-property-tag]
   (.getFirstToken ^js js-doc-property-tag))
  (^js [js-doc-property-tag source-file]
   (.getFirstToken ^js js-doc-property-tag source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [js-doc-property-tag]
   (.getLastToken ^js js-doc-property-tag))
  (^js [js-doc-property-tag source-file]
   (.getLastToken ^js js-doc-property-tag source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [js-doc-property-tag cb-node]
   (.forEachChild ^js js-doc-property-tag cb-node))
  (^js [js-doc-property-tag cb-node cb-node-array]
   (.forEachChild ^js js-doc-property-tag cb-node cb-node-array)))

(defn pos
  "**Returns:** `number`"
  ^js [js-doc-property-tag]
  (.-pos ^js js-doc-property-tag))

(defn end
  "**Returns:** `number`"
  ^js [js-doc-property-tag]
  (.-end ^js js-doc-property-tag))
