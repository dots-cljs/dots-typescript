(ns dots.typescript.language-service-host)

(defn compilation-settings
  ^js [language-service-host]
  (.getCompilationSettings ^js language-service-host))

(defn new-line
  ^js [language-service-host]
  (.getNewLine ^js language-service-host))

(defn project-version
  ^js [language-service-host]
  (.getProjectVersion ^js language-service-host))

(defn script-file-names
  ^js [language-service-host]
  (.getScriptFileNames ^js language-service-host))

(defn script-kind
  ^js [language-service-host file-name]
  (.getScriptKind ^js language-service-host file-name))

(defn script-version
  ^js [language-service-host file-name]
  (.getScriptVersion ^js language-service-host file-name))

(defn script-snapshot
  ^js [language-service-host file-name]
  (.getScriptSnapshot ^js language-service-host file-name))

(defn project-references
  ^js [language-service-host]
  (.getProjectReferences ^js language-service-host))

(defn localized-diagnostic-messages
  ^js [language-service-host]
  (.getLocalizedDiagnosticMessages ^js language-service-host))

(defn cancellation-token
  ^js [language-service-host]
  (.getCancellationToken ^js language-service-host))

(defn current-directory
  ^js [language-service-host]
  (.getCurrentDirectory ^js language-service-host))

(defn default-lib-file-name
  ^js [language-service-host options]
  (.getDefaultLibFileName ^js language-service-host options))

(defn log
  ^js [language-service-host s]
  (.log ^js language-service-host s))

(defn trace
  ^js [language-service-host s]
  (.trace ^js language-service-host s))

(defn error
  ^js [language-service-host s]
  (.error ^js language-service-host s))

(defn use-case-sensitive-file-names?
  ^js [language-service-host]
  (.useCaseSensitiveFileNames ^js language-service-host))

(defn read-directory
  (^js [language-service-host path]
   (.readDirectory ^js language-service-host path))
  (^js [language-service-host path extensions]
   (.readDirectory ^js language-service-host path extensions))
  (^js [language-service-host path extensions exclude]
   (.readDirectory ^js language-service-host path extensions exclude))
  (^js [language-service-host path extensions exclude include]
   (.readDirectory ^js language-service-host path extensions exclude include))
  (^js [language-service-host path extensions exclude include depth]
   (.readDirectory ^js language-service-host path extensions exclude include depth)))

(defn realpath
  ^js [language-service-host path]
  (.realpath ^js language-service-host path))

(defn read-file
  (^js [language-service-host path]
   (.readFile ^js language-service-host path))
  (^js [language-service-host path encoding]
   (.readFile ^js language-service-host path encoding)))

(defn file-exists?
  ^js [language-service-host path]
  (.fileExists ^js language-service-host path))

(defn type-roots-version
  ^js [language-service-host]
  (.getTypeRootsVersion ^js language-service-host))

(defn resolve-module-names
  (^js [language-service-host module-names containing-file]
   (.resolveModuleNames ^js language-service-host module-names containing-file))
  (^js [language-service-host module-names containing-file reused-names]
   (.resolveModuleNames ^js language-service-host module-names containing-file reused-names))
  (^js [language-service-host module-names containing-file reused-names redirected-reference]
   (.resolveModuleNames ^js language-service-host module-names containing-file reused-names redirected-reference))
  (^js [language-service-host module-names containing-file reused-names redirected-reference options]
   (.resolveModuleNames ^js language-service-host module-names containing-file reused-names redirected-reference options))
  (^js [language-service-host module-names containing-file reused-names redirected-reference options containing-source-file]
   (.resolveModuleNames ^js language-service-host module-names containing-file reused-names redirected-reference options containing-source-file)))

(defn resolved-module-with-failed-lookup-locations-from-cache
  (^js [language-service-host modulename containing-file]
   (.getResolvedModuleWithFailedLookupLocationsFromCache ^js language-service-host modulename containing-file))
  (^js [language-service-host modulename containing-file resolution-mode]
   (.getResolvedModuleWithFailedLookupLocationsFromCache ^js language-service-host modulename containing-file resolution-mode)))

