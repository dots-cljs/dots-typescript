(ns dots.typescript.server.project
  (:require ["typescript" :as typescript]))

(defn project-kind
  "**Returns:** `ProjectKind`"
  ^js [project]
  (.-projectKind ^js project))

(defn project-service
  "**Returns:** `ProjectService`"
  ^js [project]
  (.-projectService ^js project))

(defn document-registry
  "**Returns:** `any`"
  ^js [project]
  (.-documentRegistry ^js project))

(defn set-document-registry!
  ^js [project value]
  (set! (.-documentRegistry ^js project) value))

(defn compiler-options
  "**Returns:** `any`"
  ^js [project]
  (.-compilerOptions ^js project))

(defn set-compiler-options!
  ^js [project value]
  (set! (.-compilerOptions ^js project) value))

(defn compile-on-save-enabled?
  "**Returns:** `boolean`"
  ^js [project]
  (.-compileOnSaveEnabled ^js project))

(defn set-compile-on-save-enabled!
  ^js [project value]
  (set! (.-compileOnSaveEnabled ^js project) value))

(defn watch-options
  "**Returns:** `WatchOptions | undefined`"
  ^js [project]
  (.-watchOptions ^js project))

(defn set-watch-options!
  ^js [project value]
  (set! (.-watchOptions ^js project) value))

(defn root-files
  "**Returns:** `any`"
  ^js [project]
  (.-rootFiles ^js project))

(defn set-root-files!
  ^js [project value]
  (set! (.-rootFiles ^js project) value))

(defn root-files-map
  "**Returns:** `any`"
  ^js [project]
  (.-rootFilesMap ^js project))

(defn set-root-files-map!
  ^js [project value]
  (set! (.-rootFilesMap ^js project) value))

(defn program
  "**Returns:** `any`"
  ^js [project]
  (.-program ^js project))

(defn set-program!
  ^js [project value]
  (set! (.-program ^js project) value))

(defn external-files
  "**Returns:** `any`"
  ^js [project]
  (.-externalFiles ^js project))

(defn set-external-files!
  ^js [project value]
  (set! (.-externalFiles ^js project) value))

(defn missing-files-map
  "**Returns:** `any`"
  ^js [project]
  (.-missingFilesMap ^js project))

(defn set-missing-files-map!
  ^js [project value]
  (set! (.-missingFilesMap ^js project) value))

(defn generated-files-map
  "**Returns:** `any`"
  ^js [project]
  (.-generatedFilesMap ^js project))

(defn set-generated-files-map!
  ^js [project value]
  (set! (.-generatedFilesMap ^js project) value))

(defn language-service
  "**Returns:** `LanguageService`"
  ^js [project]
  (.-languageService ^js project))

(defn set-language-service!
  ^js [project value]
  (set! (.-languageService ^js project) value))

(defn language-service-enabled?
  "**Returns:** `boolean`"
  ^js [project]
  (.-languageServiceEnabled ^js project))

(defn set-language-service-enabled!
  ^js [project value]
  (set! (.-languageServiceEnabled ^js project) value))

(defn trace
  "**Returns:** `((s: string) => void) | undefined`"
  ^js [project]
  (.-trace ^js project))

(defn realpath
  "**Returns:** `((path: string) => string) | undefined`"
  ^js [project]
  (.-realpath ^js project))

(defn builder-state
  "**Returns:** `any`"
  ^js [project]
  (.-builderState ^js project))

(defn set-builder-state!
  ^js [project value]
  (set! (.-builderState ^js project) value))

(defn updated-file-names
  "Set of files names that were updated since the last call to getChangesSinceVersion.
   
   **Returns:** `any`"
  ^js [project]
  (.-updatedFileNames ^js project))

(defn set-updated-file-names!
  "Set of files names that were updated since the last call to getChangesSinceVersion."
  ^js [project value]
  (set! (.-updatedFileNames ^js project) value))

(defn last-reported-file-names
  "Set of files that was returned from the last call to getChangesSinceVersion.
   
   **Returns:** `any`"
  ^js [project]
  (.-lastReportedFileNames ^js project))

(defn set-last-reported-file-names!
  "Set of files that was returned from the last call to getChangesSinceVersion."
  ^js [project value]
  (set! (.-lastReportedFileNames ^js project) value))

(defn last-reported-version
  "Last version that was reported.
   
   **Returns:** `any`"
  ^js [project]
  (.-lastReportedVersion ^js project))

