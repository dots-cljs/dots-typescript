(ns dots.typescript.server.protocol.type-definition-response
  "Definition response message.  Gives text range for definition."
  (:refer-clojure :exclude [seq type]))

(defn body
  ^js [type-definition-response]
  (.-body ^js type-definition-response))

(defn set-body!
  ^js [type-definition-response value]
  (set! (.-body ^js type-definition-response) value))

(defn type
  ^js [type-definition-response]
  (.-type ^js type-definition-response))

(defn set-type!
  ^js [type-definition-response value]
  (set! (.-type ^js type-definition-response) value))

(defn request-seq
  "Sequence number of the request message."
  ^js [type-definition-response]
  (.-request_seq ^js type-definition-response))

(defn set-request-seq!
  "Sequence number of the request message."
  ^js [type-definition-response value]
  (set! (.-request_seq ^js type-definition-response) value))

(defn success?
  "Outcome of the request."
  ^js [type-definition-response]
  (.-success ^js type-definition-response))

(defn set-success!
  "Outcome of the request."
  ^js [type-definition-response value]
  (set! (.-success ^js type-definition-response) value))

(defn command
  "The command requested."
  ^js [type-definition-response]
  (.-command ^js type-definition-response))

(defn set-command!
  "The command requested."
  ^js [type-definition-response value]
  (set! (.-command ^js type-definition-response) value))

(defn message
  "If success === false, this should always be provided.
   Otherwise, may (or may not) contain a success message."
  ^js [type-definition-response]
  (.-message ^js type-definition-response))

(defn set-message!
  "If success === false, this should always be provided.
   Otherwise, may (or may not) contain a success message."
  ^js [type-definition-response value]
  (set! (.-message ^js type-definition-response) value))

(defn metadata
  "Contains extra information that plugin can include to be passed on"
  ^js [type-definition-response]
  (.-metadata ^js type-definition-response))

(defn set-metadata!
  "Contains extra information that plugin can include to be passed on"
  ^js [type-definition-response value]
  (set! (.-metadata ^js type-definition-response) value))

(defn performance-data
  "Exposes information about the performance of this request-response pair."
  ^js [type-definition-response]
  (.-performanceData ^js type-definition-response))

(defn set-performance-data!
  "Exposes information about the performance of this request-response pair."
  ^js [type-definition-response value]
  (set! (.-performanceData ^js type-definition-response) value))

(defn seq
  "Sequence number of the message"
  ^js [type-definition-response]
  (.-seq ^js type-definition-response))

(defn set-seq!
  "Sequence number of the message"
  ^js [type-definition-response value]
  (set! (.-seq ^js type-definition-response) value))
