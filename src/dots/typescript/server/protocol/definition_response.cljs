(ns dots.typescript.server.protocol.definition-response
  "Definition response message.  Gives text range for definition."
  (:refer-clojure :exclude [seq type]))

(defn body
  "**Returns:** `DefinitionInfo[] | undefined`"
  ^js [definition-response]
  (.-body ^js definition-response))

(defn set-body!
  ^js [definition-response value]
  (set! (.-body ^js definition-response) value))

(defn type
  "**Returns:** `\"response\"`"
  ^js [definition-response]
  (.-type ^js definition-response))

(defn set-type!
  ^js [definition-response value]
  (set! (.-type ^js definition-response) value))

(defn request-seq
  "Sequence number of the request message.
   
   **Returns:** `number`"
  ^js [definition-response]
  (.-request_seq ^js definition-response))

(defn set-request-seq!
  "Sequence number of the request message."
  ^js [definition-response value]
  (set! (.-request_seq ^js definition-response) value))

(defn success?
  "Outcome of the request.
   
   **Returns:** `boolean`"
  ^js [definition-response]
  (.-success ^js definition-response))

(defn set-success!
  "Outcome of the request."
  ^js [definition-response value]
  (set! (.-success ^js definition-response) value))

(defn command
  "The command requested.
   
   **Returns:** `string`"
  ^js [definition-response]
  (.-command ^js definition-response))

(defn set-command!
  "The command requested."
  ^js [definition-response value]
  (set! (.-command ^js definition-response) value))

(defn message
  "If success === false, this should always be provided.
   Otherwise, may (or may not) contain a success message.
   
   **Returns:** `string | undefined`"
  ^js [definition-response]
  (.-message ^js definition-response))

(defn set-message!
  "If success === false, this should always be provided.
   Otherwise, may (or may not) contain a success message."
  ^js [definition-response value]
  (set! (.-message ^js definition-response) value))

(defn metadata
  "Contains extra information that plugin can include to be passed on
   
   **Returns:** `unknown`"
  ^js [definition-response]
  (.-metadata ^js definition-response))

(defn set-metadata!
  "Contains extra information that plugin can include to be passed on"
  ^js [definition-response value]
  (set! (.-metadata ^js definition-response) value))

(defn performance-data
  "Exposes information about the performance of this request-response pair.
   
   **Returns:** `PerformanceData | undefined`"
  ^js [definition-response]
  (.-performanceData ^js definition-response))

(defn set-performance-data!
  "Exposes information about the performance of this request-response pair."
  ^js [definition-response value]
  (set! (.-performanceData ^js definition-response) value))

(defn seq
  "Sequence number of the message
   
   **Returns:** `number`"
  ^js [definition-response]
  (.-seq ^js definition-response))

(defn set-seq!
  "Sequence number of the message"
  ^js [definition-response value]
  (set! (.-seq ^js definition-response) value))
