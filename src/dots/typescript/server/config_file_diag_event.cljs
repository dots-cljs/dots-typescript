(ns dots.typescript.server.config-file-diag-event)

(defn event-name
  "**Returns:** `\"configFileDiag\"`"
  ^js [config-file-diag-event]
  (.-eventName ^js config-file-diag-event))

(defn set-event-name!
  ^js [config-file-diag-event value]
  (set! (.-eventName ^js config-file-diag-event) value))

(defn data
  "**Returns:** `{ triggerFile: string; configFileName: string; diagnostics: readonly Diagnostic[]; }`"
  ^js [config-file-diag-event]
  (.-data ^js config-file-diag-event))

(defn set-data!
  ^js [config-file-diag-event value]
  (set! (.-data ^js config-file-diag-event) value))
