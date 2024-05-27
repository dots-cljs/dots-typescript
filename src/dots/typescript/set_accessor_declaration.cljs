(ns dots.typescript.set-accessor-declaration
  (:refer-clojure :exclude [name type]))

(defn kind
  "**Returns:** `SyntaxKind.SetAccessor`"
  ^js [set-accessor-declaration]
  (.-kind ^js set-accessor-declaration))

(defn parent
  "**Returns:** `ClassLikeDeclaration | InterfaceDeclaration | ObjectLiteralExpression | TypeLiteralNode`"
  ^js [set-accessor-declaration]
  (.-parent ^js set-accessor-declaration))

(defn modifiers
  "**Returns:** `NodeArray<ModifierLike> | undefined`"
  ^js [set-accessor-declaration]
  (.-modifiers ^js set-accessor-declaration))

(defn name
  "**Returns:** `PropertyName`"
  ^js [set-accessor-declaration]
  (.-name ^js set-accessor-declaration))

(defn body
  "**Returns:** `Block | undefined`"
  ^js [set-accessor-declaration]
  (.-body ^js set-accessor-declaration))

(defn asterisk-token
  "**Returns:** `AsteriskToken | undefined`"
  ^js [set-accessor-declaration]
  (.-asteriskToken ^js set-accessor-declaration))

(defn question-token
  "**Returns:** `QuestionToken | undefined`"
  ^js [set-accessor-declaration]
  (.-questionToken ^js set-accessor-declaration))

(defn exclamation-token
  "**Returns:** `ExclamationToken | undefined`"
  ^js [set-accessor-declaration]
  (.-exclamationToken ^js set-accessor-declaration))

(defn type-parameters
  "**Returns:** `NodeArray<TypeParameterDeclaration> | undefined`"
  ^js [set-accessor-declaration]
  (.-typeParameters ^js set-accessor-declaration))

(defn parameters
  "**Returns:** `NodeArray<ParameterDeclaration>`"
  ^js [set-accessor-declaration]
  (.-parameters ^js set-accessor-declaration))

(defn type
  "**Returns:** `TypeNode | undefined`"
  ^js [set-accessor-declaration]
  (.-type ^js set-accessor-declaration))

(defn flags
  "**Returns:** `NodeFlags`"
  ^js [set-accessor-declaration]
  (.-flags ^js set-accessor-declaration))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [set-accessor-declaration]
  (.getSourceFile ^js set-accessor-declaration))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [set-accessor-declaration]
   (.getChildCount ^js set-accessor-declaration))
  (^js [set-accessor-declaration source-file]
   (.getChildCount ^js set-accessor-declaration source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [set-accessor-declaration index]
   (.getChildAt ^js set-accessor-declaration index))
  (^js [set-accessor-declaration index source-file]
   (.getChildAt ^js set-accessor-declaration index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [set-accessor-declaration]
   (.getChildren ^js set-accessor-declaration))
  (^js [set-accessor-declaration source-file]
   (.getChildren ^js set-accessor-declaration source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [set-accessor-declaration]
   (.getStart ^js set-accessor-declaration))
  (^js [set-accessor-declaration source-file]
   (.getStart ^js set-accessor-declaration source-file))
  (^js [set-accessor-declaration source-file include-js-doc-comment?]
   (.getStart ^js set-accessor-declaration source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [set-accessor-declaration]
  (.getFullStart ^js set-accessor-declaration))

(defn get-end
  "**Returns:** `number`"
  ^js [set-accessor-declaration]
  (.getEnd ^js set-accessor-declaration))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [set-accessor-declaration]
   (.getWidth ^js set-accessor-declaration))
  (^js [set-accessor-declaration source-file]
   (.getWidth ^js set-accessor-declaration source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [set-accessor-declaration]
  (.getFullWidth ^js set-accessor-declaration))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [set-accessor-declaration]
   (.getLeadingTriviaWidth ^js set-accessor-declaration))
  (^js [set-accessor-declaration source-file]
   (.getLeadingTriviaWidth ^js set-accessor-declaration source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [set-accessor-declaration]
   (.getFullText ^js set-accessor-declaration))
  (^js [set-accessor-declaration source-file]
   (.getFullText ^js set-accessor-declaration source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [set-accessor-declaration]
   (.getText ^js set-accessor-declaration))
  (^js [set-accessor-declaration source-file]
   (.getText ^js set-accessor-declaration source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [set-accessor-declaration]
   (.getFirstToken ^js set-accessor-declaration))
  (^js [set-accessor-declaration source-file]
   (.getFirstToken ^js set-accessor-declaration source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [set-accessor-declaration]
   (.getLastToken ^js set-accessor-declaration))
  (^js [set-accessor-declaration source-file]
   (.getLastToken ^js set-accessor-declaration source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [set-accessor-declaration cb-node]
   (.forEachChild ^js set-accessor-declaration cb-node))
  (^js [set-accessor-declaration cb-node cb-node-array]
   (.forEachChild ^js set-accessor-declaration cb-node cb-node-array)))

(defn pos
  "**Returns:** `number`"
  ^js [set-accessor-declaration]
  (.-pos ^js set-accessor-declaration))

(defn end
  "**Returns:** `number`"
  ^js [set-accessor-declaration]
  (.-end ^js set-accessor-declaration))
