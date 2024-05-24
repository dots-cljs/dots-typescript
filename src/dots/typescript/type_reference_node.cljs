(ns dots.typescript.type-reference-node)

(defn kind
  ^js [type-reference-node]
  (.-kind ^js type-reference-node))

(defn type-name
  ^js [type-reference-node]
  (.-typeName ^js type-reference-node))

(defn type-arguments
  ^js [type-reference-node]
  (.-typeArguments ^js type-reference-node))

(defn flags
  ^js [type-reference-node]
  (.-flags ^js type-reference-node))

(defn parent
  ^js [type-reference-node]
  (.-parent ^js type-reference-node))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [type-reference-node]
  (.getSourceFile ^js type-reference-node))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [type-reference-node]
   (.getChildCount ^js type-reference-node))
  (^js [type-reference-node source-file]
   (.getChildCount ^js type-reference-node source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [type-reference-node index]
   (.getChildAt ^js type-reference-node index))
  (^js [type-reference-node index source-file]
   (.getChildAt ^js type-reference-node index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [type-reference-node]
   (.getChildren ^js type-reference-node))
  (^js [type-reference-node source-file]
   (.getChildren ^js type-reference-node source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [type-reference-node]
   (.getStart ^js type-reference-node))
  (^js [type-reference-node source-file]
   (.getStart ^js type-reference-node source-file))
  (^js [type-reference-node source-file include-js-doc-comment?]
   (.getStart ^js type-reference-node source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [type-reference-node]
  (.getFullStart ^js type-reference-node))

(defn get-end
  "**Returns:** `number`"
  ^js [type-reference-node]
  (.getEnd ^js type-reference-node))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [type-reference-node]
   (.getWidth ^js type-reference-node))
  (^js [type-reference-node source-file]
   (.getWidth ^js type-reference-node source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [type-reference-node]
  (.getFullWidth ^js type-reference-node))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [type-reference-node]
   (.getLeadingTriviaWidth ^js type-reference-node))
  (^js [type-reference-node source-file]
   (.getLeadingTriviaWidth ^js type-reference-node source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [type-reference-node]
   (.getFullText ^js type-reference-node))
  (^js [type-reference-node source-file]
   (.getFullText ^js type-reference-node source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [type-reference-node]
   (.getText ^js type-reference-node))
  (^js [type-reference-node source-file]
   (.getText ^js type-reference-node source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [type-reference-node]
   (.getFirstToken ^js type-reference-node))
  (^js [type-reference-node source-file]
   (.getFirstToken ^js type-reference-node source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [type-reference-node]
   (.getLastToken ^js type-reference-node))
  (^js [type-reference-node source-file]
   (.getLastToken ^js type-reference-node source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [type-reference-node cb-node]
   (.forEachChild ^js type-reference-node cb-node))
  (^js [type-reference-node cb-node cb-node-array]
   (.forEachChild ^js type-reference-node cb-node cb-node-array)))

(defn pos
  ^js [type-reference-node]
  (.-pos ^js type-reference-node))

(defn end
  ^js [type-reference-node]
  (.-end ^js type-reference-node))
