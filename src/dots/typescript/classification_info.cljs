(ns dots.typescript.classification-info)

(defn length
  ^js [classification-info]
  (.-length ^js classification-info))

(defn set-length!
  ^js [classification-info value]
  (set! (.-length ^js classification-info) value))

(defn classification
  ^js [classification-info]
  (.-classification ^js classification-info))

(defn set-classification!
  ^js [classification-info value]
  (set! (.-classification ^js classification-info) value))
