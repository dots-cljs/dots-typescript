(ns dots.typescript.server.protocol.rename-response
  "Rename response message."
  (:refer-clojure :exclude [seq type]))

(defn body
  "**Returns:** `RenameResponseBody | undefined`"
  ^js [rename-response]
  (.-body ^js rename-response))

(defn set-body!
  ^js [rename-response value]
  (set! (.-body ^js rename-response) value))

(defn type
  "**Returns:** `\"response\"`"
  ^js [rename-response]
  (.-type ^js rename-response))

(defn set-type!
  ^js [rename-response value]
  (set! (.-type ^js rename-response) value))

(defn request-seq
  "Sequence number of the request message.
   
   **Returns:** `number`"
  ^js [rename-response]
  (.-request_seq ^js rename-response))

(defn set-request-seq!
  "Sequence number of the request message."
  ^js [rename-response value]
  (set! (.-request_seq ^js rename-response) value))

(defn success?
  "Outcome of the request.
   
   **Returns:** `boolean`"
  ^js [rename-response]
  (.-success ^js rename-response))

(defn set-success!
  "Outcome of the request."
  ^js [rename-response value]
  (set! (.-success ^js rename-response) value))

(defn command
  "The command requested.
   
   **Returns:** `string`"
  ^js [rename-response]
  (.-command ^js rename-response))

(defn set-command!
  "The command requested."
  ^js [rename-response value]
  (set! (.-command ^js rename-response) value))

(defn message
  "If success === false, this should always be provided.
   Otherwise, may (or may not) contain a success message.
   
   **Returns:** `string | undefined`"
  ^js [rename-response]
  (.-message ^js rename-response))

(defn set-message!
  "If success === false, this should always be provided.
   Otherwise, may (or may not) contain a success message."
  ^js [rename-response value]
  (set! (.-message ^js rename-response) value))

(defn metadata
  "Contains extra information that plugin can include to be passed on
   
   **Returns:** `unknown`"
  ^js [rename-response]
  (.-metadata ^js rename-response))

(defn set-metadata!
  "Contains extra information that plugin can include to be passed on"
  ^js [rename-response value]
  (set! (.-metadata ^js rename-response) value))

(defn performance-data
  "Exposes information about the performance of this request-response pair.
   
   **Returns:** `PerformanceData | undefined`"
  ^js [rename-response]
  (.-performanceData ^js rename-response))

(defn set-performance-data!
  "Exposes information about the performance of this request-response pair."
  ^js [rename-response value]
  (set! (.-performanceData ^js rename-response) value))

(defn seq
  "Sequence number of the message
   
   **Returns:** `number`"
  ^js [rename-response]
  (.-seq ^js rename-response))

(defn set-seq!
  "Sequence number of the message"
  ^js [rename-response value]
  (set! (.-seq ^js rename-response) value))
