(ns dots.typescript.server.protocol.get-applicable-refactors-response
  "Response is a list of available refactorings.
   Each refactoring exposes one or more \"Actions\"; a user selects one action to invoke a refactoring"
  (:refer-clojure :exclude [seq type]))

(defn body
  "**Returns:** `ApplicableRefactorInfo[] | undefined`"
  ^js [get-applicable-refactors-response]
  (.-body ^js get-applicable-refactors-response))

(defn set-body!
  ^js [get-applicable-refactors-response value]
  (set! (.-body ^js get-applicable-refactors-response) value))

(defn type
  "**Returns:** `\"response\"`"
  ^js [get-applicable-refactors-response]
  (.-type ^js get-applicable-refactors-response))

(defn set-type!
  ^js [get-applicable-refactors-response value]
  (set! (.-type ^js get-applicable-refactors-response) value))

(defn request-seq
  "Sequence number of the request message.
   
   **Returns:** `number`"
  ^js [get-applicable-refactors-response]
  (.-request_seq ^js get-applicable-refactors-response))

(defn set-request-seq!
  "Sequence number of the request message."
  ^js [get-applicable-refactors-response value]
  (set! (.-request_seq ^js get-applicable-refactors-response) value))

(defn success?
  "Outcome of the request.
   
   **Returns:** `boolean`"
  ^js [get-applicable-refactors-response]
  (.-success ^js get-applicable-refactors-response))

(defn set-success!
  "Outcome of the request."
  ^js [get-applicable-refactors-response value]
  (set! (.-success ^js get-applicable-refactors-response) value))

(defn command
  "The command requested.
   
   **Returns:** `string`"
  ^js [get-applicable-refactors-response]
  (.-command ^js get-applicable-refactors-response))

(defn set-command!
  "The command requested."
  ^js [get-applicable-refactors-response value]
  (set! (.-command ^js get-applicable-refactors-response) value))

(defn message
  "If success === false, this should always be provided.
   Otherwise, may (or may not) contain a success message.
   
   **Returns:** `string | undefined`"
  ^js [get-applicable-refactors-response]
  (.-message ^js get-applicable-refactors-response))

(defn set-message!
  "If success === false, this should always be provided.
   Otherwise, may (or may not) contain a success message."
  ^js [get-applicable-refactors-response value]
  (set! (.-message ^js get-applicable-refactors-response) value))

(defn metadata
  "Contains extra information that plugin can include to be passed on
   
   **Returns:** `unknown`"
  ^js [get-applicable-refactors-response]
  (.-metadata ^js get-applicable-refactors-response))

(defn set-metadata!
  "Contains extra information that plugin can include to be passed on"
  ^js [get-applicable-refactors-response value]
  (set! (.-metadata ^js get-applicable-refactors-response) value))

(defn performance-data
  "Exposes information about the performance of this request-response pair.
   
   **Returns:** `PerformanceData | undefined`"
  ^js [get-applicable-refactors-response]
  (.-performanceData ^js get-applicable-refactors-response))

(defn set-performance-data!
  "Exposes information about the performance of this request-response pair."
  ^js [get-applicable-refactors-response value]
  (set! (.-performanceData ^js get-applicable-refactors-response) value))

(defn seq
  "Sequence number of the message
   
   **Returns:** `number`"
  ^js [get-applicable-refactors-response]
  (.-seq ^js get-applicable-refactors-response))

(defn set-seq!
  "Sequence number of the message"
  ^js [get-applicable-refactors-response value]
  (set! (.-seq ^js get-applicable-refactors-response) value))
