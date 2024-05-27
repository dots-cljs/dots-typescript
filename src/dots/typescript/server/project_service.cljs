(ns dots.typescript.server.project-service)

(defn node-modules-watchers
  "**Returns:** `any`"
  ^js [project-service]
  (.-nodeModulesWatchers ^js project-service))

(defn filename-to-script-info-version
  "Contains all the deleted script info's version information so that
   it does not reset when creating script info again
   (and could have potentially collided with version where contents mismatch)
   
   **Returns:** `any`"
  ^js [project-service]
  (.-filenameToScriptInfoVersion ^js project-service))

(defn all-js-files-for-open-file-telemetry
  "**Returns:** `any`"
  ^js [project-service]
  (.-allJsFilesForOpenFileTelemetry ^js project-service))

(defn external-project-to-configured-project-map
  "maps external project file name to list of config files that were the part of this project
   
   **Returns:** `any`"
  ^js [project-service]
  (.-externalProjectToConfiguredProjectMap ^js project-service))

(defn external-projects
  "external projects (configuration and list of root files is not controlled by tsserver)
   
   **Returns:** `ExternalProject[]`"
  ^js [project-service]
  (.-externalProjects ^js project-service))

(defn inferred-projects
  "projects built from openFileRoots
   
   **Returns:** `InferredProject[]`"
  ^js [project-service]
  (.-inferredProjects ^js project-service))

(defn configured-projects
  "projects specified by a tsconfig.json file
   
   **Returns:** `Map<string, ConfiguredProject>`"
  ^js [project-service]
  (.-configuredProjects ^js project-service))

(defn open-files
  "Open files: with value being project root path, and key being Path of the file that is open
   
   **Returns:** `Map<string, NormalizedPath | undefined>`"
  ^js [project-service]
  (.-openFiles ^js project-service))

(defn open-files-with-non-rooted-disk-path
  "Map of open files that are opened without complete path but have projectRoot as current directory
   
   **Returns:** `any`"
  ^js [project-service]
  (.-openFilesWithNonRootedDiskPath ^js project-service))

(defn compiler-options-for-inferred-projects
  "**Returns:** `any`"
  ^js [project-service]
  (.-compilerOptionsForInferredProjects ^js project-service))

(defn set-compiler-options-for-inferred-projects!
  ^js [project-service value]
  (set! (.-compilerOptionsForInferredProjects ^js project-service) value))

(defn compiler-options-for-inferred-projects-per-project-root
  "**Returns:** `any`"
  ^js [project-service]
  (.-compilerOptionsForInferredProjectsPerProjectRoot ^js project-service))

(defn set-compiler-options-for-inferred-projects-per-project-root!
  ^js [project-service value]
  (set! (.-compilerOptionsForInferredProjectsPerProjectRoot ^js project-service) value))

(defn watch-options-for-inferred-projects
  "**Returns:** `any`"
  ^js [project-service]
  (.-watchOptionsForInferredProjects ^js project-service))

(defn set-watch-options-for-inferred-projects!
  ^js [project-service value]
  (set! (.-watchOptionsForInferredProjects ^js project-service) value))

(defn watch-options-for-inferred-projects-per-project-root
  "**Returns:** `any`"
  ^js [project-service]
  (.-watchOptionsForInferredProjectsPerProjectRoot ^js project-service))

(defn set-watch-options-for-inferred-projects-per-project-root!
  ^js [project-service value]
  (set! (.-watchOptionsForInferredProjectsPerProjectRoot ^js project-service) value))

(defn type-acquisition-for-inferred-projects
  "**Returns:** `any`"
  ^js [project-service]
  (.-typeAcquisitionForInferredProjects ^js project-service))

(defn set-type-acquisition-for-inferred-projects!
  ^js [project-service value]
  (set! (.-typeAcquisitionForInferredProjects ^js project-service) value))

(defn type-acquisition-for-inferred-projects-per-project-root
  "**Returns:** `any`"
  ^js [project-service]
  (.-typeAcquisitionForInferredProjectsPerProjectRoot ^js project-service))

(defn set-type-acquisition-for-inferred-projects-per-project-root!
  ^js [project-service value]
  (set! (.-typeAcquisitionForInferredProjectsPerProjectRoot ^js project-service) value))

(defn project-to-size-map
  "Project size for configured or external projects
   
   **Returns:** `any`"
  ^js [project-service]
  (.-projectToSizeMap ^js project-service))

(defn host-configuration
  "**Returns:** `any`"
  ^js [project-service]
  (.-hostConfiguration ^js project-service))

(defn safelist
  "**Returns:** `any`"
  ^js [project-service]
  (.-safelist ^js project-service))

(defn set-safelist!
  ^js [project-service value]
  (set! (.-safelist ^js project-service) value))

(defn legacy-safelist
  "**Returns:** `any`"
  ^js [project-service]
  (.-legacySafelist ^js project-service))

(defn pending-project-updates
  "**Returns:** `any`"
  ^js [project-service]
  (.-pendingProjectUpdates ^js project-service))

(defn set-pending-project-updates!
  ^js [project-service value]
  (set! (.-pendingProjectUpdates ^js project-service) value))

