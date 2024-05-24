(ns dots.typescript.identifier)

(defn kind
  ^js [identifier]
  (.-kind ^js identifier))

(defn escaped-text
  "Prefer to use `id.unescapedText`. (Note: This is available only in services, not internally to the TypeScript compiler.)
   Text of identifier, but if the identifier begins with two underscores, this will begin with three."
  ^js [identifier]
  (.-escapedText ^js identifier))

(defn text
  ^js [identifier]
  (.-text ^js identifier))

(defn original-keyword-kind
  ^js [identifier]
  (.-originalKeywordKind ^js identifier))

(defn in-js-doc-namespace?
  ^js [identifier]
  (.-isInJSDocNamespace ^js identifier))

(defn flags
  ^js [identifier]
  (.-flags ^js identifier))

(defn parent
  ^js [identifier]
  (.-parent ^js identifier))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [identifier]
  (.getSourceFile ^js identifier))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [identifier]
   (.getChildCount ^js identifier))
  (^js [identifier source-file]
   (.getChildCount ^js identifier source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [identifier index]
   (.getChildAt ^js identifier index))
  (^js [identifier index source-file]
   (.getChildAt ^js identifier index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [identifier]
   (.getChildren ^js identifier))
  (^js [identifier source-file]
   (.getChildren ^js identifier source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [identifier]
   (.getStart ^js identifier))
  (^js [identifier source-file]
   (.getStart ^js identifier source-file))
  (^js [identifier source-file include-js-doc-comment?]
   (.getStart ^js identifier source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [identifier]
  (.getFullStart ^js identifier))

(defn get-end
  "**Returns:** `number`"
  ^js [identifier]
  (.getEnd ^js identifier))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [identifier]
   (.getWidth ^js identifier))
  (^js [identifier source-file]
   (.getWidth ^js identifier source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [identifier]
  (.getFullWidth ^js identifier))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [identifier]
   (.getLeadingTriviaWidth ^js identifier))
  (^js [identifier source-file]
   (.getLeadingTriviaWidth ^js identifier source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [identifier]
   (.getFullText ^js identifier))
  (^js [identifier source-file]
   (.getFullText ^js identifier source-file)))

(defn get-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [identifier]
   (.getText ^js identifier))
  (^js [identifier source-file]
   (.getText ^js identifier source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [identifier]
   (.getFirstToken ^js identifier))
  (^js [identifier source-file]
   (.getFirstToken ^js identifier source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [identifier]
   (.getLastToken ^js identifier))
  (^js [identifier source-file]
   (.getLastToken ^js identifier source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [identifier cb-node]
   (.forEachChild ^js identifier cb-node))
  (^js [identifier cb-node cb-node-array]
   (.forEachChild ^js identifier cb-node cb-node-array)))

(defn pos
  ^js [identifier]
  (.-pos ^js identifier))

(defn end
  ^js [identifier]
  (.-end ^js identifier))
