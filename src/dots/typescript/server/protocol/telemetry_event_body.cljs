(ns dots.typescript.server.protocol.telemetry-event-body)

(defn telemetry-event-name
  "**Returns:** `string`"
  ^js [telemetry-event-body]
  (.-telemetryEventName ^js telemetry-event-body))

(defn set-telemetry-event-name!
  ^js [telemetry-event-body value]
  (set! (.-telemetryEventName ^js telemetry-event-body) value))

(defn payload
  "**Returns:** `any`"
  ^js [telemetry-event-body]
  (.-payload ^js telemetry-event-body))

(defn set-payload!
  ^js [telemetry-event-body value]
  (set! (.-payload ^js telemetry-event-body) value))
