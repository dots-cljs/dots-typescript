(ns dots.typescript.server.protocol.config-file-diagnostic-event-body)

(defn trigger-file
  "The file which trigged the searching and error-checking of the config file
   
   **Returns:** `string`"
  ^js [config-file-diagnostic-event-body]
  (.-triggerFile ^js config-file-diagnostic-event-body))

(defn set-trigger-file!
  "The file which trigged the searching and error-checking of the config file"
  ^js [config-file-diagnostic-event-body value]
  (set! (.-triggerFile ^js config-file-diagnostic-event-body) value))

(defn config-file
  "The name of the found config file.
   
   **Returns:** `string`"
  ^js [config-file-diagnostic-event-body]
  (.-configFile ^js config-file-diagnostic-event-body))

(defn set-config-file!
  "The name of the found config file."
  ^js [config-file-diagnostic-event-body value]
  (set! (.-configFile ^js config-file-diagnostic-event-body) value))

(defn diagnostics
  "An arry of diagnostic information items for the found config file.
   
   **Returns:** `DiagnosticWithFileName[]`"
  ^js [config-file-diagnostic-event-body]
  (.-diagnostics ^js config-file-diagnostic-event-body))

(defn set-diagnostics!
  "An arry of diagnostic information items for the found config file."
  ^js [config-file-diagnostic-event-body value]
  (set! (.-diagnostics ^js config-file-diagnostic-event-body) value))
