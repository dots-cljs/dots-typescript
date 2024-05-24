(ns dots.typescript.server.protocol.get-combined-code-fix-request-args)

(defn scope
  ^js [get-combined-code-fix-request-args]
  (.-scope ^js get-combined-code-fix-request-args))

(defn set-scope!
  ^js [get-combined-code-fix-request-args value]
  (set! (.-scope ^js get-combined-code-fix-request-args) value))

(defn fix-id
  ^js [get-combined-code-fix-request-args]
  (.-fixId ^js get-combined-code-fix-request-args))

(defn set-fix-id!
  ^js [get-combined-code-fix-request-args value]
  (set! (.-fixId ^js get-combined-code-fix-request-args) value))
