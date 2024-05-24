(ns dots.typescript.server.protocol.semantic-diagnostics-sync-response
  "Response object for synchronous sematic diagnostics request."
  (:refer-clojure :exclude [seq type]))

(defn body
  ^js [semantic-diagnostics-sync-response]
  (.-body ^js semantic-diagnostics-sync-response))

(defn set-body!
  ^js [semantic-diagnostics-sync-response value]
  (set! (.-body ^js semantic-diagnostics-sync-response) value))

(defn type
  ^js [semantic-diagnostics-sync-response]
  (.-type ^js semantic-diagnostics-sync-response))

(defn set-type!
  ^js [semantic-diagnostics-sync-response value]
  (set! (.-type ^js semantic-diagnostics-sync-response) value))

(defn request-seq
  "Sequence number of the request message."
  ^js [semantic-diagnostics-sync-response]
  (.-request_seq ^js semantic-diagnostics-sync-response))

(defn set-request-seq!
  "Sequence number of the request message."
  ^js [semantic-diagnostics-sync-response value]
  (set! (.-request_seq ^js semantic-diagnostics-sync-response) value))

(defn success?
  "Outcome of the request."
  ^js [semantic-diagnostics-sync-response]
  (.-success ^js semantic-diagnostics-sync-response))

(defn set-success!
  "Outcome of the request."
  ^js [semantic-diagnostics-sync-response value]
  (set! (.-success ^js semantic-diagnostics-sync-response) value))

(defn command
  "The command requested."
  ^js [semantic-diagnostics-sync-response]
  (.-command ^js semantic-diagnostics-sync-response))

(defn set-command!
  "The command requested."
  ^js [semantic-diagnostics-sync-response value]
  (set! (.-command ^js semantic-diagnostics-sync-response) value))

(defn message
  "If success === false, this should always be provided.
   Otherwise, may (or may not) contain a success message."
  ^js [semantic-diagnostics-sync-response]
  (.-message ^js semantic-diagnostics-sync-response))

(defn set-message!
  "If success === false, this should always be provided.
   Otherwise, may (or may not) contain a success message."
  ^js [semantic-diagnostics-sync-response value]
  (set! (.-message ^js semantic-diagnostics-sync-response) value))

(defn metadata
  "Contains extra information that plugin can include to be passed on"
  ^js [semantic-diagnostics-sync-response]
  (.-metadata ^js semantic-diagnostics-sync-response))

(defn set-metadata!
  "Contains extra information that plugin can include to be passed on"
  ^js [semantic-diagnostics-sync-response value]
  (set! (.-metadata ^js semantic-diagnostics-sync-response) value))

(defn performance-data
  "Exposes information about the performance of this request-response pair."
  ^js [semantic-diagnostics-sync-response]
  (.-performanceData ^js semantic-diagnostics-sync-response))

(defn set-performance-data!
  "Exposes information about the performance of this request-response pair."
  ^js [semantic-diagnostics-sync-response value]
  (set! (.-performanceData ^js semantic-diagnostics-sync-response) value))

(defn seq
  "Sequence number of the message"
  ^js [semantic-diagnostics-sync-response]
  (.-seq ^js semantic-diagnostics-sync-response))

(defn set-seq!
  "Sequence number of the message"
  ^js [semantic-diagnostics-sync-response value]
  (set! (.-seq ^js semantic-diagnostics-sync-response) value))
