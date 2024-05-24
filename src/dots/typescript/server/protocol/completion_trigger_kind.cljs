(ns dots.typescript.server.protocol.completion-trigger-kind
  (:require ["typescript" :as typescript]))

(def invoked
  "Completion was triggered by typing an identifier, manual invocation (e.g Ctrl+Space) or via API."
  (.. typescript/server -protocol -CompletionTriggerKind -Invoked))

(def trigger-character
  "Completion was triggered by a trigger character."
  (.. typescript/server -protocol -CompletionTriggerKind -TriggerCharacter))

(def trigger-for-incomplete-completions
  "Completion was re-triggered as the current completion list is incomplete."
  (.. typescript/server -protocol -CompletionTriggerKind -TriggerForIncompleteCompletions))
