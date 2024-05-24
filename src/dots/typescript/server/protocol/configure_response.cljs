(ns dots.typescript.server.protocol.configure-response
  "Response to \"configure\" request.  This is just an acknowledgement, so
   no body field is required."
  (:refer-clojure :exclude [seq type]))

(defn type
  ^js [configure-response]
  (.-type ^js configure-response))

(defn set-type!
  ^js [configure-response value]
  (set! (.-type ^js configure-response) value))

(defn request-seq
  "Sequence number of the request message."
  ^js [configure-response]
  (.-request_seq ^js configure-response))

(defn set-request-seq!
  "Sequence number of the request message."
  ^js [configure-response value]
  (set! (.-request_seq ^js configure-response) value))

(defn success?
  "Outcome of the request."
  ^js [configure-response]
  (.-success ^js configure-response))

(defn set-success!
  "Outcome of the request."
  ^js [configure-response value]
  (set! (.-success ^js configure-response) value))

(defn command
  "The command requested."
  ^js [configure-response]
  (.-command ^js configure-response))

(defn set-command!
  "The command requested."
  ^js [configure-response value]
  (set! (.-command ^js configure-response) value))

(defn message
  "If success === false, this should always be provided.
   Otherwise, may (or may not) contain a success message."
  ^js [configure-response]
  (.-message ^js configure-response))

(defn set-message!
  "If success === false, this should always be provided.
   Otherwise, may (or may not) contain a success message."
  ^js [configure-response value]
  (set! (.-message ^js configure-response) value))

(defn body
  "Contains message body if success === true."
  ^js [configure-response]
  (.-body ^js configure-response))

(defn set-body!
  "Contains message body if success === true."
  ^js [configure-response value]
  (set! (.-body ^js configure-response) value))

(defn metadata
  "Contains extra information that plugin can include to be passed on"
  ^js [configure-response]
  (.-metadata ^js configure-response))

(defn set-metadata!
  "Contains extra information that plugin can include to be passed on"
  ^js [configure-response value]
  (set! (.-metadata ^js configure-response) value))

(defn performance-data
  "Exposes information about the performance of this request-response pair."
  ^js [configure-response]
  (.-performanceData ^js configure-response))

(defn set-performance-data!
  "Exposes information about the performance of this request-response pair."
  ^js [configure-response value]
  (set! (.-performanceData ^js configure-response) value))

(defn seq
  "Sequence number of the message"
  ^js [configure-response]
  (.-seq ^js configure-response))

(defn set-seq!
  "Sequence number of the message"
  ^js [configure-response value]
  (set! (.-seq ^js configure-response) value))
