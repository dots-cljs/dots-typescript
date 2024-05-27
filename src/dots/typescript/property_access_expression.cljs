(ns dots.typescript.property-access-expression
  (:refer-clojure :exclude [name]))

(defn kind
  "**Returns:** `SyntaxKind.PropertyAccessExpression`"
  ^js [property-access-expression]
  (.-kind ^js property-access-expression))

(defn expression
  "**Returns:** `LeftHandSideExpression`"
  ^js [property-access-expression]
  (.-expression ^js property-access-expression))

(defn question-dot-token
  "**Returns:** `QuestionDotToken | undefined`"
  ^js [property-access-expression]
  (.-questionDotToken ^js property-access-expression))

(defn name
  "**Returns:** `MemberName`"
  ^js [property-access-expression]
  (.-name ^js property-access-expression))

(defn flags
  "**Returns:** `NodeFlags`"
  ^js [property-access-expression]
  (.-flags ^js property-access-expression))

(defn parent
  "**Returns:** `Node`"
  ^js [property-access-expression]
  (.-parent ^js property-access-expression))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [property-access-expression]
  (.getSourceFile ^js property-access-expression))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [property-access-expression]
   (.getChildCount ^js property-access-expression))
  (^js [property-access-expression source-file]
   (.getChildCount ^js property-access-expression source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [property-access-expression index]
   (.getChildAt ^js property-access-expression index))
  (^js [property-access-expression index source-file]
   (.getChildAt ^js property-access-expression index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [property-access-expression]
   (.getChildren ^js property-access-expression))
  (^js [property-access-expression source-file]
   (.getChildren ^js property-access-expression source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [property-access-expression]
   (.getStart ^js property-access-expression))
  (^js [property-access-expression source-file]
   (.getStart ^js property-access-expression source-file))
  (^js [property-access-expression source-file include-js-doc-comment?]
   (.getStart ^js property-access-expression source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [property-access-expression]
  (.getFullStart ^js property-access-expression))

(defn get-end
  "**Returns:** `number`"
  ^js [property-access-expression]
  (.getEnd ^js property-access-expression))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [property-access-expression]
   (.getWidth ^js property-access-expression))
  (^js [property-access-expression source-file]
   (.getWidth ^js property-access-expression source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [property-access-expression]
  (.getFullWidth ^js property-access-expression))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [property-access-expression]
   (.getLeadingTriviaWidth ^js property-access-expression))
  (^js [property-access-expression source-file]
   (.getLeadingTriviaWidth ^js property-access-expression source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [property-access-expression]
   (.getFullText ^js property-access-expression))
  (^js [property-access-expression source-file]
   (.getFullText ^js property-access-expression source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [property-access-expression]
   (.getText ^js property-access-expression))
  (^js [property-access-expression source-file]
   (.getText ^js property-access-expression source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [property-access-expression]
   (.getFirstToken ^js property-access-expression))
  (^js [property-access-expression source-file]
   (.getFirstToken ^js property-access-expression source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [property-access-expression]
   (.getLastToken ^js property-access-expression))
  (^js [property-access-expression source-file]
   (.getLastToken ^js property-access-expression source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [property-access-expression cb-node]
   (.forEachChild ^js property-access-expression cb-node))
  (^js [property-access-expression cb-node cb-node-array]
   (.forEachChild ^js property-access-expression cb-node cb-node-array)))

(defn pos
  "**Returns:** `number`"
  ^js [property-access-expression]
  (.-pos ^js property-access-expression))

(defn end
  "**Returns:** `number`"
  ^js [property-access-expression]
  (.-end ^js property-access-expression))
