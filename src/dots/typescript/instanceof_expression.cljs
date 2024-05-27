(ns dots.typescript.instanceof-expression)

(defn operator-token
  "**Returns:** `Token<SyntaxKind.InstanceOfKeyword>`"
  ^js [instanceof-expression]
  (.-operatorToken ^js instanceof-expression))

(defn kind
  "**Returns:** `SyntaxKind.BinaryExpression`"
  ^js [instanceof-expression]
  (.-kind ^js instanceof-expression))

(defn left
  "**Returns:** `Expression`"
  ^js [instanceof-expression]
  (.-left ^js instanceof-expression))

(defn right
  "**Returns:** `Expression`"
  ^js [instanceof-expression]
  (.-right ^js instanceof-expression))

(defn flags
  "**Returns:** `NodeFlags`"
  ^js [instanceof-expression]
  (.-flags ^js instanceof-expression))

(defn parent
  "**Returns:** `Node`"
  ^js [instanceof-expression]
  (.-parent ^js instanceof-expression))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [instanceof-expression]
  (.getSourceFile ^js instanceof-expression))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [instanceof-expression]
   (.getChildCount ^js instanceof-expression))
  (^js [instanceof-expression source-file]
   (.getChildCount ^js instanceof-expression source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [instanceof-expression index]
   (.getChildAt ^js instanceof-expression index))
  (^js [instanceof-expression index source-file]
   (.getChildAt ^js instanceof-expression index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [instanceof-expression]
   (.getChildren ^js instanceof-expression))
  (^js [instanceof-expression source-file]
   (.getChildren ^js instanceof-expression source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [instanceof-expression]
   (.getStart ^js instanceof-expression))
  (^js [instanceof-expression source-file]
   (.getStart ^js instanceof-expression source-file))
  (^js [instanceof-expression source-file include-js-doc-comment?]
   (.getStart ^js instanceof-expression source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [instanceof-expression]
  (.getFullStart ^js instanceof-expression))

(defn get-end
  "**Returns:** `number`"
  ^js [instanceof-expression]
  (.getEnd ^js instanceof-expression))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [instanceof-expression]
   (.getWidth ^js instanceof-expression))
  (^js [instanceof-expression source-file]
   (.getWidth ^js instanceof-expression source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [instanceof-expression]
  (.getFullWidth ^js instanceof-expression))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [instanceof-expression]
   (.getLeadingTriviaWidth ^js instanceof-expression))
  (^js [instanceof-expression source-file]
   (.getLeadingTriviaWidth ^js instanceof-expression source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [instanceof-expression]
   (.getFullText ^js instanceof-expression))
  (^js [instanceof-expression source-file]
   (.getFullText ^js instanceof-expression source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [instanceof-expression]
   (.getText ^js instanceof-expression))
  (^js [instanceof-expression source-file]
   (.getText ^js instanceof-expression source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [instanceof-expression]
   (.getFirstToken ^js instanceof-expression))
  (^js [instanceof-expression source-file]
   (.getFirstToken ^js instanceof-expression source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [instanceof-expression]
   (.getLastToken ^js instanceof-expression))
  (^js [instanceof-expression source-file]
   (.getLastToken ^js instanceof-expression source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [instanceof-expression cb-node]
   (.forEachChild ^js instanceof-expression cb-node))
  (^js [instanceof-expression cb-node cb-node-array]
   (.forEachChild ^js instanceof-expression cb-node cb-node-array)))

(defn pos
  "**Returns:** `number`"
  ^js [instanceof-expression]
  (.-pos ^js instanceof-expression))

(defn end
  "**Returns:** `number`"
  ^js [instanceof-expression]
  (.-end ^js instanceof-expression))
