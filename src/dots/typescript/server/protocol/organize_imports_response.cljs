(ns dots.typescript.server.protocol.organize-imports-response
  (:refer-clojure :exclude [seq type]))

(defn body
  ^js [organize-imports-response]
  (.-body ^js organize-imports-response))

(defn set-body!
  ^js [organize-imports-response value]
  (set! (.-body ^js organize-imports-response) value))

(defn type
  ^js [organize-imports-response]
  (.-type ^js organize-imports-response))

(defn set-type!
  ^js [organize-imports-response value]
  (set! (.-type ^js organize-imports-response) value))

(defn request-seq
  "Sequence number of the request message."
  ^js [organize-imports-response]
  (.-request_seq ^js organize-imports-response))

(defn set-request-seq!
  "Sequence number of the request message."
  ^js [organize-imports-response value]
  (set! (.-request_seq ^js organize-imports-response) value))

(defn success?
  "Outcome of the request."
  ^js [organize-imports-response]
  (.-success ^js organize-imports-response))

(defn set-success!
  "Outcome of the request."
  ^js [organize-imports-response value]
  (set! (.-success ^js organize-imports-response) value))

(defn command
  "The command requested."
  ^js [organize-imports-response]
  (.-command ^js organize-imports-response))

(defn set-command!
  "The command requested."
  ^js [organize-imports-response value]
  (set! (.-command ^js organize-imports-response) value))

(defn message
  "If success === false, this should always be provided.
   Otherwise, may (or may not) contain a success message."
  ^js [organize-imports-response]
  (.-message ^js organize-imports-response))

(defn set-message!
  "If success === false, this should always be provided.
   Otherwise, may (or may not) contain a success message."
  ^js [organize-imports-response value]
  (set! (.-message ^js organize-imports-response) value))

(defn metadata
  "Contains extra information that plugin can include to be passed on"
  ^js [organize-imports-response]
  (.-metadata ^js organize-imports-response))

(defn set-metadata!
  "Contains extra information that plugin can include to be passed on"
  ^js [organize-imports-response value]
  (set! (.-metadata ^js organize-imports-response) value))

(defn performance-data
  "Exposes information about the performance of this request-response pair."
  ^js [organize-imports-response]
  (.-performanceData ^js organize-imports-response))

(defn set-performance-data!
  "Exposes information about the performance of this request-response pair."
  ^js [organize-imports-response value]
  (set! (.-performanceData ^js organize-imports-response) value))

(defn seq
  "Sequence number of the message"
  ^js [organize-imports-response]
  (.-seq ^js organize-imports-response))

(defn set-seq!
  "Sequence number of the message"
  ^js [organize-imports-response value]
  (set! (.-seq ^js organize-imports-response) value))
