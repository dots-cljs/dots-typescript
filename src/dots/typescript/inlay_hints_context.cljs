(ns dots.typescript.inlay-hints-context)

(defn file
  ^js [inlay-hints-context]
  (.-file ^js inlay-hints-context))

(defn set-file!
  ^js [inlay-hints-context value]
  (set! (.-file ^js inlay-hints-context) value))

(defn program
  ^js [inlay-hints-context]
  (.-program ^js inlay-hints-context))

(defn set-program!
  ^js [inlay-hints-context value]
  (set! (.-program ^js inlay-hints-context) value))

(defn cancellation-token
  ^js [inlay-hints-context]
  (.-cancellationToken ^js inlay-hints-context))

(defn set-cancellation-token!
  ^js [inlay-hints-context value]
  (set! (.-cancellationToken ^js inlay-hints-context) value))

(defn host
  ^js [inlay-hints-context]
  (.-host ^js inlay-hints-context))

(defn set-host!
  ^js [inlay-hints-context value]
  (set! (.-host ^js inlay-hints-context) value))

(defn span
  ^js [inlay-hints-context]
  (.-span ^js inlay-hints-context))

(defn set-span!
  ^js [inlay-hints-context value]
  (set! (.-span ^js inlay-hints-context) value))

(defn preferences
  ^js [inlay-hints-context]
  (.-preferences ^js inlay-hints-context))

(defn set-preferences!
  ^js [inlay-hints-context value]
  (set! (.-preferences ^js inlay-hints-context) value))
