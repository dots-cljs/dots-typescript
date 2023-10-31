(ns dots.typescript.completion-info-flags
  (:require ["typescript" :as typescript]))

(def none (.-None typescript/CompletionInfoFlags))

(def may-include-auto-imports (.-MayIncludeAutoImports typescript/CompletionInfoFlags))

(def import-statement-completion (.-IsImportStatementCompletion typescript/CompletionInfoFlags))

(def continuation (.-IsContinuation typescript/CompletionInfoFlags))

(def resolved-module-specifiers (.-ResolvedModuleSpecifiers typescript/CompletionInfoFlags))

(def resolved-module-specifiers-beyond-limit (.-ResolvedModuleSpecifiersBeyondLimit typescript/CompletionInfoFlags))

(def may-include-method-snippets (.-MayIncludeMethodSnippets typescript/CompletionInfoFlags))
