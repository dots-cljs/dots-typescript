(ns dots.typescript.server.protocol.open-external-project-response
  "Response to OpenExternalProjectRequest request. This is just an acknowledgement, so
   no body field is required."
  (:refer-clojure :exclude [seq type]))

(defn type
  "**Returns:** `\"response\"`"
  ^js [open-external-project-response]
  (.-type ^js open-external-project-response))

(defn set-type!
  ^js [open-external-project-response value]
  (set! (.-type ^js open-external-project-response) value))

(defn request-seq
  "Sequence number of the request message.
   
   **Returns:** `number`"
  ^js [open-external-project-response]
  (.-request_seq ^js open-external-project-response))

(defn set-request-seq!
  "Sequence number of the request message."
  ^js [open-external-project-response value]
  (set! (.-request_seq ^js open-external-project-response) value))

(defn success?
  "Outcome of the request.
   
   **Returns:** `boolean`"
  ^js [open-external-project-response]
  (.-success ^js open-external-project-response))

(defn set-success!
  "Outcome of the request."
  ^js [open-external-project-response value]
  (set! (.-success ^js open-external-project-response) value))

(defn command
  "The command requested.
   
   **Returns:** `string`"
  ^js [open-external-project-response]
  (.-command ^js open-external-project-response))

(defn set-command!
  "The command requested."
  ^js [open-external-project-response value]
  (set! (.-command ^js open-external-project-response) value))

(defn message
  "If success === false, this should always be provided.
   Otherwise, may (or may not) contain a success message.
   
   **Returns:** `string | undefined`"
  ^js [open-external-project-response]
  (.-message ^js open-external-project-response))

(defn set-message!
  "If success === false, this should always be provided.
   Otherwise, may (or may not) contain a success message."
  ^js [open-external-project-response value]
  (set! (.-message ^js open-external-project-response) value))

(defn body
  "Contains message body if success === true.
   
   **Returns:** `any`"
  ^js [open-external-project-response]
  (.-body ^js open-external-project-response))

(defn set-body!
  "Contains message body if success === true."
  ^js [open-external-project-response value]
  (set! (.-body ^js open-external-project-response) value))

(defn metadata
  "Contains extra information that plugin can include to be passed on
   
   **Returns:** `unknown`"
  ^js [open-external-project-response]
  (.-metadata ^js open-external-project-response))

(defn set-metadata!
  "Contains extra information that plugin can include to be passed on"
  ^js [open-external-project-response value]
  (set! (.-metadata ^js open-external-project-response) value))

(defn performance-data
  "Exposes information about the performance of this request-response pair.
   
   **Returns:** `PerformanceData | undefined`"
  ^js [open-external-project-response]
  (.-performanceData ^js open-external-project-response))

(defn set-performance-data!
  "Exposes information about the performance of this request-response pair."
  ^js [open-external-project-response value]
  (set! (.-performanceData ^js open-external-project-response) value))

(defn seq
  "Sequence number of the message
   
   **Returns:** `number`"
  ^js [open-external-project-response]
  (.-seq ^js open-external-project-response))

(defn set-seq!
  "Sequence number of the message"
  ^js [open-external-project-response value]
  (set! (.-seq ^js open-external-project-response) value))
