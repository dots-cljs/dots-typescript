(ns dots.typescript.rename-info-options)

(defn allow-rename-of-import-path?
  ^js [rename-info-options]
  (.-allowRenameOfImportPath ^js rename-info-options))
