(ns dots.typescript.emit-output)

(defn output-files
  "**Returns:** `OutputFile[]`"
  ^js [emit-output]
  (.-outputFiles ^js emit-output))

(defn set-output-files!
  ^js [emit-output value]
  (set! (.-outputFiles ^js emit-output) value))

(defn emit-skipped?
  "**Returns:** `boolean`"
  ^js [emit-output]
  (.-emitSkipped ^js emit-output))

(defn set-emit-skipped!
  ^js [emit-output value]
  (set! (.-emitSkipped ^js emit-output) value))
