(ns dots.typescript.template-literal-type-span
  (:refer-clojure :exclude [type]))

(defn kind
  "**Returns:** `SyntaxKind.TemplateLiteralTypeSpan`"
  ^js [template-literal-type-span]
  (.-kind ^js template-literal-type-span))

(defn parent
  "**Returns:** `TemplateLiteralTypeNode`"
  ^js [template-literal-type-span]
  (.-parent ^js template-literal-type-span))

(defn type
  "**Returns:** `TypeNode`"
  ^js [template-literal-type-span]
  (.-type ^js template-literal-type-span))

(defn literal
  "**Returns:** `TemplateMiddle | TemplateTail`"
  ^js [template-literal-type-span]
  (.-literal ^js template-literal-type-span))

(defn flags
  "**Returns:** `NodeFlags`"
  ^js [template-literal-type-span]
  (.-flags ^js template-literal-type-span))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [template-literal-type-span]
  (.getSourceFile ^js template-literal-type-span))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [template-literal-type-span]
   (.getChildCount ^js template-literal-type-span))
  (^js [template-literal-type-span source-file]
   (.getChildCount ^js template-literal-type-span source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [template-literal-type-span index]
   (.getChildAt ^js template-literal-type-span index))
  (^js [template-literal-type-span index source-file]
   (.getChildAt ^js template-literal-type-span index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [template-literal-type-span]
   (.getChildren ^js template-literal-type-span))
  (^js [template-literal-type-span source-file]
   (.getChildren ^js template-literal-type-span source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [template-literal-type-span]
   (.getStart ^js template-literal-type-span))
  (^js [template-literal-type-span source-file]
   (.getStart ^js template-literal-type-span source-file))
  (^js [template-literal-type-span source-file include-js-doc-comment?]
   (.getStart ^js template-literal-type-span source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [template-literal-type-span]
  (.getFullStart ^js template-literal-type-span))

(defn get-end
  "**Returns:** `number`"
  ^js [template-literal-type-span]
  (.getEnd ^js template-literal-type-span))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [template-literal-type-span]
   (.getWidth ^js template-literal-type-span))
  (^js [template-literal-type-span source-file]
   (.getWidth ^js template-literal-type-span source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [template-literal-type-span]
  (.getFullWidth ^js template-literal-type-span))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [template-literal-type-span]
   (.getLeadingTriviaWidth ^js template-literal-type-span))
  (^js [template-literal-type-span source-file]
   (.getLeadingTriviaWidth ^js template-literal-type-span source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [template-literal-type-span]
   (.getFullText ^js template-literal-type-span))
  (^js [template-literal-type-span source-file]
   (.getFullText ^js template-literal-type-span source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [template-literal-type-span]
   (.getText ^js template-literal-type-span))
  (^js [template-literal-type-span source-file]
   (.getText ^js template-literal-type-span source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [template-literal-type-span]
   (.getFirstToken ^js template-literal-type-span))
  (^js [template-literal-type-span source-file]
   (.getFirstToken ^js template-literal-type-span source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [template-literal-type-span]
   (.getLastToken ^js template-literal-type-span))
  (^js [template-literal-type-span source-file]
   (.getLastToken ^js template-literal-type-span source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [template-literal-type-span cb-node]
   (.forEachChild ^js template-literal-type-span cb-node))
  (^js [template-literal-type-span cb-node cb-node-array]
   (.forEachChild ^js template-literal-type-span cb-node cb-node-array)))

(defn pos
  "**Returns:** `number`"
  ^js [template-literal-type-span]
  (.-pos ^js template-literal-type-span))

(defn end
  "**Returns:** `number`"
  ^js [template-literal-type-span]
  (.-end ^js template-literal-type-span))
