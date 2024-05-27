(ns dots.typescript.get-completions-at-position-options)

(defn trigger-character
  "If the editor is asking for completions because a certain character was typed
   (as opposed to when the user explicitly requested them) this should be set.
   
   **Returns:** `CompletionsTriggerCharacter | undefined`"
  ^js [get-completions-at-position-options]
  (.-triggerCharacter ^js get-completions-at-position-options))

(defn set-trigger-character!
  "If the editor is asking for completions because a certain character was typed
   (as opposed to when the user explicitly requested them) this should be set."
  ^js [get-completions-at-position-options value]
  (set! (.-triggerCharacter ^js get-completions-at-position-options) value))

(defn trigger-kind
  "**Returns:** `CompletionTriggerKind | undefined`"
  ^js [get-completions-at-position-options]
  (.-triggerKind ^js get-completions-at-position-options))

(defn set-trigger-kind!
  ^js [get-completions-at-position-options value]
  (set! (.-triggerKind ^js get-completions-at-position-options) value))

(defn include-symbol?
  "Include a `symbol` property on each completion entry object.
   Symbols reference cyclic data structures and sometimes an entire TypeChecker instance,
   so use caution when serializing or retaining completion entries retrieved with this option.
   
   **Returns:** `boolean | undefined`"
  ^js [get-completions-at-position-options]
  (.-includeSymbol ^js get-completions-at-position-options))

(defn set-include-symbol!
  "Include a `symbol` property on each completion entry object.
   Symbols reference cyclic data structures and sometimes an entire TypeChecker instance,
   so use caution when serializing or retaining completion entries retrieved with this option."
  ^js [get-completions-at-position-options value]
  (set! (.-includeSymbol ^js get-completions-at-position-options) value))

(defn include-external-module-exports?
  "**Returns:** `boolean | undefined`"
  ^js [get-completions-at-position-options]
  (.-includeExternalModuleExports ^js get-completions-at-position-options))

(defn set-include-external-module-exports!
  ^js [get-completions-at-position-options value]
  (set! (.-includeExternalModuleExports ^js get-completions-at-position-options) value))

(defn include-insert-text-completions?
  "**Returns:** `boolean | undefined`"
  ^js [get-completions-at-position-options]
  (.-includeInsertTextCompletions ^js get-completions-at-position-options))

(defn set-include-insert-text-completions!
  ^js [get-completions-at-position-options value]
  (set! (.-includeInsertTextCompletions ^js get-completions-at-position-options) value))

(defn disable-suggestions?
  "**Returns:** `boolean | undefined`"
  ^js [get-completions-at-position-options]
  (.-disableSuggestions ^js get-completions-at-position-options))

(defn quote-preference
  "**Returns:** `\"auto\" | \"double\" | \"single\" | undefined`"
  ^js [get-completions-at-position-options]
  (.-quotePreference ^js get-completions-at-position-options))

(defn include-completions-for-module-exports?
  "**Returns:** `boolean | undefined`"
  ^js [get-completions-at-position-options]
  (.-includeCompletionsForModuleExports ^js get-completions-at-position-options))

(defn include-completions-for-import-statements?
  "**Returns:** `boolean | undefined`"
  ^js [get-completions-at-position-options]
  (.-includeCompletionsForImportStatements ^js get-completions-at-position-options))

(defn include-completions-with-snippet-text?
  "**Returns:** `boolean | undefined`"
  ^js [get-completions-at-position-options]
  (.-includeCompletionsWithSnippetText ^js get-completions-at-position-options))

(defn include-automatic-optional-chain-completions?
  "**Returns:** `boolean | undefined`"
  ^js [get-completions-at-position-options]
  (.-includeAutomaticOptionalChainCompletions ^js get-completions-at-position-options))

(defn include-completions-with-insert-text?
  "**Returns:** `boolean | undefined`"
  ^js [get-completions-at-position-options]
  (.-includeCompletionsWithInsertText ^js get-completions-at-position-options))

(defn include-completions-with-class-member-snippets?
  "**Returns:** `boolean | undefined`"
  ^js [get-completions-at-position-options]
  (.-includeCompletionsWithClassMemberSnippets ^js get-completions-at-position-options))

(defn include-completions-with-object-literal-method-snippets?
  "**Returns:** `boolean | undefined`"
  ^js [get-completions-at-position-options]
  (.-includeCompletionsWithObjectLiteralMethodSnippets ^js get-completions-at-position-options))

(defn use-label-details-in-completion-entries?
  "**Returns:** `boolean | undefined`"
  ^js [get-completions-at-position-options]
  (.-useLabelDetailsInCompletionEntries ^js get-completions-at-position-options))

(defn allow-incomplete-completions?
  "**Returns:** `boolean | undefined`"
  ^js [get-completions-at-position-options]
  (.-allowIncompleteCompletions ^js get-completions-at-position-options))

(defn import-module-specifier-preference
  "**Returns:** `\"shortest\" | \"project-relative\" | \"relative\" | \"non-relative\" | undefined`"
  ^js [get-completions-at-position-options]
  (.-importModuleSpecifierPreference ^js get-completions-at-position-options))

(defn import-module-specifier-ending
  "Determines whether we import `foo/index.ts` as \"foo\", \"foo/index\", or \"foo/index.js\"
   
   **Returns:** `\"auto\" | \"minimal\" | \"index\" | \"js\" | undefined`"
  ^js [get-completions-at-position-options]
  (.-importModuleSpecifierEnding ^js get-completions-at-position-options))

