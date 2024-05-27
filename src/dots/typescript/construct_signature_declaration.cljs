(ns dots.typescript.construct-signature-declaration
  (:refer-clojure :exclude [name type]))

(defn kind
  "**Returns:** `SyntaxKind.ConstructSignature`"
  ^js [construct-signature-declaration]
  (.-kind ^js construct-signature-declaration))

(defn name
  "**Returns:** `PropertyName | undefined`"
  ^js [construct-signature-declaration]
  (.-name ^js construct-signature-declaration))

(defn type-parameters
  "**Returns:** `NodeArray<TypeParameterDeclaration> | undefined`"
  ^js [construct-signature-declaration]
  (.-typeParameters ^js construct-signature-declaration))

(defn parameters
  "**Returns:** `NodeArray<ParameterDeclaration>`"
  ^js [construct-signature-declaration]
  (.-parameters ^js construct-signature-declaration))

(defn type
  "**Returns:** `TypeNode | undefined`"
  ^js [construct-signature-declaration]
  (.-type ^js construct-signature-declaration))

(defn flags
  "**Returns:** `NodeFlags`"
  ^js [construct-signature-declaration]
  (.-flags ^js construct-signature-declaration))

(defn parent
  "**Returns:** `Node`"
  ^js [construct-signature-declaration]
  (.-parent ^js construct-signature-declaration))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [construct-signature-declaration]
  (.getSourceFile ^js construct-signature-declaration))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [construct-signature-declaration]
   (.getChildCount ^js construct-signature-declaration))
  (^js [construct-signature-declaration source-file]
   (.getChildCount ^js construct-signature-declaration source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [construct-signature-declaration index]
   (.getChildAt ^js construct-signature-declaration index))
  (^js [construct-signature-declaration index source-file]
   (.getChildAt ^js construct-signature-declaration index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [construct-signature-declaration]
   (.getChildren ^js construct-signature-declaration))
  (^js [construct-signature-declaration source-file]
   (.getChildren ^js construct-signature-declaration source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [construct-signature-declaration]
   (.getStart ^js construct-signature-declaration))
  (^js [construct-signature-declaration source-file]
   (.getStart ^js construct-signature-declaration source-file))
  (^js [construct-signature-declaration source-file include-js-doc-comment?]
   (.getStart ^js construct-signature-declaration source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [construct-signature-declaration]
  (.getFullStart ^js construct-signature-declaration))

(defn get-end
  "**Returns:** `number`"
  ^js [construct-signature-declaration]
  (.getEnd ^js construct-signature-declaration))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [construct-signature-declaration]
   (.getWidth ^js construct-signature-declaration))
  (^js [construct-signature-declaration source-file]
   (.getWidth ^js construct-signature-declaration source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [construct-signature-declaration]
  (.getFullWidth ^js construct-signature-declaration))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [construct-signature-declaration]
   (.getLeadingTriviaWidth ^js construct-signature-declaration))
  (^js [construct-signature-declaration source-file]
   (.getLeadingTriviaWidth ^js construct-signature-declaration source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [construct-signature-declaration]
   (.getFullText ^js construct-signature-declaration))
  (^js [construct-signature-declaration source-file]
   (.getFullText ^js construct-signature-declaration source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [construct-signature-declaration]
   (.getText ^js construct-signature-declaration))
  (^js [construct-signature-declaration source-file]
   (.getText ^js construct-signature-declaration source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [construct-signature-declaration]
   (.getFirstToken ^js construct-signature-declaration))
  (^js [construct-signature-declaration source-file]
   (.getFirstToken ^js construct-signature-declaration source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [construct-signature-declaration]
   (.getLastToken ^js construct-signature-declaration))
  (^js [construct-signature-declaration source-file]
   (.getLastToken ^js construct-signature-declaration source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [construct-signature-declaration cb-node]
   (.forEachChild ^js construct-signature-declaration cb-node))
  (^js [construct-signature-declaration cb-node cb-node-array]
   (.forEachChild ^js construct-signature-declaration cb-node cb-node-array)))

(defn pos
  "**Returns:** `number`"
  ^js [construct-signature-declaration]
  (.-pos ^js construct-signature-declaration))

(defn end
  "**Returns:** `number`"
  ^js [construct-signature-declaration]
  (.-end ^js construct-signature-declaration))

(defn question-token
  "**Returns:** `QuestionToken | undefined`"
  ^js [construct-signature-declaration]
  (.-questionToken ^js construct-signature-declaration))
