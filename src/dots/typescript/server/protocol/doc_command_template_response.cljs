(ns dots.typescript.server.protocol.doc-command-template-response
  "Response to DocCommentTemplateRequest"
  (:refer-clojure :exclude [seq type]))

(defn body
  "**Returns:** `TextInsertion | undefined`"
  ^js [doc-command-template-response]
  (.-body ^js doc-command-template-response))

(defn set-body!
  ^js [doc-command-template-response value]
  (set! (.-body ^js doc-command-template-response) value))

(defn type
  "**Returns:** `\"response\"`"
  ^js [doc-command-template-response]
  (.-type ^js doc-command-template-response))

(defn set-type!
  ^js [doc-command-template-response value]
  (set! (.-type ^js doc-command-template-response) value))

(defn request-seq
  "Sequence number of the request message.
   
   **Returns:** `number`"
  ^js [doc-command-template-response]
  (.-request_seq ^js doc-command-template-response))

(defn set-request-seq!
  "Sequence number of the request message."
  ^js [doc-command-template-response value]
  (set! (.-request_seq ^js doc-command-template-response) value))

(defn success?
  "Outcome of the request.
   
   **Returns:** `boolean`"
  ^js [doc-command-template-response]
  (.-success ^js doc-command-template-response))

(defn set-success!
  "Outcome of the request."
  ^js [doc-command-template-response value]
  (set! (.-success ^js doc-command-template-response) value))

(defn command
  "The command requested.
   
   **Returns:** `string`"
  ^js [doc-command-template-response]
  (.-command ^js doc-command-template-response))

(defn set-command!
  "The command requested."
  ^js [doc-command-template-response value]
  (set! (.-command ^js doc-command-template-response) value))

(defn message
  "If success === false, this should always be provided.
   Otherwise, may (or may not) contain a success message.
   
   **Returns:** `string | undefined`"
  ^js [doc-command-template-response]
  (.-message ^js doc-command-template-response))

(defn set-message!
  "If success === false, this should always be provided.
   Otherwise, may (or may not) contain a success message."
  ^js [doc-command-template-response value]
  (set! (.-message ^js doc-command-template-response) value))

(defn metadata
  "Contains extra information that plugin can include to be passed on
   
   **Returns:** `unknown`"
  ^js [doc-command-template-response]
  (.-metadata ^js doc-command-template-response))

(defn set-metadata!
  "Contains extra information that plugin can include to be passed on"
  ^js [doc-command-template-response value]
  (set! (.-metadata ^js doc-command-template-response) value))

(defn performance-data
  "Exposes information about the performance of this request-response pair.
   
   **Returns:** `PerformanceData | undefined`"
  ^js [doc-command-template-response]
  (.-performanceData ^js doc-command-template-response))

(defn set-performance-data!
  "Exposes information about the performance of this request-response pair."
  ^js [doc-command-template-response value]
  (set! (.-performanceData ^js doc-command-template-response) value))

(defn seq
  "Sequence number of the message
   
   **Returns:** `number`"
  ^js [doc-command-template-response]
  (.-seq ^js doc-command-template-response))

(defn set-seq!
  "Sequence number of the message"
  ^js [doc-command-template-response value]
  (set! (.-seq ^js doc-command-template-response) value))
