(ns dots.typescript.server.protocol.project-loading-finish-event-body)

(defn project-name
  "name of the project"
  ^js [project-loading-finish-event-body]
  (.-projectName ^js project-loading-finish-event-body))

(defn set-project-name!
  "name of the project"
  ^js [project-loading-finish-event-body value]
  (set! (.-projectName ^js project-loading-finish-event-body) value))
