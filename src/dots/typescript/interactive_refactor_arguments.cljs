(ns dots.typescript.interactive-refactor-arguments)

(defn target-file
  "**Returns:** `string`"
  ^js [interactive-refactor-arguments]
  (.-targetFile ^js interactive-refactor-arguments))

(defn set-target-file!
  ^js [interactive-refactor-arguments value]
  (set! (.-targetFile ^js interactive-refactor-arguments) value))
