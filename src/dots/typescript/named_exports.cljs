(ns dots.typescript.named-exports)

(defn kind
  "**Returns:** `SyntaxKind.NamedExports`"
  ^js [named-exports]
  (.-kind ^js named-exports))

(defn parent
  "**Returns:** `ExportDeclaration`"
  ^js [named-exports]
  (.-parent ^js named-exports))

(defn elements
  "**Returns:** `NodeArray<ExportSpecifier>`"
  ^js [named-exports]
  (.-elements ^js named-exports))

(defn flags
  "**Returns:** `NodeFlags`"
  ^js [named-exports]
  (.-flags ^js named-exports))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [named-exports]
  (.getSourceFile ^js named-exports))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [named-exports]
   (.getChildCount ^js named-exports))
  (^js [named-exports source-file]
   (.getChildCount ^js named-exports source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [named-exports index]
   (.getChildAt ^js named-exports index))
  (^js [named-exports index source-file]
   (.getChildAt ^js named-exports index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [named-exports]
   (.getChildren ^js named-exports))
  (^js [named-exports source-file]
   (.getChildren ^js named-exports source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [named-exports]
   (.getStart ^js named-exports))
  (^js [named-exports source-file]
   (.getStart ^js named-exports source-file))
  (^js [named-exports source-file include-js-doc-comment?]
   (.getStart ^js named-exports source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [named-exports]
  (.getFullStart ^js named-exports))

(defn get-end
  "**Returns:** `number`"
  ^js [named-exports]
  (.getEnd ^js named-exports))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [named-exports]
   (.getWidth ^js named-exports))
  (^js [named-exports source-file]
   (.getWidth ^js named-exports source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [named-exports]
  (.getFullWidth ^js named-exports))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [named-exports]
   (.getLeadingTriviaWidth ^js named-exports))
  (^js [named-exports source-file]
   (.getLeadingTriviaWidth ^js named-exports source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [named-exports]
   (.getFullText ^js named-exports))
  (^js [named-exports source-file]
   (.getFullText ^js named-exports source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [named-exports]
   (.getText ^js named-exports))
  (^js [named-exports source-file]
   (.getText ^js named-exports source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [named-exports]
   (.getFirstToken ^js named-exports))
  (^js [named-exports source-file]
   (.getFirstToken ^js named-exports source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [named-exports]
   (.getLastToken ^js named-exports))
  (^js [named-exports source-file]
   (.getLastToken ^js named-exports source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [named-exports cb-node]
   (.forEachChild ^js named-exports cb-node))
  (^js [named-exports cb-node cb-node-array]
   (.forEachChild ^js named-exports cb-node cb-node-array)))

(defn pos
  "**Returns:** `number`"
  ^js [named-exports]
  (.-pos ^js named-exports))

(defn end
  "**Returns:** `number`"
  ^js [named-exports]
  (.-end ^js named-exports))
