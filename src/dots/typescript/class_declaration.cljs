(ns dots.typescript.class-declaration
  (:refer-clojure :exclude [name]))

(defn kind
  ^js [class-declaration]
  (.-kind ^js class-declaration))

(defn modifiers
  ^js [class-declaration]
  (.-modifiers ^js class-declaration))

(defn name
  "May be undefined in `export default class { ... }`."
  ^js [class-declaration]
  (.-name ^js class-declaration))

(defn type-parameters
  ^js [class-declaration]
  (.-typeParameters ^js class-declaration))

(defn heritage-clauses
  ^js [class-declaration]
  (.-heritageClauses ^js class-declaration))

(defn members
  ^js [class-declaration]
  (.-members ^js class-declaration))

(defn flags
  ^js [class-declaration]
  (.-flags ^js class-declaration))

(defn parent
  ^js [class-declaration]
  (.-parent ^js class-declaration))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [class-declaration]
  (.getSourceFile ^js class-declaration))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [class-declaration]
   (.getChildCount ^js class-declaration))
  (^js [class-declaration source-file]
   (.getChildCount ^js class-declaration source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [class-declaration index]
   (.getChildAt ^js class-declaration index))
  (^js [class-declaration index source-file]
   (.getChildAt ^js class-declaration index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [class-declaration]
   (.getChildren ^js class-declaration))
  (^js [class-declaration source-file]
   (.getChildren ^js class-declaration source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [class-declaration]
   (.getStart ^js class-declaration))
  (^js [class-declaration source-file]
   (.getStart ^js class-declaration source-file))
  (^js [class-declaration source-file include-js-doc-comment?]
   (.getStart ^js class-declaration source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [class-declaration]
  (.getFullStart ^js class-declaration))

(defn get-end
  "**Returns:** `number`"
  ^js [class-declaration]
  (.getEnd ^js class-declaration))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [class-declaration]
   (.getWidth ^js class-declaration))
  (^js [class-declaration source-file]
   (.getWidth ^js class-declaration source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [class-declaration]
  (.getFullWidth ^js class-declaration))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [class-declaration]
   (.getLeadingTriviaWidth ^js class-declaration))
  (^js [class-declaration source-file]
   (.getLeadingTriviaWidth ^js class-declaration source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [class-declaration]
   (.getFullText ^js class-declaration))
  (^js [class-declaration source-file]
   (.getFullText ^js class-declaration source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [class-declaration]
   (.getText ^js class-declaration))
  (^js [class-declaration source-file]
   (.getText ^js class-declaration source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [class-declaration]
   (.getFirstToken ^js class-declaration))
  (^js [class-declaration source-file]
   (.getFirstToken ^js class-declaration source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [class-declaration]
   (.getLastToken ^js class-declaration))
  (^js [class-declaration source-file]
   (.getLastToken ^js class-declaration source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [class-declaration cb-node]
   (.forEachChild ^js class-declaration cb-node))
  (^js [class-declaration cb-node cb-node-array]
   (.forEachChild ^js class-declaration cb-node cb-node-array)))

(defn pos
  ^js [class-declaration]
  (.-pos ^js class-declaration))

(defn end
  ^js [class-declaration]
  (.-end ^js class-declaration))
