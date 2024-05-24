(ns dots.typescript.server.session
  (:refer-clojure :exclude [range]))

(defn gc-timer
  ^js [session]
  (.-gcTimer ^js session))

(defn project-service
  ^js [session]
  (.-projectService ^js session))

(defn set-project-service!
  ^js [session value]
  (set! (.-projectService ^js session) value))

(defn change-seq
  ^js [session]
  (.-changeSeq ^js session))

(defn set-change-seq!
  ^js [session value]
  (set! (.-changeSeq ^js session) value))

(defn performance-data
  ^js [session]
  (.-performanceData ^js session))

(defn set-performance-data!
  ^js [session value]
  (set! (.-performanceData ^js session) value))

(defn current-request-id
  ^js [session]
  (.-currentRequestId ^js session))

(defn set-current-request-id!
  ^js [session value]
  (set! (.-currentRequestId ^js session) value))

(defn error-check
  ^js [session]
  (.-errorCheck ^js session))

(defn set-error-check!
  ^js [session value]
  (set! (.-errorCheck ^js session) value))

(defn host
  ^js [session]
  (.-host ^js session))

(defn set-host!
  ^js [session value]
  (set! (.-host ^js session) value))

(defn cancellation-token
  ^js [session]
  (.-cancellationToken ^js session))

(defn typings-installer
  ^js [session]
  (.-typingsInstaller ^js session))

(defn byte-length
  ^js [session]
  (.-byteLength ^js session))

(defn set-byte-length!
  ^js [session value]
  (set! (.-byteLength ^js session) value))

(defn hrtime
  ^js [session]
  (.-hrtime ^js session))

(defn set-hrtime!
  ^js [session value]
  (set! (.-hrtime ^js session) value))

(defn logger
  ^js [session]
  (.-logger ^js session))

(defn set-logger!
  ^js [session value]
  (set! (.-logger ^js session) value))

(defn can-use-events?
  ^js [session]
  (.-canUseEvents ^js session))

(defn set-can-use-events!
  ^js [session value]
  (set! (.-canUseEvents ^js session) value))

(defn suppress-diagnostic-events
  ^js [session]
  (.-suppressDiagnosticEvents ^js session))

(defn set-suppress-diagnostic-events!
  ^js [session value]
  (set! (.-suppressDiagnosticEvents ^js session) value))

(defn event-handler
  ^js [session]
  (.-eventHandler ^js session))

(defn set-event-handler!
  ^js [session value]
  (set! (.-eventHandler ^js session) value))

(defn no-get-err-on-background-update
  ^js [session]
  (.-noGetErrOnBackgroundUpdate ^js session))

(defn send-request-completed-event
  ^js [session]
  (.-sendRequestCompletedEvent ^js session))

(defn set-send-request-completed-event!
  ^js [session value]
  (set! (.-sendRequestCompletedEvent ^js session) value))

(defn add-performance-data
  ^js [session]
  (.-addPerformanceData ^js session))

(defn set-add-performance-data!
  ^js [session value]
  (set! (.-addPerformanceData ^js session) value))

(defn performance-event-handler
  ^js [session]
  (.-performanceEventHandler ^js session))

(defn set-performance-event-handler!
  ^js [session value]
  (set! (.-performanceEventHandler ^js session) value))

(defn default-event-handler
  ^js [session]
  (.-defaultEventHandler ^js session))

(defn set-default-event-handler!
  ^js [session value]
  (set! (.-defaultEventHandler ^js session) value))

(defn projects-updated-in-background-event
  ^js [session]
  (.-projectsUpdatedInBackgroundEvent ^js session))

(defn set-projects-updated-in-background-event!
  ^js [session value]
  (set! (.-projectsUpdatedInBackgroundEvent ^js session) value))

(defn log-error
  "**Parameters:**
   - `err`: `Error`
   - `cmd`: `string`
   
   **Returns:** `void`"
  ^js [session err cmd]
  (.logError ^js session err cmd))

(defn log-error-worker
  ^js [session]
  (.-logErrorWorker ^js session))

(defn set-log-error-worker!
  ^js [session value]
  (set! (.-logErrorWorker ^js session) value))

(defn send
  "**Parameters:**
   - `msg`: `Message`
   
   **Returns:** `void`"
  ^js [session msg]
  (.send ^js session msg))

