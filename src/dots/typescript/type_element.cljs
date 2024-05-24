(ns dots.typescript.type-element
  (:refer-clojure :exclude [name]))

(defn name
  ^js [type-element]
  (.-name ^js type-element))

(defn question-token
  ^js [type-element]
  (.-questionToken ^js type-element))

(defn kind
  ^js [type-element]
  (.-kind ^js type-element))

(defn flags
  ^js [type-element]
  (.-flags ^js type-element))

(defn parent
  ^js [type-element]
  (.-parent ^js type-element))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [type-element]
  (.getSourceFile ^js type-element))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [type-element]
   (.getChildCount ^js type-element))
  (^js [type-element source-file]
   (.getChildCount ^js type-element source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [type-element index]
   (.getChildAt ^js type-element index))
  (^js [type-element index source-file]
   (.getChildAt ^js type-element index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [type-element]
   (.getChildren ^js type-element))
  (^js [type-element source-file]
   (.getChildren ^js type-element source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [type-element]
   (.getStart ^js type-element))
  (^js [type-element source-file]
   (.getStart ^js type-element source-file))
  (^js [type-element source-file include-js-doc-comment?]
   (.getStart ^js type-element source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [type-element]
  (.getFullStart ^js type-element))

(defn get-end
  "**Returns:** `number`"
  ^js [type-element]
  (.getEnd ^js type-element))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [type-element]
   (.getWidth ^js type-element))
  (^js [type-element source-file]
   (.getWidth ^js type-element source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [type-element]
  (.getFullWidth ^js type-element))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [type-element]
   (.getLeadingTriviaWidth ^js type-element))
  (^js [type-element source-file]
   (.getLeadingTriviaWidth ^js type-element source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [type-element]
   (.getFullText ^js type-element))
  (^js [type-element source-file]
   (.getFullText ^js type-element source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [type-element]
   (.getText ^js type-element))
  (^js [type-element source-file]
   (.getText ^js type-element source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [type-element]
   (.getFirstToken ^js type-element))
  (^js [type-element source-file]
   (.getFirstToken ^js type-element source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [type-element]
   (.getLastToken ^js type-element))
  (^js [type-element source-file]
   (.getLastToken ^js type-element source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [type-element cb-node]
   (.forEachChild ^js type-element cb-node))
  (^js [type-element cb-node cb-node-array]
   (.forEachChild ^js type-element cb-node cb-node-array)))

(defn pos
  ^js [type-element]
  (.-pos ^js type-element))

(defn end
  ^js [type-element]
  (.-end ^js type-element))
