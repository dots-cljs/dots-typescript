(ns dots.typescript.server.protocol.rename-info-failure)

(defn can-rename
  ^js [rename-info-failure]
  (.-canRename ^js rename-info-failure))

(defn set-can-rename!
  ^js [rename-info-failure value]
  (set! (.-canRename ^js rename-info-failure) value))

(defn localized-error-message
  "Error message if item can not be renamed."
  ^js [rename-info-failure]
  (.-localizedErrorMessage ^js rename-info-failure))

(defn set-localized-error-message!
  "Error message if item can not be renamed."
  ^js [rename-info-failure value]
  (set! (.-localizedErrorMessage ^js rename-info-failure) value))
