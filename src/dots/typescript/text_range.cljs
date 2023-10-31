(ns dots.typescript.text-range)

(defn pos
  ^js [text-range]
  (.-pos ^js text-range))

(defn set-pos!
  ^js [text-range value]
  (set! (.-pos ^js text-range) value))

(defn end
  ^js [text-range]
  (.-end ^js text-range))

(defn set-end!
  ^js [text-range value]
  (set! (.-end ^js text-range) value))
