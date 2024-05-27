(ns dots.typescript.export-declaration
  (:refer-clojure :exclude [name]))

(defn kind
  "**Returns:** `SyntaxKind.ExportDeclaration`"
  ^js [export-declaration]
  (.-kind ^js export-declaration))

(defn parent
  "**Returns:** `SourceFile | ModuleBlock`"
  ^js [export-declaration]
  (.-parent ^js export-declaration))

(defn modifiers
  "**Returns:** `NodeArray<ModifierLike> | undefined`"
  ^js [export-declaration]
  (.-modifiers ^js export-declaration))

(defn type-only?
  "**Returns:** `boolean`"
  ^js [export-declaration]
  (.-isTypeOnly ^js export-declaration))

(defn export-clause
  "Will not be assigned in the case of `export * from \"foo\";`
   
   **Returns:** `NamedExportBindings | undefined`"
  ^js [export-declaration]
  (.-exportClause ^js export-declaration))

(defn module-specifier
  "If this is not a StringLiteral it will be a grammar error.
   
   **Returns:** `Expression | undefined`"
  ^js [export-declaration]
  (.-moduleSpecifier ^js export-declaration))

(defn assert-clause
  "**Returns:** `AssertClause | undefined`"
  ^js [export-declaration]
  (.-assertClause ^js export-declaration))

(defn attributes
  "**Returns:** `ImportAttributes | undefined`"
  ^js [export-declaration]
  (.-attributes ^js export-declaration))

(defn name
  "**Returns:** `Identifier | StringLiteral | NumericLiteral | undefined`"
  ^js [export-declaration]
  (.-name ^js export-declaration))

(defn flags
  "**Returns:** `NodeFlags`"
  ^js [export-declaration]
  (.-flags ^js export-declaration))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [export-declaration]
  (.getSourceFile ^js export-declaration))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [export-declaration]
   (.getChildCount ^js export-declaration))
  (^js [export-declaration source-file]
   (.getChildCount ^js export-declaration source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [export-declaration index]
   (.getChildAt ^js export-declaration index))
  (^js [export-declaration index source-file]
   (.getChildAt ^js export-declaration index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [export-declaration]
   (.getChildren ^js export-declaration))
  (^js [export-declaration source-file]
   (.getChildren ^js export-declaration source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [export-declaration]
   (.getStart ^js export-declaration))
  (^js [export-declaration source-file]
   (.getStart ^js export-declaration source-file))
  (^js [export-declaration source-file include-js-doc-comment?]
   (.getStart ^js export-declaration source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [export-declaration]
  (.getFullStart ^js export-declaration))

(defn get-end
  "**Returns:** `number`"
  ^js [export-declaration]
  (.getEnd ^js export-declaration))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [export-declaration]
   (.getWidth ^js export-declaration))
  (^js [export-declaration source-file]
   (.getWidth ^js export-declaration source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [export-declaration]
  (.getFullWidth ^js export-declaration))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [export-declaration]
   (.getLeadingTriviaWidth ^js export-declaration))
  (^js [export-declaration source-file]
   (.getLeadingTriviaWidth ^js export-declaration source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [export-declaration]
   (.getFullText ^js export-declaration))
  (^js [export-declaration source-file]
   (.getFullText ^js export-declaration source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [export-declaration]
   (.getText ^js export-declaration))
  (^js [export-declaration source-file]
   (.getText ^js export-declaration source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [export-declaration]
   (.getFirstToken ^js export-declaration))
  (^js [export-declaration source-file]
   (.getFirstToken ^js export-declaration source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [export-declaration]
   (.getLastToken ^js export-declaration))
  (^js [export-declaration source-file]
   (.getLastToken ^js export-declaration source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [export-declaration cb-node]
   (.forEachChild ^js export-declaration cb-node))
  (^js [export-declaration cb-node cb-node-array]
   (.forEachChild ^js export-declaration cb-node cb-node-array)))

(defn pos
  "**Returns:** `number`"
  ^js [export-declaration]
  (.-pos ^js export-declaration))

(defn end
  "**Returns:** `number`"
  ^js [export-declaration]
  (.-end ^js export-declaration))
