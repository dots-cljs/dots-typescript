(ns dots.typescript.import-specifier
  (:refer-clojure :exclude [name]))

(defn kind
  "**Returns:** `SyntaxKind.ImportSpecifier`"
  ^js [import-specifier]
  (.-kind ^js import-specifier))

(defn parent
  "**Returns:** `NamedImports`"
  ^js [import-specifier]
  (.-parent ^js import-specifier))

(defn property-name
  "**Returns:** `Identifier | undefined`"
  ^js [import-specifier]
  (.-propertyName ^js import-specifier))

(defn name
  "**Returns:** `Identifier`"
  ^js [import-specifier]
  (.-name ^js import-specifier))

(defn type-only?
  "**Returns:** `boolean`"
  ^js [import-specifier]
  (.-isTypeOnly ^js import-specifier))

(defn flags
  "**Returns:** `NodeFlags`"
  ^js [import-specifier]
  (.-flags ^js import-specifier))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [import-specifier]
  (.getSourceFile ^js import-specifier))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [import-specifier]
   (.getChildCount ^js import-specifier))
  (^js [import-specifier source-file]
   (.getChildCount ^js import-specifier source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [import-specifier index]
   (.getChildAt ^js import-specifier index))
  (^js [import-specifier index source-file]
   (.getChildAt ^js import-specifier index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [import-specifier]
   (.getChildren ^js import-specifier))
  (^js [import-specifier source-file]
   (.getChildren ^js import-specifier source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [import-specifier]
   (.getStart ^js import-specifier))
  (^js [import-specifier source-file]
   (.getStart ^js import-specifier source-file))
  (^js [import-specifier source-file include-js-doc-comment?]
   (.getStart ^js import-specifier source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [import-specifier]
  (.getFullStart ^js import-specifier))

(defn get-end
  "**Returns:** `number`"
  ^js [import-specifier]
  (.getEnd ^js import-specifier))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [import-specifier]
   (.getWidth ^js import-specifier))
  (^js [import-specifier source-file]
   (.getWidth ^js import-specifier source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [import-specifier]
  (.getFullWidth ^js import-specifier))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [import-specifier]
   (.getLeadingTriviaWidth ^js import-specifier))
  (^js [import-specifier source-file]
   (.getLeadingTriviaWidth ^js import-specifier source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [import-specifier]
   (.getFullText ^js import-specifier))
  (^js [import-specifier source-file]
   (.getFullText ^js import-specifier source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [import-specifier]
   (.getText ^js import-specifier))
  (^js [import-specifier source-file]
   (.getText ^js import-specifier source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [import-specifier]
   (.getFirstToken ^js import-specifier))
  (^js [import-specifier source-file]
   (.getFirstToken ^js import-specifier source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [import-specifier]
   (.getLastToken ^js import-specifier))
  (^js [import-specifier source-file]
   (.getLastToken ^js import-specifier source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [import-specifier cb-node]
   (.forEachChild ^js import-specifier cb-node))
  (^js [import-specifier cb-node cb-node-array]
   (.forEachChild ^js import-specifier cb-node cb-node-array)))

(defn pos
  "**Returns:** `number`"
  ^js [import-specifier]
  (.-pos ^js import-specifier))

(defn end
  "**Returns:** `number`"
  ^js [import-specifier]
  (.-end ^js import-specifier))
