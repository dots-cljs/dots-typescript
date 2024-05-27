(ns dots.typescript.namespace-declaration
  (:refer-clojure :exclude [name]))

(defn name
  "**Returns:** `Identifier`"
  ^js [namespace-declaration]
  (.-name ^js namespace-declaration))

(defn body
  "**Returns:** `NamespaceBody`"
  ^js [namespace-declaration]
  (.-body ^js namespace-declaration))

(defn kind
  "**Returns:** `SyntaxKind.ModuleDeclaration`"
  ^js [namespace-declaration]
  (.-kind ^js namespace-declaration))

(defn parent
  "**Returns:** `SourceFile | ModuleBody`"
  ^js [namespace-declaration]
  (.-parent ^js namespace-declaration))

(defn modifiers
  "**Returns:** `NodeArray<ModifierLike> | undefined`"
  ^js [namespace-declaration]
  (.-modifiers ^js namespace-declaration))

(defn flags
  "**Returns:** `NodeFlags`"
  ^js [namespace-declaration]
  (.-flags ^js namespace-declaration))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [namespace-declaration]
  (.getSourceFile ^js namespace-declaration))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [namespace-declaration]
   (.getChildCount ^js namespace-declaration))
  (^js [namespace-declaration source-file]
   (.getChildCount ^js namespace-declaration source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [namespace-declaration index]
   (.getChildAt ^js namespace-declaration index))
  (^js [namespace-declaration index source-file]
   (.getChildAt ^js namespace-declaration index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [namespace-declaration]
   (.getChildren ^js namespace-declaration))
  (^js [namespace-declaration source-file]
   (.getChildren ^js namespace-declaration source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [namespace-declaration]
   (.getStart ^js namespace-declaration))
  (^js [namespace-declaration source-file]
   (.getStart ^js namespace-declaration source-file))
  (^js [namespace-declaration source-file include-js-doc-comment?]
   (.getStart ^js namespace-declaration source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [namespace-declaration]
  (.getFullStart ^js namespace-declaration))

(defn get-end
  "**Returns:** `number`"
  ^js [namespace-declaration]
  (.getEnd ^js namespace-declaration))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [namespace-declaration]
   (.getWidth ^js namespace-declaration))
  (^js [namespace-declaration source-file]
   (.getWidth ^js namespace-declaration source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [namespace-declaration]
  (.getFullWidth ^js namespace-declaration))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [namespace-declaration]
   (.getLeadingTriviaWidth ^js namespace-declaration))
  (^js [namespace-declaration source-file]
   (.getLeadingTriviaWidth ^js namespace-declaration source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [namespace-declaration]
   (.getFullText ^js namespace-declaration))
  (^js [namespace-declaration source-file]
   (.getFullText ^js namespace-declaration source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [namespace-declaration]
   (.getText ^js namespace-declaration))
  (^js [namespace-declaration source-file]
   (.getText ^js namespace-declaration source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [namespace-declaration]
   (.getFirstToken ^js namespace-declaration))
  (^js [namespace-declaration source-file]
   (.getFirstToken ^js namespace-declaration source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [namespace-declaration]
   (.getLastToken ^js namespace-declaration))
  (^js [namespace-declaration source-file]
   (.getLastToken ^js namespace-declaration source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [namespace-declaration cb-node]
   (.forEachChild ^js namespace-declaration cb-node))
  (^js [namespace-declaration cb-node cb-node-array]
   (.forEachChild ^js namespace-declaration cb-node cb-node-array)))

(defn pos
  "**Returns:** `number`"
  ^js [namespace-declaration]
  (.-pos ^js namespace-declaration))

(defn end
  "**Returns:** `number`"
  ^js [namespace-declaration]
  (.-end ^js namespace-declaration))
