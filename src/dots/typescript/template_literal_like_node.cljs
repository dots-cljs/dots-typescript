(ns dots.typescript.template-literal-like-node)

(defn raw-text
  "**Returns:** `string | undefined`"
  ^js [template-literal-like-node]
  (.-rawText ^js template-literal-like-node))

(defn set-raw-text!
  ^js [template-literal-like-node value]
  (set! (.-rawText ^js template-literal-like-node) value))

(defn text
  "**Returns:** `string`"
  ^js [template-literal-like-node]
  (.-text ^js template-literal-like-node))

(defn set-text!
  ^js [template-literal-like-node value]
  (set! (.-text ^js template-literal-like-node) value))

(defn unterminated?
  "**Returns:** `boolean | undefined`"
  ^js [template-literal-like-node]
  (.-isUnterminated ^js template-literal-like-node))

(defn set-is-unterminated!
  ^js [template-literal-like-node value]
  (set! (.-isUnterminated ^js template-literal-like-node) value))

(defn has-extended-unicode-escape?
  "**Returns:** `boolean | undefined`"
  ^js [template-literal-like-node]
  (.-hasExtendedUnicodeEscape ^js template-literal-like-node))

(defn set-has-extended-unicode-escape!
  ^js [template-literal-like-node value]
  (set! (.-hasExtendedUnicodeEscape ^js template-literal-like-node) value))

(defn kind
  "**Returns:** `SyntaxKind`"
  ^js [template-literal-like-node]
  (.-kind ^js template-literal-like-node))

(defn flags
  "**Returns:** `NodeFlags`"
  ^js [template-literal-like-node]
  (.-flags ^js template-literal-like-node))

(defn parent
  "**Returns:** `Node`"
  ^js [template-literal-like-node]
  (.-parent ^js template-literal-like-node))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [template-literal-like-node]
  (.getSourceFile ^js template-literal-like-node))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [template-literal-like-node]
   (.getChildCount ^js template-literal-like-node))
  (^js [template-literal-like-node source-file]
   (.getChildCount ^js template-literal-like-node source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [template-literal-like-node index]
   (.getChildAt ^js template-literal-like-node index))
  (^js [template-literal-like-node index source-file]
   (.getChildAt ^js template-literal-like-node index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [template-literal-like-node]
   (.getChildren ^js template-literal-like-node))
  (^js [template-literal-like-node source-file]
   (.getChildren ^js template-literal-like-node source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [template-literal-like-node]
   (.getStart ^js template-literal-like-node))
  (^js [template-literal-like-node source-file]
   (.getStart ^js template-literal-like-node source-file))
  (^js [template-literal-like-node source-file include-js-doc-comment?]
   (.getStart ^js template-literal-like-node source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [template-literal-like-node]
  (.getFullStart ^js template-literal-like-node))

(defn get-end
  "**Returns:** `number`"
  ^js [template-literal-like-node]
  (.getEnd ^js template-literal-like-node))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [template-literal-like-node]
   (.getWidth ^js template-literal-like-node))
  (^js [template-literal-like-node source-file]
   (.getWidth ^js template-literal-like-node source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [template-literal-like-node]
  (.getFullWidth ^js template-literal-like-node))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [template-literal-like-node]
   (.getLeadingTriviaWidth ^js template-literal-like-node))
  (^js [template-literal-like-node source-file]
   (.getLeadingTriviaWidth ^js template-literal-like-node source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [template-literal-like-node]
   (.getFullText ^js template-literal-like-node))
  (^js [template-literal-like-node source-file]
   (.getFullText ^js template-literal-like-node source-file)))

(defn get-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [template-literal-like-node]
   (.getText ^js template-literal-like-node))
  (^js [template-literal-like-node source-file]
   (.getText ^js template-literal-like-node source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [template-literal-like-node]
   (.getFirstToken ^js template-literal-like-node))
  (^js [template-literal-like-node source-file]
   (.getFirstToken ^js template-literal-like-node source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [template-literal-like-node]
   (.getLastToken ^js template-literal-like-node))
  (^js [template-literal-like-node source-file]
   (.getLastToken ^js template-literal-like-node source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [template-literal-like-node cb-node]
   (.forEachChild ^js template-literal-like-node cb-node))
  (^js [template-literal-like-node cb-node cb-node-array]
   (.forEachChild ^js template-literal-like-node cb-node cb-node-array)))

(defn pos
  "**Returns:** `number`"
  ^js [template-literal-like-node]
  (.-pos ^js template-literal-like-node))

(defn end
  "**Returns:** `number`"
  ^js [template-literal-like-node]
  (.-end ^js template-literal-like-node))
