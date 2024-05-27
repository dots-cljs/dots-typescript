(ns dots.typescript.solution-builder-host-base)

(defn create-directory
  "**Parameters:**
   - `path`: `string`
   
   **Returns:** `void`"
  ^js [solution-builder-host-base path]
  (.createDirectory ^js solution-builder-host-base path))

(defn write-file
  "Should provide create directory and writeFile if done of invalidatedProjects is not invoked with
   writeFileCallback
   
   **Parameters:**
   - `path`: `string`
   - `data`: `string`
   - `write-byte-order-mark?`: `boolean | undefined`
   
   **Returns:** `void`"
  (^js [solution-builder-host-base path data]
   (.writeFile ^js solution-builder-host-base path data))
  (^js [solution-builder-host-base path data write-byte-order-mark?]
   (.writeFile ^js solution-builder-host-base path data write-byte-order-mark?)))

(defn custom-transformers
  "**Returns:** `((project: string) => CustomTransformers | undefined) | undefined`"
  ^js [solution-builder-host-base]
  (.-getCustomTransformers ^js solution-builder-host-base))

(defn set-get-custom-transformers!
  ^js [solution-builder-host-base value]
  (set! (.-getCustomTransformers ^js solution-builder-host-base) value))

(defn modified-time
  "**Parameters:**
   - `file-name`: `string`
   
   **Returns:** `Date | undefined`"
  ^js [solution-builder-host-base file-name]
  (.getModifiedTime ^js solution-builder-host-base file-name))

(defn set-modified-time
  "**Parameters:**
   - `file-name`: `string`
   - `date`: `Date`
   
   **Returns:** `void`"
  ^js [solution-builder-host-base file-name date]
  (.setModifiedTime ^js solution-builder-host-base file-name date))

(defn delete-file
  "**Parameters:**
   - `file-name`: `string`
   
   **Returns:** `void`"
  ^js [solution-builder-host-base file-name]
  (.deleteFile ^js solution-builder-host-base file-name))

(defn parsed-command-line
  "**Parameters:**
   - `file-name`: `string`
   
   **Returns:** `ParsedCommandLine | undefined`"
  ^js [solution-builder-host-base file-name]
  (.getParsedCommandLine ^js solution-builder-host-base file-name))

(defn report-diagnostic
  "**Returns:** `DiagnosticReporter`"
  ^js [solution-builder-host-base]
  (.-reportDiagnostic ^js solution-builder-host-base))

(defn set-report-diagnostic!
  ^js [solution-builder-host-base value]
  (set! (.-reportDiagnostic ^js solution-builder-host-base) value))

(defn report-solution-builder-status
  "**Returns:** `DiagnosticReporter`"
  ^js [solution-builder-host-base]
  (.-reportSolutionBuilderStatus ^js solution-builder-host-base))

(defn set-report-solution-builder-status!
  ^js [solution-builder-host-base value]
  (set! (.-reportSolutionBuilderStatus ^js solution-builder-host-base) value))

(defn after-program-emit-and-diagnostics
  "**Parameters:**
   - `program`: `T`
   
   **Returns:** `void`"
  ^js [solution-builder-host-base program]
  (.afterProgramEmitAndDiagnostics ^js solution-builder-host-base program))

(defn create-program
  "Used to create the program when need for program creation or recreation detected
   
   **Returns:** `CreateProgram<T>`"
  ^js [solution-builder-host-base]
  (.-createProgram ^js solution-builder-host-base))

(defn set-create-program!
  "Used to create the program when need for program creation or recreation detected"
  ^js [solution-builder-host-base value]
  (set! (.-createProgram ^js solution-builder-host-base) value))

(defn use-case-sensitive-file-names?
  "**Returns:** `boolean`"
  ^js [solution-builder-host-base]
  (.useCaseSensitiveFileNames ^js solution-builder-host-base))

(defn new-line
  "**Returns:** `string`"
  ^js [solution-builder-host-base]
  (.getNewLine ^js solution-builder-host-base))

(defn current-directory
  "**Returns:** `string`"
  ^js [solution-builder-host-base]
  (.getCurrentDirectory ^js solution-builder-host-base))

(defn default-lib-file-name
  "**Parameters:**
   - `options`: `CompilerOptions`
   
   **Returns:** `string`"
  ^js [solution-builder-host-base options]
  (.getDefaultLibFileName ^js solution-builder-host-base options))

(defn default-lib-location
  "**Returns:** `string`"
  ^js [solution-builder-host-base]
  (.getDefaultLibLocation ^js solution-builder-host-base))

(defn create-hash
  "**Parameters:**
   - `data`: `string`
   
   **Returns:** `string`"
  ^js [solution-builder-host-base data]
  (.createHash ^js solution-builder-host-base data))

