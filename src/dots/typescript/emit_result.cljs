(ns dots.typescript.emit-result)

(defn emit-skipped?
  "**Returns:** `boolean`"
  ^js [emit-result]
  (.-emitSkipped ^js emit-result))

(defn set-emit-skipped!
  ^js [emit-result value]
  (set! (.-emitSkipped ^js emit-result) value))

(defn diagnostics
  "Contains declaration emit diagnostics
   
   **Returns:** `readonly Diagnostic[]`"
  ^js [emit-result]
  (.-diagnostics ^js emit-result))

(defn set-diagnostics!
  "Contains declaration emit diagnostics"
  ^js [emit-result value]
  (set! (.-diagnostics ^js emit-result) value))

(defn emitted-files
  "**Returns:** `string[] | undefined`"
  ^js [emit-result]
  (.-emittedFiles ^js emit-result))

(defn set-emitted-files!
  ^js [emit-result value]
  (set! (.-emittedFiles ^js emit-result) value))
