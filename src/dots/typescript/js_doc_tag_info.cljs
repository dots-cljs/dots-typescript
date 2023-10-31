(ns dots.typescript.js-doc-tag-info
  (:refer-clojure :exclude [name]))

(defn name
  ^js [js-doc-tag-info]
  (.-name ^js js-doc-tag-info))

(defn set-name!
  ^js [js-doc-tag-info value]
  (set! (.-name ^js js-doc-tag-info) value))

(defn text
  ^js [js-doc-tag-info]
  (.-text ^js js-doc-tag-info))

(defn set-text!
  ^js [js-doc-tag-info value]
  (set! (.-text ^js js-doc-tag-info) value))
