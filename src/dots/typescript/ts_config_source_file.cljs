(ns dots.typescript.ts-config-source-file
  (:refer-clojure :exclude [update]))

(defn extended-source-files
  ^js [ts-config-source-file]
  (.-extendedSourceFiles ^js ts-config-source-file))

(defn set-extended-source-files!
  ^js [ts-config-source-file value]
  (set! (.-extendedSourceFiles ^js ts-config-source-file) value))

(defn statements
  ^js [ts-config-source-file]
  (.-statements ^js ts-config-source-file))

(defn kind
  ^js [ts-config-source-file]
  (.-kind ^js ts-config-source-file))

(defn end-of-file-token
  ^js [ts-config-source-file]
  (.-endOfFileToken ^js ts-config-source-file))

(defn file-name
  ^js [ts-config-source-file]
  (.-fileName ^js ts-config-source-file))

(defn set-file-name!
  ^js [ts-config-source-file value]
  (set! (.-fileName ^js ts-config-source-file) value))

(defn text
  ^js [ts-config-source-file]
  (.-text ^js ts-config-source-file))

(defn set-text!
  ^js [ts-config-source-file value]
  (set! (.-text ^js ts-config-source-file) value))

(defn amd-dependencies
  ^js [ts-config-source-file]
  (.-amdDependencies ^js ts-config-source-file))

(defn set-amd-dependencies!
  ^js [ts-config-source-file value]
  (set! (.-amdDependencies ^js ts-config-source-file) value))

(defn module-name
  ^js [ts-config-source-file]
  (.-moduleName ^js ts-config-source-file))

(defn set-module-name!
  ^js [ts-config-source-file value]
  (set! (.-moduleName ^js ts-config-source-file) value))

(defn referenced-files
  ^js [ts-config-source-file]
  (.-referencedFiles ^js ts-config-source-file))

(defn set-referenced-files!
  ^js [ts-config-source-file value]
  (set! (.-referencedFiles ^js ts-config-source-file) value))

(defn type-reference-directives
  ^js [ts-config-source-file]
  (.-typeReferenceDirectives ^js ts-config-source-file))

(defn set-type-reference-directives!
  ^js [ts-config-source-file value]
  (set! (.-typeReferenceDirectives ^js ts-config-source-file) value))

(defn lib-reference-directives
  ^js [ts-config-source-file]
  (.-libReferenceDirectives ^js ts-config-source-file))

(defn set-lib-reference-directives!
  ^js [ts-config-source-file value]
  (set! (.-libReferenceDirectives ^js ts-config-source-file) value))

(defn language-variant
  ^js [ts-config-source-file]
  (.-languageVariant ^js ts-config-source-file))

(defn set-language-variant!
  ^js [ts-config-source-file value]
  (set! (.-languageVariant ^js ts-config-source-file) value))

(defn declaration-file?
  ^js [ts-config-source-file]
  (.-isDeclarationFile ^js ts-config-source-file))

(defn set-is-declaration-file!
  ^js [ts-config-source-file value]
  (set! (.-isDeclarationFile ^js ts-config-source-file) value))

(defn has-no-default-lib?
  "lib.d.ts should have a reference comment like
   
    /// <reference no-default-lib=\"true\"/>
   
   If any other file has this comment, it signals not to include lib.d.ts
   because this containing file is intended to act as a default library."
  ^js [ts-config-source-file]
  (.-hasNoDefaultLib ^js ts-config-source-file))

(defn set-has-no-default-lib!
  "lib.d.ts should have a reference comment like
   
    /// <reference no-default-lib=\"true\"/>
   
   If any other file has this comment, it signals not to include lib.d.ts
   because this containing file is intended to act as a default library."
  ^js [ts-config-source-file value]
  (set! (.-hasNoDefaultLib ^js ts-config-source-file) value))

(defn language-version
  ^js [ts-config-source-file]
  (.-languageVersion ^js ts-config-source-file))

(defn set-language-version!
  ^js [ts-config-source-file value]
  (set! (.-languageVersion ^js ts-config-source-file) value))

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
   CommonJS-output-format by the node module transformer and type checker, regardless of extension or context."
  ^js [ts-config-source-file]
  (.-impliedNodeFormat ^js ts-config-source-file))

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
  ^js [ts-config-source-file value]
  (set! (.-impliedNodeFormat ^js ts-config-source-file) value))

