(ns dots.typescript.server.auto-import-provider-project)

(defn host-project
  ^js [auto-import-provider-project]
  (.-hostProject ^js auto-import-provider-project))

(defn set-host-project!
  ^js [auto-import-provider-project value]
  (set! (.-hostProject ^js auto-import-provider-project) value))

(defn root-file-names
  ^js [auto-import-provider-project]
  (.-rootFileNames ^js auto-import-provider-project))

(defn set-root-file-names!
  ^js [auto-import-provider-project value]
  (set! (.-rootFileNames ^js auto-import-provider-project) value))

(defn orphan?
  "**Returns:** `boolean`"
  ^js [auto-import-provider-project]
  (.isOrphan ^js auto-import-provider-project))

(defn update-graph?
  "**Returns:** `boolean` - : true if set of files in the project stays the same and false - otherwise."
  ^js [auto-import-provider-project]
  (.updateGraph ^js auto-import-provider-project))

(defn has-roots?
  "**Returns:** `boolean`"
  ^js [auto-import-provider-project]
  (.hasRoots ^js auto-import-provider-project))

(defn mark-as-dirty
  "**Returns:** `void`"
  ^js [auto-import-provider-project]
  (.markAsDirty ^js auto-import-provider-project))

(defn script-file-names
  "**Returns:** `string[]`"
  ^js [auto-import-provider-project]
  (.getScriptFileNames ^js auto-import-provider-project))

(defn get-language-service
  "**Returns:** `never`"
  ^js [auto-import-provider-project]
  (.getLanguageService ^js auto-import-provider-project))

(defn host-for-auto-import-provider
  "**Returns:** `never`"
  ^js [auto-import-provider-project]
  (.getHostForAutoImportProvider ^js auto-import-provider-project))

(defn project-references
  "**Returns:** `readonly ProjectReference[] | undefined`"
  ^js [auto-import-provider-project]
  (.getProjectReferences ^js auto-import-provider-project))

(defn project-kind
  ^js [auto-import-provider-project]
  (.-projectKind ^js auto-import-provider-project))

(defn project-service
  ^js [auto-import-provider-project]
  (.-projectService ^js auto-import-provider-project))

(defn document-registry
  ^js [auto-import-provider-project]
  (.-documentRegistry ^js auto-import-provider-project))

(defn set-document-registry!
  ^js [auto-import-provider-project value]
  (set! (.-documentRegistry ^js auto-import-provider-project) value))

(defn compiler-options
  ^js [auto-import-provider-project]
  (.-compilerOptions ^js auto-import-provider-project))

(defn set-compiler-options!
  ^js [auto-import-provider-project value]
  (set! (.-compilerOptions ^js auto-import-provider-project) value))

(defn compile-on-save-enabled?
  ^js [auto-import-provider-project]
  (.-compileOnSaveEnabled ^js auto-import-provider-project))

(defn set-compile-on-save-enabled!
  ^js [auto-import-provider-project value]
  (set! (.-compileOnSaveEnabled ^js auto-import-provider-project) value))

(defn watch-options
  ^js [auto-import-provider-project]
  (.-watchOptions ^js auto-import-provider-project))

(defn set-watch-options!
  ^js [auto-import-provider-project value]
  (set! (.-watchOptions ^js auto-import-provider-project) value))

(defn root-files
  ^js [auto-import-provider-project]
  (.-rootFiles ^js auto-import-provider-project))

(defn set-root-files!
  ^js [auto-import-provider-project value]
  (set! (.-rootFiles ^js auto-import-provider-project) value))

(defn root-files-map
  ^js [auto-import-provider-project]
  (.-rootFilesMap ^js auto-import-provider-project))

(defn set-root-files-map!
  ^js [auto-import-provider-project value]
  (set! (.-rootFilesMap ^js auto-import-provider-project) value))

(defn program
  ^js [auto-import-provider-project]
  (.-program ^js auto-import-provider-project))

(defn set-program!
  ^js [auto-import-provider-project value]
  (set! (.-program ^js auto-import-provider-project) value))

(defn external-files
  ^js [auto-import-provider-project]
  (.-externalFiles ^js auto-import-provider-project))

(defn set-external-files!
  ^js [auto-import-provider-project value]
  (set! (.-externalFiles ^js auto-import-provider-project) value))

(defn missing-files-map
  ^js [auto-import-provider-project]
  (.-missingFilesMap ^js auto-import-provider-project))

