(ns dots.typescript.property-access-entity-name-expression
  "Brand for a PropertyAccessExpression which, like a QualifiedName, consists of a sequence of identifiers separated by dots."
  (:refer-clojure :exclude [name]))

(defn expression
  "**Returns:** `EntityNameExpression`"
  ^js [property-access-entity-name-expression]
  (.-expression ^js property-access-entity-name-expression))

(defn name
  "**Returns:** `Identifier`"
  ^js [property-access-entity-name-expression]
  (.-name ^js property-access-entity-name-expression))

(defn kind
  "**Returns:** `SyntaxKind.PropertyAccessExpression`"
  ^js [property-access-entity-name-expression]
  (.-kind ^js property-access-entity-name-expression))

(defn question-dot-token
  "**Returns:** `QuestionDotToken | undefined`"
  ^js [property-access-entity-name-expression]
  (.-questionDotToken ^js property-access-entity-name-expression))

(defn flags
  "**Returns:** `NodeFlags`"
  ^js [property-access-entity-name-expression]
  (.-flags ^js property-access-entity-name-expression))

(defn parent
  "**Returns:** `Node`"
  ^js [property-access-entity-name-expression]
  (.-parent ^js property-access-entity-name-expression))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [property-access-entity-name-expression]
  (.getSourceFile ^js property-access-entity-name-expression))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [property-access-entity-name-expression]
   (.getChildCount ^js property-access-entity-name-expression))
  (^js [property-access-entity-name-expression source-file]
   (.getChildCount ^js property-access-entity-name-expression source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [property-access-entity-name-expression index]
   (.getChildAt ^js property-access-entity-name-expression index))
  (^js [property-access-entity-name-expression index source-file]
   (.getChildAt ^js property-access-entity-name-expression index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [property-access-entity-name-expression]
   (.getChildren ^js property-access-entity-name-expression))
  (^js [property-access-entity-name-expression source-file]
   (.getChildren ^js property-access-entity-name-expression source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [property-access-entity-name-expression]
   (.getStart ^js property-access-entity-name-expression))
  (^js [property-access-entity-name-expression source-file]
   (.getStart ^js property-access-entity-name-expression source-file))
  (^js [property-access-entity-name-expression source-file include-js-doc-comment?]
   (.getStart ^js property-access-entity-name-expression source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [property-access-entity-name-expression]
  (.getFullStart ^js property-access-entity-name-expression))

(defn get-end
  "**Returns:** `number`"
  ^js [property-access-entity-name-expression]
  (.getEnd ^js property-access-entity-name-expression))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [property-access-entity-name-expression]
   (.getWidth ^js property-access-entity-name-expression))
  (^js [property-access-entity-name-expression source-file]
   (.getWidth ^js property-access-entity-name-expression source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [property-access-entity-name-expression]
  (.getFullWidth ^js property-access-entity-name-expression))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [property-access-entity-name-expression]
   (.getLeadingTriviaWidth ^js property-access-entity-name-expression))
  (^js [property-access-entity-name-expression source-file]
   (.getLeadingTriviaWidth ^js property-access-entity-name-expression source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [property-access-entity-name-expression]
   (.getFullText ^js property-access-entity-name-expression))
  (^js [property-access-entity-name-expression source-file]
   (.getFullText ^js property-access-entity-name-expression source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [property-access-entity-name-expression]
   (.getText ^js property-access-entity-name-expression))
  (^js [property-access-entity-name-expression source-file]
   (.getText ^js property-access-entity-name-expression source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [property-access-entity-name-expression]
   (.getFirstToken ^js property-access-entity-name-expression))
  (^js [property-access-entity-name-expression source-file]
   (.getFirstToken ^js property-access-entity-name-expression source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [property-access-entity-name-expression]
   (.getLastToken ^js property-access-entity-name-expression))
  (^js [property-access-entity-name-expression source-file]
   (.getLastToken ^js property-access-entity-name-expression source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [property-access-entity-name-expression cb-node]
   (.forEachChild ^js property-access-entity-name-expression cb-node))
  (^js [property-access-entity-name-expression cb-node cb-node-array]
   (.forEachChild ^js property-access-entity-name-expression cb-node cb-node-array)))

(defn pos
  "**Returns:** `number`"
  ^js [property-access-entity-name-expression]
  (.-pos ^js property-access-entity-name-expression))

(defn end
  "**Returns:** `number`"
  ^js [property-access-entity-name-expression]
  (.-end ^js property-access-entity-name-expression))
