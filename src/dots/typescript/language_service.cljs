(ns dots.typescript.language-service)

(defn cleanup-semantic-cache
  "This is used as a part of restarting the language service.
   
   **Returns:** `void`"
  ^js [language-service]
  (.cleanupSemanticCache ^js language-service))

(defn syntactic-diagnostics
  "Gets errors indicating invalid syntax in a file.
   
   In English, \"this cdeo have, erorrs\" is syntactically invalid because it has typos,
   grammatical errors, and misplaced punctuation. Likewise, examples of syntax
   errors in TypeScript are missing parentheses in an `if` statement, mismatched
   curly braces, and using a reserved keyword as a variable name.
   
   These diagnostics are inexpensive to compute and don't require knowledge of
   other files. Note that a non-empty result increases the likelihood of false positives
   from `getSemanticDiagnostics`.
   
   While these represent the majority of syntax-related diagnostics, there are some
   that require the type system, which will be present in `getSemanticDiagnostics`.
   
   **Parameters:**
   - `file-name`: `string` - A path to the file you want syntactic diagnostics for
   
   **Returns:** `DiagnosticWithLocation[]`"
  ^js [language-service file-name]
  (.getSyntacticDiagnostics ^js language-service file-name))

(defn semantic-diagnostics
  "Gets warnings or errors indicating type system issues in a given file.
   Requesting semantic diagnostics may start up the type system and
   run deferred work, so the first call may take longer than subsequent calls.
   
   Unlike the other get*Diagnostics functions, these diagnostics can potentially not
   include a reference to a source file. Specifically, the first time this is called,
   it will return global diagnostics with no associated location.
   
   To contrast the differences between semantic and syntactic diagnostics, consider the
   sentence: \"The sun is green.\" is syntactically correct; those are real English words with
   correct sentence structure. However, it is semantically invalid, because it is not true.
   
   **Parameters:**
   - `file-name`: `string` - A path to the file you want semantic diagnostics for
   
   **Returns:** `Diagnostic[]`"
  ^js [language-service file-name]
  (.getSemanticDiagnostics ^js language-service file-name))

(defn suggestion-diagnostics
  "Gets suggestion diagnostics for a specific file. These diagnostics tend to
   proactively suggest refactors, as opposed to diagnostics that indicate
   potentially incorrect runtime behavior.
   
   **Parameters:**
   - `file-name`: `string` - A path to the file you want semantic diagnostics for
   
   **Returns:** `DiagnosticWithLocation[]`"
  ^js [language-service file-name]
  (.getSuggestionDiagnostics ^js language-service file-name))

(defn compiler-options-diagnostics
  "Gets global diagnostics related to the program configuration and compiler options.
   
   **Returns:** `Diagnostic[]`"
  ^js [language-service]
  (.getCompilerOptionsDiagnostics ^js language-service))

(defn syntactic-classifications
  "**Parameters:**
   - `file-name`: `string`
   - `span`: `TextSpan`
   - `format`: `SemanticClassificationFormat`
   
   **Returns:** `ClassifiedSpan[] | ClassifiedSpan2020[]`"
  (^js [language-service file-name span]
   (.getSyntacticClassifications ^js language-service file-name span))
  (^js [language-service file-name span format]
   (.getSyntacticClassifications ^js language-service file-name span format)))

(defn semantic-classifications
  "**Parameters:**
   - `file-name`: `string`
   - `span`: `TextSpan`
   - `format`: `SemanticClassificationFormat`
   
   **Returns:** `ClassifiedSpan[] | ClassifiedSpan2020[]`"
  (^js [language-service file-name span]
   (.getSemanticClassifications ^js language-service file-name span))
  (^js [language-service file-name span format]
   (.getSemanticClassifications ^js language-service file-name span format)))

(defn encoded-syntactic-classifications
  "Encoded as triples of [start, length, ClassificationType].
   
   **Parameters:**
   - `file-name`: `string`
   - `span`: `TextSpan`
   
   **Returns:** `Classifications`"
  ^js [language-service file-name span]
  (.getEncodedSyntacticClassifications ^js language-service file-name span))

