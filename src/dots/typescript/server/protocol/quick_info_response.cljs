(ns dots.typescript.server.protocol.quick-info-response
  "Quickinfo response message."
  (:refer-clojure :exclude [seq type]))

(defn body
  "**Returns:** `QuickInfoResponseBody | undefined`"
  ^js [quick-info-response]
  (.-body ^js quick-info-response))

(defn set-body!
  ^js [quick-info-response value]
  (set! (.-body ^js quick-info-response) value))

(defn type
  "**Returns:** `\"response\"`"
  ^js [quick-info-response]
  (.-type ^js quick-info-response))

(defn set-type!
  ^js [quick-info-response value]
  (set! (.-type ^js quick-info-response) value))

(defn request-seq
  "Sequence number of the request message.
   
   **Returns:** `number`"
  ^js [quick-info-response]
  (.-request_seq ^js quick-info-response))

(defn set-request-seq!
  "Sequence number of the request message."
  ^js [quick-info-response value]
  (set! (.-request_seq ^js quick-info-response) value))

(defn success?
  "Outcome of the request.
   
   **Returns:** `boolean`"
  ^js [quick-info-response]
  (.-success ^js quick-info-response))

(defn set-success!
  "Outcome of the request."
  ^js [quick-info-response value]
  (set! (.-success ^js quick-info-response) value))

(defn command
  "The command requested.
   
   **Returns:** `string`"
  ^js [quick-info-response]
  (.-command ^js quick-info-response))

(defn set-command!
  "The command requested."
  ^js [quick-info-response value]
  (set! (.-command ^js quick-info-response) value))

(defn message
  "If success === false, this should always be provided.
   Otherwise, may (or may not) contain a success message.
   
   **Returns:** `string | undefined`"
  ^js [quick-info-response]
  (.-message ^js quick-info-response))

(defn set-message!
  "If success === false, this should always be provided.
   Otherwise, may (or may not) contain a success message."
  ^js [quick-info-response value]
  (set! (.-message ^js quick-info-response) value))

(defn metadata
  "Contains extra information that plugin can include to be passed on
   
   **Returns:** `unknown`"
  ^js [quick-info-response]
  (.-metadata ^js quick-info-response))

(defn set-metadata!
  "Contains extra information that plugin can include to be passed on"
  ^js [quick-info-response value]
  (set! (.-metadata ^js quick-info-response) value))

(defn performance-data
  "Exposes information about the performance of this request-response pair.
   
   **Returns:** `PerformanceData | undefined`"
  ^js [quick-info-response]
  (.-performanceData ^js quick-info-response))

(defn set-performance-data!
  "Exposes information about the performance of this request-response pair."
  ^js [quick-info-response value]
  (set! (.-performanceData ^js quick-info-response) value))

(defn seq
  "Sequence number of the message
   
   **Returns:** `number`"
  ^js [quick-info-response]
  (.-seq ^js quick-info-response))

(defn set-seq!
  "Sequence number of the message"
  ^js [quick-info-response value]
  (set! (.-seq ^js quick-info-response) value))
