(ns dots.typescript.server.initialization-failed-response)

(defn kind
  "**Returns:** `\"event::initializationFailed\"`"
  ^js [initialization-failed-response]
  (.-kind ^js initialization-failed-response))

(defn message
  "**Returns:** `string`"
  ^js [initialization-failed-response]
  (.-message ^js initialization-failed-response))

(defn stack
  "**Returns:** `string | undefined`"
  ^js [initialization-failed-response]
  (.-stack ^js initialization-failed-response))
