(ns dots.typescript.server.protocol.implementation-response
  "Implementation response message.  Gives text range for implementations."
  (:refer-clojure :exclude [seq type]))

(defn body
  ^js [implementation-response]
  (.-body ^js implementation-response))

(defn set-body!
  ^js [implementation-response value]
  (set! (.-body ^js implementation-response) value))

(defn type
  ^js [implementation-response]
  (.-type ^js implementation-response))

(defn set-type!
  ^js [implementation-response value]
  (set! (.-type ^js implementation-response) value))

(defn request-seq
  "Sequence number of the request message."
  ^js [implementation-response]
  (.-request_seq ^js implementation-response))

(defn set-request-seq!
  "Sequence number of the request message."
  ^js [implementation-response value]
  (set! (.-request_seq ^js implementation-response) value))

(defn success?
  "Outcome of the request."
  ^js [implementation-response]
  (.-success ^js implementation-response))

(defn set-success!
  "Outcome of the request."
  ^js [implementation-response value]
  (set! (.-success ^js implementation-response) value))

(defn command
  "The command requested."
  ^js [implementation-response]
  (.-command ^js implementation-response))

(defn set-command!
  "The command requested."
  ^js [implementation-response value]
  (set! (.-command ^js implementation-response) value))

(defn message
  "If success === false, this should always be provided.
   Otherwise, may (or may not) contain a success message."
  ^js [implementation-response]
  (.-message ^js implementation-response))

(defn set-message!
  "If success === false, this should always be provided.
   Otherwise, may (or may not) contain a success message."
  ^js [implementation-response value]
  (set! (.-message ^js implementation-response) value))

(defn metadata
  "Contains extra information that plugin can include to be passed on"
  ^js [implementation-response]
  (.-metadata ^js implementation-response))

(defn set-metadata!
  "Contains extra information that plugin can include to be passed on"
  ^js [implementation-response value]
  (set! (.-metadata ^js implementation-response) value))

(defn performance-data
  "Exposes information about the performance of this request-response pair."
  ^js [implementation-response]
  (.-performanceData ^js implementation-response))

(defn set-performance-data!
  "Exposes information about the performance of this request-response pair."
  ^js [implementation-response value]
  (set! (.-performanceData ^js implementation-response) value))

(defn seq
  "Sequence number of the message"
  ^js [implementation-response]
  (.-seq ^js implementation-response))

(defn set-seq!
  "Sequence number of the message"
  ^js [implementation-response value]
  (set! (.-seq ^js implementation-response) value))
