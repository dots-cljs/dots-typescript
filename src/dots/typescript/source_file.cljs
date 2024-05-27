(ns dots.typescript.source-file
  (:refer-clojure :exclude [update]))

(defn kind
  "**Returns:** `SyntaxKind.SourceFile`"
  ^js [source-file]
  (.-kind ^js source-file))

(defn statements
  "**Returns:** `NodeArray<Statement>`"
  ^js [source-file]
  (.-statements ^js source-file))

(defn end-of-file-token
  "**Returns:** `Token<SyntaxKind.EndOfFileToken>`"
  ^js [source-file]
  (.-endOfFileToken ^js source-file))

(defn file-name
  "**Returns:** `string`"
  ^js [source-file]
  (.-fileName ^js source-file))

(defn set-file-name!
  ^js [source-file value]
  (set! (.-fileName ^js source-file) value))

(defn text
  "**Returns:** `string`"
  ^js [source-file]
  (.-text ^js source-file))

(defn set-text!
  ^js [source-file value]
  (set! (.-text ^js source-file) value))

(defn amd-dependencies
  "**Returns:** `readonly AmdDependency[]`"
  ^js [source-file]
  (.-amdDependencies ^js source-file))

(defn set-amd-dependencies!
  ^js [source-file value]
  (set! (.-amdDependencies ^js source-file) value))

(defn module-name
  "**Returns:** `string | undefined`"
  ^js [source-file]
  (.-moduleName ^js source-file))

(defn set-module-name!
  ^js [source-file value]
  (set! (.-moduleName ^js source-file) value))

(defn referenced-files
  "**Returns:** `readonly FileReference[]`"
  ^js [source-file]
  (.-referencedFiles ^js source-file))

(defn set-referenced-files!
  ^js [source-file value]
  (set! (.-referencedFiles ^js source-file) value))

(defn type-reference-directives
  "**Returns:** `readonly FileReference[]`"
  ^js [source-file]
  (.-typeReferenceDirectives ^js source-file))

(defn set-type-reference-directives!
  ^js [source-file value]
  (set! (.-typeReferenceDirectives ^js source-file) value))

(defn lib-reference-directives
  "**Returns:** `readonly FileReference[]`"
  ^js [source-file]
  (.-libReferenceDirectives ^js source-file))

(defn set-lib-reference-directives!
  ^js [source-file value]
  (set! (.-libReferenceDirectives ^js source-file) value))

(defn language-variant
  "**Returns:** `LanguageVariant`"
  ^js [source-file]
  (.-languageVariant ^js source-file))

(defn set-language-variant!
  ^js [source-file value]
  (set! (.-languageVariant ^js source-file) value))

(defn declaration-file?
  "**Returns:** `boolean`"
  ^js [source-file]
  (.-isDeclarationFile ^js source-file))

(defn set-is-declaration-file!
  ^js [source-file value]
  (set! (.-isDeclarationFile ^js source-file) value))

(defn has-no-default-lib?
  "lib.d.ts should have a reference comment like
   
    /// <reference no-default-lib=\"true\"/>
   
   If any other file has this comment, it signals not to include lib.d.ts
   because this containing file is intended to act as a default library.
   
   **Returns:** `boolean`"
  ^js [source-file]
  (.-hasNoDefaultLib ^js source-file))

(defn set-has-no-default-lib!
  "lib.d.ts should have a reference comment like
   
    /// <reference no-default-lib=\"true\"/>
   
   If any other file has this comment, it signals not to include lib.d.ts
   because this containing file is intended to act as a default library."
  ^js [source-file value]
  (set! (.-hasNoDefaultLib ^js source-file) value))

(defn language-version
  "**Returns:** `ScriptTarget`"
  ^js [source-file]
  (.-languageVersion ^js source-file))

(defn set-language-version!
  ^js [source-file value]
  (set! (.-languageVersion ^js source-file) value))

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
  ^js [source-file]
  (.-impliedNodeFormat ^js source-file))

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
  ^js [source-file value]
  (set! (.-impliedNodeFormat ^js source-file) value))

(defn line-and-character-of-position
  "**Parameters:**
   - `pos`: `number`
   
   **Returns:** `LineAndCharacter`"
  ^js [source-file pos]
  (.getLineAndCharacterOfPosition ^js source-file pos))

(defn line-end-of-position
  "**Parameters:**
   - `pos`: `number`
   
   **Returns:** `number`"
  ^js [source-file pos]
  (.getLineEndOfPosition ^js source-file pos))

(defn line-starts
  "**Returns:** `readonly number[]`"
  ^js [source-file]
  (.getLineStarts ^js source-file))

(defn position-of-line-and-character
  "**Parameters:**
   - `line`: `number`
   - `character`: `number`
   
   **Returns:** `number`"
  ^js [source-file line character]
  (.getPositionOfLineAndCharacter ^js source-file line character))

(defn update
  "**Parameters:**
   - `new-text`: `string`
   - `text-change-range`: `TextChangeRange`
   
   **Returns:** `SourceFile`"
  ^js [source-file new-text text-change-range]
  (.update ^js source-file new-text text-change-range))

(defn flags
  "**Returns:** `NodeFlags`"
  ^js [source-file]
  (.-flags ^js source-file))

(defn parent
  "**Returns:** `Node`"
  ^js [source-file]
  (.-parent ^js source-file))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [source-file]
  (.getSourceFile ^js source-file))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [source-file]
   (.getChildCount ^js source-file))
  (^js [this-source-file source-file]
   (.getChildCount ^js this-source-file source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [source-file index]
   (.getChildAt ^js source-file index))
  (^js [this-source-file index source-file]
   (.getChildAt ^js this-source-file index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [source-file]
   (.getChildren ^js source-file))
  (^js [this-source-file source-file]
   (.getChildren ^js this-source-file source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [source-file]
   (.getStart ^js source-file))
  (^js [this-source-file source-file]
   (.getStart ^js this-source-file source-file))
  (^js [this-source-file source-file include-js-doc-comment?]
   (.getStart ^js this-source-file source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [source-file]
  (.getFullStart ^js source-file))

(defn get-end
  "**Returns:** `number`"
  ^js [source-file]
  (.getEnd ^js source-file))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [source-file]
   (.getWidth ^js source-file))
  (^js [this-source-file source-file]
   (.getWidth ^js this-source-file source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [source-file]
  (.getFullWidth ^js source-file))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [source-file]
   (.getLeadingTriviaWidth ^js source-file))
  (^js [this-source-file source-file]
   (.getLeadingTriviaWidth ^js this-source-file source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [source-file]
   (.getFullText ^js source-file))
  (^js [this-source-file source-file]
   (.getFullText ^js this-source-file source-file)))

(defn get-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [source-file]
   (.getText ^js source-file))
  (^js [this-source-file source-file]
   (.getText ^js this-source-file source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [source-file]
   (.getFirstToken ^js source-file))
  (^js [this-source-file source-file]
   (.getFirstToken ^js this-source-file source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [source-file]
   (.getLastToken ^js source-file))
  (^js [this-source-file source-file]
   (.getLastToken ^js this-source-file source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [source-file cb-node]
   (.forEachChild ^js source-file cb-node))
  (^js [source-file cb-node cb-node-array]
   (.forEachChild ^js source-file cb-node cb-node-array)))

(defn pos
  "**Returns:** `number`"
  ^js [source-file]
  (.-pos ^js source-file))

(defn end
  "**Returns:** `number`"
  ^js [source-file]
  (.-end ^js source-file))
