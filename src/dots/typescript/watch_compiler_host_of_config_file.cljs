(ns dots.typescript.watch-compiler-host-of-config-file
  "Host to create watch with config file")

(defn config-file-name
  "Name of the config file to compile
   
   **Returns:** `string`"
  ^js [watch-compiler-host-of-config-file]
  (.-configFileName ^js watch-compiler-host-of-config-file))

(defn set-config-file-name!
  "Name of the config file to compile"
  ^js [watch-compiler-host-of-config-file value]
  (set! (.-configFileName ^js watch-compiler-host-of-config-file) value))

(defn options-to-extend
  "Options to extend
   
   **Returns:** `CompilerOptions | undefined`"
  ^js [watch-compiler-host-of-config-file]
  (.-optionsToExtend ^js watch-compiler-host-of-config-file))

(defn set-options-to-extend!
  "Options to extend"
  ^js [watch-compiler-host-of-config-file value]
  (set! (.-optionsToExtend ^js watch-compiler-host-of-config-file) value))

(defn watch-options-to-extend
  "**Returns:** `WatchOptions | undefined`"
  ^js [watch-compiler-host-of-config-file]
  (.-watchOptionsToExtend ^js watch-compiler-host-of-config-file))

(defn set-watch-options-to-extend!
  ^js [watch-compiler-host-of-config-file value]
  (set! (.-watchOptionsToExtend ^js watch-compiler-host-of-config-file) value))

(defn extra-file-extensions
  "**Returns:** `readonly FileExtensionInfo[] | undefined`"
  ^js [watch-compiler-host-of-config-file]
  (.-extraFileExtensions ^js watch-compiler-host-of-config-file))

(defn set-extra-file-extensions!
  ^js [watch-compiler-host-of-config-file value]
  (set! (.-extraFileExtensions ^js watch-compiler-host-of-config-file) value))

(defn read-directory
  "Used to generate source file names from the config file and its include, exclude, files rules
   and also to cache the directory stucture
   
   **Parameters:**
   - `path`: `string`
   - `extensions`: `readonly string[] | undefined`
   - `exclude`: `readonly string[] | undefined`
   - `include`: `readonly string[] | undefined`
   - `depth`: `number | undefined`
   
   **Returns:** `string[]`"
  (^js [watch-compiler-host-of-config-file path]
   (.readDirectory ^js watch-compiler-host-of-config-file path))
  (^js [watch-compiler-host-of-config-file path extensions]
   (.readDirectory ^js watch-compiler-host-of-config-file path extensions))
  (^js [watch-compiler-host-of-config-file path extensions exclude]
   (.readDirectory ^js watch-compiler-host-of-config-file path extensions exclude))
  (^js [watch-compiler-host-of-config-file path extensions exclude include]
   (.readDirectory ^js watch-compiler-host-of-config-file path extensions exclude include))
  (^js [watch-compiler-host-of-config-file path extensions exclude include depth]
   (.readDirectory ^js watch-compiler-host-of-config-file path extensions exclude include depth)))

(defn use-source-of-project-reference-redirect?
  "Instead of using output d.ts file from project reference, use its source file
   
   **Returns:** `boolean`"
  ^js [watch-compiler-host-of-config-file]
  (.useSourceOfProjectReferenceRedirect ^js watch-compiler-host-of-config-file))

(defn parsed-command-line
  "If provided, use this method to get parsed command lines for referenced projects
   
   **Parameters:**
   - `file-name`: `string`
   
   **Returns:** `ParsedCommandLine | undefined`"
  ^js [watch-compiler-host-of-config-file file-name]
  (.getParsedCommandLine ^js watch-compiler-host-of-config-file file-name))

(defn after-program-create
  "If provided, callback to invoke after every new program creation
   
   **Parameters:**
   - `program`: `T`
   
   **Returns:** `void`"
  ^js [watch-compiler-host-of-config-file program]
  (.afterProgramCreate ^js watch-compiler-host-of-config-file program))

(defn create-program
  "Used to create the program when need for program creation or recreation detected
   
   **Returns:** `CreateProgram<T>`"
  ^js [watch-compiler-host-of-config-file]
  (.-createProgram ^js watch-compiler-host-of-config-file))

(defn set-create-program!
  "Used to create the program when need for program creation or recreation detected"
  ^js [watch-compiler-host-of-config-file value]
  (set! (.-createProgram ^js watch-compiler-host-of-config-file) value))

(defn use-case-sensitive-file-names?
  "**Returns:** `boolean`"
  ^js [watch-compiler-host-of-config-file]
  (.useCaseSensitiveFileNames ^js watch-compiler-host-of-config-file))

(defn new-line
  "**Returns:** `string`"
  ^js [watch-compiler-host-of-config-file]
  (.getNewLine ^js watch-compiler-host-of-config-file))

