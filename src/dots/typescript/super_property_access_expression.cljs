(ns dots.typescript.super-property-access-expression
  (:refer-clojure :exclude [name]))

(defn expression
  "**Returns:** `SuperExpression`"
  ^js [super-property-access-expression]
  (.-expression ^js super-property-access-expression))

(defn kind
  "**Returns:** `SyntaxKind.PropertyAccessExpression`"
  ^js [super-property-access-expression]
  (.-kind ^js super-property-access-expression))

(defn question-dot-token
  "**Returns:** `QuestionDotToken | undefined`"
  ^js [super-property-access-expression]
  (.-questionDotToken ^js super-property-access-expression))

(defn name
  "**Returns:** `MemberName`"
  ^js [super-property-access-expression]
  (.-name ^js super-property-access-expression))

(defn flags
  "**Returns:** `NodeFlags`"
  ^js [super-property-access-expression]
  (.-flags ^js super-property-access-expression))

(defn parent
  "**Returns:** `Node`"
  ^js [super-property-access-expression]
  (.-parent ^js super-property-access-expression))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [super-property-access-expression]
  (.getSourceFile ^js super-property-access-expression))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [super-property-access-expression]
   (.getChildCount ^js super-property-access-expression))
  (^js [super-property-access-expression source-file]
   (.getChildCount ^js super-property-access-expression source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [super-property-access-expression index]
   (.getChildAt ^js super-property-access-expression index))
  (^js [super-property-access-expression index source-file]
   (.getChildAt ^js super-property-access-expression index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [super-property-access-expression]
   (.getChildren ^js super-property-access-expression))
  (^js [super-property-access-expression source-file]
   (.getChildren ^js super-property-access-expression source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [super-property-access-expression]
   (.getStart ^js super-property-access-expression))
  (^js [super-property-access-expression source-file]
   (.getStart ^js super-property-access-expression source-file))
  (^js [super-property-access-expression source-file include-js-doc-comment?]
   (.getStart ^js super-property-access-expression source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [super-property-access-expression]
  (.getFullStart ^js super-property-access-expression))

(defn get-end
  "**Returns:** `number`"
  ^js [super-property-access-expression]
  (.getEnd ^js super-property-access-expression))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [super-property-access-expression]
   (.getWidth ^js super-property-access-expression))
  (^js [super-property-access-expression source-file]
   (.getWidth ^js super-property-access-expression source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [super-property-access-expression]
  (.getFullWidth ^js super-property-access-expression))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [super-property-access-expression]
   (.getLeadingTriviaWidth ^js super-property-access-expression))
  (^js [super-property-access-expression source-file]
   (.getLeadingTriviaWidth ^js super-property-access-expression source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [super-property-access-expression]
   (.getFullText ^js super-property-access-expression))
  (^js [super-property-access-expression source-file]
   (.getFullText ^js super-property-access-expression source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [super-property-access-expression]
   (.getText ^js super-property-access-expression))
  (^js [super-property-access-expression source-file]
   (.getText ^js super-property-access-expression source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [super-property-access-expression]
   (.getFirstToken ^js super-property-access-expression))
  (^js [super-property-access-expression source-file]
   (.getFirstToken ^js super-property-access-expression source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [super-property-access-expression]
   (.getLastToken ^js super-property-access-expression))
  (^js [super-property-access-expression source-file]
   (.getLastToken ^js super-property-access-expression source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [super-property-access-expression cb-node]
   (.forEachChild ^js super-property-access-expression cb-node))
  (^js [super-property-access-expression cb-node cb-node-array]
   (.forEachChild ^js super-property-access-expression cb-node cb-node-array)))

(defn pos
  "**Returns:** `number`"
  ^js [super-property-access-expression]
  (.-pos ^js super-property-access-expression))

(defn end
  "**Returns:** `number`"
  ^js [super-property-access-expression]
  (.-end ^js super-property-access-expression))
