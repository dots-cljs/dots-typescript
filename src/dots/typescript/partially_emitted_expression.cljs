(ns dots.typescript.partially-emitted-expression)

(defn kind
  "**Returns:** `SyntaxKind.PartiallyEmittedExpression`"
  ^js [partially-emitted-expression]
  (.-kind ^js partially-emitted-expression))

(defn expression
  "**Returns:** `Expression`"
  ^js [partially-emitted-expression]
  (.-expression ^js partially-emitted-expression))

(defn flags
  "**Returns:** `NodeFlags`"
  ^js [partially-emitted-expression]
  (.-flags ^js partially-emitted-expression))

(defn parent
  "**Returns:** `Node`"
  ^js [partially-emitted-expression]
  (.-parent ^js partially-emitted-expression))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [partially-emitted-expression]
  (.getSourceFile ^js partially-emitted-expression))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [partially-emitted-expression]
   (.getChildCount ^js partially-emitted-expression))
  (^js [partially-emitted-expression source-file]
   (.getChildCount ^js partially-emitted-expression source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [partially-emitted-expression index]
   (.getChildAt ^js partially-emitted-expression index))
  (^js [partially-emitted-expression index source-file]
   (.getChildAt ^js partially-emitted-expression index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [partially-emitted-expression]
   (.getChildren ^js partially-emitted-expression))
  (^js [partially-emitted-expression source-file]
   (.getChildren ^js partially-emitted-expression source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [partially-emitted-expression]
   (.getStart ^js partially-emitted-expression))
  (^js [partially-emitted-expression source-file]
   (.getStart ^js partially-emitted-expression source-file))
  (^js [partially-emitted-expression source-file include-js-doc-comment?]
   (.getStart ^js partially-emitted-expression source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [partially-emitted-expression]
  (.getFullStart ^js partially-emitted-expression))

(defn get-end
  "**Returns:** `number`"
  ^js [partially-emitted-expression]
  (.getEnd ^js partially-emitted-expression))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [partially-emitted-expression]
   (.getWidth ^js partially-emitted-expression))
  (^js [partially-emitted-expression source-file]
   (.getWidth ^js partially-emitted-expression source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [partially-emitted-expression]
  (.getFullWidth ^js partially-emitted-expression))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [partially-emitted-expression]
   (.getLeadingTriviaWidth ^js partially-emitted-expression))
  (^js [partially-emitted-expression source-file]
   (.getLeadingTriviaWidth ^js partially-emitted-expression source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [partially-emitted-expression]
   (.getFullText ^js partially-emitted-expression))
  (^js [partially-emitted-expression source-file]
   (.getFullText ^js partially-emitted-expression source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [partially-emitted-expression]
   (.getText ^js partially-emitted-expression))
  (^js [partially-emitted-expression source-file]
   (.getText ^js partially-emitted-expression source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [partially-emitted-expression]
   (.getFirstToken ^js partially-emitted-expression))
  (^js [partially-emitted-expression source-file]
   (.getFirstToken ^js partially-emitted-expression source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [partially-emitted-expression]
   (.getLastToken ^js partially-emitted-expression))
  (^js [partially-emitted-expression source-file]
   (.getLastToken ^js partially-emitted-expression source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [partially-emitted-expression cb-node]
   (.forEachChild ^js partially-emitted-expression cb-node))
  (^js [partially-emitted-expression cb-node cb-node-array]
   (.forEachChild ^js partially-emitted-expression cb-node cb-node-array)))

(defn pos
  "**Returns:** `number`"
  ^js [partially-emitted-expression]
  (.-pos ^js partially-emitted-expression))

(defn end
  "**Returns:** `number`"
  ^js [partially-emitted-expression]
  (.-end ^js partially-emitted-expression))
