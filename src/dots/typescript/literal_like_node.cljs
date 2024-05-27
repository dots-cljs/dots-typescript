(ns dots.typescript.literal-like-node)

(defn text
  "**Returns:** `string`"
  ^js [literal-like-node]
  (.-text ^js literal-like-node))

(defn set-text!
  ^js [literal-like-node value]
  (set! (.-text ^js literal-like-node) value))

(defn unterminated?
  "**Returns:** `boolean | undefined`"
  ^js [literal-like-node]
  (.-isUnterminated ^js literal-like-node))

(defn set-is-unterminated!
  ^js [literal-like-node value]
  (set! (.-isUnterminated ^js literal-like-node) value))

(defn has-extended-unicode-escape?
  "**Returns:** `boolean | undefined`"
  ^js [literal-like-node]
  (.-hasExtendedUnicodeEscape ^js literal-like-node))

(defn set-has-extended-unicode-escape!
  ^js [literal-like-node value]
  (set! (.-hasExtendedUnicodeEscape ^js literal-like-node) value))

(defn kind
  "**Returns:** `SyntaxKind`"
  ^js [literal-like-node]
  (.-kind ^js literal-like-node))

(defn flags
  "**Returns:** `NodeFlags`"
  ^js [literal-like-node]
  (.-flags ^js literal-like-node))

(defn parent
  "**Returns:** `Node`"
  ^js [literal-like-node]
  (.-parent ^js literal-like-node))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [literal-like-node]
  (.getSourceFile ^js literal-like-node))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [literal-like-node]
   (.getChildCount ^js literal-like-node))
  (^js [literal-like-node source-file]
   (.getChildCount ^js literal-like-node source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [literal-like-node index]
   (.getChildAt ^js literal-like-node index))
  (^js [literal-like-node index source-file]
   (.getChildAt ^js literal-like-node index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [literal-like-node]
   (.getChildren ^js literal-like-node))
  (^js [literal-like-node source-file]
   (.getChildren ^js literal-like-node source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [literal-like-node]
   (.getStart ^js literal-like-node))
  (^js [literal-like-node source-file]
   (.getStart ^js literal-like-node source-file))
  (^js [literal-like-node source-file include-js-doc-comment?]
   (.getStart ^js literal-like-node source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [literal-like-node]
  (.getFullStart ^js literal-like-node))

(defn get-end
  "**Returns:** `number`"
  ^js [literal-like-node]
  (.getEnd ^js literal-like-node))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [literal-like-node]
   (.getWidth ^js literal-like-node))
  (^js [literal-like-node source-file]
   (.getWidth ^js literal-like-node source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [literal-like-node]
  (.getFullWidth ^js literal-like-node))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [literal-like-node]
   (.getLeadingTriviaWidth ^js literal-like-node))
  (^js [literal-like-node source-file]
   (.getLeadingTriviaWidth ^js literal-like-node source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [literal-like-node]
   (.getFullText ^js literal-like-node))
  (^js [literal-like-node source-file]
   (.getFullText ^js literal-like-node source-file)))

(defn get-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [literal-like-node]
   (.getText ^js literal-like-node))
  (^js [literal-like-node source-file]
   (.getText ^js literal-like-node source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [literal-like-node]
   (.getFirstToken ^js literal-like-node))
  (^js [literal-like-node source-file]
   (.getFirstToken ^js literal-like-node source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [literal-like-node]
   (.getLastToken ^js literal-like-node))
  (^js [literal-like-node source-file]
   (.getLastToken ^js literal-like-node source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [literal-like-node cb-node]
   (.forEachChild ^js literal-like-node cb-node))
  (^js [literal-like-node cb-node cb-node-array]
   (.forEachChild ^js literal-like-node cb-node cb-node-array)))

(defn pos
  "**Returns:** `number`"
  ^js [literal-like-node]
  (.-pos ^js literal-like-node))

(defn end
  "**Returns:** `number`"
  ^js [literal-like-node]
  (.-end ^js literal-like-node))
