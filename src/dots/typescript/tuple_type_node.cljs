(ns dots.typescript.tuple-type-node)

(defn kind
  ^js [tuple-type-node]
  (.-kind ^js tuple-type-node))

(defn elements
  ^js [tuple-type-node]
  (.-elements ^js tuple-type-node))

(defn flags
  ^js [tuple-type-node]
  (.-flags ^js tuple-type-node))

(defn parent
  ^js [tuple-type-node]
  (.-parent ^js tuple-type-node))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [tuple-type-node]
  (.getSourceFile ^js tuple-type-node))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [tuple-type-node]
   (.getChildCount ^js tuple-type-node))
  (^js [tuple-type-node source-file]
   (.getChildCount ^js tuple-type-node source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [tuple-type-node index]
   (.getChildAt ^js tuple-type-node index))
  (^js [tuple-type-node index source-file]
   (.getChildAt ^js tuple-type-node index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [tuple-type-node]
   (.getChildren ^js tuple-type-node))
  (^js [tuple-type-node source-file]
   (.getChildren ^js tuple-type-node source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [tuple-type-node]
   (.getStart ^js tuple-type-node))
  (^js [tuple-type-node source-file]
   (.getStart ^js tuple-type-node source-file))
  (^js [tuple-type-node source-file include-js-doc-comment?]
   (.getStart ^js tuple-type-node source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [tuple-type-node]
  (.getFullStart ^js tuple-type-node))

(defn get-end
  "**Returns:** `number`"
  ^js [tuple-type-node]
  (.getEnd ^js tuple-type-node))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [tuple-type-node]
   (.getWidth ^js tuple-type-node))
  (^js [tuple-type-node source-file]
   (.getWidth ^js tuple-type-node source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [tuple-type-node]
  (.getFullWidth ^js tuple-type-node))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [tuple-type-node]
   (.getLeadingTriviaWidth ^js tuple-type-node))
  (^js [tuple-type-node source-file]
   (.getLeadingTriviaWidth ^js tuple-type-node source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [tuple-type-node]
   (.getFullText ^js tuple-type-node))
  (^js [tuple-type-node source-file]
   (.getFullText ^js tuple-type-node source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [tuple-type-node]
   (.getText ^js tuple-type-node))
  (^js [tuple-type-node source-file]
   (.getText ^js tuple-type-node source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [tuple-type-node]
   (.getFirstToken ^js tuple-type-node))
  (^js [tuple-type-node source-file]
   (.getFirstToken ^js tuple-type-node source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [tuple-type-node]
   (.getLastToken ^js tuple-type-node))
  (^js [tuple-type-node source-file]
   (.getLastToken ^js tuple-type-node source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [tuple-type-node cb-node]
   (.forEachChild ^js tuple-type-node cb-node))
  (^js [tuple-type-node cb-node cb-node-array]
   (.forEachChild ^js tuple-type-node cb-node cb-node-array)))

(defn pos
  ^js [tuple-type-node]
  (.-pos ^js tuple-type-node))

(defn end
  ^js [tuple-type-node]
  (.-end ^js tuple-type-node))