(defn allow-text-changes-in-new-files?
  "**Returns:** `boolean | undefined`"
  ^js [get-completions-at-position-options]
  (.-allowTextChangesInNewFiles ^js get-completions-at-position-options))

(defn provide-prefix-and-suffix-text-for-rename?
  "**Returns:** `boolean | undefined`"
  ^js [get-completions-at-position-options]
  (.-providePrefixAndSuffixTextForRename ^js get-completions-at-position-options))

(defn include-package-json-auto-imports
  "**Returns:** `\"auto\" | \"on\" | \"off\" | undefined`"
  ^js [get-completions-at-position-options]
  (.-includePackageJsonAutoImports ^js get-completions-at-position-options))

(defn provide-refactor-not-applicable-reason?
  "**Returns:** `boolean | undefined`"
  ^js [get-completions-at-position-options]
  (.-provideRefactorNotApplicableReason ^js get-completions-at-position-options))

(defn jsx-attribute-completion-style
  "**Returns:** `\"auto\" | \"braces\" | \"none\" | undefined`"
  ^js [get-completions-at-position-options]
  (.-jsxAttributeCompletionStyle ^js get-completions-at-position-options))

(defn include-inlay-parameter-name-hints
  "**Returns:** `\"none\" | \"literals\" | \"all\" | undefined`"
  ^js [get-completions-at-position-options]
  (.-includeInlayParameterNameHints ^js get-completions-at-position-options))

(defn include-inlay-parameter-name-hints-when-argument-matches-name?
  "**Returns:** `boolean | undefined`"
  ^js [get-completions-at-position-options]
  (.-includeInlayParameterNameHintsWhenArgumentMatchesName ^js get-completions-at-position-options))

(defn include-inlay-function-parameter-type-hints?
  "**Returns:** `boolean | undefined`"
  ^js [get-completions-at-position-options]
  (.-includeInlayFunctionParameterTypeHints ^js get-completions-at-position-options))

(defn include-inlay-variable-type-hints?
  "**Returns:** `boolean | undefined`"
  ^js [get-completions-at-position-options]
  (.-includeInlayVariableTypeHints ^js get-completions-at-position-options))

(defn include-inlay-variable-type-hints-when-type-matches-name?
  "**Returns:** `boolean | undefined`"
  ^js [get-completions-at-position-options]
  (.-includeInlayVariableTypeHintsWhenTypeMatchesName ^js get-completions-at-position-options))

(defn include-inlay-property-declaration-type-hints?
  "**Returns:** `boolean | undefined`"
  ^js [get-completions-at-position-options]
  (.-includeInlayPropertyDeclarationTypeHints ^js get-completions-at-position-options))

(defn include-inlay-function-like-return-type-hints?
  "**Returns:** `boolean | undefined`"
  ^js [get-completions-at-position-options]
  (.-includeInlayFunctionLikeReturnTypeHints ^js get-completions-at-position-options))

(defn include-inlay-enum-member-value-hints?
  "**Returns:** `boolean | undefined`"
  ^js [get-completions-at-position-options]
  (.-includeInlayEnumMemberValueHints ^js get-completions-at-position-options))

(defn interactive-inlay-hints?
  "**Returns:** `boolean | undefined`"
  ^js [get-completions-at-position-options]
  (.-interactiveInlayHints ^js get-completions-at-position-options))

(defn allow-rename-of-import-path?
  "**Returns:** `boolean | undefined`"
  ^js [get-completions-at-position-options]
  (.-allowRenameOfImportPath ^js get-completions-at-position-options))

(defn auto-import-file-exclude-patterns
  "**Returns:** `string[] | undefined`"
  ^js [get-completions-at-position-options]
  (.-autoImportFileExcludePatterns ^js get-completions-at-position-options))

(defn prefer-type-only-auto-imports?
  "**Returns:** `boolean | undefined`"
  ^js [get-completions-at-position-options]
  (.-preferTypeOnlyAutoImports ^js get-completions-at-position-options))

(defn organize-imports-ignore-case?
  "**Returns:** `boolean | \"auto\" | undefined`"
  ^js [get-completions-at-position-options]
  (.-organizeImportsIgnoreCase ^js get-completions-at-position-options))

(defn organize-imports-collation
  "**Returns:** `\"ordinal\" | \"unicode\" | undefined`"
  ^js [get-completions-at-position-options]
  (.-organizeImportsCollation ^js get-completions-at-position-options))

(defn organize-imports-locale
  "**Returns:** `string | undefined`"
  ^js [get-completions-at-position-options]
  (.-organizeImportsLocale ^js get-completions-at-position-options))

(defn organize-imports-numeric-collation?
  "**Returns:** `boolean | undefined`"
  ^js [get-completions-at-position-options]
  (.-organizeImportsNumericCollation ^js get-completions-at-position-options))

(defn organize-imports-accent-collation?
  "**Returns:** `boolean | undefined`"
  ^js [get-completions-at-position-options]
  (.-organizeImportsAccentCollation ^js get-completions-at-position-options))

(defn organize-imports-case-first
  "**Returns:** `false | \"upper\" | \"lower\" | undefined`"
  ^js [get-completions-at-position-options]
  (.-organizeImportsCaseFirst ^js get-completions-at-position-options))

(defn organize-imports-type-order
  "**Returns:** `\"last\" | \"first\" | \"inline\" | undefined`"
  ^js [get-completions-at-position-options]
  (.-organizeImportsTypeOrder ^js get-completions-at-position-options))

(defn exclude-library-symbols-in-nav-to?
  "**Returns:** `boolean | undefined`"
  ^js [get-completions-at-position-options]
  (.-excludeLibrarySymbolsInNavTo ^js get-completions-at-position-options))
