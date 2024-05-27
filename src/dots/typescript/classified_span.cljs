(ns dots.typescript.classified-span)

(defn text-span
  "**Returns:** `TextSpan`"
  ^js [classified-span]
  (.-textSpan ^js classified-span))

(defn set-text-span!
  ^js [classified-span value]
  (set! (.-textSpan ^js classified-span) value))

(defn classification-type
  "**Returns:** `ClassificationTypeNames`"
  ^js [classified-span]
  (.-classificationType ^js classified-span))

(defn set-classification-type!
  ^js [classified-span value]
  (set! (.-classificationType ^js classified-span) value))
