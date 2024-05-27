(ns dots.typescript.js-doc-signature
  (:refer-clojure :exclude [type]))

(defn kind
  "**Returns:** `SyntaxKind.JSDocSignature`"
  ^js [js-doc-signature]
  (.-kind ^js js-doc-signature))

(defn type-parameters
  "**Returns:** `readonly JSDocTemplateTag[] | undefined`"
  ^js [js-doc-signature]
  (.-typeParameters ^js js-doc-signature))

(defn parameters
  "**Returns:** `readonly JSDocParameterTag[]`"
  ^js [js-doc-signature]
  (.-parameters ^js js-doc-signature))

(defn type
  "**Returns:** `JSDocReturnTag | undefined`"
  ^js [js-doc-signature]
  (.-type ^js js-doc-signature))

(defn flags
  "**Returns:** `NodeFlags`"
  ^js [js-doc-signature]
  (.-flags ^js js-doc-signature))

(defn parent
  "**Returns:** `Node`"
  ^js [js-doc-signature]
  (.-parent ^js js-doc-signature))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [js-doc-signature]
  (.getSourceFile ^js js-doc-signature))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [js-doc-signature]
   (.getChildCount ^js js-doc-signature))
  (^js [js-doc-signature source-file]
   (.getChildCount ^js js-doc-signature source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [js-doc-signature index]
   (.getChildAt ^js js-doc-signature index))
  (^js [js-doc-signature index source-file]
   (.getChildAt ^js js-doc-signature index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [js-doc-signature]
   (.getChildren ^js js-doc-signature))
  (^js [js-doc-signature source-file]
   (.getChildren ^js js-doc-signature source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [js-doc-signature]
   (.getStart ^js js-doc-signature))
  (^js [js-doc-signature source-file]
   (.getStart ^js js-doc-signature source-file))
  (^js [js-doc-signature source-file include-js-doc-comment?]
   (.getStart ^js js-doc-signature source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [js-doc-signature]
  (.getFullStart ^js js-doc-signature))

(defn get-end
  "**Returns:** `number`"
  ^js [js-doc-signature]
  (.getEnd ^js js-doc-signature))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [js-doc-signature]
   (.getWidth ^js js-doc-signature))
  (^js [js-doc-signature source-file]
   (.getWidth ^js js-doc-signature source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [js-doc-signature]
  (.getFullWidth ^js js-doc-signature))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [js-doc-signature]
   (.getLeadingTriviaWidth ^js js-doc-signature))
  (^js [js-doc-signature source-file]
   (.getLeadingTriviaWidth ^js js-doc-signature source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [js-doc-signature]
   (.getFullText ^js js-doc-signature))
  (^js [js-doc-signature source-file]
   (.getFullText ^js js-doc-signature source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [js-doc-signature]
   (.getText ^js js-doc-signature))
  (^js [js-doc-signature source-file]
   (.getText ^js js-doc-signature source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [js-doc-signature]
   (.getFirstToken ^js js-doc-signature))
  (^js [js-doc-signature source-file]
   (.getFirstToken ^js js-doc-signature source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [js-doc-signature]
   (.getLastToken ^js js-doc-signature))
  (^js [js-doc-signature source-file]
   (.getLastToken ^js js-doc-signature source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [js-doc-signature cb-node]
   (.forEachChild ^js js-doc-signature cb-node))
  (^js [js-doc-signature cb-node cb-node-array]
   (.forEachChild ^js js-doc-signature cb-node cb-node-array)))

(defn pos
  "**Returns:** `number`"
  ^js [js-doc-signature]
  (.-pos ^js js-doc-signature))

(defn end
  "**Returns:** `number`"
  ^js [js-doc-signature]
  (.-end ^js js-doc-signature))
