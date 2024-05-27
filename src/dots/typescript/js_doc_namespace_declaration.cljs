(ns dots.typescript.js-doc-namespace-declaration
  (:refer-clojure :exclude [name]))

(defn name
  "**Returns:** `Identifier`"
  ^js [js-doc-namespace-declaration]
  (.-name ^js js-doc-namespace-declaration))

(defn body
  "**Returns:** `JSDocNamespaceBody | undefined`"
  ^js [js-doc-namespace-declaration]
  (.-body ^js js-doc-namespace-declaration))

(defn kind
  "**Returns:** `SyntaxKind.ModuleDeclaration`"
  ^js [js-doc-namespace-declaration]
  (.-kind ^js js-doc-namespace-declaration))

(defn parent
  "**Returns:** `SourceFile | ModuleBody`"
  ^js [js-doc-namespace-declaration]
  (.-parent ^js js-doc-namespace-declaration))

(defn modifiers
  "**Returns:** `NodeArray<ModifierLike> | undefined`"
  ^js [js-doc-namespace-declaration]
  (.-modifiers ^js js-doc-namespace-declaration))

(defn flags
  "**Returns:** `NodeFlags`"
  ^js [js-doc-namespace-declaration]
  (.-flags ^js js-doc-namespace-declaration))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [js-doc-namespace-declaration]
  (.getSourceFile ^js js-doc-namespace-declaration))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [js-doc-namespace-declaration]
   (.getChildCount ^js js-doc-namespace-declaration))
  (^js [js-doc-namespace-declaration source-file]
   (.getChildCount ^js js-doc-namespace-declaration source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [js-doc-namespace-declaration index]
   (.getChildAt ^js js-doc-namespace-declaration index))
  (^js [js-doc-namespace-declaration index source-file]
   (.getChildAt ^js js-doc-namespace-declaration index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [js-doc-namespace-declaration]
   (.getChildren ^js js-doc-namespace-declaration))
  (^js [js-doc-namespace-declaration source-file]
   (.getChildren ^js js-doc-namespace-declaration source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [js-doc-namespace-declaration]
   (.getStart ^js js-doc-namespace-declaration))
  (^js [js-doc-namespace-declaration source-file]
   (.getStart ^js js-doc-namespace-declaration source-file))
  (^js [js-doc-namespace-declaration source-file include-js-doc-comment?]
   (.getStart ^js js-doc-namespace-declaration source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [js-doc-namespace-declaration]
  (.getFullStart ^js js-doc-namespace-declaration))

(defn get-end
  "**Returns:** `number`"
  ^js [js-doc-namespace-declaration]
  (.getEnd ^js js-doc-namespace-declaration))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [js-doc-namespace-declaration]
   (.getWidth ^js js-doc-namespace-declaration))
  (^js [js-doc-namespace-declaration source-file]
   (.getWidth ^js js-doc-namespace-declaration source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [js-doc-namespace-declaration]
  (.getFullWidth ^js js-doc-namespace-declaration))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [js-doc-namespace-declaration]
   (.getLeadingTriviaWidth ^js js-doc-namespace-declaration))
  (^js [js-doc-namespace-declaration source-file]
   (.getLeadingTriviaWidth ^js js-doc-namespace-declaration source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [js-doc-namespace-declaration]
   (.getFullText ^js js-doc-namespace-declaration))
  (^js [js-doc-namespace-declaration source-file]
   (.getFullText ^js js-doc-namespace-declaration source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [js-doc-namespace-declaration]
   (.getText ^js js-doc-namespace-declaration))
  (^js [js-doc-namespace-declaration source-file]
   (.getText ^js js-doc-namespace-declaration source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [js-doc-namespace-declaration]
   (.getFirstToken ^js js-doc-namespace-declaration))
  (^js [js-doc-namespace-declaration source-file]
   (.getFirstToken ^js js-doc-namespace-declaration source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [js-doc-namespace-declaration]
   (.getLastToken ^js js-doc-namespace-declaration))
  (^js [js-doc-namespace-declaration source-file]
   (.getLastToken ^js js-doc-namespace-declaration source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [js-doc-namespace-declaration cb-node]
   (.forEachChild ^js js-doc-namespace-declaration cb-node))
  (^js [js-doc-namespace-declaration cb-node cb-node-array]
   (.forEachChild ^js js-doc-namespace-declaration cb-node cb-node-array)))

(defn pos
  "**Returns:** `number`"
  ^js [js-doc-namespace-declaration]
  (.-pos ^js js-doc-namespace-declaration))

(defn end
  "**Returns:** `number`"
  ^js [js-doc-namespace-declaration]
  (.-end ^js js-doc-namespace-declaration))
