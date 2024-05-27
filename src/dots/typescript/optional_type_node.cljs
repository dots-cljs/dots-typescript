(ns dots.typescript.optional-type-node
  (:refer-clojure :exclude [type]))

(defn kind
  "**Returns:** `SyntaxKind.OptionalType`"
  ^js [optional-type-node]
  (.-kind ^js optional-type-node))

(defn type
  "**Returns:** `TypeNode`"
  ^js [optional-type-node]
  (.-type ^js optional-type-node))

(defn flags
  "**Returns:** `NodeFlags`"
  ^js [optional-type-node]
  (.-flags ^js optional-type-node))

(defn parent
  "**Returns:** `Node`"
  ^js [optional-type-node]
  (.-parent ^js optional-type-node))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [optional-type-node]
  (.getSourceFile ^js optional-type-node))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [optional-type-node]
   (.getChildCount ^js optional-type-node))
  (^js [optional-type-node source-file]
   (.getChildCount ^js optional-type-node source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [optional-type-node index]
   (.getChildAt ^js optional-type-node index))
  (^js [optional-type-node index source-file]
   (.getChildAt ^js optional-type-node index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [optional-type-node]
   (.getChildren ^js optional-type-node))
  (^js [optional-type-node source-file]
   (.getChildren ^js optional-type-node source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [optional-type-node]
   (.getStart ^js optional-type-node))
  (^js [optional-type-node source-file]
   (.getStart ^js optional-type-node source-file))
  (^js [optional-type-node source-file include-js-doc-comment?]
   (.getStart ^js optional-type-node source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [optional-type-node]
  (.getFullStart ^js optional-type-node))

(defn get-end
  "**Returns:** `number`"
  ^js [optional-type-node]
  (.getEnd ^js optional-type-node))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [optional-type-node]
   (.getWidth ^js optional-type-node))
  (^js [optional-type-node source-file]
   (.getWidth ^js optional-type-node source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [optional-type-node]
  (.getFullWidth ^js optional-type-node))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [optional-type-node]
   (.getLeadingTriviaWidth ^js optional-type-node))
  (^js [optional-type-node source-file]
   (.getLeadingTriviaWidth ^js optional-type-node source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [optional-type-node]
   (.getFullText ^js optional-type-node))
  (^js [optional-type-node source-file]
   (.getFullText ^js optional-type-node source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [optional-type-node]
   (.getText ^js optional-type-node))
  (^js [optional-type-node source-file]
   (.getText ^js optional-type-node source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [optional-type-node]
   (.getFirstToken ^js optional-type-node))
  (^js [optional-type-node source-file]
   (.getFirstToken ^js optional-type-node source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [optional-type-node]
   (.getLastToken ^js optional-type-node))
  (^js [optional-type-node source-file]
   (.getLastToken ^js optional-type-node source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [optional-type-node cb-node]
   (.forEachChild ^js optional-type-node cb-node))
  (^js [optional-type-node cb-node cb-node-array]
   (.forEachChild ^js optional-type-node cb-node cb-node-array)))

(defn pos
  "**Returns:** `number`"
  ^js [optional-type-node]
  (.-pos ^js optional-type-node))

(defn end
  "**Returns:** `number`"
  ^js [optional-type-node]
  (.-end ^js optional-type-node))
