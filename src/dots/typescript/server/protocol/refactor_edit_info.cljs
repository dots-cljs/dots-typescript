(ns dots.typescript.server.protocol.refactor-edit-info)

(defn edits
  ^js [refactor-edit-info]
  (.-edits ^js refactor-edit-info))

(defn set-edits!
  ^js [refactor-edit-info value]
  (set! (.-edits ^js refactor-edit-info) value))

(defn rename-location
  "An optional location where the editor should start a rename operation once
   the refactoring edits have been applied"
  ^js [refactor-edit-info]
  (.-renameLocation ^js refactor-edit-info))

(defn set-rename-location!
  "An optional location where the editor should start a rename operation once
   the refactoring edits have been applied"
  ^js [refactor-edit-info value]
  (set! (.-renameLocation ^js refactor-edit-info) value))

(defn rename-filename
  ^js [refactor-edit-info]
  (.-renameFilename ^js refactor-edit-info))

(defn set-rename-filename!
  ^js [refactor-edit-info value]
  (set! (.-renameFilename ^js refactor-edit-info) value))

(defn not-applicable-reason
  ^js [refactor-edit-info]
  (.-notApplicableReason ^js refactor-edit-info))

(defn set-not-applicable-reason!
  ^js [refactor-edit-info value]
  (set! (.-notApplicableReason ^js refactor-edit-info) value))
