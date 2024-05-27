(ns dots.typescript.jsx-tag-name-property-access
  (:refer-clojure :exclude [name]))

(defn expression
  "**Returns:** `Identifier | ThisExpression | JsxTagNamePropertyAccess`"
  ^js [jsx-tag-name-property-access]
  (.-expression ^js jsx-tag-name-property-access))

(defn kind
  "**Returns:** `SyntaxKind.PropertyAccessExpression`"
  ^js [jsx-tag-name-property-access]
  (.-kind ^js jsx-tag-name-property-access))

(defn question-dot-token
  "**Returns:** `QuestionDotToken | undefined`"
  ^js [jsx-tag-name-property-access]
  (.-questionDotToken ^js jsx-tag-name-property-access))

(defn name
  "**Returns:** `MemberName`"
  ^js [jsx-tag-name-property-access]
  (.-name ^js jsx-tag-name-property-access))

(defn flags
  "**Returns:** `NodeFlags`"
  ^js [jsx-tag-name-property-access]
  (.-flags ^js jsx-tag-name-property-access))

(defn parent
  "**Returns:** `Node`"
  ^js [jsx-tag-name-property-access]
  (.-parent ^js jsx-tag-name-property-access))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [jsx-tag-name-property-access]
  (.getSourceFile ^js jsx-tag-name-property-access))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [jsx-tag-name-property-access]
   (.getChildCount ^js jsx-tag-name-property-access))
  (^js [jsx-tag-name-property-access source-file]
   (.getChildCount ^js jsx-tag-name-property-access source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [jsx-tag-name-property-access index]
   (.getChildAt ^js jsx-tag-name-property-access index))
  (^js [jsx-tag-name-property-access index source-file]
   (.getChildAt ^js jsx-tag-name-property-access index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [jsx-tag-name-property-access]
   (.getChildren ^js jsx-tag-name-property-access))
  (^js [jsx-tag-name-property-access source-file]
   (.getChildren ^js jsx-tag-name-property-access source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [jsx-tag-name-property-access]
   (.getStart ^js jsx-tag-name-property-access))
  (^js [jsx-tag-name-property-access source-file]
   (.getStart ^js jsx-tag-name-property-access source-file))
  (^js [jsx-tag-name-property-access source-file include-js-doc-comment?]
   (.getStart ^js jsx-tag-name-property-access source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [jsx-tag-name-property-access]
  (.getFullStart ^js jsx-tag-name-property-access))

(defn get-end
  "**Returns:** `number`"
  ^js [jsx-tag-name-property-access]
  (.getEnd ^js jsx-tag-name-property-access))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [jsx-tag-name-property-access]
   (.getWidth ^js jsx-tag-name-property-access))
  (^js [jsx-tag-name-property-access source-file]
   (.getWidth ^js jsx-tag-name-property-access source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [jsx-tag-name-property-access]
  (.getFullWidth ^js jsx-tag-name-property-access))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [jsx-tag-name-property-access]
   (.getLeadingTriviaWidth ^js jsx-tag-name-property-access))
  (^js [jsx-tag-name-property-access source-file]
   (.getLeadingTriviaWidth ^js jsx-tag-name-property-access source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [jsx-tag-name-property-access]
   (.getFullText ^js jsx-tag-name-property-access))
  (^js [jsx-tag-name-property-access source-file]
   (.getFullText ^js jsx-tag-name-property-access source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [jsx-tag-name-property-access]
   (.getText ^js jsx-tag-name-property-access))
  (^js [jsx-tag-name-property-access source-file]
   (.getText ^js jsx-tag-name-property-access source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [jsx-tag-name-property-access]
   (.getFirstToken ^js jsx-tag-name-property-access))
  (^js [jsx-tag-name-property-access source-file]
   (.getFirstToken ^js jsx-tag-name-property-access source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [jsx-tag-name-property-access]
   (.getLastToken ^js jsx-tag-name-property-access))
  (^js [jsx-tag-name-property-access source-file]
   (.getLastToken ^js jsx-tag-name-property-access source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [jsx-tag-name-property-access cb-node]
   (.forEachChild ^js jsx-tag-name-property-access cb-node))
  (^js [jsx-tag-name-property-access cb-node cb-node-array]
   (.forEachChild ^js jsx-tag-name-property-access cb-node cb-node-array)))

(defn pos
  "**Returns:** `number`"
  ^js [jsx-tag-name-property-access]
  (.-pos ^js jsx-tag-name-property-access))

(defn end
  "**Returns:** `number`"
  ^js [jsx-tag-name-property-access]
  (.-end ^js jsx-tag-name-property-access))
