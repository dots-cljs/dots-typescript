(ns dots.typescript.mapped-type-node
  (:refer-clojure :exclude [type]))

(defn kind
  ^js [mapped-type-node]
  (.-kind ^js mapped-type-node))

(defn readonly-token
  ^js [mapped-type-node]
  (.-readonlyToken ^js mapped-type-node))

(defn type-parameter
  ^js [mapped-type-node]
  (.-typeParameter ^js mapped-type-node))

(defn name-type
  ^js [mapped-type-node]
  (.-nameType ^js mapped-type-node))

(defn question-token
  ^js [mapped-type-node]
  (.-questionToken ^js mapped-type-node))

(defn type
  ^js [mapped-type-node]
  (.-type ^js mapped-type-node))

(defn members
  "Used only to produce grammar errors"
  ^js [mapped-type-node]
  (.-members ^js mapped-type-node))

(defn flags
  ^js [mapped-type-node]
  (.-flags ^js mapped-type-node))

(defn parent
  ^js [mapped-type-node]
  (.-parent ^js mapped-type-node))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [mapped-type-node]
  (.getSourceFile ^js mapped-type-node))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [mapped-type-node]
   (.getChildCount ^js mapped-type-node))
  (^js [mapped-type-node source-file]
   (.getChildCount ^js mapped-type-node source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [mapped-type-node index]
   (.getChildAt ^js mapped-type-node index))
  (^js [mapped-type-node index source-file]
   (.getChildAt ^js mapped-type-node index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [mapped-type-node]
   (.getChildren ^js mapped-type-node))
  (^js [mapped-type-node source-file]
   (.getChildren ^js mapped-type-node source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [mapped-type-node]
   (.getStart ^js mapped-type-node))
  (^js [mapped-type-node source-file]
   (.getStart ^js mapped-type-node source-file))
  (^js [mapped-type-node source-file include-js-doc-comment?]
   (.getStart ^js mapped-type-node source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [mapped-type-node]
  (.getFullStart ^js mapped-type-node))

(defn get-end
  "**Returns:** `number`"
  ^js [mapped-type-node]
  (.getEnd ^js mapped-type-node))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [mapped-type-node]
   (.getWidth ^js mapped-type-node))
  (^js [mapped-type-node source-file]
   (.getWidth ^js mapped-type-node source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [mapped-type-node]
  (.getFullWidth ^js mapped-type-node))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [mapped-type-node]
   (.getLeadingTriviaWidth ^js mapped-type-node))
  (^js [mapped-type-node source-file]
   (.getLeadingTriviaWidth ^js mapped-type-node source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [mapped-type-node]
   (.getFullText ^js mapped-type-node))
  (^js [mapped-type-node source-file]
   (.getFullText ^js mapped-type-node source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [mapped-type-node]
   (.getText ^js mapped-type-node))
  (^js [mapped-type-node source-file]
   (.getText ^js mapped-type-node source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [mapped-type-node]
   (.getFirstToken ^js mapped-type-node))
  (^js [mapped-type-node source-file]
   (.getFirstToken ^js mapped-type-node source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [mapped-type-node]
   (.getLastToken ^js mapped-type-node))
  (^js [mapped-type-node source-file]
   (.getLastToken ^js mapped-type-node source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [mapped-type-node cb-node]
   (.forEachChild ^js mapped-type-node cb-node))
  (^js [mapped-type-node cb-node cb-node-array]
   (.forEachChild ^js mapped-type-node cb-node cb-node-array)))

(defn pos
  ^js [mapped-type-node]
  (.-pos ^js mapped-type-node))

(defn end
  ^js [mapped-type-node]
  (.-end ^js mapped-type-node))
