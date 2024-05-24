(ns dots.typescript.server.project-loading-finish-event)

(defn event-name
  ^js [project-loading-finish-event]
  (.-eventName ^js project-loading-finish-event))

(defn set-event-name!
  ^js [project-loading-finish-event value]
  (set! (.-eventName ^js project-loading-finish-event) value))

(defn data
  ^js [project-loading-finish-event]
  (.-data ^js project-loading-finish-event))

(defn set-data!
  ^js [project-loading-finish-event value]
  (set! (.-data ^js project-loading-finish-event) value))
