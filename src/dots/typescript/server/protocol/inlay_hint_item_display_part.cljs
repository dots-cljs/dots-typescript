(ns dots.typescript.server.protocol.inlay-hint-item-display-part)

(defn text
  "**Returns:** `string`"
  ^js [inlay-hint-item-display-part]
  (.-text ^js inlay-hint-item-display-part))

(defn set-text!
  ^js [inlay-hint-item-display-part value]
  (set! (.-text ^js inlay-hint-item-display-part) value))

(defn span
  "**Returns:** `FileSpan | undefined`"
  ^js [inlay-hint-item-display-part]
  (.-span ^js inlay-hint-item-display-part))

(defn set-span!
  ^js [inlay-hint-item-display-part value]
  (set! (.-span ^js inlay-hint-item-display-part) value))
