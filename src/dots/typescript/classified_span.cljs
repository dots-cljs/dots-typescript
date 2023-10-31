(ns dots.typescript.classified-span)

(defn text-span
  ^js [classified-span]
  (.-textSpan ^js classified-span))

(defn set-text-span!
  ^js [classified-span value]
  (set! (.-textSpan ^js classified-span) value))

(defn classification-type
  ^js [classified-span]
  (.-classificationType ^js classified-span))

(defn set-classification-type!
  ^js [classified-span value]
  (set! (.-classificationType ^js classified-span) value))
