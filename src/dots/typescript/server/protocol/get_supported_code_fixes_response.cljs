(ns dots.typescript.server.protocol.get-supported-code-fixes-response
  "A response for GetSupportedCodeFixesRequest request."
  (:refer-clojure :exclude [seq type]))

(defn body
  "List of error codes supported by the server."
  ^js [get-supported-code-fixes-response]
  (.-body ^js get-supported-code-fixes-response))

(defn set-body!
  "List of error codes supported by the server."
  ^js [get-supported-code-fixes-response value]
  (set! (.-body ^js get-supported-code-fixes-response) value))

(defn type
  ^js [get-supported-code-fixes-response]
  (.-type ^js get-supported-code-fixes-response))

(defn set-type!
  ^js [get-supported-code-fixes-response value]
  (set! (.-type ^js get-supported-code-fixes-response) value))

(defn request-seq
  "Sequence number of the request message."
  ^js [get-supported-code-fixes-response]
  (.-request_seq ^js get-supported-code-fixes-response))

(defn set-request-seq!
  "Sequence number of the request message."
  ^js [get-supported-code-fixes-response value]
  (set! (.-request_seq ^js get-supported-code-fixes-response) value))

(defn success?
  "Outcome of the request."
  ^js [get-supported-code-fixes-response]
  (.-success ^js get-supported-code-fixes-response))

(defn set-success!
  "Outcome of the request."
  ^js [get-supported-code-fixes-response value]
  (set! (.-success ^js get-supported-code-fixes-response) value))

(defn command
  "The command requested."
  ^js [get-supported-code-fixes-response]
  (.-command ^js get-supported-code-fixes-response))

(defn set-command!
  "The command requested."
  ^js [get-supported-code-fixes-response value]
  (set! (.-command ^js get-supported-code-fixes-response) value))

(defn message
  "If success === false, this should always be provided.
   Otherwise, may (or may not) contain a success message."
  ^js [get-supported-code-fixes-response]
  (.-message ^js get-supported-code-fixes-response))

(defn set-message!
  "If success === false, this should always be provided.
   Otherwise, may (or may not) contain a success message."
  ^js [get-supported-code-fixes-response value]
  (set! (.-message ^js get-supported-code-fixes-response) value))

(defn metadata
  "Contains extra information that plugin can include to be passed on"
  ^js [get-supported-code-fixes-response]
  (.-metadata ^js get-supported-code-fixes-response))

(defn set-metadata!
  "Contains extra information that plugin can include to be passed on"
  ^js [get-supported-code-fixes-response value]
  (set! (.-metadata ^js get-supported-code-fixes-response) value))

(defn performance-data
  "Exposes information about the performance of this request-response pair."
  ^js [get-supported-code-fixes-response]
  (.-performanceData ^js get-supported-code-fixes-response))

(defn set-performance-data!
  "Exposes information about the performance of this request-response pair."
  ^js [get-supported-code-fixes-response value]
  (set! (.-performanceData ^js get-supported-code-fixes-response) value))

(defn seq
  "Sequence number of the message"
  ^js [get-supported-code-fixes-response]
  (.-seq ^js get-supported-code-fixes-response))

(defn set-seq!
  "Sequence number of the message"
  ^js [get-supported-code-fixes-response value]
  (set! (.-seq ^js get-supported-code-fixes-response) value))
