(ns dots.typescript.variable-declaration-list)

(defn kind
  "**Returns:** `SyntaxKind.VariableDeclarationList`"
  ^js [variable-declaration-list]
  (.-kind ^js variable-declaration-list))

(defn parent
  "**Returns:** `ForInStatement | ForOfStatement | ForStatement | VariableStatement`"
  ^js [variable-declaration-list]
  (.-parent ^js variable-declaration-list))

(defn declarations
  "**Returns:** `NodeArray<VariableDeclaration>`"
  ^js [variable-declaration-list]
  (.-declarations ^js variable-declaration-list))

(defn flags
  "**Returns:** `NodeFlags`"
  ^js [variable-declaration-list]
  (.-flags ^js variable-declaration-list))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [variable-declaration-list]
  (.getSourceFile ^js variable-declaration-list))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [variable-declaration-list]
   (.getChildCount ^js variable-declaration-list))
  (^js [variable-declaration-list source-file]
   (.getChildCount ^js variable-declaration-list source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [variable-declaration-list index]
   (.getChildAt ^js variable-declaration-list index))
  (^js [variable-declaration-list index source-file]
   (.getChildAt ^js variable-declaration-list index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [variable-declaration-list]
   (.getChildren ^js variable-declaration-list))
  (^js [variable-declaration-list source-file]
   (.getChildren ^js variable-declaration-list source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [variable-declaration-list]
   (.getStart ^js variable-declaration-list))
  (^js [variable-declaration-list source-file]
   (.getStart ^js variable-declaration-list source-file))
  (^js [variable-declaration-list source-file include-js-doc-comment?]
   (.getStart ^js variable-declaration-list source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [variable-declaration-list]
  (.getFullStart ^js variable-declaration-list))

(defn get-end
  "**Returns:** `number`"
  ^js [variable-declaration-list]
  (.getEnd ^js variable-declaration-list))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [variable-declaration-list]
   (.getWidth ^js variable-declaration-list))
  (^js [variable-declaration-list source-file]
   (.getWidth ^js variable-declaration-list source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [variable-declaration-list]
  (.getFullWidth ^js variable-declaration-list))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [variable-declaration-list]
   (.getLeadingTriviaWidth ^js variable-declaration-list))
  (^js [variable-declaration-list source-file]
   (.getLeadingTriviaWidth ^js variable-declaration-list source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [variable-declaration-list]
   (.getFullText ^js variable-declaration-list))
  (^js [variable-declaration-list source-file]
   (.getFullText ^js variable-declaration-list source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [variable-declaration-list]
   (.getText ^js variable-declaration-list))
  (^js [variable-declaration-list source-file]
   (.getText ^js variable-declaration-list source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [variable-declaration-list]
   (.getFirstToken ^js variable-declaration-list))
  (^js [variable-declaration-list source-file]
   (.getFirstToken ^js variable-declaration-list source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [variable-declaration-list]
   (.getLastToken ^js variable-declaration-list))
  (^js [variable-declaration-list source-file]
   (.getLastToken ^js variable-declaration-list source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [variable-declaration-list cb-node]
   (.forEachChild ^js variable-declaration-list cb-node))
  (^js [variable-declaration-list cb-node cb-node-array]
   (.forEachChild ^js variable-declaration-list cb-node cb-node-array)))

(defn pos
  "**Returns:** `number`"
  ^js [variable-declaration-list]
  (.-pos ^js variable-declaration-list))

(defn end
  "**Returns:** `number`"
  ^js [variable-declaration-list]
  (.-end ^js variable-declaration-list))
