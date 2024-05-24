(ns dots.typescript.program)

(defn current-directory
  "**Returns:** `string`"
  ^js [program]
  (.getCurrentDirectory ^js program))

(defn root-file-names
  "Get a list of root file names that were passed to a 'createProgram'
   
   **Returns:** `readonly string[]`"
  ^js [program]
  (.getRootFileNames ^js program))

(defn source-files
  "Get a list of files in the program
   
   **Returns:** `readonly SourceFile[]`"
  ^js [program]
  (.getSourceFiles ^js program))

(defn emit
  "Emits the JavaScript and declaration files.  If targetSourceFile is not specified, then
   the JavaScript and declaration files will be produced for all the files in this program.
   If targetSourceFile is specified, then only the JavaScript and declaration for that
   specific file will be generated.
   
   If writeFile is not specified then the writeFile callback from the compiler host will be
   used for writing the JavaScript and declaration files.  Otherwise, the writeFile parameter
   will be invoked when writing the JavaScript and declaration files.
   
   **Parameters:**
   - `target-source-file`: `SourceFile | undefined`
   - `write-file`: `WriteFileCallback | undefined`
   - `cancellation-token`: `CancellationToken | undefined`
   - `emit-only-dts-files?`: `boolean | undefined`
   - `custom-transformers`: `CustomTransformers | undefined`
   
   **Returns:** `EmitResult`"
  (^js [program]
   (.emit ^js program))
  (^js [program target-source-file]
   (.emit ^js program target-source-file))
  (^js [program target-source-file write-file]
   (.emit ^js program target-source-file write-file))
  (^js [program target-source-file write-file cancellation-token]
   (.emit ^js program target-source-file write-file cancellation-token))
  (^js [program target-source-file write-file cancellation-token emit-only-dts-files?]
   (.emit ^js program target-source-file write-file cancellation-token emit-only-dts-files?))
  (^js [program target-source-file write-file cancellation-token emit-only-dts-files? custom-transformers]
   (.emit ^js program target-source-file write-file cancellation-token emit-only-dts-files? custom-transformers)))

(defn options-diagnostics
  "**Parameters:**
   - `cancellation-token`: `CancellationToken | undefined`
   
   **Returns:** `readonly Diagnostic[]`"
  (^js [program]
   (.getOptionsDiagnostics ^js program))
  (^js [program cancellation-token]
   (.getOptionsDiagnostics ^js program cancellation-token)))

(defn global-diagnostics
  "**Parameters:**
   - `cancellation-token`: `CancellationToken | undefined`
   
   **Returns:** `readonly Diagnostic[]`"
  (^js [program]
   (.getGlobalDiagnostics ^js program))
  (^js [program cancellation-token]
   (.getGlobalDiagnostics ^js program cancellation-token)))

(defn syntactic-diagnostics
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `cancellation-token`: `CancellationToken | undefined`
   
   **Returns:** `readonly DiagnosticWithLocation[]`"
  (^js [program]
   (.getSyntacticDiagnostics ^js program))
  (^js [program source-file]
   (.getSyntacticDiagnostics ^js program source-file))
  (^js [program source-file cancellation-token]
   (.getSyntacticDiagnostics ^js program source-file cancellation-token)))

(defn semantic-diagnostics
  "The first time this is called, it will return global diagnostics (no location).
   
   **Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `cancellation-token`: `CancellationToken | undefined`
   
   **Returns:** `readonly Diagnostic[]`"
  (^js [program]
   (.getSemanticDiagnostics ^js program))
  (^js [program source-file]
   (.getSemanticDiagnostics ^js program source-file))
  (^js [program source-file cancellation-token]
   (.getSemanticDiagnostics ^js program source-file cancellation-token)))

(defn declaration-diagnostics
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `cancellation-token`: `CancellationToken | undefined`
   
   **Returns:** `readonly DiagnosticWithLocation[]`"
  (^js [program]
   (.getDeclarationDiagnostics ^js program))
  (^js [program source-file]
   (.getDeclarationDiagnostics ^js program source-file))
  (^js [program source-file cancellation-token]
   (.getDeclarationDiagnostics ^js program source-file cancellation-token)))

