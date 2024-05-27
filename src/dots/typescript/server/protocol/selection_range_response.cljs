(ns dots.typescript.server.protocol.selection-range-response
  (:refer-clojure :exclude [seq type]))

(defn body
  "**Returns:** `SelectionRange[] | undefined`"
  ^js [selection-range-response]
  (.-body ^js selection-range-response))

(defn set-body!
  ^js [selection-range-response value]
  (set! (.-body ^js selection-range-response) value))

(defn type
  "**Returns:** `\"response\"`"
  ^js [selection-range-response]
  (.-type ^js selection-range-response))

(defn set-type!
  ^js [selection-range-response value]
  (set! (.-type ^js selection-range-response) value))

(defn request-seq
  "Sequence number of the request message.
   
   **Returns:** `number`"
  ^js [selection-range-response]
  (.-request_seq ^js selection-range-response))

(defn set-request-seq!
  "Sequence number of the request message."
  ^js [selection-range-response value]
  (set! (.-request_seq ^js selection-range-response) value))

(defn success?
  "Outcome of the request.
   
   **Returns:** `boolean`"
  ^js [selection-range-response]
  (.-success ^js selection-range-response))

(defn set-success!
  "Outcome of the request."
  ^js [selection-range-response value]
  (set! (.-success ^js selection-range-response) value))

(defn command
  "The command requested.
   
   **Returns:** `string`"
  ^js [selection-range-response]
  (.-command ^js selection-range-response))

(defn set-command!
  "The command requested."
  ^js [selection-range-response value]
  (set! (.-command ^js selection-range-response) value))

(defn message
  "If success === false, this should always be provided.
   Otherwise, may (or may not) contain a success message.
   
   **Returns:** `string | undefined`"
  ^js [selection-range-response]
  (.-message ^js selection-range-response))

(defn set-message!
  "If success === false, this should always be provided.
   Otherwise, may (or may not) contain a success message."
  ^js [selection-range-response value]
  (set! (.-message ^js selection-range-response) value))

(defn metadata
  "Contains extra information that plugin can include to be passed on
   
   **Returns:** `unknown`"
  ^js [selection-range-response]
  (.-metadata ^js selection-range-response))

(defn set-metadata!
  "Contains extra information that plugin can include to be passed on"
  ^js [selection-range-response value]
  (set! (.-metadata ^js selection-range-response) value))

(defn performance-data
  "Exposes information about the performance of this request-response pair.
   
   **Returns:** `PerformanceData | undefined`"
  ^js [selection-range-response]
  (.-performanceData ^js selection-range-response))

(defn set-performance-data!
  "Exposes information about the performance of this request-response pair."
  ^js [selection-range-response value]
  (set! (.-performanceData ^js selection-range-response) value))

(defn seq
  "Sequence number of the message
   
   **Returns:** `number`"
  ^js [selection-range-response]
  (.-seq ^js selection-range-response))

(defn set-seq!
  "Sequence number of the message"
  ^js [selection-range-response value]
  (set! (.-seq ^js selection-range-response) value))
