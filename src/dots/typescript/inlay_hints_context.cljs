(ns dots.typescript.inlay-hints-context)

(defn file
  "**Returns:** `SourceFile`"
  ^js [inlay-hints-context]
  (.-file ^js inlay-hints-context))

(defn set-file!
  ^js [inlay-hints-context value]
  (set! (.-file ^js inlay-hints-context) value))

(defn program
  "**Returns:** `Program`"
  ^js [inlay-hints-context]
  (.-program ^js inlay-hints-context))

(defn set-program!
  ^js [inlay-hints-context value]
  (set! (.-program ^js inlay-hints-context) value))

(defn cancellation-token
  "**Returns:** `CancellationToken`"
  ^js [inlay-hints-context]
  (.-cancellationToken ^js inlay-hints-context))

(defn set-cancellation-token!
  ^js [inlay-hints-context value]
  (set! (.-cancellationToken ^js inlay-hints-context) value))

(defn host
  "**Returns:** `LanguageServiceHost`"
  ^js [inlay-hints-context]
  (.-host ^js inlay-hints-context))

(defn set-host!
  ^js [inlay-hints-context value]
  (set! (.-host ^js inlay-hints-context) value))

(defn span
  "**Returns:** `TextSpan`"
  ^js [inlay-hints-context]
  (.-span ^js inlay-hints-context))

(defn set-span!
  ^js [inlay-hints-context value]
  (set! (.-span ^js inlay-hints-context) value))

(defn preferences
  "**Returns:** `UserPreferences`"
  ^js [inlay-hints-context]
  (.-preferences ^js inlay-hints-context))

(defn set-preferences!
  ^js [inlay-hints-context value]
  (set! (.-preferences ^js inlay-hints-context) value))
