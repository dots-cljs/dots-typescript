(ns dots.typescript.server.protocol.compile-on-save-emit-file-response
  (:refer-clojure :exclude [seq type]))

(defn body?
  ^js [compile-on-save-emit-file-response]
  (.-body ^js compile-on-save-emit-file-response))

(defn set-body!
  ^js [compile-on-save-emit-file-response value]
  (set! (.-body ^js compile-on-save-emit-file-response) value))

(defn type
  ^js [compile-on-save-emit-file-response]
  (.-type ^js compile-on-save-emit-file-response))

(defn set-type!
  ^js [compile-on-save-emit-file-response value]
  (set! (.-type ^js compile-on-save-emit-file-response) value))

(defn request-seq
  "Sequence number of the request message."
  ^js [compile-on-save-emit-file-response]
  (.-request_seq ^js compile-on-save-emit-file-response))

(defn set-request-seq!
  "Sequence number of the request message."
  ^js [compile-on-save-emit-file-response value]
  (set! (.-request_seq ^js compile-on-save-emit-file-response) value))

(defn success?
  "Outcome of the request."
  ^js [compile-on-save-emit-file-response]
  (.-success ^js compile-on-save-emit-file-response))

(defn set-success!
  "Outcome of the request."
  ^js [compile-on-save-emit-file-response value]
  (set! (.-success ^js compile-on-save-emit-file-response) value))

(defn command
  "The command requested."
  ^js [compile-on-save-emit-file-response]
  (.-command ^js compile-on-save-emit-file-response))

(defn set-command!
  "The command requested."
  ^js [compile-on-save-emit-file-response value]
  (set! (.-command ^js compile-on-save-emit-file-response) value))

(defn message
  "If success === false, this should always be provided.
   Otherwise, may (or may not) contain a success message."
  ^js [compile-on-save-emit-file-response]
  (.-message ^js compile-on-save-emit-file-response))

(defn set-message!
  "If success === false, this should always be provided.
   Otherwise, may (or may not) contain a success message."
  ^js [compile-on-save-emit-file-response value]
  (set! (.-message ^js compile-on-save-emit-file-response) value))

(defn metadata
  "Contains extra information that plugin can include to be passed on"
  ^js [compile-on-save-emit-file-response]
  (.-metadata ^js compile-on-save-emit-file-response))

(defn set-metadata!
  "Contains extra information that plugin can include to be passed on"
  ^js [compile-on-save-emit-file-response value]
  (set! (.-metadata ^js compile-on-save-emit-file-response) value))

(defn performance-data
  "Exposes information about the performance of this request-response pair."
  ^js [compile-on-save-emit-file-response]
  (.-performanceData ^js compile-on-save-emit-file-response))

(defn set-performance-data!
  "Exposes information about the performance of this request-response pair."
  ^js [compile-on-save-emit-file-response value]
  (set! (.-performanceData ^js compile-on-save-emit-file-response) value))

(defn seq
  "Sequence number of the message"
  ^js [compile-on-save-emit-file-response]
  (.-seq ^js compile-on-save-emit-file-response))

(defn set-seq!
  "Sequence number of the message"
  ^js [compile-on-save-emit-file-response value]
  (set! (.-seq ^js compile-on-save-emit-file-response) value))
