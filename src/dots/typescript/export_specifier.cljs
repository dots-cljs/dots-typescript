(ns dots.typescript.export-specifier
  (:refer-clojure :exclude [name]))

(defn kind
  ^js [export-specifier]
  (.-kind ^js export-specifier))

(defn parent
  ^js [export-specifier]
  (.-parent ^js export-specifier))

(defn type-only?
  ^js [export-specifier]
  (.-isTypeOnly ^js export-specifier))

(defn property-name
  ^js [export-specifier]
  (.-propertyName ^js export-specifier))

(defn name
  ^js [export-specifier]
  (.-name ^js export-specifier))

(defn flags
  ^js [export-specifier]
  (.-flags ^js export-specifier))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [export-specifier]
  (.getSourceFile ^js export-specifier))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [export-specifier]
   (.getChildCount ^js export-specifier))
  (^js [export-specifier source-file]
   (.getChildCount ^js export-specifier source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [export-specifier index]
   (.getChildAt ^js export-specifier index))
  (^js [export-specifier index source-file]
   (.getChildAt ^js export-specifier index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [export-specifier]
   (.getChildren ^js export-specifier))
  (^js [export-specifier source-file]
   (.getChildren ^js export-specifier source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [export-specifier]
   (.getStart ^js export-specifier))
  (^js [export-specifier source-file]
   (.getStart ^js export-specifier source-file))
  (^js [export-specifier source-file include-js-doc-comment?]
   (.getStart ^js export-specifier source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [export-specifier]
  (.getFullStart ^js export-specifier))

(defn get-end
  "**Returns:** `number`"
  ^js [export-specifier]
  (.getEnd ^js export-specifier))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [export-specifier]
   (.getWidth ^js export-specifier))
  (^js [export-specifier source-file]
   (.getWidth ^js export-specifier source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [export-specifier]
  (.getFullWidth ^js export-specifier))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [export-specifier]
   (.getLeadingTriviaWidth ^js export-specifier))
  (^js [export-specifier source-file]
   (.getLeadingTriviaWidth ^js export-specifier source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [export-specifier]
   (.getFullText ^js export-specifier))
  (^js [export-specifier source-file]
   (.getFullText ^js export-specifier source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [export-specifier]
   (.getText ^js export-specifier))
  (^js [export-specifier source-file]
   (.getText ^js export-specifier source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [export-specifier]
   (.getFirstToken ^js export-specifier))
  (^js [export-specifier source-file]
   (.getFirstToken ^js export-specifier source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [export-specifier]
   (.getLastToken ^js export-specifier))
  (^js [export-specifier source-file]
   (.getLastToken ^js export-specifier source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [export-specifier cb-node]
   (.forEachChild ^js export-specifier cb-node))
  (^js [export-specifier cb-node cb-node-array]
   (.forEachChild ^js export-specifier cb-node cb-node-array)))

(defn pos
  ^js [export-specifier]
  (.-pos ^js export-specifier))

(defn end
  ^js [export-specifier]
  (.-end ^js export-specifier))
