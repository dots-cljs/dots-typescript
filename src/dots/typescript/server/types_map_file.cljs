(ns dots.typescript.server.types-map-file)

(defn types-map
  ^js [types-map-file]
  (.-typesMap ^js types-map-file))

(defn set-types-map!
  ^js [types-map-file value]
  (set! (.-typesMap ^js types-map-file) value))

(defn simple-map
  ^js [types-map-file]
  (.-simpleMap ^js types-map-file))

(defn set-simple-map!
  ^js [types-map-file value]
  (set! (.-simpleMap ^js types-map-file) value))
