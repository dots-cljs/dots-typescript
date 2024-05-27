(ns dots.typescript.shorthand-property-assignment
  (:refer-clojure :exclude [name]))

(defn kind
  "**Returns:** `SyntaxKind.ShorthandPropertyAssignment`"
  ^js [shorthand-property-assignment]
  (.-kind ^js shorthand-property-assignment))

(defn parent
  "**Returns:** `ObjectLiteralExpression`"
  ^js [shorthand-property-assignment]
  (.-parent ^js shorthand-property-assignment))

(defn name
  "**Returns:** `Identifier`"
  ^js [shorthand-property-assignment]
  (.-name ^js shorthand-property-assignment))

(defn equals-token
  "**Returns:** `EqualsToken | undefined`"
  ^js [shorthand-property-assignment]
  (.-equalsToken ^js shorthand-property-assignment))

(defn object-assignment-initializer
  "**Returns:** `Expression | undefined`"
  ^js [shorthand-property-assignment]
  (.-objectAssignmentInitializer ^js shorthand-property-assignment))

(defn flags
  "**Returns:** `NodeFlags`"
  ^js [shorthand-property-assignment]
  (.-flags ^js shorthand-property-assignment))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [shorthand-property-assignment]
  (.getSourceFile ^js shorthand-property-assignment))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [shorthand-property-assignment]
   (.getChildCount ^js shorthand-property-assignment))
  (^js [shorthand-property-assignment source-file]
   (.getChildCount ^js shorthand-property-assignment source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [shorthand-property-assignment index]
   (.getChildAt ^js shorthand-property-assignment index))
  (^js [shorthand-property-assignment index source-file]
   (.getChildAt ^js shorthand-property-assignment index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [shorthand-property-assignment]
   (.getChildren ^js shorthand-property-assignment))
  (^js [shorthand-property-assignment source-file]
   (.getChildren ^js shorthand-property-assignment source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [shorthand-property-assignment]
   (.getStart ^js shorthand-property-assignment))
  (^js [shorthand-property-assignment source-file]
   (.getStart ^js shorthand-property-assignment source-file))
  (^js [shorthand-property-assignment source-file include-js-doc-comment?]
   (.getStart ^js shorthand-property-assignment source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [shorthand-property-assignment]
  (.getFullStart ^js shorthand-property-assignment))

(defn get-end
  "**Returns:** `number`"
  ^js [shorthand-property-assignment]
  (.getEnd ^js shorthand-property-assignment))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [shorthand-property-assignment]
   (.getWidth ^js shorthand-property-assignment))
  (^js [shorthand-property-assignment source-file]
   (.getWidth ^js shorthand-property-assignment source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [shorthand-property-assignment]
  (.getFullWidth ^js shorthand-property-assignment))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [shorthand-property-assignment]
   (.getLeadingTriviaWidth ^js shorthand-property-assignment))
  (^js [shorthand-property-assignment source-file]
   (.getLeadingTriviaWidth ^js shorthand-property-assignment source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [shorthand-property-assignment]
   (.getFullText ^js shorthand-property-assignment))
  (^js [shorthand-property-assignment source-file]
   (.getFullText ^js shorthand-property-assignment source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [shorthand-property-assignment]
   (.getText ^js shorthand-property-assignment))
  (^js [shorthand-property-assignment source-file]
   (.getText ^js shorthand-property-assignment source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [shorthand-property-assignment]
   (.getFirstToken ^js shorthand-property-assignment))
  (^js [shorthand-property-assignment source-file]
   (.getFirstToken ^js shorthand-property-assignment source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [shorthand-property-assignment]
   (.getLastToken ^js shorthand-property-assignment))
  (^js [shorthand-property-assignment source-file]
   (.getLastToken ^js shorthand-property-assignment source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [shorthand-property-assignment cb-node]
   (.forEachChild ^js shorthand-property-assignment cb-node))
  (^js [shorthand-property-assignment cb-node cb-node-array]
   (.forEachChild ^js shorthand-property-assignment cb-node cb-node-array)))

(defn pos
  "**Returns:** `number`"
  ^js [shorthand-property-assignment]
  (.-pos ^js shorthand-property-assignment))

(defn end
  "**Returns:** `number`"
  ^js [shorthand-property-assignment]
  (.-end ^js shorthand-property-assignment))
