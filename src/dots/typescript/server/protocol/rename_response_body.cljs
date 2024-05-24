(ns dots.typescript.server.protocol.rename-response-body)

(defn info
  "Information about the item to be renamed."
  ^js [rename-response-body]
  (.-info ^js rename-response-body))

(defn set-info!
  "Information about the item to be renamed."
  ^js [rename-response-body value]
  (set! (.-info ^js rename-response-body) value))

(defn locs
  "An array of span groups (one per file) that refer to the item to be renamed."
  ^js [rename-response-body]
  (.-locs ^js rename-response-body))

(defn set-locs!
  "An array of span groups (one per file) that refer to the item to be renamed."
  ^js [rename-response-body value]
  (set! (.-locs ^js rename-response-body) value))
