(ns dots.typescript.server.protocol.completion-details-response
  (:refer-clojure :exclude [seq type]))

(defn body
  "**Returns:** `CompletionEntryDetails[] | undefined`"
  ^js [completion-details-response]
  (.-body ^js completion-details-response))

(defn set-body!
  ^js [completion-details-response value]
  (set! (.-body ^js completion-details-response) value))

(defn type
  "**Returns:** `\"response\"`"
  ^js [completion-details-response]
  (.-type ^js completion-details-response))

(defn set-type!
  ^js [completion-details-response value]
  (set! (.-type ^js completion-details-response) value))

(defn request-seq
  "Sequence number of the request message.
   
   **Returns:** `number`"
  ^js [completion-details-response]
  (.-request_seq ^js completion-details-response))

(defn set-request-seq!
  "Sequence number of the request message."
  ^js [completion-details-response value]
  (set! (.-request_seq ^js completion-details-response) value))

(defn success?
  "Outcome of the request.
   
   **Returns:** `boolean`"
  ^js [completion-details-response]
  (.-success ^js completion-details-response))

(defn set-success!
  "Outcome of the request."
  ^js [completion-details-response value]
  (set! (.-success ^js completion-details-response) value))

(defn command
  "The command requested.
   
   **Returns:** `string`"
  ^js [completion-details-response]
  (.-command ^js completion-details-response))

(defn set-command!
  "The command requested."
  ^js [completion-details-response value]
  (set! (.-command ^js completion-details-response) value))

(defn message
  "If success === false, this should always be provided.
   Otherwise, may (or may not) contain a success message.
   
   **Returns:** `string | undefined`"
  ^js [completion-details-response]
  (.-message ^js completion-details-response))

(defn set-message!
  "If success === false, this should always be provided.
   Otherwise, may (or may not) contain a success message."
  ^js [completion-details-response value]
  (set! (.-message ^js completion-details-response) value))

(defn metadata
  "Contains extra information that plugin can include to be passed on
   
   **Returns:** `unknown`"
  ^js [completion-details-response]
  (.-metadata ^js completion-details-response))

(defn set-metadata!
  "Contains extra information that plugin can include to be passed on"
  ^js [completion-details-response value]
  (set! (.-metadata ^js completion-details-response) value))

(defn performance-data
  "Exposes information about the performance of this request-response pair.
   
   **Returns:** `PerformanceData | undefined`"
  ^js [completion-details-response]
  (.-performanceData ^js completion-details-response))

(defn set-performance-data!
  "Exposes information about the performance of this request-response pair."
  ^js [completion-details-response value]
  (set! (.-performanceData ^js completion-details-response) value))

(defn seq
  "Sequence number of the message
   
   **Returns:** `number`"
  ^js [completion-details-response]
  (.-seq ^js completion-details-response))

(defn set-seq!
  "Sequence number of the message"
  ^js [completion-details-response value]
  (set! (.-seq ^js completion-details-response) value))
