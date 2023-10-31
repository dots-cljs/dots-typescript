(ns dots.typescript.document-registry
  "The document registry represents a store of SourceFile objects that can be shared between
   multiple LanguageService instances. A LanguageService instance holds on the SourceFile (AST)
   of files in the context.
   SourceFile objects account for most of the memory usage by the language service. Sharing
   the same DocumentRegistry instance between different instances of LanguageService allow
   for more efficient memory utilization since all projects will share at least the library
   file (lib.d.ts).
   
   A more advanced use of the document registry is to serialize sourceFile objects to disk
   and re-hydrate them when needed.
   
   To create a default DocumentRegistry, use createDocumentRegistry to create one, and pass it
   to all subsequent createLanguageService calls.")

(defn acquire-document
  "Request a stored SourceFile with a given fileName and compilationSettings.
   The first call to acquire will call createLanguageServiceSourceFile to generate
   the SourceFile if was not found in the registry."
  (^js [document-registry file-name compilation-settings-or-host script-snapshot version]
   (.acquireDocument ^js document-registry file-name compilation-settings-or-host script-snapshot version))
  (^js [document-registry file-name compilation-settings-or-host script-snapshot version script-kind]
   (.acquireDocument ^js document-registry file-name compilation-settings-or-host script-snapshot version script-kind))
  (^js [document-registry file-name compilation-settings-or-host script-snapshot version script-kind source-file-options]
   (.acquireDocument ^js document-registry file-name compilation-settings-or-host script-snapshot version script-kind source-file-options)))

(defn acquire-document-with-key
  (^js [document-registry file-name path compilation-settings-or-host key script-snapshot version]
   (.acquireDocumentWithKey ^js document-registry file-name path compilation-settings-or-host key script-snapshot version))
  (^js [document-registry file-name path compilation-settings-or-host key script-snapshot version script-kind]
   (.acquireDocumentWithKey ^js document-registry file-name path compilation-settings-or-host key script-snapshot version script-kind))
  (^js [document-registry file-name path compilation-settings-or-host key script-snapshot version script-kind source-file-options]
   (.acquireDocumentWithKey ^js document-registry file-name path compilation-settings-or-host key script-snapshot version script-kind source-file-options)))

(defn update-document
  "Request an updated version of an already existing SourceFile with a given fileName
   and compilationSettings. The update will in-turn call updateLanguageServiceSourceFile
   to get an updated SourceFile."
  (^js [document-registry file-name compilation-settings-or-host script-snapshot version]
   (.updateDocument ^js document-registry file-name compilation-settings-or-host script-snapshot version))
  (^js [document-registry file-name compilation-settings-or-host script-snapshot version script-kind]
   (.updateDocument ^js document-registry file-name compilation-settings-or-host script-snapshot version script-kind))
  (^js [document-registry file-name compilation-settings-or-host script-snapshot version script-kind source-file-options]
   (.updateDocument ^js document-registry file-name compilation-settings-or-host script-snapshot version script-kind source-file-options)))

(defn update-document-with-key
  (^js [document-registry file-name path compilation-settings-or-host key script-snapshot version]
   (.updateDocumentWithKey ^js document-registry file-name path compilation-settings-or-host key script-snapshot version))
  (^js [document-registry file-name path compilation-settings-or-host key script-snapshot version script-kind]
   (.updateDocumentWithKey ^js document-registry file-name path compilation-settings-or-host key script-snapshot version script-kind))
  (^js [document-registry file-name path compilation-settings-or-host key script-snapshot version script-kind source-file-options]
   (.updateDocumentWithKey ^js document-registry file-name path compilation-settings-or-host key script-snapshot version script-kind source-file-options)))

(defn key-for-compilation-settings
  ^js [document-registry settings]
  (.getKeyForCompilationSettings ^js document-registry settings))

(defn release-document
  "Informs the DocumentRegistry that a file is not needed any longer.
   
   Note: It is not allowed to call release on a SourceFile that was not acquired from
   this registry originally."
  (^js [document-registry file-name compilation-settings]
   (.releaseDocument ^js document-registry file-name compilation-settings))
  (^js [document-registry file-name compilation-settings script-kind]
   (.releaseDocument ^js document-registry file-name compilation-settings script-kind))
  (^js [document-registry file-name compilation-settings script-kind implied-node-format]
   (.releaseDocument ^js document-registry file-name compilation-settings script-kind implied-node-format)))

(defn release-document-with-key
  (^js [document-registry path key]
   (.releaseDocumentWithKey ^js document-registry path key))
  (^js [document-registry path key script-kind]
   (.releaseDocumentWithKey ^js document-registry path key script-kind))
  (^js [document-registry path key script-kind implied-node-format]
   (.releaseDocumentWithKey ^js document-registry path key script-kind implied-node-format)))

(defn report-stats
  ^js [document-registry]
  (.reportStats ^js document-registry))
