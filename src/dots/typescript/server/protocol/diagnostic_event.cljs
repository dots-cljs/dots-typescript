(ns dots.typescript.server.protocol.diagnostic-event
  "Event message for DiagnosticEventKind event types.
   These events provide syntactic and semantic errors for a file."
  (:refer-clojure :exclude [seq type]))

(defn body
  "**Returns:** `DiagnosticEventBody | undefined`"
  ^js [diagnostic-event]
  (.-body ^js diagnostic-event))

(defn set-body!
  ^js [diagnostic-event value]
  (set! (.-body ^js diagnostic-event) value))

(defn event
  "**Returns:** `DiagnosticEventKind`"
  ^js [diagnostic-event]
  (.-event ^js diagnostic-event))

(defn set-event!
  ^js [diagnostic-event value]
  (set! (.-event ^js diagnostic-event) value))

(defn type
  "**Returns:** `\"event\"`"
  ^js [diagnostic-event]
  (.-type ^js diagnostic-event))

(defn set-type!
  ^js [diagnostic-event value]
  (set! (.-type ^js diagnostic-event) value))

(defn seq
  "Sequence number of the message
   
   **Returns:** `number`"
  ^js [diagnostic-event]
  (.-seq ^js diagnostic-event))

(defn set-seq!
  "Sequence number of the message"
  ^js [diagnostic-event value]
  (set! (.-seq ^js diagnostic-event) value))
