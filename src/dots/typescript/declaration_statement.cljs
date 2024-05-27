(ns dots.typescript.declaration-statement
  (:refer-clojure :exclude [name]))

(defn name
  "**Returns:** `Identifier | StringLiteral | NumericLiteral | undefined`"
  ^js [declaration-statement]
  (.-name ^js declaration-statement))

(defn kind
  "**Returns:** `SyntaxKind`"
  ^js [declaration-statement]
  (.-kind ^js declaration-statement))

(defn flags
  "**Returns:** `NodeFlags`"
  ^js [declaration-statement]
  (.-flags ^js declaration-statement))

(defn parent
  "**Returns:** `Node`"
  ^js [declaration-statement]
  (.-parent ^js declaration-statement))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [declaration-statement]
  (.getSourceFile ^js declaration-statement))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [declaration-statement]
   (.getChildCount ^js declaration-statement))
  (^js [declaration-statement source-file]
   (.getChildCount ^js declaration-statement source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [declaration-statement index]
   (.getChildAt ^js declaration-statement index))
  (^js [declaration-statement index source-file]
   (.getChildAt ^js declaration-statement index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [declaration-statement]
   (.getChildren ^js declaration-statement))
  (^js [declaration-statement source-file]
   (.getChildren ^js declaration-statement source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [declaration-statement]
   (.getStart ^js declaration-statement))
  (^js [declaration-statement source-file]
   (.getStart ^js declaration-statement source-file))
  (^js [declaration-statement source-file include-js-doc-comment?]
   (.getStart ^js declaration-statement source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [declaration-statement]
  (.getFullStart ^js declaration-statement))

(defn get-end
  "**Returns:** `number`"
  ^js [declaration-statement]
  (.getEnd ^js declaration-statement))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [declaration-statement]
   (.getWidth ^js declaration-statement))
  (^js [declaration-statement source-file]
   (.getWidth ^js declaration-statement source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [declaration-statement]
  (.getFullWidth ^js declaration-statement))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [declaration-statement]
   (.getLeadingTriviaWidth ^js declaration-statement))
  (^js [declaration-statement source-file]
   (.getLeadingTriviaWidth ^js declaration-statement source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [declaration-statement]
   (.getFullText ^js declaration-statement))
  (^js [declaration-statement source-file]
   (.getFullText ^js declaration-statement source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [declaration-statement]
   (.getText ^js declaration-statement))
  (^js [declaration-statement source-file]
   (.getText ^js declaration-statement source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [declaration-statement]
   (.getFirstToken ^js declaration-statement))
  (^js [declaration-statement source-file]
   (.getFirstToken ^js declaration-statement source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [declaration-statement]
   (.getLastToken ^js declaration-statement))
  (^js [declaration-statement source-file]
   (.getLastToken ^js declaration-statement source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [declaration-statement cb-node]
   (.forEachChild ^js declaration-statement cb-node))
  (^js [declaration-statement cb-node cb-node-array]
   (.forEachChild ^js declaration-statement cb-node cb-node-array)))

(defn pos
  "**Returns:** `number`"
  ^js [declaration-statement]
  (.-pos ^js declaration-statement))

(defn end
  "**Returns:** `number`"
  ^js [declaration-statement]
  (.-end ^js declaration-statement))
