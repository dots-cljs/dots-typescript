(ns dots.typescript.user-preferences)

(defn disable-suggestions?
  "**Returns:** `boolean | undefined`"
  ^js [user-preferences]
  (.-disableSuggestions ^js user-preferences))

(defn quote-preference
  "**Returns:** `\"auto\" | \"double\" | \"single\" | undefined`"
  ^js [user-preferences]
  (.-quotePreference ^js user-preferences))

(defn include-completions-for-module-exports?
  "**Returns:** `boolean | undefined`"
  ^js [user-preferences]
  (.-includeCompletionsForModuleExports ^js user-preferences))

(defn include-completions-for-import-statements?
  "**Returns:** `boolean | undefined`"
  ^js [user-preferences]
  (.-includeCompletionsForImportStatements ^js user-preferences))

(defn include-completions-with-snippet-text?
  "**Returns:** `boolean | undefined`"
  ^js [user-preferences]
  (.-includeCompletionsWithSnippetText ^js user-preferences))

(defn include-automatic-optional-chain-completions?
  "**Returns:** `boolean | undefined`"
  ^js [user-preferences]
  (.-includeAutomaticOptionalChainCompletions ^js user-preferences))

(defn include-completions-with-insert-text?
  "**Returns:** `boolean | undefined`"
  ^js [user-preferences]
  (.-includeCompletionsWithInsertText ^js user-preferences))

(defn include-completions-with-class-member-snippets?
  "**Returns:** `boolean | undefined`"
  ^js [user-preferences]
  (.-includeCompletionsWithClassMemberSnippets ^js user-preferences))

(defn include-completions-with-object-literal-method-snippets?
  "**Returns:** `boolean | undefined`"
  ^js [user-preferences]
  (.-includeCompletionsWithObjectLiteralMethodSnippets ^js user-preferences))

(defn use-label-details-in-completion-entries?
  "**Returns:** `boolean | undefined`"
  ^js [user-preferences]
  (.-useLabelDetailsInCompletionEntries ^js user-preferences))

(defn allow-incomplete-completions?
  "**Returns:** `boolean | undefined`"
  ^js [user-preferences]
  (.-allowIncompleteCompletions ^js user-preferences))

(defn import-module-specifier-preference
  "**Returns:** `\"shortest\" | \"project-relative\" | \"relative\" | \"non-relative\" | undefined`"
  ^js [user-preferences]
  (.-importModuleSpecifierPreference ^js user-preferences))

(defn import-module-specifier-ending
  "Determines whether we import `foo/index.ts` as \"foo\", \"foo/index\", or \"foo/index.js\"
   
   **Returns:** `\"auto\" | \"minimal\" | \"index\" | \"js\" | undefined`"
  ^js [user-preferences]
  (.-importModuleSpecifierEnding ^js user-preferences))

(defn allow-text-changes-in-new-files?
  "**Returns:** `boolean | undefined`"
  ^js [user-preferences]
  (.-allowTextChangesInNewFiles ^js user-preferences))

(defn provide-prefix-and-suffix-text-for-rename?
  "**Returns:** `boolean | undefined`"
  ^js [user-preferences]
  (.-providePrefixAndSuffixTextForRename ^js user-preferences))

(defn include-package-json-auto-imports
  "**Returns:** `\"auto\" | \"on\" | \"off\" | undefined`"
  ^js [user-preferences]
  (.-includePackageJsonAutoImports ^js user-preferences))

(defn provide-refactor-not-applicable-reason?
  "**Returns:** `boolean | undefined`"
  ^js [user-preferences]
  (.-provideRefactorNotApplicableReason ^js user-preferences))

(defn jsx-attribute-completion-style
  "**Returns:** `\"auto\" | \"braces\" | \"none\" | undefined`"
  ^js [user-preferences]
  (.-jsxAttributeCompletionStyle ^js user-preferences))

