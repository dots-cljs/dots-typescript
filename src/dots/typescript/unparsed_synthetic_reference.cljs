(ns dots.typescript.unparsed-synthetic-reference)

(defn kind
  ^js [unparsed-synthetic-reference]
  (.-kind ^js unparsed-synthetic-reference))

(defn parent
  ^js [unparsed-synthetic-reference]
  (.-parent ^js unparsed-synthetic-reference))

(defn data
  ^js [unparsed-synthetic-reference]
  (.-data ^js unparsed-synthetic-reference))

(defn flags
  ^js [unparsed-synthetic-reference]
  (.-flags ^js unparsed-synthetic-reference))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [unparsed-synthetic-reference]
  (.getSourceFile ^js unparsed-synthetic-reference))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [unparsed-synthetic-reference]
   (.getChildCount ^js unparsed-synthetic-reference))
  (^js [unparsed-synthetic-reference source-file]
   (.getChildCount ^js unparsed-synthetic-reference source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [unparsed-synthetic-reference index]
   (.getChildAt ^js unparsed-synthetic-reference index))
  (^js [unparsed-synthetic-reference index source-file]
   (.getChildAt ^js unparsed-synthetic-reference index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [unparsed-synthetic-reference]
   (.getChildren ^js unparsed-synthetic-reference))
  (^js [unparsed-synthetic-reference source-file]
   (.getChildren ^js unparsed-synthetic-reference source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [unparsed-synthetic-reference]
   (.getStart ^js unparsed-synthetic-reference))
  (^js [unparsed-synthetic-reference source-file]
   (.getStart ^js unparsed-synthetic-reference source-file))
  (^js [unparsed-synthetic-reference source-file include-js-doc-comment?]
   (.getStart ^js unparsed-synthetic-reference source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [unparsed-synthetic-reference]
  (.getFullStart ^js unparsed-synthetic-reference))

(defn get-end
  "**Returns:** `number`"
  ^js [unparsed-synthetic-reference]
  (.getEnd ^js unparsed-synthetic-reference))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [unparsed-synthetic-reference]
   (.getWidth ^js unparsed-synthetic-reference))
  (^js [unparsed-synthetic-reference source-file]
   (.getWidth ^js unparsed-synthetic-reference source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [unparsed-synthetic-reference]
  (.getFullWidth ^js unparsed-synthetic-reference))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [unparsed-synthetic-reference]
   (.getLeadingTriviaWidth ^js unparsed-synthetic-reference))
  (^js [unparsed-synthetic-reference source-file]
   (.getLeadingTriviaWidth ^js unparsed-synthetic-reference source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [unparsed-synthetic-reference]
   (.getFullText ^js unparsed-synthetic-reference))
  (^js [unparsed-synthetic-reference source-file]
   (.getFullText ^js unparsed-synthetic-reference source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [unparsed-synthetic-reference]
   (.getText ^js unparsed-synthetic-reference))
  (^js [unparsed-synthetic-reference source-file]
   (.getText ^js unparsed-synthetic-reference source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [unparsed-synthetic-reference]
   (.getFirstToken ^js unparsed-synthetic-reference))
  (^js [unparsed-synthetic-reference source-file]
   (.getFirstToken ^js unparsed-synthetic-reference source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [unparsed-synthetic-reference]
   (.getLastToken ^js unparsed-synthetic-reference))
  (^js [unparsed-synthetic-reference source-file]
   (.getLastToken ^js unparsed-synthetic-reference source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [unparsed-synthetic-reference cb-node]
   (.forEachChild ^js unparsed-synthetic-reference cb-node))
  (^js [unparsed-synthetic-reference cb-node cb-node-array]
   (.forEachChild ^js unparsed-synthetic-reference cb-node cb-node-array)))

(defn pos
  ^js [unparsed-synthetic-reference]
  (.-pos ^js unparsed-synthetic-reference))

(defn end
  ^js [unparsed-synthetic-reference]
  (.-end ^js unparsed-synthetic-reference))
