(ns dots.typescript.program-host)

(defn create-program
  "Used to create the program when need for program creation or recreation detected
   
   **Returns:** `CreateProgram<T>`"
  ^js [program-host]
  (.-createProgram ^js program-host))

(defn set-create-program!
  "Used to create the program when need for program creation or recreation detected"
  ^js [program-host value]
  (set! (.-createProgram ^js program-host) value))

(defn use-case-sensitive-file-names?
  "**Returns:** `boolean`"
  ^js [program-host]
  (.useCaseSensitiveFileNames ^js program-host))

(defn new-line
  "**Returns:** `string`"
  ^js [program-host]
  (.getNewLine ^js program-host))

(defn current-directory
  "**Returns:** `string`"
  ^js [program-host]
  (.getCurrentDirectory ^js program-host))

(defn default-lib-file-name
  "**Parameters:**
   - `options`: `CompilerOptions`
   
   **Returns:** `string`"
  ^js [program-host options]
  (.getDefaultLibFileName ^js program-host options))

(defn default-lib-location
  "**Returns:** `string`"
  ^js [program-host]
  (.getDefaultLibLocation ^js program-host))

(defn create-hash
  "**Parameters:**
   - `data`: `string`
   
   **Returns:** `string`"
  ^js [program-host data]
  (.createHash ^js program-host data))

(defn file-exists?
  "Use to check file presence for source files and
   if resolveModuleNames is not provided (complier is in charge of module resolution) then module files as well
   
   **Parameters:**
   - `path`: `string`
   
   **Returns:** `boolean`"
  ^js [program-host path]
  (.fileExists ^js program-host path))

(defn read-file
  "Use to read file text for source files and
   if resolveModuleNames is not provided (complier is in charge of module resolution) then module files as well
   
   **Parameters:**
   - `path`: `string`
   - `encoding`: `string | undefined`
   
   **Returns:** `string | undefined`"
  (^js [program-host path]
   (.readFile ^js program-host path))
  (^js [program-host path encoding]
   (.readFile ^js program-host path encoding)))

(defn directory-exists?
  "If provided, used for module resolution as well as to handle directory structure
   
   **Parameters:**
   - `path`: `string`
   
   **Returns:** `boolean`"
  ^js [program-host path]
  (.directoryExists ^js program-host path))

(defn directories
  "If provided, used in resolutions as well as handling directory structure
   
   **Parameters:**
   - `path`: `string`
   
   **Returns:** `string[]`"
  ^js [program-host path]
  (.getDirectories ^js program-host path))

(defn read-directory
  "If provided, used to cache and handle directory structure modifications
   
   **Parameters:**
   - `path`: `string`
   - `extensions`: `readonly string[] | undefined`
   - `exclude`: `readonly string[] | undefined`
   - `include`: `readonly string[] | undefined`
   - `depth`: `number | undefined`
   
   **Returns:** `string[]`"
  (^js [program-host path]
   (.readDirectory ^js program-host path))
  (^js [program-host path extensions]
   (.readDirectory ^js program-host path extensions))
  (^js [program-host path extensions exclude]
   (.readDirectory ^js program-host path extensions exclude))
  (^js [program-host path extensions exclude include]
   (.readDirectory ^js program-host path extensions exclude include))
  (^js [program-host path extensions exclude include depth]
   (.readDirectory ^js program-host path extensions exclude include depth)))

(defn realpath
  "Symbol links resolution
   
   **Parameters:**
   - `path`: `string`
   
   **Returns:** `string`"
  ^js [program-host path]
  (.realpath ^js program-host path))

(defn trace
  "If provided would be used to write log about compilation
   
   **Parameters:**
   - `s`: `string`
   
   **Returns:** `void`"
  ^js [program-host s]
  (.trace ^js program-host s))

(defn environment-variable
  "If provided is used to get the environment variable
   
   **Parameters:**
   - `name`: `string`
   
   **Returns:** `string | undefined`"
  ^js [program-host name]
  (.getEnvironmentVariable ^js program-host name))

(defn resolve-module-names
  "**Parameters:**
   - `module-names`: `string[]`
   - `containing-file`: `string`
   - `reused-names`: `string[] | undefined`
   - `redirected-reference`: `ResolvedProjectReference | undefined`
   - `options`: `CompilerOptions`
   - `containing-source-file`: `SourceFile | undefined`
   
   **Returns:** `(ResolvedModule | undefined)[]`"
  (^js [program-host module-names containing-file]
   (.resolveModuleNames ^js program-host module-names containing-file))
  (^js [program-host module-names containing-file reused-names]
   (.resolveModuleNames ^js program-host module-names containing-file reused-names))
  (^js [program-host module-names containing-file reused-names redirected-reference]
   (.resolveModuleNames ^js program-host module-names containing-file reused-names redirected-reference))
  (^js [program-host module-names containing-file reused-names redirected-reference options]
   (.resolveModuleNames ^js program-host module-names containing-file reused-names redirected-reference options))
  (^js [program-host module-names containing-file reused-names redirected-reference options containing-source-file]
   (.resolveModuleNames ^js program-host module-names containing-file reused-names redirected-reference options containing-source-file)))

