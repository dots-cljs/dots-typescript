(ns dots.typescript.server.protocol.linked-editing-ranges-body)

(defn ranges
  ^js [linked-editing-ranges-body]
  (.-ranges ^js linked-editing-ranges-body))

(defn set-ranges!
  ^js [linked-editing-ranges-body value]
  (set! (.-ranges ^js linked-editing-ranges-body) value))

(defn word-pattern
  ^js [linked-editing-ranges-body]
  (.-wordPattern ^js linked-editing-ranges-body))

(defn set-word-pattern!
  ^js [linked-editing-ranges-body value]
  (set! (.-wordPattern ^js linked-editing-ranges-body) value))