(defn current-directory
  "**Returns:** `NormalizedPath`"
  ^js [project-service]
  (.-currentDirectory ^js project-service))

(defn to-canonical-file-name
  "**Returns:** `(f: string) => string`"
  ^js [project-service]
  (.-toCanonicalFileName ^js project-service))

(defn host
  "**Returns:** `ServerHost`"
  ^js [project-service]
  (.-host ^js project-service))

(defn logger
  "**Returns:** `Logger`"
  ^js [project-service]
  (.-logger ^js project-service))

(defn cancellation-token
  "**Returns:** `HostCancellationToken`"
  ^js [project-service]
  (.-cancellationToken ^js project-service))

(defn use-single-inferred-project?
  "**Returns:** `boolean`"
  ^js [project-service]
  (.-useSingleInferredProject ^js project-service))

(defn use-inferred-project-per-project-root?
  "**Returns:** `boolean`"
  ^js [project-service]
  (.-useInferredProjectPerProjectRoot ^js project-service))

(defn typings-installer
  "**Returns:** `ITypingsInstaller`"
  ^js [project-service]
  (.-typingsInstaller ^js project-service))

(defn global-cache-location-directory-path
  "**Returns:** `any`"
  ^js [project-service]
  (.-globalCacheLocationDirectoryPath ^js project-service))

(defn throttle-wait-milliseconds
  "**Returns:** `number | undefined`"
  ^js [project-service]
  (.-throttleWaitMilliseconds ^js project-service))

(defn suppress-diagnostic-events
  "**Returns:** `any`"
  ^js [project-service]
  (.-suppressDiagnosticEvents ^js project-service))

(defn global-plugins
  "**Returns:** `readonly string[]`"
  ^js [project-service]
  (.-globalPlugins ^js project-service))

(defn plugin-probe-locations
  "**Returns:** `readonly string[]`"
  ^js [project-service]
  (.-pluginProbeLocations ^js project-service))

(defn allow-local-plugin-loads?
  "**Returns:** `boolean`"
  ^js [project-service]
  (.-allowLocalPluginLoads ^js project-service))

(defn types-map-location
  "**Returns:** `string | undefined`"
  ^js [project-service]
  (.-typesMapLocation ^js project-service))

(defn server-mode
  "**Returns:** `LanguageServiceMode`"
  ^js [project-service]
  (.-serverMode ^js project-service))

(defn seen-projects
  "Tracks projects that we have already sent telemetry for.
   
   **Returns:** `any`"
  ^js [project-service]
  (.-seenProjects ^js project-service))

(defn performance-event-handler
  "**Returns:** `any`"
  ^js [project-service]
  (.-performanceEventHandler ^js project-service))

(defn set-performance-event-handler!
  ^js [project-service value]
  (set! (.-performanceEventHandler ^js project-service) value))

(defn pending-plugin-enablements
  "**Returns:** `any`"
  ^js [project-service]
  (.-pendingPluginEnablements ^js project-service))

(defn set-pending-plugin-enablements!
  ^js [project-service value]
  (set! (.-pendingPluginEnablements ^js project-service) value))

(defn current-plugin-enablement-promise
  "**Returns:** `any`"
  ^js [project-service]
  (.-currentPluginEnablementPromise ^js project-service))

(defn set-current-plugin-enablement-promise!
  ^js [project-service value]
  (set! (.-currentPluginEnablementPromise ^js project-service) value))

(defn js-doc-parsing-mode
  "**Returns:** `JSDocParsingMode | undefined`"
  ^js [project-service]
  (.-jsDocParsingMode ^js project-service))

(defn to-path
  "**Parameters:**
   - `file-name`: `string`
   
   **Returns:** `Path`"
  ^js [project-service file-name]
  (.toPath ^js project-service file-name))

(defn load-types-map
  "**Returns:** `any`"
  ^js [project-service]
  (.-loadTypesMap ^js project-service))

(defn set-load-types-map!
  ^js [project-service value]
  (set! (.-loadTypesMap ^js project-service) value))

(defn update-typings-for-project
  "**Parameters:**
   - `response`: `PackageInstalledResponse | InvalidateCachedTypings | SetTypings`
   
   **Returns:** `void`"
  ^js [project-service response]
  (.updateTypingsForProject ^js project-service response))

(defn delay-update-project-graph
  "**Returns:** `any`"
  ^js [project-service]
  (.-delayUpdateProjectGraph ^js project-service))

(defn set-delay-update-project-graph!
  ^js [project-service value]
  (set! (.-delayUpdateProjectGraph ^js project-service) value))

(defn delay-update-project-graphs
  "**Returns:** `any`"
  ^js [project-service]
  (.-delayUpdateProjectGraphs ^js project-service))

(defn set-delay-update-project-graphs!
  ^js [project-service value]
  (set! (.-delayUpdateProjectGraphs ^js project-service) value))

