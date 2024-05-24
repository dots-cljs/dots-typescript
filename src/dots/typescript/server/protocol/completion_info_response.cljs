(ns dots.typescript.server.protocol.completion-info-response
  (:refer-clojure :exclude [seq type]))

(defn body
  ^js [completion-info-response]
  (.-body ^js completion-info-response))

(defn set-body!
  ^js [completion-info-response value]
  (set! (.-body ^js completion-info-response) value))

(defn type
  ^js [completion-info-response]
  (.-type ^js completion-info-response))

(defn set-type!
  ^js [completion-info-response value]
  (set! (.-type ^js completion-info-response) value))

(defn request-seq
  "Sequence number of the request message."
  ^js [completion-info-response]
  (.-request_seq ^js completion-info-response))

(defn set-request-seq!
  "Sequence number of the request message."
  ^js [completion-info-response value]
  (set! (.-request_seq ^js completion-info-response) value))

(defn success?
  "Outcome of the request."
  ^js [completion-info-response]
  (.-success ^js completion-info-response))

(defn set-success!
  "Outcome of the request."
  ^js [completion-info-response value]
  (set! (.-success ^js completion-info-response) value))

(defn command
  "The command requested."
  ^js [completion-info-response]
  (.-command ^js completion-info-response))

(defn set-command!
  "The command requested."
  ^js [completion-info-response value]
  (set! (.-command ^js completion-info-response) value))

(defn message
  "If success === false, this should always be provided.
   Otherwise, may (or may not) contain a success message."
  ^js [completion-info-response]
  (.-message ^js completion-info-response))

(defn set-message!
  "If success === false, this should always be provided.
   Otherwise, may (or may not) contain a success message."
  ^js [completion-info-response value]
  (set! (.-message ^js completion-info-response) value))

(defn metadata
  "Contains extra information that plugin can include to be passed on"
  ^js [completion-info-response]
  (.-metadata ^js completion-info-response))

(defn set-metadata!
  "Contains extra information that plugin can include to be passed on"
  ^js [completion-info-response value]
  (set! (.-metadata ^js completion-info-response) value))

(defn performance-data
  "Exposes information about the performance of this request-response pair."
  ^js [completion-info-response]
  (.-performanceData ^js completion-info-response))

(defn set-performance-data!
  "Exposes information about the performance of this request-response pair."
  ^js [completion-info-response value]
  (set! (.-performanceData ^js completion-info-response) value))

(defn seq
  "Sequence number of the message"
  ^js [completion-info-response]
  (.-seq ^js completion-info-response))

(defn set-seq!
  "Sequence number of the message"
  ^js [completion-info-response value]
  (set! (.-seq ^js completion-info-response) value))
