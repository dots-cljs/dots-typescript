(ns dots.typescript.get-accessor-declaration
  (:refer-clojure :exclude [name type]))

(defn kind
  ^js [get-accessor-declaration]
  (.-kind ^js get-accessor-declaration))

(defn parent
  ^js [get-accessor-declaration]
  (.-parent ^js get-accessor-declaration))

(defn modifiers
  ^js [get-accessor-declaration]
  (.-modifiers ^js get-accessor-declaration))

(defn name
  ^js [get-accessor-declaration]
  (.-name ^js get-accessor-declaration))

(defn body
  ^js [get-accessor-declaration]
  (.-body ^js get-accessor-declaration))

(defn asterisk-token
  ^js [get-accessor-declaration]
  (.-asteriskToken ^js get-accessor-declaration))

(defn question-token
  ^js [get-accessor-declaration]
  (.-questionToken ^js get-accessor-declaration))

(defn exclamation-token
  ^js [get-accessor-declaration]
  (.-exclamationToken ^js get-accessor-declaration))

(defn type-parameters
  ^js [get-accessor-declaration]
  (.-typeParameters ^js get-accessor-declaration))

(defn parameters
  ^js [get-accessor-declaration]
  (.-parameters ^js get-accessor-declaration))

(defn type
  ^js [get-accessor-declaration]
  (.-type ^js get-accessor-declaration))

(defn flags
  ^js [get-accessor-declaration]
  (.-flags ^js get-accessor-declaration))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [get-accessor-declaration]
  (.getSourceFile ^js get-accessor-declaration))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [get-accessor-declaration]
   (.getChildCount ^js get-accessor-declaration))
  (^js [get-accessor-declaration source-file]
   (.getChildCount ^js get-accessor-declaration source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [get-accessor-declaration index]
   (.getChildAt ^js get-accessor-declaration index))
  (^js [get-accessor-declaration index source-file]
   (.getChildAt ^js get-accessor-declaration index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [get-accessor-declaration]
   (.getChildren ^js get-accessor-declaration))
  (^js [get-accessor-declaration source-file]
   (.getChildren ^js get-accessor-declaration source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [get-accessor-declaration]
   (.getStart ^js get-accessor-declaration))
  (^js [get-accessor-declaration source-file]
   (.getStart ^js get-accessor-declaration source-file))
  (^js [get-accessor-declaration source-file include-js-doc-comment?]
   (.getStart ^js get-accessor-declaration source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [get-accessor-declaration]
  (.getFullStart ^js get-accessor-declaration))

(defn get-end
  "**Returns:** `number`"
  ^js [get-accessor-declaration]
  (.getEnd ^js get-accessor-declaration))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [get-accessor-declaration]
   (.getWidth ^js get-accessor-declaration))
  (^js [get-accessor-declaration source-file]
   (.getWidth ^js get-accessor-declaration source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [get-accessor-declaration]
  (.getFullWidth ^js get-accessor-declaration))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [get-accessor-declaration]
   (.getLeadingTriviaWidth ^js get-accessor-declaration))
  (^js [get-accessor-declaration source-file]
   (.getLeadingTriviaWidth ^js get-accessor-declaration source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [get-accessor-declaration]
   (.getFullText ^js get-accessor-declaration))
  (^js [get-accessor-declaration source-file]
   (.getFullText ^js get-accessor-declaration source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [get-accessor-declaration]
   (.getText ^js get-accessor-declaration))
  (^js [get-accessor-declaration source-file]
   (.getText ^js get-accessor-declaration source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [get-accessor-declaration]
   (.getFirstToken ^js get-accessor-declaration))
  (^js [get-accessor-declaration source-file]
   (.getFirstToken ^js get-accessor-declaration source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [get-accessor-declaration]
   (.getLastToken ^js get-accessor-declaration))
  (^js [get-accessor-declaration source-file]
   (.getLastToken ^js get-accessor-declaration source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [get-accessor-declaration cb-node]
   (.forEachChild ^js get-accessor-declaration cb-node))
  (^js [get-accessor-declaration cb-node cb-node-array]
   (.forEachChild ^js get-accessor-declaration cb-node cb-node-array)))

(defn pos
  ^js [get-accessor-declaration]
  (.-pos ^js get-accessor-declaration))

(defn end
  ^js [get-accessor-declaration]
  (.-end ^js get-accessor-declaration))
