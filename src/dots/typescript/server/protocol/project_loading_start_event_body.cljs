(ns dots.typescript.server.protocol.project-loading-start-event-body)

(defn project-name
  "name of the project"
  ^js [project-loading-start-event-body]
  (.-projectName ^js project-loading-start-event-body))

(defn set-project-name!
  "name of the project"
  ^js [project-loading-start-event-body value]
  (set! (.-projectName ^js project-loading-start-event-body) value))

(defn reason
  "reason for loading"
  ^js [project-loading-start-event-body]
  (.-reason ^js project-loading-start-event-body))

(defn set-reason!
  "reason for loading"
  ^js [project-loading-start-event-body value]
  (set! (.-reason ^js project-loading-start-event-body) value))
