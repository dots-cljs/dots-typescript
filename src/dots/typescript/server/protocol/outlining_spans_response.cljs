(ns dots.typescript.server.protocol.outlining-spans-response
  "Response to OutliningSpansRequest request."
  (:refer-clojure :exclude [seq type]))

(defn body
  ^js [outlining-spans-response]
  (.-body ^js outlining-spans-response))

(defn set-body!
  ^js [outlining-spans-response value]
  (set! (.-body ^js outlining-spans-response) value))

(defn type
  ^js [outlining-spans-response]
  (.-type ^js outlining-spans-response))

(defn set-type!
  ^js [outlining-spans-response value]
  (set! (.-type ^js outlining-spans-response) value))

(defn request-seq
  "Sequence number of the request message."
  ^js [outlining-spans-response]
  (.-request_seq ^js outlining-spans-response))

(defn set-request-seq!
  "Sequence number of the request message."
  ^js [outlining-spans-response value]
  (set! (.-request_seq ^js outlining-spans-response) value))

(defn success?
  "Outcome of the request."
  ^js [outlining-spans-response]
  (.-success ^js outlining-spans-response))

(defn set-success!
  "Outcome of the request."
  ^js [outlining-spans-response value]
  (set! (.-success ^js outlining-spans-response) value))

(defn command
  "The command requested."
  ^js [outlining-spans-response]
  (.-command ^js outlining-spans-response))

(defn set-command!
  "The command requested."
  ^js [outlining-spans-response value]
  (set! (.-command ^js outlining-spans-response) value))

(defn message
  "If success === false, this should always be provided.
   Otherwise, may (or may not) contain a success message."
  ^js [outlining-spans-response]
  (.-message ^js outlining-spans-response))

(defn set-message!
  "If success === false, this should always be provided.
   Otherwise, may (or may not) contain a success message."
  ^js [outlining-spans-response value]
  (set! (.-message ^js outlining-spans-response) value))

(defn metadata
  "Contains extra information that plugin can include to be passed on"
  ^js [outlining-spans-response]
  (.-metadata ^js outlining-spans-response))

(defn set-metadata!
  "Contains extra information that plugin can include to be passed on"
  ^js [outlining-spans-response value]
  (set! (.-metadata ^js outlining-spans-response) value))

(defn performance-data
  "Exposes information about the performance of this request-response pair."
  ^js [outlining-spans-response]
  (.-performanceData ^js outlining-spans-response))

(defn set-performance-data!
  "Exposes information about the performance of this request-response pair."
  ^js [outlining-spans-response value]
  (set! (.-performanceData ^js outlining-spans-response) value))

(defn seq
  "Sequence number of the message"
  ^js [outlining-spans-response]
  (.-seq ^js outlining-spans-response))

(defn set-seq!
  "Sequence number of the message"
  ^js [outlining-spans-response value]
  (set! (.-seq ^js outlining-spans-response) value))
