(ns dots.typescript.server.protocol.signature-help-request-args
  "Arguments of a signature help request.")

(defn trigger-reason
  "Reason why signature help was invoked.
   See each individual possible
   
   **Returns:** `SignatureHelpTriggerReason | undefined`"
  ^js [signature-help-request-args]
  (.-triggerReason ^js signature-help-request-args))

(defn set-trigger-reason!
  "Reason why signature help was invoked.
   See each individual possible"
  ^js [signature-help-request-args value]
  (set! (.-triggerReason ^js signature-help-request-args) value))

(defn line
  "The line number for the request (1-based).
   
   **Returns:** `number`"
  ^js [signature-help-request-args]
  (.-line ^js signature-help-request-args))

(defn set-line!
  "The line number for the request (1-based)."
  ^js [signature-help-request-args value]
  (set! (.-line ^js signature-help-request-args) value))

(defn offset
  "The character offset (on the line) for the request (1-based).
   
   **Returns:** `number`"
  ^js [signature-help-request-args]
  (.-offset ^js signature-help-request-args))

(defn set-offset!
  "The character offset (on the line) for the request (1-based)."
  ^js [signature-help-request-args value]
  (set! (.-offset ^js signature-help-request-args) value))

(defn file
  "The file for the request (absolute pathname required).
   
   **Returns:** `string`"
  ^js [signature-help-request-args]
  (.-file ^js signature-help-request-args))

(defn set-file!
  "The file for the request (absolute pathname required)."
  ^js [signature-help-request-args value]
  (set! (.-file ^js signature-help-request-args) value))

(defn project-file-name
  "**Returns:** `string | undefined`"
  ^js [signature-help-request-args]
  (.-projectFileName ^js signature-help-request-args))

(defn set-project-file-name!
  ^js [signature-help-request-args value]
  (set! (.-projectFileName ^js signature-help-request-args) value))
