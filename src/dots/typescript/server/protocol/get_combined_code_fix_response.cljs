(ns dots.typescript.server.protocol.get-combined-code-fix-response
  (:refer-clojure :exclude [seq type]))

(defn body
  "**Returns:** `CombinedCodeActions`"
  ^js [get-combined-code-fix-response]
  (.-body ^js get-combined-code-fix-response))

(defn set-body!
  ^js [get-combined-code-fix-response value]
  (set! (.-body ^js get-combined-code-fix-response) value))

(defn type
  "**Returns:** `\"response\"`"
  ^js [get-combined-code-fix-response]
  (.-type ^js get-combined-code-fix-response))

(defn set-type!
  ^js [get-combined-code-fix-response value]
  (set! (.-type ^js get-combined-code-fix-response) value))

(defn request-seq
  "Sequence number of the request message.
   
   **Returns:** `number`"
  ^js [get-combined-code-fix-response]
  (.-request_seq ^js get-combined-code-fix-response))

(defn set-request-seq!
  "Sequence number of the request message."
  ^js [get-combined-code-fix-response value]
  (set! (.-request_seq ^js get-combined-code-fix-response) value))

(defn success?
  "Outcome of the request.
   
   **Returns:** `boolean`"
  ^js [get-combined-code-fix-response]
  (.-success ^js get-combined-code-fix-response))

(defn set-success!
  "Outcome of the request."
  ^js [get-combined-code-fix-response value]
  (set! (.-success ^js get-combined-code-fix-response) value))

(defn command
  "The command requested.
   
   **Returns:** `string`"
  ^js [get-combined-code-fix-response]
  (.-command ^js get-combined-code-fix-response))

(defn set-command!
  "The command requested."
  ^js [get-combined-code-fix-response value]
  (set! (.-command ^js get-combined-code-fix-response) value))

(defn message
  "If success === false, this should always be provided.
   Otherwise, may (or may not) contain a success message.
   
   **Returns:** `string | undefined`"
  ^js [get-combined-code-fix-response]
  (.-message ^js get-combined-code-fix-response))

(defn set-message!
  "If success === false, this should always be provided.
   Otherwise, may (or may not) contain a success message."
  ^js [get-combined-code-fix-response value]
  (set! (.-message ^js get-combined-code-fix-response) value))

(defn metadata
  "Contains extra information that plugin can include to be passed on
   
   **Returns:** `unknown`"
  ^js [get-combined-code-fix-response]
  (.-metadata ^js get-combined-code-fix-response))

(defn set-metadata!
  "Contains extra information that plugin can include to be passed on"
  ^js [get-combined-code-fix-response value]
  (set! (.-metadata ^js get-combined-code-fix-response) value))

(defn performance-data
  "Exposes information about the performance of this request-response pair.
   
   **Returns:** `PerformanceData | undefined`"
  ^js [get-combined-code-fix-response]
  (.-performanceData ^js get-combined-code-fix-response))

(defn set-performance-data!
  "Exposes information about the performance of this request-response pair."
  ^js [get-combined-code-fix-response value]
  (set! (.-performanceData ^js get-combined-code-fix-response) value))

(defn seq
  "Sequence number of the message
   
   **Returns:** `number`"
  ^js [get-combined-code-fix-response]
  (.-seq ^js get-combined-code-fix-response))

(defn set-seq!
  "Sequence number of the message"
  ^js [get-combined-code-fix-response value]
  (set! (.-seq ^js get-combined-code-fix-response) value))