(defn set-compiler-options-for-inferred-projects
  "**Parameters:**
   - `project-compiler-options`: `InferredProjectCompilerOptions`
   - `project-root-path`: `string | undefined`
   
   **Returns:** `void`"
  (^js [project-service project-compiler-options]
   (.setCompilerOptionsForInferredProjects ^js project-service project-compiler-options))
  (^js [project-service project-compiler-options project-root-path]
   (.setCompilerOptionsForInferredProjects ^js project-service project-compiler-options project-root-path)))

(defn find-project
  "**Parameters:**
   - `project-name`: `string`
   
   **Returns:** `Project | undefined`"
  ^js [project-service project-name]
  (.findProject ^js project-service project-name))

(defn default-project-for-file
  "**Parameters:**
   - `file-name`: `NormalizedPath`
   - `ensure-project?`: `boolean`
   
   **Returns:** `Project | undefined`"
  ^js [project-service file-name ensure-project?]
  (.getDefaultProjectForFile ^js project-service file-name ensure-project?))

(defn do-ensure-default-project-for-file
  "**Returns:** `any`"
  ^js [project-service]
  (.-doEnsureDefaultProjectForFile ^js project-service))

(defn set-do-ensure-default-project-for-file!
  ^js [project-service value]
  (set! (.-doEnsureDefaultProjectForFile ^js project-service) value))

(defn script-info-ensuring-projects-upto-date
  "**Parameters:**
   - `unchecked-file-name`: `string`
   
   **Returns:** `ScriptInfo | undefined`"
  ^js [project-service unchecked-file-name]
  (.getScriptInfoEnsuringProjectsUptoDate ^js project-service unchecked-file-name))

(defn ensure-project-structures-upto-date
  "Ensures the project structures are upto date
   This means,
   - we go through all the projects and update them if they are dirty
   - if updates reflect some change in structure or there was pending request to ensure projects for open files
     ensure that each open script info has project
   
   **Returns:** `any`"
  ^js [project-service]
  (.-ensureProjectStructuresUptoDate ^js project-service))

(defn set-ensure-project-structures-upto-date!
  "Ensures the project structures are upto date
   This means,
   - we go through all the projects and update them if they are dirty
   - if updates reflect some change in structure or there was pending request to ensure projects for open files
     ensure that each open script info has project"
  ^js [project-service value]
  (set! (.-ensureProjectStructuresUptoDate ^js project-service) value))

(defn format-code-options
  "**Parameters:**
   - `file`: `NormalizedPath`
   
   **Returns:** `FormatCodeSettings`"
  ^js [project-service file]
  (.getFormatCodeOptions ^js project-service file))

(defn preferences
  "**Parameters:**
   - `file`: `NormalizedPath`
   
   **Returns:** `UserPreferences`"
  ^js [project-service file]
  (.getPreferences ^js project-service file))

(defn host-format-code-options
  "**Returns:** `FormatCodeSettings`"
  ^js [project-service]
  (.getHostFormatCodeOptions ^js project-service))

(defn host-preferences
  "**Returns:** `UserPreferences`"
  ^js [project-service]
  (.getHostPreferences ^js project-service))

(defn on-source-file-changed
  "**Returns:** `any`"
  ^js [project-service]
  (.-onSourceFileChanged ^js project-service))

(defn set-on-source-file-changed!
  ^js [project-service value]
  (set! (.-onSourceFileChanged ^js project-service) value))

(defn handle-source-map-projects
  "**Returns:** `any`"
  ^js [project-service]
  (.-handleSourceMapProjects ^js project-service))

(defn set-handle-source-map-projects!
  ^js [project-service value]
  (set! (.-handleSourceMapProjects ^js project-service) value))

(defn delay-update-source-info-projects
  "**Returns:** `any`"
  ^js [project-service]
  (.-delayUpdateSourceInfoProjects ^js project-service))

(defn set-delay-update-source-info-projects!
  ^js [project-service value]
  (set! (.-delayUpdateSourceInfoProjects ^js project-service) value))

(defn delay-update-projects-of-script-info-path
  "**Returns:** `any`"
  ^js [project-service]
  (.-delayUpdateProjectsOfScriptInfoPath ^js project-service))

(defn set-delay-update-projects-of-script-info-path!
  ^js [project-service value]
  (set! (.-delayUpdateProjectsOfScriptInfoPath ^js project-service) value))

(defn handle-deleted-file
  "**Returns:** `any`"
  ^js [project-service]
  (.-handleDeletedFile ^js project-service))

(defn set-handle-deleted-file!
  ^js [project-service value]
  (set! (.-handleDeletedFile ^js project-service) value))

(defn remove-project
  "**Returns:** `any`"
  ^js [project-service]
  (.-removeProject ^js project-service))

(defn set-remove-project!
  ^js [project-service value]
  (set! (.-removeProject ^js project-service) value))

(defn assign-orphan-script-infos-to-inferred-project
  "**Returns:** `any`"
  ^js [project-service]
  (.-assignOrphanScriptInfosToInferredProject ^js project-service))

(defn set-assign-orphan-script-infos-to-inferred-project!
  ^js [project-service value]
  (set! (.-assignOrphanScriptInfosToInferredProject ^js project-service) value))

(defn close-open-file
  "Remove this file from the set of open, non-configured files.
   
   **Returns:** `any`"
  ^js [project-service]
  (.-closeOpenFile ^js project-service))

