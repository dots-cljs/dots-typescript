(ns dots.typescript.server.protocol.file-references-response
  (:refer-clojure :exclude [seq type]))

(defn body
  ^js [file-references-response]
  (.-body ^js file-references-response))

(defn set-body!
  ^js [file-references-response value]
  (set! (.-body ^js file-references-response) value))

(defn type
  ^js [file-references-response]
  (.-type ^js file-references-response))

(defn set-type!
  ^js [file-references-response value]
  (set! (.-type ^js file-references-response) value))

(defn request-seq
  "Sequence number of the request message."
  ^js [file-references-response]
  (.-request_seq ^js file-references-response))

(defn set-request-seq!
  "Sequence number of the request message."
  ^js [file-references-response value]
  (set! (.-request_seq ^js file-references-response) value))

(defn success?
  "Outcome of the request."
  ^js [file-references-response]
  (.-success ^js file-references-response))

(defn set-success!
  "Outcome of the request."
  ^js [file-references-response value]
  (set! (.-success ^js file-references-response) value))

(defn command
  "The command requested."
  ^js [file-references-response]
  (.-command ^js file-references-response))

(defn set-command!
  "The command requested."
  ^js [file-references-response value]
  (set! (.-command ^js file-references-response) value))

(defn message
  "If success === false, this should always be provided.
   Otherwise, may (or may not) contain a success message."
  ^js [file-references-response]
  (.-message ^js file-references-response))

(defn set-message!
  "If success === false, this should always be provided.
   Otherwise, may (or may not) contain a success message."
  ^js [file-references-response value]
  (set! (.-message ^js file-references-response) value))

(defn metadata
  "Contains extra information that plugin can include to be passed on"
  ^js [file-references-response]
  (.-metadata ^js file-references-response))

(defn set-metadata!
  "Contains extra information that plugin can include to be passed on"
  ^js [file-references-response value]
  (set! (.-metadata ^js file-references-response) value))

(defn performance-data
  "Exposes information about the performance of this request-response pair."
  ^js [file-references-response]
  (.-performanceData ^js file-references-response))

(defn set-performance-data!
  "Exposes information about the performance of this request-response pair."
  ^js [file-references-response value]
  (set! (.-performanceData ^js file-references-response) value))

(defn seq
  "Sequence number of the message"
  ^js [file-references-response]
  (.-seq ^js file-references-response))

(defn set-seq!
  "Sequence number of the message"
  ^js [file-references-response value]
  (set! (.-seq ^js file-references-response) value))
