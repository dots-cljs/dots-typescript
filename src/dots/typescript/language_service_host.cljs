(ns dots.typescript.language-service-host)

(defn compilation-settings
  "**Returns:** `CompilerOptions`"
  ^js [language-service-host]
  (.getCompilationSettings ^js language-service-host))

(defn new-line
  "**Returns:** `string`"
  ^js [language-service-host]
  (.getNewLine ^js language-service-host))

(defn project-version
  "**Returns:** `string`"
  ^js [language-service-host]
  (.getProjectVersion ^js language-service-host))

(defn script-file-names
  "**Returns:** `string[]`"
  ^js [language-service-host]
  (.getScriptFileNames ^js language-service-host))

(defn script-kind
  "**Parameters:**
   - `file-name`: `string`
   
   **Returns:** `ScriptKind`"
  ^js [language-service-host file-name]
  (.getScriptKind ^js language-service-host file-name))

(defn script-version
  "**Parameters:**
   - `file-name`: `string`
   
   **Returns:** `string`"
  ^js [language-service-host file-name]
  (.getScriptVersion ^js language-service-host file-name))

(defn script-snapshot
  "**Parameters:**
   - `file-name`: `string`
   
   **Returns:** `IScriptSnapshot | undefined`"
  ^js [language-service-host file-name]
  (.getScriptSnapshot ^js language-service-host file-name))

(defn project-references
  "**Returns:** `readonly ProjectReference[] | undefined`"
  ^js [language-service-host]
  (.getProjectReferences ^js language-service-host))

(defn localized-diagnostic-messages
  "**Returns:** `any`"
  ^js [language-service-host]
  (.getLocalizedDiagnosticMessages ^js language-service-host))

(defn cancellation-token
  "**Returns:** `HostCancellationToken`"
  ^js [language-service-host]
  (.getCancellationToken ^js language-service-host))

(defn current-directory
  "**Returns:** `string`"
  ^js [language-service-host]
  (.getCurrentDirectory ^js language-service-host))

(defn default-lib-file-name
  "**Parameters:**
   - `options`: `CompilerOptions`
   
   **Returns:** `string`"
  ^js [language-service-host options]
  (.getDefaultLibFileName ^js language-service-host options))

(defn log
  "**Parameters:**
   - `s`: `string`
   
   **Returns:** `void`"
  ^js [language-service-host s]
  (.log ^js language-service-host s))

(defn trace
  "**Parameters:**
   - `s`: `string`
   
   **Returns:** `void`"
  ^js [language-service-host s]
  (.trace ^js language-service-host s))

(defn error
  "**Parameters:**
   - `s`: `string`
   
   **Returns:** `void`"
  ^js [language-service-host s]
  (.error ^js language-service-host s))

(defn use-case-sensitive-file-names?
  "**Returns:** `boolean`"
  ^js [language-service-host]
  (.useCaseSensitiveFileNames ^js language-service-host))

(defn read-directory
  "**Parameters:**
   - `path`: `string`
   - `extensions`: `readonly string[] | undefined`
   - `exclude`: `readonly string[] | undefined`
   - `include`: `readonly string[] | undefined`
   - `depth`: `number | undefined`
   
   **Returns:** `string[]`"
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
  "**Parameters:**
   - `path`: `string`
   
   **Returns:** `string`"
  ^js [language-service-host path]
  (.realpath ^js language-service-host path))

(defn read-file
  "**Parameters:**
   - `path`: `string`
   - `encoding`: `string | undefined`
   
   **Returns:** `string | undefined`"
  (^js [language-service-host path]
   (.readFile ^js language-service-host path))
  (^js [language-service-host path encoding]
   (.readFile ^js language-service-host path encoding)))

(defn file-exists?
  "**Parameters:**
   - `path`: `string`
   
   **Returns:** `boolean`"
  ^js [language-service-host path]
  (.fileExists ^js language-service-host path))

(defn type-roots-version
  "**Returns:** `number`"
  ^js [language-service-host]
  (.getTypeRootsVersion ^js language-service-host))

(defn resolve-module-names
  "**Parameters:**
   - `module-names`: `string[]`
   - `containing-file`: `string`
   - `reused-names`: `string[] | undefined`
   - `redirected-reference`: `ResolvedProjectReference | undefined`
   - `options`: `CompilerOptions`
   - `containing-source-file`: `SourceFile | undefined`
   
   **Returns:** `(ResolvedModule | undefined)[]`"
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
  "**Parameters:**
   - `modulename`: `string`
   - `containing-file`: `string`
   - `resolution-mode`: `ResolutionMode`
   
   **Returns:** `ResolvedModuleWithFailedLookupLocations | undefined`"
  (^js [language-service-host modulename containing-file]
   (.getResolvedModuleWithFailedLookupLocationsFromCache ^js language-service-host modulename containing-file))
  (^js [language-service-host modulename containing-file resolution-mode]
   (.getResolvedModuleWithFailedLookupLocationsFromCache ^js language-service-host modulename containing-file resolution-mode)))

