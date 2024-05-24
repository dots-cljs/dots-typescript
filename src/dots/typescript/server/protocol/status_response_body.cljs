(ns dots.typescript.server.protocol.status-response-body)

(defn version
  "The TypeScript version (`ts.version`)."
  ^js [status-response-body]
  (.-version ^js status-response-body))

(defn set-version!
  "The TypeScript version (`ts.version`)."
  ^js [status-response-body value]
  (set! (.-version ^js status-response-body) value))
