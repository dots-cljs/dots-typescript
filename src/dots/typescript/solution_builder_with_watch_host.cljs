(ns dots.typescript.solution-builder-with-watch-host)

(defn create-directory
  "**Parameters:**
   - `path`: `string`
   
   **Returns:** `void`"
  ^js [solution-builder-with-watch-host path]
  (.createDirectory ^js solution-builder-with-watch-host path))

(defn write-file
  "Should provide create directory and writeFile if done of invalidatedProjects is not invoked with
   writeFileCallback
   
   **Parameters:**
   - `path`: `string`
   - `data`: `string`
   - `write-byte-order-mark?`: `boolean | undefined`
   
   **Returns:** `void`"
  (^js [solution-builder-with-watch-host path data]
   (.writeFile ^js solution-builder-with-watch-host path data))
  (^js [solution-builder-with-watch-host path data write-byte-order-mark?]
   (.writeFile ^js solution-builder-with-watch-host path data write-byte-order-mark?)))

(defn custom-transformers
  ^js [solution-builder-with-watch-host]
  (.-getCustomTransformers ^js solution-builder-with-watch-host))

(defn set-get-custom-transformers!
  ^js [solution-builder-with-watch-host value]
  (set! (.-getCustomTransformers ^js solution-builder-with-watch-host) value))

(defn modified-time
  "**Parameters:**
   - `file-name`: `string`
   
   **Returns:** `Date | undefined`"
  ^js [solution-builder-with-watch-host file-name]
  (.getModifiedTime ^js solution-builder-with-watch-host file-name))

(defn set-modified-time
  "**Parameters:**
   - `file-name`: `string`
   - `date`: `Date`
   
   **Returns:** `void`"
  ^js [solution-builder-with-watch-host file-name date]
  (.setModifiedTime ^js solution-builder-with-watch-host file-name date))

(defn delete-file
  "**Parameters:**
   - `file-name`: `string`
   
   **Returns:** `void`"
  ^js [solution-builder-with-watch-host file-name]
  (.deleteFile ^js solution-builder-with-watch-host file-name))

(defn parsed-command-line
  "**Parameters:**
   - `file-name`: `string`
   
   **Returns:** `ParsedCommandLine | undefined`"
  ^js [solution-builder-with-watch-host file-name]
  (.getParsedCommandLine ^js solution-builder-with-watch-host file-name))

(defn report-diagnostic
  ^js [solution-builder-with-watch-host]
  (.-reportDiagnostic ^js solution-builder-with-watch-host))

(defn set-report-diagnostic!
  ^js [solution-builder-with-watch-host value]
  (set! (.-reportDiagnostic ^js solution-builder-with-watch-host) value))

(defn report-solution-builder-status
  ^js [solution-builder-with-watch-host]
  (.-reportSolutionBuilderStatus ^js solution-builder-with-watch-host))

(defn set-report-solution-builder-status!
  ^js [solution-builder-with-watch-host value]
  (set! (.-reportSolutionBuilderStatus ^js solution-builder-with-watch-host) value))

(defn after-program-emit-and-diagnostics
  "**Parameters:**
   - `program`: `T`
   
   **Returns:** `void`"
  ^js [solution-builder-with-watch-host program]
  (.afterProgramEmitAndDiagnostics ^js solution-builder-with-watch-host program))

(defn create-program
  "Used to create the program when need for program creation or recreation detected"
  ^js [solution-builder-with-watch-host]
  (.-createProgram ^js solution-builder-with-watch-host))

(defn set-create-program!
  "Used to create the program when need for program creation or recreation detected"
  ^js [solution-builder-with-watch-host value]
  (set! (.-createProgram ^js solution-builder-with-watch-host) value))

(defn use-case-sensitive-file-names?
  "**Returns:** `boolean`"
  ^js [solution-builder-with-watch-host]
  (.useCaseSensitiveFileNames ^js solution-builder-with-watch-host))

(defn new-line
  "**Returns:** `string`"
  ^js [solution-builder-with-watch-host]
  (.getNewLine ^js solution-builder-with-watch-host))

(defn current-directory
  "**Returns:** `string`"
  ^js [solution-builder-with-watch-host]
  (.getCurrentDirectory ^js solution-builder-with-watch-host))

(defn default-lib-file-name
  "**Parameters:**
   - `options`: `CompilerOptions`
   
   **Returns:** `string`"
  ^js [solution-builder-with-watch-host options]
  (.getDefaultLibFileName ^js solution-builder-with-watch-host options))

