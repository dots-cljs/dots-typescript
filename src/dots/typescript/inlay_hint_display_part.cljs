(ns dots.typescript.inlay-hint-display-part)

(defn text
  ^js [inlay-hint-display-part]
  (.-text ^js inlay-hint-display-part))

(defn set-text!
  ^js [inlay-hint-display-part value]
  (set! (.-text ^js inlay-hint-display-part) value))

(defn span
  ^js [inlay-hint-display-part]
  (.-span ^js inlay-hint-display-part))

(defn set-span!
  ^js [inlay-hint-display-part value]
  (set! (.-span ^js inlay-hint-display-part) value))

(defn file
  ^js [inlay-hint-display-part]
  (.-file ^js inlay-hint-display-part))

(defn set-file!
  ^js [inlay-hint-display-part value]
  (set! (.-file ^js inlay-hint-display-part) value))
