(ns dots.typescript.server.protocol.compile-on-save-mixin)

(defn compile-on-save?
  "If compile on save is enabled for the project"
  ^js [compile-on-save-mixin]
  (.-compileOnSave ^js compile-on-save-mixin))

(defn set-compile-on-save!
  "If compile on save is enabled for the project"
  ^js [compile-on-save-mixin value]
  (set! (.-compileOnSave ^js compile-on-save-mixin) value))
