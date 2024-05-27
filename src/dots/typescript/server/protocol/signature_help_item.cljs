(ns dots.typescript.server.protocol.signature-help-item
  "Represents a single signature to show in signature help.")

(defn variadic?
  "Whether the signature accepts a variable number of arguments.
   
   **Returns:** `boolean`"
  ^js [signature-help-item]
  (.-isVariadic ^js signature-help-item))

(defn set-is-variadic!
  "Whether the signature accepts a variable number of arguments."
  ^js [signature-help-item value]
  (set! (.-isVariadic ^js signature-help-item) value))

(defn prefix-display-parts
  "The prefix display parts.
   
   **Returns:** `SymbolDisplayPart[]`"
  ^js [signature-help-item]
  (.-prefixDisplayParts ^js signature-help-item))

(defn set-prefix-display-parts!
  "The prefix display parts."
  ^js [signature-help-item value]
  (set! (.-prefixDisplayParts ^js signature-help-item) value))

(defn suffix-display-parts
  "The suffix display parts.
   
   **Returns:** `SymbolDisplayPart[]`"
  ^js [signature-help-item]
  (.-suffixDisplayParts ^js signature-help-item))

(defn set-suffix-display-parts!
  "The suffix display parts."
  ^js [signature-help-item value]
  (set! (.-suffixDisplayParts ^js signature-help-item) value))

(defn separator-display-parts
  "The separator display parts.
   
   **Returns:** `SymbolDisplayPart[]`"
  ^js [signature-help-item]
  (.-separatorDisplayParts ^js signature-help-item))

(defn set-separator-display-parts!
  "The separator display parts."
  ^js [signature-help-item value]
  (set! (.-separatorDisplayParts ^js signature-help-item) value))

(defn parameters
  "The signature helps items for the parameters.
   
   **Returns:** `SignatureHelpParameter[]`"
  ^js [signature-help-item]
  (.-parameters ^js signature-help-item))

(defn set-parameters!
  "The signature helps items for the parameters."
  ^js [signature-help-item value]
  (set! (.-parameters ^js signature-help-item) value))

(defn documentation
  "The signature's documentation
   
   **Returns:** `SymbolDisplayPart[]`"
  ^js [signature-help-item]
  (.-documentation ^js signature-help-item))

(defn set-documentation!
  "The signature's documentation"
  ^js [signature-help-item value]
  (set! (.-documentation ^js signature-help-item) value))

(defn tags
  "The signature's JSDoc tags
   
   **Returns:** `JSDocTagInfo[]`"
  ^js [signature-help-item]
  (.-tags ^js signature-help-item))

(defn set-tags!
  "The signature's JSDoc tags"
  ^js [signature-help-item value]
  (set! (.-tags ^js signature-help-item) value))
