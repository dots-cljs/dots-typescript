(ns dots.typescript.comment-range)

(defn has-trailing-new-line?
  ^js [comment-range]
  (.-hasTrailingNewLine ^js comment-range))

(defn set-has-trailing-new-line!
  ^js [comment-range value]
  (set! (.-hasTrailingNewLine ^js comment-range) value))

(defn kind
  ^js [comment-range]
  (.-kind ^js comment-range))

(defn set-kind!
  ^js [comment-range value]
  (set! (.-kind ^js comment-range) value))

(defn pos
  ^js [comment-range]
  (.-pos ^js comment-range))

(defn set-pos!
  ^js [comment-range value]
  (set! (.-pos ^js comment-range) value))

(defn end
  ^js [comment-range]
  (.-end ^js comment-range))

(defn set-end!
  ^js [comment-range value]
  (set! (.-end ^js comment-range) value))
