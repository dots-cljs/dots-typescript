(ns dots.typescript.declaration)

(defn kind
  "**Returns:** `SyntaxKind`"
  ^js [declaration]
  (.-kind ^js declaration))

(defn flags
  "**Returns:** `NodeFlags`"
  ^js [declaration]
  (.-flags ^js declaration))

(defn parent
  "**Returns:** `Node`"
  ^js [declaration]
  (.-parent ^js declaration))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [declaration]
  (.getSourceFile ^js declaration))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [declaration]
   (.getChildCount ^js declaration))
  (^js [declaration source-file]
   (.getChildCount ^js declaration source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [declaration index]
   (.getChildAt ^js declaration index))
  (^js [declaration index source-file]
   (.getChildAt ^js declaration index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [declaration]
   (.getChildren ^js declaration))
  (^js [declaration source-file]
   (.getChildren ^js declaration source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [declaration]
   (.getStart ^js declaration))
  (^js [declaration source-file]
   (.getStart ^js declaration source-file))
  (^js [declaration source-file include-js-doc-comment?]
   (.getStart ^js declaration source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [declaration]
  (.getFullStart ^js declaration))

(defn get-end
  "**Returns:** `number`"
  ^js [declaration]
  (.getEnd ^js declaration))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [declaration]
   (.getWidth ^js declaration))
  (^js [declaration source-file]
   (.getWidth ^js declaration source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [declaration]
  (.getFullWidth ^js declaration))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [declaration]
   (.getLeadingTriviaWidth ^js declaration))
  (^js [declaration source-file]
   (.getLeadingTriviaWidth ^js declaration source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [declaration]
   (.getFullText ^js declaration))
  (^js [declaration source-file]
   (.getFullText ^js declaration source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [declaration]
   (.getText ^js declaration))
  (^js [declaration source-file]
   (.getText ^js declaration source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [declaration]
   (.getFirstToken ^js declaration))
  (^js [declaration source-file]
   (.getFirstToken ^js declaration source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [declaration]
   (.getLastToken ^js declaration))
  (^js [declaration source-file]
   (.getLastToken ^js declaration source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [declaration cb-node]
   (.forEachChild ^js declaration cb-node))
  (^js [declaration cb-node cb-node-array]
   (.forEachChild ^js declaration cb-node cb-node-array)))

(defn pos
  "**Returns:** `number`"
  ^js [declaration]
  (.-pos ^js declaration))

(defn end
  "**Returns:** `number`"
  ^js [declaration]
  (.-end ^js declaration))
