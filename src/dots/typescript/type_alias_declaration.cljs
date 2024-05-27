(ns dots.typescript.type-alias-declaration
  (:refer-clojure :exclude [name type]))

(defn kind
  "**Returns:** `SyntaxKind.TypeAliasDeclaration`"
  ^js [type-alias-declaration]
  (.-kind ^js type-alias-declaration))

(defn modifiers
  "**Returns:** `NodeArray<ModifierLike> | undefined`"
  ^js [type-alias-declaration]
  (.-modifiers ^js type-alias-declaration))

(defn name
  "**Returns:** `Identifier`"
  ^js [type-alias-declaration]
  (.-name ^js type-alias-declaration))

(defn type-parameters
  "**Returns:** `NodeArray<TypeParameterDeclaration> | undefined`"
  ^js [type-alias-declaration]
  (.-typeParameters ^js type-alias-declaration))

(defn type
  "**Returns:** `TypeNode`"
  ^js [type-alias-declaration]
  (.-type ^js type-alias-declaration))

(defn flags
  "**Returns:** `NodeFlags`"
  ^js [type-alias-declaration]
  (.-flags ^js type-alias-declaration))

(defn parent
  "**Returns:** `Node`"
  ^js [type-alias-declaration]
  (.-parent ^js type-alias-declaration))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [type-alias-declaration]
  (.getSourceFile ^js type-alias-declaration))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [type-alias-declaration]
   (.getChildCount ^js type-alias-declaration))
  (^js [type-alias-declaration source-file]
   (.getChildCount ^js type-alias-declaration source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [type-alias-declaration index]
   (.getChildAt ^js type-alias-declaration index))
  (^js [type-alias-declaration index source-file]
   (.getChildAt ^js type-alias-declaration index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [type-alias-declaration]
   (.getChildren ^js type-alias-declaration))
  (^js [type-alias-declaration source-file]
   (.getChildren ^js type-alias-declaration source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [type-alias-declaration]
   (.getStart ^js type-alias-declaration))
  (^js [type-alias-declaration source-file]
   (.getStart ^js type-alias-declaration source-file))
  (^js [type-alias-declaration source-file include-js-doc-comment?]
   (.getStart ^js type-alias-declaration source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [type-alias-declaration]
  (.getFullStart ^js type-alias-declaration))

(defn get-end
  "**Returns:** `number`"
  ^js [type-alias-declaration]
  (.getEnd ^js type-alias-declaration))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [type-alias-declaration]
   (.getWidth ^js type-alias-declaration))
  (^js [type-alias-declaration source-file]
   (.getWidth ^js type-alias-declaration source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [type-alias-declaration]
  (.getFullWidth ^js type-alias-declaration))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [type-alias-declaration]
   (.getLeadingTriviaWidth ^js type-alias-declaration))
  (^js [type-alias-declaration source-file]
   (.getLeadingTriviaWidth ^js type-alias-declaration source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [type-alias-declaration]
   (.getFullText ^js type-alias-declaration))
  (^js [type-alias-declaration source-file]
   (.getFullText ^js type-alias-declaration source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [type-alias-declaration]
   (.getText ^js type-alias-declaration))
  (^js [type-alias-declaration source-file]
   (.getText ^js type-alias-declaration source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [type-alias-declaration]
   (.getFirstToken ^js type-alias-declaration))
  (^js [type-alias-declaration source-file]
   (.getFirstToken ^js type-alias-declaration source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [type-alias-declaration]
   (.getLastToken ^js type-alias-declaration))
  (^js [type-alias-declaration source-file]
   (.getLastToken ^js type-alias-declaration source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [type-alias-declaration cb-node]
   (.forEachChild ^js type-alias-declaration cb-node))
  (^js [type-alias-declaration cb-node cb-node-array]
   (.forEachChild ^js type-alias-declaration cb-node cb-node-array)))

(defn pos
  "**Returns:** `number`"
  ^js [type-alias-declaration]
  (.-pos ^js type-alias-declaration))

(defn end
  "**Returns:** `number`"
  ^js [type-alias-declaration]
  (.-end ^js type-alias-declaration))
