(ns dots.typescript.server.configured-project
  "If a file is opened, the server will look for a tsconfig (or jsconfig)
   and if successful create a ConfiguredProject for it.
   Otherwise it will create an InferredProject.")

(defn canonical-config-file-path
  "**Returns:** `NormalizedPath`"
  ^js [configured-project]
  (.-canonicalConfigFilePath ^js configured-project))

(defn external-project-ref-count
  "Ref count to the project when opened from external project
   
   **Returns:** `any`"
  ^js [configured-project]
  (.-externalProjectRefCount ^js configured-project))

(defn set-external-project-ref-count!
  "Ref count to the project when opened from external project"
  ^js [configured-project value]
  (set! (.-externalProjectRefCount ^js configured-project) value))

(defn project-references
  "**Returns:** `any`"
  ^js [configured-project]
  (.-projectReferences ^js configured-project))

(defn set-project-references!
  ^js [configured-project value]
  (set! (.-projectReferences ^js configured-project) value))

(defn update-graph?
  "If the project has reload from disk pending, it reloads (and then updates graph as part of that) instead of just updating the graph
   
   **Returns:** `boolean` - : true if set of files in the project stays the same and false - otherwise."
  ^js [configured-project]
  (.updateGraph ^js configured-project))

(defn config-file-path
  "**Returns:** `NormalizedPath`"
  ^js [configured-project]
  (.getConfigFilePath ^js configured-project))

(defn get-project-references
  "**Returns:** `readonly ProjectReference[] | undefined`"
  ^js [configured-project]
  (.getProjectReferences ^js configured-project))

(defn update-references
  "**Parameters:**
   - `refs`: `readonly ProjectReference[] | undefined`
   
   **Returns:** `void`"
  (^js [configured-project]
   (.updateReferences ^js configured-project))
  (^js [configured-project refs]
   (.updateReferences ^js configured-project refs)))

(defn global-project-errors
  "Get the errors that dont have any file name associated
   
   **Returns:** `readonly Diagnostic[]`"
  ^js [configured-project]
  (.getGlobalProjectErrors ^js configured-project))

(defn all-project-errors
  "Get all the project errors
   
   **Returns:** `readonly Diagnostic[]`"
  ^js [configured-project]
  (.getAllProjectErrors ^js configured-project))

(defn set-project-errors
  "**Parameters:**
   - `project-errors`: `Diagnostic[]`
   
   **Returns:** `void`"
  ^js [configured-project project-errors]
  (.setProjectErrors ^js configured-project project-errors))

(defn close
  "**Returns:** `void`"
  ^js [configured-project]
  (.close ^js configured-project))

(defn effective-type-roots
  "**Returns:** `string[]`"
  ^js [configured-project]
  (.getEffectiveTypeRoots ^js configured-project))

(defn project-kind
  "**Returns:** `ProjectKind`"
  ^js [configured-project]
  (.-projectKind ^js configured-project))

(defn project-service
  "**Returns:** `ProjectService`"
  ^js [configured-project]
  (.-projectService ^js configured-project))

(defn document-registry
  "**Returns:** `any`"
  ^js [configured-project]
  (.-documentRegistry ^js configured-project))

(defn set-document-registry!
  ^js [configured-project value]
  (set! (.-documentRegistry ^js configured-project) value))

(defn compiler-options
  "**Returns:** `any`"
  ^js [configured-project]
  (.-compilerOptions ^js configured-project))

(defn set-compiler-options!
  ^js [configured-project value]
  (set! (.-compilerOptions ^js configured-project) value))

(defn compile-on-save-enabled?
  "**Returns:** `boolean`"
  ^js [configured-project]
  (.-compileOnSaveEnabled ^js configured-project))

(defn set-compile-on-save-enabled!
  ^js [configured-project value]
  (set! (.-compileOnSaveEnabled ^js configured-project) value))

(defn watch-options
  "**Returns:** `WatchOptions | undefined`"
  ^js [configured-project]
  (.-watchOptions ^js configured-project))

(defn set-watch-options!
  ^js [configured-project value]
  (set! (.-watchOptions ^js configured-project) value))

(defn root-files
  "**Returns:** `any`"
  ^js [configured-project]
  (.-rootFiles ^js configured-project))

(defn set-root-files!
  ^js [configured-project value]
  (set! (.-rootFiles ^js configured-project) value))

(defn root-files-map
  "**Returns:** `any`"
  ^js [configured-project]
  (.-rootFilesMap ^js configured-project))

(defn set-root-files-map!
  ^js [configured-project value]
  (set! (.-rootFilesMap ^js configured-project) value))

(defn program
  "**Returns:** `any`"
  ^js [configured-project]
  (.-program ^js configured-project))

(defn set-program!
  ^js [configured-project value]
  (set! (.-program ^js configured-project) value))

(defn external-files
  "**Returns:** `any`"
  ^js [configured-project]
  (.-externalFiles ^js configured-project))

(defn set-external-files!
  ^js [configured-project value]
  (set! (.-externalFiles ^js configured-project) value))

(defn missing-files-map
  "**Returns:** `any`"
  ^js [configured-project]
  (.-missingFilesMap ^js configured-project))

(defn set-missing-files-map!
  ^js [configured-project value]
  (set! (.-missingFilesMap ^js configured-project) value))

(defn generated-files-map
  "**Returns:** `any`"
  ^js [configured-project]
  (.-generatedFilesMap ^js configured-project))

(defn set-generated-files-map!
  ^js [configured-project value]
  (set! (.-generatedFilesMap ^js configured-project) value))

(defn language-service
  "**Returns:** `LanguageService`"
  ^js [configured-project]
  (.-languageService ^js configured-project))

(defn set-language-service!
  ^js [configured-project value]
  (set! (.-languageService ^js configured-project) value))

(defn language-service-enabled?
  "**Returns:** `boolean`"
  ^js [configured-project]
  (.-languageServiceEnabled ^js configured-project))

(defn set-language-service-enabled!
  ^js [configured-project value]
  (set! (.-languageServiceEnabled ^js configured-project) value))

(defn trace
  "**Returns:** `((s: string) => void) | undefined`"
  ^js [configured-project]
  (.-trace ^js configured-project))

(defn realpath
  "**Returns:** `((path: string) => string) | undefined`"
  ^js [configured-project]
  (.-realpath ^js configured-project))

(defn builder-state
  "**Returns:** `any`"
  ^js [configured-project]
  (.-builderState ^js configured-project))

(defn set-builder-state!
  ^js [configured-project value]
  (set! (.-builderState ^js configured-project) value))

(defn updated-file-names
  "Set of files names that were updated since the last call to getChangesSinceVersion.
   
   **Returns:** `any`"
  ^js [configured-project]
  (.-updatedFileNames ^js configured-project))

(defn set-updated-file-names!
  "Set of files names that were updated since the last call to getChangesSinceVersion."
  ^js [configured-project value]
  (set! (.-updatedFileNames ^js configured-project) value))

(defn last-reported-file-names
  "Set of files that was returned from the last call to getChangesSinceVersion.
   
   **Returns:** `any`"
  ^js [configured-project]
  (.-lastReportedFileNames ^js configured-project))

(defn set-last-reported-file-names!
  "Set of files that was returned from the last call to getChangesSinceVersion."
  ^js [configured-project value]
  (set! (.-lastReportedFileNames ^js configured-project) value))

(defn last-reported-version
  "Last version that was reported.
   
   **Returns:** `any`"
  ^js [configured-project]
  (.-lastReportedVersion ^js configured-project))

(defn set-last-reported-version!
  "Last version that was reported."
  ^js [configured-project value]
  (set! (.-lastReportedVersion ^js configured-project) value))

(defn project-errors
  "**Returns:** `Diagnostic[] | undefined`"
  ^js [configured-project]
  (.-projectErrors ^js configured-project))

(defn set-project-errors!
  ^js [configured-project value]
  (set! (.-projectErrors ^js configured-project) value))

(defn initial-load-pending
  "**Returns:** `() => boolean`"
  ^js [configured-project]
  (.-isInitialLoadPending ^js configured-project))

(defn set-is-initial-load-pending!
  ^js [configured-project value]
  (set! (.-isInitialLoadPending ^js configured-project) value))

(defn cancellation-token
  "**Returns:** `any`"
  ^js [configured-project]
  (.-cancellationToken ^js configured-project))

(defn non-ts-project?
  "**Returns:** `boolean`"
  ^js [configured-project]
  (.isNonTsProject ^js configured-project))

(defn js-only-project?
  "**Returns:** `boolean`"
  ^js [configured-project]
  (.isJsOnlyProject ^js configured-project))

(defn js-doc-parsing-mode
  "**Returns:** `JSDocParsingMode | undefined`"
  ^js [configured-project]
  (.-jsDocParsingMode ^js configured-project))

(defn known-types-package-name?
  "**Parameters:**
   - `name`: `string`
   
   **Returns:** `boolean`"
  ^js [configured-project name]
  (.isKnownTypesPackageName ^js configured-project name))

(defn install-package
  "**Parameters:**
   - `options`: `InstallPackageOptions`
   
   **Returns:** `Promise<ApplyCodeActionCommandResult>`"
  ^js [configured-project options]
  (.installPackage ^js configured-project options))

(defn compilation-settings
  "**Returns:** `CompilerOptions`"
  ^js [configured-project]
  (.getCompilationSettings ^js configured-project))

(defn get-compiler-options
  "**Returns:** `CompilerOptions`"
  ^js [configured-project]
  (.getCompilerOptions ^js configured-project))

(defn new-line
  "**Returns:** `string`"
  ^js [configured-project]
  (.getNewLine ^js configured-project))

(defn project-version
  "**Returns:** `string`"
  ^js [configured-project]
  (.getProjectVersion ^js configured-project))

(defn script-file-names
  "**Returns:** `string[]`"
  ^js [configured-project]
  (.getScriptFileNames ^js configured-project))

(defn or-create-script-info-and-attach-to-project
  "**Returns:** `any`"
  ^js [configured-project]
  (.-getOrCreateScriptInfoAndAttachToProject ^js configured-project))

(defn set-get-or-create-script-info-and-attach-to-project!
  ^js [configured-project value]
  (set! (.-getOrCreateScriptInfoAndAttachToProject ^js configured-project) value))

(defn script-kind
  "**Parameters:**
   - `file-name`: `string`
   
   **Returns:** `ScriptKind`"
  ^js [configured-project file-name]
  (.getScriptKind ^js configured-project file-name))

(defn script-version
  "**Parameters:**
   - `filename`: `string`
   
   **Returns:** `string`"
  ^js [configured-project filename]
  (.getScriptVersion ^js configured-project filename))

(defn script-snapshot
  "**Parameters:**
   - `filename`: `string`
   
   **Returns:** `IScriptSnapshot | undefined`"
  ^js [configured-project filename]
  (.getScriptSnapshot ^js configured-project filename))

(defn get-cancellation-token
  "**Returns:** `HostCancellationToken`"
  ^js [configured-project]
  (.getCancellationToken ^js configured-project))

(defn current-directory
  "**Returns:** `string`"
  ^js [configured-project]
  (.getCurrentDirectory ^js configured-project))

(defn default-lib-file-name
  "**Returns:** `string`"
  ^js [configured-project]
  (.getDefaultLibFileName ^js configured-project))

(defn use-case-sensitive-file-names?
  "**Returns:** `boolean`"
  ^js [configured-project]
  (.useCaseSensitiveFileNames ^js configured-project))

(defn read-directory
  "**Parameters:**
   - `path`: `string`
   - `extensions`: `readonly string[] | undefined`
   - `exclude`: `readonly string[] | undefined`
   - `include`: `readonly string[] | undefined`
   - `depth`: `number | undefined`
   
   **Returns:** `string[]`"
  (^js [configured-project path]
   (.readDirectory ^js configured-project path))
  (^js [configured-project path extensions]
   (.readDirectory ^js configured-project path extensions))
  (^js [configured-project path extensions exclude]
   (.readDirectory ^js configured-project path extensions exclude))
  (^js [configured-project path extensions exclude include]
   (.readDirectory ^js configured-project path extensions exclude include))
  (^js [configured-project path extensions exclude include depth]
   (.readDirectory ^js configured-project path extensions exclude include depth)))

(defn read-file
  "**Parameters:**
   - `file-name`: `string`
   
   **Returns:** `string | undefined`"
  ^js [configured-project file-name]
  (.readFile ^js configured-project file-name))

(defn write-file
  "**Parameters:**
   - `file-name`: `string`
   - `content`: `string`
   
   **Returns:** `void`"
  ^js [configured-project file-name content]
  (.writeFile ^js configured-project file-name content))

(defn file-exists?
  "**Parameters:**
   - `file`: `string`
   
   **Returns:** `boolean`"
  ^js [configured-project file]
  (.fileExists ^js configured-project file))

(defn directory-exists?
  "**Parameters:**
   - `path`: `string`
   
   **Returns:** `boolean`"
  ^js [configured-project path]
  (.directoryExists ^js configured-project path))

(defn directories
  "**Parameters:**
   - `path`: `string`
   
   **Returns:** `string[]`"
  ^js [configured-project path]
  (.getDirectories ^js configured-project path))

(defn log
  "**Parameters:**
   - `s`: `string`
   
   **Returns:** `void`"
  ^js [configured-project s]
  (.log ^js configured-project s))

(defn error
  "**Parameters:**
   - `s`: `string`
   
   **Returns:** `void`"
  ^js [configured-project s]
  (.error ^js configured-project s))

(defn set-internal-compiler-options-for-emitting-js-files
  "**Returns:** `any`"
  ^js [configured-project]
  (.-setInternalCompilerOptionsForEmittingJsFiles ^js configured-project))

(defn set-set-internal-compiler-options-for-emitting-js-files!
  ^js [configured-project value]
  (set! (.-setInternalCompilerOptionsForEmittingJsFiles ^js configured-project) value))

(defn get-language-service
  "**Parameters:**
   - `ensure-synchronized?`: `boolean | undefined`
   
   **Returns:** `LanguageService`"
  (^js [configured-project]
   (.getLanguageService ^js configured-project))
  (^js [configured-project ensure-synchronized?]
   (.getLanguageService ^js configured-project ensure-synchronized?)))

(defn compile-on-save-affected-file-list
  "**Parameters:**
   - `script-info`: `ScriptInfo`
   
   **Returns:** `string[]`"
  ^js [configured-project script-info]
  (.getCompileOnSaveAffectedFileList ^js configured-project script-info))

(defn emit-file
  "Returns true if emit was conducted
   
   **Parameters:**
   - `script-info`: `ScriptInfo`
   - `write-file`: `(path: string, data: string, writeByteOrderMark?: boolean | undefined) => void`
   
   **Returns:** `EmitResult`"
  ^js [configured-project script-info write-file]
  (.emitFile ^js configured-project script-info write-file))

(defn enable-language-service
  "**Returns:** `void`"
  ^js [configured-project]
  (.enableLanguageService ^js configured-project))

(defn disable-language-service
  "**Parameters:**
   - `last-file-exceeded-program-size`: `string | undefined`
   
   **Returns:** `void`"
  (^js [configured-project]
   (.disableLanguageService ^js configured-project))
  (^js [configured-project last-file-exceeded-program-size]
   (.disableLanguageService ^js configured-project last-file-exceeded-program-size)))

(defn project-name
  "**Returns:** `string`"
  ^js [configured-project]
  (.getProjectName ^js configured-project))

(defn remove-local-typings-from-type-acquisition
  "**Parameters:**
   - `new-type-acquisition`: `TypeAcquisition`
   
   **Returns:** `TypeAcquisition`"
  ^js [configured-project new-type-acquisition]
  (.removeLocalTypingsFromTypeAcquisition ^js configured-project new-type-acquisition))

(defn get-external-files
  "**Parameters:**
   - `update-level`: `ProgramUpdateLevel | undefined`
   
   **Returns:** `SortedReadonlyArray<string>`"
  (^js [configured-project]
   (.getExternalFiles ^js configured-project))
  (^js [configured-project update-level]
   (.getExternalFiles ^js configured-project update-level)))

(defn source-file
  "**Parameters:**
   - `path`: `Path`
   
   **Returns:** `SourceFile | undefined`"
  ^js [configured-project path]
  (.getSourceFile ^js configured-project path))

(defn detach-script-info-if-not-root
  "**Returns:** `any`"
  ^js [configured-project]
  (.-detachScriptInfoIfNotRoot ^js configured-project))

(defn set-detach-script-info-if-not-root!
  ^js [configured-project value]
  (set! (.-detachScriptInfoIfNotRoot ^js configured-project) value))

(defn closed?
  "**Returns:** `boolean`"
  ^js [configured-project]
  (.isClosed ^js configured-project))

(defn has-roots?
  "**Returns:** `boolean`"
  ^js [configured-project]
  (.hasRoots ^js configured-project))

(defn get-root-files
  "**Returns:** `NormalizedPath[]`"
  ^js [configured-project]
  (.getRootFiles ^js configured-project))

(defn root-script-infos
  "**Returns:** `ScriptInfo[]`"
  ^js [configured-project]
  (.getRootScriptInfos ^js configured-project))

(defn script-infos
  "**Returns:** `ScriptInfo[]`"
  ^js [configured-project]
  (.getScriptInfos ^js configured-project))

(defn excluded-files
  "**Returns:** `readonly NormalizedPath[]`"
  ^js [configured-project]
  (.getExcludedFiles ^js configured-project))

(defn file-names
  "**Parameters:**
   - `exclude-files-from-external-libraries?`: `boolean | undefined`
   - `exclude-config-files?`: `boolean | undefined`
   
   **Returns:** `NormalizedPath[]`"
  (^js [configured-project]
   (.getFileNames ^js configured-project))
  (^js [configured-project exclude-files-from-external-libraries?]
   (.getFileNames ^js configured-project exclude-files-from-external-libraries?))
  (^js [configured-project exclude-files-from-external-libraries? exclude-config-files?]
   (.getFileNames ^js configured-project exclude-files-from-external-libraries? exclude-config-files?)))

(defn has-config-file?
  "**Parameters:**
   - `config-file-path`: `NormalizedPath`
   
   **Returns:** `boolean`"
  ^js [configured-project config-file-path]
  (.hasConfigFile ^js configured-project config-file-path))

(defn contains-script-info?
  "**Parameters:**
   - `info`: `ScriptInfo`
   
   **Returns:** `boolean`"
  ^js [configured-project info]
  (.containsScriptInfo ^js configured-project info))

(defn contains-file?
  "**Parameters:**
   - `filename`: `NormalizedPath`
   - `require-open?`: `boolean | undefined`
   
   **Returns:** `boolean`"
  (^js [configured-project filename]
   (.containsFile ^js configured-project filename))
  (^js [configured-project filename require-open?]
   (.containsFile ^js configured-project filename require-open?)))

(defn root?
  "**Parameters:**
   - `info`: `ScriptInfo`
   
   **Returns:** `boolean`"
  ^js [configured-project info]
  (.isRoot ^js configured-project info))

(defn add-root
  "**Parameters:**
   - `info`: `ScriptInfo`
   - `file-name`: `NormalizedPath | undefined`
   
   **Returns:** `void`"
  (^js [configured-project info]
   (.addRoot ^js configured-project info))
  (^js [configured-project info file-name]
   (.addRoot ^js configured-project info file-name)))

(defn add-missing-file-root
  "**Parameters:**
   - `file-name`: `NormalizedPath`
   
   **Returns:** `void`"
  ^js [configured-project file-name]
  (.addMissingFileRoot ^js configured-project file-name))

(defn remove-file
  "**Parameters:**
   - `info`: `ScriptInfo`
   - `file-exists?`: `boolean`
   - `detach-from-project?`: `boolean`
   
   **Returns:** `void`"
  ^js [configured-project info file-exists? detach-from-project?]
  (.removeFile ^js configured-project info file-exists? detach-from-project?))

(defn register-file-update
  "**Parameters:**
   - `file-name`: `string`
   
   **Returns:** `void`"
  ^js [configured-project file-name]
  (.registerFileUpdate ^js configured-project file-name))

(defn mark-as-dirty
  "**Returns:** `void`"
  ^js [configured-project]
  (.markAsDirty ^js configured-project))

(defn remove-existing-typings
  "**Parameters:**
   - `include`: `string[]`
   
   **Returns:** `string[]`"
  ^js [configured-project include]
  (.removeExistingTypings ^js configured-project include))

(defn update-graph-worker
  "**Returns:** `any`"
  ^js [configured-project]
  (.-updateGraphWorker ^js configured-project))

(defn set-update-graph-worker!
  ^js [configured-project value]
  (set! (.-updateGraphWorker ^js configured-project) value))

(defn detach-script-info-from-project
  "**Returns:** `any`"
  ^js [configured-project]
  (.-detachScriptInfoFromProject ^js configured-project))

(defn set-detach-script-info-from-project!
  ^js [configured-project value]
  (set! (.-detachScriptInfoFromProject ^js configured-project) value))

(defn add-missing-file-watcher
  "**Returns:** `any`"
  ^js [configured-project]
  (.-addMissingFileWatcher ^js configured-project))

(defn set-add-missing-file-watcher!
  ^js [configured-project value]
  (set! (.-addMissingFileWatcher ^js configured-project) value))

(defn watched-missing-file
  "**Returns:** `any`"
  ^js [configured-project]
  (.-isWatchedMissingFile ^js configured-project))

(defn set-is-watched-missing-file!
  ^js [configured-project value]
  (set! (.-isWatchedMissingFile ^js configured-project) value))

(defn create-generated-file-watcher
  "**Returns:** `any`"
  ^js [configured-project]
  (.-createGeneratedFileWatcher ^js configured-project))

(defn set-create-generated-file-watcher!
  ^js [configured-project value]
  (set! (.-createGeneratedFileWatcher ^js configured-project) value))

(defn valid-generated-file-watcher
  "**Returns:** `any`"
  ^js [configured-project]
  (.-isValidGeneratedFileWatcher ^js configured-project))

(defn set-is-valid-generated-file-watcher!
  ^js [configured-project value]
  (set! (.-isValidGeneratedFileWatcher ^js configured-project) value))

(defn clear-generated-file-watch
  "**Returns:** `any`"
  ^js [configured-project]
  (.-clearGeneratedFileWatch ^js configured-project))

(defn set-clear-generated-file-watch!
  ^js [configured-project value]
  (set! (.-clearGeneratedFileWatch ^js configured-project) value))

(defn script-info-for-normalized-path
  "**Parameters:**
   - `file-name`: `NormalizedPath`
   
   **Returns:** `ScriptInfo | undefined`"
  ^js [configured-project file-name]
  (.getScriptInfoForNormalizedPath ^js configured-project file-name))

(defn script-info
  "**Parameters:**
   - `unchecked-file-name`: `string`
   
   **Returns:** `ScriptInfo | undefined`"
  ^js [configured-project unchecked-file-name]
  (.getScriptInfo ^js configured-project unchecked-file-name))

(defn files-to-string
  "**Parameters:**
   - `write-project-file-names?`: `boolean`
   
   **Returns:** `string`"
  ^js [configured-project write-project-file-names?]
  (.filesToString ^js configured-project write-project-file-names?))

(defn set-compiler-options
  "**Parameters:**
   - `compiler-options`: `CompilerOptions`
   
   **Returns:** `void`"
  ^js [configured-project compiler-options]
  (.setCompilerOptions ^js configured-project compiler-options))

(defn set-type-acquisition
  "**Parameters:**
   - `new-type-acquisition`: `TypeAcquisition | undefined`
   
   **Returns:** `void`"
  (^js [configured-project]
   (.setTypeAcquisition ^js configured-project))
  (^js [configured-project new-type-acquisition]
   (.setTypeAcquisition ^js configured-project new-type-acquisition)))

(defn type-acquisition
  "**Returns:** `TypeAcquisition`"
  ^js [configured-project]
  (.getTypeAcquisition ^js configured-project))

(defn remove-root
  "**Parameters:**
   - `info`: `ScriptInfo`
   
   **Returns:** `void`"
  ^js [configured-project info]
  (.removeRoot ^js configured-project info))

(defn enable-global-plugins
  "**Parameters:**
   - `options`: `CompilerOptions`
   
   **Returns:** `void`"
  ^js [configured-project options]
  (.enableGlobalPlugins ^js configured-project options))

(defn enable-plugin
  "**Parameters:**
   - `plugin-config-entry`: `PluginImport`
   - `search-paths`: `string[]`
   
   **Returns:** `void`"
  ^js [configured-project plugin-config-entry search-paths]
  (.enablePlugin ^js configured-project plugin-config-entry search-paths))

(defn refresh-diagnostics
  "Starts a new check for diagnostics. Call this if some file has updated that would cause diagnostics to be changed.
   
   **Returns:** `void`"
  ^js [configured-project]
  (.refreshDiagnostics ^js configured-project))