(defn resolve-type-reference-directives
  "**Parameters:**
   - `type-reference-directive-names`: `string[] | readonly FileReference[]`
   - `containing-file`: `string`
   - `redirected-reference`: `ResolvedProjectReference | undefined`
   - `options`: `CompilerOptions`
   - `containing-file-mode`: `ResolutionMode`
   
   **Returns:** `(ResolvedTypeReferenceDirective | undefined)[]`"
  (^js [program-host type-reference-directive-names containing-file]
   (.resolveTypeReferenceDirectives ^js program-host type-reference-directive-names containing-file))
  (^js [program-host type-reference-directive-names containing-file redirected-reference]
   (.resolveTypeReferenceDirectives ^js program-host type-reference-directive-names containing-file redirected-reference))
  (^js [program-host type-reference-directive-names containing-file redirected-reference options]
   (.resolveTypeReferenceDirectives ^js program-host type-reference-directive-names containing-file redirected-reference options))
  (^js [program-host type-reference-directive-names containing-file redirected-reference options containing-file-mode]
   (.resolveTypeReferenceDirectives ^js program-host type-reference-directive-names containing-file redirected-reference options containing-file-mode)))

(defn resolve-module-name-literals
  "**Parameters:**
   - `module-literals`: `readonly StringLiteralLike[]`
   - `containing-file`: `string`
   - `redirected-reference`: `ResolvedProjectReference | undefined`
   - `options`: `CompilerOptions`
   - `containing-source-file`: `SourceFile`
   - `reused-names`: `readonly StringLiteralLike[] | undefined`
   
   **Returns:** `readonly ResolvedModuleWithFailedLookupLocations[]`"
  (^js [program-host module-literals containing-file]
   (.resolveModuleNameLiterals ^js program-host module-literals containing-file))
  (^js [program-host module-literals containing-file redirected-reference]
   (.resolveModuleNameLiterals ^js program-host module-literals containing-file redirected-reference))
  (^js [program-host module-literals containing-file redirected-reference options]
   (.resolveModuleNameLiterals ^js program-host module-literals containing-file redirected-reference options))
  (^js [program-host module-literals containing-file redirected-reference options containing-source-file]
   (.resolveModuleNameLiterals ^js program-host module-literals containing-file redirected-reference options containing-source-file))
  (^js [program-host module-literals containing-file redirected-reference options containing-source-file reused-names]
   (.resolveModuleNameLiterals ^js program-host module-literals containing-file redirected-reference options containing-source-file reused-names)))

(defn resolve-type-reference-directive-references
  "**Parameters:**
   - `type-directive-references`: `readonly T[]`
   - `containing-file`: `string`
   - `redirected-reference`: `ResolvedProjectReference | undefined`
   - `options`: `CompilerOptions`
   - `containing-source-file`: `SourceFile | undefined`
   - `reused-names`: `readonly T[] | undefined`
   
   **Returns:** `readonly ResolvedTypeReferenceDirectiveWithFailedLookupLocations[]`"
  (^js [program-host type-directive-references containing-file]
   (.resolveTypeReferenceDirectiveReferences ^js program-host type-directive-references containing-file))
  (^js [program-host type-directive-references containing-file redirected-reference]
   (.resolveTypeReferenceDirectiveReferences ^js program-host type-directive-references containing-file redirected-reference))
  (^js [program-host type-directive-references containing-file redirected-reference options]
   (.resolveTypeReferenceDirectiveReferences ^js program-host type-directive-references containing-file redirected-reference options))
  (^js [program-host type-directive-references containing-file redirected-reference options containing-source-file]
   (.resolveTypeReferenceDirectiveReferences ^js program-host type-directive-references containing-file redirected-reference options containing-source-file))
  (^js [program-host type-directive-references containing-file redirected-reference options containing-source-file reused-names]
   (.resolveTypeReferenceDirectiveReferences ^js program-host type-directive-references containing-file redirected-reference options containing-source-file reused-names)))

(defn has-invalidated-resolutions?
  "If provided along with custom resolveModuleNames or resolveTypeReferenceDirectives, used to determine if unchanged file path needs to re-resolve modules/type reference directives
   
   **Parameters:**
   - `file-path`: `Path`
   
   **Returns:** `boolean`"
  ^js [program-host file-path]
  (.hasInvalidatedResolutions ^js program-host file-path))

(defn module-resolution-cache
  "Returns the module resolution cache used by a provided `resolveModuleNames` implementation so that any non-name module resolution operations (eg, package.json lookup) can reuse it
   
   **Returns:** `ModuleResolutionCache | undefined`"
  ^js [program-host]
  (.getModuleResolutionCache ^js program-host))

(defn js-doc-parsing-mode
  "**Returns:** `JSDocParsingMode | undefined`"
  ^js [program-host]
  (.-jsDocParsingMode ^js program-host))

(defn set-js-doc-parsing-mode!
  ^js [program-host value]
  (set! (.-jsDocParsingMode ^js program-host) value))
