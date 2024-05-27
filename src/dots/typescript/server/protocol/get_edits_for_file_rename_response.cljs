(ns dots.typescript.server.protocol.get-edits-for-file-rename-response
  (:refer-clojure :exclude [seq type]))

(defn body
  "**Returns:** `readonly FileCodeEdits[]`"
  ^js [get-edits-for-file-rename-response]
  (.-body ^js get-edits-for-file-rename-response))

(defn set-body!
  ^js [get-edits-for-file-rename-response value]
  (set! (.-body ^js get-edits-for-file-rename-response) value))

(defn type
  "**Returns:** `\"response\"`"
  ^js [get-edits-for-file-rename-response]
  (.-type ^js get-edits-for-file-rename-response))

(defn set-type!
  ^js [get-edits-for-file-rename-response value]
  (set! (.-type ^js get-edits-for-file-rename-response) value))

(defn request-seq
  "Sequence number of the request message.
   
   **Returns:** `number`"
  ^js [get-edits-for-file-rename-response]
  (.-request_seq ^js get-edits-for-file-rename-response))

(defn set-request-seq!
  "Sequence number of the request message."
  ^js [get-edits-for-file-rename-response value]
  (set! (.-request_seq ^js get-edits-for-file-rename-response) value))

(defn success?
  "Outcome of the request.
   
   **Returns:** `boolean`"
  ^js [get-edits-for-file-rename-response]
  (.-success ^js get-edits-for-file-rename-response))

(defn set-success!
  "Outcome of the request."
  ^js [get-edits-for-file-rename-response value]
  (set! (.-success ^js get-edits-for-file-rename-response) value))

(defn command
  "The command requested.
   
   **Returns:** `string`"
  ^js [get-edits-for-file-rename-response]
  (.-command ^js get-edits-for-file-rename-response))

(defn set-command!
  "The command requested."
  ^js [get-edits-for-file-rename-response value]
  (set! (.-command ^js get-edits-for-file-rename-response) value))

(defn message
  "If success === false, this should always be provided.
   Otherwise, may (or may not) contain a success message.
   
   **Returns:** `string | undefined`"
  ^js [get-edits-for-file-rename-response]
  (.-message ^js get-edits-for-file-rename-response))

(defn set-message!
  "If success === false, this should always be provided.
   Otherwise, may (or may not) contain a success message."
  ^js [get-edits-for-file-rename-response value]
  (set! (.-message ^js get-edits-for-file-rename-response) value))

(defn metadata
  "Contains extra information that plugin can include to be passed on
   
   **Returns:** `unknown`"
  ^js [get-edits-for-file-rename-response]
  (.-metadata ^js get-edits-for-file-rename-response))

(defn set-metadata!
  "Contains extra information that plugin can include to be passed on"
  ^js [get-edits-for-file-rename-response value]
  (set! (.-metadata ^js get-edits-for-file-rename-response) value))

(defn performance-data
  "Exposes information about the performance of this request-response pair.
   
   **Returns:** `PerformanceData | undefined`"
  ^js [get-edits-for-file-rename-response]
  (.-performanceData ^js get-edits-for-file-rename-response))

(defn set-performance-data!
  "Exposes information about the performance of this request-response pair."
  ^js [get-edits-for-file-rename-response value]
  (set! (.-performanceData ^js get-edits-for-file-rename-response) value))

(defn seq
  "Sequence number of the message
   
   **Returns:** `number`"
  ^js [get-edits-for-file-rename-response]
  (.-seq ^js get-edits-for-file-rename-response))

(defn set-seq!
  "Sequence number of the message"
  ^js [get-edits-for-file-rename-response value]
  (set! (.-seq ^js get-edits-for-file-rename-response) value))
