(ns dots.typescript.function-like-declaration-base
  "Several node kinds share function-like features such as a signature,
   a name, and a body. These nodes should extend FunctionLikeDeclarationBase.
   Examples:
   - FunctionDeclaration
   - MethodDeclaration
   - AccessorDeclaration"
  (:refer-clojure :exclude [name type]))

(defn asterisk-token
  ^js [function-like-declaration-base]
  (.-asteriskToken ^js function-like-declaration-base))

(defn question-token
  ^js [function-like-declaration-base]
  (.-questionToken ^js function-like-declaration-base))

(defn exclamation-token
  ^js [function-like-declaration-base]
  (.-exclamationToken ^js function-like-declaration-base))

(defn body
  ^js [function-like-declaration-base]
  (.-body ^js function-like-declaration-base))

(defn kind
  ^js [function-like-declaration-base]
  (.-kind ^js function-like-declaration-base))

(defn name
  ^js [function-like-declaration-base]
  (.-name ^js function-like-declaration-base))

(defn type-parameters
  ^js [function-like-declaration-base]
  (.-typeParameters ^js function-like-declaration-base))

(defn parameters
  ^js [function-like-declaration-base]
  (.-parameters ^js function-like-declaration-base))

(defn type
  ^js [function-like-declaration-base]
  (.-type ^js function-like-declaration-base))

(defn flags
  ^js [function-like-declaration-base]
  (.-flags ^js function-like-declaration-base))

(defn parent
  ^js [function-like-declaration-base]
  (.-parent ^js function-like-declaration-base))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [function-like-declaration-base]
  (.getSourceFile ^js function-like-declaration-base))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [function-like-declaration-base]
   (.getChildCount ^js function-like-declaration-base))
  (^js [function-like-declaration-base source-file]
   (.getChildCount ^js function-like-declaration-base source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [function-like-declaration-base index]
   (.getChildAt ^js function-like-declaration-base index))
  (^js [function-like-declaration-base index source-file]
   (.getChildAt ^js function-like-declaration-base index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [function-like-declaration-base]
   (.getChildren ^js function-like-declaration-base))
  (^js [function-like-declaration-base source-file]
   (.getChildren ^js function-like-declaration-base source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [function-like-declaration-base]
   (.getStart ^js function-like-declaration-base))
  (^js [function-like-declaration-base source-file]
   (.getStart ^js function-like-declaration-base source-file))
  (^js [function-like-declaration-base source-file include-js-doc-comment?]
   (.getStart ^js function-like-declaration-base source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [function-like-declaration-base]
  (.getFullStart ^js function-like-declaration-base))

(defn get-end
  "**Returns:** `number`"
  ^js [function-like-declaration-base]
  (.getEnd ^js function-like-declaration-base))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [function-like-declaration-base]
   (.getWidth ^js function-like-declaration-base))
  (^js [function-like-declaration-base source-file]
   (.getWidth ^js function-like-declaration-base source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [function-like-declaration-base]
  (.getFullWidth ^js function-like-declaration-base))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [function-like-declaration-base]
   (.getLeadingTriviaWidth ^js function-like-declaration-base))
  (^js [function-like-declaration-base source-file]
   (.getLeadingTriviaWidth ^js function-like-declaration-base source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [function-like-declaration-base]
   (.getFullText ^js function-like-declaration-base))
  (^js [function-like-declaration-base source-file]
   (.getFullText ^js function-like-declaration-base source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [function-like-declaration-base]
   (.getText ^js function-like-declaration-base))
  (^js [function-like-declaration-base source-file]
   (.getText ^js function-like-declaration-base source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [function-like-declaration-base]
   (.getFirstToken ^js function-like-declaration-base))
  (^js [function-like-declaration-base source-file]
   (.getFirstToken ^js function-like-declaration-base source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [function-like-declaration-base]
   (.getLastToken ^js function-like-declaration-base))
  (^js [function-like-declaration-base source-file]
   (.getLastToken ^js function-like-declaration-base source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [function-like-declaration-base cb-node]
   (.forEachChild ^js function-like-declaration-base cb-node))
  (^js [function-like-declaration-base cb-node cb-node-array]
   (.forEachChild ^js function-like-declaration-base cb-node cb-node-array)))

(defn pos
  ^js [function-like-declaration-base]
  (.-pos ^js function-like-declaration-base))

(defn end
  ^js [function-like-declaration-base]
  (.-end ^js function-like-declaration-base))
