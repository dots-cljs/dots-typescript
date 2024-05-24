(ns dots.typescript.super-element-access-expression)

(defn expression
  ^js [super-element-access-expression]
  (.-expression ^js super-element-access-expression))

(defn kind
  ^js [super-element-access-expression]
  (.-kind ^js super-element-access-expression))

(defn question-dot-token
  ^js [super-element-access-expression]
  (.-questionDotToken ^js super-element-access-expression))

(defn argument-expression
  ^js [super-element-access-expression]
  (.-argumentExpression ^js super-element-access-expression))

(defn flags
  ^js [super-element-access-expression]
  (.-flags ^js super-element-access-expression))

(defn parent
  ^js [super-element-access-expression]
  (.-parent ^js super-element-access-expression))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [super-element-access-expression]
  (.getSourceFile ^js super-element-access-expression))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [super-element-access-expression]
   (.getChildCount ^js super-element-access-expression))
  (^js [super-element-access-expression source-file]
   (.getChildCount ^js super-element-access-expression source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [super-element-access-expression index]
   (.getChildAt ^js super-element-access-expression index))
  (^js [super-element-access-expression index source-file]
   (.getChildAt ^js super-element-access-expression index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [super-element-access-expression]
   (.getChildren ^js super-element-access-expression))
  (^js [super-element-access-expression source-file]
   (.getChildren ^js super-element-access-expression source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [super-element-access-expression]
   (.getStart ^js super-element-access-expression))
  (^js [super-element-access-expression source-file]
   (.getStart ^js super-element-access-expression source-file))
  (^js [super-element-access-expression source-file include-js-doc-comment?]
   (.getStart ^js super-element-access-expression source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [super-element-access-expression]
  (.getFullStart ^js super-element-access-expression))

(defn get-end
  "**Returns:** `number`"
  ^js [super-element-access-expression]
  (.getEnd ^js super-element-access-expression))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [super-element-access-expression]
   (.getWidth ^js super-element-access-expression))
  (^js [super-element-access-expression source-file]
   (.getWidth ^js super-element-access-expression source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [super-element-access-expression]
  (.getFullWidth ^js super-element-access-expression))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [super-element-access-expression]
   (.getLeadingTriviaWidth ^js super-element-access-expression))
  (^js [super-element-access-expression source-file]
   (.getLeadingTriviaWidth ^js super-element-access-expression source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [super-element-access-expression]
   (.getFullText ^js super-element-access-expression))
  (^js [super-element-access-expression source-file]
   (.getFullText ^js super-element-access-expression source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [super-element-access-expression]
   (.getText ^js super-element-access-expression))
  (^js [super-element-access-expression source-file]
   (.getText ^js super-element-access-expression source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [super-element-access-expression]
   (.getFirstToken ^js super-element-access-expression))
  (^js [super-element-access-expression source-file]
   (.getFirstToken ^js super-element-access-expression source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [super-element-access-expression]
   (.getLastToken ^js super-element-access-expression))
  (^js [super-element-access-expression source-file]
   (.getLastToken ^js super-element-access-expression source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [super-element-access-expression cb-node]
   (.forEachChild ^js super-element-access-expression cb-node))
  (^js [super-element-access-expression cb-node cb-node-array]
   (.forEachChild ^js super-element-access-expression cb-node cb-node-array)))

(defn pos
  ^js [super-element-access-expression]
  (.-pos ^js super-element-access-expression))

(defn end
  ^js [super-element-access-expression]
  (.-end ^js super-element-access-expression))