(defn set-close-open-file!
  "Remove this file from the set of open, non-configured files."
  ^js [project-service value]
  (set! (.-closeOpenFile ^js project-service) value))

(defn delete-script-info
  "**Returns:** `any`"
  ^js [project-service]
  (.-deleteScriptInfo ^js project-service))

(defn set-delete-script-info!
  ^js [project-service value]
  (set! (.-deleteScriptInfo ^js project-service) value))

(defn config-file-exists
  "**Returns:** `any`"
  ^js [project-service]
  (.-configFileExists ^js project-service))

(defn set-config-file-exists!
  ^js [project-service value]
  (set! (.-configFileExists ^js project-service) value))

(defn config-file-existence-impacts-root-of-inferred-project
  "Returns true if the configFileExistenceInfo is needed/impacted by open files that are root of inferred project
   
   **Returns:** `any`"
  ^js [project-service]
  (.-configFileExistenceImpactsRootOfInferredProject ^js project-service))

(defn set-config-file-existence-impacts-root-of-inferred-project!
  "Returns true if the configFileExistenceInfo is needed/impacted by open files that are root of inferred project"
  ^js [project-service value]
  (set! (.-configFileExistenceImpactsRootOfInferredProject ^js project-service) value))

(defn stop-watching-config-files-for-closed-script-info
  "This is called on file close, so that we stop watching the config file for this script info
   
   **Returns:** `any`"
  ^js [project-service]
  (.-stopWatchingConfigFilesForClosedScriptInfo ^js project-service))

(defn set-stop-watching-config-files-for-closed-script-info!
  "This is called on file close, so that we stop watching the config file for this script info"
  ^js [project-service value]
  (set! (.-stopWatchingConfigFilesForClosedScriptInfo ^js project-service) value))

(defn for-each-config-file-location
  "This function tries to search for a tsconfig.json for the given file.
   This is different from the method the compiler uses because
   the compiler can assume it will always start searching in the
   current directory (the directory in which tsc was invoked).
   The server must start searching from the directory containing
   the newly opened file.
   
   **Returns:** `any`"
  ^js [project-service]
  (.-forEachConfigFileLocation ^js project-service))

(defn set-for-each-config-file-location!
  "This function tries to search for a tsconfig.json for the given file.
   This is different from the method the compiler uses because
   the compiler can assume it will always start searching in the
   current directory (the directory in which tsc was invoked).
   The server must start searching from the directory containing
   the newly opened file."
  ^js [project-service value]
  (set! (.-forEachConfigFileLocation ^js project-service) value))

(defn config-file-name-for-file
  "This function tries to search for a tsconfig.json for the given file.
   This is different from the method the compiler uses because
   the compiler can assume it will always start searching in the
   current directory (the directory in which tsc was invoked).
   The server must start searching from the directory containing
   the newly opened file.
   If script info is passed in, it is asserted to be open script info
   otherwise just file name
   
   **Returns:** `any`"
  ^js [project-service]
  (.-getConfigFileNameForFile ^js project-service))

(defn set-get-config-file-name-for-file!
  "This function tries to search for a tsconfig.json for the given file.
   This is different from the method the compiler uses because
   the compiler can assume it will always start searching in the
   current directory (the directory in which tsc was invoked).
   The server must start searching from the directory containing
   the newly opened file.
   If script info is passed in, it is asserted to be open script info
   otherwise just file name"
  ^js [project-service value]
  (set! (.-getConfigFileNameForFile ^js project-service) value))

(defn print-projects
  "**Returns:** `any`"
  ^js [project-service]
  (.-printProjects ^js project-service))

(defn set-print-projects!
  ^js [project-service value]
  (set! (.-printProjects ^js project-service) value))

(defn configured-project-by-canonical-config-file-path
  "**Returns:** `any`"
  ^js [project-service]
  (.-getConfiguredProjectByCanonicalConfigFilePath ^js project-service))

(defn set-get-configured-project-by-canonical-config-file-path!
  ^js [project-service value]
  (set! (.-getConfiguredProjectByCanonicalConfigFilePath ^js project-service) value))

(defn find-external-project-by-project-name
  "**Returns:** `any`"
  ^js [project-service]
  (.-findExternalProjectByProjectName ^js project-service))

(defn set-find-external-project-by-project-name!
  ^js [project-service value]
  (set! (.-findExternalProjectByProjectName ^js project-service) value))

(defn filename-for-exceeded-total-size-limit-for-non-ts-files
  "Get a filename if the language service exceeds the maximum allowed program size; otherwise returns undefined.
   
   **Returns:** `any`"
  ^js [project-service]
  (.-getFilenameForExceededTotalSizeLimitForNonTsFiles ^js project-service))

(defn set-get-filename-for-exceeded-total-size-limit-for-non-ts-files!
  "Get a filename if the language service exceeds the maximum allowed program size; otherwise returns undefined."
  ^js [project-service value]
  (set! (.-getFilenameForExceededTotalSizeLimitForNonTsFiles ^js project-service) value))

(defn create-external-project
  "**Returns:** `any`"
  ^js [project-service]
  (.-createExternalProject ^js project-service))

