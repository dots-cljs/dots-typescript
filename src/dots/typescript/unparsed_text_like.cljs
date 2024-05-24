(ns dots.typescript.unparsed-text-like)

(defn kind
  ^js [unparsed-text-like]
  (.-kind ^js unparsed-text-like))

(defn parent
  ^js [unparsed-text-like]
  (.-parent ^js unparsed-text-like))

(defn data
  ^js [unparsed-text-like]
  (.-data ^js unparsed-text-like))

(defn flags
  ^js [unparsed-text-like]
  (.-flags ^js unparsed-text-like))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [unparsed-text-like]
  (.getSourceFile ^js unparsed-text-like))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [unparsed-text-like]
   (.getChildCount ^js unparsed-text-like))
  (^js [unparsed-text-like source-file]
   (.getChildCount ^js unparsed-text-like source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [unparsed-text-like index]
   (.getChildAt ^js unparsed-text-like index))
  (^js [unparsed-text-like index source-file]
   (.getChildAt ^js unparsed-text-like index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [unparsed-text-like]
   (.getChildren ^js unparsed-text-like))
  (^js [unparsed-text-like source-file]
   (.getChildren ^js unparsed-text-like source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [unparsed-text-like]
   (.getStart ^js unparsed-text-like))
  (^js [unparsed-text-like source-file]
   (.getStart ^js unparsed-text-like source-file))
  (^js [unparsed-text-like source-file include-js-doc-comment?]
   (.getStart ^js unparsed-text-like source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [unparsed-text-like]
  (.getFullStart ^js unparsed-text-like))

(defn get-end
  "**Returns:** `number`"
  ^js [unparsed-text-like]
  (.getEnd ^js unparsed-text-like))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [unparsed-text-like]
   (.getWidth ^js unparsed-text-like))
  (^js [unparsed-text-like source-file]
   (.getWidth ^js unparsed-text-like source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [unparsed-text-like]
  (.getFullWidth ^js unparsed-text-like))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [unparsed-text-like]
   (.getLeadingTriviaWidth ^js unparsed-text-like))
  (^js [unparsed-text-like source-file]
   (.getLeadingTriviaWidth ^js unparsed-text-like source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [unparsed-text-like]
   (.getFullText ^js unparsed-text-like))
  (^js [unparsed-text-like source-file]
   (.getFullText ^js unparsed-text-like source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [unparsed-text-like]
   (.getText ^js unparsed-text-like))
  (^js [unparsed-text-like source-file]
   (.getText ^js unparsed-text-like source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [unparsed-text-like]
   (.getFirstToken ^js unparsed-text-like))
  (^js [unparsed-text-like source-file]
   (.getFirstToken ^js unparsed-text-like source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [unparsed-text-like]
   (.getLastToken ^js unparsed-text-like))
  (^js [unparsed-text-like source-file]
   (.getLastToken ^js unparsed-text-like source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [unparsed-text-like cb-node]
   (.forEachChild ^js unparsed-text-like cb-node))
  (^js [unparsed-text-like cb-node cb-node-array]
   (.forEachChild ^js unparsed-text-like cb-node cb-node-array)))

(defn pos
  ^js [unparsed-text-like]
  (.-pos ^js unparsed-text-like))

(defn end
  ^js [unparsed-text-like]
  (.-end ^js unparsed-text-like))
