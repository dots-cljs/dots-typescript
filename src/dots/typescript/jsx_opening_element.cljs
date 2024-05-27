(ns dots.typescript.jsx-opening-element)

(defn kind
  "**Returns:** `SyntaxKind.JsxOpeningElement`"
  ^js [jsx-opening-element]
  (.-kind ^js jsx-opening-element))

(defn parent
  "**Returns:** `JsxElement`"
  ^js [jsx-opening-element]
  (.-parent ^js jsx-opening-element))

(defn tag-name
  "**Returns:** `JsxTagNameExpression`"
  ^js [jsx-opening-element]
  (.-tagName ^js jsx-opening-element))

(defn type-arguments
  "**Returns:** `NodeArray<TypeNode> | undefined`"
  ^js [jsx-opening-element]
  (.-typeArguments ^js jsx-opening-element))

(defn attributes
  "**Returns:** `JsxAttributes`"
  ^js [jsx-opening-element]
  (.-attributes ^js jsx-opening-element))

(defn flags
  "**Returns:** `NodeFlags`"
  ^js [jsx-opening-element]
  (.-flags ^js jsx-opening-element))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [jsx-opening-element]
  (.getSourceFile ^js jsx-opening-element))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [jsx-opening-element]
   (.getChildCount ^js jsx-opening-element))
  (^js [jsx-opening-element source-file]
   (.getChildCount ^js jsx-opening-element source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [jsx-opening-element index]
   (.getChildAt ^js jsx-opening-element index))
  (^js [jsx-opening-element index source-file]
   (.getChildAt ^js jsx-opening-element index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [jsx-opening-element]
   (.getChildren ^js jsx-opening-element))
  (^js [jsx-opening-element source-file]
   (.getChildren ^js jsx-opening-element source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [jsx-opening-element]
   (.getStart ^js jsx-opening-element))
  (^js [jsx-opening-element source-file]
   (.getStart ^js jsx-opening-element source-file))
  (^js [jsx-opening-element source-file include-js-doc-comment?]
   (.getStart ^js jsx-opening-element source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [jsx-opening-element]
  (.getFullStart ^js jsx-opening-element))

(defn get-end
  "**Returns:** `number`"
  ^js [jsx-opening-element]
  (.getEnd ^js jsx-opening-element))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [jsx-opening-element]
   (.getWidth ^js jsx-opening-element))
  (^js [jsx-opening-element source-file]
   (.getWidth ^js jsx-opening-element source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [jsx-opening-element]
  (.getFullWidth ^js jsx-opening-element))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [jsx-opening-element]
   (.getLeadingTriviaWidth ^js jsx-opening-element))
  (^js [jsx-opening-element source-file]
   (.getLeadingTriviaWidth ^js jsx-opening-element source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [jsx-opening-element]
   (.getFullText ^js jsx-opening-element))
  (^js [jsx-opening-element source-file]
   (.getFullText ^js jsx-opening-element source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [jsx-opening-element]
   (.getText ^js jsx-opening-element))
  (^js [jsx-opening-element source-file]
   (.getText ^js jsx-opening-element source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [jsx-opening-element]
   (.getFirstToken ^js jsx-opening-element))
  (^js [jsx-opening-element source-file]
   (.getFirstToken ^js jsx-opening-element source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [jsx-opening-element]
   (.getLastToken ^js jsx-opening-element))
  (^js [jsx-opening-element source-file]
   (.getLastToken ^js jsx-opening-element source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [jsx-opening-element cb-node]
   (.forEachChild ^js jsx-opening-element cb-node))
  (^js [jsx-opening-element cb-node cb-node-array]
   (.forEachChild ^js jsx-opening-element cb-node cb-node-array)))

(defn pos
  "**Returns:** `number`"
  ^js [jsx-opening-element]
  (.-pos ^js jsx-opening-element))

(defn end
  "**Returns:** `number`"
  ^js [jsx-opening-element]
  (.-end ^js jsx-opening-element))
