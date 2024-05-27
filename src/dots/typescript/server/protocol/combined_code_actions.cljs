(ns dots.typescript.server.protocol.combined-code-actions)

(defn changes
  "**Returns:** `readonly FileCodeEdits[]`"
  ^js [combined-code-actions]
  (.-changes ^js combined-code-actions))

(defn set-changes!
  ^js [combined-code-actions value]
  (set! (.-changes ^js combined-code-actions) value))

(defn commands
  "**Returns:** `readonly {}[] | undefined`"
  ^js [combined-code-actions]
  (.-commands ^js combined-code-actions))

(defn set-commands!
  ^js [combined-code-actions value]
  (set! (.-commands ^js combined-code-actions) value))
