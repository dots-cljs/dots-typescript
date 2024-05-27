(ns dots.typescript.server.protocol.emit-result)

(defn emit-skipped?
  "**Returns:** `boolean`"
  ^js [emit-result]
  (.-emitSkipped ^js emit-result))

(defn set-emit-skipped!
  ^js [emit-result value]
  (set! (.-emitSkipped ^js emit-result) value))

(defn diagnostics
  "**Returns:** `Diagnostic[] | DiagnosticWithLinePosition[]`"
  ^js [emit-result]
  (.-diagnostics ^js emit-result))

(defn set-diagnostics!
  ^js [emit-result value]
  (set! (.-diagnostics ^js emit-result) value))
