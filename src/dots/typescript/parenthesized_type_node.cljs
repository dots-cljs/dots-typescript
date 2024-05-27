(ns dots.typescript.parenthesized-type-node
  (:refer-clojure :exclude [type]))

(defn kind
  "**Returns:** `SyntaxKind.ParenthesizedType`"
  ^js [parenthesized-type-node]
  (.-kind ^js parenthesized-type-node))

(defn type
  "**Returns:** `TypeNode`"
  ^js [parenthesized-type-node]
  (.-type ^js parenthesized-type-node))

(defn flags
  "**Returns:** `NodeFlags`"
  ^js [parenthesized-type-node]
  (.-flags ^js parenthesized-type-node))

(defn parent
  "**Returns:** `Node`"
  ^js [parenthesized-type-node]
  (.-parent ^js parenthesized-type-node))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [parenthesized-type-node]
  (.getSourceFile ^js parenthesized-type-node))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [parenthesized-type-node]
   (.getChildCount ^js parenthesized-type-node))
  (^js [parenthesized-type-node source-file]
   (.getChildCount ^js parenthesized-type-node source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [parenthesized-type-node index]
   (.getChildAt ^js parenthesized-type-node index))
  (^js [parenthesized-type-node index source-file]
   (.getChildAt ^js parenthesized-type-node index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [parenthesized-type-node]
   (.getChildren ^js parenthesized-type-node))
  (^js [parenthesized-type-node source-file]
   (.getChildren ^js parenthesized-type-node source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [parenthesized-type-node]
   (.getStart ^js parenthesized-type-node))
  (^js [parenthesized-type-node source-file]
   (.getStart ^js parenthesized-type-node source-file))
  (^js [parenthesized-type-node source-file include-js-doc-comment?]
   (.getStart ^js parenthesized-type-node source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [parenthesized-type-node]
  (.getFullStart ^js parenthesized-type-node))

(defn get-end
  "**Returns:** `number`"
  ^js [parenthesized-type-node]
  (.getEnd ^js parenthesized-type-node))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [parenthesized-type-node]
   (.getWidth ^js parenthesized-type-node))
  (^js [parenthesized-type-node source-file]
   (.getWidth ^js parenthesized-type-node source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [parenthesized-type-node]
  (.getFullWidth ^js parenthesized-type-node))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [parenthesized-type-node]
   (.getLeadingTriviaWidth ^js parenthesized-type-node))
  (^js [parenthesized-type-node source-file]
   (.getLeadingTriviaWidth ^js parenthesized-type-node source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [parenthesized-type-node]
   (.getFullText ^js parenthesized-type-node))
  (^js [parenthesized-type-node source-file]
   (.getFullText ^js parenthesized-type-node source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [parenthesized-type-node]
   (.getText ^js parenthesized-type-node))
  (^js [parenthesized-type-node source-file]
   (.getText ^js parenthesized-type-node source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [parenthesized-type-node]
   (.getFirstToken ^js parenthesized-type-node))
  (^js [parenthesized-type-node source-file]
   (.getFirstToken ^js parenthesized-type-node source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [parenthesized-type-node]
   (.getLastToken ^js parenthesized-type-node))
  (^js [parenthesized-type-node source-file]
   (.getLastToken ^js parenthesized-type-node source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [parenthesized-type-node cb-node]
   (.forEachChild ^js parenthesized-type-node cb-node))
  (^js [parenthesized-type-node cb-node cb-node-array]
   (.forEachChild ^js parenthesized-type-node cb-node cb-node-array)))

(defn pos
  "**Returns:** `number`"
  ^js [parenthesized-type-node]
  (.-pos ^js parenthesized-type-node))

(defn end
  "**Returns:** `number`"
  ^js [parenthesized-type-node]
  (.-end ^js parenthesized-type-node))
