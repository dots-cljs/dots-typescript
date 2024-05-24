(ns dots.typescript.template-tail)

(defn kind
  ^js [template-tail]
  (.-kind ^js template-tail))

(defn parent
  ^js [template-tail]
  (.-parent ^js template-tail))

(defn raw-text
  ^js [template-tail]
  (.-rawText ^js template-tail))

(defn set-raw-text!
  ^js [template-tail value]
  (set! (.-rawText ^js template-tail) value))

(defn text
  ^js [template-tail]
  (.-text ^js template-tail))

(defn set-text!
  ^js [template-tail value]
  (set! (.-text ^js template-tail) value))

(defn unterminated?
  ^js [template-tail]
  (.-isUnterminated ^js template-tail))

(defn set-is-unterminated!
  ^js [template-tail value]
  (set! (.-isUnterminated ^js template-tail) value))

(defn has-extended-unicode-escape?
  ^js [template-tail]
  (.-hasExtendedUnicodeEscape ^js template-tail))

(defn set-has-extended-unicode-escape!
  ^js [template-tail value]
  (set! (.-hasExtendedUnicodeEscape ^js template-tail) value))

(defn flags
  ^js [template-tail]
  (.-flags ^js template-tail))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [template-tail]
  (.getSourceFile ^js template-tail))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [template-tail]
   (.getChildCount ^js template-tail))
  (^js [template-tail source-file]
   (.getChildCount ^js template-tail source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [template-tail index]
   (.getChildAt ^js template-tail index))
  (^js [template-tail index source-file]
   (.getChildAt ^js template-tail index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [template-tail]
   (.getChildren ^js template-tail))
  (^js [template-tail source-file]
   (.getChildren ^js template-tail source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [template-tail]
   (.getStart ^js template-tail))
  (^js [template-tail source-file]
   (.getStart ^js template-tail source-file))
  (^js [template-tail source-file include-js-doc-comment?]
   (.getStart ^js template-tail source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [template-tail]
  (.getFullStart ^js template-tail))

(defn get-end
  "**Returns:** `number`"
  ^js [template-tail]
  (.getEnd ^js template-tail))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [template-tail]
   (.getWidth ^js template-tail))
  (^js [template-tail source-file]
   (.getWidth ^js template-tail source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [template-tail]
  (.getFullWidth ^js template-tail))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [template-tail]
   (.getLeadingTriviaWidth ^js template-tail))
  (^js [template-tail source-file]
   (.getLeadingTriviaWidth ^js template-tail source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [template-tail]
   (.getFullText ^js template-tail))
  (^js [template-tail source-file]
   (.getFullText ^js template-tail source-file)))

(defn get-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [template-tail]
   (.getText ^js template-tail))
  (^js [template-tail source-file]
   (.getText ^js template-tail source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [template-tail]
   (.getFirstToken ^js template-tail))
  (^js [template-tail source-file]
   (.getFirstToken ^js template-tail source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [template-tail]
   (.getLastToken ^js template-tail))
  (^js [template-tail source-file]
   (.getLastToken ^js template-tail source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [template-tail cb-node]
   (.forEachChild ^js template-tail cb-node))
  (^js [template-tail cb-node cb-node-array]
   (.forEachChild ^js template-tail cb-node cb-node-array)))

(defn pos
  ^js [template-tail]
  (.-pos ^js template-tail))

(defn end
  ^js [template-tail]
  (.-end ^js template-tail))
