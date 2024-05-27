(ns dots.typescript.compiler-host)

(defn source-file
  "**Parameters:**
   - `file-name`: `string`
   - `language-version-or-options`: `ScriptTarget | CreateSourceFileOptions`
   - `on-error`: `((message: string) => void) | undefined`
   - `should-create-new-source-file?`: `boolean | undefined`
   
   **Returns:** `SourceFile | undefined`"
  (^js [compiler-host file-name language-version-or-options]
   (.getSourceFile ^js compiler-host file-name language-version-or-options))
  (^js [compiler-host file-name language-version-or-options on-error]
   (.getSourceFile ^js compiler-host file-name language-version-or-options on-error))
  (^js [compiler-host file-name language-version-or-options on-error should-create-new-source-file?]
   (.getSourceFile ^js compiler-host file-name language-version-or-options on-error should-create-new-source-file?)))

(defn source-file-by-path
  "**Parameters:**
   - `file-name`: `string`
   - `path`: `Path`
   - `language-version-or-options`: `ScriptTarget | CreateSourceFileOptions`
   - `on-error`: `((message: string) => void) | undefined`
   - `should-create-new-source-file?`: `boolean | undefined`
   
   **Returns:** `SourceFile | undefined`"
  (^js [compiler-host file-name path language-version-or-options]
   (.getSourceFileByPath ^js compiler-host file-name path language-version-or-options))
  (^js [compiler-host file-name path language-version-or-options on-error]
   (.getSourceFileByPath ^js compiler-host file-name path language-version-or-options on-error))
  (^js [compiler-host file-name path language-version-or-options on-error should-create-new-source-file?]
   (.getSourceFileByPath ^js compiler-host file-name path language-version-or-options on-error should-create-new-source-file?)))

(defn cancellation-token
  "**Returns:** `CancellationToken`"
  ^js [compiler-host]
  (.getCancellationToken ^js compiler-host))

(defn default-lib-file-name
  "**Parameters:**
   - `options`: `CompilerOptions`
   
   **Returns:** `string`"
  ^js [compiler-host options]
  (.getDefaultLibFileName ^js compiler-host options))

(defn default-lib-location
  "**Returns:** `string`"
  ^js [compiler-host]
  (.getDefaultLibLocation ^js compiler-host))

(defn write-file
  "**Returns:** `WriteFileCallback`"
  ^js [compiler-host]
  (.-writeFile ^js compiler-host))

(defn set-write-file!
  ^js [compiler-host value]
  (set! (.-writeFile ^js compiler-host) value))

(defn current-directory
  "**Returns:** `string`"
  ^js [compiler-host]
  (.getCurrentDirectory ^js compiler-host))

(defn canonical-file-name
  "**Parameters:**
   - `file-name`: `string`
   
   **Returns:** `string`"
  ^js [compiler-host file-name]
  (.getCanonicalFileName ^js compiler-host file-name))

(defn use-case-sensitive-file-names?
  "**Returns:** `boolean`"
  ^js [compiler-host]
  (.useCaseSensitiveFileNames ^js compiler-host))

(defn new-line
  "**Returns:** `string`"
  ^js [compiler-host]
  (.getNewLine ^js compiler-host))

(defn read-directory
  "**Parameters:**
   - `root-dir`: `string`
   - `extensions`: `readonly string[]`
   - `excludes`: `readonly string[] | undefined`
   - `includes`: `readonly string[]`
   - `depth`: `number | undefined`
   
   **Returns:** `string[]`"
  (^js [compiler-host root-dir extensions]
   (.readDirectory ^js compiler-host root-dir extensions))
  (^js [compiler-host root-dir extensions excludes]
   (.readDirectory ^js compiler-host root-dir extensions excludes))
  (^js [compiler-host root-dir extensions excludes includes]
   (.readDirectory ^js compiler-host root-dir extensions excludes includes))
  (^js [compiler-host root-dir extensions excludes includes depth]
   (.readDirectory ^js compiler-host root-dir extensions excludes includes depth)))

