(ns dots.typescript.js-doc-protected-tag
  (:refer-clojure :exclude [comment]))

(defn kind
  "**Returns:** `SyntaxKind.JSDocProtectedTag`"
  ^js [js-doc-protected-tag]
  (.-kind ^js js-doc-protected-tag))

(defn parent
  "**Returns:** `JSDoc | JSDocTypeLiteral`"
  ^js [js-doc-protected-tag]
  (.-parent ^js js-doc-protected-tag))

(defn tag-name
  "**Returns:** `Identifier`"
  ^js [js-doc-protected-tag]
  (.-tagName ^js js-doc-protected-tag))

(defn comment
  "**Returns:** `string | NodeArray<JSDocComment> | undefined`"
  ^js [js-doc-protected-tag]
  (.-comment ^js js-doc-protected-tag))

(defn flags
  "**Returns:** `NodeFlags`"
  ^js [js-doc-protected-tag]
  (.-flags ^js js-doc-protected-tag))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [js-doc-protected-tag]
  (.getSourceFile ^js js-doc-protected-tag))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [js-doc-protected-tag]
   (.getChildCount ^js js-doc-protected-tag))
  (^js [js-doc-protected-tag source-file]
   (.getChildCount ^js js-doc-protected-tag source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [js-doc-protected-tag index]
   (.getChildAt ^js js-doc-protected-tag index))
  (^js [js-doc-protected-tag index source-file]
   (.getChildAt ^js js-doc-protected-tag index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [js-doc-protected-tag]
   (.getChildren ^js js-doc-protected-tag))
  (^js [js-doc-protected-tag source-file]
   (.getChildren ^js js-doc-protected-tag source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [js-doc-protected-tag]
   (.getStart ^js js-doc-protected-tag))
  (^js [js-doc-protected-tag source-file]
   (.getStart ^js js-doc-protected-tag source-file))
  (^js [js-doc-protected-tag source-file include-js-doc-comment?]
   (.getStart ^js js-doc-protected-tag source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [js-doc-protected-tag]
  (.getFullStart ^js js-doc-protected-tag))

(defn get-end
  "**Returns:** `number`"
  ^js [js-doc-protected-tag]
  (.getEnd ^js js-doc-protected-tag))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [js-doc-protected-tag]
   (.getWidth ^js js-doc-protected-tag))
  (^js [js-doc-protected-tag source-file]
   (.getWidth ^js js-doc-protected-tag source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [js-doc-protected-tag]
  (.getFullWidth ^js js-doc-protected-tag))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [js-doc-protected-tag]
   (.getLeadingTriviaWidth ^js js-doc-protected-tag))
  (^js [js-doc-protected-tag source-file]
   (.getLeadingTriviaWidth ^js js-doc-protected-tag source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [js-doc-protected-tag]
   (.getFullText ^js js-doc-protected-tag))
  (^js [js-doc-protected-tag source-file]
   (.getFullText ^js js-doc-protected-tag source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [js-doc-protected-tag]
   (.getText ^js js-doc-protected-tag))
  (^js [js-doc-protected-tag source-file]
   (.getText ^js js-doc-protected-tag source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [js-doc-protected-tag]
   (.getFirstToken ^js js-doc-protected-tag))
  (^js [js-doc-protected-tag source-file]
   (.getFirstToken ^js js-doc-protected-tag source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [js-doc-protected-tag]
   (.getLastToken ^js js-doc-protected-tag))
  (^js [js-doc-protected-tag source-file]
   (.getLastToken ^js js-doc-protected-tag source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [js-doc-protected-tag cb-node]
   (.forEachChild ^js js-doc-protected-tag cb-node))
  (^js [js-doc-protected-tag cb-node cb-node-array]
   (.forEachChild ^js js-doc-protected-tag cb-node cb-node-array)))

(defn pos
  "**Returns:** `number`"
  ^js [js-doc-protected-tag]
  (.-pos ^js js-doc-protected-tag))

(defn end
  "**Returns:** `number`"
  ^js [js-doc-protected-tag]
  (.-end ^js js-doc-protected-tag))
