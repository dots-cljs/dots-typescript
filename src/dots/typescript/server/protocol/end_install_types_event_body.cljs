(ns dots.typescript.server.protocol.end-install-types-event-body)

(defn success?
  "true if installation succeeded, otherwise false"
  ^js [end-install-types-event-body]
  (.-success ^js end-install-types-event-body))

(defn set-success!
  "true if installation succeeded, otherwise false"
  ^js [end-install-types-event-body value]
  (set! (.-success ^js end-install-types-event-body) value))

(defn event-id
  "correlation id to match begin and end events"
  ^js [end-install-types-event-body]
  (.-eventId ^js end-install-types-event-body))

(defn set-event-id!
  "correlation id to match begin and end events"
  ^js [end-install-types-event-body value]
  (set! (.-eventId ^js end-install-types-event-body) value))

(defn packages
  "list of packages to install"
  ^js [end-install-types-event-body]
  (.-packages ^js end-install-types-event-body))

(defn set-packages!
  "list of packages to install"
  ^js [end-install-types-event-body value]
  (set! (.-packages ^js end-install-types-event-body) value))
