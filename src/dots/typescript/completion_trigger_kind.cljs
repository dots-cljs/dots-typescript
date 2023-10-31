(ns dots.typescript.completion-trigger-kind
  (:require ["typescript" :as typescript]))

(def invoked
  "Completion was triggered by typing an identifier, manual invocation (e.g Ctrl+Space) or via API."
  (.-Invoked typescript/CompletionTriggerKind))

(def trigger-character
  "Completion was triggered by a trigger character."
  (.-TriggerCharacter typescript/CompletionTriggerKind))

(def trigger-for-incomplete-completions
  "Completion was re-triggered as the current completion list is incomplete."
  (.-TriggerForIncompleteCompletions typescript/CompletionTriggerKind))