(defn resolve-module-names
  "**Parameters:**
   - `module-names`: `string[]`
   - `containing-file`: `string`
   - `reused-names`: `string[] | undefined`
   - `redirected-reference`: `ResolvedProjectReference | undefined`
   - `options`: `CompilerOptions`
   - `containing-source-file`: `SourceFile | undefined`
   
   **Returns:** `(ResolvedModule | undefined)[]`"
  (^js [compiler-host module-names containing-file]
   (.resolveModuleNames ^js compiler-host module-names containing-file))
  (^js [compiler-host module-names containing-file reused-names]
   (.resolveModuleNames ^js compiler-host module-names containing-file reused-names))
  (^js [compiler-host module-names containing-file reused-names redirected-reference]
   (.resolveModuleNames ^js compiler-host module-names containing-file reused-names redirected-reference))
  (^js [compiler-host module-names containing-file reused-names redirected-reference options]
   (.resolveModuleNames ^js compiler-host module-names containing-file reused-names redirected-reference options))
  (^js [compiler-host module-names containing-file reused-names redirected-reference options containing-source-file]
   (.resolveModuleNames ^js compiler-host module-names containing-file reused-names redirected-reference options containing-source-file)))

(defn module-resolution-cache
  "Returns the module resolution cache used by a provided `resolveModuleNames` implementation so that any non-name module resolution operations (eg, package.json lookup) can reuse it
   
   **Returns:** `ModuleResolutionCache | undefined`"
  ^js [compiler-host]
  (.getModuleResolutionCache ^js compiler-host))

(defn resolve-type-reference-directives
  "**Parameters:**
   - `type-reference-directive-names`: `string[] | readonly FileReference[]`
   - `containing-file`: `string`
   - `redirected-reference`: `ResolvedProjectReference | undefined`
   - `options`: `CompilerOptions`
   - `containing-file-mode`: `ResolutionMode`
   
   **Returns:** `(ResolvedTypeReferenceDirective | undefined)[]`"
  (^js [compiler-host type-reference-directive-names containing-file]
   (.resolveTypeReferenceDirectives ^js compiler-host type-reference-directive-names containing-file))
  (^js [compiler-host type-reference-directive-names containing-file redirected-reference]
   (.resolveTypeReferenceDirectives ^js compiler-host type-reference-directive-names containing-file redirected-reference))
  (^js [compiler-host type-reference-directive-names containing-file redirected-reference options]
   (.resolveTypeReferenceDirectives ^js compiler-host type-reference-directive-names containing-file redirected-reference options))
  (^js [compiler-host type-reference-directive-names containing-file redirected-reference options containing-file-mode]
   (.resolveTypeReferenceDirectives ^js compiler-host type-reference-directive-names containing-file redirected-reference options containing-file-mode)))

(defn resolve-module-name-literals
  "**Parameters:**
   - `module-literals`: `readonly StringLiteralLike[]`
   - `containing-file`: `string`
   - `redirected-reference`: `ResolvedProjectReference | undefined`
   - `options`: `CompilerOptions`
   - `containing-source-file`: `SourceFile`
   - `reused-names`: `readonly StringLiteralLike[] | undefined`
   
   **Returns:** `readonly ResolvedModuleWithFailedLookupLocations[]`"
  (^js [compiler-host module-literals containing-file]
   (.resolveModuleNameLiterals ^js compiler-host module-literals containing-file))
  (^js [compiler-host module-literals containing-file redirected-reference]
   (.resolveModuleNameLiterals ^js compiler-host module-literals containing-file redirected-reference))
  (^js [compiler-host module-literals containing-file redirected-reference options]
   (.resolveModuleNameLiterals ^js compiler-host module-literals containing-file redirected-reference options))
  (^js [compiler-host module-literals containing-file redirected-reference options containing-source-file]
   (.resolveModuleNameLiterals ^js compiler-host module-literals containing-file redirected-reference options containing-source-file))
  (^js [compiler-host module-literals containing-file redirected-reference options containing-source-file reused-names]
   (.resolveModuleNameLiterals ^js compiler-host module-literals containing-file redirected-reference options containing-source-file reused-names)))

