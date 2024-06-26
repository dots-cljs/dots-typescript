(ns dots.typescript.literal-expression)

(defn text
  "**Returns:** `string`"
  ^js [literal-expression]
  (.-text ^js literal-expression))

(defn set-text!
  ^js [literal-expression value]
  (set! (.-text ^js literal-expression) value))

(defn unterminated?
  "**Returns:** `boolean | undefined`"
  ^js [literal-expression]
  (.-isUnterminated ^js literal-expression))

(defn set-is-unterminated!
  ^js [literal-expression value]
  (set! (.-isUnterminated ^js literal-expression) value))

(defn has-extended-unicode-escape?
  "**Returns:** `boolean | undefined`"
  ^js [literal-expression]
  (.-hasExtendedUnicodeEscape ^js literal-expression))

(defn set-has-extended-unicode-escape!
  ^js [literal-expression value]
  (set! (.-hasExtendedUnicodeEscape ^js literal-expression) value))

(defn kind
  "**Returns:** `SyntaxKind`"
  ^js [literal-expression]
  (.-kind ^js literal-expression))

(defn flags
  "**Returns:** `NodeFlags`"
  ^js [literal-expression]
  (.-flags ^js literal-expression))

(defn parent
  "**Returns:** `Node`"
  ^js [literal-expression]
  (.-parent ^js literal-expression))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [literal-expression]
  (.getSourceFile ^js literal-expression))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [literal-expression]
   (.getChildCount ^js literal-expression))
  (^js [literal-expression source-file]
   (.getChildCount ^js literal-expression source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [literal-expression index]
   (.getChildAt ^js literal-expression index))
  (^js [literal-expression index source-file]
   (.getChildAt ^js literal-expression index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [literal-expression]
   (.getChildren ^js literal-expression))
  (^js [literal-expression source-file]
   (.getChildren ^js literal-expression source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [literal-expression]
   (.getStart ^js literal-expression))
  (^js [literal-expression source-file]
   (.getStart ^js literal-expression source-file))
  (^js [literal-expression source-file include-js-doc-comment?]
   (.getStart ^js literal-expression source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [literal-expression]
  (.getFullStart ^js literal-expression))

(defn get-end
  "**Returns:** `number`"
  ^js [literal-expression]
  (.getEnd ^js literal-expression))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [literal-expression]
   (.getWidth ^js literal-expression))
  (^js [literal-expression source-file]
   (.getWidth ^js literal-expression source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [literal-expression]
  (.getFullWidth ^js literal-expression))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [literal-expression]
   (.getLeadingTriviaWidth ^js literal-expression))
  (^js [literal-expression source-file]
   (.getLeadingTriviaWidth ^js literal-expression source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [literal-expression]
   (.getFullText ^js literal-expression))
  (^js [literal-expression source-file]
   (.getFullText ^js literal-expression source-file)))

(defn get-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [literal-expression]
   (.getText ^js literal-expression))
  (^js [literal-expression source-file]
   (.getText ^js literal-expression source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [literal-expression]
   (.getFirstToken ^js literal-expression))
  (^js [literal-expression source-file]
   (.getFirstToken ^js literal-expression source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [literal-expression]
   (.getLastToken ^js literal-expression))
  (^js [literal-expression source-file]
   (.getLastToken ^js literal-expression source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [literal-expression cb-node]
   (.forEachChild ^js literal-expression cb-node))
  (^js [literal-expression cb-node cb-node-array]
   (.forEachChild ^js literal-expression cb-node cb-node-array)))

(defn pos
  "**Returns:** `number`"
  ^js [literal-expression]
  (.-pos ^js literal-expression))

(defn end
  "**Returns:** `number`"
  ^js [literal-expression]
  (.-end ^js literal-expression))
