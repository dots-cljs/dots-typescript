(ns dots.typescript.server.event-sender)

(defn event
  "**Returns:** `Event`"
  ^js [event-sender]
  (.-event ^js event-sender))

(defn set-event!
  ^js [event-sender value]
  (set! (.-event ^js event-sender) value))
