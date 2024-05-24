(ns dots.typescript.parameter-declaration
  (:refer-clojure :exclude [name type]))

(defn kind
  ^js [parameter-declaration]
  (.-kind ^js parameter-declaration))

(defn parent
  ^js [parameter-declaration]
  (.-parent ^js parameter-declaration))

(defn modifiers
  ^js [parameter-declaration]
  (.-modifiers ^js parameter-declaration))

(defn dot-dot-dot-token
  ^js [parameter-declaration]
  (.-dotDotDotToken ^js parameter-declaration))

(defn name
  ^js [parameter-declaration]
  (.-name ^js parameter-declaration))

(defn question-token
  ^js [parameter-declaration]
  (.-questionToken ^js parameter-declaration))

(defn type
  ^js [parameter-declaration]
  (.-type ^js parameter-declaration))

(defn initializer
  ^js [parameter-declaration]
  (.-initializer ^js parameter-declaration))

(defn flags
  ^js [parameter-declaration]
  (.-flags ^js parameter-declaration))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [parameter-declaration]
  (.getSourceFile ^js parameter-declaration))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [parameter-declaration]
   (.getChildCount ^js parameter-declaration))
  (^js [parameter-declaration source-file]
   (.getChildCount ^js parameter-declaration source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [parameter-declaration index]
   (.getChildAt ^js parameter-declaration index))
  (^js [parameter-declaration index source-file]
   (.getChildAt ^js parameter-declaration index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [parameter-declaration]
   (.getChildren ^js parameter-declaration))
  (^js [parameter-declaration source-file]
   (.getChildren ^js parameter-declaration source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [parameter-declaration]
   (.getStart ^js parameter-declaration))
  (^js [parameter-declaration source-file]
   (.getStart ^js parameter-declaration source-file))
  (^js [parameter-declaration source-file include-js-doc-comment?]
   (.getStart ^js parameter-declaration source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [parameter-declaration]
  (.getFullStart ^js parameter-declaration))

(defn get-end
  "**Returns:** `number`"
  ^js [parameter-declaration]
  (.getEnd ^js parameter-declaration))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [parameter-declaration]
   (.getWidth ^js parameter-declaration))
  (^js [parameter-declaration source-file]
   (.getWidth ^js parameter-declaration source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [parameter-declaration]
  (.getFullWidth ^js parameter-declaration))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [parameter-declaration]
   (.getLeadingTriviaWidth ^js parameter-declaration))
  (^js [parameter-declaration source-file]
   (.getLeadingTriviaWidth ^js parameter-declaration source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [parameter-declaration]
   (.getFullText ^js parameter-declaration))
  (^js [parameter-declaration source-file]
   (.getFullText ^js parameter-declaration source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [parameter-declaration]
   (.getText ^js parameter-declaration))
  (^js [parameter-declaration source-file]
   (.getText ^js parameter-declaration source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [parameter-declaration]
   (.getFirstToken ^js parameter-declaration))
  (^js [parameter-declaration source-file]
   (.getFirstToken ^js parameter-declaration source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [parameter-declaration]
   (.getLastToken ^js parameter-declaration))
  (^js [parameter-declaration source-file]
   (.getLastToken ^js parameter-declaration source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [parameter-declaration cb-node]
   (.forEachChild ^js parameter-declaration cb-node))
  (^js [parameter-declaration cb-node cb-node-array]
   (.forEachChild ^js parameter-declaration cb-node cb-node-array)))

(defn pos
  ^js [parameter-declaration]
  (.-pos ^js parameter-declaration))

(defn end
  ^js [parameter-declaration]
  (.-end ^js parameter-declaration))
