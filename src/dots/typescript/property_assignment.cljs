(ns dots.typescript.property-assignment
  (:refer-clojure :exclude [name]))

(defn kind
  "**Returns:** `SyntaxKind.PropertyAssignment`"
  ^js [property-assignment]
  (.-kind ^js property-assignment))

(defn parent
  "**Returns:** `ObjectLiteralExpression`"
  ^js [property-assignment]
  (.-parent ^js property-assignment))

(defn name
  "**Returns:** `PropertyName`"
  ^js [property-assignment]
  (.-name ^js property-assignment))

(defn initializer
  "**Returns:** `Expression`"
  ^js [property-assignment]
  (.-initializer ^js property-assignment))

(defn flags
  "**Returns:** `NodeFlags`"
  ^js [property-assignment]
  (.-flags ^js property-assignment))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [property-assignment]
  (.getSourceFile ^js property-assignment))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [property-assignment]
   (.getChildCount ^js property-assignment))
  (^js [property-assignment source-file]
   (.getChildCount ^js property-assignment source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [property-assignment index]
   (.getChildAt ^js property-assignment index))
  (^js [property-assignment index source-file]
   (.getChildAt ^js property-assignment index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [property-assignment]
   (.getChildren ^js property-assignment))
  (^js [property-assignment source-file]
   (.getChildren ^js property-assignment source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [property-assignment]
   (.getStart ^js property-assignment))
  (^js [property-assignment source-file]
   (.getStart ^js property-assignment source-file))
  (^js [property-assignment source-file include-js-doc-comment?]
   (.getStart ^js property-assignment source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [property-assignment]
  (.getFullStart ^js property-assignment))

(defn get-end
  "**Returns:** `number`"
  ^js [property-assignment]
  (.getEnd ^js property-assignment))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [property-assignment]
   (.getWidth ^js property-assignment))
  (^js [property-assignment source-file]
   (.getWidth ^js property-assignment source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [property-assignment]
  (.getFullWidth ^js property-assignment))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [property-assignment]
   (.getLeadingTriviaWidth ^js property-assignment))
  (^js [property-assignment source-file]
   (.getLeadingTriviaWidth ^js property-assignment source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [property-assignment]
   (.getFullText ^js property-assignment))
  (^js [property-assignment source-file]
   (.getFullText ^js property-assignment source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [property-assignment]
   (.getText ^js property-assignment))
  (^js [property-assignment source-file]
   (.getText ^js property-assignment source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [property-assignment]
   (.getFirstToken ^js property-assignment))
  (^js [property-assignment source-file]
   (.getFirstToken ^js property-assignment source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [property-assignment]
   (.getLastToken ^js property-assignment))
  (^js [property-assignment source-file]
   (.getLastToken ^js property-assignment source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [property-assignment cb-node]
   (.forEachChild ^js property-assignment cb-node))
  (^js [property-assignment cb-node cb-node-array]
   (.forEachChild ^js property-assignment cb-node cb-node-array)))

(defn pos
  "**Returns:** `number`"
  ^js [property-assignment]
  (.-pos ^js property-assignment))

(defn end
  "**Returns:** `number`"
  ^js [property-assignment]
  (.-end ^js property-assignment))