(defn current-directory
  "**Returns:** `string`"
  ^js [watch-compiler-host-of-config-file]
  (.getCurrentDirectory ^js watch-compiler-host-of-config-file))

(defn default-lib-file-name
  "**Parameters:**
   - `options`: `CompilerOptions`
   
   **Returns:** `string`"
  ^js [watch-compiler-host-of-config-file options]
  (.getDefaultLibFileName ^js watch-compiler-host-of-config-file options))

(defn default-lib-location
  "**Returns:** `string`"
  ^js [watch-compiler-host-of-config-file]
  (.getDefaultLibLocation ^js watch-compiler-host-of-config-file))

(defn create-hash
  "**Parameters:**
   - `data`: `string`
   
   **Returns:** `string`"
  ^js [watch-compiler-host-of-config-file data]
  (.createHash ^js watch-compiler-host-of-config-file data))

(defn file-exists?
  "Use to check file presence for source files and
   if resolveModuleNames is not provided (complier is in charge of module resolution) then module files as well
   
   **Parameters:**
   - `path`: `string`
   
   **Returns:** `boolean`"
  ^js [watch-compiler-host-of-config-file path]
  (.fileExists ^js watch-compiler-host-of-config-file path))

(defn read-file
  "Use to read file text for source files and
   if resolveModuleNames is not provided (complier is in charge of module resolution) then module files as well
   
   **Parameters:**
   - `path`: `string`
   - `encoding`: `string | undefined`
   
   **Returns:** `string | undefined`"
  (^js [watch-compiler-host-of-config-file path]
   (.readFile ^js watch-compiler-host-of-config-file path))
  (^js [watch-compiler-host-of-config-file path encoding]
   (.readFile ^js watch-compiler-host-of-config-file path encoding)))

(defn directory-exists?
  "If provided, used for module resolution as well as to handle directory structure
   
   **Parameters:**
   - `path`: `string`
   
   **Returns:** `boolean`"
  ^js [watch-compiler-host-of-config-file path]
  (.directoryExists ^js watch-compiler-host-of-config-file path))

(defn directories
  "If provided, used in resolutions as well as handling directory structure
   
   **Parameters:**
   - `path`: `string`
   
   **Returns:** `string[]`"
  ^js [watch-compiler-host-of-config-file path]
  (.getDirectories ^js watch-compiler-host-of-config-file path))

(defn realpath
  "Symbol links resolution
   
   **Parameters:**
   - `path`: `string`
   
   **Returns:** `string`"
  ^js [watch-compiler-host-of-config-file path]
  (.realpath ^js watch-compiler-host-of-config-file path))

(defn trace
  "If provided would be used to write log about compilation
   
   **Parameters:**
   - `s`: `string`
   
   **Returns:** `void`"
  ^js [watch-compiler-host-of-config-file s]
  (.trace ^js watch-compiler-host-of-config-file s))

(defn environment-variable
  "If provided is used to get the environment variable
   
   **Parameters:**
   - `name`: `string`
   
   **Returns:** `string | undefined`"
  ^js [watch-compiler-host-of-config-file name]
  (.getEnvironmentVariable ^js watch-compiler-host-of-config-file name))

(defn resolve-module-names
  "**Parameters:**
   - `module-names`: `string[]`
   - `containing-file`: `string`
   - `reused-names`: `string[] | undefined`
   - `redirected-reference`: `ResolvedProjectReference | undefined`
   - `options`: `CompilerOptions`
   - `containing-source-file`: `SourceFile | undefined`
   
   **Returns:** `(ResolvedModule | undefined)[]`"
  (^js [watch-compiler-host-of-config-file module-names containing-file]
   (.resolveModuleNames ^js watch-compiler-host-of-config-file module-names containing-file))
  (^js [watch-compiler-host-of-config-file module-names containing-file reused-names]
   (.resolveModuleNames ^js watch-compiler-host-of-config-file module-names containing-file reused-names))
  (^js [watch-compiler-host-of-config-file module-names containing-file reused-names redirected-reference]
   (.resolveModuleNames ^js watch-compiler-host-of-config-file module-names containing-file reused-names redirected-reference))
  (^js [watch-compiler-host-of-config-file module-names containing-file reused-names redirected-reference options]
   (.resolveModuleNames ^js watch-compiler-host-of-config-file module-names containing-file reused-names redirected-reference options))
  (^js [watch-compiler-host-of-config-file module-names containing-file reused-names redirected-reference options containing-source-file]
   (.resolveModuleNames ^js watch-compiler-host-of-config-file module-names containing-file reused-names redirected-reference options containing-source-file)))

