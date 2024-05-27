(ns dots.typescript.unparsed-source)

(defn kind
  "**Returns:** `SyntaxKind.UnparsedSource`"
  ^js [unparsed-source]
  (.-kind ^js unparsed-source))

(defn file-name
  "**Returns:** `string`"
  ^js [unparsed-source]
  (.-fileName ^js unparsed-source))

(defn set-file-name!
  ^js [unparsed-source value]
  (set! (.-fileName ^js unparsed-source) value))

(defn text
  "**Returns:** `string`"
  ^js [unparsed-source]
  (.-text ^js unparsed-source))

(defn set-text!
  ^js [unparsed-source value]
  (set! (.-text ^js unparsed-source) value))

(defn prologues
  "**Returns:** `readonly UnparsedPrologue[]`"
  ^js [unparsed-source]
  (.-prologues ^js unparsed-source))

(defn helpers
  "**Returns:** `readonly UnscopedEmitHelper[] | undefined`"
  ^js [unparsed-source]
  (.-helpers ^js unparsed-source))

(defn set-helpers!
  ^js [unparsed-source value]
  (set! (.-helpers ^js unparsed-source) value))

(defn referenced-files
  "**Returns:** `readonly FileReference[]`"
  ^js [unparsed-source]
  (.-referencedFiles ^js unparsed-source))

(defn set-referenced-files!
  ^js [unparsed-source value]
  (set! (.-referencedFiles ^js unparsed-source) value))

(defn type-reference-directives
  "**Returns:** `readonly FileReference[] | undefined`"
  ^js [unparsed-source]
  (.-typeReferenceDirectives ^js unparsed-source))

(defn set-type-reference-directives!
  ^js [unparsed-source value]
  (set! (.-typeReferenceDirectives ^js unparsed-source) value))

(defn lib-reference-directives
  "**Returns:** `readonly FileReference[]`"
  ^js [unparsed-source]
  (.-libReferenceDirectives ^js unparsed-source))

(defn set-lib-reference-directives!
  ^js [unparsed-source value]
  (set! (.-libReferenceDirectives ^js unparsed-source) value))

(defn has-no-default-lib?
  "**Returns:** `boolean | undefined`"
  ^js [unparsed-source]
  (.-hasNoDefaultLib ^js unparsed-source))

(defn set-has-no-default-lib!
  ^js [unparsed-source value]
  (set! (.-hasNoDefaultLib ^js unparsed-source) value))

(defn source-map-path
  "**Returns:** `string | undefined`"
  ^js [unparsed-source]
  (.-sourceMapPath ^js unparsed-source))

(defn set-source-map-path!
  ^js [unparsed-source value]
  (set! (.-sourceMapPath ^js unparsed-source) value))

(defn source-map-text
  "**Returns:** `string | undefined`"
  ^js [unparsed-source]
  (.-sourceMapText ^js unparsed-source))

(defn set-source-map-text!
  ^js [unparsed-source value]
  (set! (.-sourceMapText ^js unparsed-source) value))

(defn synthetic-references
  "**Returns:** `readonly UnparsedSyntheticReference[] | undefined`"
  ^js [unparsed-source]
  (.-syntheticReferences ^js unparsed-source))

(defn texts
  "**Returns:** `readonly UnparsedSourceText[]`"
  ^js [unparsed-source]
  (.-texts ^js unparsed-source))

(defn flags
  "**Returns:** `NodeFlags`"
  ^js [unparsed-source]
  (.-flags ^js unparsed-source))

(defn parent
  "**Returns:** `Node`"
  ^js [unparsed-source]
  (.-parent ^js unparsed-source))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [unparsed-source]
  (.getSourceFile ^js unparsed-source))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [unparsed-source]
   (.getChildCount ^js unparsed-source))
  (^js [unparsed-source source-file]
   (.getChildCount ^js unparsed-source source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [unparsed-source index]
   (.getChildAt ^js unparsed-source index))
  (^js [unparsed-source index source-file]
   (.getChildAt ^js unparsed-source index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [unparsed-source]
   (.getChildren ^js unparsed-source))
  (^js [unparsed-source source-file]
   (.getChildren ^js unparsed-source source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [unparsed-source]
   (.getStart ^js unparsed-source))
  (^js [unparsed-source source-file]
   (.getStart ^js unparsed-source source-file))
  (^js [unparsed-source source-file include-js-doc-comment?]
   (.getStart ^js unparsed-source source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [unparsed-source]
  (.getFullStart ^js unparsed-source))

(defn get-end
  "**Returns:** `number`"
  ^js [unparsed-source]
  (.getEnd ^js unparsed-source))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [unparsed-source]
   (.getWidth ^js unparsed-source))
  (^js [unparsed-source source-file]
   (.getWidth ^js unparsed-source source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [unparsed-source]
  (.getFullWidth ^js unparsed-source))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [unparsed-source]
   (.getLeadingTriviaWidth ^js unparsed-source))
  (^js [unparsed-source source-file]
   (.getLeadingTriviaWidth ^js unparsed-source source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [unparsed-source]
   (.getFullText ^js unparsed-source))
  (^js [unparsed-source source-file]
   (.getFullText ^js unparsed-source source-file)))

(defn get-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [unparsed-source]
   (.getText ^js unparsed-source))
  (^js [unparsed-source source-file]
   (.getText ^js unparsed-source source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [unparsed-source]
   (.getFirstToken ^js unparsed-source))
  (^js [unparsed-source source-file]
   (.getFirstToken ^js unparsed-source source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [unparsed-source]
   (.getLastToken ^js unparsed-source))
  (^js [unparsed-source source-file]
   (.getLastToken ^js unparsed-source source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [unparsed-source cb-node]
   (.forEachChild ^js unparsed-source cb-node))
  (^js [unparsed-source cb-node cb-node-array]
   (.forEachChild ^js unparsed-source cb-node cb-node-array)))

(defn pos
  "**Returns:** `number`"
  ^js [unparsed-source]
  (.-pos ^js unparsed-source))

(defn end
  "**Returns:** `number`"
  ^js [unparsed-source]
  (.-end ^js unparsed-source))
