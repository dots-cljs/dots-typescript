(ns dots.typescript.function-or-constructor-type-node-base
  (:refer-clojure :exclude [name type]))

(defn kind
  "**Returns:** `SyntaxKind.FunctionType | SyntaxKind.ConstructorType`"
  ^js [function-or-constructor-type-node-base]
  (.-kind ^js function-or-constructor-type-node-base))

(defn type
  "**Returns:** `TypeNode`"
  ^js [function-or-constructor-type-node-base]
  (.-type ^js function-or-constructor-type-node-base))

(defn flags
  "**Returns:** `NodeFlags`"
  ^js [function-or-constructor-type-node-base]
  (.-flags ^js function-or-constructor-type-node-base))

(defn parent
  "**Returns:** `Node`"
  ^js [function-or-constructor-type-node-base]
  (.-parent ^js function-or-constructor-type-node-base))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [function-or-constructor-type-node-base]
  (.getSourceFile ^js function-or-constructor-type-node-base))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [function-or-constructor-type-node-base]
   (.getChildCount ^js function-or-constructor-type-node-base))
  (^js [function-or-constructor-type-node-base source-file]
   (.getChildCount ^js function-or-constructor-type-node-base source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [function-or-constructor-type-node-base index]
   (.getChildAt ^js function-or-constructor-type-node-base index))
  (^js [function-or-constructor-type-node-base index source-file]
   (.getChildAt ^js function-or-constructor-type-node-base index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [function-or-constructor-type-node-base]
   (.getChildren ^js function-or-constructor-type-node-base))
  (^js [function-or-constructor-type-node-base source-file]
   (.getChildren ^js function-or-constructor-type-node-base source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [function-or-constructor-type-node-base]
   (.getStart ^js function-or-constructor-type-node-base))
  (^js [function-or-constructor-type-node-base source-file]
   (.getStart ^js function-or-constructor-type-node-base source-file))
  (^js [function-or-constructor-type-node-base source-file include-js-doc-comment?]
   (.getStart ^js function-or-constructor-type-node-base source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [function-or-constructor-type-node-base]
  (.getFullStart ^js function-or-constructor-type-node-base))

(defn get-end
  "**Returns:** `number`"
  ^js [function-or-constructor-type-node-base]
  (.getEnd ^js function-or-constructor-type-node-base))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [function-or-constructor-type-node-base]
   (.getWidth ^js function-or-constructor-type-node-base))
  (^js [function-or-constructor-type-node-base source-file]
   (.getWidth ^js function-or-constructor-type-node-base source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [function-or-constructor-type-node-base]
  (.getFullWidth ^js function-or-constructor-type-node-base))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [function-or-constructor-type-node-base]
   (.getLeadingTriviaWidth ^js function-or-constructor-type-node-base))
  (^js [function-or-constructor-type-node-base source-file]
   (.getLeadingTriviaWidth ^js function-or-constructor-type-node-base source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [function-or-constructor-type-node-base]
   (.getFullText ^js function-or-constructor-type-node-base))
  (^js [function-or-constructor-type-node-base source-file]
   (.getFullText ^js function-or-constructor-type-node-base source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [function-or-constructor-type-node-base]
   (.getText ^js function-or-constructor-type-node-base))
  (^js [function-or-constructor-type-node-base source-file]
   (.getText ^js function-or-constructor-type-node-base source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [function-or-constructor-type-node-base]
   (.getFirstToken ^js function-or-constructor-type-node-base))
  (^js [function-or-constructor-type-node-base source-file]
   (.getFirstToken ^js function-or-constructor-type-node-base source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [function-or-constructor-type-node-base]
   (.getLastToken ^js function-or-constructor-type-node-base))
  (^js [function-or-constructor-type-node-base source-file]
   (.getLastToken ^js function-or-constructor-type-node-base source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [function-or-constructor-type-node-base cb-node]
   (.forEachChild ^js function-or-constructor-type-node-base cb-node))
  (^js [function-or-constructor-type-node-base cb-node cb-node-array]
   (.forEachChild ^js function-or-constructor-type-node-base cb-node cb-node-array)))

(defn pos
  "**Returns:** `number`"
  ^js [function-or-constructor-type-node-base]
  (.-pos ^js function-or-constructor-type-node-base))

(defn end
  "**Returns:** `number`"
  ^js [function-or-constructor-type-node-base]
  (.-end ^js function-or-constructor-type-node-base))

(defn name
  "**Returns:** `PropertyName | undefined`"
  ^js [function-or-constructor-type-node-base]
  (.-name ^js function-or-constructor-type-node-base))

(defn type-parameters
  "**Returns:** `NodeArray<TypeParameterDeclaration> | undefined`"
  ^js [function-or-constructor-type-node-base]
  (.-typeParameters ^js function-or-constructor-type-node-base))

(defn parameters
  "**Returns:** `NodeArray<ParameterDeclaration>`"
  ^js [function-or-constructor-type-node-base]
  (.-parameters ^js function-or-constructor-type-node-base))
