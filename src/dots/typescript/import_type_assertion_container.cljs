(ns dots.typescript.import-type-assertion-container)

(defn kind
  "**Returns:** `SyntaxKind.ImportTypeAssertionContainer`"
  ^js [import-type-assertion-container]
  (.-kind ^js import-type-assertion-container))

(defn parent
  "**Returns:** `ImportTypeNode`"
  ^js [import-type-assertion-container]
  (.-parent ^js import-type-assertion-container))

(defn assert-clause
  "**Returns:** `AssertClause`"
  ^js [import-type-assertion-container]
  (.-assertClause ^js import-type-assertion-container))

(defn multi-line?
  "**Returns:** `boolean | undefined`"
  ^js [import-type-assertion-container]
  (.-multiLine ^js import-type-assertion-container))

(defn flags
  "**Returns:** `NodeFlags`"
  ^js [import-type-assertion-container]
  (.-flags ^js import-type-assertion-container))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [import-type-assertion-container]
  (.getSourceFile ^js import-type-assertion-container))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [import-type-assertion-container]
   (.getChildCount ^js import-type-assertion-container))
  (^js [import-type-assertion-container source-file]
   (.getChildCount ^js import-type-assertion-container source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [import-type-assertion-container index]
   (.getChildAt ^js import-type-assertion-container index))
  (^js [import-type-assertion-container index source-file]
   (.getChildAt ^js import-type-assertion-container index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [import-type-assertion-container]
   (.getChildren ^js import-type-assertion-container))
  (^js [import-type-assertion-container source-file]
   (.getChildren ^js import-type-assertion-container source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [import-type-assertion-container]
   (.getStart ^js import-type-assertion-container))
  (^js [import-type-assertion-container source-file]
   (.getStart ^js import-type-assertion-container source-file))
  (^js [import-type-assertion-container source-file include-js-doc-comment?]
   (.getStart ^js import-type-assertion-container source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [import-type-assertion-container]
  (.getFullStart ^js import-type-assertion-container))

(defn get-end
  "**Returns:** `number`"
  ^js [import-type-assertion-container]
  (.getEnd ^js import-type-assertion-container))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [import-type-assertion-container]
   (.getWidth ^js import-type-assertion-container))
  (^js [import-type-assertion-container source-file]
   (.getWidth ^js import-type-assertion-container source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [import-type-assertion-container]
  (.getFullWidth ^js import-type-assertion-container))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [import-type-assertion-container]
   (.getLeadingTriviaWidth ^js import-type-assertion-container))
  (^js [import-type-assertion-container source-file]
   (.getLeadingTriviaWidth ^js import-type-assertion-container source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [import-type-assertion-container]
   (.getFullText ^js import-type-assertion-container))
  (^js [import-type-assertion-container source-file]
   (.getFullText ^js import-type-assertion-container source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [import-type-assertion-container]
   (.getText ^js import-type-assertion-container))
  (^js [import-type-assertion-container source-file]
   (.getText ^js import-type-assertion-container source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [import-type-assertion-container]
   (.getFirstToken ^js import-type-assertion-container))
  (^js [import-type-assertion-container source-file]
   (.getFirstToken ^js import-type-assertion-container source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [import-type-assertion-container]
   (.getLastToken ^js import-type-assertion-container))
  (^js [import-type-assertion-container source-file]
   (.getLastToken ^js import-type-assertion-container source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [import-type-assertion-container cb-node]
   (.forEachChild ^js import-type-assertion-container cb-node))
  (^js [import-type-assertion-container cb-node cb-node-array]
   (.forEachChild ^js import-type-assertion-container cb-node cb-node-array)))

(defn pos
  "**Returns:** `number`"
  ^js [import-type-assertion-container]
  (.-pos ^js import-type-assertion-container))

(defn end
  "**Returns:** `number`"
  ^js [import-type-assertion-container]
  (.-end ^js import-type-assertion-container))