(defn set-last-reported-version!
  "Last version that was reported."
  ^js [project value]
  (set! (.-lastReportedVersion ^js project) value))

(defn project-errors
  "**Returns:** `Diagnostic[] | undefined`"
  ^js [project]
  (.-projectErrors ^js project))

(defn set-project-errors!
  ^js [project value]
  (set! (.-projectErrors ^js project) value))

(defn initial-load-pending
  "**Returns:** `() => boolean`"
  ^js [project]
  (.-isInitialLoadPending ^js project))

(defn set-is-initial-load-pending!
  ^js [project value]
  (set! (.-isInitialLoadPending ^js project) value))

(defn cancellation-token
  "**Returns:** `any`"
  ^js [project]
  (.-cancellationToken ^js project))

(defn non-ts-project?
  "**Returns:** `boolean`"
  ^js [project]
  (.isNonTsProject ^js project))

(defn js-only-project?
  "**Returns:** `boolean`"
  ^js [project]
  (.isJsOnlyProject ^js project))

(defn js-doc-parsing-mode
  "**Returns:** `JSDocParsingMode | undefined`"
  ^js [project]
  (.-jsDocParsingMode ^js project))

(defn known-types-package-name?
  "**Parameters:**
   - `name`: `string`
   
   **Returns:** `boolean`"
  ^js [project name]
  (.isKnownTypesPackageName ^js project name))

(defn install-package
  "**Parameters:**
   - `options`: `InstallPackageOptions`
   
   **Returns:** `Promise<ApplyCodeActionCommandResult>`"
  ^js [project options]
  (.installPackage ^js project options))

(defn compilation-settings
  "**Returns:** `CompilerOptions`"
  ^js [project]
  (.getCompilationSettings ^js project))

(defn get-compiler-options
  "**Returns:** `CompilerOptions`"
  ^js [project]
  (.getCompilerOptions ^js project))

(defn new-line
  "**Returns:** `string`"
  ^js [project]
  (.getNewLine ^js project))

(defn project-version
  "**Returns:** `string`"
  ^js [project]
  (.getProjectVersion ^js project))

(defn project-references
  "**Returns:** `readonly ProjectReference[] | undefined`"
  ^js [project]
  (.getProjectReferences ^js project))

(defn script-file-names
  "**Returns:** `string[]`"
  ^js [project]
  (.getScriptFileNames ^js project))

(defn or-create-script-info-and-attach-to-project
  "**Returns:** `any`"
  ^js [project]
  (.-getOrCreateScriptInfoAndAttachToProject ^js project))

(defn set-get-or-create-script-info-and-attach-to-project!
  ^js [project value]
  (set! (.-getOrCreateScriptInfoAndAttachToProject ^js project) value))

(defn script-kind
  "**Parameters:**
   - `file-name`: `string`
   
   **Returns:** `ScriptKind`"
  ^js [project file-name]
  (.getScriptKind ^js project file-name))

(defn script-version
  "**Parameters:**
   - `filename`: `string`
   
   **Returns:** `string`"
  ^js [project filename]
  (.getScriptVersion ^js project filename))

(defn script-snapshot
  "**Parameters:**
   - `filename`: `string`
   
   **Returns:** `IScriptSnapshot | undefined`"
  ^js [project filename]
  (.getScriptSnapshot ^js project filename))

(defn get-cancellation-token
  "**Returns:** `HostCancellationToken`"
  ^js [project]
  (.getCancellationToken ^js project))

(defn current-directory
  "**Returns:** `string`"
  ^js [project]
  (.getCurrentDirectory ^js project))

(defn default-lib-file-name
  "**Returns:** `string`"
  ^js [project]
  (.getDefaultLibFileName ^js project))

(defn use-case-sensitive-file-names?
  "**Returns:** `boolean`"
  ^js [project]
  (.useCaseSensitiveFileNames ^js project))

(defn read-directory
  "**Parameters:**
   - `path`: `string`
   - `extensions`: `readonly string[] | undefined`
   - `exclude`: `readonly string[] | undefined`
   - `include`: `readonly string[] | undefined`
   - `depth`: `number | undefined`
   
   **Returns:** `string[]`"
  (^js [project path]
   (.readDirectory ^js project path))
  (^js [project path extensions]
   (.readDirectory ^js project path extensions))
  (^js [project path extensions exclude]
   (.readDirectory ^js project path extensions exclude))
  (^js [project path extensions exclude include]
   (.readDirectory ^js project path extensions exclude include))
  (^js [project path extensions exclude include depth]
   (.readDirectory ^js project path extensions exclude include depth)))

