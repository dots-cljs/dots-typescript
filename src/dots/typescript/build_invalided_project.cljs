(ns dots.typescript.build-invalided-project)

(defn kind
  "**Returns:** `InvalidatedProjectKind.Build`"
  ^js [build-invalided-project]
  (.-kind ^js build-invalided-project))

(defn builder-program
  "**Returns:** `T | undefined`"
  ^js [build-invalided-project]
  (.getBuilderProgram ^js build-invalided-project))

(defn program
  "**Returns:** `Program | undefined`"
  ^js [build-invalided-project]
  (.getProgram ^js build-invalided-project))

(defn source-file
  "**Parameters:**
   - `file-name`: `string`
   
   **Returns:** `SourceFile | undefined`"
  ^js [build-invalided-project file-name]
  (.getSourceFile ^js build-invalided-project file-name))

(defn source-files
  "**Returns:** `readonly SourceFile[]`"
  ^js [build-invalided-project]
  (.getSourceFiles ^js build-invalided-project))

(defn options-diagnostics
  "**Parameters:**
   - `cancellation-token`: `CancellationToken | undefined`
   
   **Returns:** `readonly Diagnostic[]`"
  (^js [build-invalided-project]
   (.getOptionsDiagnostics ^js build-invalided-project))
  (^js [build-invalided-project cancellation-token]
   (.getOptionsDiagnostics ^js build-invalided-project cancellation-token)))

(defn global-diagnostics
  "**Parameters:**
   - `cancellation-token`: `CancellationToken | undefined`
   
   **Returns:** `readonly Diagnostic[]`"
  (^js [build-invalided-project]
   (.getGlobalDiagnostics ^js build-invalided-project))
  (^js [build-invalided-project cancellation-token]
   (.getGlobalDiagnostics ^js build-invalided-project cancellation-token)))

(defn config-file-parsing-diagnostics
  "**Returns:** `readonly Diagnostic[]`"
  ^js [build-invalided-project]
  (.getConfigFileParsingDiagnostics ^js build-invalided-project))

(defn syntactic-diagnostics
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `cancellation-token`: `CancellationToken | undefined`
   
   **Returns:** `readonly Diagnostic[]`"
  (^js [build-invalided-project]
   (.getSyntacticDiagnostics ^js build-invalided-project))
  (^js [build-invalided-project source-file]
   (.getSyntacticDiagnostics ^js build-invalided-project source-file))
  (^js [build-invalided-project source-file cancellation-token]
   (.getSyntacticDiagnostics ^js build-invalided-project source-file cancellation-token)))

(defn all-dependencies
  "**Parameters:**
   - `source-file`: `SourceFile`
   
   **Returns:** `readonly string[]`"
  ^js [build-invalided-project source-file]
  (.getAllDependencies ^js build-invalided-project source-file))

(defn semantic-diagnostics
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `cancellation-token`: `CancellationToken | undefined`
   
   **Returns:** `readonly Diagnostic[]`"
  (^js [build-invalided-project]
   (.getSemanticDiagnostics ^js build-invalided-project))
  (^js [build-invalided-project source-file]
   (.getSemanticDiagnostics ^js build-invalided-project source-file))
  (^js [build-invalided-project source-file cancellation-token]
   (.getSemanticDiagnostics ^js build-invalided-project source-file cancellation-token)))

(defn semantic-diagnostics-of-next-affected-file
  "**Parameters:**
   - `cancellation-token`: `CancellationToken | undefined`
   - `ignore-source-file`: `((sourceFile: SourceFile) => boolean) | undefined`
   
   **Returns:** `AffectedFileResult<readonly Diagnostic[]>`"
  (^js [build-invalided-project]
   (.getSemanticDiagnosticsOfNextAffectedFile ^js build-invalided-project))
  (^js [build-invalided-project cancellation-token]
   (.getSemanticDiagnosticsOfNextAffectedFile ^js build-invalided-project cancellation-token))
  (^js [build-invalided-project cancellation-token ignore-source-file]
   (.getSemanticDiagnosticsOfNextAffectedFile ^js build-invalided-project cancellation-token ignore-source-file)))

(defn emit
  "**Parameters:**
   - `target-source-file`: `SourceFile | undefined`
   - `write-file`: `WriteFileCallback | undefined`
   - `cancellation-token`: `CancellationToken | undefined`
   - `emit-only-dts-files?`: `boolean | undefined`
   - `custom-transformers`: `CustomTransformers | undefined`
   
   **Returns:** `EmitResult | undefined`"
  (^js [build-invalided-project]
   (.emit ^js build-invalided-project))
  (^js [build-invalided-project target-source-file]
   (.emit ^js build-invalided-project target-source-file))
  (^js [build-invalided-project target-source-file write-file]
   (.emit ^js build-invalided-project target-source-file write-file))
  (^js [build-invalided-project target-source-file write-file cancellation-token]
   (.emit ^js build-invalided-project target-source-file write-file cancellation-token))
  (^js [build-invalided-project target-source-file write-file cancellation-token emit-only-dts-files?]
   (.emit ^js build-invalided-project target-source-file write-file cancellation-token emit-only-dts-files?))
  (^js [build-invalided-project target-source-file write-file cancellation-token emit-only-dts-files? custom-transformers]
   (.emit ^js build-invalided-project target-source-file write-file cancellation-token emit-only-dts-files? custom-transformers)))

(defn project
  "**Returns:** `ResolvedConfigFileName`"
  ^js [build-invalided-project]
  (.-project ^js build-invalided-project))

(defn done
  "To dispose this project and ensure that all the necessary actions are taken and state is updated accordingly
   
   **Parameters:**
   - `cancellation-token`: `CancellationToken | undefined`
   - `write-file`: `WriteFileCallback | undefined`
   - `custom-transformers`: `CustomTransformers | undefined`
   
   **Returns:** `ExitStatus`"
  (^js [build-invalided-project]
   (.done ^js build-invalided-project))
  (^js [build-invalided-project cancellation-token]
   (.done ^js build-invalided-project cancellation-token))
  (^js [build-invalided-project cancellation-token write-file]
   (.done ^js build-invalided-project cancellation-token write-file))
  (^js [build-invalided-project cancellation-token write-file custom-transformers]
   (.done ^js build-invalided-project cancellation-token write-file custom-transformers)))

(defn compiler-options
  "**Returns:** `CompilerOptions`"
  ^js [build-invalided-project]
  (.getCompilerOptions ^js build-invalided-project))

(defn current-directory
  "**Returns:** `string`"
  ^js [build-invalided-project]
  (.getCurrentDirectory ^js build-invalided-project))