(defn encoded-semantic-classifications
  "Gets semantic highlights information for a particular file. Has two formats, an older
   version used by VS and a format used by VS Code.
   
   **Parameters:**
   - `file-name`: `string` - The path to the file
   - `span`: `TextSpan`
   - `format`: `SemanticClassificationFormat | undefined` - Which format to use, defaults to \"original\"
   
   **Returns:** `Classifications` - a number array encoded as triples of [start, length, ClassificationType, ...]."
  (^js [language-service file-name span]
   (.getEncodedSemanticClassifications ^js language-service file-name span))
  (^js [language-service file-name span format]
   (.getEncodedSemanticClassifications ^js language-service file-name span format)))

(defn completions-at-position
  "Gets completion entries at a particular position in a file.
   
   **Parameters:**
   - `file-name`: `string` - The path to the file
   - `position`: `number` - A zero-based index of the character where you want the entries
   - `options`: `GetCompletionsAtPositionOptions | undefined` - An object describing how the request was triggered and what kinds
   of code actions can be returned with the completions.
   - `formatting-settings`: `FormatCodeSettings | undefined` - settings needed for calling formatting functions.
   
   **Returns:** `WithMetadata<CompletionInfo> | undefined`"
  (^js [language-service file-name position]
   (.getCompletionsAtPosition ^js language-service file-name position))
  (^js [language-service file-name position options]
   (.getCompletionsAtPosition ^js language-service file-name position options))
  (^js [language-service file-name position options formatting-settings]
   (.getCompletionsAtPosition ^js language-service file-name position options formatting-settings)))

(defn completion-entry-details
  "Gets the extended details for a completion entry retrieved from `getCompletionsAtPosition`.
   
   **Parameters:**
   - `file-name`: `string` - The path to the file
   - `position`: `number` - A zero based index of the character where you want the entries
   - `entry-name`: `string` - The `name` from an existing completion which came from `getCompletionsAtPosition`
   - `format-options`: `FormatCodeSettings | FormatCodeOptions | undefined` - How should code samples in the completions be formatted, can be undefined for backwards compatibility
   - `source`: `string | undefined` - `source` property from the completion entry
   - `preferences`: `UserPreferences | undefined` - User settings, can be undefined for backwards compatibility
   - `data`: `CompletionEntryData | undefined` - `data` property from the completion entry
   
   **Returns:** `CompletionEntryDetails | undefined`"
  (^js [language-service file-name position entry-name]
   (.getCompletionEntryDetails ^js language-service file-name position entry-name))
  (^js [language-service file-name position entry-name format-options]
   (.getCompletionEntryDetails ^js language-service file-name position entry-name format-options))
  (^js [language-service file-name position entry-name format-options source]
   (.getCompletionEntryDetails ^js language-service file-name position entry-name format-options source))
  (^js [language-service file-name position entry-name format-options source preferences]
   (.getCompletionEntryDetails ^js language-service file-name position entry-name format-options source preferences))
  (^js [language-service file-name position entry-name format-options source preferences data]
   (.getCompletionEntryDetails ^js language-service file-name position entry-name format-options source preferences data)))

(defn completion-entry-symbol
  "**Parameters:**
   - `file-name`: `string`
   - `position`: `number`
   - `name`: `string`
   - `source`: `string | undefined`
   
   **Returns:** `Symbol | undefined`"
  (^js [language-service file-name position name]
   (.getCompletionEntrySymbol ^js language-service file-name position name))
  (^js [language-service file-name position name source]
   (.getCompletionEntrySymbol ^js language-service file-name position name source)))

(defn quick-info-at-position
  "Gets semantic information about the identifier at a particular position in a
   file. Quick info is what you typically see when you hover in an editor.
   
   **Parameters:**
   - `file-name`: `string` - The path to the file
   - `position`: `number` - A zero-based index of the character where you want the quick info
   
   **Returns:** `QuickInfo | undefined`"
  ^js [language-service file-name position]
  (.getQuickInfoAtPosition ^js language-service file-name position))

(defn name-or-dotted-name-span
  "**Parameters:**
   - `file-name`: `string`
   - `start-pos`: `number`
   - `end-pos`: `number`
   
   **Returns:** `TextSpan | undefined`"
  ^js [language-service file-name start-pos end-pos]
  (.getNameOrDottedNameSpan ^js language-service file-name start-pos end-pos))

