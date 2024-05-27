(ns dots.typescript.js-doc-optional-type
  (:refer-clojure :exclude [type]))

(defn kind
  "**Returns:** `SyntaxKind.JSDocOptionalType`"
  ^js [js-doc-optional-type]
  (.-kind ^js js-doc-optional-type))

(defn type
  "**Returns:** `TypeNode`"
  ^js [js-doc-optional-type]
  (.-type ^js js-doc-optional-type))

(defn flags
  "**Returns:** `NodeFlags`"
  ^js [js-doc-optional-type]
  (.-flags ^js js-doc-optional-type))

(defn parent
  "**Returns:** `Node`"
  ^js [js-doc-optional-type]
  (.-parent ^js js-doc-optional-type))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [js-doc-optional-type]
  (.getSourceFile ^js js-doc-optional-type))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [js-doc-optional-type]
   (.getChildCount ^js js-doc-optional-type))
  (^js [js-doc-optional-type source-file]
   (.getChildCount ^js js-doc-optional-type source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [js-doc-optional-type index]
   (.getChildAt ^js js-doc-optional-type index))
  (^js [js-doc-optional-type index source-file]
   (.getChildAt ^js js-doc-optional-type index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [js-doc-optional-type]
   (.getChildren ^js js-doc-optional-type))
  (^js [js-doc-optional-type source-file]
   (.getChildren ^js js-doc-optional-type source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [js-doc-optional-type]
   (.getStart ^js js-doc-optional-type))
  (^js [js-doc-optional-type source-file]
   (.getStart ^js js-doc-optional-type source-file))
  (^js [js-doc-optional-type source-file include-js-doc-comment?]
   (.getStart ^js js-doc-optional-type source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [js-doc-optional-type]
  (.getFullStart ^js js-doc-optional-type))

(defn get-end
  "**Returns:** `number`"
  ^js [js-doc-optional-type]
  (.getEnd ^js js-doc-optional-type))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [js-doc-optional-type]
   (.getWidth ^js js-doc-optional-type))
  (^js [js-doc-optional-type source-file]
   (.getWidth ^js js-doc-optional-type source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [js-doc-optional-type]
  (.getFullWidth ^js js-doc-optional-type))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [js-doc-optional-type]
   (.getLeadingTriviaWidth ^js js-doc-optional-type))
  (^js [js-doc-optional-type source-file]
   (.getLeadingTriviaWidth ^js js-doc-optional-type source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [js-doc-optional-type]
   (.getFullText ^js js-doc-optional-type))
  (^js [js-doc-optional-type source-file]
   (.getFullText ^js js-doc-optional-type source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [js-doc-optional-type]
   (.getText ^js js-doc-optional-type))
  (^js [js-doc-optional-type source-file]
   (.getText ^js js-doc-optional-type source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [js-doc-optional-type]
   (.getFirstToken ^js js-doc-optional-type))
  (^js [js-doc-optional-type source-file]
   (.getFirstToken ^js js-doc-optional-type source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [js-doc-optional-type]
   (.getLastToken ^js js-doc-optional-type))
  (^js [js-doc-optional-type source-file]
   (.getLastToken ^js js-doc-optional-type source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [js-doc-optional-type cb-node]
   (.forEachChild ^js js-doc-optional-type cb-node))
  (^js [js-doc-optional-type cb-node cb-node-array]
   (.forEachChild ^js js-doc-optional-type cb-node cb-node-array)))

(defn pos
  "**Returns:** `number`"
  ^js [js-doc-optional-type]
  (.-pos ^js js-doc-optional-type))

(defn end
  "**Returns:** `number`"
  ^js [js-doc-optional-type]
  (.-end ^js js-doc-optional-type))