(defn write-message
  "**Parameters:**
   - `msg`: `Message`
   
   **Returns:** `void`"
  ^js [session msg]
  (.writeMessage ^js session msg))

(defn event
  "**Parameters:**
   - `body`: `T`
   - `event-name`: `string`
   
   **Returns:** `void`"
  ^js [session body event-name]
  (.event ^js session body event-name))

(defn semantic-check
  ^js [session]
  (.-semanticCheck ^js session))

(defn set-semantic-check!
  ^js [session value]
  (set! (.-semanticCheck ^js session) value))

(defn syntactic-check
  ^js [session]
  (.-syntacticCheck ^js session))

(defn set-syntactic-check!
  ^js [session value]
  (set! (.-syntacticCheck ^js session) value))

(defn suggestion-check
  ^js [session]
  (.-suggestionCheck ^js session))

(defn set-suggestion-check!
  ^js [session value]
  (set! (.-suggestionCheck ^js session) value))

(defn send-diagnostics-event
  ^js [session]
  (.-sendDiagnosticsEvent ^js session))

(defn set-send-diagnostics-event!
  ^js [session value]
  (set! (.-sendDiagnosticsEvent ^js session) value))

(defn update-error-check
  "It is the caller's responsibility to verify that `!this.suppressDiagnosticEvents`."
  ^js [session]
  (.-updateErrorCheck ^js session))

(defn set-update-error-check!
  "It is the caller's responsibility to verify that `!this.suppressDiagnosticEvents`."
  ^js [session value]
  (set! (.-updateErrorCheck ^js session) value))

(defn clean-projects
  ^js [session]
  (.-cleanProjects ^js session))

(defn set-clean-projects!
  ^js [session value]
  (set! (.-cleanProjects ^js session) value))

(defn cleanup
  ^js [session]
  (.-cleanup ^js session))

(defn set-cleanup!
  ^js [session value]
  (set! (.-cleanup ^js session) value))

(defn encoded-syntactic-classifications
  ^js [session]
  (.-getEncodedSyntacticClassifications ^js session))

(defn set-get-encoded-syntactic-classifications!
  ^js [session value]
  (set! (.-getEncodedSyntacticClassifications ^js session) value))

(defn encoded-semantic-classifications
  ^js [session]
  (.-getEncodedSemanticClassifications ^js session))

(defn set-get-encoded-semantic-classifications!
  ^js [session value]
  (set! (.-getEncodedSemanticClassifications ^js session) value))

(defn project
  ^js [session]
  (.-getProject ^js session))

(defn set-get-project!
  ^js [session value]
  (set! (.-getProject ^js session) value))

(defn config-file-and-project
  ^js [session]
  (.-getConfigFileAndProject ^js session))

(defn set-get-config-file-and-project!
  ^js [session value]
  (set! (.-getConfigFileAndProject ^js session) value))

(defn config-file-diagnostics
  ^js [session]
  (.-getConfigFileDiagnostics ^js session))

(defn set-get-config-file-diagnostics!
  ^js [session value]
  (set! (.-getConfigFileDiagnostics ^js session) value))

(defn convert-to-diagnostics-with-line-position-from-diagnostic-file
  ^js [session]
  (.-convertToDiagnosticsWithLinePositionFromDiagnosticFile ^js session))

(defn set-convert-to-diagnostics-with-line-position-from-diagnostic-file!
  ^js [session value]
  (set! (.-convertToDiagnosticsWithLinePositionFromDiagnosticFile ^js session) value))

(defn compiler-options-diagnostics
  ^js [session]
  (.-getCompilerOptionsDiagnostics ^js session))

(defn set-get-compiler-options-diagnostics!
  ^js [session value]
  (set! (.-getCompilerOptionsDiagnostics ^js session) value))

(defn convert-to-diagnostics-with-line-position
  ^js [session]
  (.-convertToDiagnosticsWithLinePosition ^js session))

(defn set-convert-to-diagnostics-with-line-position!
  ^js [session value]
  (set! (.-convertToDiagnosticsWithLinePosition ^js session) value))

(defn diagnostics-worker
  ^js [session]
  (.-getDiagnosticsWorker ^js session))

(defn set-get-diagnostics-worker!
  ^js [session value]
  (set! (.-getDiagnosticsWorker ^js session) value))

(defn definition
  ^js [session]
  (.-getDefinition ^js session))

(defn set-get-definition!
  ^js [session value]
  (set! (.-getDefinition ^js session) value))

