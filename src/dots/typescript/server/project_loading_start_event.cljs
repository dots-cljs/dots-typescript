(ns dots.typescript.server.project-loading-start-event)

(defn event-name
  ^js [project-loading-start-event]
  (.-eventName ^js project-loading-start-event))

(defn set-event-name!
  ^js [project-loading-start-event value]
  (set! (.-eventName ^js project-loading-start-event) value))

(defn data
  ^js [project-loading-start-event]
  (.-data ^js project-loading-start-event))

(defn set-data!
  ^js [project-loading-start-event value]
  (set! (.-data ^js project-loading-start-event) value))
