(ns dots.typescript.big-int-literal)

(defn kind
  ^js [big-int-literal]
  (.-kind ^js big-int-literal))

(defn text
  ^js [big-int-literal]
  (.-text ^js big-int-literal))

(defn set-text!
  ^js [big-int-literal value]
  (set! (.-text ^js big-int-literal) value))

(defn unterminated?
  ^js [big-int-literal]
  (.-isUnterminated ^js big-int-literal))

(defn set-is-unterminated!
  ^js [big-int-literal value]
  (set! (.-isUnterminated ^js big-int-literal) value))

(defn has-extended-unicode-escape?
  ^js [big-int-literal]
  (.-hasExtendedUnicodeEscape ^js big-int-literal))

(defn set-has-extended-unicode-escape!
  ^js [big-int-literal value]
  (set! (.-hasExtendedUnicodeEscape ^js big-int-literal) value))

(defn flags
  ^js [big-int-literal]
  (.-flags ^js big-int-literal))

(defn parent
  ^js [big-int-literal]
  (.-parent ^js big-int-literal))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [big-int-literal]
  (.getSourceFile ^js big-int-literal))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [big-int-literal]
   (.getChildCount ^js big-int-literal))
  (^js [big-int-literal source-file]
   (.getChildCount ^js big-int-literal source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [big-int-literal index]
   (.getChildAt ^js big-int-literal index))
  (^js [big-int-literal index source-file]
   (.getChildAt ^js big-int-literal index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [big-int-literal]
   (.getChildren ^js big-int-literal))
  (^js [big-int-literal source-file]
   (.getChildren ^js big-int-literal source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [big-int-literal]
   (.getStart ^js big-int-literal))
  (^js [big-int-literal source-file]
   (.getStart ^js big-int-literal source-file))
  (^js [big-int-literal source-file include-js-doc-comment?]
   (.getStart ^js big-int-literal source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [big-int-literal]
  (.getFullStart ^js big-int-literal))

(defn get-end
  "**Returns:** `number`"
  ^js [big-int-literal]
  (.getEnd ^js big-int-literal))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [big-int-literal]
   (.getWidth ^js big-int-literal))
  (^js [big-int-literal source-file]
   (.getWidth ^js big-int-literal source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [big-int-literal]
  (.getFullWidth ^js big-int-literal))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [big-int-literal]
   (.getLeadingTriviaWidth ^js big-int-literal))
  (^js [big-int-literal source-file]
   (.getLeadingTriviaWidth ^js big-int-literal source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [big-int-literal]
   (.getFullText ^js big-int-literal))
  (^js [big-int-literal source-file]
   (.getFullText ^js big-int-literal source-file)))

(defn get-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [big-int-literal]
   (.getText ^js big-int-literal))
  (^js [big-int-literal source-file]
   (.getText ^js big-int-literal source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [big-int-literal]
   (.getFirstToken ^js big-int-literal))
  (^js [big-int-literal source-file]
   (.getFirstToken ^js big-int-literal source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [big-int-literal]
   (.getLastToken ^js big-int-literal))
  (^js [big-int-literal source-file]
   (.getLastToken ^js big-int-literal source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [big-int-literal cb-node]
   (.forEachChild ^js big-int-literal cb-node))
  (^js [big-int-literal cb-node cb-node-array]
   (.forEachChild ^js big-int-literal cb-node cb-node-array)))

(defn pos
  ^js [big-int-literal]
  (.-pos ^js big-int-literal))

(defn end
  ^js [big-int-literal]
  (.-end ^js big-int-literal))
