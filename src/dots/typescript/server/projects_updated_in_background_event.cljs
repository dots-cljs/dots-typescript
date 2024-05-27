(ns dots.typescript.server.projects-updated-in-background-event)

(defn event-name
  "**Returns:** `\"projectsUpdatedInBackground\"`"
  ^js [projects-updated-in-background-event]
  (.-eventName ^js projects-updated-in-background-event))

(defn set-event-name!
  ^js [projects-updated-in-background-event value]
  (set! (.-eventName ^js projects-updated-in-background-event) value))

(defn data
  "**Returns:** `{ openFiles: string[]; }`"
  ^js [projects-updated-in-background-event]
  (.-data ^js projects-updated-in-background-event))

(defn set-data!
  ^js [projects-updated-in-background-event value]
  (set! (.-data ^js projects-updated-in-background-event) value))