(defn config-file-parsing-diagnostics
  "**Returns:** `readonly Diagnostic[]`"
  ^js [program]
  (.getConfigFileParsingDiagnostics ^js program))

(defn type-checker
  "Gets a type checker that can be used to semantically analyze source files in the program.
   
   **Returns:** `TypeChecker`"
  ^js [program]
  (.getTypeChecker ^js program))

(defn node-count
  "**Returns:** `number`"
  ^js [program]
  (.getNodeCount ^js program))

(defn identifier-count
  "**Returns:** `number`"
  ^js [program]
  (.getIdentifierCount ^js program))

(defn symbol-count
  "**Returns:** `number`"
  ^js [program]
  (.getSymbolCount ^js program))

(defn type-count
  "**Returns:** `number`"
  ^js [program]
  (.getTypeCount ^js program))

(defn instantiation-count
  "**Returns:** `number`"
  ^js [program]
  (.getInstantiationCount ^js program))

(defn relation-cache-sizes
  "**Returns:** `{ assignable: number; identity: number; subtype: number; strictSubtype: number; }`"
  ^js [program]
  (.getRelationCacheSizes ^js program))

(defn source-file-from-external-library?
  "**Parameters:**
   - `file`: `SourceFile`
   
   **Returns:** `boolean`"
  ^js [program file]
  (.isSourceFileFromExternalLibrary ^js program file))

(defn source-file-default-library?
  "**Parameters:**
   - `file`: `SourceFile`
   
   **Returns:** `boolean`"
  ^js [program file]
  (.isSourceFileDefaultLibrary ^js program file))

(defn mode-for-usage-location
  "Calculates the final resolution mode for a given module reference node. This is the resolution mode explicitly provided via import
   attributes, if present, or the syntax the usage would have if emitted to JavaScript. In `--module node16` or `nodenext`, this may
   depend on the file's `impliedNodeFormat`. In `--module preserve`, it depends only on the input syntax of the reference. In other
   `module` modes, when overriding import attributes are not provided, this function returns `undefined`, as the result would have no
   impact on module resolution, emit, or type checking.
   
   **Parameters:**
   - `file`: `SourceFile`
   - `usage`: `StringLiteralLike`
   
   **Returns:** `ResolutionMode`"
  ^js [program file usage]
  (.getModeForUsageLocation ^js program file usage))

(defn mode-for-resolution-at-index
  "Calculates the final resolution mode for an import at some index within a file's `imports` list. This is the resolution mode
   explicitly provided via import attributes, if present, or the syntax the usage would have if emitted to JavaScript. In
   `--module node16` or `nodenext`, this may depend on the file's `impliedNodeFormat`. In `--module preserve`, it depends only on the
   input syntax of the reference. In other `module` modes, when overriding import attributes are not provided, this function returns
   `undefined`, as the result would have no impact on module resolution, emit, or type checking.
   
   **Parameters:**
   - `file`: `SourceFile`
   - `index`: `number`
   
   **Returns:** `ResolutionMode`"
  ^js [program file index]
  (.getModeForResolutionAtIndex ^js program file index))

(defn project-references
  "**Returns:** `readonly ProjectReference[] | undefined`"
  ^js [program]
  (.getProjectReferences ^js program))

(defn resolved-project-references
  "**Returns:** `readonly (ResolvedProjectReference | undefined)[] | undefined`"
  ^js [program]
  (.getResolvedProjectReferences ^js program))

(defn compiler-options
  "**Returns:** `CompilerOptions`"
  ^js [program]
  (.getCompilerOptions ^js program))

(defn source-file
  "**Parameters:**
   - `file-name`: `string`
   
   **Returns:** `SourceFile | undefined`"
  ^js [program file-name]
  (.getSourceFile ^js program file-name))

(defn source-file-by-path
  "**Parameters:**
   - `path`: `Path`
   
   **Returns:** `SourceFile | undefined`"
  ^js [program path]
  (.getSourceFileByPath ^js program path))
