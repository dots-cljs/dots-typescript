(ns dots.typescript.server.protocol.completion-info)

(defn flags
  "**Returns:** `number | undefined`"
  ^js [completion-info]
  (.-flags ^js completion-info))

(defn global-completion?
  "**Returns:** `boolean`"
  ^js [completion-info]
  (.-isGlobalCompletion ^js completion-info))

(defn member-completion?
  "**Returns:** `boolean`"
  ^js [completion-info]
  (.-isMemberCompletion ^js completion-info))

(defn new-identifier-location?
  "**Returns:** `boolean`"
  ^js [completion-info]
  (.-isNewIdentifierLocation ^js completion-info))

(defn optional-replacement-span
  "In the absence of `CompletionEntry[\"replacementSpan\"]`, the editor may choose whether to use
   this span or its default one. If `CompletionEntry[\"replacementSpan\"]` is defined, that span
   must be used to commit that completion entry.
   
   **Returns:** `TextSpan | undefined`"
  ^js [completion-info]
  (.-optionalReplacementSpan ^js completion-info))

(defn incomplete?
  "**Returns:** `boolean | undefined`"
  ^js [completion-info]
  (.-isIncomplete ^js completion-info))

(defn entries
  "**Returns:** `readonly CompletionEntry[]`"
  ^js [completion-info]
  (.-entries ^js completion-info))
