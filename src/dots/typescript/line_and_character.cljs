(ns dots.typescript.line-and-character)

(defn line
  "0-based."
  ^js [line-and-character]
  (.-line ^js line-and-character))

(defn set-line!
  "0-based."
  ^js [line-and-character value]
  (set! (.-line ^js line-and-character) value))

(defn character
  ^js [line-and-character]
  (.-character ^js line-and-character))

(defn set-character!
  ^js [line-and-character value]
  (set! (.-character ^js line-and-character) value))
