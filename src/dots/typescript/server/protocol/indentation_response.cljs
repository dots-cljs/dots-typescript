(ns dots.typescript.server.protocol.indentation-response
  "Response for IndentationRequest request."
  (:refer-clojure :exclude [seq type]))

(defn body
  "**Returns:** `IndentationResult | undefined`"
  ^js [indentation-response]
  (.-body ^js indentation-response))

(defn set-body!
  ^js [indentation-response value]
  (set! (.-body ^js indentation-response) value))

(defn type
  "**Returns:** `\"response\"`"
  ^js [indentation-response]
  (.-type ^js indentation-response))

(defn set-type!
  ^js [indentation-response value]
  (set! (.-type ^js indentation-response) value))

(defn request-seq
  "Sequence number of the request message.
   
   **Returns:** `number`"
  ^js [indentation-response]
  (.-request_seq ^js indentation-response))

(defn set-request-seq!
  "Sequence number of the request message."
  ^js [indentation-response value]
  (set! (.-request_seq ^js indentation-response) value))

(defn success?
  "Outcome of the request.
   
   **Returns:** `boolean`"
  ^js [indentation-response]
  (.-success ^js indentation-response))

(defn set-success!
  "Outcome of the request."
  ^js [indentation-response value]
  (set! (.-success ^js indentation-response) value))

(defn command
  "The command requested.
   
   **Returns:** `string`"
  ^js [indentation-response]
  (.-command ^js indentation-response))

(defn set-command!
  "The command requested."
  ^js [indentation-response value]
  (set! (.-command ^js indentation-response) value))

(defn message
  "If success === false, this should always be provided.
   Otherwise, may (or may not) contain a success message.
   
   **Returns:** `string | undefined`"
  ^js [indentation-response]
  (.-message ^js indentation-response))

(defn set-message!
  "If success === false, this should always be provided.
   Otherwise, may (or may not) contain a success message."
  ^js [indentation-response value]
  (set! (.-message ^js indentation-response) value))

(defn metadata
  "Contains extra information that plugin can include to be passed on
   
   **Returns:** `unknown`"
  ^js [indentation-response]
  (.-metadata ^js indentation-response))

(defn set-metadata!
  "Contains extra information that plugin can include to be passed on"
  ^js [indentation-response value]
  (set! (.-metadata ^js indentation-response) value))

(defn performance-data
  "Exposes information about the performance of this request-response pair.
   
   **Returns:** `PerformanceData | undefined`"
  ^js [indentation-response]
  (.-performanceData ^js indentation-response))

(defn set-performance-data!
  "Exposes information about the performance of this request-response pair."
  ^js [indentation-response value]
  (set! (.-performanceData ^js indentation-response) value))

(defn seq
  "Sequence number of the message
   
   **Returns:** `number`"
  ^js [indentation-response]
  (.-seq ^js indentation-response))

(defn set-seq!
  "Sequence number of the message"
  ^js [indentation-response value]
  (set! (.-seq ^js indentation-response) value))
