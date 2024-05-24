(ns dots.typescript.solution-builder-host)

(defn report-error-summary
  ^js [solution-builder-host]
  (.-reportErrorSummary ^js solution-builder-host))

(defn set-report-error-summary!
  ^js [solution-builder-host value]
  (set! (.-reportErrorSummary ^js solution-builder-host) value))

(defn create-directory
  "**Parameters:**
   - `path`: `string`
   
   **Returns:** `void`"
  ^js [solution-builder-host path]
  (.createDirectory ^js solution-builder-host path))

(defn write-file
  "Should provide create directory and writeFile if done of invalidatedProjects is not invoked with
   writeFileCallback
   
   **Parameters:**
   - `path`: `string`
   - `data`: `string`
   - `write-byte-order-mark?`: `boolean | undefined`
   
   **Returns:** `void`"
  (^js [solution-builder-host path data]
   (.writeFile ^js solution-builder-host path data))
  (^js [solution-builder-host path data write-byte-order-mark?]
   (.writeFile ^js solution-builder-host path data write-byte-order-mark?)))

(defn custom-transformers
  ^js [solution-builder-host]
  (.-getCustomTransformers ^js solution-builder-host))

(defn set-get-custom-transformers!
  ^js [solution-builder-host value]
  (set! (.-getCustomTransformers ^js solution-builder-host) value))

(defn modified-time
  "**Parameters:**
   - `file-name`: `string`
   
   **Returns:** `Date | undefined`"
  ^js [solution-builder-host file-name]
  (.getModifiedTime ^js solution-builder-host file-name))

(defn set-modified-time
  "**Parameters:**
   - `file-name`: `string`
   - `date`: `Date`
   
   **Returns:** `void`"
  ^js [solution-builder-host file-name date]
  (.setModifiedTime ^js solution-builder-host file-name date))

(defn delete-file
  "**Parameters:**
   - `file-name`: `string`
   
   **Returns:** `void`"
  ^js [solution-builder-host file-name]
  (.deleteFile ^js solution-builder-host file-name))

(defn parsed-command-line
  "**Parameters:**
   - `file-name`: `string`
   
   **Returns:** `ParsedCommandLine | undefined`"
  ^js [solution-builder-host file-name]
  (.getParsedCommandLine ^js solution-builder-host file-name))

(defn report-diagnostic
  ^js [solution-builder-host]
  (.-reportDiagnostic ^js solution-builder-host))

(defn set-report-diagnostic!
  ^js [solution-builder-host value]
  (set! (.-reportDiagnostic ^js solution-builder-host) value))

(defn report-solution-builder-status
  ^js [solution-builder-host]
  (.-reportSolutionBuilderStatus ^js solution-builder-host))

(defn set-report-solution-builder-status!
  ^js [solution-builder-host value]
  (set! (.-reportSolutionBuilderStatus ^js solution-builder-host) value))

(defn after-program-emit-and-diagnostics
  "**Parameters:**
   - `program`: `T`
   
   **Returns:** `void`"
  ^js [solution-builder-host program]
  (.afterProgramEmitAndDiagnostics ^js solution-builder-host program))

(defn create-program
  "Used to create the program when need for program creation or recreation detected"
  ^js [solution-builder-host]
  (.-createProgram ^js solution-builder-host))

(defn set-create-program!
  "Used to create the program when need for program creation or recreation detected"
  ^js [solution-builder-host value]
  (set! (.-createProgram ^js solution-builder-host) value))

(defn use-case-sensitive-file-names?
  "**Returns:** `boolean`"
  ^js [solution-builder-host]
  (.useCaseSensitiveFileNames ^js solution-builder-host))

(defn new-line
  "**Returns:** `string`"
  ^js [solution-builder-host]
  (.getNewLine ^js solution-builder-host))

(defn current-directory
  "**Returns:** `string`"
  ^js [solution-builder-host]
  (.getCurrentDirectory ^js solution-builder-host))

(defn default-lib-file-name
  "**Parameters:**
   - `options`: `CompilerOptions`
   
   **Returns:** `string`"
  ^js [solution-builder-host options]
  (.getDefaultLibFileName ^js solution-builder-host options))

(defn default-lib-location
  "**Returns:** `string`"
  ^js [solution-builder-host]
  (.getDefaultLibLocation ^js solution-builder-host))

(defn create-hash
  "**Parameters:**
   - `data`: `string`
   
   **Returns:** `string`"
  ^js [solution-builder-host data]
  (.createHash ^js solution-builder-host data))

