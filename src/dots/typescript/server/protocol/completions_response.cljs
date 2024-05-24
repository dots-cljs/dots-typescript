(ns dots.typescript.server.protocol.completions-response
  (:refer-clojure :exclude [seq type]))

(defn body
  ^js [completions-response]
  (.-body ^js completions-response))

(defn set-body!
  ^js [completions-response value]
  (set! (.-body ^js completions-response) value))

(defn type
  ^js [completions-response]
  (.-type ^js completions-response))

(defn set-type!
  ^js [completions-response value]
  (set! (.-type ^js completions-response) value))

(defn request-seq
  "Sequence number of the request message."
  ^js [completions-response]
  (.-request_seq ^js completions-response))

(defn set-request-seq!
  "Sequence number of the request message."
  ^js [completions-response value]
  (set! (.-request_seq ^js completions-response) value))

(defn success?
  "Outcome of the request."
  ^js [completions-response]
  (.-success ^js completions-response))

(defn set-success!
  "Outcome of the request."
  ^js [completions-response value]
  (set! (.-success ^js completions-response) value))

(defn command
  "The command requested."
  ^js [completions-response]
  (.-command ^js completions-response))

(defn set-command!
  "The command requested."
  ^js [completions-response value]
  (set! (.-command ^js completions-response) value))

(defn message
  "If success === false, this should always be provided.
   Otherwise, may (or may not) contain a success message."
  ^js [completions-response]
  (.-message ^js completions-response))

(defn set-message!
  "If success === false, this should always be provided.
   Otherwise, may (or may not) contain a success message."
  ^js [completions-response value]
  (set! (.-message ^js completions-response) value))

(defn metadata
  "Contains extra information that plugin can include to be passed on"
  ^js [completions-response]
  (.-metadata ^js completions-response))

(defn set-metadata!
  "Contains extra information that plugin can include to be passed on"
  ^js [completions-response value]
  (set! (.-metadata ^js completions-response) value))

(defn performance-data
  "Exposes information about the performance of this request-response pair."
  ^js [completions-response]
  (.-performanceData ^js completions-response))

(defn set-performance-data!
  "Exposes information about the performance of this request-response pair."
  ^js [completions-response value]
  (set! (.-performanceData ^js completions-response) value))

(defn seq
  "Sequence number of the message"
  ^js [completions-response]
  (.-seq ^js completions-response))

(defn set-seq!
  "Sequence number of the message"
  ^js [completions-response value]
  (set! (.-seq ^js completions-response) value))