(defn map-definition-info-locations
  ^js [session]
  (.-mapDefinitionInfoLocations ^js session))

(defn set-map-definition-info-locations!
  ^js [session value]
  (set! (.-mapDefinitionInfoLocations ^js session) value))

(defn definition-and-bound-span
  ^js [session]
  (.-getDefinitionAndBoundSpan ^js session))

(defn set-get-definition-and-bound-span!
  ^js [session value]
  (set! (.-getDefinitionAndBoundSpan ^js session) value))

(defn find-source-definition
  ^js [session]
  (.-findSourceDefinition ^js session))

(defn set-find-source-definition!
  ^js [session value]
  (set! (.-findSourceDefinition ^js session) value))

(defn emit-output
  ^js [session]
  (.-getEmitOutput ^js session))

(defn set-get-emit-output!
  ^js [session value]
  (set! (.-getEmitOutput ^js session) value))

(defn map-js-doc-tag-info
  ^js [session]
  (.-mapJSDocTagInfo ^js session))

(defn set-map-js-doc-tag-info!
  ^js [session value]
  (set! (.-mapJSDocTagInfo ^js session) value))

(defn map-display-parts
  ^js [session]
  (.-mapDisplayParts ^js session))

(defn set-map-display-parts!
  ^js [session value]
  (set! (.-mapDisplayParts ^js session) value))

(defn map-signature-help-items
  ^js [session]
  (.-mapSignatureHelpItems ^js session))

(defn set-map-signature-help-items!
  ^js [session value]
  (set! (.-mapSignatureHelpItems ^js session) value))

(defn map-definition-info
  ^js [session]
  (.-mapDefinitionInfo ^js session))

(defn set-map-definition-info!
  ^js [session value]
  (set! (.-mapDefinitionInfo ^js session) value))

(defn to-file-span
  ^js [session]
  (.-toFileSpan ^js session))

(defn set-to-file-span!
  ^js [session value]
  (set! (.-toFileSpan ^js session) value))

(defn to-file-span-with-context
  ^js [session]
  (.-toFileSpanWithContext ^js session))

(defn set-to-file-span-with-context!
  ^js [session value]
  (set! (.-toFileSpanWithContext ^js session) value))

(defn type-definition
  ^js [session]
  (.-getTypeDefinition ^js session))

(defn set-get-type-definition!
  ^js [session value]
  (set! (.-getTypeDefinition ^js session) value))

(defn map-implementation-locations
  ^js [session]
  (.-mapImplementationLocations ^js session))

(defn set-map-implementation-locations!
  ^js [session value]
  (set! (.-mapImplementationLocations ^js session) value))

(defn implementation
  ^js [session]
  (.-getImplementation ^js session))

(defn set-get-implementation!
  ^js [session value]
  (set! (.-getImplementation ^js session) value))

(defn syntactic-diagnostics-sync
  ^js [session]
  (.-getSyntacticDiagnosticsSync ^js session))

(defn set-get-syntactic-diagnostics-sync!
  ^js [session value]
  (set! (.-getSyntacticDiagnosticsSync ^js session) value))

(defn semantic-diagnostics-sync
  ^js [session]
  (.-getSemanticDiagnosticsSync ^js session))

(defn set-get-semantic-diagnostics-sync!
  ^js [session value]
  (set! (.-getSemanticDiagnosticsSync ^js session) value))

(defn suggestion-diagnostics-sync
  ^js [session]
  (.-getSuggestionDiagnosticsSync ^js session))

(defn set-get-suggestion-diagnostics-sync!
  ^js [session value]
  (set! (.-getSuggestionDiagnosticsSync ^js session) value))

(defn jsx-closing-tag
  ^js [session]
  (.-getJsxClosingTag ^js session))

(defn set-get-jsx-closing-tag!
  ^js [session value]
  (set! (.-getJsxClosingTag ^js session) value))

(defn linked-editing-range
  ^js [session]
  (.-getLinkedEditingRange ^js session))

(defn set-get-linked-editing-range!
  ^js [session value]
  (set! (.-getLinkedEditingRange ^js session) value))

(defn document-highlights
  ^js [session]
  (.-getDocumentHighlights ^js session))

(defn set-get-document-highlights!
  ^js [session value]
  (set! (.-getDocumentHighlights ^js session) value))

(defn provide-inlay-hints
  ^js [session]
  (.-provideInlayHints ^js session))

