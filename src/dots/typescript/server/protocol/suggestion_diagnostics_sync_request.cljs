(ns dots.typescript.server.protocol.suggestion-diagnostics-sync-request
  (:refer-clojure :exclude [seq type]))

(defn command
  "**Returns:** `CommandTypes.SuggestionDiagnosticsSync`"
  ^js [suggestion-diagnostics-sync-request]
  (.-command ^js suggestion-diagnostics-sync-request))

(defn set-command!
  ^js [suggestion-diagnostics-sync-request value]
  (set! (.-command ^js suggestion-diagnostics-sync-request) value))

(defn arguments
  "**Returns:** `SemanticDiagnosticsSyncRequestArgs`"
  ^js [suggestion-diagnostics-sync-request]
  (.-arguments ^js suggestion-diagnostics-sync-request))

(defn set-arguments!
  ^js [suggestion-diagnostics-sync-request value]
  (set! (.-arguments ^js suggestion-diagnostics-sync-request) value))

(defn type
  "**Returns:** `\"request\"`"
  ^js [suggestion-diagnostics-sync-request]
  (.-type ^js suggestion-diagnostics-sync-request))

(defn set-type!
  ^js [suggestion-diagnostics-sync-request value]
  (set! (.-type ^js suggestion-diagnostics-sync-request) value))

(defn seq
  "Sequence number of the message
   
   **Returns:** `number`"
  ^js [suggestion-diagnostics-sync-request]
  (.-seq ^js suggestion-diagnostics-sync-request))

(defn set-seq!
  "Sequence number of the message"
  ^js [suggestion-diagnostics-sync-request value]
  (set! (.-seq ^js suggestion-diagnostics-sync-request) value))
