(ns dots.typescript.server.protocol.semantic-diagnostics-sync-request
  "Synchronous request for semantic diagnostics of one file."
  (:refer-clojure :exclude [seq type]))

(defn command
  "**Returns:** `CommandTypes.SemanticDiagnosticsSync`"
  ^js [semantic-diagnostics-sync-request]
  (.-command ^js semantic-diagnostics-sync-request))

(defn set-command!
  ^js [semantic-diagnostics-sync-request value]
  (set! (.-command ^js semantic-diagnostics-sync-request) value))

(defn arguments
  "**Returns:** `SemanticDiagnosticsSyncRequestArgs`"
  ^js [semantic-diagnostics-sync-request]
  (.-arguments ^js semantic-diagnostics-sync-request))

(defn set-arguments!
  ^js [semantic-diagnostics-sync-request value]
  (set! (.-arguments ^js semantic-diagnostics-sync-request) value))

(defn type
  "**Returns:** `\"request\"`"
  ^js [semantic-diagnostics-sync-request]
  (.-type ^js semantic-diagnostics-sync-request))

(defn set-type!
  ^js [semantic-diagnostics-sync-request value]
  (set! (.-type ^js semantic-diagnostics-sync-request) value))

(defn seq
  "Sequence number of the message
   
   **Returns:** `number`"
  ^js [semantic-diagnostics-sync-request]
  (.-seq ^js semantic-diagnostics-sync-request))

(defn set-seq!
  "Sequence number of the message"
  ^js [semantic-diagnostics-sync-request value]
  (set! (.-seq ^js semantic-diagnostics-sync-request) value))