(defn set-provide-inlay-hints!
  ^js [session value]
  (set! (.-provideInlayHints ^js session) value))

(defn set-compiler-options-for-inferred-projects
  ^js [session]
  (.-setCompilerOptionsForInferredProjects ^js session))

(defn set-set-compiler-options-for-inferred-projects!
  ^js [session value]
  (set! (.-setCompilerOptionsForInferredProjects ^js session) value))

(defn project-info
  ^js [session]
  (.-getProjectInfo ^js session))

(defn set-get-project-info!
  ^js [session value]
  (set! (.-getProjectInfo ^js session) value))

(defn project-info-worker
  ^js [session]
  (.-getProjectInfoWorker ^js session))

(defn set-get-project-info-worker!
  ^js [session value]
  (set! (.-getProjectInfoWorker ^js session) value))

(defn rename-info
  ^js [session]
  (.-getRenameInfo ^js session))

(defn set-get-rename-info!
  ^js [session value]
  (set! (.-getRenameInfo ^js session) value))

(defn projects
  ^js [session]
  (.-getProjects ^js session))

(defn set-get-projects!
  ^js [session value]
  (set! (.-getProjects ^js session) value))

(defn default-project
  ^js [session]
  (.-getDefaultProject ^js session))

(defn set-get-default-project!
  ^js [session value]
  (set! (.-getDefaultProject ^js session) value))

(defn rename-locations
  ^js [session]
  (.-getRenameLocations ^js session))

(defn set-get-rename-locations!
  ^js [session value]
  (set! (.-getRenameLocations ^js session) value))

(defn map-rename-info
  ^js [session]
  (.-mapRenameInfo ^js session))

(defn set-map-rename-info!
  ^js [session value]
  (set! (.-mapRenameInfo ^js session) value))

(defn to-span-groups
  ^js [session]
  (.-toSpanGroups ^js session))

(defn set-to-span-groups!
  ^js [session value]
  (set! (.-toSpanGroups ^js session) value))

(defn references
  ^js [session]
  (.-getReferences ^js session))

(defn set-get-references!
  ^js [session value]
  (set! (.-getReferences ^js session) value))

(defn file-references
  ^js [session]
  (.-getFileReferences ^js session))

(defn set-get-file-references!
  ^js [session value]
  (set! (.-getFileReferences ^js session) value))

(defn open-client-file
  ^js [session]
  (.-openClientFile ^js session))

(defn set-open-client-file!
  ^js [session value]
  (set! (.-openClientFile ^js session) value))

(defn position
  ^js [session]
  (.-getPosition ^js session))

(defn set-get-position!
  ^js [session value]
  (set! (.-getPosition ^js session) value))

(defn position-in-file
  ^js [session]
  (.-getPositionInFile ^js session))

(defn set-get-position-in-file!
  ^js [session value]
  (set! (.-getPositionInFile ^js session) value))

(defn file-and-project
  ^js [session]
  (.-getFileAndProject ^js session))

(defn set-get-file-and-project!
  ^js [session value]
  (set! (.-getFileAndProject ^js session) value))

(defn file-and-language-service-for-syntactic-operation
  ^js [session]
  (.-getFileAndLanguageServiceForSyntacticOperation ^js session))

(defn set-get-file-and-language-service-for-syntactic-operation!
  ^js [session value]
  (set! (.-getFileAndLanguageServiceForSyntacticOperation ^js session) value))

(defn file-and-project-worker
  ^js [session]
  (.-getFileAndProjectWorker ^js session))

(defn set-get-file-and-project-worker!
  ^js [session value]
  (set! (.-getFileAndProjectWorker ^js session) value))

(defn outlining-spans
  ^js [session]
  (.-getOutliningSpans ^js session))

(defn set-get-outlining-spans!
  ^js [session value]
  (set! (.-getOutliningSpans ^js session) value))

(defn todo-comments
  ^js [session]
  (.-getTodoComments ^js session))

(defn set-get-todo-comments!
  ^js [session value]
  (set! (.-getTodoComments ^js session) value))

(defn doc-comment-template
  ^js [session]
  (.-getDocCommentTemplate ^js session))

(defn set-get-doc-comment-template!
  ^js [session value]
  (set! (.-getDocCommentTemplate ^js session) value))

(defn span-of-enclosing-comment
  ^js [session]
  (.-getSpanOfEnclosingComment ^js session))

