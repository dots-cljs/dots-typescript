(ns dots.typescript.server.protocol.compile-on-save-emit-file-request-args
  "Arguments for CompileOnSaveEmitFileRequest")

(defn forced?
  "if true - then file should be recompiled even if it does not have any changes.
   
   **Returns:** `boolean | undefined`"
  ^js [compile-on-save-emit-file-request-args]
  (.-forced ^js compile-on-save-emit-file-request-args))

(defn set-forced!
  "if true - then file should be recompiled even if it does not have any changes."
  ^js [compile-on-save-emit-file-request-args value]
  (set! (.-forced ^js compile-on-save-emit-file-request-args) value))

(defn include-line-position?
  "**Returns:** `boolean | undefined`"
  ^js [compile-on-save-emit-file-request-args]
  (.-includeLinePosition ^js compile-on-save-emit-file-request-args))

(defn set-include-line-position!
  ^js [compile-on-save-emit-file-request-args value]
  (set! (.-includeLinePosition ^js compile-on-save-emit-file-request-args) value))

(defn rich-response?
  "if true - return response as object with emitSkipped and diagnostics
   
   **Returns:** `boolean | undefined`"
  ^js [compile-on-save-emit-file-request-args]
  (.-richResponse ^js compile-on-save-emit-file-request-args))

(defn set-rich-response!
  "if true - return response as object with emitSkipped and diagnostics"
  ^js [compile-on-save-emit-file-request-args value]
  (set! (.-richResponse ^js compile-on-save-emit-file-request-args) value))

(defn file
  "The file for the request (absolute pathname required).
   
   **Returns:** `string`"
  ^js [compile-on-save-emit-file-request-args]
  (.-file ^js compile-on-save-emit-file-request-args))

(defn set-file!
  "The file for the request (absolute pathname required)."
  ^js [compile-on-save-emit-file-request-args value]
  (set! (.-file ^js compile-on-save-emit-file-request-args) value))

(defn project-file-name
  "**Returns:** `string | undefined`"
  ^js [compile-on-save-emit-file-request-args]
  (.-projectFileName ^js compile-on-save-emit-file-request-args))

(defn set-project-file-name!
  ^js [compile-on-save-emit-file-request-args value]
  (set! (.-projectFileName ^js compile-on-save-emit-file-request-args) value))
