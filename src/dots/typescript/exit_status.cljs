(ns dots.typescript.exit-status
  "Return code used by getEmitOutput function to indicate status of the function"
  (:require ["typescript" :as typescript]))

(def success (.-Success typescript/ExitStatus))

(def diagnostics-present-outputs-skipped (.-DiagnosticsPresent_OutputsSkipped typescript/ExitStatus))

(def diagnostics-present-outputs-generated (.-DiagnosticsPresent_OutputsGenerated typescript/ExitStatus))

(def invalid-project-outputs-skipped (.-InvalidProject_OutputsSkipped typescript/ExitStatus))

(def project-reference-cycle-outputs-skipped (.-ProjectReferenceCycle_OutputsSkipped typescript/ExitStatus))
