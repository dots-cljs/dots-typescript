(ns dots.typescript.text-change-range)

(defn span
  ^js [text-change-range]
  (.-span ^js text-change-range))

(defn set-span!
  ^js [text-change-range value]
  (set! (.-span ^js text-change-range) value))

(defn new-length
  ^js [text-change-range]
  (.-newLength ^js text-change-range))

(defn set-new-length!
  ^js [text-change-range value]
  (set! (.-newLength ^js text-change-range) value))
