(ns dots.typescript.server.protocol.syntactic-diagnostics-sync-request
  "Synchronous request for syntactic diagnostics of one file."
  (:refer-clojure :exclude [seq type]))

(defn command
  "**Returns:** `CommandTypes.SyntacticDiagnosticsSync`"
  ^js [syntactic-diagnostics-sync-request]
  (.-command ^js syntactic-diagnostics-sync-request))

(defn set-command!
  ^js [syntactic-diagnostics-sync-request value]
  (set! (.-command ^js syntactic-diagnostics-sync-request) value))

(defn arguments
  "**Returns:** `SyntacticDiagnosticsSyncRequestArgs`"
  ^js [syntactic-diagnostics-sync-request]
  (.-arguments ^js syntactic-diagnostics-sync-request))

(defn set-arguments!
  ^js [syntactic-diagnostics-sync-request value]
  (set! (.-arguments ^js syntactic-diagnostics-sync-request) value))

(defn type
  "**Returns:** `\"request\"`"
  ^js [syntactic-diagnostics-sync-request]
  (.-type ^js syntactic-diagnostics-sync-request))

(defn set-type!
  ^js [syntactic-diagnostics-sync-request value]
  (set! (.-type ^js syntactic-diagnostics-sync-request) value))

(defn seq
  "Sequence number of the message
   
   **Returns:** `number`"
  ^js [syntactic-diagnostics-sync-request]
  (.-seq ^js syntactic-diagnostics-sync-request))

(defn set-seq!
  "Sequence number of the message"
  ^js [syntactic-diagnostics-sync-request value]
  (set! (.-seq ^js syntactic-diagnostics-sync-request) value))
