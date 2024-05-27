(ns dots.typescript.server.open-configured-project-result)

(defn config-file-name
  "**Returns:** `NormalizedPath | undefined`"
  ^js [open-configured-project-result]
  (.-configFileName ^js open-configured-project-result))

(defn set-config-file-name!
  ^js [open-configured-project-result value]
  (set! (.-configFileName ^js open-configured-project-result) value))

(defn config-file-errors
  "**Returns:** `readonly Diagnostic[] | undefined`"
  ^js [open-configured-project-result]
  (.-configFileErrors ^js open-configured-project-result))

(defn set-config-file-errors!
  ^js [open-configured-project-result value]
  (set! (.-configFileErrors ^js open-configured-project-result) value))
