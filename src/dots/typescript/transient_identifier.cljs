(ns dots.typescript.transient-identifier)

(defn resolved-symbol
  ^js [transient-identifier]
  (.-resolvedSymbol ^js transient-identifier))

(defn set-resolved-symbol!
  ^js [transient-identifier value]
  (set! (.-resolvedSymbol ^js transient-identifier) value))

(defn kind
  ^js [transient-identifier]
  (.-kind ^js transient-identifier))

(defn escaped-text
  "Prefer to use `id.unescapedText`. (Note: This is available only in services, not internally to the TypeScript compiler.)
   Text of identifier, but if the identifier begins with two underscores, this will begin with three."
  ^js [transient-identifier]
  (.-escapedText ^js transient-identifier))

(defn text
  ^js [transient-identifier]
  (.-text ^js transient-identifier))

(defn original-keyword-kind
  ^js [transient-identifier]
  (.-originalKeywordKind ^js transient-identifier))

(defn in-js-doc-namespace?
  ^js [transient-identifier]
  (.-isInJSDocNamespace ^js transient-identifier))

(defn flags
  ^js [transient-identifier]
  (.-flags ^js transient-identifier))

(defn parent
  ^js [transient-identifier]
  (.-parent ^js transient-identifier))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [transient-identifier]
  (.getSourceFile ^js transient-identifier))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [transient-identifier]
   (.getChildCount ^js transient-identifier))
  (^js [transient-identifier source-file]
   (.getChildCount ^js transient-identifier source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [transient-identifier index]
   (.getChildAt ^js transient-identifier index))
  (^js [transient-identifier index source-file]
   (.getChildAt ^js transient-identifier index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [transient-identifier]
   (.getChildren ^js transient-identifier))
  (^js [transient-identifier source-file]
   (.getChildren ^js transient-identifier source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [transient-identifier]
   (.getStart ^js transient-identifier))
  (^js [transient-identifier source-file]
   (.getStart ^js transient-identifier source-file))
  (^js [transient-identifier source-file include-js-doc-comment?]
   (.getStart ^js transient-identifier source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [transient-identifier]
  (.getFullStart ^js transient-identifier))

(defn get-end
  "**Returns:** `number`"
  ^js [transient-identifier]
  (.getEnd ^js transient-identifier))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [transient-identifier]
   (.getWidth ^js transient-identifier))
  (^js [transient-identifier source-file]
   (.getWidth ^js transient-identifier source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [transient-identifier]
  (.getFullWidth ^js transient-identifier))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [transient-identifier]
   (.getLeadingTriviaWidth ^js transient-identifier))
  (^js [transient-identifier source-file]
   (.getLeadingTriviaWidth ^js transient-identifier source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [transient-identifier]
   (.getFullText ^js transient-identifier))
  (^js [transient-identifier source-file]
   (.getFullText ^js transient-identifier source-file)))

(defn get-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [transient-identifier]
   (.getText ^js transient-identifier))
  (^js [transient-identifier source-file]
   (.getText ^js transient-identifier source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [transient-identifier]
   (.getFirstToken ^js transient-identifier))
  (^js [transient-identifier source-file]
   (.getFirstToken ^js transient-identifier source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [transient-identifier]
   (.getLastToken ^js transient-identifier))
  (^js [transient-identifier source-file]
   (.getLastToken ^js transient-identifier source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [transient-identifier cb-node]
   (.forEachChild ^js transient-identifier cb-node))
  (^js [transient-identifier cb-node cb-node-array]
   (.forEachChild ^js transient-identifier cb-node cb-node-array)))

(defn pos
  ^js [transient-identifier]
  (.-pos ^js transient-identifier))

(defn end
  ^js [transient-identifier]
  (.-end ^js transient-identifier))
