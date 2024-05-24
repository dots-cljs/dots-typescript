(ns dots.typescript.unparsed-prepend)

(defn kind
  ^js [unparsed-prepend]
  (.-kind ^js unparsed-prepend))

(defn parent
  ^js [unparsed-prepend]
  (.-parent ^js unparsed-prepend))

(defn data
  ^js [unparsed-prepend]
  (.-data ^js unparsed-prepend))

(defn texts
  ^js [unparsed-prepend]
  (.-texts ^js unparsed-prepend))

(defn flags
  ^js [unparsed-prepend]
  (.-flags ^js unparsed-prepend))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [unparsed-prepend]
  (.getSourceFile ^js unparsed-prepend))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [unparsed-prepend]
   (.getChildCount ^js unparsed-prepend))
  (^js [unparsed-prepend source-file]
   (.getChildCount ^js unparsed-prepend source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [unparsed-prepend index]
   (.getChildAt ^js unparsed-prepend index))
  (^js [unparsed-prepend index source-file]
   (.getChildAt ^js unparsed-prepend index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [unparsed-prepend]
   (.getChildren ^js unparsed-prepend))
  (^js [unparsed-prepend source-file]
   (.getChildren ^js unparsed-prepend source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [unparsed-prepend]
   (.getStart ^js unparsed-prepend))
  (^js [unparsed-prepend source-file]
   (.getStart ^js unparsed-prepend source-file))
  (^js [unparsed-prepend source-file include-js-doc-comment?]
   (.getStart ^js unparsed-prepend source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [unparsed-prepend]
  (.getFullStart ^js unparsed-prepend))

(defn get-end
  "**Returns:** `number`"
  ^js [unparsed-prepend]
  (.getEnd ^js unparsed-prepend))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [unparsed-prepend]
   (.getWidth ^js unparsed-prepend))
  (^js [unparsed-prepend source-file]
   (.getWidth ^js unparsed-prepend source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [unparsed-prepend]
  (.getFullWidth ^js unparsed-prepend))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [unparsed-prepend]
   (.getLeadingTriviaWidth ^js unparsed-prepend))
  (^js [unparsed-prepend source-file]
   (.getLeadingTriviaWidth ^js unparsed-prepend source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [unparsed-prepend]
   (.getFullText ^js unparsed-prepend))
  (^js [unparsed-prepend source-file]
   (.getFullText ^js unparsed-prepend source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [unparsed-prepend]
   (.getText ^js unparsed-prepend))
  (^js [unparsed-prepend source-file]
   (.getText ^js unparsed-prepend source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [unparsed-prepend]
   (.getFirstToken ^js unparsed-prepend))
  (^js [unparsed-prepend source-file]
   (.getFirstToken ^js unparsed-prepend source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [unparsed-prepend]
   (.getLastToken ^js unparsed-prepend))
  (^js [unparsed-prepend source-file]
   (.getLastToken ^js unparsed-prepend source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [unparsed-prepend cb-node]
   (.forEachChild ^js unparsed-prepend cb-node))
  (^js [unparsed-prepend cb-node cb-node-array]
   (.forEachChild ^js unparsed-prepend cb-node cb-node-array)))

(defn pos
  ^js [unparsed-prepend]
  (.-pos ^js unparsed-prepend))

(defn end
  ^js [unparsed-prepend]
  (.-end ^js unparsed-prepend))
