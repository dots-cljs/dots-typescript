(ns dots.typescript.server.protocol.projects-updated-in-background-event-body)

(defn open-files
  "Current set of open files
   
   **Returns:** `string[]`"
  ^js [projects-updated-in-background-event-body]
  (.-openFiles ^js projects-updated-in-background-event-body))

(defn set-open-files!
  "Current set of open files"
  ^js [projects-updated-in-background-event-body value]
  (set! (.-openFiles ^js projects-updated-in-background-event-body) value))
