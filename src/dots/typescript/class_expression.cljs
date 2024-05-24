(ns dots.typescript.class-expression
  (:refer-clojure :exclude [name]))

(defn kind
  ^js [class-expression]
  (.-kind ^js class-expression))

(defn modifiers
  ^js [class-expression]
  (.-modifiers ^js class-expression))

(defn name
  ^js [class-expression]
  (.-name ^js class-expression))

(defn type-parameters
  ^js [class-expression]
  (.-typeParameters ^js class-expression))

(defn heritage-clauses
  ^js [class-expression]
  (.-heritageClauses ^js class-expression))

(defn members
  ^js [class-expression]
  (.-members ^js class-expression))

(defn flags
  ^js [class-expression]
  (.-flags ^js class-expression))

(defn parent
  ^js [class-expression]
  (.-parent ^js class-expression))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [class-expression]
  (.getSourceFile ^js class-expression))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [class-expression]
   (.getChildCount ^js class-expression))
  (^js [class-expression source-file]
   (.getChildCount ^js class-expression source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [class-expression index]
   (.getChildAt ^js class-expression index))
  (^js [class-expression index source-file]
   (.getChildAt ^js class-expression index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [class-expression]
   (.getChildren ^js class-expression))
  (^js [class-expression source-file]
   (.getChildren ^js class-expression source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [class-expression]
   (.getStart ^js class-expression))
  (^js [class-expression source-file]
   (.getStart ^js class-expression source-file))
  (^js [class-expression source-file include-js-doc-comment?]
   (.getStart ^js class-expression source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [class-expression]
  (.getFullStart ^js class-expression))

(defn get-end
  "**Returns:** `number`"
  ^js [class-expression]
  (.getEnd ^js class-expression))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [class-expression]
   (.getWidth ^js class-expression))
  (^js [class-expression source-file]
   (.getWidth ^js class-expression source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [class-expression]
  (.getFullWidth ^js class-expression))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [class-expression]
   (.getLeadingTriviaWidth ^js class-expression))
  (^js [class-expression source-file]
   (.getLeadingTriviaWidth ^js class-expression source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [class-expression]
   (.getFullText ^js class-expression))
  (^js [class-expression source-file]
   (.getFullText ^js class-expression source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [class-expression]
   (.getText ^js class-expression))
  (^js [class-expression source-file]
   (.getText ^js class-expression source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [class-expression]
   (.getFirstToken ^js class-expression))
  (^js [class-expression source-file]
   (.getFirstToken ^js class-expression source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [class-expression]
   (.getLastToken ^js class-expression))
  (^js [class-expression source-file]
   (.getLastToken ^js class-expression source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [class-expression cb-node]
   (.forEachChild ^js class-expression cb-node))
  (^js [class-expression cb-node cb-node-array]
   (.forEachChild ^js class-expression cb-node cb-node-array)))

(defn pos
  ^js [class-expression]
  (.-pos ^js class-expression))

(defn end
  ^js [class-expression]
  (.-end ^js class-expression))
