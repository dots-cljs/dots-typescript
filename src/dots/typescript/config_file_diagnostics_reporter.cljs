(ns dots.typescript.config-file-diagnostics-reporter
  "Reports config file diagnostics")

(defn on-un-recoverable-config-file-diagnostic
  "Reports unrecoverable error when parsing config file"
  ^js [config-file-diagnostics-reporter]
  (.-onUnRecoverableConfigFileDiagnostic ^js config-file-diagnostics-reporter))

(defn set-on-un-recoverable-config-file-diagnostic!
  "Reports unrecoverable error when parsing config file"
  ^js [config-file-diagnostics-reporter value]
  (set! (.-onUnRecoverableConfigFileDiagnostic ^js config-file-diagnostics-reporter) value))
