(ns dots.typescript.symbol-display-part)

(defn text
  "**Returns:** `string`"
  ^js [symbol-display-part]
  (.-text ^js symbol-display-part))

(defn set-text!
  ^js [symbol-display-part value]
  (set! (.-text ^js symbol-display-part) value))

(defn kind
  "**Returns:** `string`"
  ^js [symbol-display-part]
  (.-kind ^js symbol-display-part))

(defn set-kind!
  ^js [symbol-display-part value]
  (set! (.-kind ^js symbol-display-part) value))
