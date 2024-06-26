(ns dots.typescript.jsx-closing-element)

(defn kind
  "**Returns:** `SyntaxKind.JsxClosingElement`"
  ^js [jsx-closing-element]
  (.-kind ^js jsx-closing-element))

(defn parent
  "**Returns:** `JsxElement`"
  ^js [jsx-closing-element]
  (.-parent ^js jsx-closing-element))

(defn tag-name
  "**Returns:** `JsxTagNameExpression`"
  ^js [jsx-closing-element]
  (.-tagName ^js jsx-closing-element))

(defn flags
  "**Returns:** `NodeFlags`"
  ^js [jsx-closing-element]
  (.-flags ^js jsx-closing-element))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [jsx-closing-element]
  (.getSourceFile ^js jsx-closing-element))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [jsx-closing-element]
   (.getChildCount ^js jsx-closing-element))
  (^js [jsx-closing-element source-file]
   (.getChildCount ^js jsx-closing-element source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [jsx-closing-element index]
   (.getChildAt ^js jsx-closing-element index))
  (^js [jsx-closing-element index source-file]
   (.getChildAt ^js jsx-closing-element index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [jsx-closing-element]
   (.getChildren ^js jsx-closing-element))
  (^js [jsx-closing-element source-file]
   (.getChildren ^js jsx-closing-element source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [jsx-closing-element]
   (.getStart ^js jsx-closing-element))
  (^js [jsx-closing-element source-file]
   (.getStart ^js jsx-closing-element source-file))
  (^js [jsx-closing-element source-file include-js-doc-comment?]
   (.getStart ^js jsx-closing-element source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [jsx-closing-element]
  (.getFullStart ^js jsx-closing-element))

(defn get-end
  "**Returns:** `number`"
  ^js [jsx-closing-element]
  (.getEnd ^js jsx-closing-element))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [jsx-closing-element]
   (.getWidth ^js jsx-closing-element))
  (^js [jsx-closing-element source-file]
   (.getWidth ^js jsx-closing-element source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [jsx-closing-element]
  (.getFullWidth ^js jsx-closing-element))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [jsx-closing-element]
   (.getLeadingTriviaWidth ^js jsx-closing-element))
  (^js [jsx-closing-element source-file]
   (.getLeadingTriviaWidth ^js jsx-closing-element source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [jsx-closing-element]
   (.getFullText ^js jsx-closing-element))
  (^js [jsx-closing-element source-file]
   (.getFullText ^js jsx-closing-element source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [jsx-closing-element]
   (.getText ^js jsx-closing-element))
  (^js [jsx-closing-element source-file]
   (.getText ^js jsx-closing-element source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [jsx-closing-element]
   (.getFirstToken ^js jsx-closing-element))
  (^js [jsx-closing-element source-file]
   (.getFirstToken ^js jsx-closing-element source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [jsx-closing-element]
   (.getLastToken ^js jsx-closing-element))
  (^js [jsx-closing-element source-file]
   (.getLastToken ^js jsx-closing-element source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [jsx-closing-element cb-node]
   (.forEachChild ^js jsx-closing-element cb-node))
  (^js [jsx-closing-element cb-node cb-node-array]
   (.forEachChild ^js jsx-closing-element cb-node cb-node-array)))

(defn pos
  "**Returns:** `number`"
  ^js [jsx-closing-element]
  (.-pos ^js jsx-closing-element))

(defn end
  "**Returns:** `number`"
  ^js [jsx-closing-element]
  (.-end ^js jsx-closing-element))
