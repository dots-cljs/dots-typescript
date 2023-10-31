(ns dots.typescript.language-service)

(defn cleanup-semantic-cache
  "This is used as a part of restarting the language service."
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
   that require the type system, which will be present in `getSemanticDiagnostics`."
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
   correct sentence structure. However, it is semantically invalid, because it is not true."
  ^js [language-service file-name]
  (.getSemanticDiagnostics ^js language-service file-name))

(defn suggestion-diagnostics
  "Gets suggestion diagnostics for a specific file. These diagnostics tend to
   proactively suggest refactors, as opposed to diagnostics that indicate
   potentially incorrect runtime behavior."
  ^js [language-service file-name]
  (.getSuggestionDiagnostics ^js language-service file-name))

(defn compiler-options-diagnostics
  "Gets global diagnostics related to the program configuration and compiler options."
  ^js [language-service]
  (.getCompilerOptionsDiagnostics ^js language-service))

(defn syntactic-classifications
  (^js [language-service file-name span]
   (.getSyntacticClassifications ^js language-service file-name span))
  (^js [language-service file-name span format]
   (.getSyntacticClassifications ^js language-service file-name span format)))

(defn semantic-classifications
  (^js [language-service file-name span]
   (.getSemanticClassifications ^js language-service file-name span))
  (^js [language-service file-name span format]
   (.getSemanticClassifications ^js language-service file-name span format)))

(defn encoded-syntactic-classifications
  "Encoded as triples of [start, length, ClassificationType]."
  ^js [language-service file-name span]
  (.getEncodedSyntacticClassifications ^js language-service file-name span))

(defn encoded-semantic-classifications
  "Gets semantic highlights information for a particular file. Has two formats, an older
   version used by VS and a format used by VS Code."
  (^js [language-service file-name span]
   (.getEncodedSemanticClassifications ^js language-service file-name span))
  (^js [language-service file-name span format]
   (.getEncodedSemanticClassifications ^js language-service file-name span format)))

(defn completions-at-position
  "Gets completion entries at a particular position in a file."
  (^js [language-service file-name position]
   (.getCompletionsAtPosition ^js language-service file-name position))
  (^js [language-service file-name position options]
   (.getCompletionsAtPosition ^js language-service file-name position options))
  (^js [language-service file-name position options formatting-settings]
   (.getCompletionsAtPosition ^js language-service file-name position options formatting-settings)))

(defn completion-entry-details
  "Gets the extended details for a completion entry retrieved from `getCompletionsAtPosition`."
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
  (^js [language-service file-name position name]
   (.getCompletionEntrySymbol ^js language-service file-name position name))
  (^js [language-service file-name position name source]
   (.getCompletionEntrySymbol ^js language-service file-name position name source)))

(defn quick-info-at-position
  "Gets semantic information about the identifier at a particular position in a
   file. Quick info is what you typically see when you hover in an editor."
  ^js [language-service file-name position]
  (.getQuickInfoAtPosition ^js language-service file-name position))

(defn name-or-dotted-name-span
  ^js [language-service file-name start-pos end-pos]
  (.getNameOrDottedNameSpan ^js language-service file-name start-pos end-pos))

(defn breakpoint-statement-at-position
  ^js [language-service file-name position]
  (.getBreakpointStatementAtPosition ^js language-service file-name position))

(defn signature-help-items
  (^js [language-service file-name position]
   (.getSignatureHelpItems ^js language-service file-name position))
  (^js [language-service file-name position options]
   (.getSignatureHelpItems ^js language-service file-name position options)))

(defn rename-info
  {:arglists '([language-service file-name position]
               [language-service file-name position options]
               [language-service file-name position preferences])}
  (^js [language-service file-name position]
   (.getRenameInfo ^js language-service file-name position))
  (^js [a b c d]
   (.getRenameInfo ^js a b c d)))

(defn find-rename-locations
  (^js [language-service file-name position find-in-strings? find-in-comments?]
   (.findRenameLocations ^js language-service file-name position find-in-strings? find-in-comments?))
  (^js [language-service file-name position find-in-strings? find-in-comments? provide-prefix-and-suffix-text-for-rename?]
   (.findRenameLocations ^js language-service file-name position find-in-strings? find-in-comments? provide-prefix-and-suffix-text-for-rename?)))

