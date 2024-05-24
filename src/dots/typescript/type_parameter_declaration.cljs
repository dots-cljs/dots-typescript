(ns dots.typescript.type-parameter-declaration
  (:refer-clojure :exclude [name]))

(defn kind
  ^js [type-parameter-declaration]
  (.-kind ^js type-parameter-declaration))

(defn parent
  ^js [type-parameter-declaration]
  (.-parent ^js type-parameter-declaration))

(defn modifiers
  ^js [type-parameter-declaration]
  (.-modifiers ^js type-parameter-declaration))

(defn name
  ^js [type-parameter-declaration]
  (.-name ^js type-parameter-declaration))

(defn constraint
  "Note: Consider calling `getEffectiveConstraintOfTypeParameter`"
  ^js [type-parameter-declaration]
  (.-constraint ^js type-parameter-declaration))

(defn default
  ^js [type-parameter-declaration]
  (.-default ^js type-parameter-declaration))

(defn expression
  ^js [type-parameter-declaration]
  (.-expression ^js type-parameter-declaration))

(defn set-expression!
  ^js [type-parameter-declaration value]
  (set! (.-expression ^js type-parameter-declaration) value))

(defn flags
  ^js [type-parameter-declaration]
  (.-flags ^js type-parameter-declaration))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [type-parameter-declaration]
  (.getSourceFile ^js type-parameter-declaration))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [type-parameter-declaration]
   (.getChildCount ^js type-parameter-declaration))
  (^js [type-parameter-declaration source-file]
   (.getChildCount ^js type-parameter-declaration source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [type-parameter-declaration index]
   (.getChildAt ^js type-parameter-declaration index))
  (^js [type-parameter-declaration index source-file]
   (.getChildAt ^js type-parameter-declaration index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [type-parameter-declaration]
   (.getChildren ^js type-parameter-declaration))
  (^js [type-parameter-declaration source-file]
   (.getChildren ^js type-parameter-declaration source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [type-parameter-declaration]
   (.getStart ^js type-parameter-declaration))
  (^js [type-parameter-declaration source-file]
   (.getStart ^js type-parameter-declaration source-file))
  (^js [type-parameter-declaration source-file include-js-doc-comment?]
   (.getStart ^js type-parameter-declaration source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [type-parameter-declaration]
  (.getFullStart ^js type-parameter-declaration))

(defn get-end
  "**Returns:** `number`"
  ^js [type-parameter-declaration]
  (.getEnd ^js type-parameter-declaration))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [type-parameter-declaration]
   (.getWidth ^js type-parameter-declaration))
  (^js [type-parameter-declaration source-file]
   (.getWidth ^js type-parameter-declaration source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [type-parameter-declaration]
  (.getFullWidth ^js type-parameter-declaration))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [type-parameter-declaration]
   (.getLeadingTriviaWidth ^js type-parameter-declaration))
  (^js [type-parameter-declaration source-file]
   (.getLeadingTriviaWidth ^js type-parameter-declaration source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [type-parameter-declaration]
   (.getFullText ^js type-parameter-declaration))
  (^js [type-parameter-declaration source-file]
   (.getFullText ^js type-parameter-declaration source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [type-parameter-declaration]
   (.getText ^js type-parameter-declaration))
  (^js [type-parameter-declaration source-file]
   (.getText ^js type-parameter-declaration source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [type-parameter-declaration]
   (.getFirstToken ^js type-parameter-declaration))
  (^js [type-parameter-declaration source-file]
   (.getFirstToken ^js type-parameter-declaration source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [type-parameter-declaration]
   (.getLastToken ^js type-parameter-declaration))
  (^js [type-parameter-declaration source-file]
   (.getLastToken ^js type-parameter-declaration source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [type-parameter-declaration cb-node]
   (.forEachChild ^js type-parameter-declaration cb-node))
  (^js [type-parameter-declaration cb-node cb-node-array]
   (.forEachChild ^js type-parameter-declaration cb-node cb-node-array)))

(defn pos
  ^js [type-parameter-declaration]
  (.-pos ^js type-parameter-declaration))

(defn end
  ^js [type-parameter-declaration]
  (.-end ^js type-parameter-declaration))
