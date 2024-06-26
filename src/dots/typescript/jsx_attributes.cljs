(ns dots.typescript.jsx-attributes)

(defn properties
  "**Returns:** `NodeArray<JsxAttributeLike>`"
  ^js [jsx-attributes]
  (.-properties ^js jsx-attributes))

(defn kind
  "**Returns:** `SyntaxKind.JsxAttributes`"
  ^js [jsx-attributes]
  (.-kind ^js jsx-attributes))

(defn parent
  "**Returns:** `JsxOpeningLikeElement`"
  ^js [jsx-attributes]
  (.-parent ^js jsx-attributes))

(defn flags
  "**Returns:** `NodeFlags`"
  ^js [jsx-attributes]
  (.-flags ^js jsx-attributes))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [jsx-attributes]
  (.getSourceFile ^js jsx-attributes))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [jsx-attributes]
   (.getChildCount ^js jsx-attributes))
  (^js [jsx-attributes source-file]
   (.getChildCount ^js jsx-attributes source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [jsx-attributes index]
   (.getChildAt ^js jsx-attributes index))
  (^js [jsx-attributes index source-file]
   (.getChildAt ^js jsx-attributes index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [jsx-attributes]
   (.getChildren ^js jsx-attributes))
  (^js [jsx-attributes source-file]
   (.getChildren ^js jsx-attributes source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [jsx-attributes]
   (.getStart ^js jsx-attributes))
  (^js [jsx-attributes source-file]
   (.getStart ^js jsx-attributes source-file))
  (^js [jsx-attributes source-file include-js-doc-comment?]
   (.getStart ^js jsx-attributes source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [jsx-attributes]
  (.getFullStart ^js jsx-attributes))

(defn get-end
  "**Returns:** `number`"
  ^js [jsx-attributes]
  (.getEnd ^js jsx-attributes))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [jsx-attributes]
   (.getWidth ^js jsx-attributes))
  (^js [jsx-attributes source-file]
   (.getWidth ^js jsx-attributes source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [jsx-attributes]
  (.getFullWidth ^js jsx-attributes))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [jsx-attributes]
   (.getLeadingTriviaWidth ^js jsx-attributes))
  (^js [jsx-attributes source-file]
   (.getLeadingTriviaWidth ^js jsx-attributes source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [jsx-attributes]
   (.getFullText ^js jsx-attributes))
  (^js [jsx-attributes source-file]
   (.getFullText ^js jsx-attributes source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [jsx-attributes]
   (.getText ^js jsx-attributes))
  (^js [jsx-attributes source-file]
   (.getText ^js jsx-attributes source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [jsx-attributes]
   (.getFirstToken ^js jsx-attributes))
  (^js [jsx-attributes source-file]
   (.getFirstToken ^js jsx-attributes source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [jsx-attributes]
   (.getLastToken ^js jsx-attributes))
  (^js [jsx-attributes source-file]
   (.getLastToken ^js jsx-attributes source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [jsx-attributes cb-node]
   (.forEachChild ^js jsx-attributes cb-node))
  (^js [jsx-attributes cb-node cb-node-array]
   (.forEachChild ^js jsx-attributes cb-node cb-node-array)))

(defn pos
  "**Returns:** `number`"
  ^js [jsx-attributes]
  (.-pos ^js jsx-attributes))

(defn end
  "**Returns:** `number`"
  ^js [jsx-attributes]
  (.-end ^js jsx-attributes))
