(ns dots.typescript.index-signature-declaration
  (:refer-clojure :exclude [name type]))

(defn kind
  "**Returns:** `SyntaxKind.IndexSignature`"
  ^js [index-signature-declaration]
  (.-kind ^js index-signature-declaration))

(defn parent
  "**Returns:** `ObjectTypeDeclaration`"
  ^js [index-signature-declaration]
  (.-parent ^js index-signature-declaration))

(defn modifiers
  "**Returns:** `NodeArray<ModifierLike> | undefined`"
  ^js [index-signature-declaration]
  (.-modifiers ^js index-signature-declaration))

(defn type
  "**Returns:** `TypeNode`"
  ^js [index-signature-declaration]
  (.-type ^js index-signature-declaration))

(defn name
  "**Returns:** `PropertyName | undefined`"
  ^js [index-signature-declaration]
  (.-name ^js index-signature-declaration))

(defn type-parameters
  "**Returns:** `NodeArray<TypeParameterDeclaration> | undefined`"
  ^js [index-signature-declaration]
  (.-typeParameters ^js index-signature-declaration))

(defn parameters
  "**Returns:** `NodeArray<ParameterDeclaration>`"
  ^js [index-signature-declaration]
  (.-parameters ^js index-signature-declaration))

(defn flags
  "**Returns:** `NodeFlags`"
  ^js [index-signature-declaration]
  (.-flags ^js index-signature-declaration))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [index-signature-declaration]
  (.getSourceFile ^js index-signature-declaration))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [index-signature-declaration]
   (.getChildCount ^js index-signature-declaration))
  (^js [index-signature-declaration source-file]
   (.getChildCount ^js index-signature-declaration source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [index-signature-declaration index]
   (.getChildAt ^js index-signature-declaration index))
  (^js [index-signature-declaration index source-file]
   (.getChildAt ^js index-signature-declaration index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [index-signature-declaration]
   (.getChildren ^js index-signature-declaration))
  (^js [index-signature-declaration source-file]
   (.getChildren ^js index-signature-declaration source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [index-signature-declaration]
   (.getStart ^js index-signature-declaration))
  (^js [index-signature-declaration source-file]
   (.getStart ^js index-signature-declaration source-file))
  (^js [index-signature-declaration source-file include-js-doc-comment?]
   (.getStart ^js index-signature-declaration source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [index-signature-declaration]
  (.getFullStart ^js index-signature-declaration))

(defn get-end
  "**Returns:** `number`"
  ^js [index-signature-declaration]
  (.getEnd ^js index-signature-declaration))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [index-signature-declaration]
   (.getWidth ^js index-signature-declaration))
  (^js [index-signature-declaration source-file]
   (.getWidth ^js index-signature-declaration source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [index-signature-declaration]
  (.getFullWidth ^js index-signature-declaration))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [index-signature-declaration]
   (.getLeadingTriviaWidth ^js index-signature-declaration))
  (^js [index-signature-declaration source-file]
   (.getLeadingTriviaWidth ^js index-signature-declaration source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [index-signature-declaration]
   (.getFullText ^js index-signature-declaration))
  (^js [index-signature-declaration source-file]
   (.getFullText ^js index-signature-declaration source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [index-signature-declaration]
   (.getText ^js index-signature-declaration))
  (^js [index-signature-declaration source-file]
   (.getText ^js index-signature-declaration source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [index-signature-declaration]
   (.getFirstToken ^js index-signature-declaration))
  (^js [index-signature-declaration source-file]
   (.getFirstToken ^js index-signature-declaration source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [index-signature-declaration]
   (.getLastToken ^js index-signature-declaration))
  (^js [index-signature-declaration source-file]
   (.getLastToken ^js index-signature-declaration source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [index-signature-declaration cb-node]
   (.forEachChild ^js index-signature-declaration cb-node))
  (^js [index-signature-declaration cb-node cb-node-array]
   (.forEachChild ^js index-signature-declaration cb-node cb-node-array)))

(defn pos
  "**Returns:** `number`"
  ^js [index-signature-declaration]
  (.-pos ^js index-signature-declaration))

(defn end
  "**Returns:** `number`"
  ^js [index-signature-declaration]
  (.-end ^js index-signature-declaration))

(defn question-token
  "**Returns:** `QuestionToken | undefined`"
  ^js [index-signature-declaration]
  (.-questionToken ^js index-signature-declaration))
