(ns dots.typescript.server.protocol.apply-code-action-command-request
  (:refer-clojure :exclude [seq type]))

(defn command
  "**Returns:** `CommandTypes.ApplyCodeActionCommand`"
  ^js [apply-code-action-command-request]
  (.-command ^js apply-code-action-command-request))

(defn set-command!
  ^js [apply-code-action-command-request value]
  (set! (.-command ^js apply-code-action-command-request) value))

(defn arguments
  "**Returns:** `ApplyCodeActionCommandRequestArgs`"
  ^js [apply-code-action-command-request]
  (.-arguments ^js apply-code-action-command-request))

(defn set-arguments!
  ^js [apply-code-action-command-request value]
  (set! (.-arguments ^js apply-code-action-command-request) value))

(defn type
  "**Returns:** `\"request\"`"
  ^js [apply-code-action-command-request]
  (.-type ^js apply-code-action-command-request))

(defn set-type!
  ^js [apply-code-action-command-request value]
  (set! (.-type ^js apply-code-action-command-request) value))

(defn seq
  "Sequence number of the message
   
   **Returns:** `number`"
  ^js [apply-code-action-command-request]
  (.-seq ^js apply-code-action-command-request))

(defn set-seq!
  "Sequence number of the message"
  ^js [apply-code-action-command-request value]
  (set! (.-seq ^js apply-code-action-command-request) value))
