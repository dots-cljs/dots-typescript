(ns dots.typescript.server.protocol.config-file-diagnostic-event
  "Event message for \"configFileDiag\" event type.
   This event provides errors for a found config file."
  (:refer-clojure :exclude [seq type]))

(defn body
  "**Returns:** `ConfigFileDiagnosticEventBody | undefined`"
  ^js [config-file-diagnostic-event]
  (.-body ^js config-file-diagnostic-event))

(defn set-body!
  ^js [config-file-diagnostic-event value]
  (set! (.-body ^js config-file-diagnostic-event) value))

(defn event
  "**Returns:** `\"configFileDiag\"`"
  ^js [config-file-diagnostic-event]
  (.-event ^js config-file-diagnostic-event))

(defn set-event!
  ^js [config-file-diagnostic-event value]
  (set! (.-event ^js config-file-diagnostic-event) value))

(defn type
  "**Returns:** `\"event\"`"
  ^js [config-file-diagnostic-event]
  (.-type ^js config-file-diagnostic-event))

(defn set-type!
  ^js [config-file-diagnostic-event value]
  (set! (.-type ^js config-file-diagnostic-event) value))

(defn seq
  "Sequence number of the message
   
   **Returns:** `number`"
  ^js [config-file-diagnostic-event]
  (.-seq ^js config-file-diagnostic-event))

(defn set-seq!
  "Sequence number of the message"
  ^js [config-file-diagnostic-event value]
  (set! (.-seq ^js config-file-diagnostic-event) value))
