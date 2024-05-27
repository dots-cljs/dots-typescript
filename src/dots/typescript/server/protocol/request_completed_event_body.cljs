(ns dots.typescript.server.protocol.request-completed-event-body)

(defn request-seq
  "**Returns:** `number`"
  ^js [request-completed-event-body]
  (.-request_seq ^js request-completed-event-body))

(defn set-request-seq!
  ^js [request-completed-event-body value]
  (set! (.-request_seq ^js request-completed-event-body) value))
