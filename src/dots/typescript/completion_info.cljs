(ns dots.typescript.completion-info)

(defn flags
  "For performance telemetry."
  ^js [completion-info]
  (.-flags ^js completion-info))

(defn set-flags!
  "For performance telemetry."
  ^js [completion-info value]
  (set! (.-flags ^js completion-info) value))

(defn global-completion?
  "Not true for all global completions. This will be true if the enclosing scope matches a few syntax kinds. See `isSnippetScope`."
  ^js [completion-info]
  (.-isGlobalCompletion ^js completion-info))

(defn set-is-global-completion!
  "Not true for all global completions. This will be true if the enclosing scope matches a few syntax kinds. See `isSnippetScope`."
  ^js [completion-info value]
  (set! (.-isGlobalCompletion ^js completion-info) value))

(defn member-completion?
  ^js [completion-info]
  (.-isMemberCompletion ^js completion-info))

(defn set-is-member-completion!
  ^js [completion-info value]
  (set! (.-isMemberCompletion ^js completion-info) value))

(defn optional-replacement-span
  "In the absence of `CompletionEntry[\"replacementSpan\"], the editor may choose whether to use
   this span or its default one. If `CompletionEntry[\"replacementSpan\"]` is defined, that span
   must be used to commit that completion entry."
  ^js [completion-info]
  (.-optionalReplacementSpan ^js completion-info))

(defn set-optional-replacement-span!
  "In the absence of `CompletionEntry[\"replacementSpan\"], the editor may choose whether to use
   this span or its default one. If `CompletionEntry[\"replacementSpan\"]` is defined, that span
   must be used to commit that completion entry."
  ^js [completion-info value]
  (set! (.-optionalReplacementSpan ^js completion-info) value))

(defn new-identifier-location?
  "true when the current location also allows for a new identifier"
  ^js [completion-info]
  (.-isNewIdentifierLocation ^js completion-info))

(defn set-is-new-identifier-location!
  "true when the current location also allows for a new identifier"
  ^js [completion-info value]
  (set! (.-isNewIdentifierLocation ^js completion-info) value))

(defn incomplete
  "Indicates to client to continue requesting completions on subsequent keystrokes."
  ^js [completion-info]
  (.-isIncomplete ^js completion-info))

(defn set-is-incomplete!
  "Indicates to client to continue requesting completions on subsequent keystrokes."
  ^js [completion-info value]
  (set! (.-isIncomplete ^js completion-info) value))

(defn entries
  ^js [completion-info]
  (.-entries ^js completion-info))

(defn set-entries!
  ^js [completion-info value]
  (set! (.-entries ^js completion-info) value))
