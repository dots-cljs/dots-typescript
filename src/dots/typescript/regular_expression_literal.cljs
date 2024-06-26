(ns dots.typescript.regular-expression-literal)

(defn kind
  "**Returns:** `SyntaxKind.RegularExpressionLiteral`"
  ^js [regular-expression-literal]
  (.-kind ^js regular-expression-literal))

(defn text
  "**Returns:** `string`"
  ^js [regular-expression-literal]
  (.-text ^js regular-expression-literal))

(defn set-text!
  ^js [regular-expression-literal value]
  (set! (.-text ^js regular-expression-literal) value))

(defn unterminated?
  "**Returns:** `boolean | undefined`"
  ^js [regular-expression-literal]
  (.-isUnterminated ^js regular-expression-literal))

(defn set-is-unterminated!
  ^js [regular-expression-literal value]
  (set! (.-isUnterminated ^js regular-expression-literal) value))

(defn has-extended-unicode-escape?
  "**Returns:** `boolean | undefined`"
  ^js [regular-expression-literal]
  (.-hasExtendedUnicodeEscape ^js regular-expression-literal))

(defn set-has-extended-unicode-escape!
  ^js [regular-expression-literal value]
  (set! (.-hasExtendedUnicodeEscape ^js regular-expression-literal) value))

(defn flags
  "**Returns:** `NodeFlags`"
  ^js [regular-expression-literal]
  (.-flags ^js regular-expression-literal))

(defn parent
  "**Returns:** `Node`"
  ^js [regular-expression-literal]
  (.-parent ^js regular-expression-literal))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [regular-expression-literal]
  (.getSourceFile ^js regular-expression-literal))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [regular-expression-literal]
   (.getChildCount ^js regular-expression-literal))
  (^js [regular-expression-literal source-file]
   (.getChildCount ^js regular-expression-literal source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [regular-expression-literal index]
   (.getChildAt ^js regular-expression-literal index))
  (^js [regular-expression-literal index source-file]
   (.getChildAt ^js regular-expression-literal index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [regular-expression-literal]
   (.getChildren ^js regular-expression-literal))
  (^js [regular-expression-literal source-file]
   (.getChildren ^js regular-expression-literal source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [regular-expression-literal]
   (.getStart ^js regular-expression-literal))
  (^js [regular-expression-literal source-file]
   (.getStart ^js regular-expression-literal source-file))
  (^js [regular-expression-literal source-file include-js-doc-comment?]
   (.getStart ^js regular-expression-literal source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [regular-expression-literal]
  (.getFullStart ^js regular-expression-literal))

(defn get-end
  "**Returns:** `number`"
  ^js [regular-expression-literal]
  (.getEnd ^js regular-expression-literal))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [regular-expression-literal]
   (.getWidth ^js regular-expression-literal))
  (^js [regular-expression-literal source-file]
   (.getWidth ^js regular-expression-literal source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [regular-expression-literal]
  (.getFullWidth ^js regular-expression-literal))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [regular-expression-literal]
   (.getLeadingTriviaWidth ^js regular-expression-literal))
  (^js [regular-expression-literal source-file]
   (.getLeadingTriviaWidth ^js regular-expression-literal source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [regular-expression-literal]
   (.getFullText ^js regular-expression-literal))
  (^js [regular-expression-literal source-file]
   (.getFullText ^js regular-expression-literal source-file)))

(defn get-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [regular-expression-literal]
   (.getText ^js regular-expression-literal))
  (^js [regular-expression-literal source-file]
   (.getText ^js regular-expression-literal source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [regular-expression-literal]
   (.getFirstToken ^js regular-expression-literal))
  (^js [regular-expression-literal source-file]
   (.getFirstToken ^js regular-expression-literal source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [regular-expression-literal]
   (.getLastToken ^js regular-expression-literal))
  (^js [regular-expression-literal source-file]
   (.getLastToken ^js regular-expression-literal source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [regular-expression-literal cb-node]
   (.forEachChild ^js regular-expression-literal cb-node))
  (^js [regular-expression-literal cb-node cb-node-array]
   (.forEachChild ^js regular-expression-literal cb-node cb-node-array)))

(defn pos
  "**Returns:** `number`"
  ^js [regular-expression-literal]
  (.-pos ^js regular-expression-literal))

(defn end
  "**Returns:** `number`"
  ^js [regular-expression-literal]
  (.-end ^js regular-expression-literal))
