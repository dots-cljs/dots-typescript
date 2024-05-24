(ns dots.typescript.variable-declaration
  (:refer-clojure :exclude [name type]))

(defn kind
  ^js [variable-declaration]
  (.-kind ^js variable-declaration))

(defn parent
  ^js [variable-declaration]
  (.-parent ^js variable-declaration))

(defn name
  ^js [variable-declaration]
  (.-name ^js variable-declaration))

(defn exclamation-token
  ^js [variable-declaration]
  (.-exclamationToken ^js variable-declaration))

(defn type
  ^js [variable-declaration]
  (.-type ^js variable-declaration))

(defn initializer
  ^js [variable-declaration]
  (.-initializer ^js variable-declaration))

(defn flags
  ^js [variable-declaration]
  (.-flags ^js variable-declaration))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [variable-declaration]
  (.getSourceFile ^js variable-declaration))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [variable-declaration]
   (.getChildCount ^js variable-declaration))
  (^js [variable-declaration source-file]
   (.getChildCount ^js variable-declaration source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [variable-declaration index]
   (.getChildAt ^js variable-declaration index))
  (^js [variable-declaration index source-file]
   (.getChildAt ^js variable-declaration index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [variable-declaration]
   (.getChildren ^js variable-declaration))
  (^js [variable-declaration source-file]
   (.getChildren ^js variable-declaration source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [variable-declaration]
   (.getStart ^js variable-declaration))
  (^js [variable-declaration source-file]
   (.getStart ^js variable-declaration source-file))
  (^js [variable-declaration source-file include-js-doc-comment?]
   (.getStart ^js variable-declaration source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [variable-declaration]
  (.getFullStart ^js variable-declaration))

(defn get-end
  "**Returns:** `number`"
  ^js [variable-declaration]
  (.getEnd ^js variable-declaration))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [variable-declaration]
   (.getWidth ^js variable-declaration))
  (^js [variable-declaration source-file]
   (.getWidth ^js variable-declaration source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [variable-declaration]
  (.getFullWidth ^js variable-declaration))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [variable-declaration]
   (.getLeadingTriviaWidth ^js variable-declaration))
  (^js [variable-declaration source-file]
   (.getLeadingTriviaWidth ^js variable-declaration source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [variable-declaration]
   (.getFullText ^js variable-declaration))
  (^js [variable-declaration source-file]
   (.getFullText ^js variable-declaration source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [variable-declaration]
   (.getText ^js variable-declaration))
  (^js [variable-declaration source-file]
   (.getText ^js variable-declaration source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [variable-declaration]
   (.getFirstToken ^js variable-declaration))
  (^js [variable-declaration source-file]
   (.getFirstToken ^js variable-declaration source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [variable-declaration]
   (.getLastToken ^js variable-declaration))
  (^js [variable-declaration source-file]
   (.getLastToken ^js variable-declaration source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [variable-declaration cb-node]
   (.forEachChild ^js variable-declaration cb-node))
  (^js [variable-declaration cb-node cb-node-array]
   (.forEachChild ^js variable-declaration cb-node cb-node-array)))

(defn pos
  ^js [variable-declaration]
  (.-pos ^js variable-declaration))

(defn end
  ^js [variable-declaration]
  (.-end ^js variable-declaration))
