(ns dots.typescript.numeric-literal)

(defn kind
  ^js [numeric-literal]
  (.-kind ^js numeric-literal))

(defn text
  ^js [numeric-literal]
  (.-text ^js numeric-literal))

(defn set-text!
  ^js [numeric-literal value]
  (set! (.-text ^js numeric-literal) value))

(defn unterminated?
  ^js [numeric-literal]
  (.-isUnterminated ^js numeric-literal))

(defn set-is-unterminated!
  ^js [numeric-literal value]
  (set! (.-isUnterminated ^js numeric-literal) value))

(defn has-extended-unicode-escape?
  ^js [numeric-literal]
  (.-hasExtendedUnicodeEscape ^js numeric-literal))

(defn set-has-extended-unicode-escape!
  ^js [numeric-literal value]
  (set! (.-hasExtendedUnicodeEscape ^js numeric-literal) value))

(defn flags
  ^js [numeric-literal]
  (.-flags ^js numeric-literal))

(defn parent
  ^js [numeric-literal]
  (.-parent ^js numeric-literal))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [numeric-literal]
  (.getSourceFile ^js numeric-literal))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [numeric-literal]
   (.getChildCount ^js numeric-literal))
  (^js [numeric-literal source-file]
   (.getChildCount ^js numeric-literal source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [numeric-literal index]
   (.getChildAt ^js numeric-literal index))
  (^js [numeric-literal index source-file]
   (.getChildAt ^js numeric-literal index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [numeric-literal]
   (.getChildren ^js numeric-literal))
  (^js [numeric-literal source-file]
   (.getChildren ^js numeric-literal source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [numeric-literal]
   (.getStart ^js numeric-literal))
  (^js [numeric-literal source-file]
   (.getStart ^js numeric-literal source-file))
  (^js [numeric-literal source-file include-js-doc-comment?]
   (.getStart ^js numeric-literal source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [numeric-literal]
  (.getFullStart ^js numeric-literal))

(defn get-end
  "**Returns:** `number`"
  ^js [numeric-literal]
  (.getEnd ^js numeric-literal))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [numeric-literal]
   (.getWidth ^js numeric-literal))
  (^js [numeric-literal source-file]
   (.getWidth ^js numeric-literal source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [numeric-literal]
  (.getFullWidth ^js numeric-literal))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [numeric-literal]
   (.getLeadingTriviaWidth ^js numeric-literal))
  (^js [numeric-literal source-file]
   (.getLeadingTriviaWidth ^js numeric-literal source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [numeric-literal]
   (.getFullText ^js numeric-literal))
  (^js [numeric-literal source-file]
   (.getFullText ^js numeric-literal source-file)))

(defn get-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [numeric-literal]
   (.getText ^js numeric-literal))
  (^js [numeric-literal source-file]
   (.getText ^js numeric-literal source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [numeric-literal]
   (.getFirstToken ^js numeric-literal))
  (^js [numeric-literal source-file]
   (.getFirstToken ^js numeric-literal source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [numeric-literal]
   (.getLastToken ^js numeric-literal))
  (^js [numeric-literal source-file]
   (.getLastToken ^js numeric-literal source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [numeric-literal cb-node]
   (.forEachChild ^js numeric-literal cb-node))
  (^js [numeric-literal cb-node cb-node-array]
   (.forEachChild ^js numeric-literal cb-node cb-node-array)))

(defn pos
  ^js [numeric-literal]
  (.-pos ^js numeric-literal))

(defn end
  ^js [numeric-literal]
  (.-end ^js numeric-literal))
