(ns dots.typescript.server.protocol.user-preferences)

(defn disable-suggestions?
  ^js [user-preferences]
  (.-disableSuggestions ^js user-preferences))

(defn quote-preference
  ^js [user-preferences]
  (.-quotePreference ^js user-preferences))

(defn include-completions-for-module-exports?
  "If enabled, TypeScript will search through all external modules' exports and add them to the completions list.
   This affects lone identifier completions but not completions on the right hand side of `obj.`."
  ^js [user-preferences]
  (.-includeCompletionsForModuleExports ^js user-preferences))

(defn include-completions-for-import-statements?
  "Enables auto-import-style completions on partially-typed import statements. E.g., allows
   `import write|` to be completed to `import { writeFile } from \"fs\"`."
  ^js [user-preferences]
  (.-includeCompletionsForImportStatements ^js user-preferences))

(defn include-completions-with-snippet-text?
  "Allows completions to be formatted with snippet text, indicated by `CompletionItem[\"isSnippet\"]`."
  ^js [user-preferences]
  (.-includeCompletionsWithSnippetText ^js user-preferences))

(defn include-completions-with-insert-text?
  "If enabled, the completion list will include completions with invalid identifier names.
   For those entries, The `insertText` and `replacementSpan` properties will be set to change from `.x` property access to `[\"x\"]`."
  ^js [user-preferences]
  (.-includeCompletionsWithInsertText ^js user-preferences))

(defn include-automatic-optional-chain-completions?
  "Unless this option is `false`, or `includeCompletionsWithInsertText` is not enabled,
   member completion lists triggered with `.` will include entries on potentially-null and potentially-undefined
   values, with insertion text to replace preceding `.` tokens with `?.`."
  ^js [user-preferences]
  (.-includeAutomaticOptionalChainCompletions ^js user-preferences))

(defn include-completions-with-class-member-snippets?
  "If enabled, completions for class members (e.g. methods and properties) will include
   a whole declaration for the member.
   E.g., `class A { f| }` could be completed to `class A { foo(): number {} }`, instead of
   `class A { foo }`."
  ^js [user-preferences]
  (.-includeCompletionsWithClassMemberSnippets ^js user-preferences))

(defn include-completions-with-object-literal-method-snippets?
  "If enabled, object literal methods will have a method declaration completion entry in addition
   to the regular completion entry containing just the method name.
   E.g., `const objectLiteral: T = { f| }` could be completed to `const objectLiteral: T = { foo(): void {} }`,
   in addition to `const objectLiteral: T = { foo }`."
  ^js [user-preferences]
  (.-includeCompletionsWithObjectLiteralMethodSnippets ^js user-preferences))

(defn use-label-details-in-completion-entries?
  "Indicates whether {@link CompletionEntry.labelDetails completion entry label details} are supported.
   If not, contents of `labelDetails` may be included in the {@link CompletionEntry.name } property."
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

(defn lazy-configured-projects-from-external-project?
  ^js [user-preferences]
  (.-lazyConfiguredProjectsFromExternalProject ^js user-preferences))

(defn provide-prefix-and-suffix-text-for-rename?
  ^js [user-preferences]
  (.-providePrefixAndSuffixTextForRename ^js user-preferences))

(defn provide-refactor-not-applicable-reason?
  ^js [user-preferences]
  (.-provideRefactorNotApplicableReason ^js user-preferences))

(defn allow-rename-of-import-path?
  ^js [user-preferences]
  (.-allowRenameOfImportPath ^js user-preferences))

(defn include-package-json-auto-imports
  ^js [user-preferences]
  (.-includePackageJsonAutoImports ^js user-preferences))

(defn jsx-attribute-completion-style
  ^js [user-preferences]
  (.-jsxAttributeCompletionStyle ^js user-preferences))

(defn display-parts-for-js-doc?
  ^js [user-preferences]
  (.-displayPartsForJSDoc ^js user-preferences))

(defn generate-return-in-doc-template?
  ^js [user-preferences]
  (.-generateReturnInDocTemplate ^js user-preferences))

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

(defn auto-import-file-exclude-patterns
  ^js [user-preferences]
  (.-autoImportFileExcludePatterns ^js user-preferences))

(defn organize-imports-ignore-case?
  "Indicates whether imports should be organized in a case-insensitive manner."
  ^js [user-preferences]
  (.-organizeImportsIgnoreCase ^js user-preferences))

(defn organize-imports-collation
  "Indicates whether imports should be organized via an \"ordinal\" (binary) comparison using the numeric value
   of their code points, or via \"unicode\" collation (via the
   [Unicode Collation Algorithm](https://unicode.org/reports/tr10/#Scope)) using rules associated with the locale
   specified in {@link organizeImportsCollationLocale }.
   
   Default: `\"ordinal\"`."
  ^js [user-preferences]
  (.-organizeImportsCollation ^js user-preferences))

(defn organize-imports-collation-locale
  "Indicates the locale to use for \"unicode\" collation. If not specified, the locale `\"en\"` is used as an invariant
   for the sake of consistent sorting. Use `\"auto\"` to use the detected UI locale.
   
   This preference is ignored if {@link organizeImportsCollation } is not `\"unicode\"`.
   
   Default: `\"en\"`"
  ^js [user-preferences]
  (.-organizeImportsCollationLocale ^js user-preferences))

(defn organize-imports-numeric-collation?
  "Indicates whether numeric collation should be used for digit sequences in strings. When `true`, will collate
   strings such that `a1z < a2z < a100z`. When `false`, will collate strings such that `a1z < a100z < a2z`.
   
   This preference is ignored if {@link organizeImportsCollation } is not `\"unicode\"`.
   
   Default: `false`"
  ^js [user-preferences]
  (.-organizeImportsNumericCollation ^js user-preferences))

(defn organize-imports-accent-collation?
  "Indicates whether accents and other diacritic marks are considered unequal for the purpose of collation. When
   `true`, characters with accents and other diacritics will be collated in the order defined by the locale specified
   in {@link organizeImportsCollationLocale }.
   
   This preference is ignored if {@link organizeImportsCollation } is not `\"unicode\"`.
   
   Default: `true`"
  ^js [user-preferences]
  (.-organizeImportsAccentCollation ^js user-preferences))

(defn organize-imports-case-first
  "Indicates whether upper case or lower case should sort first. When `false`, the default order for the locale
   specified in {@link organizeImportsCollationLocale } is used.
   
   This preference is ignored if {@link organizeImportsCollation } is not `\"unicode\"`. This preference is also
   ignored if we are using case-insensitive sorting, which occurs when {@link organizeImportsIgnoreCase } is `true`,
   or if {@link organizeImportsIgnoreCase } is `\"auto\"` and the auto-detected case sensitivity is determined to be
   case-insensitive.
   
   Default: `false`"
  ^js [user-preferences]
  (.-organizeImportsCaseFirst ^js user-preferences))

(defn organize-imports-type-order
  "Indicates where named type-only imports should sort. \"inline\" sorts named imports without regard to if the import is
   type-only.
   
   Default: `last`"
  ^js [user-preferences]
  (.-organizeImportsTypeOrder ^js user-preferences))

(defn disable-line-text-in-references?
  "Indicates whether {@link ReferencesResponseItem.lineText } is supported."
  ^js [user-preferences]
  (.-disableLineTextInReferences ^js user-preferences))

(defn exclude-library-symbols-in-nav-to?
  "Indicates whether to exclude standard library and node_modules file symbols from navTo results."
  ^js [user-preferences]
  (.-excludeLibrarySymbolsInNavTo ^js user-preferences))
