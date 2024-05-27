(ns dots.typescript.signature-help-character-typed-reason
  "Signals that the signature help request came from a user typing a character.
   Depending on the character and the syntactic context, the request may or may not be served a result.")

(defn kind
  "**Returns:** `\"characterTyped\"`"
  ^js [signature-help-character-typed-reason]
  (.-kind ^js signature-help-character-typed-reason))

(defn set-kind!
  ^js [signature-help-character-typed-reason value]
  (set! (.-kind ^js signature-help-character-typed-reason) value))

(defn trigger-character
  "Character that was responsible for triggering signature help.
   
   **Returns:** `SignatureHelpTriggerCharacter`"
  ^js [signature-help-character-typed-reason]
  (.-triggerCharacter ^js signature-help-character-typed-reason))

(defn set-trigger-character!
  "Character that was responsible for triggering signature help."
  ^js [signature-help-character-typed-reason value]
  (set! (.-triggerCharacter ^js signature-help-character-typed-reason) value))
