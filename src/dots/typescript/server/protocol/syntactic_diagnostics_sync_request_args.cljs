(ns dots.typescript.server.protocol.syntactic-diagnostics-sync-request-args)

(defn include-line-position?
  "**Returns:** `boolean | undefined`"
  ^js [syntactic-diagnostics-sync-request-args]
  (.-includeLinePosition ^js syntactic-diagnostics-sync-request-args))

(defn set-include-line-position!
  ^js [syntactic-diagnostics-sync-request-args value]
  (set! (.-includeLinePosition ^js syntactic-diagnostics-sync-request-args) value))

(defn file
  "The file for the request (absolute pathname required).
   
   **Returns:** `string`"
  ^js [syntactic-diagnostics-sync-request-args]
  (.-file ^js syntactic-diagnostics-sync-request-args))

(defn set-file!
  "The file for the request (absolute pathname required)."
  ^js [syntactic-diagnostics-sync-request-args value]
  (set! (.-file ^js syntactic-diagnostics-sync-request-args) value))

(defn project-file-name
  "**Returns:** `string | undefined`"
  ^js [syntactic-diagnostics-sync-request-args]
  (.-projectFileName ^js syntactic-diagnostics-sync-request-args))

(defn set-project-file-name!
  ^js [syntactic-diagnostics-sync-request-args value]
  (set! (.-projectFileName ^js syntactic-diagnostics-sync-request-args) value))