(defn file-exists?
  "Use to check file presence for source files and
   if resolveModuleNames is not provided (complier is in charge of module resolution) then module files as well
   
   **Parameters:**
   - `path`: `string`
   
   **Returns:** `boolean`"
  ^js [solution-builder-host path]
  (.fileExists ^js solution-builder-host path))

(defn read-file
  "Use to read file text for source files and
   if resolveModuleNames is not provided (complier is in charge of module resolution) then module files as well
   
   **Parameters:**
   - `path`: `string`
   - `encoding`: `string | undefined`
   
   **Returns:** `string | undefined`"
  (^js [solution-builder-host path]
   (.readFile ^js solution-builder-host path))
  (^js [solution-builder-host path encoding]
   (.readFile ^js solution-builder-host path encoding)))

(defn directory-exists?
  "If provided, used for module resolution as well as to handle directory structure
   
   **Parameters:**
   - `path`: `string`
   
   **Returns:** `boolean`"
  ^js [solution-builder-host path]
  (.directoryExists ^js solution-builder-host path))

(defn directories
  "If provided, used in resolutions as well as handling directory structure
   
   **Parameters:**
   - `path`: `string`
   
   **Returns:** `string[]`"
  ^js [solution-builder-host path]
  (.getDirectories ^js solution-builder-host path))

(defn read-directory
  "If provided, used to cache and handle directory structure modifications
   
   **Parameters:**
   - `path`: `string`
   - `extensions`: `readonly string[] | undefined`
   - `exclude`: `readonly string[] | undefined`
   - `include`: `readonly string[] | undefined`
   - `depth`: `number | undefined`
   
   **Returns:** `string[]`"
  (^js [solution-builder-host path]
   (.readDirectory ^js solution-builder-host path))
  (^js [solution-builder-host path extensions]
   (.readDirectory ^js solution-builder-host path extensions))
  (^js [solution-builder-host path extensions exclude]
   (.readDirectory ^js solution-builder-host path extensions exclude))
  (^js [solution-builder-host path extensions exclude include]
   (.readDirectory ^js solution-builder-host path extensions exclude include))
  (^js [solution-builder-host path extensions exclude include depth]
   (.readDirectory ^js solution-builder-host path extensions exclude include depth)))

(defn realpath
  "Symbol links resolution
   
   **Parameters:**
   - `path`: `string`
   
   **Returns:** `string`"
  ^js [solution-builder-host path]
  (.realpath ^js solution-builder-host path))

(defn trace
  "If provided would be used to write log about compilation
   
   **Parameters:**
   - `s`: `string`
   
   **Returns:** `void`"
  ^js [solution-builder-host s]
  (.trace ^js solution-builder-host s))

(defn environment-variable
  "If provided is used to get the environment variable
   
   **Parameters:**
   - `name`: `string`
   
   **Returns:** `string | undefined`"
  ^js [solution-builder-host name]
  (.getEnvironmentVariable ^js solution-builder-host name))

(defn resolve-module-names
  "**Parameters:**
   - `module-names`: `string[]`
   - `containing-file`: `string`
   - `reused-names`: `string[] | undefined`
   - `redirected-reference`: `ResolvedProjectReference | undefined`
   - `options`: `CompilerOptions`
   - `containing-source-file`: `SourceFile | undefined`
   
   **Returns:** `(ResolvedModule | undefined)[]`"
  (^js [solution-builder-host module-names containing-file]
   (.resolveModuleNames ^js solution-builder-host module-names containing-file))
  (^js [solution-builder-host module-names containing-file reused-names]
   (.resolveModuleNames ^js solution-builder-host module-names containing-file reused-names))
  (^js [solution-builder-host module-names containing-file reused-names redirected-reference]
   (.resolveModuleNames ^js solution-builder-host module-names containing-file reused-names redirected-reference))
  (^js [solution-builder-host module-names containing-file reused-names redirected-reference options]
   (.resolveModuleNames ^js solution-builder-host module-names containing-file reused-names redirected-reference options))
  (^js [solution-builder-host module-names containing-file reused-names redirected-reference options containing-source-file]
   (.resolveModuleNames ^js solution-builder-host module-names containing-file reused-names redirected-reference options containing-source-file)))

