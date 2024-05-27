(ns dots.typescript.server.watch-options-and-errors)

(defn watch-options
  "**Returns:** `WatchOptions`"
  ^js [watch-options-and-errors]
  (.-watchOptions ^js watch-options-and-errors))

(defn set-watch-options!
  ^js [watch-options-and-errors value]
  (set! (.-watchOptions ^js watch-options-and-errors) value))

(defn errors
  "**Returns:** `Diagnostic[] | undefined`"
  ^js [watch-options-and-errors]
  (.-errors ^js watch-options-and-errors))

(defn set-errors!
  ^js [watch-options-and-errors value]
  (set! (.-errors ^js watch-options-and-errors) value))
