(ns dots.typescript.bundle)

(defn kind
  "**Returns:** `SyntaxKind.Bundle`"
  ^js [bundle]
  (.-kind ^js bundle))

(defn prepends
  "**Returns:** `readonly (UnparsedSource | InputFiles)[]`"
  ^js [bundle]
  (.-prepends ^js bundle))

(defn source-files
  "**Returns:** `readonly SourceFile[]`"
  ^js [bundle]
  (.-sourceFiles ^js bundle))

(defn flags
  "**Returns:** `NodeFlags`"
  ^js [bundle]
  (.-flags ^js bundle))

(defn parent
  "**Returns:** `Node`"
  ^js [bundle]
  (.-parent ^js bundle))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [bundle]
  (.getSourceFile ^js bundle))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [bundle]
   (.getChildCount ^js bundle))
  (^js [bundle source-file]
   (.getChildCount ^js bundle source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [bundle index]
   (.getChildAt ^js bundle index))
  (^js [bundle index source-file]
   (.getChildAt ^js bundle index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [bundle]
   (.getChildren ^js bundle))
  (^js [bundle source-file]
   (.getChildren ^js bundle source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [bundle]
   (.getStart ^js bundle))
  (^js [bundle source-file]
   (.getStart ^js bundle source-file))
  (^js [bundle source-file include-js-doc-comment?]
   (.getStart ^js bundle source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [bundle]
  (.getFullStart ^js bundle))

(defn get-end
  "**Returns:** `number`"
  ^js [bundle]
  (.getEnd ^js bundle))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [bundle]
   (.getWidth ^js bundle))
  (^js [bundle source-file]
   (.getWidth ^js bundle source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [bundle]
  (.getFullWidth ^js bundle))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [bundle]
   (.getLeadingTriviaWidth ^js bundle))
  (^js [bundle source-file]
   (.getLeadingTriviaWidth ^js bundle source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [bundle]
   (.getFullText ^js bundle))
  (^js [bundle source-file]
   (.getFullText ^js bundle source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [bundle]
   (.getText ^js bundle))
  (^js [bundle source-file]
   (.getText ^js bundle source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [bundle]
   (.getFirstToken ^js bundle))
  (^js [bundle source-file]
   (.getFirstToken ^js bundle source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [bundle]
   (.getLastToken ^js bundle))
  (^js [bundle source-file]
   (.getLastToken ^js bundle source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [bundle cb-node]
   (.forEachChild ^js bundle cb-node))
  (^js [bundle cb-node cb-node-array]
   (.forEachChild ^js bundle cb-node cb-node-array)))

(defn pos
  "**Returns:** `number`"
  ^js [bundle]
  (.-pos ^js bundle))

(defn end
  "**Returns:** `number`"
  ^js [bundle]
  (.-end ^js bundle))
