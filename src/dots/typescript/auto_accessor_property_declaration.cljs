(ns dots.typescript.auto-accessor-property-declaration
  (:refer-clojure :exclude [name type]))

(defn kind
  ^js [auto-accessor-property-declaration]
  (.-kind ^js auto-accessor-property-declaration))

(defn parent
  ^js [auto-accessor-property-declaration]
  (.-parent ^js auto-accessor-property-declaration))

(defn modifiers
  ^js [auto-accessor-property-declaration]
  (.-modifiers ^js auto-accessor-property-declaration))

(defn name
  ^js [auto-accessor-property-declaration]
  (.-name ^js auto-accessor-property-declaration))

(defn question-token
  ^js [auto-accessor-property-declaration]
  (.-questionToken ^js auto-accessor-property-declaration))

(defn exclamation-token
  ^js [auto-accessor-property-declaration]
  (.-exclamationToken ^js auto-accessor-property-declaration))

(defn type
  ^js [auto-accessor-property-declaration]
  (.-type ^js auto-accessor-property-declaration))

(defn initializer
  ^js [auto-accessor-property-declaration]
  (.-initializer ^js auto-accessor-property-declaration))

(defn flags
  ^js [auto-accessor-property-declaration]
  (.-flags ^js auto-accessor-property-declaration))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [auto-accessor-property-declaration]
  (.getSourceFile ^js auto-accessor-property-declaration))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [auto-accessor-property-declaration]
   (.getChildCount ^js auto-accessor-property-declaration))
  (^js [auto-accessor-property-declaration source-file]
   (.getChildCount ^js auto-accessor-property-declaration source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [auto-accessor-property-declaration index]
   (.getChildAt ^js auto-accessor-property-declaration index))
  (^js [auto-accessor-property-declaration index source-file]
   (.getChildAt ^js auto-accessor-property-declaration index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [auto-accessor-property-declaration]
   (.getChildren ^js auto-accessor-property-declaration))
  (^js [auto-accessor-property-declaration source-file]
   (.getChildren ^js auto-accessor-property-declaration source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [auto-accessor-property-declaration]
   (.getStart ^js auto-accessor-property-declaration))
  (^js [auto-accessor-property-declaration source-file]
   (.getStart ^js auto-accessor-property-declaration source-file))
  (^js [auto-accessor-property-declaration source-file include-js-doc-comment?]
   (.getStart ^js auto-accessor-property-declaration source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [auto-accessor-property-declaration]
  (.getFullStart ^js auto-accessor-property-declaration))

(defn get-end
  "**Returns:** `number`"
  ^js [auto-accessor-property-declaration]
  (.getEnd ^js auto-accessor-property-declaration))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [auto-accessor-property-declaration]
   (.getWidth ^js auto-accessor-property-declaration))
  (^js [auto-accessor-property-declaration source-file]
   (.getWidth ^js auto-accessor-property-declaration source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [auto-accessor-property-declaration]
  (.getFullWidth ^js auto-accessor-property-declaration))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [auto-accessor-property-declaration]
   (.getLeadingTriviaWidth ^js auto-accessor-property-declaration))
  (^js [auto-accessor-property-declaration source-file]
   (.getLeadingTriviaWidth ^js auto-accessor-property-declaration source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [auto-accessor-property-declaration]
   (.getFullText ^js auto-accessor-property-declaration))
  (^js [auto-accessor-property-declaration source-file]
   (.getFullText ^js auto-accessor-property-declaration source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [auto-accessor-property-declaration]
   (.getText ^js auto-accessor-property-declaration))
  (^js [auto-accessor-property-declaration source-file]
   (.getText ^js auto-accessor-property-declaration source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [auto-accessor-property-declaration]
   (.getFirstToken ^js auto-accessor-property-declaration))
  (^js [auto-accessor-property-declaration source-file]
   (.getFirstToken ^js auto-accessor-property-declaration source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [auto-accessor-property-declaration]
   (.getLastToken ^js auto-accessor-property-declaration))
  (^js [auto-accessor-property-declaration source-file]
   (.getLastToken ^js auto-accessor-property-declaration source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [auto-accessor-property-declaration cb-node]
   (.forEachChild ^js auto-accessor-property-declaration cb-node))
  (^js [auto-accessor-property-declaration cb-node cb-node-array]
   (.forEachChild ^js auto-accessor-property-declaration cb-node cb-node-array)))

(defn pos
  ^js [auto-accessor-property-declaration]
  (.-pos ^js auto-accessor-property-declaration))

(defn end
  ^js [auto-accessor-property-declaration]
  (.-end ^js auto-accessor-property-declaration))
