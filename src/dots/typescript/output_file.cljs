(ns dots.typescript.output-file
  (:refer-clojure :exclude [name]))

(defn name
  ^js [output-file]
  (.-name ^js output-file))

(defn set-name!
  ^js [output-file value]
  (set! (.-name ^js output-file) value))

(defn write-byte-order-mark?
  ^js [output-file]
  (.-writeByteOrderMark ^js output-file))

(defn set-write-byte-order-mark!
  ^js [output-file value]
  (set! (.-writeByteOrderMark ^js output-file) value))

(defn text
  ^js [output-file]
  (.-text ^js output-file))

(defn set-text!
  ^js [output-file value]
  (set! (.-text ^js output-file) value))
