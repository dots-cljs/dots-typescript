(ns dots.typescript.private-identifier)

(defn kind
  ^js [private-identifier]
  (.-kind ^js private-identifier))

(defn escaped-text
  ^js [private-identifier]
  (.-escapedText ^js private-identifier))

(defn text
  ^js [private-identifier]
  (.-text ^js private-identifier))

(defn flags
  ^js [private-identifier]
  (.-flags ^js private-identifier))

(defn parent
  ^js [private-identifier]
  (.-parent ^js private-identifier))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [private-identifier]
  (.getSourceFile ^js private-identifier))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [private-identifier]
   (.getChildCount ^js private-identifier))
  (^js [private-identifier source-file]
   (.getChildCount ^js private-identifier source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [private-identifier index]
   (.getChildAt ^js private-identifier index))
  (^js [private-identifier index source-file]
   (.getChildAt ^js private-identifier index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [private-identifier]
   (.getChildren ^js private-identifier))
  (^js [private-identifier source-file]
   (.getChildren ^js private-identifier source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [private-identifier]
   (.getStart ^js private-identifier))
  (^js [private-identifier source-file]
   (.getStart ^js private-identifier source-file))
  (^js [private-identifier source-file include-js-doc-comment?]
   (.getStart ^js private-identifier source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [private-identifier]
  (.getFullStart ^js private-identifier))

(defn get-end
  "**Returns:** `number`"
  ^js [private-identifier]
  (.getEnd ^js private-identifier))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [private-identifier]
   (.getWidth ^js private-identifier))
  (^js [private-identifier source-file]
   (.getWidth ^js private-identifier source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [private-identifier]
  (.getFullWidth ^js private-identifier))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [private-identifier]
   (.getLeadingTriviaWidth ^js private-identifier))
  (^js [private-identifier source-file]
   (.getLeadingTriviaWidth ^js private-identifier source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [private-identifier]
   (.getFullText ^js private-identifier))
  (^js [private-identifier source-file]
   (.getFullText ^js private-identifier source-file)))

(defn get-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [private-identifier]
   (.getText ^js private-identifier))
  (^js [private-identifier source-file]
   (.getText ^js private-identifier source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [private-identifier]
   (.getFirstToken ^js private-identifier))
  (^js [private-identifier source-file]
   (.getFirstToken ^js private-identifier source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [private-identifier]
   (.getLastToken ^js private-identifier))
  (^js [private-identifier source-file]
   (.getLastToken ^js private-identifier source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [private-identifier cb-node]
   (.forEachChild ^js private-identifier cb-node))
  (^js [private-identifier cb-node cb-node-array]
   (.forEachChild ^js private-identifier cb-node cb-node-array)))

(defn pos
  ^js [private-identifier]
  (.-pos ^js private-identifier))

(defn end
  ^js [private-identifier]
  (.-end ^js private-identifier))