(defn line-and-character-of-position
  "**Parameters:**
   - `pos`: `number`
   
   **Returns:** `LineAndCharacter`"
  ^js [ts-config-source-file pos]
  (.getLineAndCharacterOfPosition ^js ts-config-source-file pos))

(defn line-end-of-position
  "**Parameters:**
   - `pos`: `number`
   
   **Returns:** `number`"
  ^js [ts-config-source-file pos]
  (.getLineEndOfPosition ^js ts-config-source-file pos))

(defn line-starts
  "**Returns:** `readonly number[]`"
  ^js [ts-config-source-file]
  (.getLineStarts ^js ts-config-source-file))

(defn position-of-line-and-character
  "**Parameters:**
   - `line`: `number`
   - `character`: `number`
   
   **Returns:** `number`"
  ^js [ts-config-source-file line character]
  (.getPositionOfLineAndCharacter ^js ts-config-source-file line character))

(defn update
  "**Parameters:**
   - `new-text`: `string`
   - `text-change-range`: `TextChangeRange`
   
   **Returns:** `SourceFile`"
  ^js [ts-config-source-file new-text text-change-range]
  (.update ^js ts-config-source-file new-text text-change-range))

(defn flags
  ^js [ts-config-source-file]
  (.-flags ^js ts-config-source-file))

(defn parent
  ^js [ts-config-source-file]
  (.-parent ^js ts-config-source-file))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [ts-config-source-file]
  (.getSourceFile ^js ts-config-source-file))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [ts-config-source-file]
   (.getChildCount ^js ts-config-source-file))
  (^js [ts-config-source-file source-file]
   (.getChildCount ^js ts-config-source-file source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [ts-config-source-file index]
   (.getChildAt ^js ts-config-source-file index))
  (^js [ts-config-source-file index source-file]
   (.getChildAt ^js ts-config-source-file index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [ts-config-source-file]
   (.getChildren ^js ts-config-source-file))
  (^js [ts-config-source-file source-file]
   (.getChildren ^js ts-config-source-file source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [ts-config-source-file]
   (.getStart ^js ts-config-source-file))
  (^js [ts-config-source-file source-file]
   (.getStart ^js ts-config-source-file source-file))
  (^js [ts-config-source-file source-file include-js-doc-comment?]
   (.getStart ^js ts-config-source-file source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [ts-config-source-file]
  (.getFullStart ^js ts-config-source-file))

(defn get-end
  "**Returns:** `number`"
  ^js [ts-config-source-file]
  (.getEnd ^js ts-config-source-file))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [ts-config-source-file]
   (.getWidth ^js ts-config-source-file))
  (^js [ts-config-source-file source-file]
   (.getWidth ^js ts-config-source-file source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [ts-config-source-file]
  (.getFullWidth ^js ts-config-source-file))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [ts-config-source-file]
   (.getLeadingTriviaWidth ^js ts-config-source-file))
  (^js [ts-config-source-file source-file]
   (.getLeadingTriviaWidth ^js ts-config-source-file source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [ts-config-source-file]
   (.getFullText ^js ts-config-source-file))
  (^js [ts-config-source-file source-file]
   (.getFullText ^js ts-config-source-file source-file)))

(defn get-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [ts-config-source-file]
   (.getText ^js ts-config-source-file))
  (^js [ts-config-source-file source-file]
   (.getText ^js ts-config-source-file source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [ts-config-source-file]
   (.getFirstToken ^js ts-config-source-file))
  (^js [ts-config-source-file source-file]
   (.getFirstToken ^js ts-config-source-file source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [ts-config-source-file]
   (.getLastToken ^js ts-config-source-file))
  (^js [ts-config-source-file source-file]
   (.getLastToken ^js ts-config-source-file source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [ts-config-source-file cb-node]
   (.forEachChild ^js ts-config-source-file cb-node))
  (^js [ts-config-source-file cb-node cb-node-array]
   (.forEachChild ^js ts-config-source-file cb-node cb-node-array)))

(defn pos
  ^js [ts-config-source-file]
  (.-pos ^js ts-config-source-file))

(defn end
  ^js [ts-config-source-file]
  (.-end ^js ts-config-source-file))