(defn read-file
  "**Parameters:**
   - `file-name`: `string`
   
   **Returns:** `string | undefined`"
  ^js [project file-name]
  (.readFile ^js project file-name))

(defn write-file
  "**Parameters:**
   - `file-name`: `string`
   - `content`: `string`
   
   **Returns:** `void`"
  ^js [project file-name content]
  (.writeFile ^js project file-name content))

(defn file-exists?
  "**Parameters:**
   - `file`: `string`
   
   **Returns:** `boolean`"
  ^js [project file]
  (.fileExists ^js project file))

(defn directory-exists?
  "**Parameters:**
   - `path`: `string`
   
   **Returns:** `boolean`"
  ^js [project path]
  (.directoryExists ^js project path))

(defn directories
  "**Parameters:**
   - `path`: `string`
   
   **Returns:** `string[]`"
  ^js [project path]
  (.getDirectories ^js project path))

(defn log
  "**Parameters:**
   - `s`: `string`
   
   **Returns:** `void`"
  ^js [project s]
  (.log ^js project s))

(defn error
  "**Parameters:**
   - `s`: `string`
   
   **Returns:** `void`"
  ^js [project s]
  (.error ^js project s))

(defn set-internal-compiler-options-for-emitting-js-files
  "**Returns:** `any`"
  ^js [project]
  (.-setInternalCompilerOptionsForEmittingJsFiles ^js project))

(defn set-set-internal-compiler-options-for-emitting-js-files!
  ^js [project value]
  (set! (.-setInternalCompilerOptionsForEmittingJsFiles ^js project) value))

(defn global-project-errors
  "Get the errors that dont have any file name associated
   
   **Returns:** `readonly Diagnostic[]`"
  ^js [project]
  (.getGlobalProjectErrors ^js project))

(defn all-project-errors
  "Get all the project errors
   
   **Returns:** `readonly Diagnostic[]`"
  ^js [project]
  (.getAllProjectErrors ^js project))

(defn set-project-errors
  "**Parameters:**
   - `project-errors`: `Diagnostic[] | undefined`
   
   **Returns:** `void`"
  (^js [project]
   (.setProjectErrors ^js project))
  (^js [project project-errors]
   (.setProjectErrors ^js project project-errors)))

(defn get-language-service
  "**Parameters:**
   - `ensure-synchronized?`: `boolean | undefined`
   
   **Returns:** `LanguageService`"
  (^js [project]
   (.getLanguageService ^js project))
  (^js [project ensure-synchronized?]
   (.getLanguageService ^js project ensure-synchronized?)))

(defn compile-on-save-affected-file-list
  "**Parameters:**
   - `script-info`: `ScriptInfo`
   
   **Returns:** `string[]`"
  ^js [project script-info]
  (.getCompileOnSaveAffectedFileList ^js project script-info))

(defn emit-file
  "Returns true if emit was conducted
   
   **Parameters:**
   - `script-info`: `ScriptInfo`
   - `write-file`: `(path: string, data: string, writeByteOrderMark?: boolean | undefined) => void`
   
   **Returns:** `EmitResult`"
  ^js [project script-info write-file]
  (.emitFile ^js project script-info write-file))

(defn enable-language-service
  "**Returns:** `void`"
  ^js [project]
  (.enableLanguageService ^js project))

(defn disable-language-service
  "**Parameters:**
   - `last-file-exceeded-program-size`: `string | undefined`
   
   **Returns:** `void`"
  (^js [project]
   (.disableLanguageService ^js project))
  (^js [project last-file-exceeded-program-size]
   (.disableLanguageService ^js project last-file-exceeded-program-size)))

(defn project-name
  "**Returns:** `string`"
  ^js [project]
  (.getProjectName ^js project))

(defn remove-local-typings-from-type-acquisition
  "**Parameters:**
   - `new-type-acquisition`: `TypeAcquisition`
   
   **Returns:** `TypeAcquisition`"
  ^js [project new-type-acquisition]
  (.removeLocalTypingsFromTypeAcquisition ^js project new-type-acquisition))

(defn get-external-files
  "**Parameters:**
   - `update-level`: `ProgramUpdateLevel | undefined`
   
   **Returns:** `SortedReadonlyArray<string>`"
  (^js [project]
   (.getExternalFiles ^js project))
  (^js [project update-level]
   (.getExternalFiles ^js project update-level)))

