(ns dots.typescript.server.protocol.typings-installed-telemetry-event-body)

(defn telemetry-event-name
  "**Returns:** `\"typingsInstalled\"`"
  ^js [typings-installed-telemetry-event-body]
  (.-telemetryEventName ^js typings-installed-telemetry-event-body))

(defn set-telemetry-event-name!
  ^js [typings-installed-telemetry-event-body value]
  (set! (.-telemetryEventName ^js typings-installed-telemetry-event-body) value))

(defn payload
  "**Returns:** `TypingsInstalledTelemetryEventPayload`"
  ^js [typings-installed-telemetry-event-body]
  (.-payload ^js typings-installed-telemetry-event-body))

(defn set-payload!
  ^js [typings-installed-telemetry-event-body value]
  (set! (.-payload ^js typings-installed-telemetry-event-body) value))
