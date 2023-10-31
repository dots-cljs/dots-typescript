(ns dots.typescript.json-source-file
  (:refer-clojure :exclude [update]))

(defn statements
  ^js [json-source-file]
  (.-statements ^js json-source-file))

(defn kind
  ^js [json-source-file]
  (.-kind ^js json-source-file))

(defn end-of-file-token
  ^js [json-source-file]
  (.-endOfFileToken ^js json-source-file))

(defn file-name
  ^js [json-source-file]
  (.-fileName ^js json-source-file))

(defn set-file-name!
  ^js [json-source-file value]
  (set! (.-fileName ^js json-source-file) value))

(defn text
  ^js [json-source-file]
  (.-text ^js json-source-file))

(defn set-text!
  ^js [json-source-file value]
  (set! (.-text ^js json-source-file) value))

(defn amd-dependencies
  ^js [json-source-file]
  (.-amdDependencies ^js json-source-file))

(defn set-amd-dependencies!
  ^js [json-source-file value]
  (set! (.-amdDependencies ^js json-source-file) value))

(defn module-name
  ^js [json-source-file]
  (.-moduleName ^js json-source-file))

(defn set-module-name!
  ^js [json-source-file value]
  (set! (.-moduleName ^js json-source-file) value))

(defn referenced-files
  ^js [json-source-file]
  (.-referencedFiles ^js json-source-file))

(defn set-referenced-files!
  ^js [json-source-file value]
  (set! (.-referencedFiles ^js json-source-file) value))

(defn type-reference-directives
  ^js [json-source-file]
  (.-typeReferenceDirectives ^js json-source-file))

(defn set-type-reference-directives!
  ^js [json-source-file value]
  (set! (.-typeReferenceDirectives ^js json-source-file) value))

(defn lib-reference-directives
  ^js [json-source-file]
  (.-libReferenceDirectives ^js json-source-file))

(defn set-lib-reference-directives!
  ^js [json-source-file value]
  (set! (.-libReferenceDirectives ^js json-source-file) value))

(defn language-variant
  ^js [json-source-file]
  (.-languageVariant ^js json-source-file))

(defn set-language-variant!
  ^js [json-source-file value]
  (set! (.-languageVariant ^js json-source-file) value))

(defn declaration-file?
  ^js [json-source-file]
  (.-isDeclarationFile ^js json-source-file))

(defn set-is-declaration-file!
  ^js [json-source-file value]
  (set! (.-isDeclarationFile ^js json-source-file) value))

(defn has-no-default-lib?
  "lib.d.ts should have a reference comment like
   
    /// <reference no-default-lib=\"true\"/>
   
   If any other file has this comment, it signals not to include lib.d.ts
   because this containing file is intended to act as a default library."
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
   CommonJS-output-format by the node module transformer and type checker, regardless of extension or context."
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
  ^js [json-source-file pos]
  (.getLineAndCharacterOfPosition ^js json-source-file pos))

(defn line-end-of-position
  ^js [json-source-file pos]
  (.getLineEndOfPosition ^js json-source-file pos))

(defn line-starts
  ^js [json-source-file]
  (.getLineStarts ^js json-source-file))

(defn position-of-line-and-character
  ^js [json-source-file line character]
  (.getPositionOfLineAndCharacter ^js json-source-file line character))

(defn update
  ^js [json-source-file new-text text-change-range]
  (.update ^js json-source-file new-text text-change-range))

(defn flags
  ^js [json-source-file]
  (.-flags ^js json-source-file))

(defn parent
  ^js [json-source-file]
  (.-parent ^js json-source-file))

(defn source-file
  ^js [json-source-file]
  (.getSourceFile ^js json-source-file))

(defn child-count
  (^js [json-source-file]
   (.getChildCount ^js json-source-file))
  (^js [json-source-file source-file]
   (.getChildCount ^js json-source-file source-file)))

(defn child-at
  (^js [json-source-file index]
   (.getChildAt ^js json-source-file index))
  (^js [json-source-file index source-file]
   (.getChildAt ^js json-source-file index source-file)))

(defn children
  (^js [json-source-file]
   (.getChildren ^js json-source-file))
  (^js [json-source-file source-file]
   (.getChildren ^js json-source-file source-file)))

(defn start
  (^js [json-source-file]
   (.getStart ^js json-source-file))
  (^js [json-source-file source-file]
   (.getStart ^js json-source-file source-file))
  (^js [json-source-file source-file include-js-doc-comment?]
   (.getStart ^js json-source-file source-file include-js-doc-comment?)))

(defn full-start
  ^js [json-source-file]
  (.getFullStart ^js json-source-file))

(defn get-end
  ^js [json-source-file]
  (.getEnd ^js json-source-file))

(defn width
  (^js [json-source-file]
   (.getWidth ^js json-source-file))
  (^js [json-source-file source-file]
   (.getWidth ^js json-source-file source-file)))

(defn full-width
  ^js [json-source-file]
  (.getFullWidth ^js json-source-file))

(defn leading-trivia-width
  (^js [json-source-file]
   (.getLeadingTriviaWidth ^js json-source-file))
  (^js [json-source-file source-file]
   (.getLeadingTriviaWidth ^js json-source-file source-file)))

(defn full-text
  (^js [json-source-file]
   (.getFullText ^js json-source-file))
  (^js [json-source-file source-file]
   (.getFullText ^js json-source-file source-file)))

(defn get-text
  (^js [json-source-file]
   (.getText ^js json-source-file))
  (^js [json-source-file source-file]
   (.getText ^js json-source-file source-file)))

(defn first-token
  (^js [json-source-file]
   (.getFirstToken ^js json-source-file))
  (^js [json-source-file source-file]
   (.getFirstToken ^js json-source-file source-file)))

(defn last-token
  (^js [json-source-file]
   (.getLastToken ^js json-source-file))
  (^js [json-source-file source-file]
   (.getLastToken ^js json-source-file source-file)))

(defn for-each-child
  (^js [json-source-file cb-node]
   (.forEachChild ^js json-source-file cb-node))
  (^js [json-source-file cb-node cb-node-array]
   (.forEachChild ^js json-source-file cb-node cb-node-array)))

(defn decorators
  ^js [json-source-file]
  (.-decorators ^js json-source-file))

(defn modifiers
  ^js [json-source-file]
  (.-modifiers ^js json-source-file))

(defn pos
  ^js [json-source-file]
  (.-pos ^js json-source-file))

(defn end
  ^js [json-source-file]
  (.-end ^js json-source-file))
