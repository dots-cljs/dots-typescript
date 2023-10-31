(ns dots.typescript.classified-span-2020)

(defn text-span
  ^js [classified-span-2020]
  (.-textSpan ^js classified-span-2020))

(defn set-text-span!
  ^js [classified-span-2020 value]
  (set! (.-textSpan ^js classified-span-2020) value))

(defn classification-type
  ^js [classified-span-2020]
  (.-classificationType ^js classified-span-2020))

(defn set-classification-type!
  ^js [classified-span-2020 value]
  (set! (.-classificationType ^js classified-span-2020) value))
