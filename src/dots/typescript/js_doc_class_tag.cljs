(ns dots.typescript.js-doc-class-tag
  (:refer-clojure :exclude [comment]))

(defn kind
  "**Returns:** `SyntaxKind.JSDocClassTag`"
  ^js [js-doc-class-tag]
  (.-kind ^js js-doc-class-tag))

(defn parent
  "**Returns:** `JSDoc | JSDocTypeLiteral`"
  ^js [js-doc-class-tag]
  (.-parent ^js js-doc-class-tag))

(defn tag-name
  "**Returns:** `Identifier`"
  ^js [js-doc-class-tag]
  (.-tagName ^js js-doc-class-tag))

(defn comment
  "**Returns:** `string | NodeArray<JSDocComment> | undefined`"
  ^js [js-doc-class-tag]
  (.-comment ^js js-doc-class-tag))

(defn flags
  "**Returns:** `NodeFlags`"
  ^js [js-doc-class-tag]
  (.-flags ^js js-doc-class-tag))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [js-doc-class-tag]
  (.getSourceFile ^js js-doc-class-tag))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [js-doc-class-tag]
   (.getChildCount ^js js-doc-class-tag))
  (^js [js-doc-class-tag source-file]
   (.getChildCount ^js js-doc-class-tag source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [js-doc-class-tag index]
   (.getChildAt ^js js-doc-class-tag index))
  (^js [js-doc-class-tag index source-file]
   (.getChildAt ^js js-doc-class-tag index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [js-doc-class-tag]
   (.getChildren ^js js-doc-class-tag))
  (^js [js-doc-class-tag source-file]
   (.getChildren ^js js-doc-class-tag source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [js-doc-class-tag]
   (.getStart ^js js-doc-class-tag))
  (^js [js-doc-class-tag source-file]
   (.getStart ^js js-doc-class-tag source-file))
  (^js [js-doc-class-tag source-file include-js-doc-comment?]
   (.getStart ^js js-doc-class-tag source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [js-doc-class-tag]
  (.getFullStart ^js js-doc-class-tag))

(defn get-end
  "**Returns:** `number`"
  ^js [js-doc-class-tag]
  (.getEnd ^js js-doc-class-tag))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [js-doc-class-tag]
   (.getWidth ^js js-doc-class-tag))
  (^js [js-doc-class-tag source-file]
   (.getWidth ^js js-doc-class-tag source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [js-doc-class-tag]
  (.getFullWidth ^js js-doc-class-tag))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [js-doc-class-tag]
   (.getLeadingTriviaWidth ^js js-doc-class-tag))
  (^js [js-doc-class-tag source-file]
   (.getLeadingTriviaWidth ^js js-doc-class-tag source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [js-doc-class-tag]
   (.getFullText ^js js-doc-class-tag))
  (^js [js-doc-class-tag source-file]
   (.getFullText ^js js-doc-class-tag source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [js-doc-class-tag]
   (.getText ^js js-doc-class-tag))
  (^js [js-doc-class-tag source-file]
   (.getText ^js js-doc-class-tag source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [js-doc-class-tag]
   (.getFirstToken ^js js-doc-class-tag))
  (^js [js-doc-class-tag source-file]
   (.getFirstToken ^js js-doc-class-tag source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [js-doc-class-tag]
   (.getLastToken ^js js-doc-class-tag))
  (^js [js-doc-class-tag source-file]
   (.getLastToken ^js js-doc-class-tag source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [js-doc-class-tag cb-node]
   (.forEachChild ^js js-doc-class-tag cb-node))
  (^js [js-doc-class-tag cb-node cb-node-array]
   (.forEachChild ^js js-doc-class-tag cb-node cb-node-array)))

(defn pos
  "**Returns:** `number`"
  ^js [js-doc-class-tag]
  (.-pos ^js js-doc-class-tag))

(defn end
  "**Returns:** `number`"
  ^js [js-doc-class-tag]
  (.-end ^js js-doc-class-tag))
