(ns dots.typescript.non-null-expression)

(defn kind
  "**Returns:** `SyntaxKind.NonNullExpression`"
  ^js [non-null-expression]
  (.-kind ^js non-null-expression))

(defn expression
  "**Returns:** `Expression`"
  ^js [non-null-expression]
  (.-expression ^js non-null-expression))

(defn flags
  "**Returns:** `NodeFlags`"
  ^js [non-null-expression]
  (.-flags ^js non-null-expression))

(defn parent
  "**Returns:** `Node`"
  ^js [non-null-expression]
  (.-parent ^js non-null-expression))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [non-null-expression]
  (.getSourceFile ^js non-null-expression))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [non-null-expression]
   (.getChildCount ^js non-null-expression))
  (^js [non-null-expression source-file]
   (.getChildCount ^js non-null-expression source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [non-null-expression index]
   (.getChildAt ^js non-null-expression index))
  (^js [non-null-expression index source-file]
   (.getChildAt ^js non-null-expression index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [non-null-expression]
   (.getChildren ^js non-null-expression))
  (^js [non-null-expression source-file]
   (.getChildren ^js non-null-expression source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [non-null-expression]
   (.getStart ^js non-null-expression))
  (^js [non-null-expression source-file]
   (.getStart ^js non-null-expression source-file))
  (^js [non-null-expression source-file include-js-doc-comment?]
   (.getStart ^js non-null-expression source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [non-null-expression]
  (.getFullStart ^js non-null-expression))

(defn get-end
  "**Returns:** `number`"
  ^js [non-null-expression]
  (.getEnd ^js non-null-expression))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [non-null-expression]
   (.getWidth ^js non-null-expression))
  (^js [non-null-expression source-file]
   (.getWidth ^js non-null-expression source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [non-null-expression]
  (.getFullWidth ^js non-null-expression))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [non-null-expression]
   (.getLeadingTriviaWidth ^js non-null-expression))
  (^js [non-null-expression source-file]
   (.getLeadingTriviaWidth ^js non-null-expression source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [non-null-expression]
   (.getFullText ^js non-null-expression))
  (^js [non-null-expression source-file]
   (.getFullText ^js non-null-expression source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [non-null-expression]
   (.getText ^js non-null-expression))
  (^js [non-null-expression source-file]
   (.getText ^js non-null-expression source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [non-null-expression]
   (.getFirstToken ^js non-null-expression))
  (^js [non-null-expression source-file]
   (.getFirstToken ^js non-null-expression source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [non-null-expression]
   (.getLastToken ^js non-null-expression))
  (^js [non-null-expression source-file]
   (.getLastToken ^js non-null-expression source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [non-null-expression cb-node]
   (.forEachChild ^js non-null-expression cb-node))
  (^js [non-null-expression cb-node cb-node-array]
   (.forEachChild ^js non-null-expression cb-node cb-node-array)))

(defn pos
  "**Returns:** `number`"
  ^js [non-null-expression]
  (.-pos ^js non-null-expression))

(defn end
  "**Returns:** `number`"
  ^js [non-null-expression]
  (.-end ^js non-null-expression))
