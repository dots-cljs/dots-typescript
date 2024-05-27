(ns dots.typescript.do-statement)

(defn kind
  "**Returns:** `SyntaxKind.DoStatement`"
  ^js [do-statement]
  (.-kind ^js do-statement))

(defn expression
  "**Returns:** `Expression`"
  ^js [do-statement]
  (.-expression ^js do-statement))

(defn statement
  "**Returns:** `Statement`"
  ^js [do-statement]
  (.-statement ^js do-statement))

(defn flags
  "**Returns:** `NodeFlags`"
  ^js [do-statement]
  (.-flags ^js do-statement))

(defn parent
  "**Returns:** `Node`"
  ^js [do-statement]
  (.-parent ^js do-statement))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [do-statement]
  (.getSourceFile ^js do-statement))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [do-statement]
   (.getChildCount ^js do-statement))
  (^js [do-statement source-file]
   (.getChildCount ^js do-statement source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [do-statement index]
   (.getChildAt ^js do-statement index))
  (^js [do-statement index source-file]
   (.getChildAt ^js do-statement index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [do-statement]
   (.getChildren ^js do-statement))
  (^js [do-statement source-file]
   (.getChildren ^js do-statement source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [do-statement]
   (.getStart ^js do-statement))
  (^js [do-statement source-file]
   (.getStart ^js do-statement source-file))
  (^js [do-statement source-file include-js-doc-comment?]
   (.getStart ^js do-statement source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [do-statement]
  (.getFullStart ^js do-statement))

(defn get-end
  "**Returns:** `number`"
  ^js [do-statement]
  (.getEnd ^js do-statement))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [do-statement]
   (.getWidth ^js do-statement))
  (^js [do-statement source-file]
   (.getWidth ^js do-statement source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [do-statement]
  (.getFullWidth ^js do-statement))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [do-statement]
   (.getLeadingTriviaWidth ^js do-statement))
  (^js [do-statement source-file]
   (.getLeadingTriviaWidth ^js do-statement source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [do-statement]
   (.getFullText ^js do-statement))
  (^js [do-statement source-file]
   (.getFullText ^js do-statement source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [do-statement]
   (.getText ^js do-statement))
  (^js [do-statement source-file]
   (.getText ^js do-statement source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [do-statement]
   (.getFirstToken ^js do-statement))
  (^js [do-statement source-file]
   (.getFirstToken ^js do-statement source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [do-statement]
   (.getLastToken ^js do-statement))
  (^js [do-statement source-file]
   (.getLastToken ^js do-statement source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [do-statement cb-node]
   (.forEachChild ^js do-statement cb-node))
  (^js [do-statement cb-node cb-node-array]
   (.forEachChild ^js do-statement cb-node cb-node-array)))

(defn pos
  "**Returns:** `number`"
  ^js [do-statement]
  (.-pos ^js do-statement))

(defn end
  "**Returns:** `number`"
  ^js [do-statement]
  (.-end ^js do-statement))
