(ns dots.typescript.cancellation-token)

(defn cancellation-requested?
  "**Returns:** `boolean`"
  ^js [cancellation-token]
  (.isCancellationRequested ^js cancellation-token))

(defn throw-if-cancellation-requested
  "**Returns:** `void`"
  ^js [cancellation-token]
  (.throwIfCancellationRequested ^js cancellation-token))
