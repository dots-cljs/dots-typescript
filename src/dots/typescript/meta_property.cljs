(ns dots.typescript.meta-property
  (:refer-clojure :exclude [name]))

(defn kind
  ^js [meta-property]
  (.-kind ^js meta-property))

(defn keyword-token
  ^js [meta-property]
  (.-keywordToken ^js meta-property))

(defn name
  ^js [meta-property]
  (.-name ^js meta-property))

(defn flags
  ^js [meta-property]
  (.-flags ^js meta-property))

(defn parent
  ^js [meta-property]
  (.-parent ^js meta-property))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [meta-property]
  (.getSourceFile ^js meta-property))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [meta-property]
   (.getChildCount ^js meta-property))
  (^js [meta-property source-file]
   (.getChildCount ^js meta-property source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [meta-property index]
   (.getChildAt ^js meta-property index))
  (^js [meta-property index source-file]
   (.getChildAt ^js meta-property index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [meta-property]
   (.getChildren ^js meta-property))
  (^js [meta-property source-file]
   (.getChildren ^js meta-property source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [meta-property]
   (.getStart ^js meta-property))
  (^js [meta-property source-file]
   (.getStart ^js meta-property source-file))
  (^js [meta-property source-file include-js-doc-comment?]
   (.getStart ^js meta-property source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [meta-property]
  (.getFullStart ^js meta-property))

(defn get-end
  "**Returns:** `number`"
  ^js [meta-property]
  (.getEnd ^js meta-property))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [meta-property]
   (.getWidth ^js meta-property))
  (^js [meta-property source-file]
   (.getWidth ^js meta-property source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [meta-property]
  (.getFullWidth ^js meta-property))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [meta-property]
   (.getLeadingTriviaWidth ^js meta-property))
  (^js [meta-property source-file]
   (.getLeadingTriviaWidth ^js meta-property source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [meta-property]
   (.getFullText ^js meta-property))
  (^js [meta-property source-file]
   (.getFullText ^js meta-property source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [meta-property]
   (.getText ^js meta-property))
  (^js [meta-property source-file]
   (.getText ^js meta-property source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [meta-property]
   (.getFirstToken ^js meta-property))
  (^js [meta-property source-file]
   (.getFirstToken ^js meta-property source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [meta-property]
   (.getLastToken ^js meta-property))
  (^js [meta-property source-file]
   (.getLastToken ^js meta-property source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [meta-property cb-node]
   (.forEachChild ^js meta-property cb-node))
  (^js [meta-property cb-node cb-node-array]
   (.forEachChild ^js meta-property cb-node cb-node-array)))

(defn pos
  ^js [meta-property]
  (.-pos ^js meta-property))

(defn end
  ^js [meta-property]
  (.-end ^js meta-property))
