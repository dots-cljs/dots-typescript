(ns dots.typescript.unparsed-prologue)

(defn kind
  "**Returns:** `SyntaxKind.UnparsedPrologue`"
  ^js [unparsed-prologue]
  (.-kind ^js unparsed-prologue))

(defn parent
  "**Returns:** `UnparsedSource`"
  ^js [unparsed-prologue]
  (.-parent ^js unparsed-prologue))

(defn data
  "**Returns:** `string`"
  ^js [unparsed-prologue]
  (.-data ^js unparsed-prologue))

(defn flags
  "**Returns:** `NodeFlags`"
  ^js [unparsed-prologue]
  (.-flags ^js unparsed-prologue))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [unparsed-prologue]
  (.getSourceFile ^js unparsed-prologue))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [unparsed-prologue]
   (.getChildCount ^js unparsed-prologue))
  (^js [unparsed-prologue source-file]
   (.getChildCount ^js unparsed-prologue source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [unparsed-prologue index]
   (.getChildAt ^js unparsed-prologue index))
  (^js [unparsed-prologue index source-file]
   (.getChildAt ^js unparsed-prologue index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [unparsed-prologue]
   (.getChildren ^js unparsed-prologue))
  (^js [unparsed-prologue source-file]
   (.getChildren ^js unparsed-prologue source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [unparsed-prologue]
   (.getStart ^js unparsed-prologue))
  (^js [unparsed-prologue source-file]
   (.getStart ^js unparsed-prologue source-file))
  (^js [unparsed-prologue source-file include-js-doc-comment?]
   (.getStart ^js unparsed-prologue source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [unparsed-prologue]
  (.getFullStart ^js unparsed-prologue))

(defn get-end
  "**Returns:** `number`"
  ^js [unparsed-prologue]
  (.getEnd ^js unparsed-prologue))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [unparsed-prologue]
   (.getWidth ^js unparsed-prologue))
  (^js [unparsed-prologue source-file]
   (.getWidth ^js unparsed-prologue source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [unparsed-prologue]
  (.getFullWidth ^js unparsed-prologue))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [unparsed-prologue]
   (.getLeadingTriviaWidth ^js unparsed-prologue))
  (^js [unparsed-prologue source-file]
   (.getLeadingTriviaWidth ^js unparsed-prologue source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [unparsed-prologue]
   (.getFullText ^js unparsed-prologue))
  (^js [unparsed-prologue source-file]
   (.getFullText ^js unparsed-prologue source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [unparsed-prologue]
   (.getText ^js unparsed-prologue))
  (^js [unparsed-prologue source-file]
   (.getText ^js unparsed-prologue source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [unparsed-prologue]
   (.getFirstToken ^js unparsed-prologue))
  (^js [unparsed-prologue source-file]
   (.getFirstToken ^js unparsed-prologue source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [unparsed-prologue]
   (.getLastToken ^js unparsed-prologue))
  (^js [unparsed-prologue source-file]
   (.getLastToken ^js unparsed-prologue source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [unparsed-prologue cb-node]
   (.forEachChild ^js unparsed-prologue cb-node))
  (^js [unparsed-prologue cb-node cb-node-array]
   (.forEachChild ^js unparsed-prologue cb-node cb-node-array)))

(defn pos
  "**Returns:** `number`"
  ^js [unparsed-prologue]
  (.-pos ^js unparsed-prologue))

(defn end
  "**Returns:** `number`"
  ^js [unparsed-prologue]
  (.-end ^js unparsed-prologue))