(defn default-lib-location
  "**Returns:** `string`"
  ^js [solution-builder-with-watch-host]
  (.getDefaultLibLocation ^js solution-builder-with-watch-host))

(defn create-hash
  "**Parameters:**
   - `data`: `string`
   
   **Returns:** `string`"
  ^js [solution-builder-with-watch-host data]
  (.createHash ^js solution-builder-with-watch-host data))

(defn file-exists?
  "Use to check file presence for source files and
   if resolveModuleNames is not provided (complier is in charge of module resolution) then module files as well
   
   **Parameters:**
   - `path`: `string`
   
   **Returns:** `boolean`"
  ^js [solution-builder-with-watch-host path]
  (.fileExists ^js solution-builder-with-watch-host path))

(defn read-file
  "Use to read file text for source files and
   if resolveModuleNames is not provided (complier is in charge of module resolution) then module files as well
   
   **Parameters:**
   - `path`: `string`
   - `encoding`: `string | undefined`
   
   **Returns:** `string | undefined`"
  (^js [solution-builder-with-watch-host path]
   (.readFile ^js solution-builder-with-watch-host path))
  (^js [solution-builder-with-watch-host path encoding]
   (.readFile ^js solution-builder-with-watch-host path encoding)))

(defn directory-exists?
  "If provided, used for module resolution as well as to handle directory structure
   
   **Parameters:**
   - `path`: `string`
   
   **Returns:** `boolean`"
  ^js [solution-builder-with-watch-host path]
  (.directoryExists ^js solution-builder-with-watch-host path))

(defn directories
  "If provided, used in resolutions as well as handling directory structure
   
   **Parameters:**
   - `path`: `string`
   
   **Returns:** `string[]`"
  ^js [solution-builder-with-watch-host path]
  (.getDirectories ^js solution-builder-with-watch-host path))

(defn read-directory
  "If provided, used to cache and handle directory structure modifications
   
   **Parameters:**
   - `path`: `string`
   - `extensions`: `readonly string[] | undefined`
   - `exclude`: `readonly string[] | undefined`
   - `include`: `readonly string[] | undefined`
   - `depth`: `number | undefined`
   
   **Returns:** `string[]`"
  (^js [solution-builder-with-watch-host path]
   (.readDirectory ^js solution-builder-with-watch-host path))
  (^js [solution-builder-with-watch-host path extensions]
   (.readDirectory ^js solution-builder-with-watch-host path extensions))
  (^js [solution-builder-with-watch-host path extensions exclude]
   (.readDirectory ^js solution-builder-with-watch-host path extensions exclude))
  (^js [solution-builder-with-watch-host path extensions exclude include]
   (.readDirectory ^js solution-builder-with-watch-host path extensions exclude include))
  (^js [solution-builder-with-watch-host path extensions exclude include depth]
   (.readDirectory ^js solution-builder-with-watch-host path extensions exclude include depth)))

(defn realpath
  "Symbol links resolution
   
   **Parameters:**
   - `path`: `string`
   
   **Returns:** `string`"
  ^js [solution-builder-with-watch-host path]
  (.realpath ^js solution-builder-with-watch-host path))

(defn trace
  "If provided would be used to write log about compilation
   
   **Parameters:**
   - `s`: `string`
   
   **Returns:** `void`"
  ^js [solution-builder-with-watch-host s]
  (.trace ^js solution-builder-with-watch-host s))

(defn environment-variable
  "If provided is used to get the environment variable
   
   **Parameters:**
   - `name`: `string`
   
   **Returns:** `string | undefined`"
  ^js [solution-builder-with-watch-host name]
  (.getEnvironmentVariable ^js solution-builder-with-watch-host name))

(defn resolve-module-names
  "**Parameters:**
   - `module-names`: `string[]`
   - `containing-file`: `string`
   - `reused-names`: `string[] | undefined`
   - `redirected-reference`: `ResolvedProjectReference | undefined`
   - `options`: `CompilerOptions`
   - `containing-source-file`: `SourceFile | undefined`
   
   **Returns:** `(ResolvedModule | undefined)[]`"
  (^js [solution-builder-with-watch-host module-names containing-file]
   (.resolveModuleNames ^js solution-builder-with-watch-host module-names containing-file))
  (^js [solution-builder-with-watch-host module-names containing-file reused-names]
   (.resolveModuleNames ^js solution-builder-with-watch-host module-names containing-file reused-names))
  (^js [solution-builder-with-watch-host module-names containing-file reused-names redirected-reference]
   (.resolveModuleNames ^js solution-builder-with-watch-host module-names containing-file reused-names redirected-reference))
  (^js [solution-builder-with-watch-host module-names containing-file reused-names redirected-reference options]
   (.resolveModuleNames ^js solution-builder-with-watch-host module-names containing-file reused-names redirected-reference options))
  (^js [solution-builder-with-watch-host module-names containing-file reused-names redirected-reference options containing-source-file]
   (.resolveModuleNames ^js solution-builder-with-watch-host module-names containing-file reused-names redirected-reference options containing-source-file)))

