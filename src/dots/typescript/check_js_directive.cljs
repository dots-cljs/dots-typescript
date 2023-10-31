(ns dots.typescript.check-js-directive)

(defn enabled?
  ^js [check-js-directive]
  (.-enabled ^js check-js-directive))

(defn set-enabled!
  ^js [check-js-directive value]
  (set! (.-enabled ^js check-js-directive) value))

(defn pos
  ^js [check-js-directive]
  (.-pos ^js check-js-directive))

(defn set-pos!
  ^js [check-js-directive value]
  (set! (.-pos ^js check-js-directive) value))

(defn end
  ^js [check-js-directive]
  (.-end ^js check-js-directive))

(defn set-end!
  ^js [check-js-directive value]
  (set! (.-end ^js check-js-directive) value))
