(ns dots.typescript.server.protocol.apply-code-action-command-response
  (:refer-clojure :exclude [seq type]))

(defn type
  ^js [apply-code-action-command-response]
  (.-type ^js apply-code-action-command-response))

(defn set-type!
  ^js [apply-code-action-command-response value]
  (set! (.-type ^js apply-code-action-command-response) value))

(defn request-seq
  "Sequence number of the request message."
  ^js [apply-code-action-command-response]
  (.-request_seq ^js apply-code-action-command-response))

(defn set-request-seq!
  "Sequence number of the request message."
  ^js [apply-code-action-command-response value]
  (set! (.-request_seq ^js apply-code-action-command-response) value))

(defn success?
  "Outcome of the request."
  ^js [apply-code-action-command-response]
  (.-success ^js apply-code-action-command-response))

(defn set-success!
  "Outcome of the request."
  ^js [apply-code-action-command-response value]
  (set! (.-success ^js apply-code-action-command-response) value))

(defn command
  "The command requested."
  ^js [apply-code-action-command-response]
  (.-command ^js apply-code-action-command-response))

(defn set-command!
  "The command requested."
  ^js [apply-code-action-command-response value]
  (set! (.-command ^js apply-code-action-command-response) value))

(defn message
  "If success === false, this should always be provided.
   Otherwise, may (or may not) contain a success message."
  ^js [apply-code-action-command-response]
  (.-message ^js apply-code-action-command-response))

(defn set-message!
  "If success === false, this should always be provided.
   Otherwise, may (or may not) contain a success message."
  ^js [apply-code-action-command-response value]
  (set! (.-message ^js apply-code-action-command-response) value))

(defn body
  "Contains message body if success === true."
  ^js [apply-code-action-command-response]
  (.-body ^js apply-code-action-command-response))

(defn set-body!
  "Contains message body if success === true."
  ^js [apply-code-action-command-response value]
  (set! (.-body ^js apply-code-action-command-response) value))

(defn metadata
  "Contains extra information that plugin can include to be passed on"
  ^js [apply-code-action-command-response]
  (.-metadata ^js apply-code-action-command-response))

(defn set-metadata!
  "Contains extra information that plugin can include to be passed on"
  ^js [apply-code-action-command-response value]
  (set! (.-metadata ^js apply-code-action-command-response) value))

(defn performance-data
  "Exposes information about the performance of this request-response pair."
  ^js [apply-code-action-command-response]
  (.-performanceData ^js apply-code-action-command-response))

(defn set-performance-data!
  "Exposes information about the performance of this request-response pair."
  ^js [apply-code-action-command-response value]
  (set! (.-performanceData ^js apply-code-action-command-response) value))

(defn seq
  "Sequence number of the message"
  ^js [apply-code-action-command-response]
  (.-seq ^js apply-code-action-command-response))

(defn set-seq!
  "Sequence number of the message"
  ^js [apply-code-action-command-response value]
  (set! (.-seq ^js apply-code-action-command-response) value))
