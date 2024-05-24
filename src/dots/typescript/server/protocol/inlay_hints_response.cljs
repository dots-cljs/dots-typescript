(ns dots.typescript.server.protocol.inlay-hints-response
  (:refer-clojure :exclude [seq type]))

(defn body
  ^js [inlay-hints-response]
  (.-body ^js inlay-hints-response))

(defn set-body!
  ^js [inlay-hints-response value]
  (set! (.-body ^js inlay-hints-response) value))

(defn type
  ^js [inlay-hints-response]
  (.-type ^js inlay-hints-response))

(defn set-type!
  ^js [inlay-hints-response value]
  (set! (.-type ^js inlay-hints-response) value))

(defn request-seq
  "Sequence number of the request message."
  ^js [inlay-hints-response]
  (.-request_seq ^js inlay-hints-response))

(defn set-request-seq!
  "Sequence number of the request message."
  ^js [inlay-hints-response value]
  (set! (.-request_seq ^js inlay-hints-response) value))

(defn success?
  "Outcome of the request."
  ^js [inlay-hints-response]
  (.-success ^js inlay-hints-response))

(defn set-success!
  "Outcome of the request."
  ^js [inlay-hints-response value]
  (set! (.-success ^js inlay-hints-response) value))

(defn command
  "The command requested."
  ^js [inlay-hints-response]
  (.-command ^js inlay-hints-response))

(defn set-command!
  "The command requested."
  ^js [inlay-hints-response value]
  (set! (.-command ^js inlay-hints-response) value))

(defn message
  "If success === false, this should always be provided.
   Otherwise, may (or may not) contain a success message."
  ^js [inlay-hints-response]
  (.-message ^js inlay-hints-response))

(defn set-message!
  "If success === false, this should always be provided.
   Otherwise, may (or may not) contain a success message."
  ^js [inlay-hints-response value]
  (set! (.-message ^js inlay-hints-response) value))

(defn metadata
  "Contains extra information that plugin can include to be passed on"
  ^js [inlay-hints-response]
  (.-metadata ^js inlay-hints-response))

(defn set-metadata!
  "Contains extra information that plugin can include to be passed on"
  ^js [inlay-hints-response value]
  (set! (.-metadata ^js inlay-hints-response) value))

(defn performance-data
  "Exposes information about the performance of this request-response pair."
  ^js [inlay-hints-response]
  (.-performanceData ^js inlay-hints-response))

(defn set-performance-data!
  "Exposes information about the performance of this request-response pair."
  ^js [inlay-hints-response value]
  (set! (.-performanceData ^js inlay-hints-response) value))

(defn seq
  "Sequence number of the message"
  ^js [inlay-hints-response]
  (.-seq ^js inlay-hints-response))

(defn set-seq!
  "Sequence number of the message"
  ^js [inlay-hints-response value]
  (set! (.-seq ^js inlay-hints-response) value))
