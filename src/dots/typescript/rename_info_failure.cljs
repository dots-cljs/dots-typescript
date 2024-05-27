(ns dots.typescript.rename-info-failure)

(defn can-rename
  "**Returns:** `false`"
  ^js [rename-info-failure]
  (.-canRename ^js rename-info-failure))

(defn set-can-rename!
  ^js [rename-info-failure value]
  (set! (.-canRename ^js rename-info-failure) value))

(defn localized-error-message
  "**Returns:** `string`"
  ^js [rename-info-failure]
  (.-localizedErrorMessage ^js rename-info-failure))

(defn set-localized-error-message!
  ^js [rename-info-failure value]
  (set! (.-localizedErrorMessage ^js rename-info-failure) value))