(defn set-missing-files-map!
  ^js [auto-import-provider-project value]
  (set! (.-missingFilesMap ^js auto-import-provider-project) value))

(defn generated-files-map
  ^js [auto-import-provider-project]
  (.-generatedFilesMap ^js auto-import-provider-project))

(defn set-generated-files-map!
  ^js [auto-import-provider-project value]
  (set! (.-generatedFilesMap ^js auto-import-provider-project) value))

(defn language-service
  ^js [auto-import-provider-project]
  (.-languageService ^js auto-import-provider-project))

(defn set-language-service!
  ^js [auto-import-provider-project value]
  (set! (.-languageService ^js auto-import-provider-project) value))

(defn language-service-enabled?
  ^js [auto-import-provider-project]
  (.-languageServiceEnabled ^js auto-import-provider-project))

(defn set-language-service-enabled!
  ^js [auto-import-provider-project value]
  (set! (.-languageServiceEnabled ^js auto-import-provider-project) value))

(defn trace
  ^js [auto-import-provider-project]
  (.-trace ^js auto-import-provider-project))

(defn realpath
  ^js [auto-import-provider-project]
  (.-realpath ^js auto-import-provider-project))

(defn builder-state
  ^js [auto-import-provider-project]
  (.-builderState ^js auto-import-provider-project))

(defn set-builder-state!
  ^js [auto-import-provider-project value]
  (set! (.-builderState ^js auto-import-provider-project) value))

(defn updated-file-names
  "Set of files names that were updated since the last call to getChangesSinceVersion."
  ^js [auto-import-provider-project]
  (.-updatedFileNames ^js auto-import-provider-project))

(defn set-updated-file-names!
  "Set of files names that were updated since the last call to getChangesSinceVersion."
  ^js [auto-import-provider-project value]
  (set! (.-updatedFileNames ^js auto-import-provider-project) value))

(defn last-reported-file-names
  "Set of files that was returned from the last call to getChangesSinceVersion."
  ^js [auto-import-provider-project]
  (.-lastReportedFileNames ^js auto-import-provider-project))

(defn set-last-reported-file-names!
  "Set of files that was returned from the last call to getChangesSinceVersion."
  ^js [auto-import-provider-project value]
  (set! (.-lastReportedFileNames ^js auto-import-provider-project) value))

(defn last-reported-version
  "Last version that was reported."
  ^js [auto-import-provider-project]
  (.-lastReportedVersion ^js auto-import-provider-project))

(defn set-last-reported-version!
  "Last version that was reported."
  ^js [auto-import-provider-project value]
  (set! (.-lastReportedVersion ^js auto-import-provider-project) value))

(defn project-errors
  ^js [auto-import-provider-project]
  (.-projectErrors ^js auto-import-provider-project))

(defn set-project-errors!
  ^js [auto-import-provider-project value]
  (set! (.-projectErrors ^js auto-import-provider-project) value))

(defn initial-load-pending
  ^js [auto-import-provider-project]
  (.-isInitialLoadPending ^js auto-import-provider-project))

(defn set-is-initial-load-pending!
  ^js [auto-import-provider-project value]
  (set! (.-isInitialLoadPending ^js auto-import-provider-project) value))

(defn cancellation-token
  ^js [auto-import-provider-project]
  (.-cancellationToken ^js auto-import-provider-project))

(defn non-ts-project?
  "**Returns:** `boolean`"
  ^js [auto-import-provider-project]
  (.isNonTsProject ^js auto-import-provider-project))

(defn js-only-project?
  "**Returns:** `boolean`"
  ^js [auto-import-provider-project]
  (.isJsOnlyProject ^js auto-import-provider-project))

(defn js-doc-parsing-mode
  ^js [auto-import-provider-project]
  (.-jsDocParsingMode ^js auto-import-provider-project))

(defn known-types-package-name?
  "**Parameters:**
   - `name`: `string`
   
   **Returns:** `boolean`"
  ^js [auto-import-provider-project name]
  (.isKnownTypesPackageName ^js auto-import-provider-project name))

(defn install-package
  "**Parameters:**
   - `options`: `InstallPackageOptions`
   
   **Returns:** `Promise<ApplyCodeActionCommandResult>`"
  ^js [auto-import-provider-project options]
  (.installPackage ^js auto-import-provider-project options))

(defn compilation-settings
  "**Returns:** `CompilerOptions`"
  ^js [auto-import-provider-project]
  (.getCompilationSettings ^js auto-import-provider-project))

