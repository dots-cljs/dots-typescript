(ns dots.typescript.text-change)

(defn span
  "**Returns:** `TextSpan`"
  ^js [text-change]
  (.-span ^js text-change))

(defn set-span!
  ^js [text-change value]
  (set! (.-span ^js text-change) value))

(defn new-text
  "**Returns:** `string`"
  ^js [text-change]
  (.-newText ^js text-change))

(defn set-new-text!
  ^js [text-change value]
  (set! (.-newText ^js text-change) value))
