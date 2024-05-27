(ns dots.typescript.jsx-element)

(defn kind
  "**Returns:** `SyntaxKind.JsxElement`"
  ^js [jsx-element]
  (.-kind ^js jsx-element))

(defn opening-element
  "**Returns:** `JsxOpeningElement`"
  ^js [jsx-element]
  (.-openingElement ^js jsx-element))

(defn children
  "**Returns:** `NodeArray<JsxChild>`"
  ^js [jsx-element]
  (.-children ^js jsx-element))

(defn closing-element
  "**Returns:** `JsxClosingElement`"
  ^js [jsx-element]
  (.-closingElement ^js jsx-element))

(defn flags
  "**Returns:** `NodeFlags`"
  ^js [jsx-element]
  (.-flags ^js jsx-element))

(defn parent
  "**Returns:** `Node`"
  ^js [jsx-element]
  (.-parent ^js jsx-element))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [jsx-element]
  (.getSourceFile ^js jsx-element))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [jsx-element]
   (.getChildCount ^js jsx-element))
  (^js [jsx-element source-file]
   (.getChildCount ^js jsx-element source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [jsx-element index]
   (.getChildAt ^js jsx-element index))
  (^js [jsx-element index source-file]
   (.getChildAt ^js jsx-element index source-file)))

(defn get-children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [jsx-element]
   (.getChildren ^js jsx-element))
  (^js [jsx-element source-file]
   (.getChildren ^js jsx-element source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [jsx-element]
   (.getStart ^js jsx-element))
  (^js [jsx-element source-file]
   (.getStart ^js jsx-element source-file))
  (^js [jsx-element source-file include-js-doc-comment?]
   (.getStart ^js jsx-element source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [jsx-element]
  (.getFullStart ^js jsx-element))

(defn get-end
  "**Returns:** `number`"
  ^js [jsx-element]
  (.getEnd ^js jsx-element))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [jsx-element]
   (.getWidth ^js jsx-element))
  (^js [jsx-element source-file]
   (.getWidth ^js jsx-element source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [jsx-element]
  (.getFullWidth ^js jsx-element))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [jsx-element]
   (.getLeadingTriviaWidth ^js jsx-element))
  (^js [jsx-element source-file]
   (.getLeadingTriviaWidth ^js jsx-element source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [jsx-element]
   (.getFullText ^js jsx-element))
  (^js [jsx-element source-file]
   (.getFullText ^js jsx-element source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [jsx-element]
   (.getText ^js jsx-element))
  (^js [jsx-element source-file]
   (.getText ^js jsx-element source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [jsx-element]
   (.getFirstToken ^js jsx-element))
  (^js [jsx-element source-file]
   (.getFirstToken ^js jsx-element source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [jsx-element]
   (.getLastToken ^js jsx-element))
  (^js [jsx-element source-file]
   (.getLastToken ^js jsx-element source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [jsx-element cb-node]
   (.forEachChild ^js jsx-element cb-node))
  (^js [jsx-element cb-node cb-node-array]
   (.forEachChild ^js jsx-element cb-node cb-node-array)))

(defn pos
  "**Returns:** `number`"
  ^js [jsx-element]
  (.-pos ^js jsx-element))

(defn end
  "**Returns:** `number`"
  ^js [jsx-element]
  (.-end ^js jsx-element))
