(ns dots.typescript.unchanged-text-change-range
  (:require ["typescript" :as typescript]))

(defn span
  ^js []
  (.-span typescript/unchangedTextChangeRange))

(defn set-span!
  ^js [value]
  (set! (.-span typescript/unchangedTextChangeRange) value))

(defn new-length
  ^js []
  (.-newLength typescript/unchangedTextChangeRange))

(defn set-new-length!
  ^js [value]
  (set! (.-newLength typescript/unchangedTextChangeRange) value))
