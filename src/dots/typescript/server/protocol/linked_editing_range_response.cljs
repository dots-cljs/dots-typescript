(ns dots.typescript.server.protocol.linked-editing-range-response
  (:refer-clojure :exclude [seq type]))

(defn body
  ^js [linked-editing-range-response]
  (.-body ^js linked-editing-range-response))

(defn type
  ^js [linked-editing-range-response]
  (.-type ^js linked-editing-range-response))

(defn set-type!
  ^js [linked-editing-range-response value]
  (set! (.-type ^js linked-editing-range-response) value))

(defn request-seq
  "Sequence number of the request message."
  ^js [linked-editing-range-response]
  (.-request_seq ^js linked-editing-range-response))

(defn set-request-seq!
  "Sequence number of the request message."
  ^js [linked-editing-range-response value]
  (set! (.-request_seq ^js linked-editing-range-response) value))

(defn success?
  "Outcome of the request."
  ^js [linked-editing-range-response]
  (.-success ^js linked-editing-range-response))

(defn set-success!
  "Outcome of the request."
  ^js [linked-editing-range-response value]
  (set! (.-success ^js linked-editing-range-response) value))

(defn command
  "The command requested."
  ^js [linked-editing-range-response]
  (.-command ^js linked-editing-range-response))

(defn set-command!
  "The command requested."
  ^js [linked-editing-range-response value]
  (set! (.-command ^js linked-editing-range-response) value))

(defn message
  "If success === false, this should always be provided.
   Otherwise, may (or may not) contain a success message."
  ^js [linked-editing-range-response]
  (.-message ^js linked-editing-range-response))

(defn set-message!
  "If success === false, this should always be provided.
   Otherwise, may (or may not) contain a success message."
  ^js [linked-editing-range-response value]
  (set! (.-message ^js linked-editing-range-response) value))

(defn metadata
  "Contains extra information that plugin can include to be passed on"
  ^js [linked-editing-range-response]
  (.-metadata ^js linked-editing-range-response))

(defn set-metadata!
  "Contains extra information that plugin can include to be passed on"
  ^js [linked-editing-range-response value]
  (set! (.-metadata ^js linked-editing-range-response) value))

(defn performance-data
  "Exposes information about the performance of this request-response pair."
  ^js [linked-editing-range-response]
  (.-performanceData ^js linked-editing-range-response))

(defn set-performance-data!
  "Exposes information about the performance of this request-response pair."
  ^js [linked-editing-range-response value]
  (set! (.-performanceData ^js linked-editing-range-response) value))

(defn seq
  "Sequence number of the message"
  ^js [linked-editing-range-response]
  (.-seq ^js linked-editing-range-response))

(defn set-seq!
  "Sequence number of the message"
  ^js [linked-editing-range-response value]
  (set! (.-seq ^js linked-editing-range-response) value))