(defn file-exists?
  "Use to check file presence for source files and
   if resolveModuleNames is not provided (complier is in charge of module resolution) then module files as well
   
   **Parameters:**
   - `path`: `string`
   
   **Returns:** `boolean`"
  ^js [solution-builder-host-base path]
  (.fileExists ^js solution-builder-host-base path))

(defn read-file
  "Use to read file text for source files and
   if resolveModuleNames is not provided (complier is in charge of module resolution) then module files as well
   
   **Parameters:**
   - `path`: `string`
   - `encoding`: `string | undefined`
   
   **Returns:** `string | undefined`"
  (^js [solution-builder-host-base path]
   (.readFile ^js solution-builder-host-base path))
  (^js [solution-builder-host-base path encoding]
   (.readFile ^js solution-builder-host-base path encoding)))

(defn directory-exists?
  "If provided, used for module resolution as well as to handle directory structure
   
   **Parameters:**
   - `path`: `string`
   
   **Returns:** `boolean`"
  ^js [solution-builder-host-base path]
  (.directoryExists ^js solution-builder-host-base path))

(defn directories
  "If provided, used in resolutions as well as handling directory structure
   
   **Parameters:**
   - `path`: `string`
   
   **Returns:** `string[]`"
  ^js [solution-builder-host-base path]
  (.getDirectories ^js solution-builder-host-base path))

(defn read-directory
  "If provided, used to cache and handle directory structure modifications
   
   **Parameters:**
   - `path`: `string`
   - `extensions`: `readonly string[] | undefined`
   - `exclude`: `readonly string[] | undefined`
   - `include`: `readonly string[] | undefined`
   - `depth`: `number | undefined`
   
   **Returns:** `string[]`"
  (^js [solution-builder-host-base path]
   (.readDirectory ^js solution-builder-host-base path))
  (^js [solution-builder-host-base path extensions]
   (.readDirectory ^js solution-builder-host-base path extensions))
  (^js [solution-builder-host-base path extensions exclude]
   (.readDirectory ^js solution-builder-host-base path extensions exclude))
  (^js [solution-builder-host-base path extensions exclude include]
   (.readDirectory ^js solution-builder-host-base path extensions exclude include))
  (^js [solution-builder-host-base path extensions exclude include depth]
   (.readDirectory ^js solution-builder-host-base path extensions exclude include depth)))

(defn realpath
  "Symbol links resolution
   
   **Parameters:**
   - `path`: `string`
   
   **Returns:** `string`"
  ^js [solution-builder-host-base path]
  (.realpath ^js solution-builder-host-base path))

(defn trace
  "If provided would be used to write log about compilation
   
   **Parameters:**
   - `s`: `string`
   
   **Returns:** `void`"
  ^js [solution-builder-host-base s]
  (.trace ^js solution-builder-host-base s))

(defn environment-variable
  "If provided is used to get the environment variable
   
   **Parameters:**
   - `name`: `string`
   
   **Returns:** `string | undefined`"
  ^js [solution-builder-host-base name]
  (.getEnvironmentVariable ^js solution-builder-host-base name))

(defn resolve-module-names
  "**Parameters:**
   - `module-names`: `string[]`
   - `containing-file`: `string`
   - `reused-names`: `string[] | undefined`
   - `redirected-reference`: `ResolvedProjectReference | undefined`
   - `options`: `CompilerOptions`
   - `containing-source-file`: `SourceFile | undefined`
   
   **Returns:** `(ResolvedModule | undefined)[]`"
  (^js [solution-builder-host-base module-names containing-file]
   (.resolveModuleNames ^js solution-builder-host-base module-names containing-file))
  (^js [solution-builder-host-base module-names containing-file reused-names]
   (.resolveModuleNames ^js solution-builder-host-base module-names containing-file reused-names))
  (^js [solution-builder-host-base module-names containing-file reused-names redirected-reference]
   (.resolveModuleNames ^js solution-builder-host-base module-names containing-file reused-names redirected-reference))
  (^js [solution-builder-host-base module-names containing-file reused-names redirected-reference options]
   (.resolveModuleNames ^js solution-builder-host-base module-names containing-file reused-names redirected-reference options))
  (^js [solution-builder-host-base module-names containing-file reused-names redirected-reference options containing-source-file]
   (.resolveModuleNames ^js solution-builder-host-base module-names containing-file reused-names redirected-reference options containing-source-file)))

