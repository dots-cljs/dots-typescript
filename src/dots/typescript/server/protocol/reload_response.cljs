(ns dots.typescript.server.protocol.reload-response
  "Response to \"reload\" request. This is just an acknowledgement, so
   no body field is required."
  (:refer-clojure :exclude [seq type]))

(defn type
  ^js [reload-response]
  (.-type ^js reload-response))

(defn set-type!
  ^js [reload-response value]
  (set! (.-type ^js reload-response) value))

(defn request-seq
  "Sequence number of the request message."
  ^js [reload-response]
  (.-request_seq ^js reload-response))

(defn set-request-seq!
  "Sequence number of the request message."
  ^js [reload-response value]
  (set! (.-request_seq ^js reload-response) value))

(defn success?
  "Outcome of the request."
  ^js [reload-response]
  (.-success ^js reload-response))

(defn set-success!
  "Outcome of the request."
  ^js [reload-response value]
  (set! (.-success ^js reload-response) value))

(defn command
  "The command requested."
  ^js [reload-response]
  (.-command ^js reload-response))

(defn set-command!
  "The command requested."
  ^js [reload-response value]
  (set! (.-command ^js reload-response) value))

(defn message
  "If success === false, this should always be provided.
   Otherwise, may (or may not) contain a success message."
  ^js [reload-response]
  (.-message ^js reload-response))

(defn set-message!
  "If success === false, this should always be provided.
   Otherwise, may (or may not) contain a success message."
  ^js [reload-response value]
  (set! (.-message ^js reload-response) value))

(defn body
  "Contains message body if success === true."
  ^js [reload-response]
  (.-body ^js reload-response))

(defn set-body!
  "Contains message body if success === true."
  ^js [reload-response value]
  (set! (.-body ^js reload-response) value))

(defn metadata
  "Contains extra information that plugin can include to be passed on"
  ^js [reload-response]
  (.-metadata ^js reload-response))

(defn set-metadata!
  "Contains extra information that plugin can include to be passed on"
  ^js [reload-response value]
  (set! (.-metadata ^js reload-response) value))

(defn performance-data
  "Exposes information about the performance of this request-response pair."
  ^js [reload-response]
  (.-performanceData ^js reload-response))

(defn set-performance-data!
  "Exposes information about the performance of this request-response pair."
  ^js [reload-response value]
  (set! (.-performanceData ^js reload-response) value))

(defn seq
  "Sequence number of the message"
  ^js [reload-response]
  (.-seq ^js reload-response))

(defn set-seq!
  "Sequence number of the message"
  ^js [reload-response value]
  (set! (.-seq ^js reload-response) value))
