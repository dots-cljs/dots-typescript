(ns dots.typescript.call-signature-declaration
  (:refer-clojure :exclude [name type]))

(defn kind
  ^js [call-signature-declaration]
  (.-kind ^js call-signature-declaration))

(defn name
  ^js [call-signature-declaration]
  (.-name ^js call-signature-declaration))

(defn type-parameters
  ^js [call-signature-declaration]
  (.-typeParameters ^js call-signature-declaration))

(defn parameters
  ^js [call-signature-declaration]
  (.-parameters ^js call-signature-declaration))

(defn type
  ^js [call-signature-declaration]
  (.-type ^js call-signature-declaration))

(defn flags
  ^js [call-signature-declaration]
  (.-flags ^js call-signature-declaration))

(defn parent
  ^js [call-signature-declaration]
  (.-parent ^js call-signature-declaration))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [call-signature-declaration]
  (.getSourceFile ^js call-signature-declaration))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [call-signature-declaration]
   (.getChildCount ^js call-signature-declaration))
  (^js [call-signature-declaration source-file]
   (.getChildCount ^js call-signature-declaration source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [call-signature-declaration index]
   (.getChildAt ^js call-signature-declaration index))
  (^js [call-signature-declaration index source-file]
   (.getChildAt ^js call-signature-declaration index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [call-signature-declaration]
   (.getChildren ^js call-signature-declaration))
  (^js [call-signature-declaration source-file]
   (.getChildren ^js call-signature-declaration source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [call-signature-declaration]
   (.getStart ^js call-signature-declaration))
  (^js [call-signature-declaration source-file]
   (.getStart ^js call-signature-declaration source-file))
  (^js [call-signature-declaration source-file include-js-doc-comment?]
   (.getStart ^js call-signature-declaration source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [call-signature-declaration]
  (.getFullStart ^js call-signature-declaration))

(defn get-end
  "**Returns:** `number`"
  ^js [call-signature-declaration]
  (.getEnd ^js call-signature-declaration))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [call-signature-declaration]
   (.getWidth ^js call-signature-declaration))
  (^js [call-signature-declaration source-file]
   (.getWidth ^js call-signature-declaration source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [call-signature-declaration]
  (.getFullWidth ^js call-signature-declaration))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [call-signature-declaration]
   (.getLeadingTriviaWidth ^js call-signature-declaration))
  (^js [call-signature-declaration source-file]
   (.getLeadingTriviaWidth ^js call-signature-declaration source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [call-signature-declaration]
   (.getFullText ^js call-signature-declaration))
  (^js [call-signature-declaration source-file]
   (.getFullText ^js call-signature-declaration source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [call-signature-declaration]
   (.getText ^js call-signature-declaration))
  (^js [call-signature-declaration source-file]
   (.getText ^js call-signature-declaration source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [call-signature-declaration]
   (.getFirstToken ^js call-signature-declaration))
  (^js [call-signature-declaration source-file]
   (.getFirstToken ^js call-signature-declaration source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [call-signature-declaration]
   (.getLastToken ^js call-signature-declaration))
  (^js [call-signature-declaration source-file]
   (.getLastToken ^js call-signature-declaration source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [call-signature-declaration cb-node]
   (.forEachChild ^js call-signature-declaration cb-node))
  (^js [call-signature-declaration cb-node cb-node-array]
   (.forEachChild ^js call-signature-declaration cb-node cb-node-array)))

(defn pos
  ^js [call-signature-declaration]
  (.-pos ^js call-signature-declaration))

(defn end
  ^js [call-signature-declaration]
  (.-end ^js call-signature-declaration))

(defn question-token
  ^js [call-signature-declaration]
  (.-questionToken ^js call-signature-declaration))
