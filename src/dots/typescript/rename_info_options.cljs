(ns dots.typescript.rename-info-options)

(defn allow-rename-of-import-path?
  "**Returns:** `boolean | undefined`"
  ^js [rename-info-options]
  (.-allowRenameOfImportPath ^js rename-info-options))
