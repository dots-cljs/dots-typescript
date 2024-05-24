(ns dots.typescript.server.protocol.code-fix-response
  (:refer-clojure :exclude [seq type]))

(defn body
  "The code actions that are available"
  ^js [code-fix-response]
  (.-body ^js code-fix-response))

(defn set-body!
  "The code actions that are available"
  ^js [code-fix-response value]
  (set! (.-body ^js code-fix-response) value))

(defn type
  ^js [code-fix-response]
  (.-type ^js code-fix-response))

(defn set-type!
  ^js [code-fix-response value]
  (set! (.-type ^js code-fix-response) value))

(defn request-seq
  "Sequence number of the request message."
  ^js [code-fix-response]
  (.-request_seq ^js code-fix-response))

(defn set-request-seq!
  "Sequence number of the request message."
  ^js [code-fix-response value]
  (set! (.-request_seq ^js code-fix-response) value))

(defn success?
  "Outcome of the request."
  ^js [code-fix-response]
  (.-success ^js code-fix-response))

(defn set-success!
  "Outcome of the request."
  ^js [code-fix-response value]
  (set! (.-success ^js code-fix-response) value))

(defn command
  "The command requested."
  ^js [code-fix-response]
  (.-command ^js code-fix-response))

(defn set-command!
  "The command requested."
  ^js [code-fix-response value]
  (set! (.-command ^js code-fix-response) value))

(defn message
  "If success === false, this should always be provided.
   Otherwise, may (or may not) contain a success message."
  ^js [code-fix-response]
  (.-message ^js code-fix-response))

(defn set-message!
  "If success === false, this should always be provided.
   Otherwise, may (or may not) contain a success message."
  ^js [code-fix-response value]
  (set! (.-message ^js code-fix-response) value))

(defn metadata
  "Contains extra information that plugin can include to be passed on"
  ^js [code-fix-response]
  (.-metadata ^js code-fix-response))

(defn set-metadata!
  "Contains extra information that plugin can include to be passed on"
  ^js [code-fix-response value]
  (set! (.-metadata ^js code-fix-response) value))

(defn performance-data
  "Exposes information about the performance of this request-response pair."
  ^js [code-fix-response]
  (.-performanceData ^js code-fix-response))

(defn set-performance-data!
  "Exposes information about the performance of this request-response pair."
  ^js [code-fix-response value]
  (set! (.-performanceData ^js code-fix-response) value))

(defn seq
  "Sequence number of the message"
  ^js [code-fix-response]
  (.-seq ^js code-fix-response))

(defn set-seq!
  "Sequence number of the message"
  ^js [code-fix-response value]
  (set! (.-seq ^js code-fix-response) value))
