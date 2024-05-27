(ns dots.typescript.signature-help-parameter
  (:refer-clojure :exclude [name]))

(defn name
  "**Returns:** `string`"
  ^js [signature-help-parameter]
  (.-name ^js signature-help-parameter))

(defn set-name!
  ^js [signature-help-parameter value]
  (set! (.-name ^js signature-help-parameter) value))

(defn documentation
  "**Returns:** `SymbolDisplayPart[]`"
  ^js [signature-help-parameter]
  (.-documentation ^js signature-help-parameter))

(defn set-documentation!
  ^js [signature-help-parameter value]
  (set! (.-documentation ^js signature-help-parameter) value))

(defn display-parts
  "**Returns:** `SymbolDisplayPart[]`"
  ^js [signature-help-parameter]
  (.-displayParts ^js signature-help-parameter))

(defn set-display-parts!
  ^js [signature-help-parameter value]
  (set! (.-displayParts ^js signature-help-parameter) value))

(defn optional?
  "**Returns:** `boolean`"
  ^js [signature-help-parameter]
  (.-isOptional ^js signature-help-parameter))

(defn set-is-optional!
  ^js [signature-help-parameter value]
  (set! (.-isOptional ^js signature-help-parameter) value))

(defn rest?
  "**Returns:** `boolean | undefined`"
  ^js [signature-help-parameter]
  (.-isRest ^js signature-help-parameter))

(defn set-is-rest!
  ^js [signature-help-parameter value]
  (set! (.-isRest ^js signature-help-parameter) value))
