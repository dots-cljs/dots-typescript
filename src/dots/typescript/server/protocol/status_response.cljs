(ns dots.typescript.server.protocol.status-response
  "Response to StatusRequest"
  (:refer-clojure :exclude [seq type]))

(defn body
  ^js [status-response]
  (.-body ^js status-response))

(defn set-body!
  ^js [status-response value]
  (set! (.-body ^js status-response) value))

(defn type
  ^js [status-response]
  (.-type ^js status-response))

(defn set-type!
  ^js [status-response value]
  (set! (.-type ^js status-response) value))

(defn request-seq
  "Sequence number of the request message."
  ^js [status-response]
  (.-request_seq ^js status-response))

(defn set-request-seq!
  "Sequence number of the request message."
  ^js [status-response value]
  (set! (.-request_seq ^js status-response) value))

(defn success?
  "Outcome of the request."
  ^js [status-response]
  (.-success ^js status-response))

(defn set-success!
  "Outcome of the request."
  ^js [status-response value]
  (set! (.-success ^js status-response) value))

(defn command
  "The command requested."
  ^js [status-response]
  (.-command ^js status-response))

(defn set-command!
  "The command requested."
  ^js [status-response value]
  (set! (.-command ^js status-response) value))

(defn message
  "If success === false, this should always be provided.
   Otherwise, may (or may not) contain a success message."
  ^js [status-response]
  (.-message ^js status-response))

(defn set-message!
  "If success === false, this should always be provided.
   Otherwise, may (or may not) contain a success message."
  ^js [status-response value]
  (set! (.-message ^js status-response) value))

(defn metadata
  "Contains extra information that plugin can include to be passed on"
  ^js [status-response]
  (.-metadata ^js status-response))

(defn set-metadata!
  "Contains extra information that plugin can include to be passed on"
  ^js [status-response value]
  (set! (.-metadata ^js status-response) value))

(defn performance-data
  "Exposes information about the performance of this request-response pair."
  ^js [status-response]
  (.-performanceData ^js status-response))

(defn set-performance-data!
  "Exposes information about the performance of this request-response pair."
  ^js [status-response value]
  (set! (.-performanceData ^js status-response) value))

(defn seq
  "Sequence number of the message"
  ^js [status-response]
  (.-seq ^js status-response))

(defn set-seq!
  "Sequence number of the message"
  ^js [status-response value]
  (set! (.-seq ^js status-response) value))
