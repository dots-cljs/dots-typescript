(ns dots.typescript.cancellation-token)

(defn cancellation-requested?
  ^js [cancellation-token]
  (.isCancellationRequested ^js cancellation-token))

(defn throw-if-cancellation-requested
  ^js [cancellation-token]
  (.throwIfCancellationRequested ^js cancellation-token))
