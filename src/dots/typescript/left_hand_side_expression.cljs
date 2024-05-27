(ns dots.typescript.left-hand-side-expression)

(defn kind
  "**Returns:** `SyntaxKind`"
  ^js [left-hand-side-expression]
  (.-kind ^js left-hand-side-expression))

(defn flags
  "**Returns:** `NodeFlags`"
  ^js [left-hand-side-expression]
  (.-flags ^js left-hand-side-expression))

(defn parent
  "**Returns:** `Node`"
  ^js [left-hand-side-expression]
  (.-parent ^js left-hand-side-expression))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [left-hand-side-expression]
  (.getSourceFile ^js left-hand-side-expression))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [left-hand-side-expression]
   (.getChildCount ^js left-hand-side-expression))
  (^js [left-hand-side-expression source-file]
   (.getChildCount ^js left-hand-side-expression source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [left-hand-side-expression index]
   (.getChildAt ^js left-hand-side-expression index))
  (^js [left-hand-side-expression index source-file]
   (.getChildAt ^js left-hand-side-expression index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [left-hand-side-expression]
   (.getChildren ^js left-hand-side-expression))
  (^js [left-hand-side-expression source-file]
   (.getChildren ^js left-hand-side-expression source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [left-hand-side-expression]
   (.getStart ^js left-hand-side-expression))
  (^js [left-hand-side-expression source-file]
   (.getStart ^js left-hand-side-expression source-file))
  (^js [left-hand-side-expression source-file include-js-doc-comment?]
   (.getStart ^js left-hand-side-expression source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [left-hand-side-expression]
  (.getFullStart ^js left-hand-side-expression))

(defn get-end
  "**Returns:** `number`"
  ^js [left-hand-side-expression]
  (.getEnd ^js left-hand-side-expression))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [left-hand-side-expression]
   (.getWidth ^js left-hand-side-expression))
  (^js [left-hand-side-expression source-file]
   (.getWidth ^js left-hand-side-expression source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [left-hand-side-expression]
  (.getFullWidth ^js left-hand-side-expression))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [left-hand-side-expression]
   (.getLeadingTriviaWidth ^js left-hand-side-expression))
  (^js [left-hand-side-expression source-file]
   (.getLeadingTriviaWidth ^js left-hand-side-expression source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [left-hand-side-expression]
   (.getFullText ^js left-hand-side-expression))
  (^js [left-hand-side-expression source-file]
   (.getFullText ^js left-hand-side-expression source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [left-hand-side-expression]
   (.getText ^js left-hand-side-expression))
  (^js [left-hand-side-expression source-file]
   (.getText ^js left-hand-side-expression source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [left-hand-side-expression]
   (.getFirstToken ^js left-hand-side-expression))
  (^js [left-hand-side-expression source-file]
   (.getFirstToken ^js left-hand-side-expression source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [left-hand-side-expression]
   (.getLastToken ^js left-hand-side-expression))
  (^js [left-hand-side-expression source-file]
   (.getLastToken ^js left-hand-side-expression source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [left-hand-side-expression cb-node]
   (.forEachChild ^js left-hand-side-expression cb-node))
  (^js [left-hand-side-expression cb-node cb-node-array]
   (.forEachChild ^js left-hand-side-expression cb-node cb-node-array)))

(defn pos
  "**Returns:** `number`"
  ^js [left-hand-side-expression]
  (.-pos ^js left-hand-side-expression))

(defn end
  "**Returns:** `number`"
  ^js [left-hand-side-expression]
  (.-end ^js left-hand-side-expression))
