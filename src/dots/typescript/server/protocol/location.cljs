(ns dots.typescript.server.protocol.location
  "Location in source code expressed as (one-based) line and (one-based) column offset.")

(defn line
  "**Returns:** `number`"
  ^js [location]
  (.-line ^js location))

(defn set-line!
  ^js [location value]
  (set! (.-line ^js location) value))

(defn offset
  "**Returns:** `number`"
  ^js [location]
  (.-offset ^js location))

(defn set-offset!
  ^js [location value]
  (set! (.-offset ^js location) value))
