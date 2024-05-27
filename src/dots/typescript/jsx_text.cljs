(ns dots.typescript.jsx-text)

(defn kind
  "**Returns:** `SyntaxKind.JsxText`"
  ^js [jsx-text]
  (.-kind ^js jsx-text))

(defn parent
  "**Returns:** `JsxElement | JsxFragment`"
  ^js [jsx-text]
  (.-parent ^js jsx-text))

(defn contains-only-trivia-white-spaces?
  "**Returns:** `boolean`"
  ^js [jsx-text]
  (.-containsOnlyTriviaWhiteSpaces ^js jsx-text))

(defn text
  "**Returns:** `string`"
  ^js [jsx-text]
  (.-text ^js jsx-text))

(defn set-text!
  ^js [jsx-text value]
  (set! (.-text ^js jsx-text) value))

(defn unterminated?
  "**Returns:** `boolean | undefined`"
  ^js [jsx-text]
  (.-isUnterminated ^js jsx-text))

(defn set-is-unterminated!
  ^js [jsx-text value]
  (set! (.-isUnterminated ^js jsx-text) value))

(defn has-extended-unicode-escape?
  "**Returns:** `boolean | undefined`"
  ^js [jsx-text]
  (.-hasExtendedUnicodeEscape ^js jsx-text))

(defn set-has-extended-unicode-escape!
  ^js [jsx-text value]
  (set! (.-hasExtendedUnicodeEscape ^js jsx-text) value))

(defn flags
  "**Returns:** `NodeFlags`"
  ^js [jsx-text]
  (.-flags ^js jsx-text))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [jsx-text]
  (.getSourceFile ^js jsx-text))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [jsx-text]
   (.getChildCount ^js jsx-text))
  (^js [jsx-text source-file]
   (.getChildCount ^js jsx-text source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [jsx-text index]
   (.getChildAt ^js jsx-text index))
  (^js [jsx-text index source-file]
   (.getChildAt ^js jsx-text index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [jsx-text]
   (.getChildren ^js jsx-text))
  (^js [jsx-text source-file]
   (.getChildren ^js jsx-text source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [jsx-text]
   (.getStart ^js jsx-text))
  (^js [jsx-text source-file]
   (.getStart ^js jsx-text source-file))
  (^js [jsx-text source-file include-js-doc-comment?]
   (.getStart ^js jsx-text source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [jsx-text]
  (.getFullStart ^js jsx-text))

(defn get-end
  "**Returns:** `number`"
  ^js [jsx-text]
  (.getEnd ^js jsx-text))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [jsx-text]
   (.getWidth ^js jsx-text))
  (^js [jsx-text source-file]
   (.getWidth ^js jsx-text source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [jsx-text]
  (.getFullWidth ^js jsx-text))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [jsx-text]
   (.getLeadingTriviaWidth ^js jsx-text))
  (^js [jsx-text source-file]
   (.getLeadingTriviaWidth ^js jsx-text source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [jsx-text]
   (.getFullText ^js jsx-text))
  (^js [jsx-text source-file]
   (.getFullText ^js jsx-text source-file)))

(defn get-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [jsx-text]
   (.getText ^js jsx-text))
  (^js [jsx-text source-file]
   (.getText ^js jsx-text source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [jsx-text]
   (.getFirstToken ^js jsx-text))
  (^js [jsx-text source-file]
   (.getFirstToken ^js jsx-text source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [jsx-text]
   (.getLastToken ^js jsx-text))
  (^js [jsx-text source-file]
   (.getLastToken ^js jsx-text source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [jsx-text cb-node]
   (.forEachChild ^js jsx-text cb-node))
  (^js [jsx-text cb-node cb-node-array]
   (.forEachChild ^js jsx-text cb-node cb-node-array)))

(defn pos
  "**Returns:** `number`"
  ^js [jsx-text]
  (.-pos ^js jsx-text))

(defn end
  "**Returns:** `number`"
  ^js [jsx-text]
  (.-end ^js jsx-text))
