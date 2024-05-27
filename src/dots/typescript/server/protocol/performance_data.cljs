(ns dots.typescript.server.protocol.performance-data)

(defn update-graph-duration-ms
  "Time spent updating the program graph, in milliseconds.
   
   **Returns:** `number | undefined`"
  ^js [performance-data]
  (.-updateGraphDurationMs ^js performance-data))

(defn set-update-graph-duration-ms!
  "Time spent updating the program graph, in milliseconds."
  ^js [performance-data value]
  (set! (.-updateGraphDurationMs ^js performance-data) value))

(defn create-auto-import-provider-program-duration-ms
  "The time spent creating or updating the auto-import program, in milliseconds.
   
   **Returns:** `number | undefined`"
  ^js [performance-data]
  (.-createAutoImportProviderProgramDurationMs ^js performance-data))

(defn set-create-auto-import-provider-program-duration-ms!
  "The time spent creating or updating the auto-import program, in milliseconds."
  ^js [performance-data value]
  (set! (.-createAutoImportProviderProgramDurationMs ^js performance-data) value))
