(ns dots.typescript.server.protocol.apply-code-action-command-request-args)

(defn command
  "May also be an array of commands."
  ^js [apply-code-action-command-request-args]
  (.-command ^js apply-code-action-command-request-args))

(defn set-command!
  "May also be an array of commands."
  ^js [apply-code-action-command-request-args value]
  (set! (.-command ^js apply-code-action-command-request-args) value))
