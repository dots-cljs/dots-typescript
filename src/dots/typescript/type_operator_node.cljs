(ns dots.typescript.type-operator-node
  (:refer-clojure :exclude [type]))

(defn kind
  "**Returns:** `SyntaxKind.TypeOperator`"
  ^js [type-operator-node]
  (.-kind ^js type-operator-node))

(defn operator
  "**Returns:** `SyntaxKind.KeyOfKeyword | SyntaxKind.ReadonlyKeyword | SyntaxKind.UniqueKeyword`"
  ^js [type-operator-node]
  (.-operator ^js type-operator-node))

(defn type
  "**Returns:** `TypeNode`"
  ^js [type-operator-node]
  (.-type ^js type-operator-node))

(defn flags
  "**Returns:** `NodeFlags`"
  ^js [type-operator-node]
  (.-flags ^js type-operator-node))

(defn parent
  "**Returns:** `Node`"
  ^js [type-operator-node]
  (.-parent ^js type-operator-node))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [type-operator-node]
  (.getSourceFile ^js type-operator-node))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [type-operator-node]
   (.getChildCount ^js type-operator-node))
  (^js [type-operator-node source-file]
   (.getChildCount ^js type-operator-node source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [type-operator-node index]
   (.getChildAt ^js type-operator-node index))
  (^js [type-operator-node index source-file]
   (.getChildAt ^js type-operator-node index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [type-operator-node]
   (.getChildren ^js type-operator-node))
  (^js [type-operator-node source-file]
   (.getChildren ^js type-operator-node source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [type-operator-node]
   (.getStart ^js type-operator-node))
  (^js [type-operator-node source-file]
   (.getStart ^js type-operator-node source-file))
  (^js [type-operator-node source-file include-js-doc-comment?]
   (.getStart ^js type-operator-node source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [type-operator-node]
  (.getFullStart ^js type-operator-node))

(defn get-end
  "**Returns:** `number`"
  ^js [type-operator-node]
  (.getEnd ^js type-operator-node))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [type-operator-node]
   (.getWidth ^js type-operator-node))
  (^js [type-operator-node source-file]
   (.getWidth ^js type-operator-node source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [type-operator-node]
  (.getFullWidth ^js type-operator-node))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [type-operator-node]
   (.getLeadingTriviaWidth ^js type-operator-node))
  (^js [type-operator-node source-file]
   (.getLeadingTriviaWidth ^js type-operator-node source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [type-operator-node]
   (.getFullText ^js type-operator-node))
  (^js [type-operator-node source-file]
   (.getFullText ^js type-operator-node source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [type-operator-node]
   (.getText ^js type-operator-node))
  (^js [type-operator-node source-file]
   (.getText ^js type-operator-node source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [type-operator-node]
   (.getFirstToken ^js type-operator-node))
  (^js [type-operator-node source-file]
   (.getFirstToken ^js type-operator-node source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [type-operator-node]
   (.getLastToken ^js type-operator-node))
  (^js [type-operator-node source-file]
   (.getLastToken ^js type-operator-node source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [type-operator-node cb-node]
   (.forEachChild ^js type-operator-node cb-node))
  (^js [type-operator-node cb-node cb-node-array]
   (.forEachChild ^js type-operator-node cb-node cb-node-array)))

(defn pos
  "**Returns:** `number`"
  ^js [type-operator-node]
  (.-pos ^js type-operator-node))

(defn end
  "**Returns:** `number`"
  ^js [type-operator-node]
  (.-end ^js type-operator-node))
