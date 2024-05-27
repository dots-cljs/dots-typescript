(ns dots.typescript.server.pending-error-check)

(defn file-name
  "**Returns:** `NormalizedPath`"
  ^js [pending-error-check]
  (.-fileName ^js pending-error-check))

(defn set-file-name!
  ^js [pending-error-check value]
  (set! (.-fileName ^js pending-error-check) value))

(defn project
  "**Returns:** `Project`"
  ^js [pending-error-check]
  (.-project ^js pending-error-check))

(defn set-project!
  ^js [pending-error-check value]
  (set! (.-project ^js pending-error-check) value))
