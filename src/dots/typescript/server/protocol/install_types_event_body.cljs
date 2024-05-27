(ns dots.typescript.server.protocol.install-types-event-body)

(defn event-id
  "correlation id to match begin and end events
   
   **Returns:** `number`"
  ^js [install-types-event-body]
  (.-eventId ^js install-types-event-body))

(defn set-event-id!
  "correlation id to match begin and end events"
  ^js [install-types-event-body value]
  (set! (.-eventId ^js install-types-event-body) value))

(defn packages
  "list of packages to install
   
   **Returns:** `readonly string[]`"
  ^js [install-types-event-body]
  (.-packages ^js install-types-event-body))

(defn set-packages!
  "list of packages to install"
  ^js [install-types-event-body value]
  (set! (.-packages ^js install-types-event-body) value))
