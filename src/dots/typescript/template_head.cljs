(ns dots.typescript.template-head)

(defn kind
  "**Returns:** `SyntaxKind.TemplateHead`"
  ^js [template-head]
  (.-kind ^js template-head))

(defn parent
  "**Returns:** `TemplateLiteralTypeNode | TemplateExpression`"
  ^js [template-head]
  (.-parent ^js template-head))

(defn raw-text
  "**Returns:** `string | undefined`"
  ^js [template-head]
  (.-rawText ^js template-head))

(defn set-raw-text!
  ^js [template-head value]
  (set! (.-rawText ^js template-head) value))

(defn text
  "**Returns:** `string`"
  ^js [template-head]
  (.-text ^js template-head))

(defn set-text!
  ^js [template-head value]
  (set! (.-text ^js template-head) value))

(defn unterminated?
  "**Returns:** `boolean | undefined`"
  ^js [template-head]
  (.-isUnterminated ^js template-head))

(defn set-is-unterminated!
  ^js [template-head value]
  (set! (.-isUnterminated ^js template-head) value))

(defn has-extended-unicode-escape?
  "**Returns:** `boolean | undefined`"
  ^js [template-head]
  (.-hasExtendedUnicodeEscape ^js template-head))

(defn set-has-extended-unicode-escape!
  ^js [template-head value]
  (set! (.-hasExtendedUnicodeEscape ^js template-head) value))

(defn flags
  "**Returns:** `NodeFlags`"
  ^js [template-head]
  (.-flags ^js template-head))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [template-head]
  (.getSourceFile ^js template-head))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [template-head]
   (.getChildCount ^js template-head))
  (^js [template-head source-file]
   (.getChildCount ^js template-head source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [template-head index]
   (.getChildAt ^js template-head index))
  (^js [template-head index source-file]
   (.getChildAt ^js template-head index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [template-head]
   (.getChildren ^js template-head))
  (^js [template-head source-file]
   (.getChildren ^js template-head source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [template-head]
   (.getStart ^js template-head))
  (^js [template-head source-file]
   (.getStart ^js template-head source-file))
  (^js [template-head source-file include-js-doc-comment?]
   (.getStart ^js template-head source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [template-head]
  (.getFullStart ^js template-head))

(defn get-end
  "**Returns:** `number`"
  ^js [template-head]
  (.getEnd ^js template-head))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [template-head]
   (.getWidth ^js template-head))
  (^js [template-head source-file]
   (.getWidth ^js template-head source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [template-head]
  (.getFullWidth ^js template-head))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [template-head]
   (.getLeadingTriviaWidth ^js template-head))
  (^js [template-head source-file]
   (.getLeadingTriviaWidth ^js template-head source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [template-head]
   (.getFullText ^js template-head))
  (^js [template-head source-file]
   (.getFullText ^js template-head source-file)))

(defn get-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [template-head]
   (.getText ^js template-head))
  (^js [template-head source-file]
   (.getText ^js template-head source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [template-head]
   (.getFirstToken ^js template-head))
  (^js [template-head source-file]
   (.getFirstToken ^js template-head source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [template-head]
   (.getLastToken ^js template-head))
  (^js [template-head source-file]
   (.getLastToken ^js template-head source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [template-head cb-node]
   (.forEachChild ^js template-head cb-node))
  (^js [template-head cb-node cb-node-array]
   (.forEachChild ^js template-head cb-node cb-node-array)))

(defn pos
  "**Returns:** `number`"
  ^js [template-head]
  (.-pos ^js template-head))

(defn end
  "**Returns:** `number`"
  ^js [template-head]
  (.-end ^js template-head))
