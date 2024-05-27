(ns dots.typescript.server.protocol.document-highlights-response
  "Response for a DocumentHighlightsRequest request."
  (:refer-clojure :exclude [seq type]))

(defn body
  "**Returns:** `DocumentHighlightsItem[] | undefined`"
  ^js [document-highlights-response]
  (.-body ^js document-highlights-response))

(defn set-body!
  ^js [document-highlights-response value]
  (set! (.-body ^js document-highlights-response) value))

(defn type
  "**Returns:** `\"response\"`"
  ^js [document-highlights-response]
  (.-type ^js document-highlights-response))

(defn set-type!
  ^js [document-highlights-response value]
  (set! (.-type ^js document-highlights-response) value))

(defn request-seq
  "Sequence number of the request message.
   
   **Returns:** `number`"
  ^js [document-highlights-response]
  (.-request_seq ^js document-highlights-response))

(defn set-request-seq!
  "Sequence number of the request message."
  ^js [document-highlights-response value]
  (set! (.-request_seq ^js document-highlights-response) value))

(defn success?
  "Outcome of the request.
   
   **Returns:** `boolean`"
  ^js [document-highlights-response]
  (.-success ^js document-highlights-response))

(defn set-success!
  "Outcome of the request."
  ^js [document-highlights-response value]
  (set! (.-success ^js document-highlights-response) value))

(defn command
  "The command requested.
   
   **Returns:** `string`"
  ^js [document-highlights-response]
  (.-command ^js document-highlights-response))

(defn set-command!
  "The command requested."
  ^js [document-highlights-response value]
  (set! (.-command ^js document-highlights-response) value))

(defn message
  "If success === false, this should always be provided.
   Otherwise, may (or may not) contain a success message.
   
   **Returns:** `string | undefined`"
  ^js [document-highlights-response]
  (.-message ^js document-highlights-response))

(defn set-message!
  "If success === false, this should always be provided.
   Otherwise, may (or may not) contain a success message."
  ^js [document-highlights-response value]
  (set! (.-message ^js document-highlights-response) value))

(defn metadata
  "Contains extra information that plugin can include to be passed on
   
   **Returns:** `unknown`"
  ^js [document-highlights-response]
  (.-metadata ^js document-highlights-response))

(defn set-metadata!
  "Contains extra information that plugin can include to be passed on"
  ^js [document-highlights-response value]
  (set! (.-metadata ^js document-highlights-response) value))

(defn performance-data
  "Exposes information about the performance of this request-response pair.
   
   **Returns:** `PerformanceData | undefined`"
  ^js [document-highlights-response]
  (.-performanceData ^js document-highlights-response))

(defn set-performance-data!
  "Exposes information about the performance of this request-response pair."
  ^js [document-highlights-response value]
  (set! (.-performanceData ^js document-highlights-response) value))

(defn seq
  "Sequence number of the message
   
   **Returns:** `number`"
  ^js [document-highlights-response]
  (.-seq ^js document-highlights-response))

(defn set-seq!
  "Sequence number of the message"
  ^js [document-highlights-response value]
  (set! (.-seq ^js document-highlights-response) value))
