(ns dots.typescript.completion-entry-data-resolved)

(defn module-specifier
  ^js [completion-entry-data-resolved]
  (.-moduleSpecifier ^js completion-entry-data-resolved))

(defn set-module-specifier!
  ^js [completion-entry-data-resolved value]
  (set! (.-moduleSpecifier ^js completion-entry-data-resolved) value))

(defn export-name
  "The name of the property or export in the module's symbol table. Differs from the completion name
   in the case of InternalSymbolName.ExportEquals and InternalSymbolName.Default."
  ^js [completion-entry-data-resolved]
  (.-exportName ^js completion-entry-data-resolved))

(defn set-export-name!
  "The name of the property or export in the module's symbol table. Differs from the completion name
   in the case of InternalSymbolName.ExportEquals and InternalSymbolName.Default."
  ^js [completion-entry-data-resolved value]
  (set! (.-exportName ^js completion-entry-data-resolved) value))

(defn export-map-key
  ^js [completion-entry-data-resolved]
  (.-exportMapKey ^js completion-entry-data-resolved))

(defn set-export-map-key!
  ^js [completion-entry-data-resolved value]
  (set! (.-exportMapKey ^js completion-entry-data-resolved) value))

(defn file-name
  "The file name declaring the export's module symbol, if it was an external module"
  ^js [completion-entry-data-resolved]
  (.-fileName ^js completion-entry-data-resolved))

(defn set-file-name!
  "The file name declaring the export's module symbol, if it was an external module"
  ^js [completion-entry-data-resolved value]
  (set! (.-fileName ^js completion-entry-data-resolved) value))

(defn ambient-module-name
  "The module name (with quotes stripped) of the export's module symbol, if it was an ambient module"
  ^js [completion-entry-data-resolved]
  (.-ambientModuleName ^js completion-entry-data-resolved))

(defn set-ambient-module-name!
  "The module name (with quotes stripped) of the export's module symbol, if it was an ambient module"
  ^js [completion-entry-data-resolved value]
  (set! (.-ambientModuleName ^js completion-entry-data-resolved) value))

(defn package-json-import
  "True if the export was found in the package.json AutoImportProvider"
  ^js [completion-entry-data-resolved]
  (.-isPackageJsonImport ^js completion-entry-data-resolved))

(defn set-is-package-json-import!
  "True if the export was found in the package.json AutoImportProvider"
  ^js [completion-entry-data-resolved value]
  (set! (.-isPackageJsonImport ^js completion-entry-data-resolved) value))
