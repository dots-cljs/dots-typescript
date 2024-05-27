(ns dots.typescript.server.protocol.begin-install-types-event-body)

(defn event-id
  "correlation id to match begin and end events
   
   **Returns:** `number`"
  ^js [begin-install-types-event-body]
  (.-eventId ^js begin-install-types-event-body))

(defn set-event-id!
  "correlation id to match begin and end events"
  ^js [begin-install-types-event-body value]
  (set! (.-eventId ^js begin-install-types-event-body) value))

(defn packages
  "list of packages to install
   
   **Returns:** `readonly string[]`"
  ^js [begin-install-types-event-body]
  (.-packages ^js begin-install-types-event-body))

(defn set-packages!
  "list of packages to install"
  ^js [begin-install-types-event-body value]
  (set! (.-packages ^js begin-install-types-event-body) value))
