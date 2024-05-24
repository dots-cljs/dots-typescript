(ns dots.typescript.super-expression)

(defn kind
  ^js [super-expression]
  (.-kind ^js super-expression))

(defn flags
  ^js [super-expression]
  (.-flags ^js super-expression))

(defn parent
  ^js [super-expression]
  (.-parent ^js super-expression))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [super-expression]
  (.getSourceFile ^js super-expression))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [super-expression]
   (.getChildCount ^js super-expression))
  (^js [super-expression source-file]
   (.getChildCount ^js super-expression source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [super-expression index]
   (.getChildAt ^js super-expression index))
  (^js [super-expression index source-file]
   (.getChildAt ^js super-expression index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [super-expression]
   (.getChildren ^js super-expression))
  (^js [super-expression source-file]
   (.getChildren ^js super-expression source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [super-expression]
   (.getStart ^js super-expression))
  (^js [super-expression source-file]
   (.getStart ^js super-expression source-file))
  (^js [super-expression source-file include-js-doc-comment?]
   (.getStart ^js super-expression source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [super-expression]
  (.getFullStart ^js super-expression))

(defn get-end
  "**Returns:** `number`"
  ^js [super-expression]
  (.getEnd ^js super-expression))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [super-expression]
   (.getWidth ^js super-expression))
  (^js [super-expression source-file]
   (.getWidth ^js super-expression source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [super-expression]
  (.getFullWidth ^js super-expression))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [super-expression]
   (.getLeadingTriviaWidth ^js super-expression))
  (^js [super-expression source-file]
   (.getLeadingTriviaWidth ^js super-expression source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [super-expression]
   (.getFullText ^js super-expression))
  (^js [super-expression source-file]
   (.getFullText ^js super-expression source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [super-expression]
   (.getText ^js super-expression))
  (^js [super-expression source-file]
   (.getText ^js super-expression source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [super-expression]
   (.getFirstToken ^js super-expression))
  (^js [super-expression source-file]
   (.getFirstToken ^js super-expression source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [super-expression]
   (.getLastToken ^js super-expression))
  (^js [super-expression source-file]
   (.getLastToken ^js super-expression source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [super-expression cb-node]
   (.forEachChild ^js super-expression cb-node))
  (^js [super-expression cb-node cb-node-array]
   (.forEachChild ^js super-expression cb-node cb-node-array)))

(defn pos
  ^js [super-expression]
  (.-pos ^js super-expression))

(defn end
  ^js [super-expression]
  (.-end ^js super-expression))