(defn resolve-type-reference-directive-references
  "**Parameters:**
   - `type-directive-references`: `readonly T[]`
   - `containing-file`: `string`
   - `redirected-reference`: `ResolvedProjectReference | undefined`
   - `options`: `CompilerOptions`
   - `containing-source-file`: `SourceFile | undefined`
   - `reused-names`: `readonly T[] | undefined`
   
   **Returns:** `readonly ResolvedTypeReferenceDirectiveWithFailedLookupLocations[]`"
  (^js [compiler-host type-directive-references containing-file]
   (.resolveTypeReferenceDirectiveReferences ^js compiler-host type-directive-references containing-file))
  (^js [compiler-host type-directive-references containing-file redirected-reference]
   (.resolveTypeReferenceDirectiveReferences ^js compiler-host type-directive-references containing-file redirected-reference))
  (^js [compiler-host type-directive-references containing-file redirected-reference options]
   (.resolveTypeReferenceDirectiveReferences ^js compiler-host type-directive-references containing-file redirected-reference options))
  (^js [compiler-host type-directive-references containing-file redirected-reference options containing-source-file]
   (.resolveTypeReferenceDirectiveReferences ^js compiler-host type-directive-references containing-file redirected-reference options containing-source-file))
  (^js [compiler-host type-directive-references containing-file redirected-reference options containing-source-file reused-names]
   (.resolveTypeReferenceDirectiveReferences ^js compiler-host type-directive-references containing-file redirected-reference options containing-source-file reused-names)))

(defn environment-variable
  "**Parameters:**
   - `name`: `string`
   
   **Returns:** `string | undefined`"
  ^js [compiler-host name]
  (.getEnvironmentVariable ^js compiler-host name))

(defn has-invalidated-resolutions?
  "If provided along with custom resolveModuleNames or resolveTypeReferenceDirectives, used to determine if unchanged file path needs to re-resolve modules/type reference directives
   
   **Parameters:**
   - `file-path`: `Path`
   
   **Returns:** `boolean`"
  ^js [compiler-host file-path]
  (.hasInvalidatedResolutions ^js compiler-host file-path))

(defn create-hash
  "**Parameters:**
   - `data`: `string`
   
   **Returns:** `string`"
  ^js [compiler-host data]
  (.createHash ^js compiler-host data))

(defn parsed-command-line
  "**Parameters:**
   - `file-name`: `string`
   
   **Returns:** `ParsedCommandLine | undefined`"
  ^js [compiler-host file-name]
  (.getParsedCommandLine ^js compiler-host file-name))

(defn js-doc-parsing-mode
  "**Returns:** `JSDocParsingMode | undefined`"
  ^js [compiler-host]
  (.-jsDocParsingMode ^js compiler-host))

(defn set-js-doc-parsing-mode!
  ^js [compiler-host value]
  (set! (.-jsDocParsingMode ^js compiler-host) value))

(defn file-exists?
  "**Parameters:**
   - `file-name`: `string`
   
   **Returns:** `boolean`"
  ^js [compiler-host file-name]
  (.fileExists ^js compiler-host file-name))

(defn read-file
  "**Parameters:**
   - `file-name`: `string`
   
   **Returns:** `string | undefined`"
  ^js [compiler-host file-name]
  (.readFile ^js compiler-host file-name))

(defn trace
  "**Parameters:**
   - `s`: `string`
   
   **Returns:** `void`"
  ^js [compiler-host s]
  (.trace ^js compiler-host s))

(defn directory-exists?
  "**Parameters:**
   - `directory-name`: `string`
   
   **Returns:** `boolean`"
  ^js [compiler-host directory-name]
  (.directoryExists ^js compiler-host directory-name))

(defn realpath
  "Resolve a symbolic link.
   
   **Parameters:**
   - `path`: `string`
   
   **Returns:** `string`"
  ^js [compiler-host path]
  (.realpath ^js compiler-host path))

(defn directories
  "**Parameters:**
   - `path`: `string`
   
   **Returns:** `string[]`"
  ^js [compiler-host path]
  (.getDirectories ^js compiler-host path))