(defn resolve-type-reference-directives
  "**Parameters:**
   - `type-reference-directive-names`: `string[] | readonly FileReference[]`
   - `containing-file`: `string`
   - `redirected-reference`: `ResolvedProjectReference | undefined`
   - `options`: `CompilerOptions`
   - `containing-file-mode`: `ResolutionMode`
   
   **Returns:** `(ResolvedTypeReferenceDirective | undefined)[]`"
  (^js [solution-builder-with-watch-host type-reference-directive-names containing-file]
   (.resolveTypeReferenceDirectives ^js solution-builder-with-watch-host type-reference-directive-names containing-file))
  (^js [solution-builder-with-watch-host type-reference-directive-names containing-file redirected-reference]
   (.resolveTypeReferenceDirectives ^js solution-builder-with-watch-host type-reference-directive-names containing-file redirected-reference))
  (^js [solution-builder-with-watch-host type-reference-directive-names containing-file redirected-reference options]
   (.resolveTypeReferenceDirectives ^js solution-builder-with-watch-host type-reference-directive-names containing-file redirected-reference options))
  (^js [solution-builder-with-watch-host type-reference-directive-names containing-file redirected-reference options containing-file-mode]
   (.resolveTypeReferenceDirectives ^js solution-builder-with-watch-host type-reference-directive-names containing-file redirected-reference options containing-file-mode)))

(defn resolve-module-name-literals
  "**Parameters:**
   - `module-literals`: `readonly StringLiteralLike[]`
   - `containing-file`: `string`
   - `redirected-reference`: `ResolvedProjectReference | undefined`
   - `options`: `CompilerOptions`
   - `containing-source-file`: `SourceFile`
   - `reused-names`: `readonly StringLiteralLike[] | undefined`
   
   **Returns:** `readonly ResolvedModuleWithFailedLookupLocations[]`"
  (^js [solution-builder-with-watch-host module-literals containing-file]
   (.resolveModuleNameLiterals ^js solution-builder-with-watch-host module-literals containing-file))
  (^js [solution-builder-with-watch-host module-literals containing-file redirected-reference]
   (.resolveModuleNameLiterals ^js solution-builder-with-watch-host module-literals containing-file redirected-reference))
  (^js [solution-builder-with-watch-host module-literals containing-file redirected-reference options]
   (.resolveModuleNameLiterals ^js solution-builder-with-watch-host module-literals containing-file redirected-reference options))
  (^js [solution-builder-with-watch-host module-literals containing-file redirected-reference options containing-source-file]
   (.resolveModuleNameLiterals ^js solution-builder-with-watch-host module-literals containing-file redirected-reference options containing-source-file))
  (^js [solution-builder-with-watch-host module-literals containing-file redirected-reference options containing-source-file reused-names]
   (.resolveModuleNameLiterals ^js solution-builder-with-watch-host module-literals containing-file redirected-reference options containing-source-file reused-names)))

(defn resolve-type-reference-directive-references
  "**Parameters:**
   - `type-directive-references`: `readonly T[]`
   - `containing-file`: `string`
   - `redirected-reference`: `ResolvedProjectReference | undefined`
   - `options`: `CompilerOptions`
   - `containing-source-file`: `SourceFile | undefined`
   - `reused-names`: `readonly T[] | undefined`
   
   **Returns:** `readonly ResolvedTypeReferenceDirectiveWithFailedLookupLocations[]`"
  (^js [solution-builder-with-watch-host type-directive-references containing-file]
   (.resolveTypeReferenceDirectiveReferences ^js solution-builder-with-watch-host type-directive-references containing-file))
  (^js [solution-builder-with-watch-host type-directive-references containing-file redirected-reference]
   (.resolveTypeReferenceDirectiveReferences ^js solution-builder-with-watch-host type-directive-references containing-file redirected-reference))
  (^js [solution-builder-with-watch-host type-directive-references containing-file redirected-reference options]
   (.resolveTypeReferenceDirectiveReferences ^js solution-builder-with-watch-host type-directive-references containing-file redirected-reference options))
  (^js [solution-builder-with-watch-host type-directive-references containing-file redirected-reference options containing-source-file]
   (.resolveTypeReferenceDirectiveReferences ^js solution-builder-with-watch-host type-directive-references containing-file redirected-reference options containing-source-file))
  (^js [solution-builder-with-watch-host type-directive-references containing-file redirected-reference options containing-source-file reused-names]
   (.resolveTypeReferenceDirectiveReferences ^js solution-builder-with-watch-host type-directive-references containing-file redirected-reference options containing-source-file reused-names)))

