(ns dots.typescript.pseudo-big-int
  "Represents a bigint literal value without requiring bigint support")

(defn negative?
  ^js [pseudo-big-int]
  (.-negative ^js pseudo-big-int))

(defn set-negative!
  ^js [pseudo-big-int value]
  (set! (.-negative ^js pseudo-big-int) value))

(defn base-10-value
  ^js [pseudo-big-int]
  (.-base10Value ^js pseudo-big-int))

(defn set-base-10-value!
  ^js [pseudo-big-int value]
  (set! (.-base10Value ^js pseudo-big-int) value))
