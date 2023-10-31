(ns dots.typescript.refactor-edit-info
  "A set of edits to make in response to a refactor action, plus an optional
   location where renaming should be invoked from")

(defn edits
  ^js [refactor-edit-info]
  (.-edits ^js refactor-edit-info))

(defn set-edits!
  ^js [refactor-edit-info value]
  (set! (.-edits ^js refactor-edit-info) value))

(defn rename-filename
  ^js [refactor-edit-info]
  (.-renameFilename ^js refactor-edit-info))

(defn set-rename-filename!
  ^js [refactor-edit-info value]
  (set! (.-renameFilename ^js refactor-edit-info) value))

(defn rename-location
  ^js [refactor-edit-info]
  (.-renameLocation ^js refactor-edit-info))

(defn set-rename-location!
  ^js [refactor-edit-info value]
  (set! (.-renameLocation ^js refactor-edit-info) value))

(defn commands
  ^js [refactor-edit-info]
  (.-commands ^js refactor-edit-info))

(defn set-commands!
  ^js [refactor-edit-info value]
  (set! (.-commands ^js refactor-edit-info) value))
