(ns dots.typescript.transpile-output)

(defn output-text
  "**Returns:** `string`"
  ^js [transpile-output]
  (.-outputText ^js transpile-output))

(defn set-output-text!
  ^js [transpile-output value]
  (set! (.-outputText ^js transpile-output) value))

(defn diagnostics
  "**Returns:** `Diagnostic[] | undefined`"
  ^js [transpile-output]
  (.-diagnostics ^js transpile-output))

(defn set-diagnostics!
  ^js [transpile-output value]
  (set! (.-diagnostics ^js transpile-output) value))

(defn source-map-text
  "**Returns:** `string | undefined`"
  ^js [transpile-output]
  (.-sourceMapText ^js transpile-output))

(defn set-source-map-text!
  ^js [transpile-output value]
  (set! (.-sourceMapText ^js transpile-output) value))