(defn set-get-span-of-enclosing-comment!
  ^js [session value]
  (set! (.-getSpanOfEnclosingComment ^js session) value))

(defn indentation
  ^js [session]
  (.-getIndentation ^js session))

(defn set-get-indentation!
  ^js [session value]
  (set! (.-getIndentation ^js session) value))

(defn breakpoint-statement
  ^js [session]
  (.-getBreakpointStatement ^js session))

(defn set-get-breakpoint-statement!
  ^js [session value]
  (set! (.-getBreakpointStatement ^js session) value))

(defn name-or-dotted-name-span
  ^js [session]
  (.-getNameOrDottedNameSpan ^js session))

(defn set-get-name-or-dotted-name-span!
  ^js [session value]
  (set! (.-getNameOrDottedNameSpan ^js session) value))

(defn valid-brace-completion
  ^js [session]
  (.-isValidBraceCompletion ^js session))

(defn set-is-valid-brace-completion!
  ^js [session value]
  (set! (.-isValidBraceCompletion ^js session) value))

(defn quick-info-worker
  ^js [session]
  (.-getQuickInfoWorker ^js session))

(defn set-get-quick-info-worker!
  ^js [session value]
  (set! (.-getQuickInfoWorker ^js session) value))

(defn formatting-edits-for-range
  ^js [session]
  (.-getFormattingEditsForRange ^js session))

(defn set-get-formatting-edits-for-range!
  ^js [session value]
  (set! (.-getFormattingEditsForRange ^js session) value))

(defn formatting-edits-for-range-full
  ^js [session]
  (.-getFormattingEditsForRangeFull ^js session))

(defn set-get-formatting-edits-for-range-full!
  ^js [session value]
  (set! (.-getFormattingEditsForRangeFull ^js session) value))

(defn formatting-edits-for-document-full
  ^js [session]
  (.-getFormattingEditsForDocumentFull ^js session))

(defn set-get-formatting-edits-for-document-full!
  ^js [session value]
  (set! (.-getFormattingEditsForDocumentFull ^js session) value))

(defn formatting-edits-after-keystroke-full
  ^js [session]
  (.-getFormattingEditsAfterKeystrokeFull ^js session))

(defn set-get-formatting-edits-after-keystroke-full!
  ^js [session value]
  (set! (.-getFormattingEditsAfterKeystrokeFull ^js session) value))

(defn formatting-edits-after-keystroke
  ^js [session]
  (.-getFormattingEditsAfterKeystroke ^js session))

(defn set-get-formatting-edits-after-keystroke!
  ^js [session value]
  (set! (.-getFormattingEditsAfterKeystroke ^js session) value))

(defn completions
  ^js [session]
  (.-getCompletions ^js session))

(defn set-get-completions!
  ^js [session value]
  (set! (.-getCompletions ^js session) value))

(defn completion-entry-details
  ^js [session]
  (.-getCompletionEntryDetails ^js session))

(defn set-get-completion-entry-details!
  ^js [session value]
  (set! (.-getCompletionEntryDetails ^js session) value))

(defn compile-on-save-affected-file-list
  ^js [session]
  (.-getCompileOnSaveAffectedFileList ^js session))

(defn set-get-compile-on-save-affected-file-list!
  ^js [session value]
  (set! (.-getCompileOnSaveAffectedFileList ^js session) value))

(defn emit-file
  ^js [session]
  (.-emitFile ^js session))

(defn set-emit-file!
  ^js [session value]
  (set! (.-emitFile ^js session) value))

(defn signature-help-items
  ^js [session]
  (.-getSignatureHelpItems ^js session))

(defn set-get-signature-help-items!
  ^js [session value]
  (set! (.-getSignatureHelpItems ^js session) value))

(defn to-pending-error-check
  ^js [session]
  (.-toPendingErrorCheck ^js session))

(defn set-to-pending-error-check!
  ^js [session value]
  (set! (.-toPendingErrorCheck ^js session) value))

(defn diagnostics
  ^js [session]
  (.-getDiagnostics ^js session))

(defn set-get-diagnostics!
  ^js [session value]
  (set! (.-getDiagnostics ^js session) value))

(defn change
  ^js [session]
  (.-change ^js session))

(defn set-change!
  ^js [session value]
  (set! (.-change ^js session) value))

(defn reload
  ^js [session]
  (.-reload ^js session))

