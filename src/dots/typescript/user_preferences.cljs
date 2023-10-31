(ns dots.typescript.user-preferences)

(defn disable-suggestions?
  ^js [user-preferences]
  (.-disableSuggestions ^js user-preferences))

(defn quote-preference
  ^js [user-preferences]
  (.-quotePreference ^js user-preferences))

(defn include-completions-for-module-exports?
  ^js [user-preferences]
  (.-includeCompletionsForModuleExports ^js user-preferences))

(defn include-completions-for-import-statements?
  ^js [user-preferences]
  (.-includeCompletionsForImportStatements ^js user-preferences))

(defn include-completions-with-snippet-text?
  ^js [user-preferences]
  (.-includeCompletionsWithSnippetText ^js user-preferences))

(defn include-automatic-optional-chain-completions?
  ^js [user-preferences]
  (.-includeAutomaticOptionalChainCompletions ^js user-preferences))

(defn include-completions-with-insert-text?
  ^js [user-preferences]
  (.-includeCompletionsWithInsertText ^js user-preferences))

(defn include-completions-with-class-member-snippets?
  ^js [user-preferences]
  (.-includeCompletionsWithClassMemberSnippets ^js user-preferences))

(defn include-completions-with-object-literal-method-snippets?
  ^js [user-preferences]
  (.-includeCompletionsWithObjectLiteralMethodSnippets ^js user-preferences))

(defn use-label-details-in-completion-entries?
  ^js [user-preferences]
  (.-useLabelDetailsInCompletionEntries ^js user-preferences))

(defn allow-incomplete-completions?
  ^js [user-preferences]
  (.-allowIncompleteCompletions ^js user-preferences))

(defn import-module-specifier-preference
  ^js [user-preferences]
  (.-importModuleSpecifierPreference ^js user-preferences))

(defn import-module-specifier-ending
  "Determines whether we import `foo/index.ts` as \"foo\", \"foo/index\", or \"foo/index.js\""
  ^js [user-preferences]
  (.-importModuleSpecifierEnding ^js user-preferences))

(defn allow-text-changes-in-new-files?
  ^js [user-preferences]
  (.-allowTextChangesInNewFiles ^js user-preferences))

(defn provide-prefix-and-suffix-text-for-rename?
  ^js [user-preferences]
  (.-providePrefixAndSuffixTextForRename ^js user-preferences))

(defn include-package-json-auto-imports
  ^js [user-preferences]
  (.-includePackageJsonAutoImports ^js user-preferences))

(defn provide-refactor-not-applicable-reason?
  ^js [user-preferences]
  (.-provideRefactorNotApplicableReason ^js user-preferences))

(defn jsx-attribute-completion-style
  ^js [user-preferences]
  (.-jsxAttributeCompletionStyle ^js user-preferences))

(defn include-inlay-parameter-name-hints
  ^js [user-preferences]
  (.-includeInlayParameterNameHints ^js user-preferences))

(defn include-inlay-parameter-name-hints-when-argument-matches-name?
  ^js [user-preferences]
  (.-includeInlayParameterNameHintsWhenArgumentMatchesName ^js user-preferences))

(defn include-inlay-function-parameter-type-hints?
  ^js [user-preferences]
  (.-includeInlayFunctionParameterTypeHints ^js user-preferences))

(defn include-inlay-variable-type-hints?
  ^js [user-preferences]
  (.-includeInlayVariableTypeHints ^js user-preferences))

(defn include-inlay-variable-type-hints-when-type-matches-name?
  ^js [user-preferences]
  (.-includeInlayVariableTypeHintsWhenTypeMatchesName ^js user-preferences))

(defn include-inlay-property-declaration-type-hints?
  ^js [user-preferences]
  (.-includeInlayPropertyDeclarationTypeHints ^js user-preferences))

(defn include-inlay-function-like-return-type-hints?
  ^js [user-preferences]
  (.-includeInlayFunctionLikeReturnTypeHints ^js user-preferences))

(defn include-inlay-enum-member-value-hints?
  ^js [user-preferences]
  (.-includeInlayEnumMemberValueHints ^js user-preferences))

(defn interactive-inlay-hints?
  ^js [user-preferences]
  (.-interactiveInlayHints ^js user-preferences))

(defn allow-rename-of-import-path?
  ^js [user-preferences]
  (.-allowRenameOfImportPath ^js user-preferences))

(defn auto-import-file-exclude-patterns
  ^js [user-preferences]
  (.-autoImportFileExcludePatterns ^js user-preferences))

(defn organize-imports-ignore-case?
  ^js [user-preferences]
  (.-organizeImportsIgnoreCase ^js user-preferences))

(defn organize-imports-collation
  ^js [user-preferences]
  (.-organizeImportsCollation ^js user-preferences))

(defn organize-imports-locale
  ^js [user-preferences]
  (.-organizeImportsLocale ^js user-preferences))

(defn organize-imports-numeric-collation?
  ^js [user-preferences]
  (.-organizeImportsNumericCollation ^js user-preferences))

(defn organize-imports-accent-collation?
  ^js [user-preferences]
  (.-organizeImportsAccentCollation ^js user-preferences))

(defn organize-imports-case-first
  ^js [user-preferences]
  (.-organizeImportsCaseFirst ^js user-preferences))
