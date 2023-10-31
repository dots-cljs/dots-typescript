(ns dots.typescript.completion-entry-data-unresolved)

(defn export-map-key
  "The key in the `ExportMapCache` where the completion entry's `SymbolExportInfo[]` is found"
  ^js [completion-entry-data-unresolved]
  (.-exportMapKey ^js completion-entry-data-unresolved))

(defn set-export-map-key!
  "The key in the `ExportMapCache` where the completion entry's `SymbolExportInfo[]` is found"
  ^js [completion-entry-data-unresolved value]
  (set! (.-exportMapKey ^js completion-entry-data-unresolved) value))

(defn export-name
  "The name of the property or export in the module's symbol table. Differs from the completion name
   in the case of InternalSymbolName.ExportEquals and InternalSymbolName.Default."
  ^js [completion-entry-data-unresolved]
  (.-exportName ^js completion-entry-data-unresolved))

(defn set-export-name!
  "The name of the property or export in the module's symbol table. Differs from the completion name
   in the case of InternalSymbolName.ExportEquals and InternalSymbolName.Default."
  ^js [completion-entry-data-unresolved value]
  (set! (.-exportName ^js completion-entry-data-unresolved) value))

(defn module-specifier
  ^js [completion-entry-data-unresolved]
  (.-moduleSpecifier ^js completion-entry-data-unresolved))

(defn set-module-specifier!
  ^js [completion-entry-data-unresolved value]
  (set! (.-moduleSpecifier ^js completion-entry-data-unresolved) value))

(defn file-name
  "The file name declaring the export's module symbol, if it was an external module"
  ^js [completion-entry-data-unresolved]
  (.-fileName ^js completion-entry-data-unresolved))

(defn set-file-name!
  "The file name declaring the export's module symbol, if it was an external module"
  ^js [completion-entry-data-unresolved value]
  (set! (.-fileName ^js completion-entry-data-unresolved) value))

(defn ambient-module-name
  "The module name (with quotes stripped) of the export's module symbol, if it was an ambient module"
  ^js [completion-entry-data-unresolved]
  (.-ambientModuleName ^js completion-entry-data-unresolved))

(defn set-ambient-module-name!
  "The module name (with quotes stripped) of the export's module symbol, if it was an ambient module"
  ^js [completion-entry-data-unresolved value]
  (set! (.-ambientModuleName ^js completion-entry-data-unresolved) value))

(defn package-json-import
  "True if the export was found in the package.json AutoImportProvider"
  ^js [completion-entry-data-unresolved]
  (.-isPackageJsonImport ^js completion-entry-data-unresolved))

(defn set-is-package-json-import!
  "True if the export was found in the package.json AutoImportProvider"
  ^js [completion-entry-data-unresolved value]
  (set! (.-isPackageJsonImport ^js completion-entry-data-unresolved) value))
