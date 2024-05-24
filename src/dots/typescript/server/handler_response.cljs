(ns dots.typescript.server.handler-response)

(defn response
  ^js [handler-response]
  (.-response ^js handler-response))

(defn set-response!
  ^js [handler-response value]
  (set! (.-response ^js handler-response) value))

(defn response-required?
  ^js [handler-response]
  (.-responseRequired ^js handler-response))

(defn set-response-required!
  ^js [handler-response value]
  (set! (.-responseRequired ^js handler-response) value))