(defn set-create-external-project!
  ^js [project-service value]
  (set! (.-createExternalProject ^js project-service) value))

(defn add-files-to-non-inferred-project
  "**Returns:** `any`"
  ^js [project-service]
  (.-addFilesToNonInferredProject ^js project-service))

(defn set-add-files-to-non-inferred-project!
  ^js [project-service value]
  (set! (.-addFilesToNonInferredProject ^js project-service) value))

(defn update-non-inferred-project-files
  "**Returns:** `any`"
  ^js [project-service]
  (.-updateNonInferredProjectFiles ^js project-service))

(defn set-update-non-inferred-project-files!
  ^js [project-service value]
  (set! (.-updateNonInferredProjectFiles ^js project-service) value))

(defn update-root-and-options-of-non-inferred-project
  "**Returns:** `any`"
  ^js [project-service]
  (.-updateRootAndOptionsOfNonInferredProject ^js project-service))

(defn set-update-root-and-options-of-non-inferred-project!
  ^js [project-service value]
  (set! (.-updateRootAndOptionsOfNonInferredProject ^js project-service) value))

(defn send-config-file-diag-event
  "**Returns:** `any`"
  ^js [project-service]
  (.-sendConfigFileDiagEvent ^js project-service))

(defn set-send-config-file-diag-event!
  ^js [project-service value]
  (set! (.-sendConfigFileDiagEvent ^js project-service) value))

(defn or-create-inferred-project-for-project-root-path-if-enabled
  "**Returns:** `any`"
  ^js [project-service]
  (.-getOrCreateInferredProjectForProjectRootPathIfEnabled ^js project-service))

(defn set-get-or-create-inferred-project-for-project-root-path-if-enabled!
  ^js [project-service value]
  (set! (.-getOrCreateInferredProjectForProjectRootPathIfEnabled ^js project-service) value))

(defn or-create-single-inferred-project-if-enabled
  "**Returns:** `any`"
  ^js [project-service]
  (.-getOrCreateSingleInferredProjectIfEnabled ^js project-service))

(defn set-get-or-create-single-inferred-project-if-enabled!
  ^js [project-service value]
  (set! (.-getOrCreateSingleInferredProjectIfEnabled ^js project-service) value))

(defn or-create-single-inferred-without-project-root
  "**Returns:** `any`"
  ^js [project-service]
  (.-getOrCreateSingleInferredWithoutProjectRoot ^js project-service))

(defn set-get-or-create-single-inferred-without-project-root!
  ^js [project-service value]
  (set! (.-getOrCreateSingleInferredWithoutProjectRoot ^js project-service) value))

(defn create-inferred-project
  "**Returns:** `any`"
  ^js [project-service]
  (.-createInferredProject ^js project-service))

(defn set-create-inferred-project!
  ^js [project-service value]
  (set! (.-createInferredProject ^js project-service) value))

(defn script-info
  "**Parameters:**
   - `unchecked-file-name`: `string`
   
   **Returns:** `ScriptInfo | undefined`"
  ^js [project-service unchecked-file-name]
  (.getScriptInfo ^js project-service unchecked-file-name))

(defn watch-closed-script-info
  "**Returns:** `any`"
  ^js [project-service]
  (.-watchClosedScriptInfo ^js project-service))

(defn set-watch-closed-script-info!
  ^js [project-service value]
  (set! (.-watchClosedScriptInfo ^js project-service) value))

(defn create-node-modules-watcher
  "**Returns:** `any`"
  ^js [project-service]
  (.-createNodeModulesWatcher ^js project-service))

(defn set-create-node-modules-watcher!
  ^js [project-service value]
  (set! (.-createNodeModulesWatcher ^js project-service) value))

(defn watch-closed-script-info-in-node-modules
  "**Returns:** `any`"
  ^js [project-service]
  (.-watchClosedScriptInfoInNodeModules ^js project-service))

(defn set-watch-closed-script-info-in-node-modules!
  ^js [project-service value]
  (set! (.-watchClosedScriptInfoInNodeModules ^js project-service) value))

(defn modified-time
  "**Returns:** `any`"
  ^js [project-service]
  (.-getModifiedTime ^js project-service))

(defn set-get-modified-time!
  ^js [project-service value]
  (set! (.-getModifiedTime ^js project-service) value))

(defn refresh-script-info
  "**Returns:** `any`"
  ^js [project-service]
  (.-refreshScriptInfo ^js project-service))

(defn set-refresh-script-info!
  ^js [project-service value]
  (set! (.-refreshScriptInfo ^js project-service) value))

(defn refresh-script-infos-in-directory
  "**Returns:** `any`"
  ^js [project-service]
  (.-refreshScriptInfosInDirectory ^js project-service))

(defn set-refresh-script-infos-in-directory!
  ^js [project-service value]
  (set! (.-refreshScriptInfosInDirectory ^js project-service) value))

(defn stop-watching-script-info
  "**Returns:** `any`"
  ^js [project-service]
  (.-stopWatchingScriptInfo ^js project-service))

(defn set-stop-watching-script-info!
  ^js [project-service value]
  (set! (.-stopWatchingScriptInfo ^js project-service) value))

