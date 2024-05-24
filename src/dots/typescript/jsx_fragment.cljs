(ns dots.typescript.jsx-fragment)

(defn kind
  ^js [jsx-fragment]
  (.-kind ^js jsx-fragment))

(defn opening-fragment
  ^js [jsx-fragment]
  (.-openingFragment ^js jsx-fragment))

(defn children
  ^js [jsx-fragment]
  (.-children ^js jsx-fragment))

(defn closing-fragment
  ^js [jsx-fragment]
  (.-closingFragment ^js jsx-fragment))

(defn flags
  ^js [jsx-fragment]
  (.-flags ^js jsx-fragment))

(defn parent
  ^js [jsx-fragment]
  (.-parent ^js jsx-fragment))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [jsx-fragment]
  (.getSourceFile ^js jsx-fragment))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [jsx-fragment]
   (.getChildCount ^js jsx-fragment))
  (^js [jsx-fragment source-file]
   (.getChildCount ^js jsx-fragment source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [jsx-fragment index]
   (.getChildAt ^js jsx-fragment index))
  (^js [jsx-fragment index source-file]
   (.getChildAt ^js jsx-fragment index source-file)))

(defn get-children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [jsx-fragment]
   (.getChildren ^js jsx-fragment))
  (^js [jsx-fragment source-file]
   (.getChildren ^js jsx-fragment source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [jsx-fragment]
   (.getStart ^js jsx-fragment))
  (^js [jsx-fragment source-file]
   (.getStart ^js jsx-fragment source-file))
  (^js [jsx-fragment source-file include-js-doc-comment?]
   (.getStart ^js jsx-fragment source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [jsx-fragment]
  (.getFullStart ^js jsx-fragment))

(defn get-end
  "**Returns:** `number`"
  ^js [jsx-fragment]
  (.getEnd ^js jsx-fragment))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [jsx-fragment]
   (.getWidth ^js jsx-fragment))
  (^js [jsx-fragment source-file]
   (.getWidth ^js jsx-fragment source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [jsx-fragment]
  (.getFullWidth ^js jsx-fragment))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [jsx-fragment]
   (.getLeadingTriviaWidth ^js jsx-fragment))
  (^js [jsx-fragment source-file]
   (.getLeadingTriviaWidth ^js jsx-fragment source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [jsx-fragment]
   (.getFullText ^js jsx-fragment))
  (^js [jsx-fragment source-file]
   (.getFullText ^js jsx-fragment source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [jsx-fragment]
   (.getText ^js jsx-fragment))
  (^js [jsx-fragment source-file]
   (.getText ^js jsx-fragment source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [jsx-fragment]
   (.getFirstToken ^js jsx-fragment))
  (^js [jsx-fragment source-file]
   (.getFirstToken ^js jsx-fragment source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [jsx-fragment]
   (.getLastToken ^js jsx-fragment))
  (^js [jsx-fragment source-file]
   (.getLastToken ^js jsx-fragment source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [jsx-fragment cb-node]
   (.forEachChild ^js jsx-fragment cb-node))
  (^js [jsx-fragment cb-node cb-node-array]
   (.forEachChild ^js jsx-fragment cb-node cb-node-array)))

(defn pos
  ^js [jsx-fragment]
  (.-pos ^js jsx-fragment))

(defn end
  ^js [jsx-fragment]
  (.-end ^js jsx-fragment))
