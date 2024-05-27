(ns dots.typescript.input-files)

(defn kind
  "**Returns:** `SyntaxKind.InputFiles`"
  ^js [input-files]
  (.-kind ^js input-files))

(defn javascript-path
  "**Returns:** `string | undefined`"
  ^js [input-files]
  (.-javascriptPath ^js input-files))

(defn set-javascript-path!
  ^js [input-files value]
  (set! (.-javascriptPath ^js input-files) value))

(defn javascript-text
  "**Returns:** `string`"
  ^js [input-files]
  (.-javascriptText ^js input-files))

(defn set-javascript-text!
  ^js [input-files value]
  (set! (.-javascriptText ^js input-files) value))

(defn javascript-map-path
  "**Returns:** `string | undefined`"
  ^js [input-files]
  (.-javascriptMapPath ^js input-files))

(defn set-javascript-map-path!
  ^js [input-files value]
  (set! (.-javascriptMapPath ^js input-files) value))

(defn javascript-map-text
  "**Returns:** `string | undefined`"
  ^js [input-files]
  (.-javascriptMapText ^js input-files))

(defn set-javascript-map-text!
  ^js [input-files value]
  (set! (.-javascriptMapText ^js input-files) value))

(defn declaration-path
  "**Returns:** `string | undefined`"
  ^js [input-files]
  (.-declarationPath ^js input-files))

(defn set-declaration-path!
  ^js [input-files value]
  (set! (.-declarationPath ^js input-files) value))

(defn declaration-text
  "**Returns:** `string`"
  ^js [input-files]
  (.-declarationText ^js input-files))

(defn set-declaration-text!
  ^js [input-files value]
  (set! (.-declarationText ^js input-files) value))

(defn declaration-map-path
  "**Returns:** `string | undefined`"
  ^js [input-files]
  (.-declarationMapPath ^js input-files))

(defn set-declaration-map-path!
  ^js [input-files value]
  (set! (.-declarationMapPath ^js input-files) value))

(defn declaration-map-text
  "**Returns:** `string | undefined`"
  ^js [input-files]
  (.-declarationMapText ^js input-files))

(defn set-declaration-map-text!
  ^js [input-files value]
  (set! (.-declarationMapText ^js input-files) value))

(defn flags
  "**Returns:** `NodeFlags`"
  ^js [input-files]
  (.-flags ^js input-files))

(defn parent
  "**Returns:** `Node`"
  ^js [input-files]
  (.-parent ^js input-files))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [input-files]
  (.getSourceFile ^js input-files))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [input-files]
   (.getChildCount ^js input-files))
  (^js [input-files source-file]
   (.getChildCount ^js input-files source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [input-files index]
   (.getChildAt ^js input-files index))
  (^js [input-files index source-file]
   (.getChildAt ^js input-files index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [input-files]
   (.getChildren ^js input-files))
  (^js [input-files source-file]
   (.getChildren ^js input-files source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [input-files]
   (.getStart ^js input-files))
  (^js [input-files source-file]
   (.getStart ^js input-files source-file))
  (^js [input-files source-file include-js-doc-comment?]
   (.getStart ^js input-files source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [input-files]
  (.getFullStart ^js input-files))

(defn get-end
  "**Returns:** `number`"
  ^js [input-files]
  (.getEnd ^js input-files))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [input-files]
   (.getWidth ^js input-files))
  (^js [input-files source-file]
   (.getWidth ^js input-files source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [input-files]
  (.getFullWidth ^js input-files))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [input-files]
   (.getLeadingTriviaWidth ^js input-files))
  (^js [input-files source-file]
   (.getLeadingTriviaWidth ^js input-files source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [input-files]
   (.getFullText ^js input-files))
  (^js [input-files source-file]
   (.getFullText ^js input-files source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [input-files]
   (.getText ^js input-files))
  (^js [input-files source-file]
   (.getText ^js input-files source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [input-files]
   (.getFirstToken ^js input-files))
  (^js [input-files source-file]
   (.getFirstToken ^js input-files source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [input-files]
   (.getLastToken ^js input-files))
  (^js [input-files source-file]
   (.getLastToken ^js input-files source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [input-files cb-node]
   (.forEachChild ^js input-files cb-node))
  (^js [input-files cb-node cb-node-array]
   (.forEachChild ^js input-files cb-node cb-node-array)))

(defn pos
  "**Returns:** `number`"
  ^js [input-files]
  (.-pos ^js input-files))

(defn end
  "**Returns:** `number`"
  ^js [input-files]
  (.-end ^js input-files))
