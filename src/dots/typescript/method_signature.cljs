(ns dots.typescript.method-signature
  (:refer-clojure :exclude [name type]))

(defn kind
  "**Returns:** `SyntaxKind.MethodSignature`"
  ^js [method-signature]
  (.-kind ^js method-signature))

(defn parent
  "**Returns:** `InterfaceDeclaration | TypeLiteralNode`"
  ^js [method-signature]
  (.-parent ^js method-signature))

(defn modifiers
  "**Returns:** `NodeArray<Modifier> | undefined`"
  ^js [method-signature]
  (.-modifiers ^js method-signature))

(defn name
  "**Returns:** `PropertyName`"
  ^js [method-signature]
  (.-name ^js method-signature))

(defn type-parameters
  "**Returns:** `NodeArray<TypeParameterDeclaration> | undefined`"
  ^js [method-signature]
  (.-typeParameters ^js method-signature))

(defn parameters
  "**Returns:** `NodeArray<ParameterDeclaration>`"
  ^js [method-signature]
  (.-parameters ^js method-signature))

(defn type
  "**Returns:** `TypeNode | undefined`"
  ^js [method-signature]
  (.-type ^js method-signature))

(defn flags
  "**Returns:** `NodeFlags`"
  ^js [method-signature]
  (.-flags ^js method-signature))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [method-signature]
  (.getSourceFile ^js method-signature))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [method-signature]
   (.getChildCount ^js method-signature))
  (^js [method-signature source-file]
   (.getChildCount ^js method-signature source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [method-signature index]
   (.getChildAt ^js method-signature index))
  (^js [method-signature index source-file]
   (.getChildAt ^js method-signature index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [method-signature]
   (.getChildren ^js method-signature))
  (^js [method-signature source-file]
   (.getChildren ^js method-signature source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [method-signature]
   (.getStart ^js method-signature))
  (^js [method-signature source-file]
   (.getStart ^js method-signature source-file))
  (^js [method-signature source-file include-js-doc-comment?]
   (.getStart ^js method-signature source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [method-signature]
  (.getFullStart ^js method-signature))

(defn get-end
  "**Returns:** `number`"
  ^js [method-signature]
  (.getEnd ^js method-signature))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [method-signature]
   (.getWidth ^js method-signature))
  (^js [method-signature source-file]
   (.getWidth ^js method-signature source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [method-signature]
  (.getFullWidth ^js method-signature))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [method-signature]
   (.getLeadingTriviaWidth ^js method-signature))
  (^js [method-signature source-file]
   (.getLeadingTriviaWidth ^js method-signature source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [method-signature]
   (.getFullText ^js method-signature))
  (^js [method-signature source-file]
   (.getFullText ^js method-signature source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [method-signature]
   (.getText ^js method-signature))
  (^js [method-signature source-file]
   (.getText ^js method-signature source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [method-signature]
   (.getFirstToken ^js method-signature))
  (^js [method-signature source-file]
   (.getFirstToken ^js method-signature source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [method-signature]
   (.getLastToken ^js method-signature))
  (^js [method-signature source-file]
   (.getLastToken ^js method-signature source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [method-signature cb-node]
   (.forEachChild ^js method-signature cb-node))
  (^js [method-signature cb-node cb-node-array]
   (.forEachChild ^js method-signature cb-node cb-node-array)))

(defn pos
  "**Returns:** `number`"
  ^js [method-signature]
  (.-pos ^js method-signature))

(defn end
  "**Returns:** `number`"
  ^js [method-signature]
  (.-end ^js method-signature))

(defn question-token
  "**Returns:** `QuestionToken | undefined`"
  ^js [method-signature]
  (.-questionToken ^js method-signature))
