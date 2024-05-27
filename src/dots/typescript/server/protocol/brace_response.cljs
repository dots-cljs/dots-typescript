(ns dots.typescript.server.protocol.brace-response
  "Response to \"brace\" request."
  (:refer-clojure :exclude [seq type]))

(defn body
  "**Returns:** `TextSpan[] | undefined`"
  ^js [brace-response]
  (.-body ^js brace-response))

(defn set-body!
  ^js [brace-response value]
  (set! (.-body ^js brace-response) value))

(defn type
  "**Returns:** `\"response\"`"
  ^js [brace-response]
  (.-type ^js brace-response))

(defn set-type!
  ^js [brace-response value]
  (set! (.-type ^js brace-response) value))

(defn request-seq
  "Sequence number of the request message.
   
   **Returns:** `number`"
  ^js [brace-response]
  (.-request_seq ^js brace-response))

(defn set-request-seq!
  "Sequence number of the request message."
  ^js [brace-response value]
  (set! (.-request_seq ^js brace-response) value))

(defn success?
  "Outcome of the request.
   
   **Returns:** `boolean`"
  ^js [brace-response]
  (.-success ^js brace-response))

(defn set-success!
  "Outcome of the request."
  ^js [brace-response value]
  (set! (.-success ^js brace-response) value))

(defn command
  "The command requested.
   
   **Returns:** `string`"
  ^js [brace-response]
  (.-command ^js brace-response))

(defn set-command!
  "The command requested."
  ^js [brace-response value]
  (set! (.-command ^js brace-response) value))

(defn message
  "If success === false, this should always be provided.
   Otherwise, may (or may not) contain a success message.
   
   **Returns:** `string | undefined`"
  ^js [brace-response]
  (.-message ^js brace-response))

(defn set-message!
  "If success === false, this should always be provided.
   Otherwise, may (or may not) contain a success message."
  ^js [brace-response value]
  (set! (.-message ^js brace-response) value))

(defn metadata
  "Contains extra information that plugin can include to be passed on
   
   **Returns:** `unknown`"
  ^js [brace-response]
  (.-metadata ^js brace-response))

(defn set-metadata!
  "Contains extra information that plugin can include to be passed on"
  ^js [brace-response value]
  (set! (.-metadata ^js brace-response) value))

(defn performance-data
  "Exposes information about the performance of this request-response pair.
   
   **Returns:** `PerformanceData | undefined`"
  ^js [brace-response]
  (.-performanceData ^js brace-response))

(defn set-performance-data!
  "Exposes information about the performance of this request-response pair."
  ^js [brace-response value]
  (set! (.-performanceData ^js brace-response) value))

(defn seq
  "Sequence number of the message
   
   **Returns:** `number`"
  ^js [brace-response]
  (.-seq ^js brace-response))

(defn set-seq!
  "Sequence number of the message"
  ^js [brace-response value]
  (set! (.-seq ^js brace-response) value))