(defn breakpoint-statement-at-position
  "**Parameters:**
   - `file-name`: `string`
   - `position`: `number`
   
   **Returns:** `TextSpan | undefined`"
  ^js [language-service file-name position]
  (.getBreakpointStatementAtPosition ^js language-service file-name position))

(defn signature-help-items
  "**Parameters:**
   - `file-name`: `string`
   - `position`: `number`
   - `options`: `SignatureHelpItemsOptions | undefined`
   
   **Returns:** `SignatureHelpItems | undefined`"
  (^js [language-service file-name position]
   (.getSignatureHelpItems ^js language-service file-name position))
  (^js [language-service file-name position options]
   (.getSignatureHelpItems ^js language-service file-name position options)))

(defn rename-info
  "**Parameters:**
   - `file-name`: `string`
   - `position`: `number`
   - `options`: `RenameInfoOptions | undefined`
   - `preferences`: `UserPreferences`
   
   **Returns:** `RenameInfo`"
  {:arglists '([language-service file-name position]
               [language-service file-name position options]
               [language-service file-name position preferences])}
  (^js [language-service file-name position]
   (.getRenameInfo ^js language-service file-name position))
  (^js [a b c d]
   (.getRenameInfo ^js a b c d)))

(defn find-rename-locations
  "**Parameters:**
   - `file-name`: `string`
   - `position`: `number`
   - `find-in-strings?`: `boolean`
   - `find-in-comments?`: `boolean`
   - `preferences`: `UserPreferences`
   - `provide-prefix-and-suffix-text-for-rename?`: `boolean | undefined`
   
   **Returns:** `readonly RenameLocation[] | undefined`"
  {:arglists '([language-service file-name position find-in-strings? find-in-comments?]
               [language-service file-name position find-in-strings? find-in-comments? preferences]
               [language-service file-name position find-in-strings? find-in-comments? provide-prefix-and-suffix-text-for-rename?])}
  (^js [language-service file-name position find-in-strings? find-in-comments?]
   (.findRenameLocations ^js language-service file-name position find-in-strings? find-in-comments?))
  (^js [a b c d e f]
   (.findRenameLocations ^js a b c d e f)))

(defn smart-selection-range
  "**Parameters:**
   - `file-name`: `string`
   - `position`: `number`
   
   **Returns:** `SelectionRange`"
  ^js [language-service file-name position]
  (.getSmartSelectionRange ^js language-service file-name position))

(defn definition-at-position
  "**Parameters:**
   - `file-name`: `string`
   - `position`: `number`
   
   **Returns:** `readonly DefinitionInfo[] | undefined`"
  ^js [language-service file-name position]
  (.getDefinitionAtPosition ^js language-service file-name position))

(defn definition-and-bound-span
  "**Parameters:**
   - `file-name`: `string`
   - `position`: `number`
   
   **Returns:** `DefinitionInfoAndBoundSpan | undefined`"
  ^js [language-service file-name position]
  (.getDefinitionAndBoundSpan ^js language-service file-name position))

(defn type-definition-at-position
  "**Parameters:**
   - `file-name`: `string`
   - `position`: `number`
   
   **Returns:** `readonly DefinitionInfo[] | undefined`"
  ^js [language-service file-name position]
  (.getTypeDefinitionAtPosition ^js language-service file-name position))

(defn implementation-at-position
  "**Parameters:**
   - `file-name`: `string`
   - `position`: `number`
   
   **Returns:** `readonly ImplementationLocation[] | undefined`"
  ^js [language-service file-name position]
  (.getImplementationAtPosition ^js language-service file-name position))

(defn references-at-position
  "**Parameters:**
   - `file-name`: `string`
   - `position`: `number`
   
   **Returns:** `ReferenceEntry[] | undefined`"
  ^js [language-service file-name position]
  (.getReferencesAtPosition ^js language-service file-name position))

