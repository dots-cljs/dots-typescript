(ns dots.typescript.server.protocol.completion-entry-label-details)

(defn detail
  "An optional string which is rendered less prominently directly after
   {@link CompletionEntry.name name}, without any spacing. Should be
   used for function signatures or type annotations."
  ^js [completion-entry-label-details]
  (.-detail ^js completion-entry-label-details))

(defn set-detail!
  "An optional string which is rendered less prominently directly after
   {@link CompletionEntry.name name}, without any spacing. Should be
   used for function signatures or type annotations."
  ^js [completion-entry-label-details value]
  (set! (.-detail ^js completion-entry-label-details) value))

(defn description
  "An optional string which is rendered less prominently after
   {@link CompletionEntryLabelDetails.detail }. Should be used for fully qualified
   names or file path."
  ^js [completion-entry-label-details]
  (.-description ^js completion-entry-label-details))

(defn set-description!
  "An optional string which is rendered less prominently after
   {@link CompletionEntryLabelDetails.detail }. Should be used for fully qualified
   names or file path."
  ^js [completion-entry-label-details value]
  (set! (.-description ^js completion-entry-label-details) value))
