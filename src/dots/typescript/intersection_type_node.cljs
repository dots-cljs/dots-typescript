(ns dots.typescript.intersection-type-node)

(defn kind
  "**Returns:** `SyntaxKind.IntersectionType`"
  ^js [intersection-type-node]
  (.-kind ^js intersection-type-node))

(defn types
  "**Returns:** `NodeArray<TypeNode>`"
  ^js [intersection-type-node]
  (.-types ^js intersection-type-node))

(defn flags
  "**Returns:** `NodeFlags`"
  ^js [intersection-type-node]
  (.-flags ^js intersection-type-node))

(defn parent
  "**Returns:** `Node`"
  ^js [intersection-type-node]
  (.-parent ^js intersection-type-node))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [intersection-type-node]
  (.getSourceFile ^js intersection-type-node))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [intersection-type-node]
   (.getChildCount ^js intersection-type-node))
  (^js [intersection-type-node source-file]
   (.getChildCount ^js intersection-type-node source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [intersection-type-node index]
   (.getChildAt ^js intersection-type-node index))
  (^js [intersection-type-node index source-file]
   (.getChildAt ^js intersection-type-node index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [intersection-type-node]
   (.getChildren ^js intersection-type-node))
  (^js [intersection-type-node source-file]
   (.getChildren ^js intersection-type-node source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [intersection-type-node]
   (.getStart ^js intersection-type-node))
  (^js [intersection-type-node source-file]
   (.getStart ^js intersection-type-node source-file))
  (^js [intersection-type-node source-file include-js-doc-comment?]
   (.getStart ^js intersection-type-node source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [intersection-type-node]
  (.getFullStart ^js intersection-type-node))

(defn get-end
  "**Returns:** `number`"
  ^js [intersection-type-node]
  (.getEnd ^js intersection-type-node))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [intersection-type-node]
   (.getWidth ^js intersection-type-node))
  (^js [intersection-type-node source-file]
   (.getWidth ^js intersection-type-node source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [intersection-type-node]
  (.getFullWidth ^js intersection-type-node))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [intersection-type-node]
   (.getLeadingTriviaWidth ^js intersection-type-node))
  (^js [intersection-type-node source-file]
   (.getLeadingTriviaWidth ^js intersection-type-node source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [intersection-type-node]
   (.getFullText ^js intersection-type-node))
  (^js [intersection-type-node source-file]
   (.getFullText ^js intersection-type-node source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [intersection-type-node]
   (.getText ^js intersection-type-node))
  (^js [intersection-type-node source-file]
   (.getText ^js intersection-type-node source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [intersection-type-node]
   (.getFirstToken ^js intersection-type-node))
  (^js [intersection-type-node source-file]
   (.getFirstToken ^js intersection-type-node source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [intersection-type-node]
   (.getLastToken ^js intersection-type-node))
  (^js [intersection-type-node source-file]
   (.getLastToken ^js intersection-type-node source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [intersection-type-node cb-node]
   (.forEachChild ^js intersection-type-node cb-node))
  (^js [intersection-type-node cb-node cb-node-array]
   (.forEachChild ^js intersection-type-node cb-node cb-node-array)))

(defn pos
  "**Returns:** `number`"
  ^js [intersection-type-node]
  (.-pos ^js intersection-type-node))

(defn end
  "**Returns:** `number`"
  ^js [intersection-type-node]
  (.-end ^js intersection-type-node))
