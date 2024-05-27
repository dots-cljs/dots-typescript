(ns dots.typescript.server.protocol.signature-help-items
  "Signature help items found in the response of a signature help request.")

(defn items
  "The signature help items.
   
   **Returns:** `SignatureHelpItem[]`"
  ^js [signature-help-items]
  (.-items ^js signature-help-items))

(defn set-items!
  "The signature help items."
  ^js [signature-help-items value]
  (set! (.-items ^js signature-help-items) value))

(defn applicable-span
  "The span for which signature help should appear on a signature
   
   **Returns:** `TextSpan`"
  ^js [signature-help-items]
  (.-applicableSpan ^js signature-help-items))

(defn set-applicable-span!
  "The span for which signature help should appear on a signature"
  ^js [signature-help-items value]
  (set! (.-applicableSpan ^js signature-help-items) value))

(defn selected-item-index
  "The item selected in the set of available help items.
   
   **Returns:** `number`"
  ^js [signature-help-items]
  (.-selectedItemIndex ^js signature-help-items))

(defn set-selected-item-index!
  "The item selected in the set of available help items."
  ^js [signature-help-items value]
  (set! (.-selectedItemIndex ^js signature-help-items) value))

(defn argument-index
  "The argument selected in the set of parameters.
   
   **Returns:** `number`"
  ^js [signature-help-items]
  (.-argumentIndex ^js signature-help-items))

(defn set-argument-index!
  "The argument selected in the set of parameters."
  ^js [signature-help-items value]
  (set! (.-argumentIndex ^js signature-help-items) value))

(defn argument-count
  "The argument count
   
   **Returns:** `number`"
  ^js [signature-help-items]
  (.-argumentCount ^js signature-help-items))

(defn set-argument-count!
  "The argument count"
  ^js [signature-help-items value]
  (set! (.-argumentCount ^js signature-help-items) value))
