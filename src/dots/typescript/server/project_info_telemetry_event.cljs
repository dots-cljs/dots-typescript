(ns dots.typescript.server.project-info-telemetry-event
  "This will be converted to the payload of a protocol.TelemetryEvent in session.defaultEventHandler.")

(defn event-name
  "**Returns:** `\"projectInfo\"`"
  ^js [project-info-telemetry-event]
  (.-eventName ^js project-info-telemetry-event))

(defn data
  "**Returns:** `ProjectInfoTelemetryEventData`"
  ^js [project-info-telemetry-event]
  (.-data ^js project-info-telemetry-event))
