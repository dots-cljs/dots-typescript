(ns dots.typescript.server.protocol.provide-call-hierarchy-incoming-calls-response
  (:refer-clojure :exclude [seq type]))

(defn body
  ^js [provide-call-hierarchy-incoming-calls-response]
  (.-body ^js provide-call-hierarchy-incoming-calls-response))

(defn type
  ^js [provide-call-hierarchy-incoming-calls-response]
  (.-type ^js provide-call-hierarchy-incoming-calls-response))

(defn set-type!
  ^js [provide-call-hierarchy-incoming-calls-response value]
  (set! (.-type ^js provide-call-hierarchy-incoming-calls-response) value))

(defn request-seq
  "Sequence number of the request message."
  ^js [provide-call-hierarchy-incoming-calls-response]
  (.-request_seq ^js provide-call-hierarchy-incoming-calls-response))

(defn set-request-seq!
  "Sequence number of the request message."
  ^js [provide-call-hierarchy-incoming-calls-response value]
  (set! (.-request_seq ^js provide-call-hierarchy-incoming-calls-response) value))

(defn success?
  "Outcome of the request."
  ^js [provide-call-hierarchy-incoming-calls-response]
  (.-success ^js provide-call-hierarchy-incoming-calls-response))

(defn set-success!
  "Outcome of the request."
  ^js [provide-call-hierarchy-incoming-calls-response value]
  (set! (.-success ^js provide-call-hierarchy-incoming-calls-response) value))

(defn command
  "The command requested."
  ^js [provide-call-hierarchy-incoming-calls-response]
  (.-command ^js provide-call-hierarchy-incoming-calls-response))

(defn set-command!
  "The command requested."
  ^js [provide-call-hierarchy-incoming-calls-response value]
  (set! (.-command ^js provide-call-hierarchy-incoming-calls-response) value))

(defn message
  "If success === false, this should always be provided.
   Otherwise, may (or may not) contain a success message."
  ^js [provide-call-hierarchy-incoming-calls-response]
  (.-message ^js provide-call-hierarchy-incoming-calls-response))

(defn set-message!
  "If success === false, this should always be provided.
   Otherwise, may (or may not) contain a success message."
  ^js [provide-call-hierarchy-incoming-calls-response value]
  (set! (.-message ^js provide-call-hierarchy-incoming-calls-response) value))

(defn metadata
  "Contains extra information that plugin can include to be passed on"
  ^js [provide-call-hierarchy-incoming-calls-response]
  (.-metadata ^js provide-call-hierarchy-incoming-calls-response))

(defn set-metadata!
  "Contains extra information that plugin can include to be passed on"
  ^js [provide-call-hierarchy-incoming-calls-response value]
  (set! (.-metadata ^js provide-call-hierarchy-incoming-calls-response) value))

(defn performance-data
  "Exposes information about the performance of this request-response pair."
  ^js [provide-call-hierarchy-incoming-calls-response]
  (.-performanceData ^js provide-call-hierarchy-incoming-calls-response))

(defn set-performance-data!
  "Exposes information about the performance of this request-response pair."
  ^js [provide-call-hierarchy-incoming-calls-response value]
  (set! (.-performanceData ^js provide-call-hierarchy-incoming-calls-response) value))

(defn seq
  "Sequence number of the message"
  ^js [provide-call-hierarchy-incoming-calls-response]
  (.-seq ^js provide-call-hierarchy-incoming-calls-response))

(defn set-seq!
  "Sequence number of the message"
  ^js [provide-call-hierarchy-incoming-calls-response value]
  (set! (.-seq ^js provide-call-hierarchy-incoming-calls-response) value))
