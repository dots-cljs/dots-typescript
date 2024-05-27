(ns dots.typescript.server.protocol.references-response
  "Response to \"references\" request."
  (:refer-clojure :exclude [seq type]))

(defn body
  "**Returns:** `ReferencesResponseBody | undefined`"
  ^js [references-response]
  (.-body ^js references-response))

(defn set-body!
  ^js [references-response value]
  (set! (.-body ^js references-response) value))

(defn type
  "**Returns:** `\"response\"`"
  ^js [references-response]
  (.-type ^js references-response))

(defn set-type!
  ^js [references-response value]
  (set! (.-type ^js references-response) value))

(defn request-seq
  "Sequence number of the request message.
   
   **Returns:** `number`"
  ^js [references-response]
  (.-request_seq ^js references-response))

(defn set-request-seq!
  "Sequence number of the request message."
  ^js [references-response value]
  (set! (.-request_seq ^js references-response) value))

(defn success?
  "Outcome of the request.
   
   **Returns:** `boolean`"
  ^js [references-response]
  (.-success ^js references-response))

(defn set-success!
  "Outcome of the request."
  ^js [references-response value]
  (set! (.-success ^js references-response) value))

(defn command
  "The command requested.
   
   **Returns:** `string`"
  ^js [references-response]
  (.-command ^js references-response))

(defn set-command!
  "The command requested."
  ^js [references-response value]
  (set! (.-command ^js references-response) value))

(defn message
  "If success === false, this should always be provided.
   Otherwise, may (or may not) contain a success message.
   
   **Returns:** `string | undefined`"
  ^js [references-response]
  (.-message ^js references-response))

(defn set-message!
  "If success === false, this should always be provided.
   Otherwise, may (or may not) contain a success message."
  ^js [references-response value]
  (set! (.-message ^js references-response) value))

(defn metadata
  "Contains extra information that plugin can include to be passed on
   
   **Returns:** `unknown`"
  ^js [references-response]
  (.-metadata ^js references-response))

(defn set-metadata!
  "Contains extra information that plugin can include to be passed on"
  ^js [references-response value]
  (set! (.-metadata ^js references-response) value))

(defn performance-data
  "Exposes information about the performance of this request-response pair.
   
   **Returns:** `PerformanceData | undefined`"
  ^js [references-response]
  (.-performanceData ^js references-response))

(defn set-performance-data!
  "Exposes information about the performance of this request-response pair."
  ^js [references-response value]
  (set! (.-performanceData ^js references-response) value))

(defn seq
  "Sequence number of the message
   
   **Returns:** `number`"
  ^js [references-response]
  (.-seq ^js references-response))

(defn set-seq!
  "Sequence number of the message"
  ^js [references-response value]
  (set! (.-seq ^js references-response) value))
