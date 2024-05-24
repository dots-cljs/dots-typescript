(ns dots.typescript.host-cancellation-token)

(defn cancellation-requested?
  "**Returns:** `boolean`"
  ^js [host-cancellation-token]
  (.isCancellationRequested ^js host-cancellation-token))