(defn resolve-type-reference-directives
  "**Parameters:**
   - `type-reference-directive-names`: `string[] | readonly FileReference[]`
   - `containing-file`: `string`
   - `redirected-reference`: `ResolvedProjectReference | undefined`
   - `options`: `CompilerOptions`
   - `containing-file-mode`: `ResolutionMode`
   
   **Returns:** `(ResolvedTypeReferenceDirective | undefined)[]`"
  (^js [watch-compiler-host-of-config-file type-reference-directive-names containing-file]
   (.resolveTypeReferenceDirectives ^js watch-compiler-host-of-config-file type-reference-directive-names containing-file))
  (^js [watch-compiler-host-of-config-file type-reference-directive-names containing-file redirected-reference]
   (.resolveTypeReferenceDirectives ^js watch-compiler-host-of-config-file type-reference-directive-names containing-file redirected-reference))
  (^js [watch-compiler-host-of-config-file type-reference-directive-names containing-file redirected-reference options]
   (.resolveTypeReferenceDirectives ^js watch-compiler-host-of-config-file type-reference-directive-names containing-file redirected-reference options))
  (^js [watch-compiler-host-of-config-file type-reference-directive-names containing-file redirected-reference options containing-file-mode]
   (.resolveTypeReferenceDirectives ^js watch-compiler-host-of-config-file type-reference-directive-names containing-file redirected-reference options containing-file-mode)))

(defn resolve-module-name-literals
  "**Parameters:**
   - `module-literals`: `readonly StringLiteralLike[]`
   - `containing-file`: `string`
   - `redirected-reference`: `ResolvedProjectReference | undefined`
   - `options`: `CompilerOptions`
   - `containing-source-file`: `SourceFile`
   - `reused-names`: `readonly StringLiteralLike[] | undefined`
   
   **Returns:** `readonly ResolvedModuleWithFailedLookupLocations[]`"
  (^js [watch-compiler-host-of-config-file module-literals containing-file]
   (.resolveModuleNameLiterals ^js watch-compiler-host-of-config-file module-literals containing-file))
  (^js [watch-compiler-host-of-config-file module-literals containing-file redirected-reference]
   (.resolveModuleNameLiterals ^js watch-compiler-host-of-config-file module-literals containing-file redirected-reference))
  (^js [watch-compiler-host-of-config-file module-literals containing-file redirected-reference options]
   (.resolveModuleNameLiterals ^js watch-compiler-host-of-config-file module-literals containing-file redirected-reference options))
  (^js [watch-compiler-host-of-config-file module-literals containing-file redirected-reference options containing-source-file]
   (.resolveModuleNameLiterals ^js watch-compiler-host-of-config-file module-literals containing-file redirected-reference options containing-source-file))
  (^js [watch-compiler-host-of-config-file module-literals containing-file redirected-reference options containing-source-file reused-names]
   (.resolveModuleNameLiterals ^js watch-compiler-host-of-config-file module-literals containing-file redirected-reference options containing-source-file reused-names)))

(defn resolve-type-reference-directive-references
  "**Parameters:**
   - `type-directive-references`: `readonly T[]`
   - `containing-file`: `string`
   - `redirected-reference`: `ResolvedProjectReference | undefined`
   - `options`: `CompilerOptions`
   - `containing-source-file`: `SourceFile | undefined`
   - `reused-names`: `readonly T[] | undefined`
   
   **Returns:** `readonly ResolvedTypeReferenceDirectiveWithFailedLookupLocations[]`"
  (^js [watch-compiler-host-of-config-file type-directive-references containing-file]
   (.resolveTypeReferenceDirectiveReferences ^js watch-compiler-host-of-config-file type-directive-references containing-file))
  (^js [watch-compiler-host-of-config-file type-directive-references containing-file redirected-reference]
   (.resolveTypeReferenceDirectiveReferences ^js watch-compiler-host-of-config-file type-directive-references containing-file redirected-reference))
  (^js [watch-compiler-host-of-config-file type-directive-references containing-file redirected-reference options]
   (.resolveTypeReferenceDirectiveReferences ^js watch-compiler-host-of-config-file type-directive-references containing-file redirected-reference options))
  (^js [watch-compiler-host-of-config-file type-directive-references containing-file redirected-reference options containing-source-file]
   (.resolveTypeReferenceDirectiveReferences ^js watch-compiler-host-of-config-file type-directive-references containing-file redirected-reference options containing-source-file))
  (^js [watch-compiler-host-of-config-file type-directive-references containing-file redirected-reference options containing-source-file reused-names]
   (.resolveTypeReferenceDirectiveReferences ^js watch-compiler-host-of-config-file type-directive-references containing-file redirected-reference options containing-source-file reused-names)))

