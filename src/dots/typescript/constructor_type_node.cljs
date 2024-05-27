(ns dots.typescript.constructor-type-node
  (:refer-clojure :exclude [name type]))

(defn kind
  "**Returns:** `SyntaxKind.ConstructorType`"
  ^js [constructor-type-node]
  (.-kind ^js constructor-type-node))

(defn modifiers
  "**Returns:** `NodeArray<Modifier> | undefined`"
  ^js [constructor-type-node]
  (.-modifiers ^js constructor-type-node))

(defn type
  "**Returns:** `TypeNode`"
  ^js [constructor-type-node]
  (.-type ^js constructor-type-node))

(defn flags
  "**Returns:** `NodeFlags`"
  ^js [constructor-type-node]
  (.-flags ^js constructor-type-node))

(defn parent
  "**Returns:** `Node`"
  ^js [constructor-type-node]
  (.-parent ^js constructor-type-node))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [constructor-type-node]
  (.getSourceFile ^js constructor-type-node))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [constructor-type-node]
   (.getChildCount ^js constructor-type-node))
  (^js [constructor-type-node source-file]
   (.getChildCount ^js constructor-type-node source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [constructor-type-node index]
   (.getChildAt ^js constructor-type-node index))
  (^js [constructor-type-node index source-file]
   (.getChildAt ^js constructor-type-node index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [constructor-type-node]
   (.getChildren ^js constructor-type-node))
  (^js [constructor-type-node source-file]
   (.getChildren ^js constructor-type-node source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [constructor-type-node]
   (.getStart ^js constructor-type-node))
  (^js [constructor-type-node source-file]
   (.getStart ^js constructor-type-node source-file))
  (^js [constructor-type-node source-file include-js-doc-comment?]
   (.getStart ^js constructor-type-node source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [constructor-type-node]
  (.getFullStart ^js constructor-type-node))

(defn get-end
  "**Returns:** `number`"
  ^js [constructor-type-node]
  (.getEnd ^js constructor-type-node))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [constructor-type-node]
   (.getWidth ^js constructor-type-node))
  (^js [constructor-type-node source-file]
   (.getWidth ^js constructor-type-node source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [constructor-type-node]
  (.getFullWidth ^js constructor-type-node))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [constructor-type-node]
   (.getLeadingTriviaWidth ^js constructor-type-node))
  (^js [constructor-type-node source-file]
   (.getLeadingTriviaWidth ^js constructor-type-node source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [constructor-type-node]
   (.getFullText ^js constructor-type-node))
  (^js [constructor-type-node source-file]
   (.getFullText ^js constructor-type-node source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [constructor-type-node]
   (.getText ^js constructor-type-node))
  (^js [constructor-type-node source-file]
   (.getText ^js constructor-type-node source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [constructor-type-node]
   (.getFirstToken ^js constructor-type-node))
  (^js [constructor-type-node source-file]
   (.getFirstToken ^js constructor-type-node source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [constructor-type-node]
   (.getLastToken ^js constructor-type-node))
  (^js [constructor-type-node source-file]
   (.getLastToken ^js constructor-type-node source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [constructor-type-node cb-node]
   (.forEachChild ^js constructor-type-node cb-node))
  (^js [constructor-type-node cb-node cb-node-array]
   (.forEachChild ^js constructor-type-node cb-node cb-node-array)))

(defn pos
  "**Returns:** `number`"
  ^js [constructor-type-node]
  (.-pos ^js constructor-type-node))

(defn end
  "**Returns:** `number`"
  ^js [constructor-type-node]
  (.-end ^js constructor-type-node))

(defn name
  "**Returns:** `PropertyName | undefined`"
  ^js [constructor-type-node]
  (.-name ^js constructor-type-node))

(defn type-parameters
  "**Returns:** `NodeArray<TypeParameterDeclaration> | undefined`"
  ^js [constructor-type-node]
  (.-typeParameters ^js constructor-type-node))

(defn parameters
  "**Returns:** `NodeArray<ParameterDeclaration>`"
  ^js [constructor-type-node]
  (.-parameters ^js constructor-type-node))
