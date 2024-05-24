(ns dots.typescript.server.protocol.completion-info)

(defn flags
  ^js [completion-info]
  (.-flags ^js completion-info))

(defn global-completion?
  ^js [completion-info]
  (.-isGlobalCompletion ^js completion-info))

(defn member-completion?
  ^js [completion-info]
  (.-isMemberCompletion ^js completion-info))

(defn new-identifier-location?
  ^js [completion-info]
  (.-isNewIdentifierLocation ^js completion-info))

(defn optional-replacement-span
  "In the absence of `CompletionEntry[\"replacementSpan\"]`, the editor may choose whether to use
   this span or its default one. If `CompletionEntry[\"replacementSpan\"]` is defined, that span
   must be used to commit that completion entry."
  ^js [completion-info]
  (.-optionalReplacementSpan ^js completion-info))

(defn incomplete?
  ^js [completion-info]
  (.-isIncomplete ^js completion-info))

(defn entries
  ^js [completion-info]
  (.-entries ^js completion-info))
