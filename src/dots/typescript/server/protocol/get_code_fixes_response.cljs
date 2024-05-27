(ns dots.typescript.server.protocol.get-code-fixes-response
  "Response for GetCodeFixes request."
  (:refer-clojure :exclude [seq type]))

(defn body
  "**Returns:** `CodeAction[] | undefined`"
  ^js [get-code-fixes-response]
  (.-body ^js get-code-fixes-response))

(defn set-body!
  ^js [get-code-fixes-response value]
  (set! (.-body ^js get-code-fixes-response) value))

(defn type
  "**Returns:** `\"response\"`"
  ^js [get-code-fixes-response]
  (.-type ^js get-code-fixes-response))

(defn set-type!
  ^js [get-code-fixes-response value]
  (set! (.-type ^js get-code-fixes-response) value))

(defn request-seq
  "Sequence number of the request message.
   
   **Returns:** `number`"
  ^js [get-code-fixes-response]
  (.-request_seq ^js get-code-fixes-response))

(defn set-request-seq!
  "Sequence number of the request message."
  ^js [get-code-fixes-response value]
  (set! (.-request_seq ^js get-code-fixes-response) value))

(defn success?
  "Outcome of the request.
   
   **Returns:** `boolean`"
  ^js [get-code-fixes-response]
  (.-success ^js get-code-fixes-response))

(defn set-success!
  "Outcome of the request."
  ^js [get-code-fixes-response value]
  (set! (.-success ^js get-code-fixes-response) value))

(defn command
  "The command requested.
   
   **Returns:** `string`"
  ^js [get-code-fixes-response]
  (.-command ^js get-code-fixes-response))

(defn set-command!
  "The command requested."
  ^js [get-code-fixes-response value]
  (set! (.-command ^js get-code-fixes-response) value))

(defn message
  "If success === false, this should always be provided.
   Otherwise, may (or may not) contain a success message.
   
   **Returns:** `string | undefined`"
  ^js [get-code-fixes-response]
  (.-message ^js get-code-fixes-response))

(defn set-message!
  "If success === false, this should always be provided.
   Otherwise, may (or may not) contain a success message."
  ^js [get-code-fixes-response value]
  (set! (.-message ^js get-code-fixes-response) value))

(defn metadata
  "Contains extra information that plugin can include to be passed on
   
   **Returns:** `unknown`"
  ^js [get-code-fixes-response]
  (.-metadata ^js get-code-fixes-response))

(defn set-metadata!
  "Contains extra information that plugin can include to be passed on"
  ^js [get-code-fixes-response value]
  (set! (.-metadata ^js get-code-fixes-response) value))

(defn performance-data
  "Exposes information about the performance of this request-response pair.
   
   **Returns:** `PerformanceData | undefined`"
  ^js [get-code-fixes-response]
  (.-performanceData ^js get-code-fixes-response))

(defn set-performance-data!
  "Exposes information about the performance of this request-response pair."
  ^js [get-code-fixes-response value]
  (set! (.-performanceData ^js get-code-fixes-response) value))

(defn seq
  "Sequence number of the message
   
   **Returns:** `number`"
  ^js [get-code-fixes-response]
  (.-seq ^js get-code-fixes-response))

(defn set-seq!
  "Sequence number of the message"
  ^js [get-code-fixes-response value]
  (set! (.-seq ^js get-code-fixes-response) value))
