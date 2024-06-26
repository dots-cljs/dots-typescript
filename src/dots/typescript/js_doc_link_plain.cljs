(ns dots.typescript.js-doc-link-plain
  (:refer-clojure :exclude [name]))

(defn kind
  "**Returns:** `SyntaxKind.JSDocLinkPlain`"
  ^js [js-doc-link-plain]
  (.-kind ^js js-doc-link-plain))

(defn name
  "**Returns:** `EntityName | JSDocMemberName | undefined`"
  ^js [js-doc-link-plain]
  (.-name ^js js-doc-link-plain))

(defn text
  "**Returns:** `string`"
  ^js [js-doc-link-plain]
  (.-text ^js js-doc-link-plain))

(defn set-text!
  ^js [js-doc-link-plain value]
  (set! (.-text ^js js-doc-link-plain) value))

(defn flags
  "**Returns:** `NodeFlags`"
  ^js [js-doc-link-plain]
  (.-flags ^js js-doc-link-plain))

(defn parent
  "**Returns:** `Node`"
  ^js [js-doc-link-plain]
  (.-parent ^js js-doc-link-plain))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [js-doc-link-plain]
  (.getSourceFile ^js js-doc-link-plain))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [js-doc-link-plain]
   (.getChildCount ^js js-doc-link-plain))
  (^js [js-doc-link-plain source-file]
   (.getChildCount ^js js-doc-link-plain source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [js-doc-link-plain index]
   (.getChildAt ^js js-doc-link-plain index))
  (^js [js-doc-link-plain index source-file]
   (.getChildAt ^js js-doc-link-plain index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [js-doc-link-plain]
   (.getChildren ^js js-doc-link-plain))
  (^js [js-doc-link-plain source-file]
   (.getChildren ^js js-doc-link-plain source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [js-doc-link-plain]
   (.getStart ^js js-doc-link-plain))
  (^js [js-doc-link-plain source-file]
   (.getStart ^js js-doc-link-plain source-file))
  (^js [js-doc-link-plain source-file include-js-doc-comment?]
   (.getStart ^js js-doc-link-plain source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [js-doc-link-plain]
  (.getFullStart ^js js-doc-link-plain))

(defn get-end
  "**Returns:** `number`"
  ^js [js-doc-link-plain]
  (.getEnd ^js js-doc-link-plain))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [js-doc-link-plain]
   (.getWidth ^js js-doc-link-plain))
  (^js [js-doc-link-plain source-file]
   (.getWidth ^js js-doc-link-plain source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [js-doc-link-plain]
  (.getFullWidth ^js js-doc-link-plain))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [js-doc-link-plain]
   (.getLeadingTriviaWidth ^js js-doc-link-plain))
  (^js [js-doc-link-plain source-file]
   (.getLeadingTriviaWidth ^js js-doc-link-plain source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [js-doc-link-plain]
   (.getFullText ^js js-doc-link-plain))
  (^js [js-doc-link-plain source-file]
   (.getFullText ^js js-doc-link-plain source-file)))

(defn get-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [js-doc-link-plain]
   (.getText ^js js-doc-link-plain))
  (^js [js-doc-link-plain source-file]
   (.getText ^js js-doc-link-plain source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [js-doc-link-plain]
   (.getFirstToken ^js js-doc-link-plain))
  (^js [js-doc-link-plain source-file]
   (.getFirstToken ^js js-doc-link-plain source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [js-doc-link-plain]
   (.getLastToken ^js js-doc-link-plain))
  (^js [js-doc-link-plain source-file]
   (.getLastToken ^js js-doc-link-plain source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [js-doc-link-plain cb-node]
   (.forEachChild ^js js-doc-link-plain cb-node))
  (^js [js-doc-link-plain cb-node cb-node-array]
   (.forEachChild ^js js-doc-link-plain cb-node cb-node-array)))

(defn pos
  "**Returns:** `number`"
  ^js [js-doc-link-plain]
  (.-pos ^js js-doc-link-plain))

(defn end
  "**Returns:** `number`"
  ^js [js-doc-link-plain]
  (.-end ^js js-doc-link-plain))
