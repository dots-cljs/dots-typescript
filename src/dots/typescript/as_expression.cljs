(ns dots.typescript.as-expression
  (:refer-clojure :exclude [type]))

(defn kind
  ^js [as-expression]
  (.-kind ^js as-expression))

(defn expression
  ^js [as-expression]
  (.-expression ^js as-expression))

(defn type
  ^js [as-expression]
  (.-type ^js as-expression))

(defn flags
  ^js [as-expression]
  (.-flags ^js as-expression))

(defn parent
  ^js [as-expression]
  (.-parent ^js as-expression))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [as-expression]
  (.getSourceFile ^js as-expression))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [as-expression]
   (.getChildCount ^js as-expression))
  (^js [as-expression source-file]
   (.getChildCount ^js as-expression source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [as-expression index]
   (.getChildAt ^js as-expression index))
  (^js [as-expression index source-file]
   (.getChildAt ^js as-expression index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [as-expression]
   (.getChildren ^js as-expression))
  (^js [as-expression source-file]
   (.getChildren ^js as-expression source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [as-expression]
   (.getStart ^js as-expression))
  (^js [as-expression source-file]
   (.getStart ^js as-expression source-file))
  (^js [as-expression source-file include-js-doc-comment?]
   (.getStart ^js as-expression source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [as-expression]
  (.getFullStart ^js as-expression))

(defn get-end
  "**Returns:** `number`"
  ^js [as-expression]
  (.getEnd ^js as-expression))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [as-expression]
   (.getWidth ^js as-expression))
  (^js [as-expression source-file]
   (.getWidth ^js as-expression source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [as-expression]
  (.getFullWidth ^js as-expression))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [as-expression]
   (.getLeadingTriviaWidth ^js as-expression))
  (^js [as-expression source-file]
   (.getLeadingTriviaWidth ^js as-expression source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [as-expression]
   (.getFullText ^js as-expression))
  (^js [as-expression source-file]
   (.getFullText ^js as-expression source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [as-expression]
   (.getText ^js as-expression))
  (^js [as-expression source-file]
   (.getText ^js as-expression source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [as-expression]
   (.getFirstToken ^js as-expression))
  (^js [as-expression source-file]
   (.getFirstToken ^js as-expression source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [as-expression]
   (.getLastToken ^js as-expression))
  (^js [as-expression source-file]
   (.getLastToken ^js as-expression source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [as-expression cb-node]
   (.forEachChild ^js as-expression cb-node))
  (^js [as-expression cb-node cb-node-array]
   (.forEachChild ^js as-expression cb-node cb-node-array)))

(defn pos
  ^js [as-expression]
  (.-pos ^js as-expression))

(defn end
  ^js [as-expression]
  (.-end ^js as-expression))
