(ns dots.typescript.signature-help-retriggered-reason
  "Signals that this signature help request came from typing a character or moving the cursor.
   This should only occur if a signature help session was already active and the editor needs to see if it should adjust.
   The language service will unconditionally attempt to provide a result.
   `triggerCharacter` can be `undefined` for a retrigger caused by a cursor move.")

(defn kind
  "**Returns:** `\"retrigger\"`"
  ^js [signature-help-retriggered-reason]
  (.-kind ^js signature-help-retriggered-reason))

(defn set-kind!
  ^js [signature-help-retriggered-reason value]
  (set! (.-kind ^js signature-help-retriggered-reason) value))

(defn trigger-character
  "Character that was responsible for triggering signature help.
   
   **Returns:** `SignatureHelpRetriggerCharacter | undefined`"
  ^js [signature-help-retriggered-reason]
  (.-triggerCharacter ^js signature-help-retriggered-reason))

(defn set-trigger-character!
  "Character that was responsible for triggering signature help."
  ^js [signature-help-retriggered-reason value]
  (set! (.-triggerCharacter ^js signature-help-retriggered-reason) value))
