(ns dots.typescript.js-doc-name-reference
  (:refer-clojure :exclude [name]))

(defn kind
  "**Returns:** `SyntaxKind.JSDocNameReference`"
  ^js [js-doc-name-reference]
  (.-kind ^js js-doc-name-reference))

(defn name
  "**Returns:** `EntityName | JSDocMemberName`"
  ^js [js-doc-name-reference]
  (.-name ^js js-doc-name-reference))

(defn flags
  "**Returns:** `NodeFlags`"
  ^js [js-doc-name-reference]
  (.-flags ^js js-doc-name-reference))

(defn parent
  "**Returns:** `Node`"
  ^js [js-doc-name-reference]
  (.-parent ^js js-doc-name-reference))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [js-doc-name-reference]
  (.getSourceFile ^js js-doc-name-reference))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [js-doc-name-reference]
   (.getChildCount ^js js-doc-name-reference))
  (^js [js-doc-name-reference source-file]
   (.getChildCount ^js js-doc-name-reference source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [js-doc-name-reference index]
   (.getChildAt ^js js-doc-name-reference index))
  (^js [js-doc-name-reference index source-file]
   (.getChildAt ^js js-doc-name-reference index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [js-doc-name-reference]
   (.getChildren ^js js-doc-name-reference))
  (^js [js-doc-name-reference source-file]
   (.getChildren ^js js-doc-name-reference source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [js-doc-name-reference]
   (.getStart ^js js-doc-name-reference))
  (^js [js-doc-name-reference source-file]
   (.getStart ^js js-doc-name-reference source-file))
  (^js [js-doc-name-reference source-file include-js-doc-comment?]
   (.getStart ^js js-doc-name-reference source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [js-doc-name-reference]
  (.getFullStart ^js js-doc-name-reference))

(defn get-end
  "**Returns:** `number`"
  ^js [js-doc-name-reference]
  (.getEnd ^js js-doc-name-reference))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [js-doc-name-reference]
   (.getWidth ^js js-doc-name-reference))
  (^js [js-doc-name-reference source-file]
   (.getWidth ^js js-doc-name-reference source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [js-doc-name-reference]
  (.getFullWidth ^js js-doc-name-reference))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [js-doc-name-reference]
   (.getLeadingTriviaWidth ^js js-doc-name-reference))
  (^js [js-doc-name-reference source-file]
   (.getLeadingTriviaWidth ^js js-doc-name-reference source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [js-doc-name-reference]
   (.getFullText ^js js-doc-name-reference))
  (^js [js-doc-name-reference source-file]
   (.getFullText ^js js-doc-name-reference source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [js-doc-name-reference]
   (.getText ^js js-doc-name-reference))
  (^js [js-doc-name-reference source-file]
   (.getText ^js js-doc-name-reference source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [js-doc-name-reference]
   (.getFirstToken ^js js-doc-name-reference))
  (^js [js-doc-name-reference source-file]
   (.getFirstToken ^js js-doc-name-reference source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [js-doc-name-reference]
   (.getLastToken ^js js-doc-name-reference))
  (^js [js-doc-name-reference source-file]
   (.getLastToken ^js js-doc-name-reference source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [js-doc-name-reference cb-node]
   (.forEachChild ^js js-doc-name-reference cb-node))
  (^js [js-doc-name-reference cb-node cb-node-array]
   (.forEachChild ^js js-doc-name-reference cb-node cb-node-array)))

(defn pos
  "**Returns:** `number`"
  ^js [js-doc-name-reference]
  (.-pos ^js js-doc-name-reference))

(defn end
  "**Returns:** `number`"
  ^js [js-doc-name-reference]
  (.-end ^js js-doc-name-reference))