(defn find-references
  "**Parameters:**
   - `file-name`: `string`
   - `position`: `number`
   
   **Returns:** `ReferencedSymbol[] | undefined`"
  ^js [language-service file-name position]
  (.findReferences ^js language-service file-name position))

(defn document-highlights
  "**Parameters:**
   - `file-name`: `string`
   - `position`: `number`
   - `files-to-search`: `string[]`
   
   **Returns:** `DocumentHighlights[] | undefined`"
  ^js [language-service file-name position files-to-search]
  (.getDocumentHighlights ^js language-service file-name position files-to-search))

(defn file-references
  "**Parameters:**
   - `file-name`: `string`
   
   **Returns:** `ReferenceEntry[]`"
  ^js [language-service file-name]
  (.getFileReferences ^js language-service file-name))

(defn navigate-to-items
  "**Parameters:**
   - `search-value`: `string`
   - `max-result-count`: `number | undefined`
   - `file-name`: `string | undefined`
   - `exclude-dts-files?`: `boolean | undefined`
   - `exclude-lib-files?`: `boolean | undefined`
   
   **Returns:** `NavigateToItem[]`"
  (^js [language-service search-value]
   (.getNavigateToItems ^js language-service search-value))
  (^js [language-service search-value max-result-count]
   (.getNavigateToItems ^js language-service search-value max-result-count))
  (^js [language-service search-value max-result-count file-name]
   (.getNavigateToItems ^js language-service search-value max-result-count file-name))
  (^js [language-service search-value max-result-count file-name exclude-dts-files?]
   (.getNavigateToItems ^js language-service search-value max-result-count file-name exclude-dts-files?))
  (^js [language-service search-value max-result-count file-name exclude-dts-files? exclude-lib-files?]
   (.getNavigateToItems ^js language-service search-value max-result-count file-name exclude-dts-files? exclude-lib-files?)))

(defn navigation-bar-items
  "**Parameters:**
   - `file-name`: `string`
   
   **Returns:** `NavigationBarItem[]`"
  ^js [language-service file-name]
  (.getNavigationBarItems ^js language-service file-name))

(defn navigation-tree
  "**Parameters:**
   - `file-name`: `string`
   
   **Returns:** `NavigationTree`"
  ^js [language-service file-name]
  (.getNavigationTree ^js language-service file-name))

(defn prepare-call-hierarchy
  "**Parameters:**
   - `file-name`: `string`
   - `position`: `number`
   
   **Returns:** `CallHierarchyItem | CallHierarchyItem[] | undefined`"
  ^js [language-service file-name position]
  (.prepareCallHierarchy ^js language-service file-name position))

(defn provide-call-hierarchy-incoming-calls
  "**Parameters:**
   - `file-name`: `string`
   - `position`: `number`
   
   **Returns:** `CallHierarchyIncomingCall[]`"
  ^js [language-service file-name position]
  (.provideCallHierarchyIncomingCalls ^js language-service file-name position))

(defn provide-call-hierarchy-outgoing-calls
  "**Parameters:**
   - `file-name`: `string`
   - `position`: `number`
   
   **Returns:** `CallHierarchyOutgoingCall[]`"
  ^js [language-service file-name position]
  (.provideCallHierarchyOutgoingCalls ^js language-service file-name position))

(defn provide-inlay-hints
  "**Parameters:**
   - `file-name`: `string`
   - `span`: `TextSpan`
   - `preferences`: `UserPreferences | undefined`
   
   **Returns:** `InlayHint[]`"
  (^js [language-service file-name span]
   (.provideInlayHints ^js language-service file-name span))
  (^js [language-service file-name span preferences]
   (.provideInlayHints ^js language-service file-name span preferences)))

(defn outlining-spans
  "**Parameters:**
   - `file-name`: `string`
   
   **Returns:** `OutliningSpan[]`"
  ^js [language-service file-name]
  (.getOutliningSpans ^js language-service file-name))

(defn todo-comments
  "**Parameters:**
   - `file-name`: `string`
   - `descriptors`: `TodoCommentDescriptor[]`
   
   **Returns:** `TodoComment[]`"
  ^js [language-service file-name descriptors]
  (.getTodoComments ^js language-service file-name descriptors))