(defn source-file
  "**Parameters:**
   - `path`: `Path`
   
   **Returns:** `SourceFile | undefined`"
  ^js [project path]
  (.getSourceFile ^js project path))

(defn close
  "**Returns:** `void`"
  ^js [project]
  (.close ^js project))

(defn detach-script-info-if-not-root
  "**Returns:** `any`"
  ^js [project]
  (.-detachScriptInfoIfNotRoot ^js project))

(defn set-detach-script-info-if-not-root!
  ^js [project value]
  (set! (.-detachScriptInfoIfNotRoot ^js project) value))

(defn closed?
  "**Returns:** `boolean`"
  ^js [project]
  (.isClosed ^js project))

(defn has-roots?
  "**Returns:** `boolean`"
  ^js [project]
  (.hasRoots ^js project))

(defn get-root-files
  "**Returns:** `NormalizedPath[]`"
  ^js [project]
  (.getRootFiles ^js project))

(defn root-script-infos
  "**Returns:** `ScriptInfo[]`"
  ^js [project]
  (.getRootScriptInfos ^js project))

(defn script-infos
  "**Returns:** `ScriptInfo[]`"
  ^js [project]
  (.getScriptInfos ^js project))

(defn excluded-files
  "**Returns:** `readonly NormalizedPath[]`"
  ^js [project]
  (.getExcludedFiles ^js project))

(defn file-names
  "**Parameters:**
   - `exclude-files-from-external-libraries?`: `boolean | undefined`
   - `exclude-config-files?`: `boolean | undefined`
   
   **Returns:** `NormalizedPath[]`"
  (^js [project]
   (.getFileNames ^js project))
  (^js [project exclude-files-from-external-libraries?]
   (.getFileNames ^js project exclude-files-from-external-libraries?))
  (^js [project exclude-files-from-external-libraries? exclude-config-files?]
   (.getFileNames ^js project exclude-files-from-external-libraries? exclude-config-files?)))

(defn has-config-file?
  "**Parameters:**
   - `config-file-path`: `NormalizedPath`
   
   **Returns:** `boolean`"
  ^js [project config-file-path]
  (.hasConfigFile ^js project config-file-path))

(defn contains-script-info?
  "**Parameters:**
   - `info`: `ScriptInfo`
   
   **Returns:** `boolean`"
  ^js [project info]
  (.containsScriptInfo ^js project info))

(defn contains-file?
  "**Parameters:**
   - `filename`: `NormalizedPath`
   - `require-open?`: `boolean | undefined`
   
   **Returns:** `boolean`"
  (^js [project filename]
   (.containsFile ^js project filename))
  (^js [project filename require-open?]
   (.containsFile ^js project filename require-open?)))

(defn root?
  "**Parameters:**
   - `info`: `ScriptInfo`
   
   **Returns:** `boolean`"
  ^js [project info]
  (.isRoot ^js project info))

(defn add-root
  "**Parameters:**
   - `info`: `ScriptInfo`
   - `file-name`: `NormalizedPath | undefined`
   
   **Returns:** `void`"
  (^js [project info]
   (.addRoot ^js project info))
  (^js [project info file-name]
   (.addRoot ^js project info file-name)))

(defn add-missing-file-root
  "**Parameters:**
   - `file-name`: `NormalizedPath`
   
   **Returns:** `void`"
  ^js [project file-name]
  (.addMissingFileRoot ^js project file-name))

(defn remove-file
  "**Parameters:**
   - `info`: `ScriptInfo`
   - `file-exists?`: `boolean`
   - `detach-from-project?`: `boolean`
   
   **Returns:** `void`"
  ^js [project info file-exists? detach-from-project?]
  (.removeFile ^js project info file-exists? detach-from-project?))

(defn register-file-update
  "**Parameters:**
   - `file-name`: `string`
   
   **Returns:** `void`"
  ^js [project file-name]
  (.registerFileUpdate ^js project file-name))

(defn mark-as-dirty
  "**Returns:** `void`"
  ^js [project]
  (.markAsDirty ^js project))

(defn update-graph?
  "Updates set of files that contribute to this project
   
   **Returns:** `boolean` - : true if set of files in the project stays the same and false - otherwise."
  ^js [project]
  (.updateGraph ^js project))

(defn remove-existing-typings
  "**Parameters:**
   - `include`: `string[]`
   
   **Returns:** `string[]`"
  ^js [project include]
  (.removeExistingTypings ^js project include))

(defn update-graph-worker
  "**Returns:** `any`"
  ^js [project]
  (.-updateGraphWorker ^js project))

