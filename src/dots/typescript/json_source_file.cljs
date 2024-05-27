(ns dots.typescript.json-source-file
  (:refer-clojure :exclude [update]))

(defn statements
  "**Returns:** `NodeArray<JsonObjectExpressionStatement>`"
  ^js [json-source-file]
  (.-statements ^js json-source-file))

(defn kind
  "**Returns:** `SyntaxKind.SourceFile`"
  ^js [json-source-file]
  (.-kind ^js json-source-file))

(defn end-of-file-token
  "**Returns:** `Token<SyntaxKind.EndOfFileToken>`"
  ^js [json-source-file]
  (.-endOfFileToken ^js json-source-file))

(defn file-name
  "**Returns:** `string`"
  ^js [json-source-file]
  (.-fileName ^js json-source-file))

(defn set-file-name!
  ^js [json-source-file value]
  (set! (.-fileName ^js json-source-file) value))

(defn text
  "**Returns:** `string`"
  ^js [json-source-file]
  (.-text ^js json-source-file))

(defn set-text!
  ^js [json-source-file value]
  (set! (.-text ^js json-source-file) value))

(defn amd-dependencies
  "**Returns:** `readonly AmdDependency[]`"
  ^js [json-source-file]
  (.-amdDependencies ^js json-source-file))

(defn set-amd-dependencies!
  ^js [json-source-file value]
  (set! (.-amdDependencies ^js json-source-file) value))

(defn module-name
  "**Returns:** `string | undefined`"
  ^js [json-source-file]
  (.-moduleName ^js json-source-file))

(defn set-module-name!
  ^js [json-source-file value]
  (set! (.-moduleName ^js json-source-file) value))

(defn referenced-files
  "**Returns:** `readonly FileReference[]`"
  ^js [json-source-file]
  (.-referencedFiles ^js json-source-file))

(defn set-referenced-files!
  ^js [json-source-file value]
  (set! (.-referencedFiles ^js json-source-file) value))

(defn type-reference-directives
  "**Returns:** `readonly FileReference[]`"
  ^js [json-source-file]
  (.-typeReferenceDirectives ^js json-source-file))

(defn set-type-reference-directives!
  ^js [json-source-file value]
  (set! (.-typeReferenceDirectives ^js json-source-file) value))

(defn lib-reference-directives
  "**Returns:** `readonly FileReference[]`"
  ^js [json-source-file]
  (.-libReferenceDirectives ^js json-source-file))

(defn set-lib-reference-directives!
  ^js [json-source-file value]
  (set! (.-libReferenceDirectives ^js json-source-file) value))

(defn language-variant
  "**Returns:** `LanguageVariant`"
  ^js [json-source-file]
  (.-languageVariant ^js json-source-file))

(defn set-language-variant!
  ^js [json-source-file value]
  (set! (.-languageVariant ^js json-source-file) value))

(defn declaration-file?
  "**Returns:** `boolean`"
  ^js [json-source-file]
  (.-isDeclarationFile ^js json-source-file))

(defn set-is-declaration-file!
  ^js [json-source-file value]
  (set! (.-isDeclarationFile ^js json-source-file) value))

(defn has-no-default-lib?
  "lib.d.ts should have a reference comment like
   
    /// <reference no-default-lib=\"true\"/>
   
   If any other file has this comment, it signals not to include lib.d.ts
   because this containing file is intended to act as a default library.
   
   **Returns:** `boolean`"
  ^js [json-source-file]
  (.-hasNoDefaultLib ^js json-source-file))

(defn set-has-no-default-lib!
  "lib.d.ts should have a reference comment like
   
    /// <reference no-default-lib=\"true\"/>
   
   If any other file has this comment, it signals not to include lib.d.ts
   because this containing file is intended to act as a default library."
  ^js [json-source-file value]
  (set! (.-hasNoDefaultLib ^js json-source-file) value))

(defn language-version
  "**Returns:** `ScriptTarget`"
  ^js [json-source-file]
  (.-languageVersion ^js json-source-file))

(defn set-language-version!
  ^js [json-source-file value]
  (set! (.-languageVersion ^js json-source-file) value))

(defn implied-node-format
  "When `module` is `Node16` or `NodeNext`, this field controls whether the
   source file in question is an ESNext-output-format file, or a CommonJS-output-format
   module. This is derived by the module resolver as it looks up the file, since
   it is derived from either the file extension of the module, or the containing
   `package.json` context, and affects both checking and emit.
   
   It is _public_ so that (pre)transformers can set this field,
   since it switches the builtin `node` module transform. Generally speaking, if unset,
   the field is treated as though it is `ModuleKind.CommonJS`.
   
   Note that this field is only set by the module resolution process when
   `moduleResolution` is `Node16` or `NodeNext`, which is implied by the `module` setting
   of `Node16` or `NodeNext`, respectively, but may be overriden (eg, by a `moduleResolution`
   of `node`). If so, this field will be unset and source files will be considered to be
   CommonJS-output-format by the node module transformer and type checker, regardless of extension or context.
   
   **Returns:** `ResolutionMode`"
  ^js [json-source-file]
  (.-impliedNodeFormat ^js json-source-file))

