(ns dots.typescript.export-assignment
  "This is either an `export =` or an `export default` declaration.
   Unless `isExportEquals` is set, this node was parsed as an `export default`."
  (:refer-clojure :exclude [name]))

(defn kind
  "**Returns:** `SyntaxKind.ExportAssignment`"
  ^js [export-assignment]
  (.-kind ^js export-assignment))

(defn parent
  "**Returns:** `SourceFile`"
  ^js [export-assignment]
  (.-parent ^js export-assignment))

(defn modifiers
  "**Returns:** `NodeArray<ModifierLike> | undefined`"
  ^js [export-assignment]
  (.-modifiers ^js export-assignment))

(defn export-equals?
  "**Returns:** `boolean | undefined`"
  ^js [export-assignment]
  (.-isExportEquals ^js export-assignment))

(defn expression
  "**Returns:** `Expression`"
  ^js [export-assignment]
  (.-expression ^js export-assignment))

(defn name
  "**Returns:** `Identifier | StringLiteral | NumericLiteral | undefined`"
  ^js [export-assignment]
  (.-name ^js export-assignment))

(defn flags
  "**Returns:** `NodeFlags`"
  ^js [export-assignment]
  (.-flags ^js export-assignment))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [export-assignment]
  (.getSourceFile ^js export-assignment))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [export-assignment]
   (.getChildCount ^js export-assignment))
  (^js [export-assignment source-file]
   (.getChildCount ^js export-assignment source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [export-assignment index]
   (.getChildAt ^js export-assignment index))
  (^js [export-assignment index source-file]
   (.getChildAt ^js export-assignment index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [export-assignment]
   (.getChildren ^js export-assignment))
  (^js [export-assignment source-file]
   (.getChildren ^js export-assignment source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [export-assignment]
   (.getStart ^js export-assignment))
  (^js [export-assignment source-file]
   (.getStart ^js export-assignment source-file))
  (^js [export-assignment source-file include-js-doc-comment?]
   (.getStart ^js export-assignment source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [export-assignment]
  (.getFullStart ^js export-assignment))

(defn get-end
  "**Returns:** `number`"
  ^js [export-assignment]
  (.getEnd ^js export-assignment))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [export-assignment]
   (.getWidth ^js export-assignment))
  (^js [export-assignment source-file]
   (.getWidth ^js export-assignment source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [export-assignment]
  (.getFullWidth ^js export-assignment))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [export-assignment]
   (.getLeadingTriviaWidth ^js export-assignment))
  (^js [export-assignment source-file]
   (.getLeadingTriviaWidth ^js export-assignment source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [export-assignment]
   (.getFullText ^js export-assignment))
  (^js [export-assignment source-file]
   (.getFullText ^js export-assignment source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [export-assignment]
   (.getText ^js export-assignment))
  (^js [export-assignment source-file]
   (.getText ^js export-assignment source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [export-assignment]
   (.getFirstToken ^js export-assignment))
  (^js [export-assignment source-file]
   (.getFirstToken ^js export-assignment source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [export-assignment]
   (.getLastToken ^js export-assignment))
  (^js [export-assignment source-file]
   (.getLastToken ^js export-assignment source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [export-assignment cb-node]
   (.forEachChild ^js export-assignment cb-node))
  (^js [export-assignment cb-node cb-node-array]
   (.forEachChild ^js export-assignment cb-node cb-node-array)))

(defn pos
  "**Returns:** `number`"
  ^js [export-assignment]
  (.-pos ^js export-assignment))

(defn end
  "**Returns:** `number`"
  ^js [export-assignment]
  (.-end ^js export-assignment))
