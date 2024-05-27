(ns dots.typescript.server.protocol.semantic-diagnostics-sync-request-args)

(defn include-line-position?
  "**Returns:** `boolean | undefined`"
  ^js [semantic-diagnostics-sync-request-args]
  (.-includeLinePosition ^js semantic-diagnostics-sync-request-args))

(defn set-include-line-position!
  ^js [semantic-diagnostics-sync-request-args value]
  (set! (.-includeLinePosition ^js semantic-diagnostics-sync-request-args) value))

(defn file
  "The file for the request (absolute pathname required).
   
   **Returns:** `string`"
  ^js [semantic-diagnostics-sync-request-args]
  (.-file ^js semantic-diagnostics-sync-request-args))

(defn set-file!
  "The file for the request (absolute pathname required)."
  ^js [semantic-diagnostics-sync-request-args value]
  (set! (.-file ^js semantic-diagnostics-sync-request-args) value))

(defn project-file-name
  "**Returns:** `string | undefined`"
  ^js [semantic-diagnostics-sync-request-args]
  (.-projectFileName ^js semantic-diagnostics-sync-request-args))

(defn set-project-file-name!
  ^js [semantic-diagnostics-sync-request-args value]
  (set! (.-projectFileName ^js semantic-diagnostics-sync-request-args) value))
