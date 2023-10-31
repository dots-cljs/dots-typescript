(ns dots.typescript.semantic-diagnostics-builder-program
  "The builder that caches the semantic diagnostics for the program and handles the changed files and affected files")

(defn semantic-diagnostics-of-next-affected-file
  "Gets the semantic diagnostics from the program for the next affected file and caches it
   Returns undefined if the iteration is complete"
  (^js [semantic-diagnostics-builder-program]
   (.getSemanticDiagnosticsOfNextAffectedFile ^js semantic-diagnostics-builder-program))
  (^js [semantic-diagnostics-builder-program cancellation-token]
   (.getSemanticDiagnosticsOfNextAffectedFile ^js semantic-diagnostics-builder-program cancellation-token))
  (^js [semantic-diagnostics-builder-program cancellation-token ignore-source-file]
   (.getSemanticDiagnosticsOfNextAffectedFile ^js semantic-diagnostics-builder-program cancellation-token ignore-source-file)))

(defn program
  "Returns current program"
  ^js [semantic-diagnostics-builder-program]
  (.getProgram ^js semantic-diagnostics-builder-program))

(defn compiler-options
  "Get compiler options of the program"
  ^js [semantic-diagnostics-builder-program]
  (.getCompilerOptions ^js semantic-diagnostics-builder-program))

(defn source-file
  "Get the source file in the program with file name"
  ^js [semantic-diagnostics-builder-program file-name]
  (.getSourceFile ^js semantic-diagnostics-builder-program file-name))

(defn source-files
  "Get a list of files in the program"
  ^js [semantic-diagnostics-builder-program]
  (.getSourceFiles ^js semantic-diagnostics-builder-program))

(defn options-diagnostics
  "Get the diagnostics for compiler options"
  (^js [semantic-diagnostics-builder-program]
   (.getOptionsDiagnostics ^js semantic-diagnostics-builder-program))
  (^js [semantic-diagnostics-builder-program cancellation-token]
   (.getOptionsDiagnostics ^js semantic-diagnostics-builder-program cancellation-token)))

(defn global-diagnostics
  "Get the diagnostics that dont belong to any file"
  (^js [semantic-diagnostics-builder-program]
   (.getGlobalDiagnostics ^js semantic-diagnostics-builder-program))
  (^js [semantic-diagnostics-builder-program cancellation-token]
   (.getGlobalDiagnostics ^js semantic-diagnostics-builder-program cancellation-token)))

(defn config-file-parsing-diagnostics
  "Get the diagnostics from config file parsing"
  ^js [semantic-diagnostics-builder-program]
  (.getConfigFileParsingDiagnostics ^js semantic-diagnostics-builder-program))

(defn syntactic-diagnostics
  "Get the syntax diagnostics, for all source files if source file is not supplied"
  (^js [semantic-diagnostics-builder-program]
   (.getSyntacticDiagnostics ^js semantic-diagnostics-builder-program))
  (^js [semantic-diagnostics-builder-program source-file]
   (.getSyntacticDiagnostics ^js semantic-diagnostics-builder-program source-file))
  (^js [semantic-diagnostics-builder-program source-file cancellation-token]
   (.getSyntacticDiagnostics ^js semantic-diagnostics-builder-program source-file cancellation-token)))

(defn declaration-diagnostics
  "Get the declaration diagnostics, for all source files if source file is not supplied"
  (^js [semantic-diagnostics-builder-program]
   (.getDeclarationDiagnostics ^js semantic-diagnostics-builder-program))
  (^js [semantic-diagnostics-builder-program source-file]
   (.getDeclarationDiagnostics ^js semantic-diagnostics-builder-program source-file))
  (^js [semantic-diagnostics-builder-program source-file cancellation-token]
   (.getDeclarationDiagnostics ^js semantic-diagnostics-builder-program source-file cancellation-token)))

(defn all-dependencies
  "Get all the dependencies of the file"
  ^js [semantic-diagnostics-builder-program source-file]
  (.getAllDependencies ^js semantic-diagnostics-builder-program source-file))

(defn semantic-diagnostics
  "Gets the semantic diagnostics from the program corresponding to this state of file (if provided) or whole program
   The semantic diagnostics are cached and managed here
   Note that it is assumed that when asked about semantic diagnostics through this API,
   the file has been taken out of affected files so it is safe to use cache or get from program and cache the diagnostics
   In case of SemanticDiagnosticsBuilderProgram if the source file is not provided,
   it will iterate through all the affected files, to ensure that cache stays valid and yet provide a way to get all semantic diagnostics"
  (^js [semantic-diagnostics-builder-program]
   (.getSemanticDiagnostics ^js semantic-diagnostics-builder-program))
  (^js [semantic-diagnostics-builder-program source-file]
   (.getSemanticDiagnostics ^js semantic-diagnostics-builder-program source-file))
  (^js [semantic-diagnostics-builder-program source-file cancellation-token]
   (.getSemanticDiagnostics ^js semantic-diagnostics-builder-program source-file cancellation-token)))

(defn emit
  "Emits the JavaScript and declaration files.
   When targetSource file is specified, emits the files corresponding to that source file,
   otherwise for the whole program.
   In case of EmitAndSemanticDiagnosticsBuilderProgram, when targetSourceFile is specified,
   it is assumed that that file is handled from affected file list. If targetSourceFile is not specified,
   it will only emit all the affected files instead of whole program
   
   The first of writeFile if provided, writeFile of BuilderProgramHost if provided, writeFile of compiler host
   in that order would be used to write the files"
  (^js [semantic-diagnostics-builder-program]
   (.emit ^js semantic-diagnostics-builder-program))
  (^js [semantic-diagnostics-builder-program target-source-file]
   (.emit ^js semantic-diagnostics-builder-program target-source-file))
  (^js [semantic-diagnostics-builder-program target-source-file write-file]
   (.emit ^js semantic-diagnostics-builder-program target-source-file write-file))
  (^js [semantic-diagnostics-builder-program target-source-file write-file cancellation-token]
   (.emit ^js semantic-diagnostics-builder-program target-source-file write-file cancellation-token))
  (^js [semantic-diagnostics-builder-program target-source-file write-file cancellation-token emit-only-dts-files?]
   (.emit ^js semantic-diagnostics-builder-program target-source-file write-file cancellation-token emit-only-dts-files?))
  (^js [semantic-diagnostics-builder-program target-source-file write-file cancellation-token emit-only-dts-files? custom-transformers]
   (.emit ^js semantic-diagnostics-builder-program target-source-file write-file cancellation-token emit-only-dts-files? custom-transformers)))

(defn current-directory
  "Get the current directory of the program"
  ^js [semantic-diagnostics-builder-program]
  (.getCurrentDirectory ^js semantic-diagnostics-builder-program))