(defn get-compiler-options
  "**Returns:** `CompilerOptions`"
  ^js [auto-import-provider-project]
  (.getCompilerOptions ^js auto-import-provider-project))

(defn new-line
  "**Returns:** `string`"
  ^js [auto-import-provider-project]
  (.getNewLine ^js auto-import-provider-project))

(defn project-version
  "**Returns:** `string`"
  ^js [auto-import-provider-project]
  (.getProjectVersion ^js auto-import-provider-project))

(defn or-create-script-info-and-attach-to-project
  ^js [auto-import-provider-project]
  (.-getOrCreateScriptInfoAndAttachToProject ^js auto-import-provider-project))

(defn set-get-or-create-script-info-and-attach-to-project!
  ^js [auto-import-provider-project value]
  (set! (.-getOrCreateScriptInfoAndAttachToProject ^js auto-import-provider-project) value))

(defn script-kind
  "**Parameters:**
   - `file-name`: `string`
   
   **Returns:** `ScriptKind`"
  ^js [auto-import-provider-project file-name]
  (.getScriptKind ^js auto-import-provider-project file-name))

(defn script-version
  "**Parameters:**
   - `filename`: `string`
   
   **Returns:** `string`"
  ^js [auto-import-provider-project filename]
  (.getScriptVersion ^js auto-import-provider-project filename))

(defn script-snapshot
  "**Parameters:**
   - `filename`: `string`
   
   **Returns:** `IScriptSnapshot | undefined`"
  ^js [auto-import-provider-project filename]
  (.getScriptSnapshot ^js auto-import-provider-project filename))

(defn get-cancellation-token
  "**Returns:** `HostCancellationToken`"
  ^js [auto-import-provider-project]
  (.getCancellationToken ^js auto-import-provider-project))

(defn current-directory
  "**Returns:** `string`"
  ^js [auto-import-provider-project]
  (.getCurrentDirectory ^js auto-import-provider-project))

(defn default-lib-file-name
  "**Returns:** `string`"
  ^js [auto-import-provider-project]
  (.getDefaultLibFileName ^js auto-import-provider-project))

(defn use-case-sensitive-file-names?
  "**Returns:** `boolean`"
  ^js [auto-import-provider-project]
  (.useCaseSensitiveFileNames ^js auto-import-provider-project))

(defn read-directory
  "**Parameters:**
   - `path`: `string`
   - `extensions`: `readonly string[] | undefined`
   - `exclude`: `readonly string[] | undefined`
   - `include`: `readonly string[] | undefined`
   - `depth`: `number | undefined`
   
   **Returns:** `string[]`"
  (^js [auto-import-provider-project path]
   (.readDirectory ^js auto-import-provider-project path))
  (^js [auto-import-provider-project path extensions]
   (.readDirectory ^js auto-import-provider-project path extensions))
  (^js [auto-import-provider-project path extensions exclude]
   (.readDirectory ^js auto-import-provider-project path extensions exclude))
  (^js [auto-import-provider-project path extensions exclude include]
   (.readDirectory ^js auto-import-provider-project path extensions exclude include))
  (^js [auto-import-provider-project path extensions exclude include depth]
   (.readDirectory ^js auto-import-provider-project path extensions exclude include depth)))

(defn read-file
  "**Parameters:**
   - `file-name`: `string`
   
   **Returns:** `string | undefined`"
  ^js [auto-import-provider-project file-name]
  (.readFile ^js auto-import-provider-project file-name))

(defn write-file
  "**Parameters:**
   - `file-name`: `string`
   - `content`: `string`
   
   **Returns:** `void`"
  ^js [auto-import-provider-project file-name content]
  (.writeFile ^js auto-import-provider-project file-name content))

(defn file-exists?
  "**Parameters:**
   - `file`: `string`
   
   **Returns:** `boolean`"
  ^js [auto-import-provider-project file]
  (.fileExists ^js auto-import-provider-project file))

(defn directory-exists?
  "**Parameters:**
   - `path`: `string`
   
   **Returns:** `boolean`"
  ^js [auto-import-provider-project path]
  (.directoryExists ^js auto-import-provider-project path))

(defn directories
  "**Parameters:**
   - `path`: `string`
   
   **Returns:** `string[]`"
  ^js [auto-import-provider-project path]
  (.getDirectories ^js auto-import-provider-project path))

(defn log
  "**Parameters:**
   - `s`: `string`
   
   **Returns:** `void`"
  ^js [auto-import-provider-project s]
  (.log ^js auto-import-provider-project s))

