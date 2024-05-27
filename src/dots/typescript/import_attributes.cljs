(ns dots.typescript.import-attributes)

(defn token
  "**Returns:** `SyntaxKind.WithKeyword | SyntaxKind.AssertKeyword`"
  ^js [import-attributes]
  (.-token ^js import-attributes))

(defn kind
  "**Returns:** `SyntaxKind.ImportAttributes`"
  ^js [import-attributes]
  (.-kind ^js import-attributes))

(defn parent
  "**Returns:** `ExportDeclaration | ImportDeclaration`"
  ^js [import-attributes]
  (.-parent ^js import-attributes))

(defn elements
  "**Returns:** `NodeArray<ImportAttribute>`"
  ^js [import-attributes]
  (.-elements ^js import-attributes))

(defn multi-line?
  "**Returns:** `boolean | undefined`"
  ^js [import-attributes]
  (.-multiLine ^js import-attributes))

(defn flags
  "**Returns:** `NodeFlags`"
  ^js [import-attributes]
  (.-flags ^js import-attributes))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [import-attributes]
  (.getSourceFile ^js import-attributes))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [import-attributes]
   (.getChildCount ^js import-attributes))
  (^js [import-attributes source-file]
   (.getChildCount ^js import-attributes source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [import-attributes index]
   (.getChildAt ^js import-attributes index))
  (^js [import-attributes index source-file]
   (.getChildAt ^js import-attributes index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [import-attributes]
   (.getChildren ^js import-attributes))
  (^js [import-attributes source-file]
   (.getChildren ^js import-attributes source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [import-attributes]
   (.getStart ^js import-attributes))
  (^js [import-attributes source-file]
   (.getStart ^js import-attributes source-file))
  (^js [import-attributes source-file include-js-doc-comment?]
   (.getStart ^js import-attributes source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [import-attributes]
  (.getFullStart ^js import-attributes))

(defn get-end
  "**Returns:** `number`"
  ^js [import-attributes]
  (.getEnd ^js import-attributes))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [import-attributes]
   (.getWidth ^js import-attributes))
  (^js [import-attributes source-file]
   (.getWidth ^js import-attributes source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [import-attributes]
  (.getFullWidth ^js import-attributes))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [import-attributes]
   (.getLeadingTriviaWidth ^js import-attributes))
  (^js [import-attributes source-file]
   (.getLeadingTriviaWidth ^js import-attributes source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [import-attributes]
   (.getFullText ^js import-attributes))
  (^js [import-attributes source-file]
   (.getFullText ^js import-attributes source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [import-attributes]
   (.getText ^js import-attributes))
  (^js [import-attributes source-file]
   (.getText ^js import-attributes source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [import-attributes]
   (.getFirstToken ^js import-attributes))
  (^js [import-attributes source-file]
   (.getFirstToken ^js import-attributes source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [import-attributes]
   (.getLastToken ^js import-attributes))
  (^js [import-attributes source-file]
   (.getLastToken ^js import-attributes source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [import-attributes cb-node]
   (.forEachChild ^js import-attributes cb-node))
  (^js [import-attributes cb-node cb-node-array]
   (.forEachChild ^js import-attributes cb-node cb-node-array)))

(defn pos
  "**Returns:** `number`"
  ^js [import-attributes]
  (.-pos ^js import-attributes))

(defn end
  "**Returns:** `number`"
  ^js [import-attributes]
  (.-end ^js import-attributes))
