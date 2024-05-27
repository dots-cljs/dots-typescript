(ns dots.typescript.server.project-loading-finish-event)

(defn event-name
  "**Returns:** `\"projectLoadingFinish\"`"
  ^js [project-loading-finish-event]
  (.-eventName ^js project-loading-finish-event))

(defn set-event-name!
  ^js [project-loading-finish-event value]
  (set! (.-eventName ^js project-loading-finish-event) value))

(defn data
  "**Returns:** `{ project: Project; }`"
  ^js [project-loading-finish-event]
  (.-data ^js project-loading-finish-event))

(defn set-data!
  ^js [project-loading-finish-event value]
  (set! (.-data ^js project-loading-finish-event) value))
