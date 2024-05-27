(ns dots.typescript.server.protocol.close-external-project-response
  "Response to CloseExternalProjectRequest request. This is just an acknowledgement, so
   no body field is required."
  (:refer-clojure :exclude [seq type]))

(defn type
  "**Returns:** `\"response\"`"
  ^js [close-external-project-response]
  (.-type ^js close-external-project-response))

(defn set-type!
  ^js [close-external-project-response value]
  (set! (.-type ^js close-external-project-response) value))

(defn request-seq
  "Sequence number of the request message.
   
   **Returns:** `number`"
  ^js [close-external-project-response]
  (.-request_seq ^js close-external-project-response))

(defn set-request-seq!
  "Sequence number of the request message."
  ^js [close-external-project-response value]
  (set! (.-request_seq ^js close-external-project-response) value))

(defn success?
  "Outcome of the request.
   
   **Returns:** `boolean`"
  ^js [close-external-project-response]
  (.-success ^js close-external-project-response))

(defn set-success!
  "Outcome of the request."
  ^js [close-external-project-response value]
  (set! (.-success ^js close-external-project-response) value))

(defn command
  "The command requested.
   
   **Returns:** `string`"
  ^js [close-external-project-response]
  (.-command ^js close-external-project-response))

(defn set-command!
  "The command requested."
  ^js [close-external-project-response value]
  (set! (.-command ^js close-external-project-response) value))

(defn message
  "If success === false, this should always be provided.
   Otherwise, may (or may not) contain a success message.
   
   **Returns:** `string | undefined`"
  ^js [close-external-project-response]
  (.-message ^js close-external-project-response))

(defn set-message!
  "If success === false, this should always be provided.
   Otherwise, may (or may not) contain a success message."
  ^js [close-external-project-response value]
  (set! (.-message ^js close-external-project-response) value))

(defn body
  "Contains message body if success === true.
   
   **Returns:** `any`"
  ^js [close-external-project-response]
  (.-body ^js close-external-project-response))

(defn set-body!
  "Contains message body if success === true."
  ^js [close-external-project-response value]
  (set! (.-body ^js close-external-project-response) value))

(defn metadata
  "Contains extra information that plugin can include to be passed on
   
   **Returns:** `unknown`"
  ^js [close-external-project-response]
  (.-metadata ^js close-external-project-response))

(defn set-metadata!
  "Contains extra information that plugin can include to be passed on"
  ^js [close-external-project-response value]
  (set! (.-metadata ^js close-external-project-response) value))

(defn performance-data
  "Exposes information about the performance of this request-response pair.
   
   **Returns:** `PerformanceData | undefined`"
  ^js [close-external-project-response]
  (.-performanceData ^js close-external-project-response))

(defn set-performance-data!
  "Exposes information about the performance of this request-response pair."
  ^js [close-external-project-response value]
  (set! (.-performanceData ^js close-external-project-response) value))

(defn seq
  "Sequence number of the message
   
   **Returns:** `number`"
  ^js [close-external-project-response]
  (.-seq ^js close-external-project-response))

(defn set-seq!
  "Sequence number of the message"
  ^js [close-external-project-response value]
  (set! (.-seq ^js close-external-project-response) value))
