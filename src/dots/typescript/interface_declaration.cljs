(ns dots.typescript.interface-declaration
  (:refer-clojure :exclude [name]))

(defn kind
  ^js [interface-declaration]
  (.-kind ^js interface-declaration))

(defn modifiers
  ^js [interface-declaration]
  (.-modifiers ^js interface-declaration))

(defn name
  ^js [interface-declaration]
  (.-name ^js interface-declaration))

(defn type-parameters
  ^js [interface-declaration]
  (.-typeParameters ^js interface-declaration))

(defn heritage-clauses
  ^js [interface-declaration]
  (.-heritageClauses ^js interface-declaration))

(defn members
  ^js [interface-declaration]
  (.-members ^js interface-declaration))

(defn flags
  ^js [interface-declaration]
  (.-flags ^js interface-declaration))

(defn parent
  ^js [interface-declaration]
  (.-parent ^js interface-declaration))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [interface-declaration]
  (.getSourceFile ^js interface-declaration))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [interface-declaration]
   (.getChildCount ^js interface-declaration))
  (^js [interface-declaration source-file]
   (.getChildCount ^js interface-declaration source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [interface-declaration index]
   (.getChildAt ^js interface-declaration index))
  (^js [interface-declaration index source-file]
   (.getChildAt ^js interface-declaration index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [interface-declaration]
   (.getChildren ^js interface-declaration))
  (^js [interface-declaration source-file]
   (.getChildren ^js interface-declaration source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [interface-declaration]
   (.getStart ^js interface-declaration))
  (^js [interface-declaration source-file]
   (.getStart ^js interface-declaration source-file))
  (^js [interface-declaration source-file include-js-doc-comment?]
   (.getStart ^js interface-declaration source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [interface-declaration]
  (.getFullStart ^js interface-declaration))

(defn get-end
  "**Returns:** `number`"
  ^js [interface-declaration]
  (.getEnd ^js interface-declaration))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [interface-declaration]
   (.getWidth ^js interface-declaration))
  (^js [interface-declaration source-file]
   (.getWidth ^js interface-declaration source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [interface-declaration]
  (.getFullWidth ^js interface-declaration))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [interface-declaration]
   (.getLeadingTriviaWidth ^js interface-declaration))
  (^js [interface-declaration source-file]
   (.getLeadingTriviaWidth ^js interface-declaration source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [interface-declaration]
   (.getFullText ^js interface-declaration))
  (^js [interface-declaration source-file]
   (.getFullText ^js interface-declaration source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [interface-declaration]
   (.getText ^js interface-declaration))
  (^js [interface-declaration source-file]
   (.getText ^js interface-declaration source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [interface-declaration]
   (.getFirstToken ^js interface-declaration))
  (^js [interface-declaration source-file]
   (.getFirstToken ^js interface-declaration source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [interface-declaration]
   (.getLastToken ^js interface-declaration))
  (^js [interface-declaration source-file]
   (.getLastToken ^js interface-declaration source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [interface-declaration cb-node]
   (.forEachChild ^js interface-declaration cb-node))
  (^js [interface-declaration cb-node cb-node-array]
   (.forEachChild ^js interface-declaration cb-node cb-node-array)))

(defn pos
  ^js [interface-declaration]
  (.-pos ^js interface-declaration))

(defn end
  ^js [interface-declaration]
  (.-end ^js interface-declaration))