(defn error
  "**Parameters:**
   - `s`: `string`
   
   **Returns:** `void`"
  ^js [auto-import-provider-project s]
  (.error ^js auto-import-provider-project s))

(defn set-internal-compiler-options-for-emitting-js-files
  ^js [auto-import-provider-project]
  (.-setInternalCompilerOptionsForEmittingJsFiles ^js auto-import-provider-project))

(defn set-set-internal-compiler-options-for-emitting-js-files!
  ^js [auto-import-provider-project value]
  (set! (.-setInternalCompilerOptionsForEmittingJsFiles ^js auto-import-provider-project) value))

(defn global-project-errors
  "Get the errors that dont have any file name associated
   
   **Returns:** `readonly Diagnostic[]`"
  ^js [auto-import-provider-project]
  (.getGlobalProjectErrors ^js auto-import-provider-project))

(defn all-project-errors
  "Get all the project errors
   
   **Returns:** `readonly Diagnostic[]`"
  ^js [auto-import-provider-project]
  (.getAllProjectErrors ^js auto-import-provider-project))

(defn set-project-errors
  "**Parameters:**
   - `project-errors`: `Diagnostic[] | undefined`
   
   **Returns:** `void`"
  (^js [auto-import-provider-project]
   (.setProjectErrors ^js auto-import-provider-project))
  (^js [auto-import-provider-project project-errors]
   (.setProjectErrors ^js auto-import-provider-project project-errors)))

(defn compile-on-save-affected-file-list
  "**Parameters:**
   - `script-info`: `ScriptInfo`
   
   **Returns:** `string[]`"
  ^js [auto-import-provider-project script-info]
  (.getCompileOnSaveAffectedFileList ^js auto-import-provider-project script-info))

(defn emit-file
  "Returns true if emit was conducted
   
   **Parameters:**
   - `script-info`: `ScriptInfo`
   - `write-file`: `(path: string, data: string, writeByteOrderMark?: boolean | undefined) => void`
   
   **Returns:** `EmitResult`"
  ^js [auto-import-provider-project script-info write-file]
  (.emitFile ^js auto-import-provider-project script-info write-file))

(defn enable-language-service
  "**Returns:** `void`"
  ^js [auto-import-provider-project]
  (.enableLanguageService ^js auto-import-provider-project))

(defn disable-language-service
  "**Parameters:**
   - `last-file-exceeded-program-size`: `string | undefined`
   
   **Returns:** `void`"
  (^js [auto-import-provider-project]
   (.disableLanguageService ^js auto-import-provider-project))
  (^js [auto-import-provider-project last-file-exceeded-program-size]
   (.disableLanguageService ^js auto-import-provider-project last-file-exceeded-program-size)))

(defn project-name
  "**Returns:** `string`"
  ^js [auto-import-provider-project]
  (.getProjectName ^js auto-import-provider-project))

(defn remove-local-typings-from-type-acquisition
  "**Parameters:**
   - `new-type-acquisition`: `TypeAcquisition`
   
   **Returns:** `TypeAcquisition`"
  ^js [auto-import-provider-project new-type-acquisition]
  (.removeLocalTypingsFromTypeAcquisition ^js auto-import-provider-project new-type-acquisition))

(defn get-external-files
  "**Parameters:**
   - `update-level`: `ProgramUpdateLevel | undefined`
   
   **Returns:** `SortedReadonlyArray<string>`"
  (^js [auto-import-provider-project]
   (.getExternalFiles ^js auto-import-provider-project))
  (^js [auto-import-provider-project update-level]
   (.getExternalFiles ^js auto-import-provider-project update-level)))

(defn source-file
  "**Parameters:**
   - `path`: `Path`
   
   **Returns:** `SourceFile | undefined`"
  ^js [auto-import-provider-project path]
  (.getSourceFile ^js auto-import-provider-project path))

(defn close
  "**Returns:** `void`"
  ^js [auto-import-provider-project]
  (.close ^js auto-import-provider-project))

(defn detach-script-info-if-not-root
  ^js [auto-import-provider-project]
  (.-detachScriptInfoIfNotRoot ^js auto-import-provider-project))

(defn set-detach-script-info-if-not-root!
  ^js [auto-import-provider-project value]
  (set! (.-detachScriptInfoIfNotRoot ^js auto-import-provider-project) value))

(defn closed?
  "**Returns:** `boolean`"
  ^js [auto-import-provider-project]
  (.isClosed ^js auto-import-provider-project))

