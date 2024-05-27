(ns dots.typescript.import-declaration)

(defn kind
  "**Returns:** `SyntaxKind.ImportDeclaration`"
  ^js [import-declaration]
  (.-kind ^js import-declaration))

(defn parent
  "**Returns:** `SourceFile | ModuleBlock`"
  ^js [import-declaration]
  (.-parent ^js import-declaration))

(defn modifiers
  "**Returns:** `NodeArray<ModifierLike> | undefined`"
  ^js [import-declaration]
  (.-modifiers ^js import-declaration))

(defn import-clause
  "**Returns:** `ImportClause | undefined`"
  ^js [import-declaration]
  (.-importClause ^js import-declaration))

(defn module-specifier
  "If this is not a StringLiteral it will be a grammar error.
   
   **Returns:** `Expression`"
  ^js [import-declaration]
  (.-moduleSpecifier ^js import-declaration))

(defn assert-clause
  "**Returns:** `AssertClause | undefined`"
  ^js [import-declaration]
  (.-assertClause ^js import-declaration))

(defn attributes
  "**Returns:** `ImportAttributes | undefined`"
  ^js [import-declaration]
  (.-attributes ^js import-declaration))

(defn flags
  "**Returns:** `NodeFlags`"
  ^js [import-declaration]
  (.-flags ^js import-declaration))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [import-declaration]
  (.getSourceFile ^js import-declaration))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [import-declaration]
   (.getChildCount ^js import-declaration))
  (^js [import-declaration source-file]
   (.getChildCount ^js import-declaration source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [import-declaration index]
   (.getChildAt ^js import-declaration index))
  (^js [import-declaration index source-file]
   (.getChildAt ^js import-declaration index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [import-declaration]
   (.getChildren ^js import-declaration))
  (^js [import-declaration source-file]
   (.getChildren ^js import-declaration source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [import-declaration]
   (.getStart ^js import-declaration))
  (^js [import-declaration source-file]
   (.getStart ^js import-declaration source-file))
  (^js [import-declaration source-file include-js-doc-comment?]
   (.getStart ^js import-declaration source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [import-declaration]
  (.getFullStart ^js import-declaration))

(defn get-end
  "**Returns:** `number`"
  ^js [import-declaration]
  (.getEnd ^js import-declaration))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [import-declaration]
   (.getWidth ^js import-declaration))
  (^js [import-declaration source-file]
   (.getWidth ^js import-declaration source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [import-declaration]
  (.getFullWidth ^js import-declaration))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [import-declaration]
   (.getLeadingTriviaWidth ^js import-declaration))
  (^js [import-declaration source-file]
   (.getLeadingTriviaWidth ^js import-declaration source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [import-declaration]
   (.getFullText ^js import-declaration))
  (^js [import-declaration source-file]
   (.getFullText ^js import-declaration source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [import-declaration]
   (.getText ^js import-declaration))
  (^js [import-declaration source-file]
   (.getText ^js import-declaration source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [import-declaration]
   (.getFirstToken ^js import-declaration))
  (^js [import-declaration source-file]
   (.getFirstToken ^js import-declaration source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [import-declaration]
   (.getLastToken ^js import-declaration))
  (^js [import-declaration source-file]
   (.getLastToken ^js import-declaration source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [import-declaration cb-node]
   (.forEachChild ^js import-declaration cb-node))
  (^js [import-declaration cb-node cb-node-array]
   (.forEachChild ^js import-declaration cb-node cb-node-array)))

(defn pos
  "**Returns:** `number`"
  ^js [import-declaration]
  (.-pos ^js import-declaration))

(defn end
  "**Returns:** `number`"
  ^js [import-declaration]
  (.-end ^js import-declaration))
