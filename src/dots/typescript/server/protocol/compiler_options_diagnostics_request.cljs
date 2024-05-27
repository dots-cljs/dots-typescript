(ns dots.typescript.server.protocol.compiler-options-diagnostics-request
  "A request to retrieve compiler options diagnostics for a project"
  (:refer-clojure :exclude [seq type]))

(defn arguments
  "**Returns:** `CompilerOptionsDiagnosticsRequestArgs`"
  ^js [compiler-options-diagnostics-request]
  (.-arguments ^js compiler-options-diagnostics-request))

(defn set-arguments!
  ^js [compiler-options-diagnostics-request value]
  (set! (.-arguments ^js compiler-options-diagnostics-request) value))

(defn type
  "**Returns:** `\"request\"`"
  ^js [compiler-options-diagnostics-request]
  (.-type ^js compiler-options-diagnostics-request))

(defn set-type!
  ^js [compiler-options-diagnostics-request value]
  (set! (.-type ^js compiler-options-diagnostics-request) value))

(defn command
  "The command to execute
   
   **Returns:** `string`"
  ^js [compiler-options-diagnostics-request]
  (.-command ^js compiler-options-diagnostics-request))

(defn set-command!
  "The command to execute"
  ^js [compiler-options-diagnostics-request value]
  (set! (.-command ^js compiler-options-diagnostics-request) value))

(defn seq
  "Sequence number of the message
   
   **Returns:** `number`"
  ^js [compiler-options-diagnostics-request]
  (.-seq ^js compiler-options-diagnostics-request))

(defn set-seq!
  "Sequence number of the message"
  ^js [compiler-options-diagnostics-request value]
  (set! (.-seq ^js compiler-options-diagnostics-request) value))
