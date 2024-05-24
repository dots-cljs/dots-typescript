(ns dots.typescript.variable-statement)

(defn kind
  ^js [variable-statement]
  (.-kind ^js variable-statement))

(defn modifiers
  ^js [variable-statement]
  (.-modifiers ^js variable-statement))

(defn declaration-list
  ^js [variable-statement]
  (.-declarationList ^js variable-statement))

(defn flags
  ^js [variable-statement]
  (.-flags ^js variable-statement))

(defn parent
  ^js [variable-statement]
  (.-parent ^js variable-statement))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [variable-statement]
  (.getSourceFile ^js variable-statement))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [variable-statement]
   (.getChildCount ^js variable-statement))
  (^js [variable-statement source-file]
   (.getChildCount ^js variable-statement source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [variable-statement index]
   (.getChildAt ^js variable-statement index))
  (^js [variable-statement index source-file]
   (.getChildAt ^js variable-statement index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [variable-statement]
   (.getChildren ^js variable-statement))
  (^js [variable-statement source-file]
   (.getChildren ^js variable-statement source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [variable-statement]
   (.getStart ^js variable-statement))
  (^js [variable-statement source-file]
   (.getStart ^js variable-statement source-file))
  (^js [variable-statement source-file include-js-doc-comment?]
   (.getStart ^js variable-statement source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [variable-statement]
  (.getFullStart ^js variable-statement))

(defn get-end
  "**Returns:** `number`"
  ^js [variable-statement]
  (.getEnd ^js variable-statement))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [variable-statement]
   (.getWidth ^js variable-statement))
  (^js [variable-statement source-file]
   (.getWidth ^js variable-statement source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [variable-statement]
  (.getFullWidth ^js variable-statement))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [variable-statement]
   (.getLeadingTriviaWidth ^js variable-statement))
  (^js [variable-statement source-file]
   (.getLeadingTriviaWidth ^js variable-statement source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [variable-statement]
   (.getFullText ^js variable-statement))
  (^js [variable-statement source-file]
   (.getFullText ^js variable-statement source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [variable-statement]
   (.getText ^js variable-statement))
  (^js [variable-statement source-file]
   (.getText ^js variable-statement source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [variable-statement]
   (.getFirstToken ^js variable-statement))
  (^js [variable-statement source-file]
   (.getFirstToken ^js variable-statement source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [variable-statement]
   (.getLastToken ^js variable-statement))
  (^js [variable-statement source-file]
   (.getLastToken ^js variable-statement source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [variable-statement cb-node]
   (.forEachChild ^js variable-statement cb-node))
  (^js [variable-statement cb-node cb-node-array]
   (.forEachChild ^js variable-statement cb-node cb-node-array)))

(defn pos
  ^js [variable-statement]
  (.-pos ^js variable-statement))

(defn end
  ^js [variable-statement]
  (.-end ^js variable-statement))
