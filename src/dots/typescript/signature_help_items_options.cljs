(ns dots.typescript.signature-help-items-options)

(defn trigger-reason
  "**Returns:** `SignatureHelpTriggerReason | undefined`"
  ^js [signature-help-items-options]
  (.-triggerReason ^js signature-help-items-options))

(defn set-trigger-reason!
  ^js [signature-help-items-options value]
  (set! (.-triggerReason ^js signature-help-items-options) value))