(defn brace-matching-at-position
  "**Parameters:**
   - `file-name`: `string`
   - `position`: `number`
   
   **Returns:** `TextSpan[]`"
  ^js [language-service file-name position]
  (.getBraceMatchingAtPosition ^js language-service file-name position))

(defn indentation-at-position
  "**Parameters:**
   - `file-name`: `string`
   - `position`: `number`
   - `options`: `EditorSettings | EditorOptions`
   
   **Returns:** `number`"
  ^js [language-service file-name position options]
  (.getIndentationAtPosition ^js language-service file-name position options))

(defn formatting-edits-for-range
  "**Parameters:**
   - `file-name`: `string`
   - `start`: `number`
   - `end`: `number`
   - `options`: `FormatCodeSettings | FormatCodeOptions`
   
   **Returns:** `TextChange[]`"
  ^js [language-service file-name start end options]
  (.getFormattingEditsForRange ^js language-service file-name start end options))

(defn formatting-edits-for-document
  "**Parameters:**
   - `file-name`: `string`
   - `options`: `FormatCodeSettings | FormatCodeOptions`
   
   **Returns:** `TextChange[]`"
  ^js [language-service file-name options]
  (.getFormattingEditsForDocument ^js language-service file-name options))

(defn formatting-edits-after-keystroke
  "**Parameters:**
   - `file-name`: `string`
   - `position`: `number`
   - `key`: `string`
   - `options`: `FormatCodeSettings | FormatCodeOptions`
   
   **Returns:** `TextChange[]`"
  ^js [language-service file-name position key options]
  (.getFormattingEditsAfterKeystroke ^js language-service file-name position key options))

(defn doc-comment-template-at-position
  "**Parameters:**
   - `file-name`: `string`
   - `position`: `number`
   - `options`: `DocCommentTemplateOptions | undefined`
   - `format-options`: `FormatCodeSettings | undefined`
   
   **Returns:** `TextInsertion | undefined`"
  (^js [language-service file-name position]
   (.getDocCommentTemplateAtPosition ^js language-service file-name position))
  (^js [language-service file-name position options]
   (.getDocCommentTemplateAtPosition ^js language-service file-name position options))
  (^js [language-service file-name position options format-options]
   (.getDocCommentTemplateAtPosition ^js language-service file-name position options format-options)))

(defn valid-brace-completion-at-position?
  "**Parameters:**
   - `file-name`: `string`
   - `position`: `number`
   - `opening-brace`: `number`
   
   **Returns:** `boolean`"
  ^js [language-service file-name position opening-brace]
  (.isValidBraceCompletionAtPosition ^js language-service file-name position opening-brace))

(defn jsx-closing-tag-at-position
  "This will return a defined result if the position is after the `>` of the opening tag, or somewhere in the text, of a JSXElement with no closing tag.
   Editors should call this after `>` is typed.
   
   **Parameters:**
   - `file-name`: `string`
   - `position`: `number`
   
   **Returns:** `JsxClosingTagInfo | undefined`"
  ^js [language-service file-name position]
  (.getJsxClosingTagAtPosition ^js language-service file-name position))

(defn linked-editing-range-at-position
  "**Parameters:**
   - `file-name`: `string`
   - `position`: `number`
   
   **Returns:** `LinkedEditingInfo | undefined`"
  ^js [language-service file-name position]
  (.getLinkedEditingRangeAtPosition ^js language-service file-name position))

(defn span-of-enclosing-comment
  "**Parameters:**
   - `file-name`: `string`
   - `position`: `number`
   - `only-multi-line?`: `boolean`
   
   **Returns:** `TextSpan | undefined`"
  ^js [language-service file-name position only-multi-line?]
  (.getSpanOfEnclosingComment ^js language-service file-name position only-multi-line?))

(defn to-line-column-offset
  "**Parameters:**
   - `file-name`: `string`
   - `position`: `number`
   
   **Returns:** `LineAndCharacter`"
  ^js [language-service file-name position]
  (.toLineColumnOffset ^js language-service file-name position))

