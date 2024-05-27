(ns dots.typescript.server.protocol.definition-and-bound-span-response
  (:refer-clojure :exclude [seq type]))

(defn body
  "**Returns:** `DefinitionInfoAndBoundSpan`"
  ^js [definition-and-bound-span-response]
  (.-body ^js definition-and-bound-span-response))

(defn type
  "**Returns:** `\"response\"`"
  ^js [definition-and-bound-span-response]
  (.-type ^js definition-and-bound-span-response))

(defn set-type!
  ^js [definition-and-bound-span-response value]
  (set! (.-type ^js definition-and-bound-span-response) value))

(defn request-seq
  "Sequence number of the request message.
   
   **Returns:** `number`"
  ^js [definition-and-bound-span-response]
  (.-request_seq ^js definition-and-bound-span-response))

(defn set-request-seq!
  "Sequence number of the request message."
  ^js [definition-and-bound-span-response value]
  (set! (.-request_seq ^js definition-and-bound-span-response) value))

(defn success?
  "Outcome of the request.
   
   **Returns:** `boolean`"
  ^js [definition-and-bound-span-response]
  (.-success ^js definition-and-bound-span-response))

(defn set-success!
  "Outcome of the request."
  ^js [definition-and-bound-span-response value]
  (set! (.-success ^js definition-and-bound-span-response) value))

(defn command
  "The command requested.
   
   **Returns:** `string`"
  ^js [definition-and-bound-span-response]
  (.-command ^js definition-and-bound-span-response))

(defn set-command!
  "The command requested."
  ^js [definition-and-bound-span-response value]
  (set! (.-command ^js definition-and-bound-span-response) value))

(defn message
  "If success === false, this should always be provided.
   Otherwise, may (or may not) contain a success message.
   
   **Returns:** `string | undefined`"
  ^js [definition-and-bound-span-response]
  (.-message ^js definition-and-bound-span-response))

(defn set-message!
  "If success === false, this should always be provided.
   Otherwise, may (or may not) contain a success message."
  ^js [definition-and-bound-span-response value]
  (set! (.-message ^js definition-and-bound-span-response) value))

(defn metadata
  "Contains extra information that plugin can include to be passed on
   
   **Returns:** `unknown`"
  ^js [definition-and-bound-span-response]
  (.-metadata ^js definition-and-bound-span-response))

(defn set-metadata!
  "Contains extra information that plugin can include to be passed on"
  ^js [definition-and-bound-span-response value]
  (set! (.-metadata ^js definition-and-bound-span-response) value))

(defn performance-data
  "Exposes information about the performance of this request-response pair.
   
   **Returns:** `PerformanceData | undefined`"
  ^js [definition-and-bound-span-response]
  (.-performanceData ^js definition-and-bound-span-response))

(defn set-performance-data!
  "Exposes information about the performance of this request-response pair."
  ^js [definition-and-bound-span-response value]
  (set! (.-performanceData ^js definition-and-bound-span-response) value))

(defn seq
  "Sequence number of the message
   
   **Returns:** `number`"
  ^js [definition-and-bound-span-response]
  (.-seq ^js definition-and-bound-span-response))

(defn set-seq!
  "Sequence number of the message"
  ^js [definition-and-bound-span-response value]
  (set! (.-seq ^js definition-and-bound-span-response) value))
