(ns dots.typescript.punctuation-token)

(defn kind
  "**Returns:** `TKind`"
  ^js [punctuation-token]
  (.-kind ^js punctuation-token))

(defn flags
  "**Returns:** `NodeFlags`"
  ^js [punctuation-token]
  (.-flags ^js punctuation-token))

(defn parent
  "**Returns:** `Node`"
  ^js [punctuation-token]
  (.-parent ^js punctuation-token))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [punctuation-token]
  (.getSourceFile ^js punctuation-token))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [punctuation-token]
   (.getChildCount ^js punctuation-token))
  (^js [punctuation-token source-file]
   (.getChildCount ^js punctuation-token source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [punctuation-token index]
   (.getChildAt ^js punctuation-token index))
  (^js [punctuation-token index source-file]
   (.getChildAt ^js punctuation-token index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [punctuation-token]
   (.getChildren ^js punctuation-token))
  (^js [punctuation-token source-file]
   (.getChildren ^js punctuation-token source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [punctuation-token]
   (.getStart ^js punctuation-token))
  (^js [punctuation-token source-file]
   (.getStart ^js punctuation-token source-file))
  (^js [punctuation-token source-file include-js-doc-comment?]
   (.getStart ^js punctuation-token source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [punctuation-token]
  (.getFullStart ^js punctuation-token))

(defn get-end
  "**Returns:** `number`"
  ^js [punctuation-token]
  (.getEnd ^js punctuation-token))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [punctuation-token]
   (.getWidth ^js punctuation-token))
  (^js [punctuation-token source-file]
   (.getWidth ^js punctuation-token source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [punctuation-token]
  (.getFullWidth ^js punctuation-token))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [punctuation-token]
   (.getLeadingTriviaWidth ^js punctuation-token))
  (^js [punctuation-token source-file]
   (.getLeadingTriviaWidth ^js punctuation-token source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [punctuation-token]
   (.getFullText ^js punctuation-token))
  (^js [punctuation-token source-file]
   (.getFullText ^js punctuation-token source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [punctuation-token]
   (.getText ^js punctuation-token))
  (^js [punctuation-token source-file]
   (.getText ^js punctuation-token source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [punctuation-token]
   (.getFirstToken ^js punctuation-token))
  (^js [punctuation-token source-file]
   (.getFirstToken ^js punctuation-token source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [punctuation-token]
   (.getLastToken ^js punctuation-token))
  (^js [punctuation-token source-file]
   (.getLastToken ^js punctuation-token source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [punctuation-token cb-node]
   (.forEachChild ^js punctuation-token cb-node))
  (^js [punctuation-token cb-node cb-node-array]
   (.forEachChild ^js punctuation-token cb-node cb-node-array)))

(defn pos
  "**Returns:** `number`"
  ^js [punctuation-token]
  (.-pos ^js punctuation-token))

(defn end
  "**Returns:** `number`"
  ^js [punctuation-token]
  (.-end ^js punctuation-token))