(defn get-root-files
  "**Returns:** `NormalizedPath[]`"
  ^js [auto-import-provider-project]
  (.getRootFiles ^js auto-import-provider-project))

(defn root-script-infos
  "**Returns:** `ScriptInfo[]`"
  ^js [auto-import-provider-project]
  (.getRootScriptInfos ^js auto-import-provider-project))

(defn script-infos
  "**Returns:** `ScriptInfo[]`"
  ^js [auto-import-provider-project]
  (.getScriptInfos ^js auto-import-provider-project))

(defn excluded-files
  "**Returns:** `readonly NormalizedPath[]`"
  ^js [auto-import-provider-project]
  (.getExcludedFiles ^js auto-import-provider-project))

(defn file-names
  "**Parameters:**
   - `exclude-files-from-external-libraries?`: `boolean | undefined`
   - `exclude-config-files?`: `boolean | undefined`
   
   **Returns:** `NormalizedPath[]`"
  (^js [auto-import-provider-project]
   (.getFileNames ^js auto-import-provider-project))
  (^js [auto-import-provider-project exclude-files-from-external-libraries?]
   (.getFileNames ^js auto-import-provider-project exclude-files-from-external-libraries?))
  (^js [auto-import-provider-project exclude-files-from-external-libraries? exclude-config-files?]
   (.getFileNames ^js auto-import-provider-project exclude-files-from-external-libraries? exclude-config-files?)))

(defn has-config-file?
  "**Parameters:**
   - `config-file-path`: `NormalizedPath`
   
   **Returns:** `boolean`"
  ^js [auto-import-provider-project config-file-path]
  (.hasConfigFile ^js auto-import-provider-project config-file-path))

(defn contains-script-info?
  "**Parameters:**
   - `info`: `ScriptInfo`
   
   **Returns:** `boolean`"
  ^js [auto-import-provider-project info]
  (.containsScriptInfo ^js auto-import-provider-project info))

(defn contains-file?
  "**Parameters:**
   - `filename`: `NormalizedPath`
   - `require-open?`: `boolean | undefined`
   
   **Returns:** `boolean`"
  (^js [auto-import-provider-project filename]
   (.containsFile ^js auto-import-provider-project filename))
  (^js [auto-import-provider-project filename require-open?]
   (.containsFile ^js auto-import-provider-project filename require-open?)))

(defn root?
  "**Parameters:**
   - `info`: `ScriptInfo`
   
   **Returns:** `boolean`"
  ^js [auto-import-provider-project info]
  (.isRoot ^js auto-import-provider-project info))

(defn add-root
  "**Parameters:**
   - `info`: `ScriptInfo`
   - `file-name`: `NormalizedPath | undefined`
   
   **Returns:** `void`"
  (^js [auto-import-provider-project info]
   (.addRoot ^js auto-import-provider-project info))
  (^js [auto-import-provider-project info file-name]
   (.addRoot ^js auto-import-provider-project info file-name)))

(defn add-missing-file-root
  "**Parameters:**
   - `file-name`: `NormalizedPath`
   
   **Returns:** `void`"
  ^js [auto-import-provider-project file-name]
  (.addMissingFileRoot ^js auto-import-provider-project file-name))

(defn remove-file
  "**Parameters:**
   - `info`: `ScriptInfo`
   - `file-exists?`: `boolean`
   - `detach-from-project?`: `boolean`
   
   **Returns:** `void`"
  ^js [auto-import-provider-project info file-exists? detach-from-project?]
  (.removeFile ^js auto-import-provider-project info file-exists? detach-from-project?))

(defn register-file-update
  "**Parameters:**
   - `file-name`: `string`
   
   **Returns:** `void`"
  ^js [auto-import-provider-project file-name]
  (.registerFileUpdate ^js auto-import-provider-project file-name))

(defn remove-existing-typings
  "**Parameters:**
   - `include`: `string[]`
   
   **Returns:** `string[]`"
  ^js [auto-import-provider-project include]
  (.removeExistingTypings ^js auto-import-provider-project include))

(defn update-graph-worker
  ^js [auto-import-provider-project]
  (.-updateGraphWorker ^js auto-import-provider-project))

(defn set-update-graph-worker!
  ^js [auto-import-provider-project value]
  (set! (.-updateGraphWorker ^js auto-import-provider-project) value))

(defn detach-script-info-from-project
  ^js [auto-import-provider-project]
  (.-detachScriptInfoFromProject ^js auto-import-provider-project))

(defn set-detach-script-info-from-project!
  ^js [auto-import-provider-project value]
  (set! (.-detachScriptInfoFromProject ^js auto-import-provider-project) value))

