(ns dots.typescript.server.typings-installer.pending-request)

(defn request-id
  "**Returns:** `number`"
  ^js [pending-request]
  (.-requestId ^js pending-request))

(defn set-request-id!
  ^js [pending-request value]
  (set! (.-requestId ^js pending-request) value))

(defn package-names
  "**Returns:** `string[]`"
  ^js [pending-request]
  (.-packageNames ^js pending-request))

(defn set-package-names!
  ^js [pending-request value]
  (set! (.-packageNames ^js pending-request) value))

(defn cwd
  "**Returns:** `string`"
  ^js [pending-request]
  (.-cwd ^js pending-request))

(defn set-cwd!
  ^js [pending-request value]
  (set! (.-cwd ^js pending-request) value))

(defn on-request-completed
  "**Returns:** `RequestCompletedAction`"
  ^js [pending-request]
  (.-onRequestCompleted ^js pending-request))

(defn set-on-request-completed!
  ^js [pending-request value]
  (set! (.-onRequestCompleted ^js pending-request) value))