(defn or-create-script-info-not-opened-by-client-for-normalized-path
  "**Returns:** `any`"
  ^js [project-service]
  (.-getOrCreateScriptInfoNotOpenedByClientForNormalizedPath ^js project-service))

(defn set-get-or-create-script-info-not-opened-by-client-for-normalized-path!
  ^js [project-service value]
  (set! (.-getOrCreateScriptInfoNotOpenedByClientForNormalizedPath ^js project-service) value))

(defn or-create-script-info-opened-by-client-for-normalized-path
  "**Returns:** `any`"
  ^js [project-service]
  (.-getOrCreateScriptInfoOpenedByClientForNormalizedPath ^js project-service))

(defn set-get-or-create-script-info-opened-by-client-for-normalized-path!
  ^js [project-service value]
  (set! (.-getOrCreateScriptInfoOpenedByClientForNormalizedPath ^js project-service) value))

(defn or-create-script-info-for-normalized-path
  "**Parameters:**
   - `file-name`: `NormalizedPath`
   - `opened-by-client?`: `boolean`
   - `file-content`: `string | undefined`
   - `script-kind`: `ScriptKind | undefined`
   - `has-mixed-content?`: `boolean | undefined`
   - `host-to-query-file-exists-on`: `{ fileExists(path: string): boolean; } | undefined`
   
   **Returns:** `ScriptInfo | undefined`"
  (^js [project-service file-name opened-by-client?]
   (.getOrCreateScriptInfoForNormalizedPath ^js project-service file-name opened-by-client?))
  (^js [project-service file-name opened-by-client? file-content]
   (.getOrCreateScriptInfoForNormalizedPath ^js project-service file-name opened-by-client? file-content))
  (^js [project-service file-name opened-by-client? file-content script-kind]
   (.getOrCreateScriptInfoForNormalizedPath ^js project-service file-name opened-by-client? file-content script-kind))
  (^js [project-service file-name opened-by-client? file-content script-kind has-mixed-content?]
   (.getOrCreateScriptInfoForNormalizedPath ^js project-service file-name opened-by-client? file-content script-kind has-mixed-content?))
  (^js [project-service file-name opened-by-client? file-content script-kind has-mixed-content? host-to-query-file-exists-on]
   (.getOrCreateScriptInfoForNormalizedPath ^js project-service file-name opened-by-client? file-content script-kind has-mixed-content? host-to-query-file-exists-on)))

(defn or-create-script-info-worker
  "**Returns:** `any`"
  ^js [project-service]
  (.-getOrCreateScriptInfoWorker ^js project-service))

(defn set-get-or-create-script-info-worker!
  ^js [project-service value]
  (set! (.-getOrCreateScriptInfoWorker ^js project-service) value))

(defn script-info-for-normalized-path
  "This gets the script info for the normalized path. If the path is not rooted disk path then the open script info with project root context is preferred
   
   **Parameters:**
   - `file-name`: `NormalizedPath`
   
   **Returns:** `ScriptInfo | undefined`"
  ^js [project-service file-name]
  (.getScriptInfoForNormalizedPath ^js project-service file-name))

(defn script-info-for-path
  "**Parameters:**
   - `file-name`: `Path`
   
   **Returns:** `ScriptInfo | undefined`"
  ^js [project-service file-name]
  (.getScriptInfoForPath ^js project-service file-name))

(defn add-source-info-to-source-map
  "**Returns:** `any`"
  ^js [project-service]
  (.-addSourceInfoToSourceMap ^js project-service))

(defn set-add-source-info-to-source-map!
  ^js [project-service value]
  (set! (.-addSourceInfoToSourceMap ^js project-service) value))

(defn add-missing-source-map-file
  "**Returns:** `any`"
  ^js [project-service]
  (.-addMissingSourceMapFile ^js project-service))

(defn set-add-missing-source-map-file!
  ^js [project-service value]
  (set! (.-addMissingSourceMapFile ^js project-service) value))

(defn set-host-configuration
  "**Parameters:**
   - `args`: `ConfigureRequestArguments`
   
   **Returns:** `void`"
  ^js [project-service args]
  (.setHostConfiguration ^js project-service args))

(defn close-log
  "**Returns:** `void`"
  ^js [project-service]
  (.closeLog ^js project-service))

(defn reload-projects
  "This function rebuilds the project for every file opened by the client
   This does not reload contents of open files from disk. But we could do that if needed
   
   **Returns:** `void`"
  ^js [project-service]
  (.reloadProjects ^js project-service))

(defn reload-configured-project-for-files
  "This function goes through all the openFiles and tries to file the config file for them.
   If the config file is found and it refers to existing project, it reloads it either immediately
   or schedules it for reload depending on delayReload option
   If there is no existing project it just opens the configured project for the config file
   reloadForInfo provides a way to filter out files to reload configured project for
   
   **Returns:** `any`"
  ^js [project-service]
  (.-reloadConfiguredProjectForFiles ^js project-service))