(defn set-reload!
  ^js [session value]
  (set! (.-reload ^js session) value))

(defn save-to-tmp
  ^js [session]
  (.-saveToTmp ^js session))

(defn set-save-to-tmp!
  ^js [session value]
  (set! (.-saveToTmp ^js session) value))

(defn close-client-file
  ^js [session]
  (.-closeClientFile ^js session))

(defn set-close-client-file!
  ^js [session value]
  (set! (.-closeClientFile ^js session) value))

(defn map-location-navigation-bar-items
  ^js [session]
  (.-mapLocationNavigationBarItems ^js session))

(defn set-map-location-navigation-bar-items!
  ^js [session value]
  (set! (.-mapLocationNavigationBarItems ^js session) value))

(defn navigation-bar-items
  ^js [session]
  (.-getNavigationBarItems ^js session))

(defn set-get-navigation-bar-items!
  ^js [session value]
  (set! (.-getNavigationBarItems ^js session) value))

(defn to-location-navigation-tree
  ^js [session]
  (.-toLocationNavigationTree ^js session))

(defn set-to-location-navigation-tree!
  ^js [session value]
  (set! (.-toLocationNavigationTree ^js session) value))

(defn navigation-tree
  ^js [session]
  (.-getNavigationTree ^js session))

(defn set-get-navigation-tree!
  ^js [session value]
  (set! (.-getNavigationTree ^js session) value))

(defn navigate-to-items
  ^js [session]
  (.-getNavigateToItems ^js session))

(defn set-get-navigate-to-items!
  ^js [session value]
  (set! (.-getNavigateToItems ^js session) value))

(defn full-navigate-to-items
  ^js [session]
  (.-getFullNavigateToItems ^js session))

(defn set-get-full-navigate-to-items!
  ^js [session value]
  (set! (.-getFullNavigateToItems ^js session) value))

(defn supported-code-fixes
  ^js [session]
  (.-getSupportedCodeFixes ^js session))

(defn set-get-supported-code-fixes!
  ^js [session value]
  (set! (.-getSupportedCodeFixes ^js session) value))

(defn location
  ^js [session]
  (.-isLocation ^js session))

(defn set-is-location!
  ^js [session value]
  (set! (.-isLocation ^js session) value))

(defn extract-position-or-range
  ^js [session]
  (.-extractPositionOrRange ^js session))

(defn set-extract-position-or-range!
  ^js [session value]
  (set! (.-extractPositionOrRange ^js session) value))

(defn range
  ^js [session]
  (.-getRange ^js session))

(defn set-get-range!
  ^js [session value]
  (set! (.-getRange ^js session) value))

(defn applicable-refactors
  ^js [session]
  (.-getApplicableRefactors ^js session))

(defn set-get-applicable-refactors!
  ^js [session value]
  (set! (.-getApplicableRefactors ^js session) value))

(defn edits-for-refactor
  ^js [session]
  (.-getEditsForRefactor ^js session))

(defn set-get-edits-for-refactor!
  ^js [session value]
  (set! (.-getEditsForRefactor ^js session) value))

(defn move-to-refactoring-file-suggestions
  ^js [session]
  (.-getMoveToRefactoringFileSuggestions ^js session))

(defn set-get-move-to-refactoring-file-suggestions!
  ^js [session value]
  (set! (.-getMoveToRefactoringFileSuggestions ^js session) value))

(defn organize-imports
  ^js [session]
  (.-organizeImports ^js session))

(defn set-organize-imports!
  ^js [session value]
  (set! (.-organizeImports ^js session) value))

(defn edits-for-file-rename
  ^js [session]
  (.-getEditsForFileRename ^js session))

(defn set-get-edits-for-file-rename!
  ^js [session value]
  (set! (.-getEditsForFileRename ^js session) value))

(defn code-fixes
  ^js [session]
  (.-getCodeFixes ^js session))

(defn set-get-code-fixes!
  ^js [session value]
  (set! (.-getCodeFixes ^js session) value))

(defn combined-code-fix
  ^js [session]
  (.-getCombinedCodeFix ^js session))

(defn set-get-combined-code-fix!
  ^js [session value]
  (set! (.-getCombinedCodeFix ^js session) value))

(defn apply-code-action-command
  ^js [session]
  (.-applyCodeActionCommand ^js session))

(defn set-apply-code-action-command!
  ^js [session value]
  (set! (.-applyCodeActionCommand ^js session) value))