(defn has-invalidated-resolutions?
  "If provided along with custom resolveModuleNames or resolveTypeReferenceDirectives, used to determine if unchanged file path needs to re-resolve modules/type reference directives
   
   **Parameters:**
   - `file-path`: `Path`
   
   **Returns:** `boolean`"
  ^js [solution-builder-with-watch-host file-path]
  (.hasInvalidatedResolutions ^js solution-builder-with-watch-host file-path))

(defn module-resolution-cache
  "Returns the module resolution cache used by a provided `resolveModuleNames` implementation so that any non-name module resolution operations (eg, package.json lookup) can reuse it
   
   **Returns:** `ModuleResolutionCache | undefined`"
  ^js [solution-builder-with-watch-host]
  (.getModuleResolutionCache ^js solution-builder-with-watch-host))

(defn js-doc-parsing-mode
  ^js [solution-builder-with-watch-host]
  (.-jsDocParsingMode ^js solution-builder-with-watch-host))

(defn set-js-doc-parsing-mode!
  ^js [solution-builder-with-watch-host value]
  (set! (.-jsDocParsingMode ^js solution-builder-with-watch-host) value))

(defn on-watch-status-change
  "If provided, called with Diagnostic message that informs about change in watch status
   
   **Parameters:**
   - `diagnostic`: `Diagnostic`
   - `new-line`: `string`
   - `options`: `CompilerOptions`
   - `error-count`: `number | undefined`
   
   **Returns:** `void`"
  (^js [solution-builder-with-watch-host diagnostic new-line options]
   (.onWatchStatusChange ^js solution-builder-with-watch-host diagnostic new-line options))
  (^js [solution-builder-with-watch-host diagnostic new-line options error-count]
   (.onWatchStatusChange ^js solution-builder-with-watch-host diagnostic new-line options error-count)))

(defn watch-file
  "Used to watch changes in source files, missing files needed to update the program or config file
   
   **Parameters:**
   - `path`: `string`
   - `callback`: `FileWatcherCallback`
   - `polling-interval`: `number | undefined`
   - `options`: `WatchOptions | undefined`
   
   **Returns:** `FileWatcher`"
  (^js [solution-builder-with-watch-host path callback]
   (.watchFile ^js solution-builder-with-watch-host path callback))
  (^js [solution-builder-with-watch-host path callback polling-interval]
   (.watchFile ^js solution-builder-with-watch-host path callback polling-interval))
  (^js [solution-builder-with-watch-host path callback polling-interval options]
   (.watchFile ^js solution-builder-with-watch-host path callback polling-interval options)))

(defn watch-directory
  "Used to watch resolved module's failed lookup locations, config file specs, type roots where auto type reference directives are added
   
   **Parameters:**
   - `path`: `string`
   - `callback`: `DirectoryWatcherCallback`
   - `recursive?`: `boolean | undefined`
   - `options`: `WatchOptions | undefined`
   
   **Returns:** `FileWatcher`"
  (^js [solution-builder-with-watch-host path callback]
   (.watchDirectory ^js solution-builder-with-watch-host path callback))
  (^js [solution-builder-with-watch-host path callback recursive?]
   (.watchDirectory ^js solution-builder-with-watch-host path callback recursive?))
  (^js [solution-builder-with-watch-host path callback recursive? options]
   (.watchDirectory ^js solution-builder-with-watch-host path callback recursive? options)))

(defn set-timeout
  "If provided, will be used to set delayed compilation, so that multiple changes in short span are compiled together
   
   **Parameters:**
   - `callback`: `(...args: any[]) => void`
   - `ms`: `number`
   - `args`: `any[]`
   
   **Returns:** `any`"
  ^js [solution-builder-with-watch-host callback ms & args]
  (.. ^js solution-builder-with-watch-host -setTimeout (apply ^js solution-builder-with-watch-host (to-array (list* callback ms args)))))

(defn clear-timeout
  "If provided, will be used to reset existing delayed compilation
   
   **Parameters:**
   - `timeout-id`: `any`
   
   **Returns:** `void`"
  ^js [solution-builder-with-watch-host timeout-id]
  (.clearTimeout ^js solution-builder-with-watch-host timeout-id))
