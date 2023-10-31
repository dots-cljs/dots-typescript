(ns dots.typescript.host-cancellation-token)

(defn cancellation-requested?
  ^js [host-cancellation-token]
  (.isCancellationRequested ^js host-cancellation-token))
