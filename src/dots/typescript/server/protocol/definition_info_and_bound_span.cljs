(ns dots.typescript.server.protocol.definition-info-and-bound-span)

(defn definitions
  ^js [definition-info-and-bound-span]
  (.-definitions ^js definition-info-and-bound-span))

(defn set-definitions!
  ^js [definition-info-and-bound-span value]
  (set! (.-definitions ^js definition-info-and-bound-span) value))

(defn text-span
  ^js [definition-info-and-bound-span]
  (.-textSpan ^js definition-info-and-bound-span))

(defn set-text-span!
  ^js [definition-info-and-bound-span value]
  (set! (.-textSpan ^js definition-info-and-bound-span) value))
