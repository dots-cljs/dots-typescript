(ns dots.typescript.no-substitution-template-literal)

(defn kind
  "**Returns:** `SyntaxKind.NoSubstitutionTemplateLiteral`"
  ^js [no-substitution-template-literal]
  (.-kind ^js no-substitution-template-literal))

(defn text
  "**Returns:** `string`"
  ^js [no-substitution-template-literal]
  (.-text ^js no-substitution-template-literal))

(defn set-text!
  ^js [no-substitution-template-literal value]
  (set! (.-text ^js no-substitution-template-literal) value))

(defn unterminated?
  "**Returns:** `boolean | undefined`"
  ^js [no-substitution-template-literal]
  (.-isUnterminated ^js no-substitution-template-literal))

(defn set-is-unterminated!
  ^js [no-substitution-template-literal value]
  (set! (.-isUnterminated ^js no-substitution-template-literal) value))

(defn has-extended-unicode-escape?
  "**Returns:** `boolean | undefined`"
  ^js [no-substitution-template-literal]
  (.-hasExtendedUnicodeEscape ^js no-substitution-template-literal))

(defn set-has-extended-unicode-escape!
  ^js [no-substitution-template-literal value]
  (set! (.-hasExtendedUnicodeEscape ^js no-substitution-template-literal) value))

(defn flags
  "**Returns:** `NodeFlags`"
  ^js [no-substitution-template-literal]
  (.-flags ^js no-substitution-template-literal))

(defn parent
  "**Returns:** `Node`"
  ^js [no-substitution-template-literal]
  (.-parent ^js no-substitution-template-literal))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [no-substitution-template-literal]
  (.getSourceFile ^js no-substitution-template-literal))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [no-substitution-template-literal]
   (.getChildCount ^js no-substitution-template-literal))
  (^js [no-substitution-template-literal source-file]
   (.getChildCount ^js no-substitution-template-literal source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [no-substitution-template-literal index]
   (.getChildAt ^js no-substitution-template-literal index))
  (^js [no-substitution-template-literal index source-file]
   (.getChildAt ^js no-substitution-template-literal index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [no-substitution-template-literal]
   (.getChildren ^js no-substitution-template-literal))
  (^js [no-substitution-template-literal source-file]
   (.getChildren ^js no-substitution-template-literal source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [no-substitution-template-literal]
   (.getStart ^js no-substitution-template-literal))
  (^js [no-substitution-template-literal source-file]
   (.getStart ^js no-substitution-template-literal source-file))
  (^js [no-substitution-template-literal source-file include-js-doc-comment?]
   (.getStart ^js no-substitution-template-literal source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [no-substitution-template-literal]
  (.getFullStart ^js no-substitution-template-literal))

(defn get-end
  "**Returns:** `number`"
  ^js [no-substitution-template-literal]
  (.getEnd ^js no-substitution-template-literal))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [no-substitution-template-literal]
   (.getWidth ^js no-substitution-template-literal))
  (^js [no-substitution-template-literal source-file]
   (.getWidth ^js no-substitution-template-literal source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [no-substitution-template-literal]
  (.getFullWidth ^js no-substitution-template-literal))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [no-substitution-template-literal]
   (.getLeadingTriviaWidth ^js no-substitution-template-literal))
  (^js [no-substitution-template-literal source-file]
   (.getLeadingTriviaWidth ^js no-substitution-template-literal source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [no-substitution-template-literal]
   (.getFullText ^js no-substitution-template-literal))
  (^js [no-substitution-template-literal source-file]
   (.getFullText ^js no-substitution-template-literal source-file)))

(defn get-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [no-substitution-template-literal]
   (.getText ^js no-substitution-template-literal))
  (^js [no-substitution-template-literal source-file]
   (.getText ^js no-substitution-template-literal source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [no-substitution-template-literal]
   (.getFirstToken ^js no-substitution-template-literal))
  (^js [no-substitution-template-literal source-file]
   (.getFirstToken ^js no-substitution-template-literal source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [no-substitution-template-literal]
   (.getLastToken ^js no-substitution-template-literal))
  (^js [no-substitution-template-literal source-file]
   (.getLastToken ^js no-substitution-template-literal source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [no-substitution-template-literal cb-node]
   (.forEachChild ^js no-substitution-template-literal cb-node))
  (^js [no-substitution-template-literal cb-node cb-node-array]
   (.forEachChild ^js no-substitution-template-literal cb-node cb-node-array)))

(defn pos
  "**Returns:** `number`"
  ^js [no-substitution-template-literal]
  (.-pos ^js no-substitution-template-literal))

(defn end
  "**Returns:** `number`"
  ^js [no-substitution-template-literal]
  (.-end ^js no-substitution-template-literal))

(defn raw-text
  "**Returns:** `string | undefined`"
  ^js [no-substitution-template-literal]
  (.-rawText ^js no-substitution-template-literal))

(defn set-raw-text!
  ^js [no-substitution-template-literal value]
  (set! (.-rawText ^js no-substitution-template-literal) value))
