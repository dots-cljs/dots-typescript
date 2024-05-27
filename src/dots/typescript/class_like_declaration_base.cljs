(ns dots.typescript.class-like-declaration-base
  (:refer-clojure :exclude [name]))

(defn kind
  "**Returns:** `SyntaxKind.ClassExpression | SyntaxKind.ClassDeclaration`"
  ^js [class-like-declaration-base]
  (.-kind ^js class-like-declaration-base))

(defn name
  "**Returns:** `Identifier | undefined`"
  ^js [class-like-declaration-base]
  (.-name ^js class-like-declaration-base))

(defn type-parameters
  "**Returns:** `NodeArray<TypeParameterDeclaration> | undefined`"
  ^js [class-like-declaration-base]
  (.-typeParameters ^js class-like-declaration-base))

(defn heritage-clauses
  "**Returns:** `NodeArray<HeritageClause> | undefined`"
  ^js [class-like-declaration-base]
  (.-heritageClauses ^js class-like-declaration-base))

(defn members
  "**Returns:** `NodeArray<ClassElement>`"
  ^js [class-like-declaration-base]
  (.-members ^js class-like-declaration-base))

(defn flags
  "**Returns:** `NodeFlags`"
  ^js [class-like-declaration-base]
  (.-flags ^js class-like-declaration-base))

(defn parent
  "**Returns:** `Node`"
  ^js [class-like-declaration-base]
  (.-parent ^js class-like-declaration-base))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [class-like-declaration-base]
  (.getSourceFile ^js class-like-declaration-base))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [class-like-declaration-base]
   (.getChildCount ^js class-like-declaration-base))
  (^js [class-like-declaration-base source-file]
   (.getChildCount ^js class-like-declaration-base source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [class-like-declaration-base index]
   (.getChildAt ^js class-like-declaration-base index))
  (^js [class-like-declaration-base index source-file]
   (.getChildAt ^js class-like-declaration-base index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [class-like-declaration-base]
   (.getChildren ^js class-like-declaration-base))
  (^js [class-like-declaration-base source-file]
   (.getChildren ^js class-like-declaration-base source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [class-like-declaration-base]
   (.getStart ^js class-like-declaration-base))
  (^js [class-like-declaration-base source-file]
   (.getStart ^js class-like-declaration-base source-file))
  (^js [class-like-declaration-base source-file include-js-doc-comment?]
   (.getStart ^js class-like-declaration-base source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [class-like-declaration-base]
  (.getFullStart ^js class-like-declaration-base))

(defn get-end
  "**Returns:** `number`"
  ^js [class-like-declaration-base]
  (.getEnd ^js class-like-declaration-base))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [class-like-declaration-base]
   (.getWidth ^js class-like-declaration-base))
  (^js [class-like-declaration-base source-file]
   (.getWidth ^js class-like-declaration-base source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [class-like-declaration-base]
  (.getFullWidth ^js class-like-declaration-base))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [class-like-declaration-base]
   (.getLeadingTriviaWidth ^js class-like-declaration-base))
  (^js [class-like-declaration-base source-file]
   (.getLeadingTriviaWidth ^js class-like-declaration-base source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [class-like-declaration-base]
   (.getFullText ^js class-like-declaration-base))
  (^js [class-like-declaration-base source-file]
   (.getFullText ^js class-like-declaration-base source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [class-like-declaration-base]
   (.getText ^js class-like-declaration-base))
  (^js [class-like-declaration-base source-file]
   (.getText ^js class-like-declaration-base source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [class-like-declaration-base]
   (.getFirstToken ^js class-like-declaration-base))
  (^js [class-like-declaration-base source-file]
   (.getFirstToken ^js class-like-declaration-base source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [class-like-declaration-base]
   (.getLastToken ^js class-like-declaration-base))
  (^js [class-like-declaration-base source-file]
   (.getLastToken ^js class-like-declaration-base source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [class-like-declaration-base cb-node]
   (.forEachChild ^js class-like-declaration-base cb-node))
  (^js [class-like-declaration-base cb-node cb-node-array]
   (.forEachChild ^js class-like-declaration-base cb-node cb-node-array)))

(defn pos
  "**Returns:** `number`"
  ^js [class-like-declaration-base]
  (.-pos ^js class-like-declaration-base))

(defn end
  "**Returns:** `number`"
  ^js [class-like-declaration-base]
  (.-end ^js class-like-declaration-base))
