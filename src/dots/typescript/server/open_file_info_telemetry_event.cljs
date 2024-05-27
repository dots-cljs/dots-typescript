(ns dots.typescript.server.open-file-info-telemetry-event
  "Info that we may send about a file that was just opened.
   Info about a file will only be sent once per session, even if the file changes in ways that might affect the info.
   Currently this is only sent for '.js' files.")

(defn event-name
  "**Returns:** `\"openFileInfo\"`"
  ^js [open-file-info-telemetry-event]
  (.-eventName ^js open-file-info-telemetry-event))

(defn data
  "**Returns:** `OpenFileInfoTelemetryEventData`"
  ^js [open-file-info-telemetry-event]
  (.-data ^js open-file-info-telemetry-event))