(defn start-and-end-position
  ^js [session]
  (.-getStartAndEndPosition ^js session))

(defn set-get-start-and-end-position!
  ^js [session value]
  (set! (.-getStartAndEndPosition ^js session) value))

(defn map-code-action
  ^js [session]
  (.-mapCodeAction ^js session))

(defn set-map-code-action!
  ^js [session value]
  (set! (.-mapCodeAction ^js session) value))

(defn map-code-fix-action
  ^js [session]
  (.-mapCodeFixAction ^js session))

(defn set-map-code-fix-action!
  ^js [session value]
  (set! (.-mapCodeFixAction ^js session) value))

(defn map-text-changes-to-code-edits
  ^js [session]
  (.-mapTextChangesToCodeEdits ^js session))

(defn set-map-text-changes-to-code-edits!
  ^js [session value]
  (set! (.-mapTextChangesToCodeEdits ^js session) value))

(defn map-text-change-to-code-edit
  ^js [session]
  (.-mapTextChangeToCodeEdit ^js session))

(defn set-map-text-change-to-code-edit!
  ^js [session value]
  (set! (.-mapTextChangeToCodeEdit ^js session) value))

(defn convert-text-change-to-code-edit
  ^js [session]
  (.-convertTextChangeToCodeEdit ^js session))

(defn set-convert-text-change-to-code-edit!
  ^js [session value]
  (set! (.-convertTextChangeToCodeEdit ^js session) value))

(defn brace-matching
  ^js [session]
  (.-getBraceMatching ^js session))

(defn set-get-brace-matching!
  ^js [session value]
  (set! (.-getBraceMatching ^js session) value))

(defn diagnostics-for-project
  ^js [session]
  (.-getDiagnosticsForProject ^js session))

(defn set-get-diagnostics-for-project!
  ^js [session value]
  (set! (.-getDiagnosticsForProject ^js session) value))

(defn configure-plugin
  ^js [session]
  (.-configurePlugin ^js session))

(defn set-configure-plugin!
  ^js [session value]
  (set! (.-configurePlugin ^js session) value))

(defn smart-selection-range
  ^js [session]
  (.-getSmartSelectionRange ^js session))

(defn set-get-smart-selection-range!
  ^js [session value]
  (set! (.-getSmartSelectionRange ^js session) value))

(defn toggle-line-comment
  ^js [session]
  (.-toggleLineComment ^js session))

(defn set-toggle-line-comment!
  ^js [session value]
  (set! (.-toggleLineComment ^js session) value))

(defn toggle-multiline-comment
  ^js [session]
  (.-toggleMultilineComment ^js session))

(defn set-toggle-multiline-comment!
  ^js [session value]
  (set! (.-toggleMultilineComment ^js session) value))

(defn comment-selection
  ^js [session]
  (.-commentSelection ^js session))

(defn set-comment-selection!
  ^js [session value]
  (set! (.-commentSelection ^js session) value))

(defn uncomment-selection
  ^js [session]
  (.-uncommentSelection ^js session))

(defn set-uncomment-selection!
  ^js [session value]
  (set! (.-uncommentSelection ^js session) value))

(defn map-selection-range
  ^js [session]
  (.-mapSelectionRange ^js session))

(defn set-map-selection-range!
  ^js [session value]
  (set! (.-mapSelectionRange ^js session) value))

(defn script-info-from-project-service
  ^js [session]
  (.-getScriptInfoFromProjectService ^js session))

(defn set-get-script-info-from-project-service!
  ^js [session value]
  (set! (.-getScriptInfoFromProjectService ^js session) value))

(defn to-protocol-call-hierarchy-item
  ^js [session]
  (.-toProtocolCallHierarchyItem ^js session))

(defn set-to-protocol-call-hierarchy-item!
  ^js [session value]
  (set! (.-toProtocolCallHierarchyItem ^js session) value))

(defn to-protocol-call-hierarchy-incoming-call
  ^js [session]
  (.-toProtocolCallHierarchyIncomingCall ^js session))

(defn set-to-protocol-call-hierarchy-incoming-call!
  ^js [session value]
  (set! (.-toProtocolCallHierarchyIncomingCall ^js session) value))

(defn to-protocol-call-hierarchy-outgoing-call
  ^js [session]
  (.-toProtocolCallHierarchyOutgoingCall ^js session))

