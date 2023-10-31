(ns dots.typescript.completion-entry-data-auto-import)

(defn export-name
  "The name of the property or export in the module's symbol table. Differs from the completion name
   in the case of InternalSymbolName.ExportEquals and InternalSymbolName.Default."
  ^js [completion-entry-data-auto-import]
  (.-exportName ^js completion-entry-data-auto-import))

(defn set-export-name!
  "The name of the property or export in the module's symbol table. Differs from the completion name
   in the case of InternalSymbolName.ExportEquals and InternalSymbolName.Default."
  ^js [completion-entry-data-auto-import value]
  (set! (.-exportName ^js completion-entry-data-auto-import) value))

(defn export-map-key
  ^js [completion-entry-data-auto-import]
  (.-exportMapKey ^js completion-entry-data-auto-import))

(defn set-export-map-key!
  ^js [completion-entry-data-auto-import value]
  (set! (.-exportMapKey ^js completion-entry-data-auto-import) value))

(defn module-specifier
  ^js [completion-entry-data-auto-import]
  (.-moduleSpecifier ^js completion-entry-data-auto-import))

(defn set-module-specifier!
  ^js [completion-entry-data-auto-import value]
  (set! (.-moduleSpecifier ^js completion-entry-data-auto-import) value))

(defn file-name
  "The file name declaring the export's module symbol, if it was an external module"
  ^js [completion-entry-data-auto-import]
  (.-fileName ^js completion-entry-data-auto-import))

(defn set-file-name!
  "The file name declaring the export's module symbol, if it was an external module"
  ^js [completion-entry-data-auto-import value]
  (set! (.-fileName ^js completion-entry-data-auto-import) value))

(defn ambient-module-name
  "The module name (with quotes stripped) of the export's module symbol, if it was an ambient module"
  ^js [completion-entry-data-auto-import]
  (.-ambientModuleName ^js completion-entry-data-auto-import))

(defn set-ambient-module-name!
  "The module name (with quotes stripped) of the export's module symbol, if it was an ambient module"
  ^js [completion-entry-data-auto-import value]
  (set! (.-ambientModuleName ^js completion-entry-data-auto-import) value))

(defn package-json-import
  "True if the export was found in the package.json AutoImportProvider"
  ^js [completion-entry-data-auto-import]
  (.-isPackageJsonImport ^js completion-entry-data-auto-import))

(defn set-is-package-json-import!
  "True if the export was found in the package.json AutoImportProvider"
  ^js [completion-entry-data-auto-import value]
  (set! (.-isPackageJsonImport ^js completion-entry-data-auto-import) value))
