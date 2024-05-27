(ns dots.typescript.js-doc-template-tag
  (:refer-clojure :exclude [comment]))

(defn kind
  "**Returns:** `SyntaxKind.JSDocTemplateTag`"
  ^js [js-doc-template-tag]
  (.-kind ^js js-doc-template-tag))

(defn constraint
  "**Returns:** `JSDocTypeExpression | undefined`"
  ^js [js-doc-template-tag]
  (.-constraint ^js js-doc-template-tag))

(defn type-parameters
  "**Returns:** `NodeArray<TypeParameterDeclaration>`"
  ^js [js-doc-template-tag]
  (.-typeParameters ^js js-doc-template-tag))

(defn parent
  "**Returns:** `JSDoc | JSDocTypeLiteral`"
  ^js [js-doc-template-tag]
  (.-parent ^js js-doc-template-tag))

(defn tag-name
  "**Returns:** `Identifier`"
  ^js [js-doc-template-tag]
  (.-tagName ^js js-doc-template-tag))

(defn comment
  "**Returns:** `string | NodeArray<JSDocComment> | undefined`"
  ^js [js-doc-template-tag]
  (.-comment ^js js-doc-template-tag))

(defn flags
  "**Returns:** `NodeFlags`"
  ^js [js-doc-template-tag]
  (.-flags ^js js-doc-template-tag))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [js-doc-template-tag]
  (.getSourceFile ^js js-doc-template-tag))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [js-doc-template-tag]
   (.getChildCount ^js js-doc-template-tag))
  (^js [js-doc-template-tag source-file]
   (.getChildCount ^js js-doc-template-tag source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [js-doc-template-tag index]
   (.getChildAt ^js js-doc-template-tag index))
  (^js [js-doc-template-tag index source-file]
   (.getChildAt ^js js-doc-template-tag index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [js-doc-template-tag]
   (.getChildren ^js js-doc-template-tag))
  (^js [js-doc-template-tag source-file]
   (.getChildren ^js js-doc-template-tag source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [js-doc-template-tag]
   (.getStart ^js js-doc-template-tag))
  (^js [js-doc-template-tag source-file]
   (.getStart ^js js-doc-template-tag source-file))
  (^js [js-doc-template-tag source-file include-js-doc-comment?]
   (.getStart ^js js-doc-template-tag source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [js-doc-template-tag]
  (.getFullStart ^js js-doc-template-tag))

(defn get-end
  "**Returns:** `number`"
  ^js [js-doc-template-tag]
  (.getEnd ^js js-doc-template-tag))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [js-doc-template-tag]
   (.getWidth ^js js-doc-template-tag))
  (^js [js-doc-template-tag source-file]
   (.getWidth ^js js-doc-template-tag source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [js-doc-template-tag]
  (.getFullWidth ^js js-doc-template-tag))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [js-doc-template-tag]
   (.getLeadingTriviaWidth ^js js-doc-template-tag))
  (^js [js-doc-template-tag source-file]
   (.getLeadingTriviaWidth ^js js-doc-template-tag source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [js-doc-template-tag]
   (.getFullText ^js js-doc-template-tag))
  (^js [js-doc-template-tag source-file]
   (.getFullText ^js js-doc-template-tag source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [js-doc-template-tag]
   (.getText ^js js-doc-template-tag))
  (^js [js-doc-template-tag source-file]
   (.getText ^js js-doc-template-tag source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [js-doc-template-tag]
   (.getFirstToken ^js js-doc-template-tag))
  (^js [js-doc-template-tag source-file]
   (.getFirstToken ^js js-doc-template-tag source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [js-doc-template-tag]
   (.getLastToken ^js js-doc-template-tag))
  (^js [js-doc-template-tag source-file]
   (.getLastToken ^js js-doc-template-tag source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [js-doc-template-tag cb-node]
   (.forEachChild ^js js-doc-template-tag cb-node))
  (^js [js-doc-template-tag cb-node cb-node-array]
   (.forEachChild ^js js-doc-template-tag cb-node cb-node-array)))

(defn pos
  "**Returns:** `number`"
  ^js [js-doc-template-tag]
  (.-pos ^js js-doc-template-tag))

(defn end
  "**Returns:** `number`"
  ^js [js-doc-template-tag]
  (.-end ^js js-doc-template-tag))