(defn resolve-type-reference-directives
  (^js [language-service-host type-directive-names containing-file]
   (.resolveTypeReferenceDirectives ^js language-service-host type-directive-names containing-file))
  (^js [language-service-host type-directive-names containing-file redirected-reference]
   (.resolveTypeReferenceDirectives ^js language-service-host type-directive-names containing-file redirected-reference))
  (^js [language-service-host type-directive-names containing-file redirected-reference options]
   (.resolveTypeReferenceDirectives ^js language-service-host type-directive-names containing-file redirected-reference options))
  (^js [language-service-host type-directive-names containing-file redirected-reference options containing-file-mode]
   (.resolveTypeReferenceDirectives ^js language-service-host type-directive-names containing-file redirected-reference options containing-file-mode)))

(defn resolve-module-name-literals
  (^js [language-service-host module-literals containing-file]
   (.resolveModuleNameLiterals ^js language-service-host module-literals containing-file))
  (^js [language-service-host module-literals containing-file redirected-reference]
   (.resolveModuleNameLiterals ^js language-service-host module-literals containing-file redirected-reference))
  (^js [language-service-host module-literals containing-file redirected-reference options]
   (.resolveModuleNameLiterals ^js language-service-host module-literals containing-file redirected-reference options))
  (^js [language-service-host module-literals containing-file redirected-reference options containing-source-file]
   (.resolveModuleNameLiterals ^js language-service-host module-literals containing-file redirected-reference options containing-source-file))
  (^js [language-service-host module-literals containing-file redirected-reference options containing-source-file reused-names]
   (.resolveModuleNameLiterals ^js language-service-host module-literals containing-file redirected-reference options containing-source-file reused-names)))

(defn resolve-type-reference-directive-references
  (^js [language-service-host type-directive-references containing-file]
   (.resolveTypeReferenceDirectiveReferences ^js language-service-host type-directive-references containing-file))
  (^js [language-service-host type-directive-references containing-file redirected-reference]
   (.resolveTypeReferenceDirectiveReferences ^js language-service-host type-directive-references containing-file redirected-reference))
  (^js [language-service-host type-directive-references containing-file redirected-reference options]
   (.resolveTypeReferenceDirectiveReferences ^js language-service-host type-directive-references containing-file redirected-reference options))
  (^js [language-service-host type-directive-references containing-file redirected-reference options containing-source-file]
   (.resolveTypeReferenceDirectiveReferences ^js language-service-host type-directive-references containing-file redirected-reference options containing-source-file))
  (^js [language-service-host type-directive-references containing-file redirected-reference options containing-source-file reused-names]
   (.resolveTypeReferenceDirectiveReferences ^js language-service-host type-directive-references containing-file redirected-reference options containing-source-file reused-names)))

(defn directories
  ^js [language-service-host directory-name]
  (.getDirectories ^js language-service-host directory-name))

(defn custom-transformers
  "Gets a set of custom transformers to use during emit."
  ^js [language-service-host]
  (.getCustomTransformers ^js language-service-host))

(defn known-types-package-name?
  ^js [language-service-host name]
  (.isKnownTypesPackageName ^js language-service-host name))

(defn install-package
  ^js [language-service-host options]
  (.installPackage ^js language-service-host options))

(defn write-file
  ^js [language-service-host file-name content]
  (.writeFile ^js language-service-host file-name content))

(defn parsed-command-line
  ^js [language-service-host file-name]
  (.getParsedCommandLine ^js language-service-host file-name))

(defn compiler-host
  ^js [language-service-host]
  (.getCompilerHost ^js language-service-host))

(defn directory-exists?
  ^js [language-service-host directory-name]
  (.directoryExists ^js language-service-host directory-name))
