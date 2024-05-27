(ns dots.typescript.server.protocol.signature-help-response
  "Response object for a SignatureHelpRequest."
  (:refer-clojure :exclude [seq type]))

(defn body
  "**Returns:** `SignatureHelpItems | undefined`"
  ^js [signature-help-response]
  (.-body ^js signature-help-response))

(defn set-body!
  ^js [signature-help-response value]
  (set! (.-body ^js signature-help-response) value))

(defn type
  "**Returns:** `\"response\"`"
  ^js [signature-help-response]
  (.-type ^js signature-help-response))

(defn set-type!
  ^js [signature-help-response value]
  (set! (.-type ^js signature-help-response) value))

(defn request-seq
  "Sequence number of the request message.
   
   **Returns:** `number`"
  ^js [signature-help-response]
  (.-request_seq ^js signature-help-response))

(defn set-request-seq!
  "Sequence number of the request message."
  ^js [signature-help-response value]
  (set! (.-request_seq ^js signature-help-response) value))

(defn success?
  "Outcome of the request.
   
   **Returns:** `boolean`"
  ^js [signature-help-response]
  (.-success ^js signature-help-response))

(defn set-success!
  "Outcome of the request."
  ^js [signature-help-response value]
  (set! (.-success ^js signature-help-response) value))

(defn command
  "The command requested.
   
   **Returns:** `string`"
  ^js [signature-help-response]
  (.-command ^js signature-help-response))

(defn set-command!
  "The command requested."
  ^js [signature-help-response value]
  (set! (.-command ^js signature-help-response) value))

(defn message
  "If success === false, this should always be provided.
   Otherwise, may (or may not) contain a success message.
   
   **Returns:** `string | undefined`"
  ^js [signature-help-response]
  (.-message ^js signature-help-response))

(defn set-message!
  "If success === false, this should always be provided.
   Otherwise, may (or may not) contain a success message."
  ^js [signature-help-response value]
  (set! (.-message ^js signature-help-response) value))

(defn metadata
  "Contains extra information that plugin can include to be passed on
   
   **Returns:** `unknown`"
  ^js [signature-help-response]
  (.-metadata ^js signature-help-response))

(defn set-metadata!
  "Contains extra information that plugin can include to be passed on"
  ^js [signature-help-response value]
  (set! (.-metadata ^js signature-help-response) value))

(defn performance-data
  "Exposes information about the performance of this request-response pair.
   
   **Returns:** `PerformanceData | undefined`"
  ^js [signature-help-response]
  (.-performanceData ^js signature-help-response))

(defn set-performance-data!
  "Exposes information about the performance of this request-response pair."
  ^js [signature-help-response value]
  (set! (.-performanceData ^js signature-help-response) value))

(defn seq
  "Sequence number of the message
   
   **Returns:** `number`"
  ^js [signature-help-response]
  (.-seq ^js signature-help-response))

(defn set-seq!
  "Sequence number of the message"
  ^js [signature-help-response value]
  (set! (.-seq ^js signature-help-response) value))
