(ns dots.typescript.linked-editing-info)

(defn ranges
  ^js [linked-editing-info]
  (.-ranges ^js linked-editing-info))

(defn word-pattern
  ^js [linked-editing-info]
  (.-wordPattern ^js linked-editing-info))

(defn set-word-pattern!
  ^js [linked-editing-info value]
  (set! (.-wordPattern ^js linked-editing-info) value))
