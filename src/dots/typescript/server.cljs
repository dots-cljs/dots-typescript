(ns dots.typescript.server
  (:require ["typescript" :as typescript]))

(defn create-install-typings-request
  "**Parameters:**
   - `project`: `Project`
   - `type-acquisition`: `TypeAcquisition`
   - `unresolved-imports`: `SortedReadonlyArray<string>`
   - `cache-path`: `string | undefined`
   
   **Returns:** `DiscoverTypings`"
  (^js [project type-acquisition unresolved-imports]
   (.createInstallTypingsRequest typescript/server project type-acquisition unresolved-imports))
  (^js [project type-acquisition unresolved-imports cache-path]
   (.createInstallTypingsRequest typescript/server project type-acquisition unresolved-imports cache-path)))

(defn to-normalized-path
  "**Parameters:**
   - `file-name`: `string`
   
   **Returns:** `NormalizedPath`"
  ^js [file-name]
  (.toNormalizedPath typescript/server file-name))

(defn normalized-path-to-path
  "**Parameters:**
   - `normalized-path`: `NormalizedPath`
   - `current-directory`: `string`
   - `canonical-file-name`: `(f: string) => string`
   
   **Returns:** `Path`"
  ^js [normalized-path current-directory canonical-file-name]
  (.normalizedPathToPath typescript/server normalized-path current-directory canonical-file-name))

(defn as-normalized-path
  "**Parameters:**
   - `file-name`: `string`
   
   **Returns:** `NormalizedPath`"
  ^js [file-name]
  (.asNormalizedPath typescript/server file-name))

(defn create-normalized-path-map
  "**Returns:** `NormalizedPathMap<T>`"
  ^js []
  (.createNormalizedPathMap typescript/server))

(defn inferred-project-name?
  "**Parameters:**
   - `name`: `string`
   
   **Returns:** `boolean`"
  ^js [name]
  (.isInferredProjectName typescript/server name))

(defn make-inferred-project-name
  "**Parameters:**
   - `counter`: `number`
   
   **Returns:** `string`"
  ^js [counter]
  (.makeInferredProjectName typescript/server counter))

(defn create-sorted-array
  "**Returns:** `SortedArray<T>`"
  ^js []
  (.createSortedArray typescript/server))

(defn dynamic-file-name?
  "**Parameters:**
   - `file-name`: `NormalizedPath`
   
   **Returns:** `boolean`"
  ^js [file-name]
  (.isDynamicFileName typescript/server file-name))

(defn all-root-files-are-js-or-dts?
  "**Parameters:**
   - `project`: `Project`
   
   **Returns:** `boolean`"
  ^js [project]
  (.allRootFilesAreJsOrDts typescript/server project))

(defn all-files-are-js-or-dts?
  "**Parameters:**
   - `project`: `Project`
   
   **Returns:** `boolean`"
  ^js [project]
  (.allFilesAreJsOrDts typescript/server project))

(defn convert-format-options
  "**Parameters:**
   - `protocol-options`: `FormatCodeSettings`
   
   **Returns:** `FormatCodeSettings`"
  ^js [protocol-options]
  (.convertFormatOptions typescript/server protocol-options))

(defn convert-compiler-options
  "**Parameters:**
   - `protocol-options`: `ExternalProjectCompilerOptions`
   
   **Returns:** `CompilerOptions & CompileOnSaveMixin`"
  ^js [protocol-options]
  (.convertCompilerOptions typescript/server protocol-options))

(defn convert-watch-options
  "**Parameters:**
   - `protocol-options`: `ExternalProjectCompilerOptions`
   - `current-directory`: `string | undefined`
   
   **Returns:** `WatchOptionsAndErrors | undefined`"
  (^js [protocol-options]
   (.convertWatchOptions typescript/server protocol-options))
  (^js [protocol-options current-directory]
   (.convertWatchOptions typescript/server protocol-options current-directory)))

(defn convert-type-acquisition
  "**Parameters:**
   - `protocol-options`: `InferredProjectCompilerOptions`
   
   **Returns:** `TypeAcquisition | undefined`"
  ^js [protocol-options]
  (.convertTypeAcquisition typescript/server protocol-options))

(defn try-convert-script-kind-name
  "**Parameters:**
   - `script-kind-name`: `ScriptKind | ScriptKindName`
   
   **Returns:** `ScriptKind`"
  ^js [script-kind-name]
  (.tryConvertScriptKindName typescript/server script-kind-name))

(defn convert-script-kind-name
  "**Parameters:**
   - `script-kind-name`: `ScriptKindName`
   
   **Returns:** `ScriptKind.Unknown | ScriptKind.JS | ScriptKind.JSX | ScriptKind.TS | ScriptKind.TSX`"
  ^js [script-kind-name]
  (.convertScriptKindName typescript/server script-kind-name))

(defn format-message
  "**Parameters:**
   - `msg`: `T`
   - `logger`: `Logger`
   - `byte-length`: `(s: string, encoding: BufferEncoding) => number`
   - `new-line`: `string`
   
   **Returns:** `string`"
  ^js [msg logger byte-length new-line]
  (.formatMessage typescript/server msg logger byte-length new-line))

(defn empty-array
  ^js []
  (.-emptyArray typescript/server))

(defn null-typings-installer
  ^js []
  (.-nullTypingsInstaller typescript/server))

(defn max-program-size-for-non-ts-files
  ^js []
  (.-maxProgramSizeForNonTsFiles typescript/server))

(defn projects-updated-in-background-event
  ^js []
  (.-ProjectsUpdatedInBackgroundEvent typescript/server))

(defn project-loading-start-event
  ^js []
  (.-ProjectLoadingStartEvent typescript/server))

(defn project-loading-finish-event
  ^js []
  (.-ProjectLoadingFinishEvent typescript/server))

(defn large-file-referenced-event
  ^js []
  (.-LargeFileReferencedEvent typescript/server))

(defn config-file-diag-event
  ^js []
  (.-ConfigFileDiagEvent typescript/server))

(defn project-language-service-state-event
  ^js []
  (.-ProjectLanguageServiceStateEvent typescript/server))

(defn project-info-telemetry-event
  "This will be converted to the payload of a protocol.TelemetryEvent in session.defaultEventHandler."
  ^js []
  (.-ProjectInfoTelemetryEvent typescript/server))

(defn open-file-info-telemetry-event
  "Info that we may send about a file that was just opened.
   Info about a file will only be sent once per session, even if the file changes in ways that might affect the info.
   Currently this is only sent for '.js' files."
  ^js []
  (.-OpenFileInfoTelemetryEvent typescript/server))

(defn create-file-watcher-event
  ^js []
  (.-CreateFileWatcherEvent typescript/server))

(defn create-directory-watcher-event
  ^js []
  (.-CreateDirectoryWatcherEvent typescript/server))

(defn close-file-watcher-event
  ^js []
  (.-CloseFileWatcherEvent typescript/server))

(defn null-cancellation-token
  ^js []
  (.-nullCancellationToken typescript/server))

(defn command-names
  ^js []
  (.-CommandNames typescript/server))