(defn set-reload-configured-project-for-files!
  "This function goes through all the openFiles and tries to file the config file for them.
   If the config file is found and it refers to existing project, it reloads it either immediately
   or schedules it for reload depending on delayReload option
   If there is no existing project it just opens the configured project for the config file
   reloadForInfo provides a way to filter out files to reload configured project for"
  ^js [project-service value]
  (set! (.-reloadConfiguredProjectForFiles ^js project-service) value))

(defn remove-root-of-inferred-project-if-now-part-of-other-project
  "Remove the root of inferred project if script info is part of another project
   
   **Returns:** `any`"
  ^js [project-service]
  (.-removeRootOfInferredProjectIfNowPartOfOtherProject ^js project-service))

(defn set-remove-root-of-inferred-project-if-now-part-of-other-project!
  "Remove the root of inferred project if script info is part of another project"
  ^js [project-service value]
  (set! (.-removeRootOfInferredProjectIfNowPartOfOtherProject ^js project-service) value))

(defn ensure-project-for-open-files
  "This function is to update the project structure for every inferred project.
   It is called on the premise that all the configured projects are
   up to date.
   This will go through open files and assign them to inferred project if open file is not part of any other project
   After that all the inferred project graphs are updated
   
   **Returns:** `any`"
  ^js [project-service]
  (.-ensureProjectForOpenFiles ^js project-service))

(defn set-ensure-project-for-open-files!
  "This function is to update the project structure for every inferred project.
   It is called on the premise that all the configured projects are
   up to date.
   This will go through open files and assign them to inferred project if open file is not part of any other project
   After that all the inferred project graphs are updated"
  ^js [project-service value]
  (set! (.-ensureProjectForOpenFiles ^js project-service) value))

(defn open-client-file
  "Open file whose contents is managed by the client
   
   **Parameters:**
   - `file-name`: `string`
   - `file-content`: `string | undefined` - is a known version of the file content that is more up to date than the one on disk
   - `script-kind`: `ScriptKind | undefined`
   - `project-root-path`: `string | undefined`
   
   **Returns:** `OpenConfiguredProjectResult`"
  (^js [project-service file-name]
   (.openClientFile ^js project-service file-name))
  (^js [project-service file-name file-content]
   (.openClientFile ^js project-service file-name file-content))
  (^js [project-service file-name file-content script-kind]
   (.openClientFile ^js project-service file-name file-content script-kind))
  (^js [project-service file-name file-content script-kind project-root-path]
   (.openClientFile ^js project-service file-name file-content script-kind project-root-path)))

(defn find-external-project-containing-open-script-info
  "**Returns:** `any`"
  ^js [project-service]
  (.-findExternalProjectContainingOpenScriptInfo ^js project-service))

(defn set-find-external-project-containing-open-script-info!
  ^js [project-service value]
  (set! (.-findExternalProjectContainingOpenScriptInfo ^js project-service) value))

(defn or-create-open-script-info
  "**Returns:** `any`"
  ^js [project-service]
  (.-getOrCreateOpenScriptInfo ^js project-service))

(defn set-get-or-create-open-script-info!
  ^js [project-service value]
  (set! (.-getOrCreateOpenScriptInfo ^js project-service) value))

(defn assign-project-to-opened-script-info
  "**Returns:** `any`"
  ^js [project-service]
  (.-assignProjectToOpenedScriptInfo ^js project-service))

(defn set-assign-project-to-opened-script-info!
  ^js [project-service value]
  (set! (.-assignProjectToOpenedScriptInfo ^js project-service) value))

(defn create-ancestor-projects
  "**Returns:** `any`"
  ^js [project-service]
  (.-createAncestorProjects ^js project-service))

(defn set-create-ancestor-projects!
  ^js [project-service value]
  (set! (.-createAncestorProjects ^js project-service) value))

(defn ensure-project-children
  "**Returns:** `any`"
  ^js [project-service]
  (.-ensureProjectChildren ^js project-service))

(defn set-ensure-project-children!
  ^js [project-service value]
  (set! (.-ensureProjectChildren ^js project-service) value))

(defn cleanup-after-opening-file
  "**Returns:** `any`"
  ^js [project-service]
  (.-cleanupAfterOpeningFile ^js project-service))

(defn set-cleanup-after-opening-file!
  ^js [project-service value]
  (set! (.-cleanupAfterOpeningFile ^js project-service) value))

(defn open-client-file-with-normalized-path
  "**Parameters:**
   - `file-name`: `NormalizedPath`
   - `file-content`: `string | undefined`
   - `script-kind`: `ScriptKind | undefined`
   - `has-mixed-content?`: `boolean | undefined`
   - `project-root-path`: `NormalizedPath | undefined`
   
   **Returns:** `OpenConfiguredProjectResult`"
  (^js [project-service file-name]
   (.openClientFileWithNormalizedPath ^js project-service file-name))
  (^js [project-service file-name file-content]
   (.openClientFileWithNormalizedPath ^js project-service file-name file-content))
  (^js [project-service file-name file-content script-kind]
   (.openClientFileWithNormalizedPath ^js project-service file-name file-content script-kind))
  (^js [project-service file-name file-content script-kind has-mixed-content?]
   (.openClientFileWithNormalizedPath ^js project-service file-name file-content script-kind has-mixed-content?))
  (^js [project-service file-name file-content script-kind has-mixed-content? project-root-path]
   (.openClientFileWithNormalizedPath ^js project-service file-name file-content script-kind has-mixed-content? project-root-path)))

