(ns dots.typescript.server.protocol.format-response
  "Format and format on key response message."
  (:refer-clojure :exclude [seq type]))

(defn body
  ^js [format-response]
  (.-body ^js format-response))

(defn set-body!
  ^js [format-response value]
  (set! (.-body ^js format-response) value))

(defn type
  ^js [format-response]
  (.-type ^js format-response))

(defn set-type!
  ^js [format-response value]
  (set! (.-type ^js format-response) value))

(defn request-seq
  "Sequence number of the request message."
  ^js [format-response]
  (.-request_seq ^js format-response))

(defn set-request-seq!
  "Sequence number of the request message."
  ^js [format-response value]
  (set! (.-request_seq ^js format-response) value))

(defn success?
  "Outcome of the request."
  ^js [format-response]
  (.-success ^js format-response))

(defn set-success!
  "Outcome of the request."
  ^js [format-response value]
  (set! (.-success ^js format-response) value))

(defn command
  "The command requested."
  ^js [format-response]
  (.-command ^js format-response))

(defn set-command!
  "The command requested."
  ^js [format-response value]
  (set! (.-command ^js format-response) value))

(defn message
  "If success === false, this should always be provided.
   Otherwise, may (or may not) contain a success message."
  ^js [format-response]
  (.-message ^js format-response))

(defn set-message!
  "If success === false, this should always be provided.
   Otherwise, may (or may not) contain a success message."
  ^js [format-response value]
  (set! (.-message ^js format-response) value))

(defn metadata
  "Contains extra information that plugin can include to be passed on"
  ^js [format-response]
  (.-metadata ^js format-response))

(defn set-metadata!
  "Contains extra information that plugin can include to be passed on"
  ^js [format-response value]
  (set! (.-metadata ^js format-response) value))

(defn performance-data
  "Exposes information about the performance of this request-response pair."
  ^js [format-response]
  (.-performanceData ^js format-response))

(defn set-performance-data!
  "Exposes information about the performance of this request-response pair."
  ^js [format-response value]
  (set! (.-performanceData ^js format-response) value))

(defn seq
  "Sequence number of the message"
  ^js [format-response]
  (.-seq ^js format-response))

(defn set-seq!
  "Sequence number of the message"
  ^js [format-response value]
  (set! (.-seq ^js format-response) value))
