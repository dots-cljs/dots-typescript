(ns dots.typescript.builder-program
  "Builder to manage the program state changes")

(defn program
  "Returns current program"
  ^js [builder-program]
  (.getProgram ^js builder-program))

(defn compiler-options
  "Get compiler options of the program"
  ^js [builder-program]
  (.getCompilerOptions ^js builder-program))

(defn source-file
  "Get the source file in the program with file name"
  ^js [builder-program file-name]
  (.getSourceFile ^js builder-program file-name))

(defn source-files
  "Get a list of files in the program"
  ^js [builder-program]
  (.getSourceFiles ^js builder-program))

(defn options-diagnostics
  "Get the diagnostics for compiler options"
  (^js [builder-program]
   (.getOptionsDiagnostics ^js builder-program))
  (^js [builder-program cancellation-token]
   (.getOptionsDiagnostics ^js builder-program cancellation-token)))

(defn global-diagnostics
  "Get the diagnostics that dont belong to any file"
  (^js [builder-program]
   (.getGlobalDiagnostics ^js builder-program))
  (^js [builder-program cancellation-token]
   (.getGlobalDiagnostics ^js builder-program cancellation-token)))

(defn config-file-parsing-diagnostics
  "Get the diagnostics from config file parsing"
  ^js [builder-program]
  (.getConfigFileParsingDiagnostics ^js builder-program))

(defn syntactic-diagnostics
  "Get the syntax diagnostics, for all source files if source file is not supplied"
  (^js [builder-program]
   (.getSyntacticDiagnostics ^js builder-program))
  (^js [builder-program source-file]
   (.getSyntacticDiagnostics ^js builder-program source-file))
  (^js [builder-program source-file cancellation-token]
   (.getSyntacticDiagnostics ^js builder-program source-file cancellation-token)))

(defn declaration-diagnostics
  "Get the declaration diagnostics, for all source files if source file is not supplied"
  (^js [builder-program]
   (.getDeclarationDiagnostics ^js builder-program))
  (^js [builder-program source-file]
   (.getDeclarationDiagnostics ^js builder-program source-file))
  (^js [builder-program source-file cancellation-token]
   (.getDeclarationDiagnostics ^js builder-program source-file cancellation-token)))

(defn all-dependencies
  "Get all the dependencies of the file"
  ^js [builder-program source-file]
  (.getAllDependencies ^js builder-program source-file))

(defn semantic-diagnostics
  "Gets the semantic diagnostics from the program corresponding to this state of file (if provided) or whole program
   The semantic diagnostics are cached and managed here
   Note that it is assumed that when asked about semantic diagnostics through this API,
   the file has been taken out of affected files so it is safe to use cache or get from program and cache the diagnostics
   In case of SemanticDiagnosticsBuilderProgram if the source file is not provided,
   it will iterate through all the affected files, to ensure that cache stays valid and yet provide a way to get all semantic diagnostics"
  (^js [builder-program]
   (.getSemanticDiagnostics ^js builder-program))
  (^js [builder-program source-file]
   (.getSemanticDiagnostics ^js builder-program source-file))
  (^js [builder-program source-file cancellation-token]
   (.getSemanticDiagnostics ^js builder-program source-file cancellation-token)))

(defn emit
  "Emits the JavaScript and declaration files.
   When targetSource file is specified, emits the files corresponding to that source file,
   otherwise for the whole program.
   In case of EmitAndSemanticDiagnosticsBuilderProgram, when targetSourceFile is specified,
   it is assumed that that file is handled from affected file list. If targetSourceFile is not specified,
   it will only emit all the affected files instead of whole program
   
   The first of writeFile if provided, writeFile of BuilderProgramHost if provided, writeFile of compiler host
   in that order would be used to write the files"
  (^js [builder-program]
   (.emit ^js builder-program))
  (^js [builder-program target-source-file]
   (.emit ^js builder-program target-source-file))
  (^js [builder-program target-source-file write-file]
   (.emit ^js builder-program target-source-file write-file))
  (^js [builder-program target-source-file write-file cancellation-token]
   (.emit ^js builder-program target-source-file write-file cancellation-token))
  (^js [builder-program target-source-file write-file cancellation-token emit-only-dts-files?]
   (.emit ^js builder-program target-source-file write-file cancellation-token emit-only-dts-files?))
  (^js [builder-program target-source-file write-file cancellation-token emit-only-dts-files? custom-transformers]
   (.emit ^js builder-program target-source-file write-file cancellation-token emit-only-dts-files? custom-transformers)))

(defn current-directory
  "Get the current directory of the program"
  ^js [builder-program]
  (.getCurrentDirectory ^js builder-program))
