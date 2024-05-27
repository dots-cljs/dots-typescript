(ns dots.typescript.class-element
  (:refer-clojure :exclude [name]))

(defn name
  "**Returns:** `PropertyName | undefined`"
  ^js [class-element]
  (.-name ^js class-element))

(defn kind
  "**Returns:** `SyntaxKind`"
  ^js [class-element]
  (.-kind ^js class-element))

(defn flags
  "**Returns:** `NodeFlags`"
  ^js [class-element]
  (.-flags ^js class-element))

(defn parent
  "**Returns:** `Node`"
  ^js [class-element]
  (.-parent ^js class-element))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [class-element]
  (.getSourceFile ^js class-element))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [class-element]
   (.getChildCount ^js class-element))
  (^js [class-element source-file]
   (.getChildCount ^js class-element source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [class-element index]
   (.getChildAt ^js class-element index))
  (^js [class-element index source-file]
   (.getChildAt ^js class-element index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [class-element]
   (.getChildren ^js class-element))
  (^js [class-element source-file]
   (.getChildren ^js class-element source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [class-element]
   (.getStart ^js class-element))
  (^js [class-element source-file]
   (.getStart ^js class-element source-file))
  (^js [class-element source-file include-js-doc-comment?]
   (.getStart ^js class-element source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [class-element]
  (.getFullStart ^js class-element))

(defn get-end
  "**Returns:** `number`"
  ^js [class-element]
  (.getEnd ^js class-element))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [class-element]
   (.getWidth ^js class-element))
  (^js [class-element source-file]
   (.getWidth ^js class-element source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [class-element]
  (.getFullWidth ^js class-element))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [class-element]
   (.getLeadingTriviaWidth ^js class-element))
  (^js [class-element source-file]
   (.getLeadingTriviaWidth ^js class-element source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [class-element]
   (.getFullText ^js class-element))
  (^js [class-element source-file]
   (.getFullText ^js class-element source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [class-element]
   (.getText ^js class-element))
  (^js [class-element source-file]
   (.getText ^js class-element source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [class-element]
   (.getFirstToken ^js class-element))
  (^js [class-element source-file]
   (.getFirstToken ^js class-element source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [class-element]
   (.getLastToken ^js class-element))
  (^js [class-element source-file]
   (.getLastToken ^js class-element source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [class-element cb-node]
   (.forEachChild ^js class-element cb-node))
  (^js [class-element cb-node cb-node-array]
   (.forEachChild ^js class-element cb-node cb-node-array)))

(defn pos
  "**Returns:** `number`"
  ^js [class-element]
  (.-pos ^js class-element))

(defn end
  "**Returns:** `number`"
  ^js [class-element]
  (.-end ^js class-element))
