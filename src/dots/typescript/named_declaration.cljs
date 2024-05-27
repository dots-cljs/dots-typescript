(ns dots.typescript.named-declaration
  (:refer-clojure :exclude [name]))

(defn name
  "**Returns:** `DeclarationName | undefined`"
  ^js [named-declaration]
  (.-name ^js named-declaration))

(defn kind
  "**Returns:** `SyntaxKind`"
  ^js [named-declaration]
  (.-kind ^js named-declaration))

(defn flags
  "**Returns:** `NodeFlags`"
  ^js [named-declaration]
  (.-flags ^js named-declaration))

(defn parent
  "**Returns:** `Node`"
  ^js [named-declaration]
  (.-parent ^js named-declaration))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [named-declaration]
  (.getSourceFile ^js named-declaration))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [named-declaration]
   (.getChildCount ^js named-declaration))
  (^js [named-declaration source-file]
   (.getChildCount ^js named-declaration source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [named-declaration index]
   (.getChildAt ^js named-declaration index))
  (^js [named-declaration index source-file]
   (.getChildAt ^js named-declaration index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [named-declaration]
   (.getChildren ^js named-declaration))
  (^js [named-declaration source-file]
   (.getChildren ^js named-declaration source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [named-declaration]
   (.getStart ^js named-declaration))
  (^js [named-declaration source-file]
   (.getStart ^js named-declaration source-file))
  (^js [named-declaration source-file include-js-doc-comment?]
   (.getStart ^js named-declaration source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [named-declaration]
  (.getFullStart ^js named-declaration))

(defn get-end
  "**Returns:** `number`"
  ^js [named-declaration]
  (.getEnd ^js named-declaration))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [named-declaration]
   (.getWidth ^js named-declaration))
  (^js [named-declaration source-file]
   (.getWidth ^js named-declaration source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [named-declaration]
  (.getFullWidth ^js named-declaration))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [named-declaration]
   (.getLeadingTriviaWidth ^js named-declaration))
  (^js [named-declaration source-file]
   (.getLeadingTriviaWidth ^js named-declaration source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [named-declaration]
   (.getFullText ^js named-declaration))
  (^js [named-declaration source-file]
   (.getFullText ^js named-declaration source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [named-declaration]
   (.getText ^js named-declaration))
  (^js [named-declaration source-file]
   (.getText ^js named-declaration source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [named-declaration]
   (.getFirstToken ^js named-declaration))
  (^js [named-declaration source-file]
   (.getFirstToken ^js named-declaration source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [named-declaration]
   (.getLastToken ^js named-declaration))
  (^js [named-declaration source-file]
   (.getLastToken ^js named-declaration source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [named-declaration cb-node]
   (.forEachChild ^js named-declaration cb-node))
  (^js [named-declaration cb-node cb-node-array]
   (.forEachChild ^js named-declaration cb-node cb-node-array)))

(defn pos
  "**Returns:** `number`"
  ^js [named-declaration]
  (.-pos ^js named-declaration))

(defn end
  "**Returns:** `number`"
  ^js [named-declaration]
  (.-end ^js named-declaration))
