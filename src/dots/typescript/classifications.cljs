(ns dots.typescript.classifications)

(defn spans
  ^js [classifications]
  (.-spans ^js classifications))

(defn set-spans!
  ^js [classifications value]
  (set! (.-spans ^js classifications) value))

(defn end-of-line-state
  ^js [classifications]
  (.-endOfLineState ^js classifications))

(defn set-end-of-line-state!
  ^js [classifications value]
  (set! (.-endOfLineState ^js classifications) value))
