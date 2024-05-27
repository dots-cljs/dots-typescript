(ns dots.typescript.named-imports)

(defn kind
  "**Returns:** `SyntaxKind.NamedImports`"
  ^js [named-imports]
  (.-kind ^js named-imports))

(defn parent
  "**Returns:** `ImportClause`"
  ^js [named-imports]
  (.-parent ^js named-imports))

(defn elements
  "**Returns:** `NodeArray<ImportSpecifier>`"
  ^js [named-imports]
  (.-elements ^js named-imports))

(defn flags
  "**Returns:** `NodeFlags`"
  ^js [named-imports]
  (.-flags ^js named-imports))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [named-imports]
  (.getSourceFile ^js named-imports))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [named-imports]
   (.getChildCount ^js named-imports))
  (^js [named-imports source-file]
   (.getChildCount ^js named-imports source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [named-imports index]
   (.getChildAt ^js named-imports index))
  (^js [named-imports index source-file]
   (.getChildAt ^js named-imports index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [named-imports]
   (.getChildren ^js named-imports))
  (^js [named-imports source-file]
   (.getChildren ^js named-imports source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [named-imports]
   (.getStart ^js named-imports))
  (^js [named-imports source-file]
   (.getStart ^js named-imports source-file))
  (^js [named-imports source-file include-js-doc-comment?]
   (.getStart ^js named-imports source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [named-imports]
  (.getFullStart ^js named-imports))

(defn get-end
  "**Returns:** `number`"
  ^js [named-imports]
  (.getEnd ^js named-imports))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [named-imports]
   (.getWidth ^js named-imports))
  (^js [named-imports source-file]
   (.getWidth ^js named-imports source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [named-imports]
  (.getFullWidth ^js named-imports))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [named-imports]
   (.getLeadingTriviaWidth ^js named-imports))
  (^js [named-imports source-file]
   (.getLeadingTriviaWidth ^js named-imports source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [named-imports]
   (.getFullText ^js named-imports))
  (^js [named-imports source-file]
   (.getFullText ^js named-imports source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [named-imports]
   (.getText ^js named-imports))
  (^js [named-imports source-file]
   (.getText ^js named-imports source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [named-imports]
   (.getFirstToken ^js named-imports))
  (^js [named-imports source-file]
   (.getFirstToken ^js named-imports source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [named-imports]
   (.getLastToken ^js named-imports))
  (^js [named-imports source-file]
   (.getLastToken ^js named-imports source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [named-imports cb-node]
   (.forEachChild ^js named-imports cb-node))
  (^js [named-imports cb-node cb-node-array]
   (.forEachChild ^js named-imports cb-node cb-node-array)))

(defn pos
  "**Returns:** `number`"
  ^js [named-imports]
  (.-pos ^js named-imports))

(defn end
  "**Returns:** `number`"
  ^js [named-imports]
  (.-end ^js named-imports))