(defn smart-selection-range
  ^js [language-service file-name position]
  (.getSmartSelectionRange ^js language-service file-name position))

(defn definition-at-position
  ^js [language-service file-name position]
  (.getDefinitionAtPosition ^js language-service file-name position))

(defn definition-and-bound-span
  ^js [language-service file-name position]
  (.getDefinitionAndBoundSpan ^js language-service file-name position))

(defn type-definition-at-position
  ^js [language-service file-name position]
  (.getTypeDefinitionAtPosition ^js language-service file-name position))

(defn implementation-at-position
  ^js [language-service file-name position]
  (.getImplementationAtPosition ^js language-service file-name position))

(defn references-at-position
  ^js [language-service file-name position]
  (.getReferencesAtPosition ^js language-service file-name position))

(defn find-references
  ^js [language-service file-name position]
  (.findReferences ^js language-service file-name position))

(defn document-highlights
  ^js [language-service file-name position files-to-search]
  (.getDocumentHighlights ^js language-service file-name position files-to-search))

(defn file-references
  ^js [language-service file-name]
  (.getFileReferences ^js language-service file-name))

(defn occurrences-at-position
  ^js [language-service file-name position]
  (.getOccurrencesAtPosition ^js language-service file-name position))

(defn navigate-to-items
  (^js [language-service search-value]
   (.getNavigateToItems ^js language-service search-value))
  (^js [language-service search-value max-result-count]
   (.getNavigateToItems ^js language-service search-value max-result-count))
  (^js [language-service search-value max-result-count file-name]
   (.getNavigateToItems ^js language-service search-value max-result-count file-name))
  (^js [language-service search-value max-result-count file-name exclude-dts-files?]
   (.getNavigateToItems ^js language-service search-value max-result-count file-name exclude-dts-files?)))

(defn navigation-bar-items
  ^js [language-service file-name]
  (.getNavigationBarItems ^js language-service file-name))

(defn navigation-tree
  ^js [language-service file-name]
  (.getNavigationTree ^js language-service file-name))

(defn prepare-call-hierarchy
  ^js [language-service file-name position]
  (.prepareCallHierarchy ^js language-service file-name position))

(defn provide-call-hierarchy-incoming-calls
  ^js [language-service file-name position]
  (.provideCallHierarchyIncomingCalls ^js language-service file-name position))

(defn provide-call-hierarchy-outgoing-calls
  ^js [language-service file-name position]
  (.provideCallHierarchyOutgoingCalls ^js language-service file-name position))

(defn provide-inlay-hints
  (^js [language-service file-name span]
   (.provideInlayHints ^js language-service file-name span))
  (^js [language-service file-name span preferences]
   (.provideInlayHints ^js language-service file-name span preferences)))

(defn outlining-spans
  ^js [language-service file-name]
  (.getOutliningSpans ^js language-service file-name))

(defn todo-comments
  ^js [language-service file-name descriptors]
  (.getTodoComments ^js language-service file-name descriptors))

(defn brace-matching-at-position
  ^js [language-service file-name position]
  (.getBraceMatchingAtPosition ^js language-service file-name position))

(defn indentation-at-position
  ^js [language-service file-name position options]
  (.getIndentationAtPosition ^js language-service file-name position options))

(defn formatting-edits-for-range
  ^js [language-service file-name start end options]
  (.getFormattingEditsForRange ^js language-service file-name start end options))

(defn formatting-edits-for-document
  ^js [language-service file-name options]
  (.getFormattingEditsForDocument ^js language-service file-name options))

(defn formatting-edits-after-keystroke
  ^js [language-service file-name position key options]
  (.getFormattingEditsAfterKeystroke ^js language-service file-name position key options))

(defn doc-comment-template-at-position
  (^js [language-service file-name position]
   (.getDocCommentTemplateAtPosition ^js language-service file-name position))
  (^js [language-service file-name position options]
   (.getDocCommentTemplateAtPosition ^js language-service file-name position options)))

