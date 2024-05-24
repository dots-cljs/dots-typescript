(ns dots.typescript.arrow-function
  (:refer-clojure :exclude [name type]))

(defn kind
  ^js [arrow-function]
  (.-kind ^js arrow-function))

(defn modifiers
  ^js [arrow-function]
  (.-modifiers ^js arrow-function))

(defn equals-greater-than-token
  ^js [arrow-function]
  (.-equalsGreaterThanToken ^js arrow-function))

(defn body
  ^js [arrow-function]
  (.-body ^js arrow-function))

(defn name
  ^js [arrow-function]
  (.-name ^js arrow-function))

(defn flags
  ^js [arrow-function]
  (.-flags ^js arrow-function))

(defn parent
  ^js [arrow-function]
  (.-parent ^js arrow-function))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [arrow-function]
  (.getSourceFile ^js arrow-function))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [arrow-function]
   (.getChildCount ^js arrow-function))
  (^js [arrow-function source-file]
   (.getChildCount ^js arrow-function source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [arrow-function index]
   (.getChildAt ^js arrow-function index))
  (^js [arrow-function index source-file]
   (.getChildAt ^js arrow-function index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [arrow-function]
   (.getChildren ^js arrow-function))
  (^js [arrow-function source-file]
   (.getChildren ^js arrow-function source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [arrow-function]
   (.getStart ^js arrow-function))
  (^js [arrow-function source-file]
   (.getStart ^js arrow-function source-file))
  (^js [arrow-function source-file include-js-doc-comment?]
   (.getStart ^js arrow-function source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [arrow-function]
  (.getFullStart ^js arrow-function))

(defn get-end
  "**Returns:** `number`"
  ^js [arrow-function]
  (.getEnd ^js arrow-function))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [arrow-function]
   (.getWidth ^js arrow-function))
  (^js [arrow-function source-file]
   (.getWidth ^js arrow-function source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [arrow-function]
  (.getFullWidth ^js arrow-function))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [arrow-function]
   (.getLeadingTriviaWidth ^js arrow-function))
  (^js [arrow-function source-file]
   (.getLeadingTriviaWidth ^js arrow-function source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [arrow-function]
   (.getFullText ^js arrow-function))
  (^js [arrow-function source-file]
   (.getFullText ^js arrow-function source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [arrow-function]
   (.getText ^js arrow-function))
  (^js [arrow-function source-file]
   (.getText ^js arrow-function source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [arrow-function]
   (.getFirstToken ^js arrow-function))
  (^js [arrow-function source-file]
   (.getFirstToken ^js arrow-function source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [arrow-function]
   (.getLastToken ^js arrow-function))
  (^js [arrow-function source-file]
   (.getLastToken ^js arrow-function source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [arrow-function cb-node]
   (.forEachChild ^js arrow-function cb-node))
  (^js [arrow-function cb-node cb-node-array]
   (.forEachChild ^js arrow-function cb-node cb-node-array)))

(defn pos
  ^js [arrow-function]
  (.-pos ^js arrow-function))

(defn end
  ^js [arrow-function]
  (.-end ^js arrow-function))

(defn asterisk-token
  ^js [arrow-function]
  (.-asteriskToken ^js arrow-function))

(defn question-token
  ^js [arrow-function]
  (.-questionToken ^js arrow-function))

(defn exclamation-token
  ^js [arrow-function]
  (.-exclamationToken ^js arrow-function))

(defn type-parameters
  ^js [arrow-function]
  (.-typeParameters ^js arrow-function))

(defn parameters
  ^js [arrow-function]
  (.-parameters ^js arrow-function))

(defn type
  ^js [arrow-function]
  (.-type ^js arrow-function))
