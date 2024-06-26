(ns dots.typescript.external-module-reference)

(defn kind
  "**Returns:** `SyntaxKind.ExternalModuleReference`"
  ^js [external-module-reference]
  (.-kind ^js external-module-reference))

(defn parent
  "**Returns:** `ImportEqualsDeclaration`"
  ^js [external-module-reference]
  (.-parent ^js external-module-reference))

(defn expression
  "**Returns:** `Expression`"
  ^js [external-module-reference]
  (.-expression ^js external-module-reference))

(defn flags
  "**Returns:** `NodeFlags`"
  ^js [external-module-reference]
  (.-flags ^js external-module-reference))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [external-module-reference]
  (.getSourceFile ^js external-module-reference))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [external-module-reference]
   (.getChildCount ^js external-module-reference))
  (^js [external-module-reference source-file]
   (.getChildCount ^js external-module-reference source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [external-module-reference index]
   (.getChildAt ^js external-module-reference index))
  (^js [external-module-reference index source-file]
   (.getChildAt ^js external-module-reference index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [external-module-reference]
   (.getChildren ^js external-module-reference))
  (^js [external-module-reference source-file]
   (.getChildren ^js external-module-reference source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [external-module-reference]
   (.getStart ^js external-module-reference))
  (^js [external-module-reference source-file]
   (.getStart ^js external-module-reference source-file))
  (^js [external-module-reference source-file include-js-doc-comment?]
   (.getStart ^js external-module-reference source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [external-module-reference]
  (.getFullStart ^js external-module-reference))

(defn get-end
  "**Returns:** `number`"
  ^js [external-module-reference]
  (.getEnd ^js external-module-reference))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [external-module-reference]
   (.getWidth ^js external-module-reference))
  (^js [external-module-reference source-file]
   (.getWidth ^js external-module-reference source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [external-module-reference]
  (.getFullWidth ^js external-module-reference))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [external-module-reference]
   (.getLeadingTriviaWidth ^js external-module-reference))
  (^js [external-module-reference source-file]
   (.getLeadingTriviaWidth ^js external-module-reference source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [external-module-reference]
   (.getFullText ^js external-module-reference))
  (^js [external-module-reference source-file]
   (.getFullText ^js external-module-reference source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [external-module-reference]
   (.getText ^js external-module-reference))
  (^js [external-module-reference source-file]
   (.getText ^js external-module-reference source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [external-module-reference]
   (.getFirstToken ^js external-module-reference))
  (^js [external-module-reference source-file]
   (.getFirstToken ^js external-module-reference source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [external-module-reference]
   (.getLastToken ^js external-module-reference))
  (^js [external-module-reference source-file]
   (.getLastToken ^js external-module-reference source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [external-module-reference cb-node]
   (.forEachChild ^js external-module-reference cb-node))
  (^js [external-module-reference cb-node cb-node-array]
   (.forEachChild ^js external-module-reference cb-node cb-node-array)))

(defn pos
  "**Returns:** `number`"
  ^js [external-module-reference]
  (.-pos ^js external-module-reference))

(defn end
  "**Returns:** `number`"
  ^js [external-module-reference]
  (.-end ^js external-module-reference))
