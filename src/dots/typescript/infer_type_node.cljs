(ns dots.typescript.infer-type-node)

(defn kind
  "**Returns:** `SyntaxKind.InferType`"
  ^js [infer-type-node]
  (.-kind ^js infer-type-node))

(defn type-parameter
  "**Returns:** `TypeParameterDeclaration`"
  ^js [infer-type-node]
  (.-typeParameter ^js infer-type-node))

(defn flags
  "**Returns:** `NodeFlags`"
  ^js [infer-type-node]
  (.-flags ^js infer-type-node))

(defn parent
  "**Returns:** `Node`"
  ^js [infer-type-node]
  (.-parent ^js infer-type-node))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [infer-type-node]
  (.getSourceFile ^js infer-type-node))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [infer-type-node]
   (.getChildCount ^js infer-type-node))
  (^js [infer-type-node source-file]
   (.getChildCount ^js infer-type-node source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [infer-type-node index]
   (.getChildAt ^js infer-type-node index))
  (^js [infer-type-node index source-file]
   (.getChildAt ^js infer-type-node index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [infer-type-node]
   (.getChildren ^js infer-type-node))
  (^js [infer-type-node source-file]
   (.getChildren ^js infer-type-node source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [infer-type-node]
   (.getStart ^js infer-type-node))
  (^js [infer-type-node source-file]
   (.getStart ^js infer-type-node source-file))
  (^js [infer-type-node source-file include-js-doc-comment?]
   (.getStart ^js infer-type-node source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [infer-type-node]
  (.getFullStart ^js infer-type-node))

(defn get-end
  "**Returns:** `number`"
  ^js [infer-type-node]
  (.getEnd ^js infer-type-node))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [infer-type-node]
   (.getWidth ^js infer-type-node))
  (^js [infer-type-node source-file]
   (.getWidth ^js infer-type-node source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [infer-type-node]
  (.getFullWidth ^js infer-type-node))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [infer-type-node]
   (.getLeadingTriviaWidth ^js infer-type-node))
  (^js [infer-type-node source-file]
   (.getLeadingTriviaWidth ^js infer-type-node source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [infer-type-node]
   (.getFullText ^js infer-type-node))
  (^js [infer-type-node source-file]
   (.getFullText ^js infer-type-node source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [infer-type-node]
   (.getText ^js infer-type-node))
  (^js [infer-type-node source-file]
   (.getText ^js infer-type-node source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [infer-type-node]
   (.getFirstToken ^js infer-type-node))
  (^js [infer-type-node source-file]
   (.getFirstToken ^js infer-type-node source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [infer-type-node]
   (.getLastToken ^js infer-type-node))
  (^js [infer-type-node source-file]
   (.getLastToken ^js infer-type-node source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [infer-type-node cb-node]
   (.forEachChild ^js infer-type-node cb-node))
  (^js [infer-type-node cb-node cb-node-array]
   (.forEachChild ^js infer-type-node cb-node cb-node-array)))

(defn pos
  "**Returns:** `number`"
  ^js [infer-type-node]
  (.-pos ^js infer-type-node))

(defn end
  "**Returns:** `number`"
  ^js [infer-type-node]
  (.-end ^js infer-type-node))
