(ns dots.typescript.js-doc-function-type
  (:refer-clojure :exclude [name type]))

(defn kind
  "**Returns:** `SyntaxKind.JSDocFunctionType`"
  ^js [js-doc-function-type]
  (.-kind ^js js-doc-function-type))

(defn flags
  "**Returns:** `NodeFlags`"
  ^js [js-doc-function-type]
  (.-flags ^js js-doc-function-type))

(defn parent
  "**Returns:** `Node`"
  ^js [js-doc-function-type]
  (.-parent ^js js-doc-function-type))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [js-doc-function-type]
  (.getSourceFile ^js js-doc-function-type))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [js-doc-function-type]
   (.getChildCount ^js js-doc-function-type))
  (^js [js-doc-function-type source-file]
   (.getChildCount ^js js-doc-function-type source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [js-doc-function-type index]
   (.getChildAt ^js js-doc-function-type index))
  (^js [js-doc-function-type index source-file]
   (.getChildAt ^js js-doc-function-type index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [js-doc-function-type]
   (.getChildren ^js js-doc-function-type))
  (^js [js-doc-function-type source-file]
   (.getChildren ^js js-doc-function-type source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [js-doc-function-type]
   (.getStart ^js js-doc-function-type))
  (^js [js-doc-function-type source-file]
   (.getStart ^js js-doc-function-type source-file))
  (^js [js-doc-function-type source-file include-js-doc-comment?]
   (.getStart ^js js-doc-function-type source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [js-doc-function-type]
  (.getFullStart ^js js-doc-function-type))

(defn get-end
  "**Returns:** `number`"
  ^js [js-doc-function-type]
  (.getEnd ^js js-doc-function-type))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [js-doc-function-type]
   (.getWidth ^js js-doc-function-type))
  (^js [js-doc-function-type source-file]
   (.getWidth ^js js-doc-function-type source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [js-doc-function-type]
  (.getFullWidth ^js js-doc-function-type))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [js-doc-function-type]
   (.getLeadingTriviaWidth ^js js-doc-function-type))
  (^js [js-doc-function-type source-file]
   (.getLeadingTriviaWidth ^js js-doc-function-type source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [js-doc-function-type]
   (.getFullText ^js js-doc-function-type))
  (^js [js-doc-function-type source-file]
   (.getFullText ^js js-doc-function-type source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [js-doc-function-type]
   (.getText ^js js-doc-function-type))
  (^js [js-doc-function-type source-file]
   (.getText ^js js-doc-function-type source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [js-doc-function-type]
   (.getFirstToken ^js js-doc-function-type))
  (^js [js-doc-function-type source-file]
   (.getFirstToken ^js js-doc-function-type source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [js-doc-function-type]
   (.getLastToken ^js js-doc-function-type))
  (^js [js-doc-function-type source-file]
   (.getLastToken ^js js-doc-function-type source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [js-doc-function-type cb-node]
   (.forEachChild ^js js-doc-function-type cb-node))
  (^js [js-doc-function-type cb-node cb-node-array]
   (.forEachChild ^js js-doc-function-type cb-node cb-node-array)))

(defn pos
  "**Returns:** `number`"
  ^js [js-doc-function-type]
  (.-pos ^js js-doc-function-type))

(defn end
  "**Returns:** `number`"
  ^js [js-doc-function-type]
  (.-end ^js js-doc-function-type))

(defn name
  "**Returns:** `PropertyName | undefined`"
  ^js [js-doc-function-type]
  (.-name ^js js-doc-function-type))

(defn type-parameters
  "**Returns:** `NodeArray<TypeParameterDeclaration> | undefined`"
  ^js [js-doc-function-type]
  (.-typeParameters ^js js-doc-function-type))

(defn parameters
  "**Returns:** `NodeArray<ParameterDeclaration>`"
  ^js [js-doc-function-type]
  (.-parameters ^js js-doc-function-type))

(defn type
  "**Returns:** `TypeNode | undefined`"
  ^js [js-doc-function-type]
  (.-type ^js js-doc-function-type))
