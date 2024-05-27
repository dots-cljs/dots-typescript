(ns dots.typescript.js-doc-link-code
  (:refer-clojure :exclude [name]))

(defn kind
  "**Returns:** `SyntaxKind.JSDocLinkCode`"
  ^js [js-doc-link-code]
  (.-kind ^js js-doc-link-code))

(defn name
  "**Returns:** `EntityName | JSDocMemberName | undefined`"
  ^js [js-doc-link-code]
  (.-name ^js js-doc-link-code))

(defn text
  "**Returns:** `string`"
  ^js [js-doc-link-code]
  (.-text ^js js-doc-link-code))

(defn set-text!
  ^js [js-doc-link-code value]
  (set! (.-text ^js js-doc-link-code) value))

(defn flags
  "**Returns:** `NodeFlags`"
  ^js [js-doc-link-code]
  (.-flags ^js js-doc-link-code))

(defn parent
  "**Returns:** `Node`"
  ^js [js-doc-link-code]
  (.-parent ^js js-doc-link-code))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [js-doc-link-code]
  (.getSourceFile ^js js-doc-link-code))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [js-doc-link-code]
   (.getChildCount ^js js-doc-link-code))
  (^js [js-doc-link-code source-file]
   (.getChildCount ^js js-doc-link-code source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [js-doc-link-code index]
   (.getChildAt ^js js-doc-link-code index))
  (^js [js-doc-link-code index source-file]
   (.getChildAt ^js js-doc-link-code index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [js-doc-link-code]
   (.getChildren ^js js-doc-link-code))
  (^js [js-doc-link-code source-file]
   (.getChildren ^js js-doc-link-code source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [js-doc-link-code]
   (.getStart ^js js-doc-link-code))
  (^js [js-doc-link-code source-file]
   (.getStart ^js js-doc-link-code source-file))
  (^js [js-doc-link-code source-file include-js-doc-comment?]
   (.getStart ^js js-doc-link-code source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [js-doc-link-code]
  (.getFullStart ^js js-doc-link-code))

(defn get-end
  "**Returns:** `number`"
  ^js [js-doc-link-code]
  (.getEnd ^js js-doc-link-code))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [js-doc-link-code]
   (.getWidth ^js js-doc-link-code))
  (^js [js-doc-link-code source-file]
   (.getWidth ^js js-doc-link-code source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [js-doc-link-code]
  (.getFullWidth ^js js-doc-link-code))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [js-doc-link-code]
   (.getLeadingTriviaWidth ^js js-doc-link-code))
  (^js [js-doc-link-code source-file]
   (.getLeadingTriviaWidth ^js js-doc-link-code source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [js-doc-link-code]
   (.getFullText ^js js-doc-link-code))
  (^js [js-doc-link-code source-file]
   (.getFullText ^js js-doc-link-code source-file)))

(defn get-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [js-doc-link-code]
   (.getText ^js js-doc-link-code))
  (^js [js-doc-link-code source-file]
   (.getText ^js js-doc-link-code source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [js-doc-link-code]
   (.getFirstToken ^js js-doc-link-code))
  (^js [js-doc-link-code source-file]
   (.getFirstToken ^js js-doc-link-code source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [js-doc-link-code]
   (.getLastToken ^js js-doc-link-code))
  (^js [js-doc-link-code source-file]
   (.getLastToken ^js js-doc-link-code source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [js-doc-link-code cb-node]
   (.forEachChild ^js js-doc-link-code cb-node))
  (^js [js-doc-link-code cb-node cb-node-array]
   (.forEachChild ^js js-doc-link-code cb-node cb-node-array)))

(defn pos
  "**Returns:** `number`"
  ^js [js-doc-link-code]
  (.-pos ^js js-doc-link-code))

(defn end
  "**Returns:** `number`"
  ^js [js-doc-link-code]
  (.-end ^js js-doc-link-code))
