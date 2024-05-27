(ns dots.typescript.server.protocol.prepare-call-hierarchy-response
  (:refer-clojure :exclude [seq type]))

(defn body
  "**Returns:** `CallHierarchyItem | CallHierarchyItem[]`"
  ^js [prepare-call-hierarchy-response]
  (.-body ^js prepare-call-hierarchy-response))

(defn type
  "**Returns:** `\"response\"`"
  ^js [prepare-call-hierarchy-response]
  (.-type ^js prepare-call-hierarchy-response))

(defn set-type!
  ^js [prepare-call-hierarchy-response value]
  (set! (.-type ^js prepare-call-hierarchy-response) value))

(defn request-seq
  "Sequence number of the request message.
   
   **Returns:** `number`"
  ^js [prepare-call-hierarchy-response]
  (.-request_seq ^js prepare-call-hierarchy-response))

(defn set-request-seq!
  "Sequence number of the request message."
  ^js [prepare-call-hierarchy-response value]
  (set! (.-request_seq ^js prepare-call-hierarchy-response) value))

(defn success?
  "Outcome of the request.
   
   **Returns:** `boolean`"
  ^js [prepare-call-hierarchy-response]
  (.-success ^js prepare-call-hierarchy-response))

(defn set-success!
  "Outcome of the request."
  ^js [prepare-call-hierarchy-response value]
  (set! (.-success ^js prepare-call-hierarchy-response) value))

(defn command
  "The command requested.
   
   **Returns:** `string`"
  ^js [prepare-call-hierarchy-response]
  (.-command ^js prepare-call-hierarchy-response))

(defn set-command!
  "The command requested."
  ^js [prepare-call-hierarchy-response value]
  (set! (.-command ^js prepare-call-hierarchy-response) value))

(defn message
  "If success === false, this should always be provided.
   Otherwise, may (or may not) contain a success message.
   
   **Returns:** `string | undefined`"
  ^js [prepare-call-hierarchy-response]
  (.-message ^js prepare-call-hierarchy-response))

(defn set-message!
  "If success === false, this should always be provided.
   Otherwise, may (or may not) contain a success message."
  ^js [prepare-call-hierarchy-response value]
  (set! (.-message ^js prepare-call-hierarchy-response) value))

(defn metadata
  "Contains extra information that plugin can include to be passed on
   
   **Returns:** `unknown`"
  ^js [prepare-call-hierarchy-response]
  (.-metadata ^js prepare-call-hierarchy-response))

(defn set-metadata!
  "Contains extra information that plugin can include to be passed on"
  ^js [prepare-call-hierarchy-response value]
  (set! (.-metadata ^js prepare-call-hierarchy-response) value))

(defn performance-data
  "Exposes information about the performance of this request-response pair.
   
   **Returns:** `PerformanceData | undefined`"
  ^js [prepare-call-hierarchy-response]
  (.-performanceData ^js prepare-call-hierarchy-response))

(defn set-performance-data!
  "Exposes information about the performance of this request-response pair."
  ^js [prepare-call-hierarchy-response value]
  (set! (.-performanceData ^js prepare-call-hierarchy-response) value))

(defn seq
  "Sequence number of the message
   
   **Returns:** `number`"
  ^js [prepare-call-hierarchy-response]
  (.-seq ^js prepare-call-hierarchy-response))

(defn set-seq!
  "Sequence number of the message"
  ^js [prepare-call-hierarchy-response value]
  (set! (.-seq ^js prepare-call-hierarchy-response) value))