(defn code-fixes-at-position
  "**Parameters:**
   - `file-name`: `string`
   - `start`: `number`
   - `end`: `number`
   - `error-codes`: `readonly number[]`
   - `format-options`: `FormatCodeSettings`
   - `preferences`: `UserPreferences`
   
   **Returns:** `readonly CodeFixAction[]`"
  ^js [language-service file-name start end error-codes format-options preferences]
  (.getCodeFixesAtPosition ^js language-service file-name start end error-codes format-options preferences))

(defn combined-code-fix
  "**Parameters:**
   - `scope`: `CombinedCodeFixScope`
   - `fix-id`: `{}`
   - `format-options`: `FormatCodeSettings`
   - `preferences`: `UserPreferences`
   
   **Returns:** `CombinedCodeActions`"
  ^js [language-service scope fix-id format-options preferences]
  (.getCombinedCodeFix ^js language-service scope fix-id format-options preferences))

(defn apply-code-action-command
  "**Parameters:**
   - `file-name`: `string`
   - `action`: `InstallPackageAction | InstallPackageAction[]`
   - `format-settings`: `FormatCodeSettings | undefined`
   
   **Returns:** `Promise<ApplyCodeActionCommandResult | ApplyCodeActionCommandResult[]>`"
  {:arglists '([language-service action]
               [language-service action format-settings]
               [language-service file-name action])}
  (^js [language-service action]
   (.applyCodeActionCommand ^js language-service action))
  (^js [a b c]
   (.applyCodeActionCommand ^js a b c)))

(defn applicable-refactors
  "**Parameters:**
   - `file-name`: `string`
   - `position-or-range`: `number | TextRange`
   - `preferences`: `UserPreferences | undefined`
   - `trigger-reason`: `RefactorTriggerReason | undefined`
   - `kind`: `string | undefined`
   - `include-interactive-actions?`: `boolean | undefined` - Include refactor actions that require additional arguments to be
   passed when calling `getEditsForRefactor`. When true, clients should inspect the `isInteractive`
   property of each returned `RefactorActionInfo` and ensure they are able to collect the appropriate
   arguments for any interactive action before offering it.
   
   **Returns:** `ApplicableRefactorInfo[]`"
  (^js [language-service file-name position-or-range]
   (.getApplicableRefactors ^js language-service file-name position-or-range))
  (^js [language-service file-name position-or-range preferences]
   (.getApplicableRefactors ^js language-service file-name position-or-range preferences))
  (^js [language-service file-name position-or-range preferences trigger-reason]
   (.getApplicableRefactors ^js language-service file-name position-or-range preferences trigger-reason))
  (^js [language-service file-name position-or-range preferences trigger-reason kind]
   (.getApplicableRefactors ^js language-service file-name position-or-range preferences trigger-reason kind))
  (^js [language-service file-name position-or-range preferences trigger-reason kind include-interactive-actions?]
   (.getApplicableRefactors ^js language-service file-name position-or-range preferences trigger-reason kind include-interactive-actions?)))

(defn edits-for-refactor
  "**Parameters:**
   - `file-name`: `string`
   - `format-options`: `FormatCodeSettings`
   - `position-or-range`: `number | TextRange`
   - `refactor-name`: `string`
   - `action-name`: `string`
   - `preferences`: `UserPreferences | undefined`
   - `interactive-refactor-arguments`: `InteractiveRefactorArguments | undefined`
   
   **Returns:** `RefactorEditInfo | undefined`"
  (^js [language-service file-name format-options position-or-range refactor-name action-name]
   (.getEditsForRefactor ^js language-service file-name format-options position-or-range refactor-name action-name))
  (^js [language-service file-name format-options position-or-range refactor-name action-name preferences]
   (.getEditsForRefactor ^js language-service file-name format-options position-or-range refactor-name action-name preferences))
  (^js [language-service file-name format-options position-or-range refactor-name action-name preferences interactive-refactor-arguments]
   (.getEditsForRefactor ^js language-service file-name format-options position-or-range refactor-name action-name preferences interactive-refactor-arguments)))

