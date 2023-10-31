(ns dots.typescript.signature-help-item
  "Represents a single signature to show in signature help.
   The id is used for subsequent calls into the language service to ask questions about the
   signature help item in the context of any documents that have been updated.  i.e. after
   an edit has happened, while signature help is still active, the host can ask important
   questions like 'what parameter is the user currently contained within?'.")

(defn variadic?
  ^js [signature-help-item]
  (.-isVariadic ^js signature-help-item))

(defn set-is-variadic!
  ^js [signature-help-item value]
  (set! (.-isVariadic ^js signature-help-item) value))

(defn prefix-display-parts
  ^js [signature-help-item]
  (.-prefixDisplayParts ^js signature-help-item))

(defn set-prefix-display-parts!
  ^js [signature-help-item value]
  (set! (.-prefixDisplayParts ^js signature-help-item) value))

(defn suffix-display-parts
  ^js [signature-help-item]
  (.-suffixDisplayParts ^js signature-help-item))

(defn set-suffix-display-parts!
  ^js [signature-help-item value]
  (set! (.-suffixDisplayParts ^js signature-help-item) value))

(defn separator-display-parts
  ^js [signature-help-item]
  (.-separatorDisplayParts ^js signature-help-item))

(defn set-separator-display-parts!
  ^js [signature-help-item value]
  (set! (.-separatorDisplayParts ^js signature-help-item) value))

(defn parameters
  ^js [signature-help-item]
  (.-parameters ^js signature-help-item))

(defn set-parameters!
  ^js [signature-help-item value]
  (set! (.-parameters ^js signature-help-item) value))

(defn documentation
  ^js [signature-help-item]
  (.-documentation ^js signature-help-item))

(defn set-documentation!
  ^js [signature-help-item value]
  (set! (.-documentation ^js signature-help-item) value))

(defn tags
  ^js [signature-help-item]
  (.-tags ^js signature-help-item))

(defn set-tags!
  ^js [signature-help-item value]
  (set! (.-tags ^js signature-help-item) value))
