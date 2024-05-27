(ns dots.typescript.server.protocol.response
  "Response by server to client request message."
  (:refer-clojure :exclude [seq type]))

(defn type
  "**Returns:** `\"response\"`"
  ^js [response]
  (.-type ^js response))

(defn set-type!
  ^js [response value]
  (set! (.-type ^js response) value))

(defn request-seq
  "Sequence number of the request message.
   
   **Returns:** `number`"
  ^js [response]
  (.-request_seq ^js response))

(defn set-request-seq!
  "Sequence number of the request message."
  ^js [response value]
  (set! (.-request_seq ^js response) value))

(defn success?
  "Outcome of the request.
   
   **Returns:** `boolean`"
  ^js [response]
  (.-success ^js response))

(defn set-success!
  "Outcome of the request."
  ^js [response value]
  (set! (.-success ^js response) value))

(defn command
  "The command requested.
   
   **Returns:** `string`"
  ^js [response]
  (.-command ^js response))

(defn set-command!
  "The command requested."
  ^js [response value]
  (set! (.-command ^js response) value))

(defn message
  "If success === false, this should always be provided.
   Otherwise, may (or may not) contain a success message.
   
   **Returns:** `string | undefined`"
  ^js [response]
  (.-message ^js response))

(defn set-message!
  "If success === false, this should always be provided.
   Otherwise, may (or may not) contain a success message."
  ^js [response value]
  (set! (.-message ^js response) value))

(defn body
  "Contains message body if success === true.
   
   **Returns:** `any`"
  ^js [response]
  (.-body ^js response))

(defn set-body!
  "Contains message body if success === true."
  ^js [response value]
  (set! (.-body ^js response) value))

(defn metadata
  "Contains extra information that plugin can include to be passed on
   
   **Returns:** `unknown`"
  ^js [response]
  (.-metadata ^js response))

(defn set-metadata!
  "Contains extra information that plugin can include to be passed on"
  ^js [response value]
  (set! (.-metadata ^js response) value))

(defn performance-data
  "Exposes information about the performance of this request-response pair.
   
   **Returns:** `PerformanceData | undefined`"
  ^js [response]
  (.-performanceData ^js response))

(defn set-performance-data!
  "Exposes information about the performance of this request-response pair."
  ^js [response value]
  (set! (.-performanceData ^js response) value))

(defn seq
  "Sequence number of the message
   
   **Returns:** `number`"
  ^js [response]
  (.-seq ^js response))

(defn set-seq!
  "Sequence number of the message"
  ^js [response value]
  (set! (.-seq ^js response) value))