(defn resolve-type-reference-directives
  "**Parameters:**
   - `type-reference-directive-names`: `string[] | readonly FileReference[]`
   - `containing-file`: `string`
   - `redirected-reference`: `ResolvedProjectReference | undefined`
   - `options`: `CompilerOptions`
   - `containing-file-mode`: `ResolutionMode`
   
   **Returns:** `(ResolvedTypeReferenceDirective | undefined)[]`"
  (^js [solution-builder-host type-reference-directive-names containing-file]
   (.resolveTypeReferenceDirectives ^js solution-builder-host type-reference-directive-names containing-file))
  (^js [solution-builder-host type-reference-directive-names containing-file redirected-reference]
   (.resolveTypeReferenceDirectives ^js solution-builder-host type-reference-directive-names containing-file redirected-reference))
  (^js [solution-builder-host type-reference-directive-names containing-file redirected-reference options]
   (.resolveTypeReferenceDirectives ^js solution-builder-host type-reference-directive-names containing-file redirected-reference options))
  (^js [solution-builder-host type-reference-directive-names containing-file redirected-reference options containing-file-mode]
   (.resolveTypeReferenceDirectives ^js solution-builder-host type-reference-directive-names containing-file redirected-reference options containing-file-mode)))

(defn resolve-module-name-literals
  "**Parameters:**
   - `module-literals`: `readonly StringLiteralLike[]`
   - `containing-file`: `string`
   - `redirected-reference`: `ResolvedProjectReference | undefined`
   - `options`: `CompilerOptions`
   - `containing-source-file`: `SourceFile`
   - `reused-names`: `readonly StringLiteralLike[] | undefined`
   
   **Returns:** `readonly ResolvedModuleWithFailedLookupLocations[]`"
  (^js [solution-builder-host module-literals containing-file]
   (.resolveModuleNameLiterals ^js solution-builder-host module-literals containing-file))
  (^js [solution-builder-host module-literals containing-file redirected-reference]
   (.resolveModuleNameLiterals ^js solution-builder-host module-literals containing-file redirected-reference))
  (^js [solution-builder-host module-literals containing-file redirected-reference options]
   (.resolveModuleNameLiterals ^js solution-builder-host module-literals containing-file redirected-reference options))
  (^js [solution-builder-host module-literals containing-file redirected-reference options containing-source-file]
   (.resolveModuleNameLiterals ^js solution-builder-host module-literals containing-file redirected-reference options containing-source-file))
  (^js [solution-builder-host module-literals containing-file redirected-reference options containing-source-file reused-names]
   (.resolveModuleNameLiterals ^js solution-builder-host module-literals containing-file redirected-reference options containing-source-file reused-names)))

(defn resolve-type-reference-directive-references
  "**Parameters:**
   - `type-directive-references`: `readonly T[]`
   - `containing-file`: `string`
   - `redirected-reference`: `ResolvedProjectReference | undefined`
   - `options`: `CompilerOptions`
   - `containing-source-file`: `SourceFile | undefined`
   - `reused-names`: `readonly T[] | undefined`
   
   **Returns:** `readonly ResolvedTypeReferenceDirectiveWithFailedLookupLocations[]`"
  (^js [solution-builder-host type-directive-references containing-file]
   (.resolveTypeReferenceDirectiveReferences ^js solution-builder-host type-directive-references containing-file))
  (^js [solution-builder-host type-directive-references containing-file redirected-reference]
   (.resolveTypeReferenceDirectiveReferences ^js solution-builder-host type-directive-references containing-file redirected-reference))
  (^js [solution-builder-host type-directive-references containing-file redirected-reference options]
   (.resolveTypeReferenceDirectiveReferences ^js solution-builder-host type-directive-references containing-file redirected-reference options))
  (^js [solution-builder-host type-directive-references containing-file redirected-reference options containing-source-file]
   (.resolveTypeReferenceDirectiveReferences ^js solution-builder-host type-directive-references containing-file redirected-reference options containing-source-file))
  (^js [solution-builder-host type-directive-references containing-file redirected-reference options containing-source-file reused-names]
   (.resolveTypeReferenceDirectiveReferences ^js solution-builder-host type-directive-references containing-file redirected-reference options containing-source-file reused-names)))

(defn has-invalidated-resolutions?
  "If provided along with custom resolveModuleNames or resolveTypeReferenceDirectives, used to determine if unchanged file path needs to re-resolve modules/type reference directives
   
   **Parameters:**
   - `file-path`: `Path`
   
   **Returns:** `boolean`"
  ^js [solution-builder-host file-path]
  (.hasInvalidatedResolutions ^js solution-builder-host file-path))

(defn module-resolution-cache
  "Returns the module resolution cache used by a provided `resolveModuleNames` implementation so that any non-name module resolution operations (eg, package.json lookup) can reuse it
   
   **Returns:** `ModuleResolutionCache | undefined`"
  ^js [solution-builder-host]
  (.getModuleResolutionCache ^js solution-builder-host))

(defn js-doc-parsing-mode
  ^js [solution-builder-host]
  (.-jsDocParsingMode ^js solution-builder-host))

(defn set-js-doc-parsing-mode!
  ^js [solution-builder-host value]
  (set! (.-jsDocParsingMode ^js solution-builder-host) value))
