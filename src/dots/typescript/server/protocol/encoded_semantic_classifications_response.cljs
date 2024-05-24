(ns dots.typescript.server.protocol.encoded-semantic-classifications-response
  "The response for a EncodedSemanticClassificationsRequest"
  (:refer-clojure :exclude [seq type]))

(defn body
  ^js [encoded-semantic-classifications-response]
  (.-body ^js encoded-semantic-classifications-response))

(defn set-body!
  ^js [encoded-semantic-classifications-response value]
  (set! (.-body ^js encoded-semantic-classifications-response) value))

(defn type
  ^js [encoded-semantic-classifications-response]
  (.-type ^js encoded-semantic-classifications-response))

(defn set-type!
  ^js [encoded-semantic-classifications-response value]
  (set! (.-type ^js encoded-semantic-classifications-response) value))

(defn request-seq
  "Sequence number of the request message."
  ^js [encoded-semantic-classifications-response]
  (.-request_seq ^js encoded-semantic-classifications-response))

(defn set-request-seq!
  "Sequence number of the request message."
  ^js [encoded-semantic-classifications-response value]
  (set! (.-request_seq ^js encoded-semantic-classifications-response) value))

(defn success?
  "Outcome of the request."
  ^js [encoded-semantic-classifications-response]
  (.-success ^js encoded-semantic-classifications-response))

(defn set-success!
  "Outcome of the request."
  ^js [encoded-semantic-classifications-response value]
  (set! (.-success ^js encoded-semantic-classifications-response) value))

(defn command
  "The command requested."
  ^js [encoded-semantic-classifications-response]
  (.-command ^js encoded-semantic-classifications-response))

(defn set-command!
  "The command requested."
  ^js [encoded-semantic-classifications-response value]
  (set! (.-command ^js encoded-semantic-classifications-response) value))

(defn message
  "If success === false, this should always be provided.
   Otherwise, may (or may not) contain a success message."
  ^js [encoded-semantic-classifications-response]
  (.-message ^js encoded-semantic-classifications-response))

(defn set-message!
  "If success === false, this should always be provided.
   Otherwise, may (or may not) contain a success message."
  ^js [encoded-semantic-classifications-response value]
  (set! (.-message ^js encoded-semantic-classifications-response) value))

(defn metadata
  "Contains extra information that plugin can include to be passed on"
  ^js [encoded-semantic-classifications-response]
  (.-metadata ^js encoded-semantic-classifications-response))

(defn set-metadata!
  "Contains extra information that plugin can include to be passed on"
  ^js [encoded-semantic-classifications-response value]
  (set! (.-metadata ^js encoded-semantic-classifications-response) value))

(defn performance-data
  "Exposes information about the performance of this request-response pair."
  ^js [encoded-semantic-classifications-response]
  (.-performanceData ^js encoded-semantic-classifications-response))

(defn set-performance-data!
  "Exposes information about the performance of this request-response pair."
  ^js [encoded-semantic-classifications-response value]
  (set! (.-performanceData ^js encoded-semantic-classifications-response) value))

(defn seq
  "Sequence number of the message"
  ^js [encoded-semantic-classifications-response]
  (.-seq ^js encoded-semantic-classifications-response))

(defn set-seq!
  "Sequence number of the message"
  ^js [encoded-semantic-classifications-response value]
  (set! (.-seq ^js encoded-semantic-classifications-response) value))
