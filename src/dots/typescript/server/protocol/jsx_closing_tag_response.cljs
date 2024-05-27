(ns dots.typescript.server.protocol.jsx-closing-tag-response
  (:refer-clojure :exclude [seq type]))

(defn body
  "**Returns:** `TextInsertion`"
  ^js [jsx-closing-tag-response]
  (.-body ^js jsx-closing-tag-response))

(defn type
  "**Returns:** `\"response\"`"
  ^js [jsx-closing-tag-response]
  (.-type ^js jsx-closing-tag-response))

(defn set-type!
  ^js [jsx-closing-tag-response value]
  (set! (.-type ^js jsx-closing-tag-response) value))

(defn request-seq
  "Sequence number of the request message.
   
   **Returns:** `number`"
  ^js [jsx-closing-tag-response]
  (.-request_seq ^js jsx-closing-tag-response))

(defn set-request-seq!
  "Sequence number of the request message."
  ^js [jsx-closing-tag-response value]
  (set! (.-request_seq ^js jsx-closing-tag-response) value))

(defn success?
  "Outcome of the request.
   
   **Returns:** `boolean`"
  ^js [jsx-closing-tag-response]
  (.-success ^js jsx-closing-tag-response))

(defn set-success!
  "Outcome of the request."
  ^js [jsx-closing-tag-response value]
  (set! (.-success ^js jsx-closing-tag-response) value))

(defn command
  "The command requested.
   
   **Returns:** `string`"
  ^js [jsx-closing-tag-response]
  (.-command ^js jsx-closing-tag-response))

(defn set-command!
  "The command requested."
  ^js [jsx-closing-tag-response value]
  (set! (.-command ^js jsx-closing-tag-response) value))

(defn message
  "If success === false, this should always be provided.
   Otherwise, may (or may not) contain a success message.
   
   **Returns:** `string | undefined`"
  ^js [jsx-closing-tag-response]
  (.-message ^js jsx-closing-tag-response))

(defn set-message!
  "If success === false, this should always be provided.
   Otherwise, may (or may not) contain a success message."
  ^js [jsx-closing-tag-response value]
  (set! (.-message ^js jsx-closing-tag-response) value))

(defn metadata
  "Contains extra information that plugin can include to be passed on
   
   **Returns:** `unknown`"
  ^js [jsx-closing-tag-response]
  (.-metadata ^js jsx-closing-tag-response))

(defn set-metadata!
  "Contains extra information that plugin can include to be passed on"
  ^js [jsx-closing-tag-response value]
  (set! (.-metadata ^js jsx-closing-tag-response) value))

(defn performance-data
  "Exposes information about the performance of this request-response pair.
   
   **Returns:** `PerformanceData | undefined`"
  ^js [jsx-closing-tag-response]
  (.-performanceData ^js jsx-closing-tag-response))

(defn set-performance-data!
  "Exposes information about the performance of this request-response pair."
  ^js [jsx-closing-tag-response value]
  (set! (.-performanceData ^js jsx-closing-tag-response) value))

(defn seq
  "Sequence number of the message
   
   **Returns:** `number`"
  ^js [jsx-closing-tag-response]
  (.-seq ^js jsx-closing-tag-response))

(defn set-seq!
  "Sequence number of the message"
  ^js [jsx-closing-tag-response value]
  (set! (.-seq ^js jsx-closing-tag-response) value))
