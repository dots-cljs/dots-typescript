(ns dots.typescript.property-declaration
  (:refer-clojure :exclude [name type]))

(defn kind
  ^js [property-declaration]
  (.-kind ^js property-declaration))

(defn parent
  ^js [property-declaration]
  (.-parent ^js property-declaration))

(defn modifiers
  ^js [property-declaration]
  (.-modifiers ^js property-declaration))

(defn name
  ^js [property-declaration]
  (.-name ^js property-declaration))

(defn question-token
  ^js [property-declaration]
  (.-questionToken ^js property-declaration))

(defn exclamation-token
  ^js [property-declaration]
  (.-exclamationToken ^js property-declaration))

(defn type
  ^js [property-declaration]
  (.-type ^js property-declaration))

(defn initializer
  ^js [property-declaration]
  (.-initializer ^js property-declaration))

(defn flags
  ^js [property-declaration]
  (.-flags ^js property-declaration))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [property-declaration]
  (.getSourceFile ^js property-declaration))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [property-declaration]
   (.getChildCount ^js property-declaration))
  (^js [property-declaration source-file]
   (.getChildCount ^js property-declaration source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [property-declaration index]
   (.getChildAt ^js property-declaration index))
  (^js [property-declaration index source-file]
   (.getChildAt ^js property-declaration index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [property-declaration]
   (.getChildren ^js property-declaration))
  (^js [property-declaration source-file]
   (.getChildren ^js property-declaration source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [property-declaration]
   (.getStart ^js property-declaration))
  (^js [property-declaration source-file]
   (.getStart ^js property-declaration source-file))
  (^js [property-declaration source-file include-js-doc-comment?]
   (.getStart ^js property-declaration source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [property-declaration]
  (.getFullStart ^js property-declaration))

(defn get-end
  "**Returns:** `number`"
  ^js [property-declaration]
  (.getEnd ^js property-declaration))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [property-declaration]
   (.getWidth ^js property-declaration))
  (^js [property-declaration source-file]
   (.getWidth ^js property-declaration source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [property-declaration]
  (.getFullWidth ^js property-declaration))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [property-declaration]
   (.getLeadingTriviaWidth ^js property-declaration))
  (^js [property-declaration source-file]
   (.getLeadingTriviaWidth ^js property-declaration source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [property-declaration]
   (.getFullText ^js property-declaration))
  (^js [property-declaration source-file]
   (.getFullText ^js property-declaration source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [property-declaration]
   (.getText ^js property-declaration))
  (^js [property-declaration source-file]
   (.getText ^js property-declaration source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [property-declaration]
   (.getFirstToken ^js property-declaration))
  (^js [property-declaration source-file]
   (.getFirstToken ^js property-declaration source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [property-declaration]
   (.getLastToken ^js property-declaration))
  (^js [property-declaration source-file]
   (.getLastToken ^js property-declaration source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [property-declaration cb-node]
   (.forEachChild ^js property-declaration cb-node))
  (^js [property-declaration cb-node cb-node-array]
   (.forEachChild ^js property-declaration cb-node cb-node-array)))

(defn pos
  ^js [property-declaration]
  (.-pos ^js property-declaration))

(defn end
  ^js [property-declaration]
  (.-end ^js property-declaration))
