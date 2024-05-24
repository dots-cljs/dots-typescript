(ns dots.typescript.namespace-export
  (:refer-clojure :exclude [name]))

(defn kind
  ^js [namespace-export]
  (.-kind ^js namespace-export))

(defn parent
  ^js [namespace-export]
  (.-parent ^js namespace-export))

(defn name
  ^js [namespace-export]
  (.-name ^js namespace-export))

(defn flags
  ^js [namespace-export]
  (.-flags ^js namespace-export))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [namespace-export]
  (.getSourceFile ^js namespace-export))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [namespace-export]
   (.getChildCount ^js namespace-export))
  (^js [namespace-export source-file]
   (.getChildCount ^js namespace-export source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [namespace-export index]
   (.getChildAt ^js namespace-export index))
  (^js [namespace-export index source-file]
   (.getChildAt ^js namespace-export index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [namespace-export]
   (.getChildren ^js namespace-export))
  (^js [namespace-export source-file]
   (.getChildren ^js namespace-export source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [namespace-export]
   (.getStart ^js namespace-export))
  (^js [namespace-export source-file]
   (.getStart ^js namespace-export source-file))
  (^js [namespace-export source-file include-js-doc-comment?]
   (.getStart ^js namespace-export source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [namespace-export]
  (.getFullStart ^js namespace-export))

(defn get-end
  "**Returns:** `number`"
  ^js [namespace-export]
  (.getEnd ^js namespace-export))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [namespace-export]
   (.getWidth ^js namespace-export))
  (^js [namespace-export source-file]
   (.getWidth ^js namespace-export source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [namespace-export]
  (.getFullWidth ^js namespace-export))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [namespace-export]
   (.getLeadingTriviaWidth ^js namespace-export))
  (^js [namespace-export source-file]
   (.getLeadingTriviaWidth ^js namespace-export source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [namespace-export]
   (.getFullText ^js namespace-export))
  (^js [namespace-export source-file]
   (.getFullText ^js namespace-export source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [namespace-export]
   (.getText ^js namespace-export))
  (^js [namespace-export source-file]
   (.getText ^js namespace-export source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [namespace-export]
   (.getFirstToken ^js namespace-export))
  (^js [namespace-export source-file]
   (.getFirstToken ^js namespace-export source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [namespace-export]
   (.getLastToken ^js namespace-export))
  (^js [namespace-export source-file]
   (.getLastToken ^js namespace-export source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [namespace-export cb-node]
   (.forEachChild ^js namespace-export cb-node))
  (^js [namespace-export cb-node cb-node-array]
   (.forEachChild ^js namespace-export cb-node cb-node-array)))

(defn pos
  ^js [namespace-export]
  (.-pos ^js namespace-export))

(defn end
  ^js [namespace-export]
  (.-end ^js namespace-export))
