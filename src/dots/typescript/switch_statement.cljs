(ns dots.typescript.switch-statement)

(defn kind
  "**Returns:** `SyntaxKind.SwitchStatement`"
  ^js [switch-statement]
  (.-kind ^js switch-statement))

(defn expression
  "**Returns:** `Expression`"
  ^js [switch-statement]
  (.-expression ^js switch-statement))

(defn case-block
  "**Returns:** `CaseBlock`"
  ^js [switch-statement]
  (.-caseBlock ^js switch-statement))

(defn possibly-exhaustive?
  "**Returns:** `boolean | undefined`"
  ^js [switch-statement]
  (.-possiblyExhaustive ^js switch-statement))

(defn set-possibly-exhaustive!
  ^js [switch-statement value]
  (set! (.-possiblyExhaustive ^js switch-statement) value))

(defn flags
  "**Returns:** `NodeFlags`"
  ^js [switch-statement]
  (.-flags ^js switch-statement))

(defn parent
  "**Returns:** `Node`"
  ^js [switch-statement]
  (.-parent ^js switch-statement))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [switch-statement]
  (.getSourceFile ^js switch-statement))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [switch-statement]
   (.getChildCount ^js switch-statement))
  (^js [switch-statement source-file]
   (.getChildCount ^js switch-statement source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [switch-statement index]
   (.getChildAt ^js switch-statement index))
  (^js [switch-statement index source-file]
   (.getChildAt ^js switch-statement index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [switch-statement]
   (.getChildren ^js switch-statement))
  (^js [switch-statement source-file]
   (.getChildren ^js switch-statement source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [switch-statement]
   (.getStart ^js switch-statement))
  (^js [switch-statement source-file]
   (.getStart ^js switch-statement source-file))
  (^js [switch-statement source-file include-js-doc-comment?]
   (.getStart ^js switch-statement source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [switch-statement]
  (.getFullStart ^js switch-statement))

(defn get-end
  "**Returns:** `number`"
  ^js [switch-statement]
  (.getEnd ^js switch-statement))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [switch-statement]
   (.getWidth ^js switch-statement))
  (^js [switch-statement source-file]
   (.getWidth ^js switch-statement source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [switch-statement]
  (.getFullWidth ^js switch-statement))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [switch-statement]
   (.getLeadingTriviaWidth ^js switch-statement))
  (^js [switch-statement source-file]
   (.getLeadingTriviaWidth ^js switch-statement source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [switch-statement]
   (.getFullText ^js switch-statement))
  (^js [switch-statement source-file]
   (.getFullText ^js switch-statement source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [switch-statement]
   (.getText ^js switch-statement))
  (^js [switch-statement source-file]
   (.getText ^js switch-statement source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [switch-statement]
   (.getFirstToken ^js switch-statement))
  (^js [switch-statement source-file]
   (.getFirstToken ^js switch-statement source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [switch-statement]
   (.getLastToken ^js switch-statement))
  (^js [switch-statement source-file]
   (.getLastToken ^js switch-statement source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [switch-statement cb-node]
   (.forEachChild ^js switch-statement cb-node))
  (^js [switch-statement cb-node cb-node-array]
   (.forEachChild ^js switch-statement cb-node cb-node-array)))

(defn pos
  "**Returns:** `number`"
  ^js [switch-statement]
  (.-pos ^js switch-statement))

(defn end
  "**Returns:** `number`"
  ^js [switch-statement]
  (.-end ^js switch-statement))