(defn include-inlay-parameter-name-hints
  "**Returns:** `\"none\" | \"literals\" | \"all\" | undefined`"
  ^js [user-preferences]
  (.-includeInlayParameterNameHints ^js user-preferences))

(defn include-inlay-parameter-name-hints-when-argument-matches-name?
  "**Returns:** `boolean | undefined`"
  ^js [user-preferences]
  (.-includeInlayParameterNameHintsWhenArgumentMatchesName ^js user-preferences))

(defn include-inlay-function-parameter-type-hints?
  "**Returns:** `boolean | undefined`"
  ^js [user-preferences]
  (.-includeInlayFunctionParameterTypeHints ^js user-preferences))

(defn include-inlay-variable-type-hints?
  "**Returns:** `boolean | undefined`"
  ^js [user-preferences]
  (.-includeInlayVariableTypeHints ^js user-preferences))

(defn include-inlay-variable-type-hints-when-type-matches-name?
  "**Returns:** `boolean | undefined`"
  ^js [user-preferences]
  (.-includeInlayVariableTypeHintsWhenTypeMatchesName ^js user-preferences))

(defn include-inlay-property-declaration-type-hints?
  "**Returns:** `boolean | undefined`"
  ^js [user-preferences]
  (.-includeInlayPropertyDeclarationTypeHints ^js user-preferences))

(defn include-inlay-function-like-return-type-hints?
  "**Returns:** `boolean | undefined`"
  ^js [user-preferences]
  (.-includeInlayFunctionLikeReturnTypeHints ^js user-preferences))

(defn include-inlay-enum-member-value-hints?
  "**Returns:** `boolean | undefined`"
  ^js [user-preferences]
  (.-includeInlayEnumMemberValueHints ^js user-preferences))

(defn interactive-inlay-hints?
  "**Returns:** `boolean | undefined`"
  ^js [user-preferences]
  (.-interactiveInlayHints ^js user-preferences))

(defn allow-rename-of-import-path?
  "**Returns:** `boolean | undefined`"
  ^js [user-preferences]
  (.-allowRenameOfImportPath ^js user-preferences))

(defn auto-import-file-exclude-patterns
  "**Returns:** `string[] | undefined`"
  ^js [user-preferences]
  (.-autoImportFileExcludePatterns ^js user-preferences))

(defn prefer-type-only-auto-imports?
  "**Returns:** `boolean | undefined`"
  ^js [user-preferences]
  (.-preferTypeOnlyAutoImports ^js user-preferences))

(defn organize-imports-ignore-case?
  "**Returns:** `boolean | \"auto\" | undefined`"
  ^js [user-preferences]
  (.-organizeImportsIgnoreCase ^js user-preferences))

(defn organize-imports-collation
  "**Returns:** `\"ordinal\" | \"unicode\" | undefined`"
  ^js [user-preferences]
  (.-organizeImportsCollation ^js user-preferences))

(defn organize-imports-locale
  "**Returns:** `string | undefined`"
  ^js [user-preferences]
  (.-organizeImportsLocale ^js user-preferences))

(defn organize-imports-numeric-collation?
  "**Returns:** `boolean | undefined`"
  ^js [user-preferences]
  (.-organizeImportsNumericCollation ^js user-preferences))

(defn organize-imports-accent-collation?
  "**Returns:** `boolean | undefined`"
  ^js [user-preferences]
  (.-organizeImportsAccentCollation ^js user-preferences))

(defn organize-imports-case-first
  "**Returns:** `false | \"upper\" | \"lower\" | undefined`"
  ^js [user-preferences]
  (.-organizeImportsCaseFirst ^js user-preferences))

(defn organize-imports-type-order
  "**Returns:** `\"last\" | \"first\" | \"inline\" | undefined`"
  ^js [user-preferences]
  (.-organizeImportsTypeOrder ^js user-preferences))

(defn exclude-library-symbols-in-nav-to?
  "**Returns:** `boolean | undefined`"
  ^js [user-preferences]
  (.-excludeLibrarySymbolsInNavTo ^js user-preferences))