(defn resolve-type-reference-directives
  "**Parameters:**
   - `type-directive-names`: `string[] | FileReference[]`
   - `containing-file`: `string`
   - `redirected-reference`: `ResolvedProjectReference | undefined`
   - `options`: `CompilerOptions`
   - `containing-file-mode`: `ResolutionMode`
   
   **Returns:** `(ResolvedTypeReferenceDirective | undefined)[]`"
  (^js [language-service-host type-directive-names containing-file]
   (.resolveTypeReferenceDirectives ^js language-service-host type-directive-names containing-file))
  (^js [language-service-host type-directive-names containing-file redirected-reference]
   (.resolveTypeReferenceDirectives ^js language-service-host type-directive-names containing-file redirected-reference))
  (^js [language-service-host type-directive-names containing-file redirected-reference options]
   (.resolveTypeReferenceDirectives ^js language-service-host type-directive-names containing-file redirected-reference options))
  (^js [language-service-host type-directive-names containing-file redirected-reference options containing-file-mode]
   (.resolveTypeReferenceDirectives ^js language-service-host type-directive-names containing-file redirected-reference options containing-file-mode)))

(defn resolve-module-name-literals
  "**Parameters:**
   - `module-literals`: `readonly StringLiteralLike[]`
   - `containing-file`: `string`
   - `redirected-reference`: `ResolvedProjectReference | undefined`
   - `options`: `CompilerOptions`
   - `containing-source-file`: `SourceFile`
   - `reused-names`: `readonly StringLiteralLike[] | undefined`
   
   **Returns:** `readonly ResolvedModuleWithFailedLookupLocations[]`"
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
  "**Parameters:**
   - `type-directive-references`: `readonly T[]`
   - `containing-file`: `string`
   - `redirected-reference`: `ResolvedProjectReference | undefined`
   - `options`: `CompilerOptions`
   - `containing-source-file`: `SourceFile | undefined`
   - `reused-names`: `readonly T[] | undefined`
   
   **Returns:** `readonly ResolvedTypeReferenceDirectiveWithFailedLookupLocations[]`"
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
  "**Parameters:**
   - `directory-name`: `string`
   
   **Returns:** `string[]`"
  ^js [language-service-host directory-name]
  (.getDirectories ^js language-service-host directory-name))

(defn custom-transformers
  "Gets a set of custom transformers to use during emit.
   
   **Returns:** `CustomTransformers | undefined`"
  ^js [language-service-host]
  (.getCustomTransformers ^js language-service-host))

(defn known-types-package-name?
  "**Parameters:**
   - `name`: `string`
   
   **Returns:** `boolean`"
  ^js [language-service-host name]
  (.isKnownTypesPackageName ^js language-service-host name))

(defn install-package
  "**Parameters:**
   - `options`: `InstallPackageOptions`
   
   **Returns:** `Promise<ApplyCodeActionCommandResult>`"
  ^js [language-service-host options]
  (.installPackage ^js language-service-host options))

(defn write-file
  "**Parameters:**
   - `file-name`: `string`
   - `content`: `string`
   
   **Returns:** `void`"
  ^js [language-service-host file-name content]
  (.writeFile ^js language-service-host file-name content))

(defn parsed-command-line
  "**Parameters:**
   - `file-name`: `string`
   
   **Returns:** `ParsedCommandLine | undefined`"
  ^js [language-service-host file-name]
  (.getParsedCommandLine ^js language-service-host file-name))

(defn js-doc-parsing-mode
  "**Returns:** `JSDocParsingMode | undefined`"
  ^js [language-service-host]
  (.-jsDocParsingMode ^js language-service-host))

(defn set-js-doc-parsing-mode!
  ^js [language-service-host value]
  (set! (.-jsDocParsingMode ^js language-service-host) value))

(defn compiler-host
  "**Returns:** `CompilerHost | undefined`"
  ^js [language-service-host]
  (.getCompilerHost ^js language-service-host))

(defn directory-exists?
  "**Parameters:**
   - `directory-name`: `string`
   
   **Returns:** `boolean`"
  ^js [language-service-host directory-name]
  (.directoryExists ^js language-service-host directory-name))
