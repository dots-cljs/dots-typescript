(ns dots.typescript.type-assertion
  (:refer-clojure :exclude [type]))

(defn kind
  ^js [type-assertion]
  (.-kind ^js type-assertion))

(defn type
  ^js [type-assertion]
  (.-type ^js type-assertion))

(defn expression
  ^js [type-assertion]
  (.-expression ^js type-assertion))

(defn flags
  ^js [type-assertion]
  (.-flags ^js type-assertion))

(defn parent
  ^js [type-assertion]
  (.-parent ^js type-assertion))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [type-assertion]
  (.getSourceFile ^js type-assertion))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [type-assertion]
   (.getChildCount ^js type-assertion))
  (^js [type-assertion source-file]
   (.getChildCount ^js type-assertion source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [type-assertion index]
   (.getChildAt ^js type-assertion index))
  (^js [type-assertion index source-file]
   (.getChildAt ^js type-assertion index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [type-assertion]
   (.getChildren ^js type-assertion))
  (^js [type-assertion source-file]
   (.getChildren ^js type-assertion source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [type-assertion]
   (.getStart ^js type-assertion))
  (^js [type-assertion source-file]
   (.getStart ^js type-assertion source-file))
  (^js [type-assertion source-file include-js-doc-comment?]
   (.getStart ^js type-assertion source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [type-assertion]
  (.getFullStart ^js type-assertion))

(defn get-end
  "**Returns:** `number`"
  ^js [type-assertion]
  (.getEnd ^js type-assertion))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [type-assertion]
   (.getWidth ^js type-assertion))
  (^js [type-assertion source-file]
   (.getWidth ^js type-assertion source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [type-assertion]
  (.getFullWidth ^js type-assertion))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [type-assertion]
   (.getLeadingTriviaWidth ^js type-assertion))
  (^js [type-assertion source-file]
   (.getLeadingTriviaWidth ^js type-assertion source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [type-assertion]
   (.getFullText ^js type-assertion))
  (^js [type-assertion source-file]
   (.getFullText ^js type-assertion source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [type-assertion]
   (.getText ^js type-assertion))
  (^js [type-assertion source-file]
   (.getText ^js type-assertion source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [type-assertion]
   (.getFirstToken ^js type-assertion))
  (^js [type-assertion source-file]
   (.getFirstToken ^js type-assertion source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [type-assertion]
   (.getLastToken ^js type-assertion))
  (^js [type-assertion source-file]
   (.getLastToken ^js type-assertion source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [type-assertion cb-node]
   (.forEachChild ^js type-assertion cb-node))
  (^js [type-assertion cb-node cb-node-array]
   (.forEachChild ^js type-assertion cb-node cb-node-array)))

(defn pos
  ^js [type-assertion]
  (.-pos ^js type-assertion))

(defn end
  ^js [type-assertion]
  (.-end ^js type-assertion))
