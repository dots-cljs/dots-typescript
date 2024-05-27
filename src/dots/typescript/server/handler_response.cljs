(ns dots.typescript.server.handler-response)

(defn response
  "**Returns:** `{} | undefined`"
  ^js [handler-response]
  (.-response ^js handler-response))

(defn set-response!
  ^js [handler-response value]
  (set! (.-response ^js handler-response) value))

(defn response-required?
  "**Returns:** `boolean | undefined`"
  ^js [handler-response]
  (.-responseRequired ^js handler-response))

(defn set-response-required!
  ^js [handler-response value]
  (set! (.-responseRequired ^js handler-response) value))
