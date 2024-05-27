(ns dots.typescript.server.protocol.syntactic-diagnostics-sync-response
  "Response object for synchronous syntactic diagnostics request."
  (:refer-clojure :exclude [seq type]))

(defn body
  "**Returns:** `Diagnostic[] | DiagnosticWithLinePosition[] | undefined`"
  ^js [syntactic-diagnostics-sync-response]
  (.-body ^js syntactic-diagnostics-sync-response))

(defn set-body!
  ^js [syntactic-diagnostics-sync-response value]
  (set! (.-body ^js syntactic-diagnostics-sync-response) value))

(defn type
  "**Returns:** `\"response\"`"
  ^js [syntactic-diagnostics-sync-response]
  (.-type ^js syntactic-diagnostics-sync-response))

(defn set-type!
  ^js [syntactic-diagnostics-sync-response value]
  (set! (.-type ^js syntactic-diagnostics-sync-response) value))

(defn request-seq
  "Sequence number of the request message.
   
   **Returns:** `number`"
  ^js [syntactic-diagnostics-sync-response]
  (.-request_seq ^js syntactic-diagnostics-sync-response))

(defn set-request-seq!
  "Sequence number of the request message."
  ^js [syntactic-diagnostics-sync-response value]
  (set! (.-request_seq ^js syntactic-diagnostics-sync-response) value))

(defn success?
  "Outcome of the request.
   
   **Returns:** `boolean`"
  ^js [syntactic-diagnostics-sync-response]
  (.-success ^js syntactic-diagnostics-sync-response))

(defn set-success!
  "Outcome of the request."
  ^js [syntactic-diagnostics-sync-response value]
  (set! (.-success ^js syntactic-diagnostics-sync-response) value))

(defn command
  "The command requested.
   
   **Returns:** `string`"
  ^js [syntactic-diagnostics-sync-response]
  (.-command ^js syntactic-diagnostics-sync-response))

(defn set-command!
  "The command requested."
  ^js [syntactic-diagnostics-sync-response value]
  (set! (.-command ^js syntactic-diagnostics-sync-response) value))

(defn message
  "If success === false, this should always be provided.
   Otherwise, may (or may not) contain a success message.
   
   **Returns:** `string | undefined`"
  ^js [syntactic-diagnostics-sync-response]
  (.-message ^js syntactic-diagnostics-sync-response))

(defn set-message!
  "If success === false, this should always be provided.
   Otherwise, may (or may not) contain a success message."
  ^js [syntactic-diagnostics-sync-response value]
  (set! (.-message ^js syntactic-diagnostics-sync-response) value))

(defn metadata
  "Contains extra information that plugin can include to be passed on
   
   **Returns:** `unknown`"
  ^js [syntactic-diagnostics-sync-response]
  (.-metadata ^js syntactic-diagnostics-sync-response))

(defn set-metadata!
  "Contains extra information that plugin can include to be passed on"
  ^js [syntactic-diagnostics-sync-response value]
  (set! (.-metadata ^js syntactic-diagnostics-sync-response) value))

(defn performance-data
  "Exposes information about the performance of this request-response pair.
   
   **Returns:** `PerformanceData | undefined`"
  ^js [syntactic-diagnostics-sync-response]
  (.-performanceData ^js syntactic-diagnostics-sync-response))

(defn set-performance-data!
  "Exposes information about the performance of this request-response pair."
  ^js [syntactic-diagnostics-sync-response value]
  (set! (.-performanceData ^js syntactic-diagnostics-sync-response) value))

(defn seq
  "Sequence number of the message
   
   **Returns:** `number`"
  ^js [syntactic-diagnostics-sync-response]
  (.-seq ^js syntactic-diagnostics-sync-response))

(defn set-seq!
  "Sequence number of the message"
  ^js [syntactic-diagnostics-sync-response value]
  (set! (.-seq ^js syntactic-diagnostics-sync-response) value))