(defn move-to-refactoring-file-suggestions
  "**Parameters:**
   - `file-name`: `string`
   - `position-or-range`: `number | TextRange`
   - `preferences`: `UserPreferences | undefined`
   - `trigger-reason`: `RefactorTriggerReason | undefined`
   - `kind`: `string | undefined`
   
   **Returns:** `{ newFileName: string; files: string[]; }`"
  (^js [language-service file-name position-or-range]
   (.getMoveToRefactoringFileSuggestions ^js language-service file-name position-or-range))
  (^js [language-service file-name position-or-range preferences]
   (.getMoveToRefactoringFileSuggestions ^js language-service file-name position-or-range preferences))
  (^js [language-service file-name position-or-range preferences trigger-reason]
   (.getMoveToRefactoringFileSuggestions ^js language-service file-name position-or-range preferences trigger-reason))
  (^js [language-service file-name position-or-range preferences trigger-reason kind]
   (.getMoveToRefactoringFileSuggestions ^js language-service file-name position-or-range preferences trigger-reason kind)))

(defn organize-imports
  "**Parameters:**
   - `args`: `OrganizeImportsArgs`
   - `format-options`: `FormatCodeSettings`
   - `preferences`: `UserPreferences | undefined`
   
   **Returns:** `readonly FileTextChanges[]`"
  (^js [language-service args format-options]
   (.organizeImports ^js language-service args format-options))
  (^js [language-service args format-options preferences]
   (.organizeImports ^js language-service args format-options preferences)))

(defn edits-for-file-rename
  "**Parameters:**
   - `old-file-path`: `string`
   - `new-file-path`: `string`
   - `format-options`: `FormatCodeSettings`
   - `preferences`: `UserPreferences | undefined`
   
   **Returns:** `readonly FileTextChanges[]`"
  (^js [language-service old-file-path new-file-path format-options]
   (.getEditsForFileRename ^js language-service old-file-path new-file-path format-options))
  (^js [language-service old-file-path new-file-path format-options preferences]
   (.getEditsForFileRename ^js language-service old-file-path new-file-path format-options preferences)))

(defn emit-output
  "**Parameters:**
   - `file-name`: `string`
   - `emit-only-dts-files?`: `boolean | undefined`
   - `force-dts-emit?`: `boolean | undefined`
   
   **Returns:** `EmitOutput`"
  (^js [language-service file-name]
   (.getEmitOutput ^js language-service file-name))
  (^js [language-service file-name emit-only-dts-files?]
   (.getEmitOutput ^js language-service file-name emit-only-dts-files?))
  (^js [language-service file-name emit-only-dts-files? force-dts-emit?]
   (.getEmitOutput ^js language-service file-name emit-only-dts-files? force-dts-emit?)))

(defn program
  "**Returns:** `Program | undefined`"
  ^js [language-service]
  (.getProgram ^js language-service))

(defn toggle-line-comment
  "**Parameters:**
   - `file-name`: `string`
   - `text-range`: `TextRange`
   
   **Returns:** `TextChange[]`"
  ^js [language-service file-name text-range]
  (.toggleLineComment ^js language-service file-name text-range))

(defn toggle-multiline-comment
  "**Parameters:**
   - `file-name`: `string`
   - `text-range`: `TextRange`
   
   **Returns:** `TextChange[]`"
  ^js [language-service file-name text-range]
  (.toggleMultilineComment ^js language-service file-name text-range))

(defn comment-selection
  "**Parameters:**
   - `file-name`: `string`
   - `text-range`: `TextRange`
   
   **Returns:** `TextChange[]`"
  ^js [language-service file-name text-range]
  (.commentSelection ^js language-service file-name text-range))

(defn uncomment-selection
  "**Parameters:**
   - `file-name`: `string`
   - `text-range`: `TextRange`
   
   **Returns:** `TextChange[]`"
  ^js [language-service file-name text-range]
  (.uncommentSelection ^js language-service file-name text-range))

(defn supported-code-fixes
  "**Parameters:**
   - `file-name`: `string | undefined`
   
   **Returns:** `readonly string[]`"
  (^js [language-service]
   (.getSupportedCodeFixes ^js language-service))
  (^js [language-service file-name]
   (.getSupportedCodeFixes ^js language-service file-name)))

(defn dispose
  "**Returns:** `void`"
  ^js [language-service]
  (.dispose ^js language-service))
