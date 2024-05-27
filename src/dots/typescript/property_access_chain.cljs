(ns dots.typescript.property-access-chain
  (:refer-clojure :exclude [name]))

(defn name
  "**Returns:** `MemberName`"
  ^js [property-access-chain]
  (.-name ^js property-access-chain))

(defn kind
  "**Returns:** `SyntaxKind.PropertyAccessExpression`"
  ^js [property-access-chain]
  (.-kind ^js property-access-chain))

(defn expression
  "**Returns:** `LeftHandSideExpression`"
  ^js [property-access-chain]
  (.-expression ^js property-access-chain))

(defn question-dot-token
  "**Returns:** `QuestionDotToken | undefined`"
  ^js [property-access-chain]
  (.-questionDotToken ^js property-access-chain))

(defn flags
  "**Returns:** `NodeFlags`"
  ^js [property-access-chain]
  (.-flags ^js property-access-chain))

(defn parent
  "**Returns:** `Node`"
  ^js [property-access-chain]
  (.-parent ^js property-access-chain))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [property-access-chain]
  (.getSourceFile ^js property-access-chain))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [property-access-chain]
   (.getChildCount ^js property-access-chain))
  (^js [property-access-chain source-file]
   (.getChildCount ^js property-access-chain source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [property-access-chain index]
   (.getChildAt ^js property-access-chain index))
  (^js [property-access-chain index source-file]
   (.getChildAt ^js property-access-chain index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [property-access-chain]
   (.getChildren ^js property-access-chain))
  (^js [property-access-chain source-file]
   (.getChildren ^js property-access-chain source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [property-access-chain]
   (.getStart ^js property-access-chain))
  (^js [property-access-chain source-file]
   (.getStart ^js property-access-chain source-file))
  (^js [property-access-chain source-file include-js-doc-comment?]
   (.getStart ^js property-access-chain source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [property-access-chain]
  (.getFullStart ^js property-access-chain))

(defn get-end
  "**Returns:** `number`"
  ^js [property-access-chain]
  (.getEnd ^js property-access-chain))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [property-access-chain]
   (.getWidth ^js property-access-chain))
  (^js [property-access-chain source-file]
   (.getWidth ^js property-access-chain source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [property-access-chain]
  (.getFullWidth ^js property-access-chain))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [property-access-chain]
   (.getLeadingTriviaWidth ^js property-access-chain))
  (^js [property-access-chain source-file]
   (.getLeadingTriviaWidth ^js property-access-chain source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [property-access-chain]
   (.getFullText ^js property-access-chain))
  (^js [property-access-chain source-file]
   (.getFullText ^js property-access-chain source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [property-access-chain]
   (.getText ^js property-access-chain))
  (^js [property-access-chain source-file]
   (.getText ^js property-access-chain source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [property-access-chain]
   (.getFirstToken ^js property-access-chain))
  (^js [property-access-chain source-file]
   (.getFirstToken ^js property-access-chain source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [property-access-chain]
   (.getLastToken ^js property-access-chain))
  (^js [property-access-chain source-file]
   (.getLastToken ^js property-access-chain source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [property-access-chain cb-node]
   (.forEachChild ^js property-access-chain cb-node))
  (^js [property-access-chain cb-node cb-node-array]
   (.forEachChild ^js property-access-chain cb-node cb-node-array)))

(defn pos
  "**Returns:** `number`"
  ^js [property-access-chain]
  (.-pos ^js property-access-chain))

(defn end
  "**Returns:** `number`"
  ^js [property-access-chain]
  (.-end ^js property-access-chain))
