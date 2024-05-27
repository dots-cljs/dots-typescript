(ns dots.typescript.server.protocol.organize-imports-request-args)

(defn scope
  "**Returns:** `GetCombinedCodeFixScope`"
  ^js [organize-imports-request-args]
  (.-scope ^js organize-imports-request-args))

(defn set-scope!
  ^js [organize-imports-request-args value]
  (set! (.-scope ^js organize-imports-request-args) value))

(defn skip-destructive-code-actions?
  "**Returns:** `boolean | undefined`"
  ^js [organize-imports-request-args]
  (.-skipDestructiveCodeActions ^js organize-imports-request-args))

(defn set-skip-destructive-code-actions!
  ^js [organize-imports-request-args value]
  (set! (.-skipDestructiveCodeActions ^js organize-imports-request-args) value))

(defn mode
  "**Returns:** `OrganizeImportsMode | undefined`"
  ^js [organize-imports-request-args]
  (.-mode ^js organize-imports-request-args))

(defn set-mode!
  ^js [organize-imports-request-args value]
  (set! (.-mode ^js organize-imports-request-args) value))