(defn set-to-protocol-call-hierarchy-outgoing-call!
  ^js [session value]
  (set! (.-toProtocolCallHierarchyOutgoingCall ^js session) value))

(defn prepare-call-hierarchy
  ^js [session]
  (.-prepareCallHierarchy ^js session))

(defn set-prepare-call-hierarchy!
  ^js [session value]
  (set! (.-prepareCallHierarchy ^js session) value))

(defn provide-call-hierarchy-incoming-calls
  ^js [session]
  (.-provideCallHierarchyIncomingCalls ^js session))

(defn set-provide-call-hierarchy-incoming-calls!
  ^js [session value]
  (set! (.-provideCallHierarchyIncomingCalls ^js session) value))

(defn provide-call-hierarchy-outgoing-calls
  ^js [session]
  (.-provideCallHierarchyOutgoingCalls ^js session))

(defn set-provide-call-hierarchy-outgoing-calls!
  ^js [session value]
  (set! (.-provideCallHierarchyOutgoingCalls ^js session) value))

(defn canonical-file-name
  "**Parameters:**
   - `file-name`: `string`
   
   **Returns:** `string`"
  ^js [session file-name]
  (.getCanonicalFileName ^js session file-name))

(defn exit
  "**Returns:** `void`"
  ^js [session]
  (.exit ^js session))

(defn not-required
  ^js [session]
  (.-notRequired ^js session))

(defn set-not-required!
  ^js [session value]
  (set! (.-notRequired ^js session) value))

(defn required-response
  ^js [session]
  (.-requiredResponse ^js session))

(defn set-required-response!
  ^js [session value]
  (set! (.-requiredResponse ^js session) value))

(defn handlers
  ^js [session]
  (.-handlers ^js session))

(defn set-handlers!
  ^js [session value]
  (set! (.-handlers ^js session) value))

(defn add-protocol-handler
  "**Parameters:**
   - `command`: `string`
   - `handler`: `(request: Request) => HandlerResponse`
   
   **Returns:** `void`"
  ^js [session command handler]
  (.addProtocolHandler ^js session command handler))

(defn set-current-request
  ^js [session]
  (.-setCurrentRequest ^js session))

(defn set-set-current-request!
  ^js [session value]
  (set! (.-setCurrentRequest ^js session) value))

(defn reset-current-request
  ^js [session]
  (.-resetCurrentRequest ^js session))

(defn set-reset-current-request!
  ^js [session value]
  (set! (.-resetCurrentRequest ^js session) value))

(defn execute-with-request-id
  "**Parameters:**
   - `request-id`: `number`
   - `f`: `() => T`
   
   **Returns:** `T`"
  ^js [session request-id f]
  (.executeWithRequestId ^js session request-id f))

(defn execute-command
  "**Parameters:**
   - `request`: `Request`
   
   **Returns:** `HandlerResponse`"
  ^js [session request]
  (.executeCommand ^js session request))

(defn on-message
  "**Parameters:**
   - `message`: `TMessage`
   
   **Returns:** `void`"
  ^js [session message]
  (.onMessage ^js session message))

(defn parse-message
  "**Parameters:**
   - `message`: `TMessage`
   
   **Returns:** `Request`"
  ^js [session message]
  (.parseMessage ^js session message))

(defn to-string-message
  "**Parameters:**
   - `message`: `TMessage`
   
   **Returns:** `string`"
  ^js [session message]
  (.toStringMessage ^js session message))

(defn format-options
  ^js [session]
  (.-getFormatOptions ^js session))

(defn set-get-format-options!
  ^js [session value]
  (set! (.-getFormatOptions ^js session) value))

(defn preferences
  ^js [session]
  (.-getPreferences ^js session))

(defn set-get-preferences!
  ^js [session value]
  (set! (.-getPreferences ^js session) value))

(defn host-format-options
  ^js [session]
  (.-getHostFormatOptions ^js session))

(defn set-get-host-format-options!
  ^js [session value]
  (set! (.-getHostFormatOptions ^js session) value))

(defn host-preferences
  ^js [session]
  (.-getHostPreferences ^js session))

(defn set-get-host-preferences!
  ^js [session value]
  (set! (.-getHostPreferences ^js session) value))

(defn map-to-original-location
  ^js [session]
  (.-mapToOriginalLocation ^js session))

(defn set-map-to-original-location!
  ^js [session value]
  (set! (.-mapToOriginalLocation ^js session) value))
