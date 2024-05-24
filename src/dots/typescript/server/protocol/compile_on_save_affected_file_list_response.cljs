(ns dots.typescript.server.protocol.compile-on-save-affected-file-list-response
  "Response for CompileOnSaveAffectedFileListRequest request;"
  (:refer-clojure :exclude [seq type]))

(defn body
  ^js [compile-on-save-affected-file-list-response]
  (.-body ^js compile-on-save-affected-file-list-response))

(defn set-body!
  ^js [compile-on-save-affected-file-list-response value]
  (set! (.-body ^js compile-on-save-affected-file-list-response) value))

(defn type
  ^js [compile-on-save-affected-file-list-response]
  (.-type ^js compile-on-save-affected-file-list-response))

(defn set-type!
  ^js [compile-on-save-affected-file-list-response value]
  (set! (.-type ^js compile-on-save-affected-file-list-response) value))

(defn request-seq
  "Sequence number of the request message."
  ^js [compile-on-save-affected-file-list-response]
  (.-request_seq ^js compile-on-save-affected-file-list-response))

(defn set-request-seq!
  "Sequence number of the request message."
  ^js [compile-on-save-affected-file-list-response value]
  (set! (.-request_seq ^js compile-on-save-affected-file-list-response) value))

(defn success?
  "Outcome of the request."
  ^js [compile-on-save-affected-file-list-response]
  (.-success ^js compile-on-save-affected-file-list-response))

(defn set-success!
  "Outcome of the request."
  ^js [compile-on-save-affected-file-list-response value]
  (set! (.-success ^js compile-on-save-affected-file-list-response) value))

(defn command
  "The command requested."
  ^js [compile-on-save-affected-file-list-response]
  (.-command ^js compile-on-save-affected-file-list-response))

(defn set-command!
  "The command requested."
  ^js [compile-on-save-affected-file-list-response value]
  (set! (.-command ^js compile-on-save-affected-file-list-response) value))

(defn message
  "If success === false, this should always be provided.
   Otherwise, may (or may not) contain a success message."
  ^js [compile-on-save-affected-file-list-response]
  (.-message ^js compile-on-save-affected-file-list-response))

(defn set-message!
  "If success === false, this should always be provided.
   Otherwise, may (or may not) contain a success message."
  ^js [compile-on-save-affected-file-list-response value]
  (set! (.-message ^js compile-on-save-affected-file-list-response) value))

(defn metadata
  "Contains extra information that plugin can include to be passed on"
  ^js [compile-on-save-affected-file-list-response]
  (.-metadata ^js compile-on-save-affected-file-list-response))

(defn set-metadata!
  "Contains extra information that plugin can include to be passed on"
  ^js [compile-on-save-affected-file-list-response value]
  (set! (.-metadata ^js compile-on-save-affected-file-list-response) value))

(defn performance-data
  "Exposes information about the performance of this request-response pair."
  ^js [compile-on-save-affected-file-list-response]
  (.-performanceData ^js compile-on-save-affected-file-list-response))

(defn set-performance-data!
  "Exposes information about the performance of this request-response pair."
  ^js [compile-on-save-affected-file-list-response value]
  (set! (.-performanceData ^js compile-on-save-affected-file-list-response) value))

(defn seq
  "Sequence number of the message"
  ^js [compile-on-save-affected-file-list-response]
  (.-seq ^js compile-on-save-affected-file-list-response))

(defn set-seq!
  "Sequence number of the message"
  ^js [compile-on-save-affected-file-list-response value]
  (set! (.-seq ^js compile-on-save-affected-file-list-response) value))
