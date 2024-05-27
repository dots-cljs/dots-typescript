(ns dots.typescript.satisfies-expression
  (:refer-clojure :exclude [type]))

(defn kind
  "**Returns:** `SyntaxKind.SatisfiesExpression`"
  ^js [satisfies-expression]
  (.-kind ^js satisfies-expression))

(defn expression
  "**Returns:** `Expression`"
  ^js [satisfies-expression]
  (.-expression ^js satisfies-expression))

(defn type
  "**Returns:** `TypeNode`"
  ^js [satisfies-expression]
  (.-type ^js satisfies-expression))

(defn flags
  "**Returns:** `NodeFlags`"
  ^js [satisfies-expression]
  (.-flags ^js satisfies-expression))

(defn parent
  "**Returns:** `Node`"
  ^js [satisfies-expression]
  (.-parent ^js satisfies-expression))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [satisfies-expression]
  (.getSourceFile ^js satisfies-expression))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [satisfies-expression]
   (.getChildCount ^js satisfies-expression))
  (^js [satisfies-expression source-file]
   (.getChildCount ^js satisfies-expression source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [satisfies-expression index]
   (.getChildAt ^js satisfies-expression index))
  (^js [satisfies-expression index source-file]
   (.getChildAt ^js satisfies-expression index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [satisfies-expression]
   (.getChildren ^js satisfies-expression))
  (^js [satisfies-expression source-file]
   (.getChildren ^js satisfies-expression source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [satisfies-expression]
   (.getStart ^js satisfies-expression))
  (^js [satisfies-expression source-file]
   (.getStart ^js satisfies-expression source-file))
  (^js [satisfies-expression source-file include-js-doc-comment?]
   (.getStart ^js satisfies-expression source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [satisfies-expression]
  (.getFullStart ^js satisfies-expression))

(defn get-end
  "**Returns:** `number`"
  ^js [satisfies-expression]
  (.getEnd ^js satisfies-expression))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [satisfies-expression]
   (.getWidth ^js satisfies-expression))
  (^js [satisfies-expression source-file]
   (.getWidth ^js satisfies-expression source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [satisfies-expression]
  (.getFullWidth ^js satisfies-expression))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [satisfies-expression]
   (.getLeadingTriviaWidth ^js satisfies-expression))
  (^js [satisfies-expression source-file]
   (.getLeadingTriviaWidth ^js satisfies-expression source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [satisfies-expression]
   (.getFullText ^js satisfies-expression))
  (^js [satisfies-expression source-file]
   (.getFullText ^js satisfies-expression source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [satisfies-expression]
   (.getText ^js satisfies-expression))
  (^js [satisfies-expression source-file]
   (.getText ^js satisfies-expression source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [satisfies-expression]
   (.getFirstToken ^js satisfies-expression))
  (^js [satisfies-expression source-file]
   (.getFirstToken ^js satisfies-expression source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [satisfies-expression]
   (.getLastToken ^js satisfies-expression))
  (^js [satisfies-expression source-file]
   (.getLastToken ^js satisfies-expression source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [satisfies-expression cb-node]
   (.forEachChild ^js satisfies-expression cb-node))
  (^js [satisfies-expression cb-node cb-node-array]
   (.forEachChild ^js satisfies-expression cb-node cb-node-array)))

(defn pos
  "**Returns:** `number`"
  ^js [satisfies-expression]
  (.-pos ^js satisfies-expression))

(defn end
  "**Returns:** `number`"
  ^js [satisfies-expression]
  (.-end ^js satisfies-expression))
