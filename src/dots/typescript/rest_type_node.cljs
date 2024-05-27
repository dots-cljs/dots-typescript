(ns dots.typescript.rest-type-node
  (:refer-clojure :exclude [type]))

(defn kind
  "**Returns:** `SyntaxKind.RestType`"
  ^js [rest-type-node]
  (.-kind ^js rest-type-node))

(defn type
  "**Returns:** `TypeNode`"
  ^js [rest-type-node]
  (.-type ^js rest-type-node))

(defn flags
  "**Returns:** `NodeFlags`"
  ^js [rest-type-node]
  (.-flags ^js rest-type-node))

(defn parent
  "**Returns:** `Node`"
  ^js [rest-type-node]
  (.-parent ^js rest-type-node))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [rest-type-node]
  (.getSourceFile ^js rest-type-node))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [rest-type-node]
   (.getChildCount ^js rest-type-node))
  (^js [rest-type-node source-file]
   (.getChildCount ^js rest-type-node source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [rest-type-node index]
   (.getChildAt ^js rest-type-node index))
  (^js [rest-type-node index source-file]
   (.getChildAt ^js rest-type-node index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [rest-type-node]
   (.getChildren ^js rest-type-node))
  (^js [rest-type-node source-file]
   (.getChildren ^js rest-type-node source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [rest-type-node]
   (.getStart ^js rest-type-node))
  (^js [rest-type-node source-file]
   (.getStart ^js rest-type-node source-file))
  (^js [rest-type-node source-file include-js-doc-comment?]
   (.getStart ^js rest-type-node source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [rest-type-node]
  (.getFullStart ^js rest-type-node))

(defn get-end
  "**Returns:** `number`"
  ^js [rest-type-node]
  (.getEnd ^js rest-type-node))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [rest-type-node]
   (.getWidth ^js rest-type-node))
  (^js [rest-type-node source-file]
   (.getWidth ^js rest-type-node source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [rest-type-node]
  (.getFullWidth ^js rest-type-node))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [rest-type-node]
   (.getLeadingTriviaWidth ^js rest-type-node))
  (^js [rest-type-node source-file]
   (.getLeadingTriviaWidth ^js rest-type-node source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [rest-type-node]
   (.getFullText ^js rest-type-node))
  (^js [rest-type-node source-file]
   (.getFullText ^js rest-type-node source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [rest-type-node]
   (.getText ^js rest-type-node))
  (^js [rest-type-node source-file]
   (.getText ^js rest-type-node source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [rest-type-node]
   (.getFirstToken ^js rest-type-node))
  (^js [rest-type-node source-file]
   (.getFirstToken ^js rest-type-node source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [rest-type-node]
   (.getLastToken ^js rest-type-node))
  (^js [rest-type-node source-file]
   (.getLastToken ^js rest-type-node source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [rest-type-node cb-node]
   (.forEachChild ^js rest-type-node cb-node))
  (^js [rest-type-node cb-node cb-node-array]
   (.forEachChild ^js rest-type-node cb-node cb-node-array)))

(defn pos
  "**Returns:** `number`"
  ^js [rest-type-node]
  (.-pos ^js rest-type-node))

(defn end
  "**Returns:** `number`"
  ^js [rest-type-node]
  (.-end ^js rest-type-node))
