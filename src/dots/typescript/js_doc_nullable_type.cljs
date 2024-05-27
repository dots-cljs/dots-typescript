(ns dots.typescript.js-doc-nullable-type
  (:refer-clojure :exclude [type]))

(defn kind
  "**Returns:** `SyntaxKind.JSDocNullableType`"
  ^js [js-doc-nullable-type]
  (.-kind ^js js-doc-nullable-type))

(defn type
  "**Returns:** `TypeNode`"
  ^js [js-doc-nullable-type]
  (.-type ^js js-doc-nullable-type))

(defn postfix?
  "**Returns:** `boolean`"
  ^js [js-doc-nullable-type]
  (.-postfix ^js js-doc-nullable-type))

(defn flags
  "**Returns:** `NodeFlags`"
  ^js [js-doc-nullable-type]
  (.-flags ^js js-doc-nullable-type))

(defn parent
  "**Returns:** `Node`"
  ^js [js-doc-nullable-type]
  (.-parent ^js js-doc-nullable-type))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [js-doc-nullable-type]
  (.getSourceFile ^js js-doc-nullable-type))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [js-doc-nullable-type]
   (.getChildCount ^js js-doc-nullable-type))
  (^js [js-doc-nullable-type source-file]
   (.getChildCount ^js js-doc-nullable-type source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [js-doc-nullable-type index]
   (.getChildAt ^js js-doc-nullable-type index))
  (^js [js-doc-nullable-type index source-file]
   (.getChildAt ^js js-doc-nullable-type index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [js-doc-nullable-type]
   (.getChildren ^js js-doc-nullable-type))
  (^js [js-doc-nullable-type source-file]
   (.getChildren ^js js-doc-nullable-type source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [js-doc-nullable-type]
   (.getStart ^js js-doc-nullable-type))
  (^js [js-doc-nullable-type source-file]
   (.getStart ^js js-doc-nullable-type source-file))
  (^js [js-doc-nullable-type source-file include-js-doc-comment?]
   (.getStart ^js js-doc-nullable-type source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [js-doc-nullable-type]
  (.getFullStart ^js js-doc-nullable-type))

(defn get-end
  "**Returns:** `number`"
  ^js [js-doc-nullable-type]
  (.getEnd ^js js-doc-nullable-type))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [js-doc-nullable-type]
   (.getWidth ^js js-doc-nullable-type))
  (^js [js-doc-nullable-type source-file]
   (.getWidth ^js js-doc-nullable-type source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [js-doc-nullable-type]
  (.getFullWidth ^js js-doc-nullable-type))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [js-doc-nullable-type]
   (.getLeadingTriviaWidth ^js js-doc-nullable-type))
  (^js [js-doc-nullable-type source-file]
   (.getLeadingTriviaWidth ^js js-doc-nullable-type source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [js-doc-nullable-type]
   (.getFullText ^js js-doc-nullable-type))
  (^js [js-doc-nullable-type source-file]
   (.getFullText ^js js-doc-nullable-type source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [js-doc-nullable-type]
   (.getText ^js js-doc-nullable-type))
  (^js [js-doc-nullable-type source-file]
   (.getText ^js js-doc-nullable-type source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [js-doc-nullable-type]
   (.getFirstToken ^js js-doc-nullable-type))
  (^js [js-doc-nullable-type source-file]
   (.getFirstToken ^js js-doc-nullable-type source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [js-doc-nullable-type]
   (.getLastToken ^js js-doc-nullable-type))
  (^js [js-doc-nullable-type source-file]
   (.getLastToken ^js js-doc-nullable-type source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [js-doc-nullable-type cb-node]
   (.forEachChild ^js js-doc-nullable-type cb-node))
  (^js [js-doc-nullable-type cb-node cb-node-array]
   (.forEachChild ^js js-doc-nullable-type cb-node cb-node-array)))

(defn pos
  "**Returns:** `number`"
  ^js [js-doc-nullable-type]
  (.-pos ^js js-doc-nullable-type))

(defn end
  "**Returns:** `number`"
  ^js [js-doc-nullable-type]
  (.-end ^js js-doc-nullable-type))
