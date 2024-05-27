(ns dots.typescript.function-declaration
  (:refer-clojure :exclude [name type]))

(defn kind
  "**Returns:** `SyntaxKind.FunctionDeclaration`"
  ^js [function-declaration]
  (.-kind ^js function-declaration))

(defn modifiers
  "**Returns:** `NodeArray<ModifierLike> | undefined`"
  ^js [function-declaration]
  (.-modifiers ^js function-declaration))

(defn name
  "**Returns:** `Identifier | undefined`"
  ^js [function-declaration]
  (.-name ^js function-declaration))

(defn body
  "**Returns:** `Block | undefined`"
  ^js [function-declaration]
  (.-body ^js function-declaration))

(defn asterisk-token
  "**Returns:** `AsteriskToken | undefined`"
  ^js [function-declaration]
  (.-asteriskToken ^js function-declaration))

(defn question-token
  "**Returns:** `QuestionToken | undefined`"
  ^js [function-declaration]
  (.-questionToken ^js function-declaration))

(defn exclamation-token
  "**Returns:** `ExclamationToken | undefined`"
  ^js [function-declaration]
  (.-exclamationToken ^js function-declaration))

(defn type-parameters
  "**Returns:** `NodeArray<TypeParameterDeclaration> | undefined`"
  ^js [function-declaration]
  (.-typeParameters ^js function-declaration))

(defn parameters
  "**Returns:** `NodeArray<ParameterDeclaration>`"
  ^js [function-declaration]
  (.-parameters ^js function-declaration))

(defn type
  "**Returns:** `TypeNode | undefined`"
  ^js [function-declaration]
  (.-type ^js function-declaration))

(defn flags
  "**Returns:** `NodeFlags`"
  ^js [function-declaration]
  (.-flags ^js function-declaration))

(defn parent
  "**Returns:** `Node`"
  ^js [function-declaration]
  (.-parent ^js function-declaration))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [function-declaration]
  (.getSourceFile ^js function-declaration))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [function-declaration]
   (.getChildCount ^js function-declaration))
  (^js [function-declaration source-file]
   (.getChildCount ^js function-declaration source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [function-declaration index]
   (.getChildAt ^js function-declaration index))
  (^js [function-declaration index source-file]
   (.getChildAt ^js function-declaration index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [function-declaration]
   (.getChildren ^js function-declaration))
  (^js [function-declaration source-file]
   (.getChildren ^js function-declaration source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [function-declaration]
   (.getStart ^js function-declaration))
  (^js [function-declaration source-file]
   (.getStart ^js function-declaration source-file))
  (^js [function-declaration source-file include-js-doc-comment?]
   (.getStart ^js function-declaration source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [function-declaration]
  (.getFullStart ^js function-declaration))

(defn get-end
  "**Returns:** `number`"
  ^js [function-declaration]
  (.getEnd ^js function-declaration))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [function-declaration]
   (.getWidth ^js function-declaration))
  (^js [function-declaration source-file]
   (.getWidth ^js function-declaration source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [function-declaration]
  (.getFullWidth ^js function-declaration))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [function-declaration]
   (.getLeadingTriviaWidth ^js function-declaration))
  (^js [function-declaration source-file]
   (.getLeadingTriviaWidth ^js function-declaration source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [function-declaration]
   (.getFullText ^js function-declaration))
  (^js [function-declaration source-file]
   (.getFullText ^js function-declaration source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [function-declaration]
   (.getText ^js function-declaration))
  (^js [function-declaration source-file]
   (.getText ^js function-declaration source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [function-declaration]
   (.getFirstToken ^js function-declaration))
  (^js [function-declaration source-file]
   (.getFirstToken ^js function-declaration source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [function-declaration]
   (.getLastToken ^js function-declaration))
  (^js [function-declaration source-file]
   (.getLastToken ^js function-declaration source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [function-declaration cb-node]
   (.forEachChild ^js function-declaration cb-node))
  (^js [function-declaration cb-node cb-node-array]
   (.forEachChild ^js function-declaration cb-node cb-node-array)))

(defn pos
  "**Returns:** `number`"
  ^js [function-declaration]
  (.-pos ^js function-declaration))

(defn end
  "**Returns:** `number`"
  ^js [function-declaration]
  (.-end ^js function-declaration))
