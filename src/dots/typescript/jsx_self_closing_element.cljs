(ns dots.typescript.jsx-self-closing-element)

(defn kind
  "**Returns:** `SyntaxKind.JsxSelfClosingElement`"
  ^js [jsx-self-closing-element]
  (.-kind ^js jsx-self-closing-element))

(defn tag-name
  "**Returns:** `JsxTagNameExpression`"
  ^js [jsx-self-closing-element]
  (.-tagName ^js jsx-self-closing-element))

(defn type-arguments
  "**Returns:** `NodeArray<TypeNode> | undefined`"
  ^js [jsx-self-closing-element]
  (.-typeArguments ^js jsx-self-closing-element))

(defn attributes
  "**Returns:** `JsxAttributes`"
  ^js [jsx-self-closing-element]
  (.-attributes ^js jsx-self-closing-element))

(defn flags
  "**Returns:** `NodeFlags`"
  ^js [jsx-self-closing-element]
  (.-flags ^js jsx-self-closing-element))

(defn parent
  "**Returns:** `Node`"
  ^js [jsx-self-closing-element]
  (.-parent ^js jsx-self-closing-element))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [jsx-self-closing-element]
  (.getSourceFile ^js jsx-self-closing-element))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [jsx-self-closing-element]
   (.getChildCount ^js jsx-self-closing-element))
  (^js [jsx-self-closing-element source-file]
   (.getChildCount ^js jsx-self-closing-element source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [jsx-self-closing-element index]
   (.getChildAt ^js jsx-self-closing-element index))
  (^js [jsx-self-closing-element index source-file]
   (.getChildAt ^js jsx-self-closing-element index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [jsx-self-closing-element]
   (.getChildren ^js jsx-self-closing-element))
  (^js [jsx-self-closing-element source-file]
   (.getChildren ^js jsx-self-closing-element source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [jsx-self-closing-element]
   (.getStart ^js jsx-self-closing-element))
  (^js [jsx-self-closing-element source-file]
   (.getStart ^js jsx-self-closing-element source-file))
  (^js [jsx-self-closing-element source-file include-js-doc-comment?]
   (.getStart ^js jsx-self-closing-element source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [jsx-self-closing-element]
  (.getFullStart ^js jsx-self-closing-element))

(defn get-end
  "**Returns:** `number`"
  ^js [jsx-self-closing-element]
  (.getEnd ^js jsx-self-closing-element))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [jsx-self-closing-element]
   (.getWidth ^js jsx-self-closing-element))
  (^js [jsx-self-closing-element source-file]
   (.getWidth ^js jsx-self-closing-element source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [jsx-self-closing-element]
  (.getFullWidth ^js jsx-self-closing-element))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [jsx-self-closing-element]
   (.getLeadingTriviaWidth ^js jsx-self-closing-element))
  (^js [jsx-self-closing-element source-file]
   (.getLeadingTriviaWidth ^js jsx-self-closing-element source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [jsx-self-closing-element]
   (.getFullText ^js jsx-self-closing-element))
  (^js [jsx-self-closing-element source-file]
   (.getFullText ^js jsx-self-closing-element source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [jsx-self-closing-element]
   (.getText ^js jsx-self-closing-element))
  (^js [jsx-self-closing-element source-file]
   (.getText ^js jsx-self-closing-element source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [jsx-self-closing-element]
   (.getFirstToken ^js jsx-self-closing-element))
  (^js [jsx-self-closing-element source-file]
   (.getFirstToken ^js jsx-self-closing-element source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [jsx-self-closing-element]
   (.getLastToken ^js jsx-self-closing-element))
  (^js [jsx-self-closing-element source-file]
   (.getLastToken ^js jsx-self-closing-element source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [jsx-self-closing-element cb-node]
   (.forEachChild ^js jsx-self-closing-element cb-node))
  (^js [jsx-self-closing-element cb-node cb-node-array]
   (.forEachChild ^js jsx-self-closing-element cb-node cb-node-array)))

(defn pos
  "**Returns:** `number`"
  ^js [jsx-self-closing-element]
  (.-pos ^js jsx-self-closing-element))

(defn end
  "**Returns:** `number`"
  ^js [jsx-self-closing-element]
  (.-end ^js jsx-self-closing-element))
