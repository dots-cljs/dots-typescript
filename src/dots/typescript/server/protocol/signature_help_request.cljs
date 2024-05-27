(ns dots.typescript.server.protocol.signature-help-request
  "Signature help request; value of command field is \"signatureHelp\".
   Given a file location (file, line, col), return the signature
   help."
  (:refer-clojure :exclude [seq type]))

(defn command
  "**Returns:** `CommandTypes.SignatureHelp`"
  ^js [signature-help-request]
  (.-command ^js signature-help-request))

(defn set-command!
  ^js [signature-help-request value]
  (set! (.-command ^js signature-help-request) value))

(defn arguments
  "**Returns:** `SignatureHelpRequestArgs`"
  ^js [signature-help-request]
  (.-arguments ^js signature-help-request))

(defn set-arguments!
  ^js [signature-help-request value]
  (set! (.-arguments ^js signature-help-request) value))

(defn type
  "**Returns:** `\"request\"`"
  ^js [signature-help-request]
  (.-type ^js signature-help-request))

(defn set-type!
  ^js [signature-help-request value]
  (set! (.-type ^js signature-help-request) value))

(defn seq
  "Sequence number of the message
   
   **Returns:** `number`"
  ^js [signature-help-request]
  (.-seq ^js signature-help-request))

(defn set-seq!
  "Sequence number of the message"
  ^js [signature-help-request value]
  (set! (.-seq ^js signature-help-request) value))