(defn add-missing-file-watcher
  ^js [auto-import-provider-project]
  (.-addMissingFileWatcher ^js auto-import-provider-project))

(defn set-add-missing-file-watcher!
  ^js [auto-import-provider-project value]
  (set! (.-addMissingFileWatcher ^js auto-import-provider-project) value))

(defn watched-missing-file
  ^js [auto-import-provider-project]
  (.-isWatchedMissingFile ^js auto-import-provider-project))

(defn set-is-watched-missing-file!
  ^js [auto-import-provider-project value]
  (set! (.-isWatchedMissingFile ^js auto-import-provider-project) value))

(defn create-generated-file-watcher
  ^js [auto-import-provider-project]
  (.-createGeneratedFileWatcher ^js auto-import-provider-project))

(defn set-create-generated-file-watcher!
  ^js [auto-import-provider-project value]
  (set! (.-createGeneratedFileWatcher ^js auto-import-provider-project) value))

(defn valid-generated-file-watcher
  ^js [auto-import-provider-project]
  (.-isValidGeneratedFileWatcher ^js auto-import-provider-project))

(defn set-is-valid-generated-file-watcher!
  ^js [auto-import-provider-project value]
  (set! (.-isValidGeneratedFileWatcher ^js auto-import-provider-project) value))

(defn clear-generated-file-watch
  ^js [auto-import-provider-project]
  (.-clearGeneratedFileWatch ^js auto-import-provider-project))

(defn set-clear-generated-file-watch!
  ^js [auto-import-provider-project value]
  (set! (.-clearGeneratedFileWatch ^js auto-import-provider-project) value))

(defn script-info-for-normalized-path
  "**Parameters:**
   - `file-name`: `NormalizedPath`
   
   **Returns:** `ScriptInfo | undefined`"
  ^js [auto-import-provider-project file-name]
  (.getScriptInfoForNormalizedPath ^js auto-import-provider-project file-name))

(defn script-info
  "**Parameters:**
   - `unchecked-file-name`: `string`
   
   **Returns:** `ScriptInfo | undefined`"
  ^js [auto-import-provider-project unchecked-file-name]
  (.getScriptInfo ^js auto-import-provider-project unchecked-file-name))

(defn files-to-string
  "**Parameters:**
   - `write-project-file-names?`: `boolean`
   
   **Returns:** `string`"
  ^js [auto-import-provider-project write-project-file-names?]
  (.filesToString ^js auto-import-provider-project write-project-file-names?))

(defn set-compiler-options
  "**Parameters:**
   - `compiler-options`: `CompilerOptions`
   
   **Returns:** `void`"
  ^js [auto-import-provider-project compiler-options]
  (.setCompilerOptions ^js auto-import-provider-project compiler-options))

(defn set-type-acquisition
  "**Parameters:**
   - `new-type-acquisition`: `TypeAcquisition | undefined`
   
   **Returns:** `void`"
  (^js [auto-import-provider-project]
   (.setTypeAcquisition ^js auto-import-provider-project))
  (^js [auto-import-provider-project new-type-acquisition]
   (.setTypeAcquisition ^js auto-import-provider-project new-type-acquisition)))

(defn type-acquisition
  "**Returns:** `TypeAcquisition`"
  ^js [auto-import-provider-project]
  (.getTypeAcquisition ^js auto-import-provider-project))

(defn remove-root
  "**Parameters:**
   - `info`: `ScriptInfo`
   
   **Returns:** `void`"
  ^js [auto-import-provider-project info]
  (.removeRoot ^js auto-import-provider-project info))

(defn enable-global-plugins
  "**Parameters:**
   - `options`: `CompilerOptions`
   
   **Returns:** `void`"
  ^js [auto-import-provider-project options]
  (.enableGlobalPlugins ^js auto-import-provider-project options))

(defn enable-plugin
  "**Parameters:**
   - `plugin-config-entry`: `PluginImport`
   - `search-paths`: `string[]`
   
   **Returns:** `void`"
  ^js [auto-import-provider-project plugin-config-entry search-paths]
  (.enablePlugin ^js auto-import-provider-project plugin-config-entry search-paths))

(defn refresh-diagnostics
  "Starts a new check for diagnostics. Call this if some file has updated that would cause diagnostics to be changed.
   
   **Returns:** `void`"
  ^js [auto-import-provider-project]
  (.refreshDiagnostics ^js auto-import-provider-project))
