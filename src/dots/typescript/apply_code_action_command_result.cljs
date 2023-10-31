(ns dots.typescript.apply-code-action-command-result)

(defn success-message
  ^js [apply-code-action-command-result]
  (.-successMessage ^js apply-code-action-command-result))

(defn set-success-message!
  ^js [apply-code-action-command-result value]
  (set! (.-successMessage ^js apply-code-action-command-result) value))