(defn set-update-graph-worker!
  ^js [project value]
  (set! (.-updateGraphWorker ^js project) value))

(defn detach-script-info-from-project
  "**Returns:** `any`"
  ^js [project]
  (.-detachScriptInfoFromProject ^js project))

(defn set-detach-script-info-from-project!
  ^js [project value]
  (set! (.-detachScriptInfoFromProject ^js project) value))

(defn add-missing-file-watcher
  "**Returns:** `any`"
  ^js [project]
  (.-addMissingFileWatcher ^js project))

(defn set-add-missing-file-watcher!
  ^js [project value]
  (set! (.-addMissingFileWatcher ^js project) value))

(defn watched-missing-file
  "**Returns:** `any`"
  ^js [project]
  (.-isWatchedMissingFile ^js project))

(defn set-is-watched-missing-file!
  ^js [project value]
  (set! (.-isWatchedMissingFile ^js project) value))

(defn create-generated-file-watcher
  "**Returns:** `any`"
  ^js [project]
  (.-createGeneratedFileWatcher ^js project))

(defn set-create-generated-file-watcher!
  ^js [project value]
  (set! (.-createGeneratedFileWatcher ^js project) value))

(defn valid-generated-file-watcher
  "**Returns:** `any`"
  ^js [project]
  (.-isValidGeneratedFileWatcher ^js project))

(defn set-is-valid-generated-file-watcher!
  ^js [project value]
  (set! (.-isValidGeneratedFileWatcher ^js project) value))

(defn clear-generated-file-watch
  "**Returns:** `any`"
  ^js [project]
  (.-clearGeneratedFileWatch ^js project))

(defn set-clear-generated-file-watch!
  ^js [project value]
  (set! (.-clearGeneratedFileWatch ^js project) value))

(defn script-info-for-normalized-path
  "**Parameters:**
   - `file-name`: `NormalizedPath`
   
   **Returns:** `ScriptInfo | undefined`"
  ^js [project file-name]
  (.getScriptInfoForNormalizedPath ^js project file-name))

(defn script-info
  "**Parameters:**
   - `unchecked-file-name`: `string`
   
   **Returns:** `ScriptInfo | undefined`"
  ^js [project unchecked-file-name]
  (.getScriptInfo ^js project unchecked-file-name))

(defn files-to-string
  "**Parameters:**
   - `write-project-file-names?`: `boolean`
   
   **Returns:** `string`"
  ^js [project write-project-file-names?]
  (.filesToString ^js project write-project-file-names?))

(defn set-compiler-options
  "**Parameters:**
   - `compiler-options`: `CompilerOptions`
   
   **Returns:** `void`"
  ^js [project compiler-options]
  (.setCompilerOptions ^js project compiler-options))

(defn set-type-acquisition
  "**Parameters:**
   - `new-type-acquisition`: `TypeAcquisition | undefined`
   
   **Returns:** `void`"
  (^js [project]
   (.setTypeAcquisition ^js project))
  (^js [project new-type-acquisition]
   (.setTypeAcquisition ^js project new-type-acquisition)))

(defn type-acquisition
  "**Returns:** `TypeAcquisition`"
  ^js [project]
  (.getTypeAcquisition ^js project))

(defn remove-root
  "**Parameters:**
   - `info`: `ScriptInfo`
   
   **Returns:** `void`"
  ^js [project info]
  (.removeRoot ^js project info))

(defn enable-global-plugins
  "**Parameters:**
   - `options`: `CompilerOptions`
   
   **Returns:** `void`"
  ^js [project options]
  (.enableGlobalPlugins ^js project options))

(defn enable-plugin
  "**Parameters:**
   - `plugin-config-entry`: `PluginImport`
   - `search-paths`: `string[]`
   
   **Returns:** `void`"
  ^js [project plugin-config-entry search-paths]
  (.enablePlugin ^js project plugin-config-entry search-paths))

(defn refresh-diagnostics
  "Starts a new check for diagnostics. Call this if some file has updated that would cause diagnostics to be changed.
   
   **Returns:** `void`"
  ^js [project]
  (.refreshDiagnostics ^js project))

(defn resolve-module
  "**Parameters:**
   - `module-name`: `string`
   - `initial-dir`: `string`
   - `host`: `ServerHost`
   - `log`: `(message: string) => void`
   
   **Returns:** `{} | undefined`"
  ^js [module-name initial-dir host log]
  (.. typescript/server -Project (resolveModule module-name initial-dir host log)))