(defn remove-orphan-configured-projects
  "**Returns:** `any`"
  ^js [project-service]
  (.-removeOrphanConfiguredProjects ^js project-service))

(defn set-remove-orphan-configured-projects!
  ^js [project-service value]
  (set! (.-removeOrphanConfiguredProjects ^js project-service) value))

(defn remove-orphan-script-infos
  "**Returns:** `any`"
  ^js [project-service]
  (.-removeOrphanScriptInfos ^js project-service))

(defn set-remove-orphan-script-infos!
  ^js [project-service value]
  (set! (.-removeOrphanScriptInfos ^js project-service) value))

(defn telemetry-on-open-file
  "**Returns:** `any`"
  ^js [project-service]
  (.-telemetryOnOpenFile ^js project-service))

(defn set-telemetry-on-open-file!
  ^js [project-service value]
  (set! (.-telemetryOnOpenFile ^js project-service) value))

(defn close-client-file
  "Close file whose contents is managed by the client
   
   **Parameters:**
   - `unchecked-file-name`: `string`
   
   **Returns:** `void`"
  ^js [project-service unchecked-file-name]
  (.closeClientFile ^js project-service unchecked-file-name))

(defn collect-changes
  "**Returns:** `any`"
  ^js [project-service]
  (.-collectChanges ^js project-service))

(defn set-collect-changes!
  ^js [project-service value]
  (set! (.-collectChanges ^js project-service) value))

(defn close-configured-project-referenced-from-external-project
  "**Returns:** `any`"
  ^js [project-service]
  (.-closeConfiguredProjectReferencedFromExternalProject ^js project-service))

(defn set-close-configured-project-referenced-from-external-project!
  ^js [project-service value]
  (set! (.-closeConfiguredProjectReferencedFromExternalProject ^js project-service) value))

(defn close-external-project
  "**Parameters:**
   - `unchecked-file-name`: `string`
   
   **Returns:** `void`"
  ^js [project-service unchecked-file-name]
  (.closeExternalProject ^js project-service unchecked-file-name))

(defn open-external-projects
  "**Parameters:**
   - `projects`: `ExternalProject[]`
   
   **Returns:** `void`"
  ^js [project-service projects]
  (.openExternalProjects ^js project-service projects))

(defn reset-safe-list
  "**Returns:** `void`"
  ^js [project-service]
  (.resetSafeList ^js project-service))

(defn apply-safe-list
  "**Parameters:**
   - `proj`: `ExternalProject`
   
   **Returns:** `NormalizedPath[]`"
  ^js [project-service proj]
  (.applySafeList ^js project-service proj))

(defn apply-safe-list-worker
  "**Returns:** `any`"
  ^js [project-service]
  (.-applySafeListWorker ^js project-service))

(defn set-apply-safe-list-worker!
  ^js [project-service value]
  (set! (.-applySafeListWorker ^js project-service) value))

(defn open-external-project
  "**Parameters:**
   - `proj`: `ExternalProject`
   
   **Returns:** `void`"
  ^js [project-service proj]
  (.openExternalProject ^js project-service proj))

(defn has-deferred-extension?
  "**Returns:** `boolean`"
  ^js [project-service]
  (.hasDeferredExtension ^js project-service))

(defn enable-requested-plugins-async
  "**Returns:** `any`"
  ^js [project-service]
  (.-enableRequestedPluginsAsync ^js project-service))

(defn set-enable-requested-plugins-async!
  ^js [project-service value]
  (set! (.-enableRequestedPluginsAsync ^js project-service) value))

(defn enable-requested-plugins-worker
  "**Returns:** `any`"
  ^js [project-service]
  (.-enableRequestedPluginsWorker ^js project-service))

(defn set-enable-requested-plugins-worker!
  ^js [project-service value]
  (set! (.-enableRequestedPluginsWorker ^js project-service) value))

(defn enable-requested-plugins-for-project-async
  "**Returns:** `any`"
  ^js [project-service]
  (.-enableRequestedPluginsForProjectAsync ^js project-service))

(defn set-enable-requested-plugins-for-project-async!
  ^js [project-service value]
  (set! (.-enableRequestedPluginsForProjectAsync ^js project-service) value))

(defn configure-plugin
  "**Parameters:**
   - `args`: `ConfigurePluginRequestArguments`
   
   **Returns:** `void`"
  ^js [project-service args]
  (.configurePlugin ^js project-service args))

(defn filename-escape-regexp
  "Makes a filename safe to insert in a RegExp
   
   **Returns:** `any`"
  ^js [project-service]
  (.-filenameEscapeRegexp ^js project-service))

(defn escape-filename-for-regex
  "**Returns:** `any`"
  ^js [project-service]
  (.-escapeFilenameForRegex ^js project-service))

(defn set-escape-filename-for-regex!
  ^js [project-service value]
  (set! (.-escapeFilenameForRegex ^js project-service) value))
