(ns dots.typescript.missing-declaration
  (:refer-clojure :exclude [name]))

(defn kind
  "**Returns:** `SyntaxKind.MissingDeclaration`"
  ^js [missing-declaration]
  (.-kind ^js missing-declaration))

(defn name
  "**Returns:** `Identifier | undefined`"
  ^js [missing-declaration]
  (.-name ^js missing-declaration))

(defn flags
  "**Returns:** `NodeFlags`"
  ^js [missing-declaration]
  (.-flags ^js missing-declaration))

(defn parent
  "**Returns:** `Node`"
  ^js [missing-declaration]
  (.-parent ^js missing-declaration))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [missing-declaration]
  (.getSourceFile ^js missing-declaration))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [missing-declaration]
   (.getChildCount ^js missing-declaration))
  (^js [missing-declaration source-file]
   (.getChildCount ^js missing-declaration source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [missing-declaration index]
   (.getChildAt ^js missing-declaration index))
  (^js [missing-declaration index source-file]
   (.getChildAt ^js missing-declaration index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [missing-declaration]
   (.getChildren ^js missing-declaration))
  (^js [missing-declaration source-file]
   (.getChildren ^js missing-declaration source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [missing-declaration]
   (.getStart ^js missing-declaration))
  (^js [missing-declaration source-file]
   (.getStart ^js missing-declaration source-file))
  (^js [missing-declaration source-file include-js-doc-comment?]
   (.getStart ^js missing-declaration source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [missing-declaration]
  (.getFullStart ^js missing-declaration))

(defn get-end
  "**Returns:** `number`"
  ^js [missing-declaration]
  (.getEnd ^js missing-declaration))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [missing-declaration]
   (.getWidth ^js missing-declaration))
  (^js [missing-declaration source-file]
   (.getWidth ^js missing-declaration source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [missing-declaration]
  (.getFullWidth ^js missing-declaration))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [missing-declaration]
   (.getLeadingTriviaWidth ^js missing-declaration))
  (^js [missing-declaration source-file]
   (.getLeadingTriviaWidth ^js missing-declaration source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [missing-declaration]
   (.getFullText ^js missing-declaration))
  (^js [missing-declaration source-file]
   (.getFullText ^js missing-declaration source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [missing-declaration]
   (.getText ^js missing-declaration))
  (^js [missing-declaration source-file]
   (.getText ^js missing-declaration source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [missing-declaration]
   (.getFirstToken ^js missing-declaration))
  (^js [missing-declaration source-file]
   (.getFirstToken ^js missing-declaration source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [missing-declaration]
   (.getLastToken ^js missing-declaration))
  (^js [missing-declaration source-file]
   (.getLastToken ^js missing-declaration source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [missing-declaration cb-node]
   (.forEachChild ^js missing-declaration cb-node))
  (^js [missing-declaration cb-node cb-node-array]
   (.forEachChild ^js missing-declaration cb-node cb-node-array)))

(defn pos
  "**Returns:** `number`"
  ^js [missing-declaration]
  (.-pos ^js missing-declaration))

(defn end
  "**Returns:** `number`"
  ^js [missing-declaration]
  (.-end ^js missing-declaration))
