(ns dots.typescript.server.protocol.open-external-projects-response
  "Response to OpenExternalProjectsRequest request. This is just an acknowledgement, so
   no body field is required."
  (:refer-clojure :exclude [seq type]))

(defn type
  "**Returns:** `\"response\"`"
  ^js [open-external-projects-response]
  (.-type ^js open-external-projects-response))

(defn set-type!
  ^js [open-external-projects-response value]
  (set! (.-type ^js open-external-projects-response) value))

(defn request-seq
  "Sequence number of the request message.
   
   **Returns:** `number`"
  ^js [open-external-projects-response]
  (.-request_seq ^js open-external-projects-response))

(defn set-request-seq!
  "Sequence number of the request message."
  ^js [open-external-projects-response value]
  (set! (.-request_seq ^js open-external-projects-response) value))

(defn success?
  "Outcome of the request.
   
   **Returns:** `boolean`"
  ^js [open-external-projects-response]
  (.-success ^js open-external-projects-response))

(defn set-success!
  "Outcome of the request."
  ^js [open-external-projects-response value]
  (set! (.-success ^js open-external-projects-response) value))

(defn command
  "The command requested.
   
   **Returns:** `string`"
  ^js [open-external-projects-response]
  (.-command ^js open-external-projects-response))

(defn set-command!
  "The command requested."
  ^js [open-external-projects-response value]
  (set! (.-command ^js open-external-projects-response) value))

(defn message
  "If success === false, this should always be provided.
   Otherwise, may (or may not) contain a success message.
   
   **Returns:** `string | undefined`"
  ^js [open-external-projects-response]
  (.-message ^js open-external-projects-response))

(defn set-message!
  "If success === false, this should always be provided.
   Otherwise, may (or may not) contain a success message."
  ^js [open-external-projects-response value]
  (set! (.-message ^js open-external-projects-response) value))

(defn body
  "Contains message body if success === true.
   
   **Returns:** `any`"
  ^js [open-external-projects-response]
  (.-body ^js open-external-projects-response))

(defn set-body!
  "Contains message body if success === true."
  ^js [open-external-projects-response value]
  (set! (.-body ^js open-external-projects-response) value))

(defn metadata
  "Contains extra information that plugin can include to be passed on
   
   **Returns:** `unknown`"
  ^js [open-external-projects-response]
  (.-metadata ^js open-external-projects-response))

(defn set-metadata!
  "Contains extra information that plugin can include to be passed on"
  ^js [open-external-projects-response value]
  (set! (.-metadata ^js open-external-projects-response) value))

(defn performance-data
  "Exposes information about the performance of this request-response pair.
   
   **Returns:** `PerformanceData | undefined`"
  ^js [open-external-projects-response]
  (.-performanceData ^js open-external-projects-response))

(defn set-performance-data!
  "Exposes information about the performance of this request-response pair."
  ^js [open-external-projects-response value]
  (set! (.-performanceData ^js open-external-projects-response) value))

(defn seq
  "Sequence number of the message
   
   **Returns:** `number`"
  ^js [open-external-projects-response]
  (.-seq ^js open-external-projects-response))

(defn set-seq!
  "Sequence number of the message"
  ^js [open-external-projects-response value]
  (set! (.-seq ^js open-external-projects-response) value))