(defn has-invalidated-resolutions?
  "If provided along with custom resolveModuleNames or resolveTypeReferenceDirectives, used to determine if unchanged file path needs to re-resolve modules/type reference directives
   
   **Parameters:**
   - `file-path`: `Path`
   
   **Returns:** `boolean`"
  ^js [watch-compiler-host-of-config-file file-path]
  (.hasInvalidatedResolutions ^js watch-compiler-host-of-config-file file-path))

(defn module-resolution-cache
  "Returns the module resolution cache used by a provided `resolveModuleNames` implementation so that any non-name module resolution operations (eg, package.json lookup) can reuse it
   
   **Returns:** `ModuleResolutionCache | undefined`"
  ^js [watch-compiler-host-of-config-file]
  (.getModuleResolutionCache ^js watch-compiler-host-of-config-file))

(defn js-doc-parsing-mode
  "**Returns:** `JSDocParsingMode | undefined`"
  ^js [watch-compiler-host-of-config-file]
  (.-jsDocParsingMode ^js watch-compiler-host-of-config-file))

(defn set-js-doc-parsing-mode!
  ^js [watch-compiler-host-of-config-file value]
  (set! (.-jsDocParsingMode ^js watch-compiler-host-of-config-file) value))

(defn on-watch-status-change
  "If provided, called with Diagnostic message that informs about change in watch status
   
   **Parameters:**
   - `diagnostic`: `Diagnostic`
   - `new-line`: `string`
   - `options`: `CompilerOptions`
   - `error-count`: `number | undefined`
   
   **Returns:** `void`"
  (^js [watch-compiler-host-of-config-file diagnostic new-line options]
   (.onWatchStatusChange ^js watch-compiler-host-of-config-file diagnostic new-line options))
  (^js [watch-compiler-host-of-config-file diagnostic new-line options error-count]
   (.onWatchStatusChange ^js watch-compiler-host-of-config-file diagnostic new-line options error-count)))

(defn watch-file
  "Used to watch changes in source files, missing files needed to update the program or config file
   
   **Parameters:**
   - `path`: `string`
   - `callback`: `FileWatcherCallback`
   - `polling-interval`: `number | undefined`
   - `options`: `WatchOptions | undefined`
   
   **Returns:** `FileWatcher`"
  (^js [watch-compiler-host-of-config-file path callback]
   (.watchFile ^js watch-compiler-host-of-config-file path callback))
  (^js [watch-compiler-host-of-config-file path callback polling-interval]
   (.watchFile ^js watch-compiler-host-of-config-file path callback polling-interval))
  (^js [watch-compiler-host-of-config-file path callback polling-interval options]
   (.watchFile ^js watch-compiler-host-of-config-file path callback polling-interval options)))

(defn watch-directory
  "Used to watch resolved module's failed lookup locations, config file specs, type roots where auto type reference directives are added
   
   **Parameters:**
   - `path`: `string`
   - `callback`: `DirectoryWatcherCallback`
   - `recursive?`: `boolean | undefined`
   - `options`: `WatchOptions | undefined`
   
   **Returns:** `FileWatcher`"
  (^js [watch-compiler-host-of-config-file path callback]
   (.watchDirectory ^js watch-compiler-host-of-config-file path callback))
  (^js [watch-compiler-host-of-config-file path callback recursive?]
   (.watchDirectory ^js watch-compiler-host-of-config-file path callback recursive?))
  (^js [watch-compiler-host-of-config-file path callback recursive? options]
   (.watchDirectory ^js watch-compiler-host-of-config-file path callback recursive? options)))

(defn set-timeout
  "If provided, will be used to set delayed compilation, so that multiple changes in short span are compiled together
   
   **Parameters:**
   - `callback`: `(...args: any[]) => void`
   - `ms`: `number`
   - `args`: `any[]`
   
   **Returns:** `any`"
  ^js [watch-compiler-host-of-config-file callback ms & args]
  (.. ^js watch-compiler-host-of-config-file -setTimeout (apply ^js watch-compiler-host-of-config-file (to-array (list* callback ms args)))))

(defn clear-timeout
  "If provided, will be used to reset existing delayed compilation
   
   **Parameters:**
   - `timeout-id`: `any`
   
   **Returns:** `void`"
  ^js [watch-compiler-host-of-config-file timeout-id]
  (.clearTimeout ^js watch-compiler-host-of-config-file timeout-id))

(defn on-un-recoverable-config-file-diagnostic
  "Reports unrecoverable error when parsing config file
   
   **Returns:** `DiagnosticReporter`"
  ^js [watch-compiler-host-of-config-file]
  (.-onUnRecoverableConfigFileDiagnostic ^js watch-compiler-host-of-config-file))

(defn set-on-un-recoverable-config-file-diagnostic!
  "Reports unrecoverable error when parsing config file"
  ^js [watch-compiler-host-of-config-file value]
  (set! (.-onUnRecoverableConfigFileDiagnostic ^js watch-compiler-host-of-config-file) value))