(defn set-implied-node-format!
  "When `module` is `Node16` or `NodeNext`, this field controls whether the
   source file in question is an ESNext-output-format file, or a CommonJS-output-format
   module. This is derived by the module resolver as it looks up the file, since
   it is derived from either the file extension of the module, or the containing
   `package.json` context, and affects both checking and emit.
   
   It is _public_ so that (pre)transformers can set this field,
   since it switches the builtin `node` module transform. Generally speaking, if unset,
   the field is treated as though it is `ModuleKind.CommonJS`.
   
   Note that this field is only set by the module resolution process when
   `moduleResolution` is `Node16` or `NodeNext`, which is implied by the `module` setting
   of `Node16` or `NodeNext`, respectively, but may be overriden (eg, by a `moduleResolution`
   of `node`). If so, this field will be unset and source files will be considered to be
   CommonJS-output-format by the node module transformer and type checker, regardless of extension or context."
  ^js [json-source-file value]
  (set! (.-impliedNodeFormat ^js json-source-file) value))

(defn line-and-character-of-position
  "**Parameters:**
   - `pos`: `number`
   
   **Returns:** `LineAndCharacter`"
  ^js [json-source-file pos]
  (.getLineAndCharacterOfPosition ^js json-source-file pos))

(defn line-end-of-position
  "**Parameters:**
   - `pos`: `number`
   
   **Returns:** `number`"
  ^js [json-source-file pos]
  (.getLineEndOfPosition ^js json-source-file pos))

(defn line-starts
  "**Returns:** `readonly number[]`"
  ^js [json-source-file]
  (.getLineStarts ^js json-source-file))

(defn position-of-line-and-character
  "**Parameters:**
   - `line`: `number`
   - `character`: `number`
   
   **Returns:** `number`"
  ^js [json-source-file line character]
  (.getPositionOfLineAndCharacter ^js json-source-file line character))

(defn update
  "**Parameters:**
   - `new-text`: `string`
   - `text-change-range`: `TextChangeRange`
   
   **Returns:** `SourceFile`"
  ^js [json-source-file new-text text-change-range]
  (.update ^js json-source-file new-text text-change-range))

(defn flags
  "**Returns:** `NodeFlags`"
  ^js [json-source-file]
  (.-flags ^js json-source-file))

(defn parent
  "**Returns:** `Node`"
  ^js [json-source-file]
  (.-parent ^js json-source-file))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [json-source-file]
  (.getSourceFile ^js json-source-file))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [json-source-file]
   (.getChildCount ^js json-source-file))
  (^js [json-source-file source-file]
   (.getChildCount ^js json-source-file source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [json-source-file index]
   (.getChildAt ^js json-source-file index))
  (^js [json-source-file index source-file]
   (.getChildAt ^js json-source-file index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [json-source-file]
   (.getChildren ^js json-source-file))
  (^js [json-source-file source-file]
   (.getChildren ^js json-source-file source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [json-source-file]
   (.getStart ^js json-source-file))
  (^js [json-source-file source-file]
   (.getStart ^js json-source-file source-file))
  (^js [json-source-file source-file include-js-doc-comment?]
   (.getStart ^js json-source-file source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [json-source-file]
  (.getFullStart ^js json-source-file))

(defn get-end
  "**Returns:** `number`"
  ^js [json-source-file]
  (.getEnd ^js json-source-file))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [json-source-file]
   (.getWidth ^js json-source-file))
  (^js [json-source-file source-file]
   (.getWidth ^js json-source-file source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [json-source-file]
  (.getFullWidth ^js json-source-file))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [json-source-file]
   (.getLeadingTriviaWidth ^js json-source-file))
  (^js [json-source-file source-file]
   (.getLeadingTriviaWidth ^js json-source-file source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [json-source-file]
   (.getFullText ^js json-source-file))
  (^js [json-source-file source-file]
   (.getFullText ^js json-source-file source-file)))

(defn get-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [json-source-file]
   (.getText ^js json-source-file))
  (^js [json-source-file source-file]
   (.getText ^js json-source-file source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [json-source-file]
   (.getFirstToken ^js json-source-file))
  (^js [json-source-file source-file]
   (.getFirstToken ^js json-source-file source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [json-source-file]
   (.getLastToken ^js json-source-file))
  (^js [json-source-file source-file]
   (.getLastToken ^js json-source-file source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [json-source-file cb-node]
   (.forEachChild ^js json-source-file cb-node))
  (^js [json-source-file cb-node cb-node-array]
   (.forEachChild ^js json-source-file cb-node cb-node-array)))

(defn pos
  "**Returns:** `number`"
  ^js [json-source-file]
  (.-pos ^js json-source-file))

(defn end
  "**Returns:** `number`"
  ^js [json-source-file]
  (.-end ^js json-source-file))
