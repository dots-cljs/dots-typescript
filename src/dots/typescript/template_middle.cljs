(ns dots.typescript.template-middle)

(defn kind
  ^js [template-middle]
  (.-kind ^js template-middle))

(defn parent
  ^js [template-middle]
  (.-parent ^js template-middle))

(defn raw-text
  ^js [template-middle]
  (.-rawText ^js template-middle))

(defn set-raw-text!
  ^js [template-middle value]
  (set! (.-rawText ^js template-middle) value))

(defn text
  ^js [template-middle]
  (.-text ^js template-middle))

(defn set-text!
  ^js [template-middle value]
  (set! (.-text ^js template-middle) value))

(defn unterminated?
  ^js [template-middle]
  (.-isUnterminated ^js template-middle))

(defn set-is-unterminated!
  ^js [template-middle value]
  (set! (.-isUnterminated ^js template-middle) value))

(defn has-extended-unicode-escape?
  ^js [template-middle]
  (.-hasExtendedUnicodeEscape ^js template-middle))

(defn set-has-extended-unicode-escape!
  ^js [template-middle value]
  (set! (.-hasExtendedUnicodeEscape ^js template-middle) value))

(defn flags
  ^js [template-middle]
  (.-flags ^js template-middle))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [template-middle]
  (.getSourceFile ^js template-middle))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [template-middle]
   (.getChildCount ^js template-middle))
  (^js [template-middle source-file]
   (.getChildCount ^js template-middle source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [template-middle index]
   (.getChildAt ^js template-middle index))
  (^js [template-middle index source-file]
   (.getChildAt ^js template-middle index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [template-middle]
   (.getChildren ^js template-middle))
  (^js [template-middle source-file]
   (.getChildren ^js template-middle source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [template-middle]
   (.getStart ^js template-middle))
  (^js [template-middle source-file]
   (.getStart ^js template-middle source-file))
  (^js [template-middle source-file include-js-doc-comment?]
   (.getStart ^js template-middle source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [template-middle]
  (.getFullStart ^js template-middle))

(defn get-end
  "**Returns:** `number`"
  ^js [template-middle]
  (.getEnd ^js template-middle))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [template-middle]
   (.getWidth ^js template-middle))
  (^js [template-middle source-file]
   (.getWidth ^js template-middle source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [template-middle]
  (.getFullWidth ^js template-middle))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [template-middle]
   (.getLeadingTriviaWidth ^js template-middle))
  (^js [template-middle source-file]
   (.getLeadingTriviaWidth ^js template-middle source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [template-middle]
   (.getFullText ^js template-middle))
  (^js [template-middle source-file]
   (.getFullText ^js template-middle source-file)))

(defn get-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [template-middle]
   (.getText ^js template-middle))
  (^js [template-middle source-file]
   (.getText ^js template-middle source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [template-middle]
   (.getFirstToken ^js template-middle))
  (^js [template-middle source-file]
   (.getFirstToken ^js template-middle source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [template-middle]
   (.getLastToken ^js template-middle))
  (^js [template-middle source-file]
   (.getLastToken ^js template-middle source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [template-middle cb-node]
   (.forEachChild ^js template-middle cb-node))
  (^js [template-middle cb-node cb-node-array]
   (.forEachChild ^js template-middle cb-node cb-node-array)))

(defn pos
  ^js [template-middle]
  (.-pos ^js template-middle))

(defn end
  ^js [template-middle]
  (.-end ^js template-middle))
