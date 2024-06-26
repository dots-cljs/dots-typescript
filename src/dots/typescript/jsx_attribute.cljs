(ns dots.typescript.jsx-attribute
  (:refer-clojure :exclude [name]))

(defn kind
  "**Returns:** `SyntaxKind.JsxAttribute`"
  ^js [jsx-attribute]
  (.-kind ^js jsx-attribute))

(defn parent
  "**Returns:** `JsxAttributes`"
  ^js [jsx-attribute]
  (.-parent ^js jsx-attribute))

(defn name
  "**Returns:** `JsxAttributeName`"
  ^js [jsx-attribute]
  (.-name ^js jsx-attribute))

(defn initializer
  "**Returns:** `JsxAttributeValue | undefined`"
  ^js [jsx-attribute]
  (.-initializer ^js jsx-attribute))

(defn flags
  "**Returns:** `NodeFlags`"
  ^js [jsx-attribute]
  (.-flags ^js jsx-attribute))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [jsx-attribute]
  (.getSourceFile ^js jsx-attribute))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [jsx-attribute]
   (.getChildCount ^js jsx-attribute))
  (^js [jsx-attribute source-file]
   (.getChildCount ^js jsx-attribute source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [jsx-attribute index]
   (.getChildAt ^js jsx-attribute index))
  (^js [jsx-attribute index source-file]
   (.getChildAt ^js jsx-attribute index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [jsx-attribute]
   (.getChildren ^js jsx-attribute))
  (^js [jsx-attribute source-file]
   (.getChildren ^js jsx-attribute source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [jsx-attribute]
   (.getStart ^js jsx-attribute))
  (^js [jsx-attribute source-file]
   (.getStart ^js jsx-attribute source-file))
  (^js [jsx-attribute source-file include-js-doc-comment?]
   (.getStart ^js jsx-attribute source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [jsx-attribute]
  (.getFullStart ^js jsx-attribute))

(defn get-end
  "**Returns:** `number`"
  ^js [jsx-attribute]
  (.getEnd ^js jsx-attribute))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [jsx-attribute]
   (.getWidth ^js jsx-attribute))
  (^js [jsx-attribute source-file]
   (.getWidth ^js jsx-attribute source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [jsx-attribute]
  (.getFullWidth ^js jsx-attribute))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [jsx-attribute]
   (.getLeadingTriviaWidth ^js jsx-attribute))
  (^js [jsx-attribute source-file]
   (.getLeadingTriviaWidth ^js jsx-attribute source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [jsx-attribute]
   (.getFullText ^js jsx-attribute))
  (^js [jsx-attribute source-file]
   (.getFullText ^js jsx-attribute source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [jsx-attribute]
   (.getText ^js jsx-attribute))
  (^js [jsx-attribute source-file]
   (.getText ^js jsx-attribute source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [jsx-attribute]
   (.getFirstToken ^js jsx-attribute))
  (^js [jsx-attribute source-file]
   (.getFirstToken ^js jsx-attribute source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [jsx-attribute]
   (.getLastToken ^js jsx-attribute))
  (^js [jsx-attribute source-file]
   (.getLastToken ^js jsx-attribute source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [jsx-attribute cb-node]
   (.forEachChild ^js jsx-attribute cb-node))
  (^js [jsx-attribute cb-node cb-node-array]
   (.forEachChild ^js jsx-attribute cb-node cb-node-array)))

(defn pos
  "**Returns:** `number`"
  ^js [jsx-attribute]
  (.-pos ^js jsx-attribute))

(defn end
  "**Returns:** `number`"
  ^js [jsx-attribute]
  (.-end ^js jsx-attribute))
