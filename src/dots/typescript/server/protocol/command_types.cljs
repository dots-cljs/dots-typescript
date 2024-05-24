(ns dots.typescript.server.protocol.command-types
  (:require ["typescript" :as typescript]))

(def jsx-closing-tag (.. typescript/server -protocol -CommandTypes -JsxClosingTag))

(def linked-editing-range (.. typescript/server -protocol -CommandTypes -LinkedEditingRange))

(def brace (.. typescript/server -protocol -CommandTypes -Brace))

(def brace-completion (.. typescript/server -protocol -CommandTypes -BraceCompletion))

(def span-of-enclosing-comment (.. typescript/server -protocol -CommandTypes -GetSpanOfEnclosingComment))

(def change (.. typescript/server -protocol -CommandTypes -Change))

(def close (.. typescript/server -protocol -CommandTypes -Close))

(def completions (.. typescript/server -protocol -CommandTypes -Completions))

(def completion-info (.. typescript/server -protocol -CommandTypes -CompletionInfo))

(def completion-details (.. typescript/server -protocol -CommandTypes -CompletionDetails))

(def compile-on-save-affected-file-list (.. typescript/server -protocol -CommandTypes -CompileOnSaveAffectedFileList))

(def compile-on-save-emit-file (.. typescript/server -protocol -CommandTypes -CompileOnSaveEmitFile))

(def configure (.. typescript/server -protocol -CommandTypes -Configure))

(def definition (.. typescript/server -protocol -CommandTypes -Definition))

(def definition-and-bound-span (.. typescript/server -protocol -CommandTypes -DefinitionAndBoundSpan))

(def implementation (.. typescript/server -protocol -CommandTypes -Implementation))

(def exit (.. typescript/server -protocol -CommandTypes -Exit))

(def file-references (.. typescript/server -protocol -CommandTypes -FileReferences))

(def format (.. typescript/server -protocol -CommandTypes -Format))

(def formatonkey (.. typescript/server -protocol -CommandTypes -Formatonkey))

(def geterr (.. typescript/server -protocol -CommandTypes -Geterr))

(def geterr-for-project (.. typescript/server -protocol -CommandTypes -GeterrForProject))

(def semantic-diagnostics-sync (.. typescript/server -protocol -CommandTypes -SemanticDiagnosticsSync))

(def syntactic-diagnostics-sync (.. typescript/server -protocol -CommandTypes -SyntacticDiagnosticsSync))

(def suggestion-diagnostics-sync (.. typescript/server -protocol -CommandTypes -SuggestionDiagnosticsSync))

(def nav-bar (.. typescript/server -protocol -CommandTypes -NavBar))

(def navto (.. typescript/server -protocol -CommandTypes -Navto))

(def nav-tree (.. typescript/server -protocol -CommandTypes -NavTree))

(def nav-tree-full (.. typescript/server -protocol -CommandTypes -NavTreeFull))

(def document-highlights (.. typescript/server -protocol -CommandTypes -DocumentHighlights))

(def open (.. typescript/server -protocol -CommandTypes -Open))

(def quickinfo (.. typescript/server -protocol -CommandTypes -Quickinfo))

(def references (.. typescript/server -protocol -CommandTypes -References))

(def reload (.. typescript/server -protocol -CommandTypes -Reload))

(def rename (.. typescript/server -protocol -CommandTypes -Rename))

(def saveto (.. typescript/server -protocol -CommandTypes -Saveto))

(def signature-help (.. typescript/server -protocol -CommandTypes -SignatureHelp))

(def find-source-definition (.. typescript/server -protocol -CommandTypes -FindSourceDefinition))

(def status (.. typescript/server -protocol -CommandTypes -Status))

(def type-definition (.. typescript/server -protocol -CommandTypes -TypeDefinition))

(def project-info (.. typescript/server -protocol -CommandTypes -ProjectInfo))

(def reload-projects (.. typescript/server -protocol -CommandTypes -ReloadProjects))

(def unknown (.. typescript/server -protocol -CommandTypes -Unknown))

(def open-external-project (.. typescript/server -protocol -CommandTypes -OpenExternalProject))

(def open-external-projects (.. typescript/server -protocol -CommandTypes -OpenExternalProjects))

(def close-external-project (.. typescript/server -protocol -CommandTypes -CloseExternalProject))

(def update-open (.. typescript/server -protocol -CommandTypes -UpdateOpen))

(def outlining-spans (.. typescript/server -protocol -CommandTypes -GetOutliningSpans))

(def todo-comments (.. typescript/server -protocol -CommandTypes -TodoComments))

(def indentation (.. typescript/server -protocol -CommandTypes -Indentation))

(def doc-comment-template (.. typescript/server -protocol -CommandTypes -DocCommentTemplate))

(def compiler-options-for-inferred-projects (.. typescript/server -protocol -CommandTypes -CompilerOptionsForInferredProjects))

(def code-fixes (.. typescript/server -protocol -CommandTypes -GetCodeFixes))

(def combined-code-fix (.. typescript/server -protocol -CommandTypes -GetCombinedCodeFix))

(def apply-code-action-command (.. typescript/server -protocol -CommandTypes -ApplyCodeActionCommand))

(def supported-code-fixes (.. typescript/server -protocol -CommandTypes -GetSupportedCodeFixes))

(def applicable-refactors (.. typescript/server -protocol -CommandTypes -GetApplicableRefactors))

(def edits-for-refactor (.. typescript/server -protocol -CommandTypes -GetEditsForRefactor))

(def move-to-refactoring-file-suggestions (.. typescript/server -protocol -CommandTypes -GetMoveToRefactoringFileSuggestions))

(def organize-imports (.. typescript/server -protocol -CommandTypes -OrganizeImports))

(def edits-for-file-rename (.. typescript/server -protocol -CommandTypes -GetEditsForFileRename))

(def configure-plugin (.. typescript/server -protocol -CommandTypes -ConfigurePlugin))

(def selection-range (.. typescript/server -protocol -CommandTypes -SelectionRange))

(def toggle-line-comment (.. typescript/server -protocol -CommandTypes -ToggleLineComment))

(def toggle-multiline-comment (.. typescript/server -protocol -CommandTypes -ToggleMultilineComment))

(def comment-selection (.. typescript/server -protocol -CommandTypes -CommentSelection))

(def uncomment-selection (.. typescript/server -protocol -CommandTypes -UncommentSelection))

(def prepare-call-hierarchy (.. typescript/server -protocol -CommandTypes -PrepareCallHierarchy))

(def provide-call-hierarchy-incoming-calls (.. typescript/server -protocol -CommandTypes -ProvideCallHierarchyIncomingCalls))

(def provide-call-hierarchy-outgoing-calls (.. typescript/server -protocol -CommandTypes -ProvideCallHierarchyOutgoingCalls))

(def provide-inlay-hints (.. typescript/server -protocol -CommandTypes -ProvideInlayHints))

(def watch-change (.. typescript/server -protocol -CommandTypes -WatchChange))
