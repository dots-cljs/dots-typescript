(ns dots.typescript.refactor-edit-info
  "A set of edits to make in response to a refactor action, plus an optional
   location where renaming should be invoked from")

(defn edits
  "**Returns:** `FileTextChanges[]`"
  ^js [refactor-edit-info]
  (.-edits ^js refactor-edit-info))

(defn set-edits!
  ^js [refactor-edit-info value]
  (set! (.-edits ^js refactor-edit-info) value))

(defn rename-filename
  "**Returns:** `string | undefined`"
  ^js [refactor-edit-info]
  (.-renameFilename ^js refactor-edit-info))

(defn set-rename-filename!
  ^js [refactor-edit-info value]
  (set! (.-renameFilename ^js refactor-edit-info) value))

(defn rename-location
  "**Returns:** `number | undefined`"
  ^js [refactor-edit-info]
  (.-renameLocation ^js refactor-edit-info))

(defn set-rename-location!
  ^js [refactor-edit-info value]
  (set! (.-renameLocation ^js refactor-edit-info) value))

(defn commands
  "**Returns:** `InstallPackageAction[] | undefined`"
  ^js [refactor-edit-info]
  (.-commands ^js refactor-edit-info))

(defn set-commands!
  ^js [refactor-edit-info value]
  (set! (.-commands ^js refactor-edit-info) value))

(defn not-applicable-reason
  "**Returns:** `string | undefined`"
  ^js [refactor-edit-info]
  (.-notApplicableReason ^js refactor-edit-info))

(defn set-not-applicable-reason!
  ^js [refactor-edit-info value]
  (set! (.-notApplicableReason ^js refactor-edit-info) value))
