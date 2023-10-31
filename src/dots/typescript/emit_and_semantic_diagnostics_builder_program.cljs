(ns dots.typescript.emit-and-semantic-diagnostics-builder-program
  "The builder that can handle the changes in program and iterate through changed file to emit the files
   The semantic diagnostics are cached per file and managed by clearing for the changed/affected files")

(defn emit-next-affected-file
  "Emits the next affected file's emit result (EmitResult and sourceFiles emitted) or returns undefined if iteration is complete
   The first of writeFile if provided, writeFile of BuilderProgramHost if provided, writeFile of compiler host
   in that order would be used to write the files"
  (^js [emit-and-semantic-diagnostics-builder-program]
   (.emitNextAffectedFile ^js emit-and-semantic-diagnostics-builder-program))
  (^js [emit-and-semantic-diagnostics-builder-program write-file]
   (.emitNextAffectedFile ^js emit-and-semantic-diagnostics-builder-program write-file))
  (^js [emit-and-semantic-diagnostics-builder-program write-file cancellation-token]
   (.emitNextAffectedFile ^js emit-and-semantic-diagnostics-builder-program write-file cancellation-token))
  (^js [emit-and-semantic-diagnostics-builder-program write-file cancellation-token emit-only-dts-files?]
   (.emitNextAffectedFile ^js emit-and-semantic-diagnostics-builder-program write-file cancellation-token emit-only-dts-files?))
  (^js [emit-and-semantic-diagnostics-builder-program write-file cancellation-token emit-only-dts-files? custom-transformers]
   (.emitNextAffectedFile ^js emit-and-semantic-diagnostics-builder-program write-file cancellation-token emit-only-dts-files? custom-transformers)))

(defn semantic-diagnostics-of-next-affected-file
  "Gets the semantic diagnostics from the program for the next affected file and caches it
   Returns undefined if the iteration is complete"
  (^js [emit-and-semantic-diagnostics-builder-program]
   (.getSemanticDiagnosticsOfNextAffectedFile ^js emit-and-semantic-diagnostics-builder-program))
  (^js [emit-and-semantic-diagnostics-builder-program cancellation-token]
   (.getSemanticDiagnosticsOfNextAffectedFile ^js emit-and-semantic-diagnostics-builder-program cancellation-token))
  (^js [emit-and-semantic-diagnostics-builder-program cancellation-token ignore-source-file]
   (.getSemanticDiagnosticsOfNextAffectedFile ^js emit-and-semantic-diagnostics-builder-program cancellation-token ignore-source-file)))

(defn program
  "Returns current program"
  ^js [emit-and-semantic-diagnostics-builder-program]
  (.getProgram ^js emit-and-semantic-diagnostics-builder-program))

(defn compiler-options
  "Get compiler options of the program"
  ^js [emit-and-semantic-diagnostics-builder-program]
  (.getCompilerOptions ^js emit-and-semantic-diagnostics-builder-program))

(defn source-file
  "Get the source file in the program with file name"
  ^js [emit-and-semantic-diagnostics-builder-program file-name]
  (.getSourceFile ^js emit-and-semantic-diagnostics-builder-program file-name))

(defn source-files
  "Get a list of files in the program"
  ^js [emit-and-semantic-diagnostics-builder-program]
  (.getSourceFiles ^js emit-and-semantic-diagnostics-builder-program))

(defn options-diagnostics
  "Get the diagnostics for compiler options"
  (^js [emit-and-semantic-diagnostics-builder-program]
   (.getOptionsDiagnostics ^js emit-and-semantic-diagnostics-builder-program))
  (^js [emit-and-semantic-diagnostics-builder-program cancellation-token]
   (.getOptionsDiagnostics ^js emit-and-semantic-diagnostics-builder-program cancellation-token)))

(defn global-diagnostics
  "Get the diagnostics that dont belong to any file"
  (^js [emit-and-semantic-diagnostics-builder-program]
   (.getGlobalDiagnostics ^js emit-and-semantic-diagnostics-builder-program))
  (^js [emit-and-semantic-diagnostics-builder-program cancellation-token]
   (.getGlobalDiagnostics ^js emit-and-semantic-diagnostics-builder-program cancellation-token)))

(defn config-file-parsing-diagnostics
  "Get the diagnostics from config file parsing"
  ^js [emit-and-semantic-diagnostics-builder-program]
  (.getConfigFileParsingDiagnostics ^js emit-and-semantic-diagnostics-builder-program))

(defn syntactic-diagnostics
  "Get the syntax diagnostics, for all source files if source file is not supplied"
  (^js [emit-and-semantic-diagnostics-builder-program]
   (.getSyntacticDiagnostics ^js emit-and-semantic-diagnostics-builder-program))
  (^js [emit-and-semantic-diagnostics-builder-program source-file]
   (.getSyntacticDiagnostics ^js emit-and-semantic-diagnostics-builder-program source-file))
  (^js [emit-and-semantic-diagnostics-builder-program source-file cancellation-token]
   (.getSyntacticDiagnostics ^js emit-and-semantic-diagnostics-builder-program source-file cancellation-token)))

(defn declaration-diagnostics
  "Get the declaration diagnostics, for all source files if source file is not supplied"
  (^js [emit-and-semantic-diagnostics-builder-program]
   (.getDeclarationDiagnostics ^js emit-and-semantic-diagnostics-builder-program))
  (^js [emit-and-semantic-diagnostics-builder-program source-file]
   (.getDeclarationDiagnostics ^js emit-and-semantic-diagnostics-builder-program source-file))
  (^js [emit-and-semantic-diagnostics-builder-program source-file cancellation-token]
   (.getDeclarationDiagnostics ^js emit-and-semantic-diagnostics-builder-program source-file cancellation-token)))

(defn all-dependencies
  "Get all the dependencies of the file"
  ^js [emit-and-semantic-diagnostics-builder-program source-file]
  (.getAllDependencies ^js emit-and-semantic-diagnostics-builder-program source-file))

(defn semantic-diagnostics
  "Gets the semantic diagnostics from the program corresponding to this state of file (if provided) or whole program
   The semantic diagnostics are cached and managed here
   Note that it is assumed that when asked about semantic diagnostics through this API,
   the file has been taken out of affected files so it is safe to use cache or get from program and cache the diagnostics
   In case of SemanticDiagnosticsBuilderProgram if the source file is not provided,
   it will iterate through all the affected files, to ensure that cache stays valid and yet provide a way to get all semantic diagnostics"
  (^js [emit-and-semantic-diagnostics-builder-program]
   (.getSemanticDiagnostics ^js emit-and-semantic-diagnostics-builder-program))
  (^js [emit-and-semantic-diagnostics-builder-program source-file]
   (.getSemanticDiagnostics ^js emit-and-semantic-diagnostics-builder-program source-file))
  (^js [emit-and-semantic-diagnostics-builder-program source-file cancellation-token]
   (.getSemanticDiagnostics ^js emit-and-semantic-diagnostics-builder-program source-file cancellation-token)))

(defn emit
  "Emits the JavaScript and declaration files.
   When targetSource file is specified, emits the files corresponding to that source file,
   otherwise for the whole program.
   In case of EmitAndSemanticDiagnosticsBuilderProgram, when targetSourceFile is specified,
   it is assumed that that file is handled from affected file list. If targetSourceFile is not specified,
   it will only emit all the affected files instead of whole program
   
   The first of writeFile if provided, writeFile of BuilderProgramHost if provided, writeFile of compiler host
   in that order would be used to write the files"
  (^js [emit-and-semantic-diagnostics-builder-program]
   (.emit ^js emit-and-semantic-diagnostics-builder-program))
  (^js [emit-and-semantic-diagnostics-builder-program target-source-file]
   (.emit ^js emit-and-semantic-diagnostics-builder-program target-source-file))
  (^js [emit-and-semantic-diagnostics-builder-program target-source-file write-file]
   (.emit ^js emit-and-semantic-diagnostics-builder-program target-source-file write-file))
  (^js [emit-and-semantic-diagnostics-builder-program target-source-file write-file cancellation-token]
   (.emit ^js emit-and-semantic-diagnostics-builder-program target-source-file write-file cancellation-token))
  (^js [emit-and-semantic-diagnostics-builder-program target-source-file write-file cancellation-token emit-only-dts-files?]
   (.emit ^js emit-and-semantic-diagnostics-builder-program target-source-file write-file cancellation-token emit-only-dts-files?))
  (^js [emit-and-semantic-diagnostics-builder-program target-source-file write-file cancellation-token emit-only-dts-files? custom-transformers]
   (.emit ^js emit-and-semantic-diagnostics-builder-program target-source-file write-file cancellation-token emit-only-dts-files? custom-transformers)))

(defn current-directory
  "Get the current directory of the program"
  ^js [emit-and-semantic-diagnostics-builder-program]
  (.getCurrentDirectory ^js emit-and-semantic-diagnostics-builder-program))