(defn valid-brace-completion-at-position?
  ^js [language-service file-name position opening-brace]
  (.isValidBraceCompletionAtPosition ^js language-service file-name position opening-brace))

(defn jsx-closing-tag-at-position
  "This will return a defined result if the position is after the `>` of the opening tag, or somewhere in the text, of a JSXElement with no closing tag.
   Editors should call this after `>` is typed."
  ^js [language-service file-name position]
  (.getJsxClosingTagAtPosition ^js language-service file-name position))

(defn span-of-enclosing-comment
  ^js [language-service file-name position only-multi-line?]
  (.getSpanOfEnclosingComment ^js language-service file-name position only-multi-line?))

(defn to-line-column-offset
  ^js [language-service file-name position]
  (.toLineColumnOffset ^js language-service file-name position))

(defn code-fixes-at-position
  ^js [language-service file-name start end error-codes format-options preferences]
  (.getCodeFixesAtPosition ^js language-service file-name start end error-codes format-options preferences))

(defn combined-code-fix
  ^js [language-service scope fix-id format-options preferences]
  (.getCombinedCodeFix ^js language-service scope fix-id format-options preferences))

(defn apply-code-action-command
  {:arglists '([language-service action]
               [language-service action format-settings]
               [language-service file-name action])}
  (^js [language-service action]
   (.applyCodeActionCommand ^js language-service action))
  (^js [a b c]
   (.applyCodeActionCommand ^js a b c)))

(defn applicable-refactors
  (^js [language-service file-name position-or-range]
   (.getApplicableRefactors ^js language-service file-name position-or-range))
  (^js [language-service file-name position-or-range preferences]
   (.getApplicableRefactors ^js language-service file-name position-or-range preferences))
  (^js [language-service file-name position-or-range preferences trigger-reason]
   (.getApplicableRefactors ^js language-service file-name position-or-range preferences trigger-reason))
  (^js [language-service file-name position-or-range preferences trigger-reason kind]
   (.getApplicableRefactors ^js language-service file-name position-or-range preferences trigger-reason kind)))

(defn edits-for-refactor
  (^js [language-service file-name format-options position-or-range refactor-name action-name]
   (.getEditsForRefactor ^js language-service file-name format-options position-or-range refactor-name action-name))
  (^js [language-service file-name format-options position-or-range refactor-name action-name preferences]
   (.getEditsForRefactor ^js language-service file-name format-options position-or-range refactor-name action-name preferences)))

(defn organize-imports
  (^js [language-service args format-options]
   (.organizeImports ^js language-service args format-options))
  (^js [language-service args format-options preferences]
   (.organizeImports ^js language-service args format-options preferences)))

(defn edits-for-file-rename
  (^js [language-service old-file-path new-file-path format-options]
   (.getEditsForFileRename ^js language-service old-file-path new-file-path format-options))
  (^js [language-service old-file-path new-file-path format-options preferences]
   (.getEditsForFileRename ^js language-service old-file-path new-file-path format-options preferences)))

(defn emit-output
  (^js [language-service file-name]
   (.getEmitOutput ^js language-service file-name))
  (^js [language-service file-name emit-only-dts-files?]
   (.getEmitOutput ^js language-service file-name emit-only-dts-files?))
  (^js [language-service file-name emit-only-dts-files? force-dts-emit?]
   (.getEmitOutput ^js language-service file-name emit-only-dts-files? force-dts-emit?)))

(defn program
  ^js [language-service]
  (.getProgram ^js language-service))

(defn toggle-line-comment
  ^js [language-service file-name text-range]
  (.toggleLineComment ^js language-service file-name text-range))

(defn toggle-multiline-comment
  ^js [language-service file-name text-range]
  (.toggleMultilineComment ^js language-service file-name text-range))

(defn comment-selection
  ^js [language-service file-name text-range]
  (.commentSelection ^js language-service file-name text-range))

(defn uncomment-selection
  ^js [language-service file-name text-range]
  (.uncommentSelection ^js language-service file-name text-range))

(defn dispose
  ^js [language-service]
  (.dispose ^js language-service))
