(ns dots.typescript.jsx-namespaced-name
  (:refer-clojure :exclude [name namespace]))

(defn kind
  "**Returns:** `SyntaxKind.JsxNamespacedName`"
  ^js [jsx-namespaced-name]
  (.-kind ^js jsx-namespaced-name))

(defn name
  "**Returns:** `Identifier`"
  ^js [jsx-namespaced-name]
  (.-name ^js jsx-namespaced-name))

(defn namespace
  "**Returns:** `Identifier`"
  ^js [jsx-namespaced-name]
  (.-namespace ^js jsx-namespaced-name))

(defn flags
  "**Returns:** `NodeFlags`"
  ^js [jsx-namespaced-name]
  (.-flags ^js jsx-namespaced-name))

(defn parent
  "**Returns:** `Node`"
  ^js [jsx-namespaced-name]
  (.-parent ^js jsx-namespaced-name))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [jsx-namespaced-name]
  (.getSourceFile ^js jsx-namespaced-name))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [jsx-namespaced-name]
   (.getChildCount ^js jsx-namespaced-name))
  (^js [jsx-namespaced-name source-file]
   (.getChildCount ^js jsx-namespaced-name source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [jsx-namespaced-name index]
   (.getChildAt ^js jsx-namespaced-name index))
  (^js [jsx-namespaced-name index source-file]
   (.getChildAt ^js jsx-namespaced-name index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [jsx-namespaced-name]
   (.getChildren ^js jsx-namespaced-name))
  (^js [jsx-namespaced-name source-file]
   (.getChildren ^js jsx-namespaced-name source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [jsx-namespaced-name]
   (.getStart ^js jsx-namespaced-name))
  (^js [jsx-namespaced-name source-file]
   (.getStart ^js jsx-namespaced-name source-file))
  (^js [jsx-namespaced-name source-file include-js-doc-comment?]
   (.getStart ^js jsx-namespaced-name source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [jsx-namespaced-name]
  (.getFullStart ^js jsx-namespaced-name))

(defn get-end
  "**Returns:** `number`"
  ^js [jsx-namespaced-name]
  (.getEnd ^js jsx-namespaced-name))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [jsx-namespaced-name]
   (.getWidth ^js jsx-namespaced-name))
  (^js [jsx-namespaced-name source-file]
   (.getWidth ^js jsx-namespaced-name source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [jsx-namespaced-name]
  (.getFullWidth ^js jsx-namespaced-name))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [jsx-namespaced-name]
   (.getLeadingTriviaWidth ^js jsx-namespaced-name))
  (^js [jsx-namespaced-name source-file]
   (.getLeadingTriviaWidth ^js jsx-namespaced-name source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [jsx-namespaced-name]
   (.getFullText ^js jsx-namespaced-name))
  (^js [jsx-namespaced-name source-file]
   (.getFullText ^js jsx-namespaced-name source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [jsx-namespaced-name]
   (.getText ^js jsx-namespaced-name))
  (^js [jsx-namespaced-name source-file]
   (.getText ^js jsx-namespaced-name source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [jsx-namespaced-name]
   (.getFirstToken ^js jsx-namespaced-name))
  (^js [jsx-namespaced-name source-file]
   (.getFirstToken ^js jsx-namespaced-name source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [jsx-namespaced-name]
   (.getLastToken ^js jsx-namespaced-name))
  (^js [jsx-namespaced-name source-file]
   (.getLastToken ^js jsx-namespaced-name source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [jsx-namespaced-name cb-node]
   (.forEachChild ^js jsx-namespaced-name cb-node))
  (^js [jsx-namespaced-name cb-node cb-node-array]
   (.forEachChild ^js jsx-namespaced-name cb-node cb-node-array)))

(defn pos
  "**Returns:** `number`"
  ^js [jsx-namespaced-name]
  (.-pos ^js jsx-namespaced-name))

(defn end
  "**Returns:** `number`"
  ^js [jsx-namespaced-name]
  (.-end ^js jsx-namespaced-name))
