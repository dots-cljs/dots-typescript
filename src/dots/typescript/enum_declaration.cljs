(ns dots.typescript.enum-declaration
  (:refer-clojure :exclude [name]))

(defn kind
  ^js [enum-declaration]
  (.-kind ^js enum-declaration))

(defn modifiers
  ^js [enum-declaration]
  (.-modifiers ^js enum-declaration))

(defn name
  ^js [enum-declaration]
  (.-name ^js enum-declaration))

(defn members
  ^js [enum-declaration]
  (.-members ^js enum-declaration))

(defn flags
  ^js [enum-declaration]
  (.-flags ^js enum-declaration))

(defn parent
  ^js [enum-declaration]
  (.-parent ^js enum-declaration))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [enum-declaration]
  (.getSourceFile ^js enum-declaration))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [enum-declaration]
   (.getChildCount ^js enum-declaration))
  (^js [enum-declaration source-file]
   (.getChildCount ^js enum-declaration source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [enum-declaration index]
   (.getChildAt ^js enum-declaration index))
  (^js [enum-declaration index source-file]
   (.getChildAt ^js enum-declaration index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [enum-declaration]
   (.getChildren ^js enum-declaration))
  (^js [enum-declaration source-file]
   (.getChildren ^js enum-declaration source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [enum-declaration]
   (.getStart ^js enum-declaration))
  (^js [enum-declaration source-file]
   (.getStart ^js enum-declaration source-file))
  (^js [enum-declaration source-file include-js-doc-comment?]
   (.getStart ^js enum-declaration source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [enum-declaration]
  (.getFullStart ^js enum-declaration))

(defn get-end
  "**Returns:** `number`"
  ^js [enum-declaration]
  (.getEnd ^js enum-declaration))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [enum-declaration]
   (.getWidth ^js enum-declaration))
  (^js [enum-declaration source-file]
   (.getWidth ^js enum-declaration source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [enum-declaration]
  (.getFullWidth ^js enum-declaration))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [enum-declaration]
   (.getLeadingTriviaWidth ^js enum-declaration))
  (^js [enum-declaration source-file]
   (.getLeadingTriviaWidth ^js enum-declaration source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [enum-declaration]
   (.getFullText ^js enum-declaration))
  (^js [enum-declaration source-file]
   (.getFullText ^js enum-declaration source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [enum-declaration]
   (.getText ^js enum-declaration))
  (^js [enum-declaration source-file]
   (.getText ^js enum-declaration source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [enum-declaration]
   (.getFirstToken ^js enum-declaration))
  (^js [enum-declaration source-file]
   (.getFirstToken ^js enum-declaration source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [enum-declaration]
   (.getLastToken ^js enum-declaration))
  (^js [enum-declaration source-file]
   (.getLastToken ^js enum-declaration source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [enum-declaration cb-node]
   (.forEachChild ^js enum-declaration cb-node))
  (^js [enum-declaration cb-node cb-node-array]
   (.forEachChild ^js enum-declaration cb-node cb-node-array)))

(defn pos
  ^js [enum-declaration]
  (.-pos ^js enum-declaration))

(defn end
  ^js [enum-declaration]
  (.-end ^js enum-declaration))
