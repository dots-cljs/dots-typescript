(ns dots.typescript.server.inferred-project
  "If a file is opened and no tsconfig (or jsconfig) is found,
   the file and its imports/references are put into an InferredProject.")

(defn toggle-js-inferred-project
  "**Parameters:**
   - `js-inferred-project?`: `boolean`
   
   **Returns:** `void`"
  ^js [inferred-project js-inferred-project?]
  (.toggleJsInferredProject ^js inferred-project js-inferred-project?))

(defn set-compiler-options
  "**Parameters:**
   - `options`: `CompilerOptions | undefined`
   
   **Returns:** `void`"
  (^js [inferred-project]
   (.setCompilerOptions ^js inferred-project))
  (^js [inferred-project options]
   (.setCompilerOptions ^js inferred-project options)))

(defn project-root-path
  "this is canonical project root path
   
   **Returns:** `string | undefined`"
  ^js [inferred-project]
  (.-projectRootPath ^js inferred-project))

(defn add-root
  "**Parameters:**
   - `info`: `ScriptInfo`
   
   **Returns:** `void`"
  ^js [inferred-project info]
  (.addRoot ^js inferred-project info))

(defn remove-root
  "**Parameters:**
   - `info`: `ScriptInfo`
   
   **Returns:** `void`"
  ^js [inferred-project info]
  (.removeRoot ^js inferred-project info))

(defn project-with-single-root?
  "**Returns:** `boolean`"
  ^js [inferred-project]
  (.isProjectWithSingleRoot ^js inferred-project))

(defn close
  "**Returns:** `void`"
  ^js [inferred-project]
  (.close ^js inferred-project))

(defn type-acquisition
  "**Returns:** `TypeAcquisition`"
  ^js [inferred-project]
  (.getTypeAcquisition ^js inferred-project))

(defn project-kind
  "**Returns:** `ProjectKind`"
  ^js [inferred-project]
  (.-projectKind ^js inferred-project))

(defn project-service
  "**Returns:** `ProjectService`"
  ^js [inferred-project]
  (.-projectService ^js inferred-project))

(defn document-registry
  "**Returns:** `any`"
  ^js [inferred-project]
  (.-documentRegistry ^js inferred-project))

(defn set-document-registry!
  ^js [inferred-project value]
  (set! (.-documentRegistry ^js inferred-project) value))

(defn compiler-options
  "**Returns:** `any`"
  ^js [inferred-project]
  (.-compilerOptions ^js inferred-project))

(defn set-compiler-options!
  ^js [inferred-project value]
  (set! (.-compilerOptions ^js inferred-project) value))

(defn compile-on-save-enabled?
  "**Returns:** `boolean`"
  ^js [inferred-project]
  (.-compileOnSaveEnabled ^js inferred-project))

(defn set-compile-on-save-enabled!
  ^js [inferred-project value]
  (set! (.-compileOnSaveEnabled ^js inferred-project) value))

(defn watch-options
  "**Returns:** `WatchOptions | undefined`"
  ^js [inferred-project]
  (.-watchOptions ^js inferred-project))

(defn set-watch-options!
  ^js [inferred-project value]
  (set! (.-watchOptions ^js inferred-project) value))

(defn root-files
  "**Returns:** `any`"
  ^js [inferred-project]
  (.-rootFiles ^js inferred-project))

(defn set-root-files!
  ^js [inferred-project value]
  (set! (.-rootFiles ^js inferred-project) value))

(defn root-files-map
  "**Returns:** `any`"
  ^js [inferred-project]
  (.-rootFilesMap ^js inferred-project))

(defn set-root-files-map!
  ^js [inferred-project value]
  (set! (.-rootFilesMap ^js inferred-project) value))

(defn program
  "**Returns:** `any`"
  ^js [inferred-project]
  (.-program ^js inferred-project))

(defn set-program!
  ^js [inferred-project value]
  (set! (.-program ^js inferred-project) value))

(defn external-files
  "**Returns:** `any`"
  ^js [inferred-project]
  (.-externalFiles ^js inferred-project))

(defn set-external-files!
  ^js [inferred-project value]
  (set! (.-externalFiles ^js inferred-project) value))

(defn missing-files-map
  "**Returns:** `any`"
  ^js [inferred-project]
  (.-missingFilesMap ^js inferred-project))

(defn set-missing-files-map!
  ^js [inferred-project value]
  (set! (.-missingFilesMap ^js inferred-project) value))

(defn generated-files-map
  "**Returns:** `any`"
  ^js [inferred-project]
  (.-generatedFilesMap ^js inferred-project))

(defn set-generated-files-map!
  ^js [inferred-project value]
  (set! (.-generatedFilesMap ^js inferred-project) value))

(defn language-service
  "**Returns:** `LanguageService`"
  ^js [inferred-project]
  (.-languageService ^js inferred-project))

(defn set-language-service!
  ^js [inferred-project value]
  (set! (.-languageService ^js inferred-project) value))

(defn language-service-enabled?
  "**Returns:** `boolean`"
  ^js [inferred-project]
  (.-languageServiceEnabled ^js inferred-project))

(defn set-language-service-enabled!
  ^js [inferred-project value]
  (set! (.-languageServiceEnabled ^js inferred-project) value))

(defn trace
  "**Returns:** `((s: string) => void) | undefined`"
  ^js [inferred-project]
  (.-trace ^js inferred-project))

(defn realpath
  "**Returns:** `((path: string) => string) | undefined`"
  ^js [inferred-project]
  (.-realpath ^js inferred-project))

(defn builder-state
  "**Returns:** `any`"
  ^js [inferred-project]
  (.-builderState ^js inferred-project))

(defn set-builder-state!
  ^js [inferred-project value]
  (set! (.-builderState ^js inferred-project) value))

(defn updated-file-names
  "Set of files names that were updated since the last call to getChangesSinceVersion.
   
   **Returns:** `any`"
  ^js [inferred-project]
  (.-updatedFileNames ^js inferred-project))

(defn set-updated-file-names!
  "Set of files names that were updated since the last call to getChangesSinceVersion."
  ^js [inferred-project value]
  (set! (.-updatedFileNames ^js inferred-project) value))

(defn last-reported-file-names
  "Set of files that was returned from the last call to getChangesSinceVersion.
   
   **Returns:** `any`"
  ^js [inferred-project]
  (.-lastReportedFileNames ^js inferred-project))

(defn set-last-reported-file-names!
  "Set of files that was returned from the last call to getChangesSinceVersion."
  ^js [inferred-project value]
  (set! (.-lastReportedFileNames ^js inferred-project) value))

(defn last-reported-version
  "Last version that was reported.
   
   **Returns:** `any`"
  ^js [inferred-project]
  (.-lastReportedVersion ^js inferred-project))

(defn set-last-reported-version!
  "Last version that was reported."
  ^js [inferred-project value]
  (set! (.-lastReportedVersion ^js inferred-project) value))

(defn project-errors
  "**Returns:** `Diagnostic[] | undefined`"
  ^js [inferred-project]
  (.-projectErrors ^js inferred-project))

(defn set-project-errors!
  ^js [inferred-project value]
  (set! (.-projectErrors ^js inferred-project) value))

(defn initial-load-pending
  "**Returns:** `() => boolean`"
  ^js [inferred-project]
  (.-isInitialLoadPending ^js inferred-project))

(defn set-is-initial-load-pending!
  ^js [inferred-project value]
  (set! (.-isInitialLoadPending ^js inferred-project) value))

(defn cancellation-token
  "**Returns:** `any`"
  ^js [inferred-project]
  (.-cancellationToken ^js inferred-project))

(defn non-ts-project?
  "**Returns:** `boolean`"
  ^js [inferred-project]
  (.isNonTsProject ^js inferred-project))

(defn js-only-project?
  "**Returns:** `boolean`"
  ^js [inferred-project]
  (.isJsOnlyProject ^js inferred-project))

(defn js-doc-parsing-mode
  "**Returns:** `JSDocParsingMode | undefined`"
  ^js [inferred-project]
  (.-jsDocParsingMode ^js inferred-project))

(defn known-types-package-name?
  "**Parameters:**
   - `name`: `string`
   
   **Returns:** `boolean`"
  ^js [inferred-project name]
  (.isKnownTypesPackageName ^js inferred-project name))

(defn install-package
  "**Parameters:**
   - `options`: `InstallPackageOptions`
   
   **Returns:** `Promise<ApplyCodeActionCommandResult>`"
  ^js [inferred-project options]
  (.installPackage ^js inferred-project options))

(defn compilation-settings
  "**Returns:** `CompilerOptions`"
  ^js [inferred-project]
  (.getCompilationSettings ^js inferred-project))

(defn get-compiler-options
  "**Returns:** `CompilerOptions`"
  ^js [inferred-project]
  (.getCompilerOptions ^js inferred-project))

(defn new-line
  "**Returns:** `string`"
  ^js [inferred-project]
  (.getNewLine ^js inferred-project))

(defn project-version
  "**Returns:** `string`"
  ^js [inferred-project]
  (.getProjectVersion ^js inferred-project))

(defn project-references
  "**Returns:** `readonly ProjectReference[] | undefined`"
  ^js [inferred-project]
  (.getProjectReferences ^js inferred-project))

(defn script-file-names
  "**Returns:** `string[]`"
  ^js [inferred-project]
  (.getScriptFileNames ^js inferred-project))

(defn or-create-script-info-and-attach-to-project
  "**Returns:** `any`"
  ^js [inferred-project]
  (.-getOrCreateScriptInfoAndAttachToProject ^js inferred-project))

(defn set-get-or-create-script-info-and-attach-to-project!
  ^js [inferred-project value]
  (set! (.-getOrCreateScriptInfoAndAttachToProject ^js inferred-project) value))

(defn script-kind
  "**Parameters:**
   - `file-name`: `string`
   
   **Returns:** `ScriptKind`"
  ^js [inferred-project file-name]
  (.getScriptKind ^js inferred-project file-name))

(defn script-version
  "**Parameters:**
   - `filename`: `string`
   
   **Returns:** `string`"
  ^js [inferred-project filename]
  (.getScriptVersion ^js inferred-project filename))

(defn script-snapshot
  "**Parameters:**
   - `filename`: `string`
   
   **Returns:** `IScriptSnapshot | undefined`"
  ^js [inferred-project filename]
  (.getScriptSnapshot ^js inferred-project filename))

(defn get-cancellation-token
  "**Returns:** `HostCancellationToken`"
  ^js [inferred-project]
  (.getCancellationToken ^js inferred-project))

(defn current-directory
  "**Returns:** `string`"
  ^js [inferred-project]
  (.getCurrentDirectory ^js inferred-project))

(defn default-lib-file-name
  "**Returns:** `string`"
  ^js [inferred-project]
  (.getDefaultLibFileName ^js inferred-project))

(defn use-case-sensitive-file-names?
  "**Returns:** `boolean`"
  ^js [inferred-project]
  (.useCaseSensitiveFileNames ^js inferred-project))

(defn read-directory
  "**Parameters:**
   - `path`: `string`
   - `extensions`: `readonly string[] | undefined`
   - `exclude`: `readonly string[] | undefined`
   - `include`: `readonly string[] | undefined`
   - `depth`: `number | undefined`
   
   **Returns:** `string[]`"
  (^js [inferred-project path]
   (.readDirectory ^js inferred-project path))
  (^js [inferred-project path extensions]
   (.readDirectory ^js inferred-project path extensions))
  (^js [inferred-project path extensions exclude]
   (.readDirectory ^js inferred-project path extensions exclude))
  (^js [inferred-project path extensions exclude include]
   (.readDirectory ^js inferred-project path extensions exclude include))
  (^js [inferred-project path extensions exclude include depth]
   (.readDirectory ^js inferred-project path extensions exclude include depth)))

(defn read-file
  "**Parameters:**
   - `file-name`: `string`
   
   **Returns:** `string | undefined`"
  ^js [inferred-project file-name]
  (.readFile ^js inferred-project file-name))

(defn write-file
  "**Parameters:**
   - `file-name`: `string`
   - `content`: `string`
   
   **Returns:** `void`"
  ^js [inferred-project file-name content]
  (.writeFile ^js inferred-project file-name content))

(defn file-exists?
  "**Parameters:**
   - `file`: `string`
   
   **Returns:** `boolean`"
  ^js [inferred-project file]
  (.fileExists ^js inferred-project file))

(defn directory-exists?
  "**Parameters:**
   - `path`: `string`
   
   **Returns:** `boolean`"
  ^js [inferred-project path]
  (.directoryExists ^js inferred-project path))

(defn directories
  "**Parameters:**
   - `path`: `string`
   
   **Returns:** `string[]`"
  ^js [inferred-project path]
  (.getDirectories ^js inferred-project path))

(defn log
  "**Parameters:**
   - `s`: `string`
   
   **Returns:** `void`"
  ^js [inferred-project s]
  (.log ^js inferred-project s))

(defn error
  "**Parameters:**
   - `s`: `string`
   
   **Returns:** `void`"
  ^js [inferred-project s]
  (.error ^js inferred-project s))

(defn set-internal-compiler-options-for-emitting-js-files
  "**Returns:** `any`"
  ^js [inferred-project]
  (.-setInternalCompilerOptionsForEmittingJsFiles ^js inferred-project))

(defn set-set-internal-compiler-options-for-emitting-js-files!
  ^js [inferred-project value]
  (set! (.-setInternalCompilerOptionsForEmittingJsFiles ^js inferred-project) value))

(defn global-project-errors
  "Get the errors that dont have any file name associated
   
   **Returns:** `readonly Diagnostic[]`"
  ^js [inferred-project]
  (.getGlobalProjectErrors ^js inferred-project))

(defn all-project-errors
  "Get all the project errors
   
   **Returns:** `readonly Diagnostic[]`"
  ^js [inferred-project]
  (.getAllProjectErrors ^js inferred-project))

(defn set-project-errors
  "**Parameters:**
   - `project-errors`: `Diagnostic[] | undefined`
   
   **Returns:** `void`"
  (^js [inferred-project]
   (.setProjectErrors ^js inferred-project))
  (^js [inferred-project project-errors]
   (.setProjectErrors ^js inferred-project project-errors)))

(defn get-language-service
  "**Parameters:**
   - `ensure-synchronized?`: `boolean | undefined`
   
   **Returns:** `LanguageService`"
  (^js [inferred-project]
   (.getLanguageService ^js inferred-project))
  (^js [inferred-project ensure-synchronized?]
   (.getLanguageService ^js inferred-project ensure-synchronized?)))

(defn compile-on-save-affected-file-list
  "**Parameters:**
   - `script-info`: `ScriptInfo`
   
   **Returns:** `string[]`"
  ^js [inferred-project script-info]
  (.getCompileOnSaveAffectedFileList ^js inferred-project script-info))

(defn emit-file
  "Returns true if emit was conducted
   
   **Parameters:**
   - `script-info`: `ScriptInfo`
   - `write-file`: `(path: string, data: string, writeByteOrderMark?: boolean | undefined) => void`
   
   **Returns:** `EmitResult`"
  ^js [inferred-project script-info write-file]
  (.emitFile ^js inferred-project script-info write-file))

(defn enable-language-service
  "**Returns:** `void`"
  ^js [inferred-project]
  (.enableLanguageService ^js inferred-project))

(defn disable-language-service
  "**Parameters:**
   - `last-file-exceeded-program-size`: `string | undefined`
   
   **Returns:** `void`"
  (^js [inferred-project]
   (.disableLanguageService ^js inferred-project))
  (^js [inferred-project last-file-exceeded-program-size]
   (.disableLanguageService ^js inferred-project last-file-exceeded-program-size)))

(defn project-name
  "**Returns:** `string`"
  ^js [inferred-project]
  (.getProjectName ^js inferred-project))

(defn remove-local-typings-from-type-acquisition
  "**Parameters:**
   - `new-type-acquisition`: `TypeAcquisition`
   
   **Returns:** `TypeAcquisition`"
  ^js [inferred-project new-type-acquisition]
  (.removeLocalTypingsFromTypeAcquisition ^js inferred-project new-type-acquisition))

(defn get-external-files
  "**Parameters:**
   - `update-level`: `ProgramUpdateLevel | undefined`
   
   **Returns:** `SortedReadonlyArray<string>`"
  (^js [inferred-project]
   (.getExternalFiles ^js inferred-project))
  (^js [inferred-project update-level]
   (.getExternalFiles ^js inferred-project update-level)))

(defn source-file
  "**Parameters:**
   - `path`: `Path`
   
   **Returns:** `SourceFile | undefined`"
  ^js [inferred-project path]
  (.getSourceFile ^js inferred-project path))

(defn detach-script-info-if-not-root
  "**Returns:** `any`"
  ^js [inferred-project]
  (.-detachScriptInfoIfNotRoot ^js inferred-project))

(defn set-detach-script-info-if-not-root!
  ^js [inferred-project value]
  (set! (.-detachScriptInfoIfNotRoot ^js inferred-project) value))

(defn closed?
  "**Returns:** `boolean`"
  ^js [inferred-project]
  (.isClosed ^js inferred-project))

(defn has-roots?
  "**Returns:** `boolean`"
  ^js [inferred-project]
  (.hasRoots ^js inferred-project))

(defn get-root-files
  "**Returns:** `NormalizedPath[]`"
  ^js [inferred-project]
  (.getRootFiles ^js inferred-project))

(defn root-script-infos
  "**Returns:** `ScriptInfo[]`"
  ^js [inferred-project]
  (.getRootScriptInfos ^js inferred-project))

(defn script-infos
  "**Returns:** `ScriptInfo[]`"
  ^js [inferred-project]
  (.getScriptInfos ^js inferred-project))

(defn excluded-files
  "**Returns:** `readonly NormalizedPath[]`"
  ^js [inferred-project]
  (.getExcludedFiles ^js inferred-project))

(defn file-names
  "**Parameters:**
   - `exclude-files-from-external-libraries?`: `boolean | undefined`
   - `exclude-config-files?`: `boolean | undefined`
   
   **Returns:** `NormalizedPath[]`"
  (^js [inferred-project]
   (.getFileNames ^js inferred-project))
  (^js [inferred-project exclude-files-from-external-libraries?]
   (.getFileNames ^js inferred-project exclude-files-from-external-libraries?))
  (^js [inferred-project exclude-files-from-external-libraries? exclude-config-files?]
   (.getFileNames ^js inferred-project exclude-files-from-external-libraries? exclude-config-files?)))

(defn has-config-file?
  "**Parameters:**
   - `config-file-path`: `NormalizedPath`
   
   **Returns:** `boolean`"
  ^js [inferred-project config-file-path]
  (.hasConfigFile ^js inferred-project config-file-path))

(defn contains-script-info?
  "**Parameters:**
   - `info`: `ScriptInfo`
   
   **Returns:** `boolean`"
  ^js [inferred-project info]
  (.containsScriptInfo ^js inferred-project info))

(defn contains-file?
  "**Parameters:**
   - `filename`: `NormalizedPath`
   - `require-open?`: `boolean | undefined`
   
   **Returns:** `boolean`"
  (^js [inferred-project filename]
   (.containsFile ^js inferred-project filename))
  (^js [inferred-project filename require-open?]
   (.containsFile ^js inferred-project filename require-open?)))

(defn root?
  "**Parameters:**
   - `info`: `ScriptInfo`
   
   **Returns:** `boolean`"
  ^js [inferred-project info]
  (.isRoot ^js inferred-project info))

(defn add-missing-file-root
  "**Parameters:**
   - `file-name`: `NormalizedPath`
   
   **Returns:** `void`"
  ^js [inferred-project file-name]
  (.addMissingFileRoot ^js inferred-project file-name))

(defn remove-file
  "**Parameters:**
   - `info`: `ScriptInfo`
   - `file-exists?`: `boolean`
   - `detach-from-project?`: `boolean`
   
   **Returns:** `void`"
  ^js [inferred-project info file-exists? detach-from-project?]
  (.removeFile ^js inferred-project info file-exists? detach-from-project?))

(defn register-file-update
  "**Parameters:**
   - `file-name`: `string`
   
   **Returns:** `void`"
  ^js [inferred-project file-name]
  (.registerFileUpdate ^js inferred-project file-name))

(defn mark-as-dirty
  "**Returns:** `void`"
  ^js [inferred-project]
  (.markAsDirty ^js inferred-project))

(defn update-graph?
  "Updates set of files that contribute to this project
   
   **Returns:** `boolean` - : true if set of files in the project stays the same and false - otherwise."
  ^js [inferred-project]
  (.updateGraph ^js inferred-project))

(defn remove-existing-typings
  "**Parameters:**
   - `include`: `string[]`
   
   **Returns:** `string[]`"
  ^js [inferred-project include]
  (.removeExistingTypings ^js inferred-project include))

(defn update-graph-worker
  "**Returns:** `any`"
  ^js [inferred-project]
  (.-updateGraphWorker ^js inferred-project))

(defn set-update-graph-worker!
  ^js [inferred-project value]
  (set! (.-updateGraphWorker ^js inferred-project) value))

(defn detach-script-info-from-project
  "**Returns:** `any`"
  ^js [inferred-project]
  (.-detachScriptInfoFromProject ^js inferred-project))

(defn set-detach-script-info-from-project!
  ^js [inferred-project value]
  (set! (.-detachScriptInfoFromProject ^js inferred-project) value))

(defn add-missing-file-watcher
  "**Returns:** `any`"
  ^js [inferred-project]
  (.-addMissingFileWatcher ^js inferred-project))

(defn set-add-missing-file-watcher!
  ^js [inferred-project value]
  (set! (.-addMissingFileWatcher ^js inferred-project) value))

(defn watched-missing-file
  "**Returns:** `any`"
  ^js [inferred-project]
  (.-isWatchedMissingFile ^js inferred-project))

(defn set-is-watched-missing-file!
  ^js [inferred-project value]
  (set! (.-isWatchedMissingFile ^js inferred-project) value))

(defn create-generated-file-watcher
  "**Returns:** `any`"
  ^js [inferred-project]
  (.-createGeneratedFileWatcher ^js inferred-project))

(defn set-create-generated-file-watcher!
  ^js [inferred-project value]
  (set! (.-createGeneratedFileWatcher ^js inferred-project) value))

(defn valid-generated-file-watcher
  "**Returns:** `any`"
  ^js [inferred-project]
  (.-isValidGeneratedFileWatcher ^js inferred-project))

(defn set-is-valid-generated-file-watcher!
  ^js [inferred-project value]
  (set! (.-isValidGeneratedFileWatcher ^js inferred-project) value))

(defn clear-generated-file-watch
  "**Returns:** `any`"
  ^js [inferred-project]
  (.-clearGeneratedFileWatch ^js inferred-project))

(defn set-clear-generated-file-watch!
  ^js [inferred-project value]
  (set! (.-clearGeneratedFileWatch ^js inferred-project) value))

(defn script-info-for-normalized-path
  "**Parameters:**
   - `file-name`: `NormalizedPath`
   
   **Returns:** `ScriptInfo | undefined`"
  ^js [inferred-project file-name]
  (.getScriptInfoForNormalizedPath ^js inferred-project file-name))

(defn script-info
  "**Parameters:**
   - `unchecked-file-name`: `string`
   
   **Returns:** `ScriptInfo | undefined`"
  ^js [inferred-project unchecked-file-name]
  (.getScriptInfo ^js inferred-project unchecked-file-name))

(defn files-to-string
  "**Parameters:**
   - `write-project-file-names?`: `boolean`
   
   **Returns:** `string`"
  ^js [inferred-project write-project-file-names?]
  (.filesToString ^js inferred-project write-project-file-names?))

(defn set-type-acquisition
  "**Parameters:**
   - `new-type-acquisition`: `TypeAcquisition | undefined`
   
   **Returns:** `void`"
  (^js [inferred-project]
   (.setTypeAcquisition ^js inferred-project))
  (^js [inferred-project new-type-acquisition]
   (.setTypeAcquisition ^js inferred-project new-type-acquisition)))

(defn enable-global-plugins
  "**Parameters:**
   - `options`: `CompilerOptions`
   
   **Returns:** `void`"
  ^js [inferred-project options]
  (.enableGlobalPlugins ^js inferred-project options))

(defn enable-plugin
  "**Parameters:**
   - `plugin-config-entry`: `PluginImport`
   - `search-paths`: `string[]`
   
   **Returns:** `void`"
  ^js [inferred-project plugin-config-entry search-paths]
  (.enablePlugin ^js inferred-project plugin-config-entry search-paths))

(defn refresh-diagnostics
  "Starts a new check for diagnostics. Call this if some file has updated that would cause diagnostics to be changed.
   
   **Returns:** `void`"
  ^js [inferred-project]
  (.refreshDiagnostics ^js inferred-project))
