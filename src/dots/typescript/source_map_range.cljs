(ns dots.typescript.source-map-range)

(defn source
  ^js [source-map-range]
  (.-source ^js source-map-range))

(defn set-source!
  ^js [source-map-range value]
  (set! (.-source ^js source-map-range) value))

(defn pos
  ^js [source-map-range]
  (.-pos ^js source-map-range))

(defn set-pos!
  ^js [source-map-range value]
  (set! (.-pos ^js source-map-range) value))

(defn end
  ^js [source-map-range]
  (.-end ^js source-map-range))

(defn set-end!
  ^js [source-map-range value]
  (set! (.-end ^js source-map-range) value))
