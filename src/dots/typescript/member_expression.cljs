(ns dots.typescript.member-expression)

(defn kind
  "**Returns:** `SyntaxKind`"
  ^js [member-expression]
  (.-kind ^js member-expression))

(defn flags
  "**Returns:** `NodeFlags`"
  ^js [member-expression]
  (.-flags ^js member-expression))

(defn parent
  "**Returns:** `Node`"
  ^js [member-expression]
  (.-parent ^js member-expression))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [member-expression]
  (.getSourceFile ^js member-expression))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [member-expression]
   (.getChildCount ^js member-expression))
  (^js [member-expression source-file]
   (.getChildCount ^js member-expression source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [member-expression index]
   (.getChildAt ^js member-expression index))
  (^js [member-expression index source-file]
   (.getChildAt ^js member-expression index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [member-expression]
   (.getChildren ^js member-expression))
  (^js [member-expression source-file]
   (.getChildren ^js member-expression source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [member-expression]
   (.getStart ^js member-expression))
  (^js [member-expression source-file]
   (.getStart ^js member-expression source-file))
  (^js [member-expression source-file include-js-doc-comment?]
   (.getStart ^js member-expression source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [member-expression]
  (.getFullStart ^js member-expression))

(defn get-end
  "**Returns:** `number`"
  ^js [member-expression]
  (.getEnd ^js member-expression))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [member-expression]
   (.getWidth ^js member-expression))
  (^js [member-expression source-file]
   (.getWidth ^js member-expression source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [member-expression]
  (.getFullWidth ^js member-expression))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [member-expression]
   (.getLeadingTriviaWidth ^js member-expression))
  (^js [member-expression source-file]
   (.getLeadingTriviaWidth ^js member-expression source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [member-expression]
   (.getFullText ^js member-expression))
  (^js [member-expression source-file]
   (.getFullText ^js member-expression source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [member-expression]
   (.getText ^js member-expression))
  (^js [member-expression source-file]
   (.getText ^js member-expression source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [member-expression]
   (.getFirstToken ^js member-expression))
  (^js [member-expression source-file]
   (.getFirstToken ^js member-expression source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [member-expression]
   (.getLastToken ^js member-expression))
  (^js [member-expression source-file]
   (.getLastToken ^js member-expression source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [member-expression cb-node]
   (.forEachChild ^js member-expression cb-node))
  (^js [member-expression cb-node cb-node-array]
   (.forEachChild ^js member-expression cb-node cb-node-array)))

(defn pos
  "**Returns:** `number`"
  ^js [member-expression]
  (.-pos ^js member-expression))

(defn end
  "**Returns:** `number`"
  ^js [member-expression]
  (.-end ^js member-expression))
