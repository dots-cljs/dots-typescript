(ns dots.typescript.server.protocol.signature-help-invoked-reason
  "Signals that the user manually requested signature help.
   The language service will unconditionally attempt to provide a result.")

(defn kind
  "**Returns:** `\"invoked\"`"
  ^js [signature-help-invoked-reason]
  (.-kind ^js signature-help-invoked-reason))

(defn set-kind!
  ^js [signature-help-invoked-reason value]
  (set! (.-kind ^js signature-help-invoked-reason) value))

(defn trigger-character
  "**Returns:** `undefined`"
  ^js [signature-help-invoked-reason]
  (.-triggerCharacter ^js signature-help-invoked-reason))

(defn set-trigger-character!
  ^js [signature-help-invoked-reason value]
  (set! (.-triggerCharacter ^js signature-help-invoked-reason) value))
