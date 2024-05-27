(ns dots.typescript.parenthesized-expression)

(defn kind
  "**Returns:** `SyntaxKind.ParenthesizedExpression`"
  ^js [parenthesized-expression]
  (.-kind ^js parenthesized-expression))

(defn expression
  "**Returns:** `Expression`"
  ^js [parenthesized-expression]
  (.-expression ^js parenthesized-expression))

(defn flags
  "**Returns:** `NodeFlags`"
  ^js [parenthesized-expression]
  (.-flags ^js parenthesized-expression))

(defn parent
  "**Returns:** `Node`"
  ^js [parenthesized-expression]
  (.-parent ^js parenthesized-expression))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [parenthesized-expression]
  (.getSourceFile ^js parenthesized-expression))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [parenthesized-expression]
   (.getChildCount ^js parenthesized-expression))
  (^js [parenthesized-expression source-file]
   (.getChildCount ^js parenthesized-expression source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [parenthesized-expression index]
   (.getChildAt ^js parenthesized-expression index))
  (^js [parenthesized-expression index source-file]
   (.getChildAt ^js parenthesized-expression index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [parenthesized-expression]
   (.getChildren ^js parenthesized-expression))
  (^js [parenthesized-expression source-file]
   (.getChildren ^js parenthesized-expression source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [parenthesized-expression]
   (.getStart ^js parenthesized-expression))
  (^js [parenthesized-expression source-file]
   (.getStart ^js parenthesized-expression source-file))
  (^js [parenthesized-expression source-file include-js-doc-comment?]
   (.getStart ^js parenthesized-expression source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [parenthesized-expression]
  (.getFullStart ^js parenthesized-expression))

(defn get-end
  "**Returns:** `number`"
  ^js [parenthesized-expression]
  (.getEnd ^js parenthesized-expression))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [parenthesized-expression]
   (.getWidth ^js parenthesized-expression))
  (^js [parenthesized-expression source-file]
   (.getWidth ^js parenthesized-expression source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [parenthesized-expression]
  (.getFullWidth ^js parenthesized-expression))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [parenthesized-expression]
   (.getLeadingTriviaWidth ^js parenthesized-expression))
  (^js [parenthesized-expression source-file]
   (.getLeadingTriviaWidth ^js parenthesized-expression source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [parenthesized-expression]
   (.getFullText ^js parenthesized-expression))
  (^js [parenthesized-expression source-file]
   (.getFullText ^js parenthesized-expression source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [parenthesized-expression]
   (.getText ^js parenthesized-expression))
  (^js [parenthesized-expression source-file]
   (.getText ^js parenthesized-expression source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [parenthesized-expression]
   (.getFirstToken ^js parenthesized-expression))
  (^js [parenthesized-expression source-file]
   (.getFirstToken ^js parenthesized-expression source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [parenthesized-expression]
   (.getLastToken ^js parenthesized-expression))
  (^js [parenthesized-expression source-file]
   (.getLastToken ^js parenthesized-expression source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [parenthesized-expression cb-node]
   (.forEachChild ^js parenthesized-expression cb-node))
  (^js [parenthesized-expression cb-node cb-node-array]
   (.forEachChild ^js parenthesized-expression cb-node cb-node-array)))

(defn pos
  "**Returns:** `number`"
  ^js [parenthesized-expression]
  (.-pos ^js parenthesized-expression))

(defn end
  "**Returns:** `number`"
  ^js [parenthesized-expression]
  (.-end ^js parenthesized-expression))
