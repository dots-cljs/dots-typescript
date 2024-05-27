(ns dots.typescript.text-change-range)

(defn span
  "**Returns:** `TextSpan`"
  ^js [text-change-range]
  (.-span ^js text-change-range))

(defn set-span!
  ^js [text-change-range value]
  (set! (.-span ^js text-change-range) value))

(defn new-length
  "**Returns:** `number`"
  ^js [text-change-range]
  (.-newLength ^js text-change-range))

(defn set-new-length!
  ^js [text-change-range value]
  (set! (.-newLength ^js text-change-range) value))
