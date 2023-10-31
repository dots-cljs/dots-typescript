(ns dots.typescript.server.initialization-failed-response)

(defn kind
  ^js [initialization-failed-response]
  (.-kind ^js initialization-failed-response))

(defn message
  ^js [initialization-failed-response]
  (.-message ^js initialization-failed-response))

(defn stack
  ^js [initialization-failed-response]
  (.-stack ^js initialization-failed-response))
