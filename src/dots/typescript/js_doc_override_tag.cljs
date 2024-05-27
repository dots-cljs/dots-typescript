(ns dots.typescript.js-doc-override-tag
  (:refer-clojure :exclude [comment]))

(defn kind
  "**Returns:** `SyntaxKind.JSDocOverrideTag`"
  ^js [js-doc-override-tag]
  (.-kind ^js js-doc-override-tag))

(defn parent
  "**Returns:** `JSDoc | JSDocTypeLiteral`"
  ^js [js-doc-override-tag]
  (.-parent ^js js-doc-override-tag))

(defn tag-name
  "**Returns:** `Identifier`"
  ^js [js-doc-override-tag]
  (.-tagName ^js js-doc-override-tag))

(defn comment
  "**Returns:** `string | NodeArray<JSDocComment> | undefined`"
  ^js [js-doc-override-tag]
  (.-comment ^js js-doc-override-tag))

(defn flags
  "**Returns:** `NodeFlags`"
  ^js [js-doc-override-tag]
  (.-flags ^js js-doc-override-tag))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [js-doc-override-tag]
  (.getSourceFile ^js js-doc-override-tag))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [js-doc-override-tag]
   (.getChildCount ^js js-doc-override-tag))
  (^js [js-doc-override-tag source-file]
   (.getChildCount ^js js-doc-override-tag source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [js-doc-override-tag index]
   (.getChildAt ^js js-doc-override-tag index))
  (^js [js-doc-override-tag index source-file]
   (.getChildAt ^js js-doc-override-tag index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [js-doc-override-tag]
   (.getChildren ^js js-doc-override-tag))
  (^js [js-doc-override-tag source-file]
   (.getChildren ^js js-doc-override-tag source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [js-doc-override-tag]
   (.getStart ^js js-doc-override-tag))
  (^js [js-doc-override-tag source-file]
   (.getStart ^js js-doc-override-tag source-file))
  (^js [js-doc-override-tag source-file include-js-doc-comment?]
   (.getStart ^js js-doc-override-tag source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [js-doc-override-tag]
  (.getFullStart ^js js-doc-override-tag))

(defn get-end
  "**Returns:** `number`"
  ^js [js-doc-override-tag]
  (.getEnd ^js js-doc-override-tag))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [js-doc-override-tag]
   (.getWidth ^js js-doc-override-tag))
  (^js [js-doc-override-tag source-file]
   (.getWidth ^js js-doc-override-tag source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [js-doc-override-tag]
  (.getFullWidth ^js js-doc-override-tag))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [js-doc-override-tag]
   (.getLeadingTriviaWidth ^js js-doc-override-tag))
  (^js [js-doc-override-tag source-file]
   (.getLeadingTriviaWidth ^js js-doc-override-tag source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [js-doc-override-tag]
   (.getFullText ^js js-doc-override-tag))
  (^js [js-doc-override-tag source-file]
   (.getFullText ^js js-doc-override-tag source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [js-doc-override-tag]
   (.getText ^js js-doc-override-tag))
  (^js [js-doc-override-tag source-file]
   (.getText ^js js-doc-override-tag source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [js-doc-override-tag]
   (.getFirstToken ^js js-doc-override-tag))
  (^js [js-doc-override-tag source-file]
   (.getFirstToken ^js js-doc-override-tag source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [js-doc-override-tag]
   (.getLastToken ^js js-doc-override-tag))
  (^js [js-doc-override-tag source-file]
   (.getLastToken ^js js-doc-override-tag source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [js-doc-override-tag cb-node]
   (.forEachChild ^js js-doc-override-tag cb-node))
  (^js [js-doc-override-tag cb-node cb-node-array]
   (.forEachChild ^js js-doc-override-tag cb-node cb-node-array)))

(defn pos
  "**Returns:** `number`"
  ^js [js-doc-override-tag]
  (.-pos ^js js-doc-override-tag))

(defn end
  "**Returns:** `number`"
  ^js [js-doc-override-tag]
  (.-end ^js js-doc-override-tag))
