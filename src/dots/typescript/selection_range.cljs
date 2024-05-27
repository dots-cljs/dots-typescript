(ns dots.typescript.selection-range)

(defn text-span
  "**Returns:** `TextSpan`"
  ^js [selection-range]
  (.-textSpan ^js selection-range))

(defn set-text-span!
  ^js [selection-range value]
  (set! (.-textSpan ^js selection-range) value))

(defn parent
  "**Returns:** `SelectionRange | undefined`"
  ^js [selection-range]
  (.-parent ^js selection-range))

(defn set-parent!
  ^js [selection-range value]
  (set! (.-parent ^js selection-range) value))
