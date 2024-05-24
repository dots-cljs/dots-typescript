(ns dots.typescript.import-attribute
  (:refer-clojure :exclude [name]))

(defn kind
  ^js [import-attribute]
  (.-kind ^js import-attribute))

(defn parent
  ^js [import-attribute]
  (.-parent ^js import-attribute))

(defn name
  ^js [import-attribute]
  (.-name ^js import-attribute))

(defn value
  ^js [import-attribute]
  (.-value ^js import-attribute))

(defn flags
  ^js [import-attribute]
  (.-flags ^js import-attribute))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [import-attribute]
  (.getSourceFile ^js import-attribute))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [import-attribute]
   (.getChildCount ^js import-attribute))
  (^js [import-attribute source-file]
   (.getChildCount ^js import-attribute source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [import-attribute index]
   (.getChildAt ^js import-attribute index))
  (^js [import-attribute index source-file]
   (.getChildAt ^js import-attribute index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [import-attribute]
   (.getChildren ^js import-attribute))
  (^js [import-attribute source-file]
   (.getChildren ^js import-attribute source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [import-attribute]
   (.getStart ^js import-attribute))
  (^js [import-attribute source-file]
   (.getStart ^js import-attribute source-file))
  (^js [import-attribute source-file include-js-doc-comment?]
   (.getStart ^js import-attribute source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [import-attribute]
  (.getFullStart ^js import-attribute))

(defn get-end
  "**Returns:** `number`"
  ^js [import-attribute]
  (.getEnd ^js import-attribute))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [import-attribute]
   (.getWidth ^js import-attribute))
  (^js [import-attribute source-file]
   (.getWidth ^js import-attribute source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [import-attribute]
  (.getFullWidth ^js import-attribute))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [import-attribute]
   (.getLeadingTriviaWidth ^js import-attribute))
  (^js [import-attribute source-file]
   (.getLeadingTriviaWidth ^js import-attribute source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [import-attribute]
   (.getFullText ^js import-attribute))
  (^js [import-attribute source-file]
   (.getFullText ^js import-attribute source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [import-attribute]
   (.getText ^js import-attribute))
  (^js [import-attribute source-file]
   (.getText ^js import-attribute source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [import-attribute]
   (.getFirstToken ^js import-attribute))
  (^js [import-attribute source-file]
   (.getFirstToken ^js import-attribute source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [import-attribute]
   (.getLastToken ^js import-attribute))
  (^js [import-attribute source-file]
   (.getLastToken ^js import-attribute source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [import-attribute cb-node]
   (.forEachChild ^js import-attribute cb-node))
  (^js [import-attribute cb-node cb-node-array]
   (.forEachChild ^js import-attribute cb-node cb-node-array)))

(defn pos
  ^js [import-attribute]
  (.-pos ^js import-attribute))

(defn end
  ^js [import-attribute]
  (.-end ^js import-attribute))
