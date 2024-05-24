(ns dots.typescript.server.protocol.diagnostic-event-body)

(defn file
  "The file for which diagnostic information is reported."
  ^js [diagnostic-event-body]
  (.-file ^js diagnostic-event-body))

(defn set-file!
  "The file for which diagnostic information is reported."
  ^js [diagnostic-event-body value]
  (set! (.-file ^js diagnostic-event-body) value))

(defn diagnostics
  "An array of diagnostic information items."
  ^js [diagnostic-event-body]
  (.-diagnostics ^js diagnostic-event-body))

(defn set-diagnostics!
  "An array of diagnostic information items."
  ^js [diagnostic-event-body value]
  (set! (.-diagnostics ^js diagnostic-event-body) value))
