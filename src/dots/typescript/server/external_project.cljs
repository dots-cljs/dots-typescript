(ns dots.typescript.server.external-project
  "Project whose configuration is handled externally, such as in a '.csproj'.
   These are created only if a host explicitly calls `openExternalProject`.")

(defn external-project-name
  "**Returns:** `string`"
  ^js [external-project]
  (.-externalProjectName ^js external-project))

(defn set-external-project-name!
  ^js [external-project value]
  (set! (.-externalProjectName ^js external-project) value))

(defn compile-on-save-enabled?
  "**Returns:** `boolean`"
  ^js [external-project]
  (.-compileOnSaveEnabled ^js external-project))

(defn set-compile-on-save-enabled!
  ^js [external-project value]
  (set! (.-compileOnSaveEnabled ^js external-project) value))

(defn excluded-files
  "**Returns:** `readonly NormalizedPath[]`"
  ^js [external-project]
  (.-excludedFiles ^js external-project))

(defn set-excluded-files!
  ^js [external-project value]
  (set! (.-excludedFiles ^js external-project) value))

(defn update-graph?
  "**Returns:** `boolean` - : true if set of files in the project stays the same and false - otherwise."
  ^js [external-project]
  (.updateGraph ^js external-project))

(defn get-excluded-files
  "**Returns:** `readonly NormalizedPath[]`"
  ^js [external-project]
  (.getExcludedFiles ^js external-project))

(defn project-kind
  "**Returns:** `ProjectKind`"
  ^js [external-project]
  (.-projectKind ^js external-project))

(defn project-service
  "**Returns:** `ProjectService`"
  ^js [external-project]
  (.-projectService ^js external-project))

(defn document-registry
  "**Returns:** `any`"
  ^js [external-project]
  (.-documentRegistry ^js external-project))

(defn set-document-registry!
  ^js [external-project value]
  (set! (.-documentRegistry ^js external-project) value))

(defn compiler-options
  "**Returns:** `any`"
  ^js [external-project]
  (.-compilerOptions ^js external-project))

(defn set-compiler-options!
  ^js [external-project value]
  (set! (.-compilerOptions ^js external-project) value))

(defn watch-options
  "**Returns:** `WatchOptions | undefined`"
  ^js [external-project]
  (.-watchOptions ^js external-project))

(defn set-watch-options!
  ^js [external-project value]
  (set! (.-watchOptions ^js external-project) value))

(defn root-files
  "**Returns:** `any`"
  ^js [external-project]
  (.-rootFiles ^js external-project))

(defn set-root-files!
  ^js [external-project value]
  (set! (.-rootFiles ^js external-project) value))

(defn root-files-map
  "**Returns:** `any`"
  ^js [external-project]
  (.-rootFilesMap ^js external-project))

(defn set-root-files-map!
  ^js [external-project value]
  (set! (.-rootFilesMap ^js external-project) value))

(defn program
  "**Returns:** `any`"
  ^js [external-project]
  (.-program ^js external-project))

(defn set-program!
  ^js [external-project value]
  (set! (.-program ^js external-project) value))

(defn external-files
  "**Returns:** `any`"
  ^js [external-project]
  (.-externalFiles ^js external-project))

(defn set-external-files!
  ^js [external-project value]
  (set! (.-externalFiles ^js external-project) value))

(defn missing-files-map
  "**Returns:** `any`"
  ^js [external-project]
  (.-missingFilesMap ^js external-project))

(defn set-missing-files-map!
  ^js [external-project value]
  (set! (.-missingFilesMap ^js external-project) value))

(defn generated-files-map
  "**Returns:** `any`"
  ^js [external-project]
  (.-generatedFilesMap ^js external-project))

(defn set-generated-files-map!
  ^js [external-project value]
  (set! (.-generatedFilesMap ^js external-project) value))

(defn language-service
  "**Returns:** `LanguageService`"
  ^js [external-project]
  (.-languageService ^js external-project))

(defn set-language-service!
  ^js [external-project value]
  (set! (.-languageService ^js external-project) value))

(defn language-service-enabled?
  "**Returns:** `boolean`"
  ^js [external-project]
  (.-languageServiceEnabled ^js external-project))

(defn set-language-service-enabled!
  ^js [external-project value]
  (set! (.-languageServiceEnabled ^js external-project) value))

(defn trace
  "**Returns:** `((s: string) => void) | undefined`"
  ^js [external-project]
  (.-trace ^js external-project))

(defn realpath
  "**Returns:** `((path: string) => string) | undefined`"
  ^js [external-project]
  (.-realpath ^js external-project))

(defn builder-state
  "**Returns:** `any`"
  ^js [external-project]
  (.-builderState ^js external-project))

(defn set-builder-state!
  ^js [external-project value]
  (set! (.-builderState ^js external-project) value))

(defn updated-file-names
  "Set of files names that were updated since the last call to getChangesSinceVersion.
   
   **Returns:** `any`"
  ^js [external-project]
  (.-updatedFileNames ^js external-project))

(defn set-updated-file-names!
  "Set of files names that were updated since the last call to getChangesSinceVersion."
  ^js [external-project value]
  (set! (.-updatedFileNames ^js external-project) value))

(defn last-reported-file-names
  "Set of files that was returned from the last call to getChangesSinceVersion.
   
   **Returns:** `any`"
  ^js [external-project]
  (.-lastReportedFileNames ^js external-project))

(defn set-last-reported-file-names!
  "Set of files that was returned from the last call to getChangesSinceVersion."
  ^js [external-project value]
  (set! (.-lastReportedFileNames ^js external-project) value))

(defn last-reported-version
  "Last version that was reported.
   
   **Returns:** `any`"
  ^js [external-project]
  (.-lastReportedVersion ^js external-project))

(defn set-last-reported-version!
  "Last version that was reported."
  ^js [external-project value]
  (set! (.-lastReportedVersion ^js external-project) value))

(defn project-errors
  "**Returns:** `Diagnostic[] | undefined`"
  ^js [external-project]
  (.-projectErrors ^js external-project))

(defn set-project-errors!
  ^js [external-project value]
  (set! (.-projectErrors ^js external-project) value))

(defn initial-load-pending
  "**Returns:** `() => boolean`"
  ^js [external-project]
  (.-isInitialLoadPending ^js external-project))

(defn set-is-initial-load-pending!
  ^js [external-project value]
  (set! (.-isInitialLoadPending ^js external-project) value))

(defn cancellation-token
  "**Returns:** `any`"
  ^js [external-project]
  (.-cancellationToken ^js external-project))

(defn non-ts-project?
  "**Returns:** `boolean`"
  ^js [external-project]
  (.isNonTsProject ^js external-project))

(defn js-only-project?
  "**Returns:** `boolean`"
  ^js [external-project]
  (.isJsOnlyProject ^js external-project))

(defn js-doc-parsing-mode
  "**Returns:** `JSDocParsingMode | undefined`"
  ^js [external-project]
  (.-jsDocParsingMode ^js external-project))

(defn known-types-package-name?
  "**Parameters:**
   - `name`: `string`
   
   **Returns:** `boolean`"
  ^js [external-project name]
  (.isKnownTypesPackageName ^js external-project name))

(defn install-package
  "**Parameters:**
   - `options`: `InstallPackageOptions`
   
   **Returns:** `Promise<ApplyCodeActionCommandResult>`"
  ^js [external-project options]
  (.installPackage ^js external-project options))

(defn compilation-settings
  "**Returns:** `CompilerOptions`"
  ^js [external-project]
  (.getCompilationSettings ^js external-project))

(defn get-compiler-options
  "**Returns:** `CompilerOptions`"
  ^js [external-project]
  (.getCompilerOptions ^js external-project))

(defn new-line
  "**Returns:** `string`"
  ^js [external-project]
  (.getNewLine ^js external-project))

(defn project-version
  "**Returns:** `string`"
  ^js [external-project]
  (.getProjectVersion ^js external-project))

(defn project-references
  "**Returns:** `readonly ProjectReference[] | undefined`"
  ^js [external-project]
  (.getProjectReferences ^js external-project))

(defn script-file-names
  "**Returns:** `string[]`"
  ^js [external-project]
  (.getScriptFileNames ^js external-project))

(defn or-create-script-info-and-attach-to-project
  "**Returns:** `any`"
  ^js [external-project]
  (.-getOrCreateScriptInfoAndAttachToProject ^js external-project))

(defn set-get-or-create-script-info-and-attach-to-project!
  ^js [external-project value]
  (set! (.-getOrCreateScriptInfoAndAttachToProject ^js external-project) value))

(defn script-kind
  "**Parameters:**
   - `file-name`: `string`
   
   **Returns:** `ScriptKind`"
  ^js [external-project file-name]
  (.getScriptKind ^js external-project file-name))

(defn script-version
  "**Parameters:**
   - `filename`: `string`
   
   **Returns:** `string`"
  ^js [external-project filename]
  (.getScriptVersion ^js external-project filename))

(defn script-snapshot
  "**Parameters:**
   - `filename`: `string`
   
   **Returns:** `IScriptSnapshot | undefined`"
  ^js [external-project filename]
  (.getScriptSnapshot ^js external-project filename))

(defn get-cancellation-token
  "**Returns:** `HostCancellationToken`"
  ^js [external-project]
  (.getCancellationToken ^js external-project))

(defn current-directory
  "**Returns:** `string`"
  ^js [external-project]
  (.getCurrentDirectory ^js external-project))

(defn default-lib-file-name
  "**Returns:** `string`"
  ^js [external-project]
  (.getDefaultLibFileName ^js external-project))

(defn use-case-sensitive-file-names?
  "**Returns:** `boolean`"
  ^js [external-project]
  (.useCaseSensitiveFileNames ^js external-project))

(defn read-directory
  "**Parameters:**
   - `path`: `string`
   - `extensions`: `readonly string[] | undefined`
   - `exclude`: `readonly string[] | undefined`
   - `include`: `readonly string[] | undefined`
   - `depth`: `number | undefined`
   
   **Returns:** `string[]`"
  (^js [external-project path]
   (.readDirectory ^js external-project path))
  (^js [external-project path extensions]
   (.readDirectory ^js external-project path extensions))
  (^js [external-project path extensions exclude]
   (.readDirectory ^js external-project path extensions exclude))
  (^js [external-project path extensions exclude include]
   (.readDirectory ^js external-project path extensions exclude include))
  (^js [external-project path extensions exclude include depth]
   (.readDirectory ^js external-project path extensions exclude include depth)))

(defn read-file
  "**Parameters:**
   - `file-name`: `string`
   
   **Returns:** `string | undefined`"
  ^js [external-project file-name]
  (.readFile ^js external-project file-name))

(defn write-file
  "**Parameters:**
   - `file-name`: `string`
   - `content`: `string`
   
   **Returns:** `void`"
  ^js [external-project file-name content]
  (.writeFile ^js external-project file-name content))

(defn file-exists?
  "**Parameters:**
   - `file`: `string`
   
   **Returns:** `boolean`"
  ^js [external-project file]
  (.fileExists ^js external-project file))

(defn directory-exists?
  "**Parameters:**
   - `path`: `string`
   
   **Returns:** `boolean`"
  ^js [external-project path]
  (.directoryExists ^js external-project path))

(defn directories
  "**Parameters:**
   - `path`: `string`
   
   **Returns:** `string[]`"
  ^js [external-project path]
  (.getDirectories ^js external-project path))

(defn log
  "**Parameters:**
   - `s`: `string`
   
   **Returns:** `void`"
  ^js [external-project s]
  (.log ^js external-project s))

(defn error
  "**Parameters:**
   - `s`: `string`
   
   **Returns:** `void`"
  ^js [external-project s]
  (.error ^js external-project s))

(defn set-internal-compiler-options-for-emitting-js-files
  "**Returns:** `any`"
  ^js [external-project]
  (.-setInternalCompilerOptionsForEmittingJsFiles ^js external-project))

(defn set-set-internal-compiler-options-for-emitting-js-files!
  ^js [external-project value]
  (set! (.-setInternalCompilerOptionsForEmittingJsFiles ^js external-project) value))

(defn global-project-errors
  "Get the errors that dont have any file name associated
   
   **Returns:** `readonly Diagnostic[]`"
  ^js [external-project]
  (.getGlobalProjectErrors ^js external-project))

(defn all-project-errors
  "Get all the project errors
   
   **Returns:** `readonly Diagnostic[]`"
  ^js [external-project]
  (.getAllProjectErrors ^js external-project))

(defn set-project-errors
  "**Parameters:**
   - `project-errors`: `Diagnostic[] | undefined`
   
   **Returns:** `void`"
  (^js [external-project]
   (.setProjectErrors ^js external-project))
  (^js [external-project project-errors]
   (.setProjectErrors ^js external-project project-errors)))

(defn get-language-service
  "**Parameters:**
   - `ensure-synchronized?`: `boolean | undefined`
   
   **Returns:** `LanguageService`"
  (^js [external-project]
   (.getLanguageService ^js external-project))
  (^js [external-project ensure-synchronized?]
   (.getLanguageService ^js external-project ensure-synchronized?)))

(defn compile-on-save-affected-file-list
  "**Parameters:**
   - `script-info`: `ScriptInfo`
   
   **Returns:** `string[]`"
  ^js [external-project script-info]
  (.getCompileOnSaveAffectedFileList ^js external-project script-info))

(defn emit-file
  "Returns true if emit was conducted
   
   **Parameters:**
   - `script-info`: `ScriptInfo`
   - `write-file`: `(path: string, data: string, writeByteOrderMark?: boolean | undefined) => void`
   
   **Returns:** `EmitResult`"
  ^js [external-project script-info write-file]
  (.emitFile ^js external-project script-info write-file))

(defn enable-language-service
  "**Returns:** `void`"
  ^js [external-project]
  (.enableLanguageService ^js external-project))

(defn disable-language-service
  "**Parameters:**
   - `last-file-exceeded-program-size`: `string | undefined`
   
   **Returns:** `void`"
  (^js [external-project]
   (.disableLanguageService ^js external-project))
  (^js [external-project last-file-exceeded-program-size]
   (.disableLanguageService ^js external-project last-file-exceeded-program-size)))

(defn project-name
  "**Returns:** `string`"
  ^js [external-project]
  (.getProjectName ^js external-project))

(defn remove-local-typings-from-type-acquisition
  "**Parameters:**
   - `new-type-acquisition`: `TypeAcquisition`
   
   **Returns:** `TypeAcquisition`"
  ^js [external-project new-type-acquisition]
  (.removeLocalTypingsFromTypeAcquisition ^js external-project new-type-acquisition))

(defn get-external-files
  "**Parameters:**
   - `update-level`: `ProgramUpdateLevel | undefined`
   
   **Returns:** `SortedReadonlyArray<string>`"
  (^js [external-project]
   (.getExternalFiles ^js external-project))
  (^js [external-project update-level]
   (.getExternalFiles ^js external-project update-level)))

(defn source-file
  "**Parameters:**
   - `path`: `Path`
   
   **Returns:** `SourceFile | undefined`"
  ^js [external-project path]
  (.getSourceFile ^js external-project path))

(defn close
  "**Returns:** `void`"
  ^js [external-project]
  (.close ^js external-project))

(defn detach-script-info-if-not-root
  "**Returns:** `any`"
  ^js [external-project]
  (.-detachScriptInfoIfNotRoot ^js external-project))

(defn set-detach-script-info-if-not-root!
  ^js [external-project value]
  (set! (.-detachScriptInfoIfNotRoot ^js external-project) value))

(defn closed?
  "**Returns:** `boolean`"
  ^js [external-project]
  (.isClosed ^js external-project))

(defn has-roots?
  "**Returns:** `boolean`"
  ^js [external-project]
  (.hasRoots ^js external-project))

(defn get-root-files
  "**Returns:** `NormalizedPath[]`"
  ^js [external-project]
  (.getRootFiles ^js external-project))

(defn root-script-infos
  "**Returns:** `ScriptInfo[]`"
  ^js [external-project]
  (.getRootScriptInfos ^js external-project))

(defn script-infos
  "**Returns:** `ScriptInfo[]`"
  ^js [external-project]
  (.getScriptInfos ^js external-project))

(defn file-names
  "**Parameters:**
   - `exclude-files-from-external-libraries?`: `boolean | undefined`
   - `exclude-config-files?`: `boolean | undefined`
   
   **Returns:** `NormalizedPath[]`"
  (^js [external-project]
   (.getFileNames ^js external-project))
  (^js [external-project exclude-files-from-external-libraries?]
   (.getFileNames ^js external-project exclude-files-from-external-libraries?))
  (^js [external-project exclude-files-from-external-libraries? exclude-config-files?]
   (.getFileNames ^js external-project exclude-files-from-external-libraries? exclude-config-files?)))

(defn has-config-file?
  "**Parameters:**
   - `config-file-path`: `NormalizedPath`
   
   **Returns:** `boolean`"
  ^js [external-project config-file-path]
  (.hasConfigFile ^js external-project config-file-path))

(defn contains-script-info?
  "**Parameters:**
   - `info`: `ScriptInfo`
   
   **Returns:** `boolean`"
  ^js [external-project info]
  (.containsScriptInfo ^js external-project info))

(defn contains-file?
  "**Parameters:**
   - `filename`: `NormalizedPath`
   - `require-open?`: `boolean | undefined`
   
   **Returns:** `boolean`"
  (^js [external-project filename]
   (.containsFile ^js external-project filename))
  (^js [external-project filename require-open?]
   (.containsFile ^js external-project filename require-open?)))

(defn root?
  "**Parameters:**
   - `info`: `ScriptInfo`
   
   **Returns:** `boolean`"
  ^js [external-project info]
  (.isRoot ^js external-project info))

(defn add-root
  "**Parameters:**
   - `info`: `ScriptInfo`
   - `file-name`: `NormalizedPath | undefined`
   
   **Returns:** `void`"
  (^js [external-project info]
   (.addRoot ^js external-project info))
  (^js [external-project info file-name]
   (.addRoot ^js external-project info file-name)))

(defn add-missing-file-root
  "**Parameters:**
   - `file-name`: `NormalizedPath`
   
   **Returns:** `void`"
  ^js [external-project file-name]
  (.addMissingFileRoot ^js external-project file-name))

(defn remove-file
  "**Parameters:**
   - `info`: `ScriptInfo`
   - `file-exists?`: `boolean`
   - `detach-from-project?`: `boolean`
   
   **Returns:** `void`"
  ^js [external-project info file-exists? detach-from-project?]
  (.removeFile ^js external-project info file-exists? detach-from-project?))

(defn register-file-update
  "**Parameters:**
   - `file-name`: `string`
   
   **Returns:** `void`"
  ^js [external-project file-name]
  (.registerFileUpdate ^js external-project file-name))

(defn mark-as-dirty
  "**Returns:** `void`"
  ^js [external-project]
  (.markAsDirty ^js external-project))

(defn remove-existing-typings
  "**Parameters:**
   - `include`: `string[]`
   
   **Returns:** `string[]`"
  ^js [external-project include]
  (.removeExistingTypings ^js external-project include))

(defn update-graph-worker
  "**Returns:** `any`"
  ^js [external-project]
  (.-updateGraphWorker ^js external-project))

(defn set-update-graph-worker!
  ^js [external-project value]
  (set! (.-updateGraphWorker ^js external-project) value))

(defn detach-script-info-from-project
  "**Returns:** `any`"
  ^js [external-project]
  (.-detachScriptInfoFromProject ^js external-project))

(defn set-detach-script-info-from-project!
  ^js [external-project value]
  (set! (.-detachScriptInfoFromProject ^js external-project) value))

(defn add-missing-file-watcher
  "**Returns:** `any`"
  ^js [external-project]
  (.-addMissingFileWatcher ^js external-project))

(defn set-add-missing-file-watcher!
  ^js [external-project value]
  (set! (.-addMissingFileWatcher ^js external-project) value))

(defn watched-missing-file
  "**Returns:** `any`"
  ^js [external-project]
  (.-isWatchedMissingFile ^js external-project))

(defn set-is-watched-missing-file!
  ^js [external-project value]
  (set! (.-isWatchedMissingFile ^js external-project) value))

(defn create-generated-file-watcher
  "**Returns:** `any`"
  ^js [external-project]
  (.-createGeneratedFileWatcher ^js external-project))

(defn set-create-generated-file-watcher!
  ^js [external-project value]
  (set! (.-createGeneratedFileWatcher ^js external-project) value))

(defn valid-generated-file-watcher
  "**Returns:** `any`"
  ^js [external-project]
  (.-isValidGeneratedFileWatcher ^js external-project))

(defn set-is-valid-generated-file-watcher!
  ^js [external-project value]
  (set! (.-isValidGeneratedFileWatcher ^js external-project) value))

(defn clear-generated-file-watch
  "**Returns:** `any`"
  ^js [external-project]
  (.-clearGeneratedFileWatch ^js external-project))

(defn set-clear-generated-file-watch!
  ^js [external-project value]
  (set! (.-clearGeneratedFileWatch ^js external-project) value))

(defn script-info-for-normalized-path
  "**Parameters:**
   - `file-name`: `NormalizedPath`
   
   **Returns:** `ScriptInfo | undefined`"
  ^js [external-project file-name]
  (.getScriptInfoForNormalizedPath ^js external-project file-name))

(defn script-info
  "**Parameters:**
   - `unchecked-file-name`: `string`
   
   **Returns:** `ScriptInfo | undefined`"
  ^js [external-project unchecked-file-name]
  (.getScriptInfo ^js external-project unchecked-file-name))

(defn files-to-string
  "**Parameters:**
   - `write-project-file-names?`: `boolean`
   
   **Returns:** `string`"
  ^js [external-project write-project-file-names?]
  (.filesToString ^js external-project write-project-file-names?))

(defn set-compiler-options
  "**Parameters:**
   - `compiler-options`: `CompilerOptions`
   
   **Returns:** `void`"
  ^js [external-project compiler-options]
  (.setCompilerOptions ^js external-project compiler-options))

(defn set-type-acquisition
  "**Parameters:**
   - `new-type-acquisition`: `TypeAcquisition | undefined`
   
   **Returns:** `void`"
  (^js [external-project]
   (.setTypeAcquisition ^js external-project))
  (^js [external-project new-type-acquisition]
   (.setTypeAcquisition ^js external-project new-type-acquisition)))

(defn type-acquisition
  "**Returns:** `TypeAcquisition`"
  ^js [external-project]
  (.getTypeAcquisition ^js external-project))

(defn remove-root
  "**Parameters:**
   - `info`: `ScriptInfo`
   
   **Returns:** `void`"
  ^js [external-project info]
  (.removeRoot ^js external-project info))

(defn enable-global-plugins
  "**Parameters:**
   - `options`: `CompilerOptions`
   
   **Returns:** `void`"
  ^js [external-project options]
  (.enableGlobalPlugins ^js external-project options))

(defn enable-plugin
  "**Parameters:**
   - `plugin-config-entry`: `PluginImport`
   - `search-paths`: `string[]`
   
   **Returns:** `void`"
  ^js [external-project plugin-config-entry search-paths]
  (.enablePlugin ^js external-project plugin-config-entry search-paths))

(defn refresh-diagnostics
  "Starts a new check for diagnostics. Call this if some file has updated that would cause diagnostics to be changed.
   
   **Returns:** `void`"
  ^js [external-project]
  (.refreshDiagnostics ^js external-project))