(defn resolve-type-reference-directives
  "**Parameters:**
   - `type-reference-directive-names`: `string[] | readonly FileReference[]`
   - `containing-file`: `string`
   - `redirected-reference`: `ResolvedProjectReference | undefined`
   - `options`: `CompilerOptions`
   - `containing-file-mode`: `ResolutionMode`
   
   **Returns:** `(ResolvedTypeReferenceDirective | undefined)[]`"
  (^js [solution-builder-host-base type-reference-directive-names containing-file]
   (.resolveTypeReferenceDirectives ^js solution-builder-host-base type-reference-directive-names containing-file))
  (^js [solution-builder-host-base type-reference-directive-names containing-file redirected-reference]
   (.resolveTypeReferenceDirectives ^js solution-builder-host-base type-reference-directive-names containing-file redirected-reference))
  (^js [solution-builder-host-base type-reference-directive-names containing-file redirected-reference options]
   (.resolveTypeReferenceDirectives ^js solution-builder-host-base type-reference-directive-names containing-file redirected-reference options))
  (^js [solution-builder-host-base type-reference-directive-names containing-file redirected-reference options containing-file-mode]
   (.resolveTypeReferenceDirectives ^js solution-builder-host-base type-reference-directive-names containing-file redirected-reference options containing-file-mode)))

(defn resolve-module-name-literals
  "**Parameters:**
   - `module-literals`: `readonly StringLiteralLike[]`
   - `containing-file`: `string`
   - `redirected-reference`: `ResolvedProjectReference | undefined`
   - `options`: `CompilerOptions`
   - `containing-source-file`: `SourceFile`
   - `reused-names`: `readonly StringLiteralLike[] | undefined`
   
   **Returns:** `readonly ResolvedModuleWithFailedLookupLocations[]`"
  (^js [solution-builder-host-base module-literals containing-file]
   (.resolveModuleNameLiterals ^js solution-builder-host-base module-literals containing-file))
  (^js [solution-builder-host-base module-literals containing-file redirected-reference]
   (.resolveModuleNameLiterals ^js solution-builder-host-base module-literals containing-file redirected-reference))
  (^js [solution-builder-host-base module-literals containing-file redirected-reference options]
   (.resolveModuleNameLiterals ^js solution-builder-host-base module-literals containing-file redirected-reference options))
  (^js [solution-builder-host-base module-literals containing-file redirected-reference options containing-source-file]
   (.resolveModuleNameLiterals ^js solution-builder-host-base module-literals containing-file redirected-reference options containing-source-file))
  (^js [solution-builder-host-base module-literals containing-file redirected-reference options containing-source-file reused-names]
   (.resolveModuleNameLiterals ^js solution-builder-host-base module-literals containing-file redirected-reference options containing-source-file reused-names)))

(defn resolve-type-reference-directive-references
  "**Parameters:**
   - `type-directive-references`: `readonly T[]`
   - `containing-file`: `string`
   - `redirected-reference`: `ResolvedProjectReference | undefined`
   - `options`: `CompilerOptions`
   - `containing-source-file`: `SourceFile | undefined`
   - `reused-names`: `readonly T[] | undefined`
   
   **Returns:** `readonly ResolvedTypeReferenceDirectiveWithFailedLookupLocations[]`"
  (^js [solution-builder-host-base type-directive-references containing-file]
   (.resolveTypeReferenceDirectiveReferences ^js solution-builder-host-base type-directive-references containing-file))
  (^js [solution-builder-host-base type-directive-references containing-file redirected-reference]
   (.resolveTypeReferenceDirectiveReferences ^js solution-builder-host-base type-directive-references containing-file redirected-reference))
  (^js [solution-builder-host-base type-directive-references containing-file redirected-reference options]
   (.resolveTypeReferenceDirectiveReferences ^js solution-builder-host-base type-directive-references containing-file redirected-reference options))
  (^js [solution-builder-host-base type-directive-references containing-file redirected-reference options containing-source-file]
   (.resolveTypeReferenceDirectiveReferences ^js solution-builder-host-base type-directive-references containing-file redirected-reference options containing-source-file))
  (^js [solution-builder-host-base type-directive-references containing-file redirected-reference options containing-source-file reused-names]
   (.resolveTypeReferenceDirectiveReferences ^js solution-builder-host-base type-directive-references containing-file redirected-reference options containing-source-file reused-names)))

(defn has-invalidated-resolutions?
  "If provided along with custom resolveModuleNames or resolveTypeReferenceDirectives, used to determine if unchanged file path needs to re-resolve modules/type reference directives
   
   **Parameters:**
   - `file-path`: `Path`
   
   **Returns:** `boolean`"
  ^js [solution-builder-host-base file-path]
  (.hasInvalidatedResolutions ^js solution-builder-host-base file-path))

(defn module-resolution-cache
  "Returns the module resolution cache used by a provided `resolveModuleNames` implementation so that any non-name module resolution operations (eg, package.json lookup) can reuse it
   
   **Returns:** `ModuleResolutionCache | undefined`"
  ^js [solution-builder-host-base]
  (.getModuleResolutionCache ^js solution-builder-host-base))

(defn js-doc-parsing-mode
  "**Returns:** `JSDocParsingMode | undefined`"
  ^js [solution-builder-host-base]
  (.-jsDocParsingMode ^js solution-builder-host-base))

(defn set-js-doc-parsing-mode!
  ^js [solution-builder-host-base value]
  (set! (.-jsDocParsingMode ^js solution-builder-host-base) value))
