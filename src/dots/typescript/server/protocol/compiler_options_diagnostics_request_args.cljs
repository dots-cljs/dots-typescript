(ns dots.typescript.server.protocol.compiler-options-diagnostics-request-args
  "Arguments for CompilerOptionsDiagnosticsRequest request.")

(defn project-file-name
  "Name of the project to retrieve compiler options diagnostics.
   
   **Returns:** `string`"
  ^js [compiler-options-diagnostics-request-args]
  (.-projectFileName ^js compiler-options-diagnostics-request-args))

(defn set-project-file-name!
  "Name of the project to retrieve compiler options diagnostics."
  ^js [compiler-options-diagnostics-request-args value]
  (set! (.-projectFileName ^js compiler-options-diagnostics-request-args) value))
