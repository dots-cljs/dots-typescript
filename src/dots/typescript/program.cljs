(ns dots.typescript.program)

(defn current-directory
  ^js [program]
  (.getCurrentDirectory ^js program))

(defn root-file-names
  "Get a list of root file names that were passed to a 'createProgram'"
  ^js [program]
  (.getRootFileNames ^js program))

(defn source-files
  "Get a list of files in the program"
  ^js [program]
  (.getSourceFiles ^js program))

(defn emit
  "Emits the JavaScript and declaration files.  If targetSourceFile is not specified, then
   the JavaScript and declaration files will be produced for all the files in this program.
   If targetSourceFile is specified, then only the JavaScript and declaration for that
   specific file will be generated.
   
   If writeFile is not specified then the writeFile callback from the compiler host will be
   used for writing the JavaScript and declaration files.  Otherwise, the writeFile parameter
   will be invoked when writing the JavaScript and declaration files."
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
  (^js [program]
   (.getOptionsDiagnostics ^js program))
  (^js [program cancellation-token]
   (.getOptionsDiagnostics ^js program cancellation-token)))

(defn global-diagnostics
  (^js [program]
   (.getGlobalDiagnostics ^js program))
  (^js [program cancellation-token]
   (.getGlobalDiagnostics ^js program cancellation-token)))

(defn syntactic-diagnostics
  (^js [program]
   (.getSyntacticDiagnostics ^js program))
  (^js [program source-file]
   (.getSyntacticDiagnostics ^js program source-file))
  (^js [program source-file cancellation-token]
   (.getSyntacticDiagnostics ^js program source-file cancellation-token)))

(defn semantic-diagnostics
  "The first time this is called, it will return global diagnostics (no location)."
  (^js [program]
   (.getSemanticDiagnostics ^js program))
  (^js [program source-file]
   (.getSemanticDiagnostics ^js program source-file))
  (^js [program source-file cancellation-token]
   (.getSemanticDiagnostics ^js program source-file cancellation-token)))

(defn declaration-diagnostics
  (^js [program]
   (.getDeclarationDiagnostics ^js program))
  (^js [program source-file]
   (.getDeclarationDiagnostics ^js program source-file))
  (^js [program source-file cancellation-token]
   (.getDeclarationDiagnostics ^js program source-file cancellation-token)))

(defn config-file-parsing-diagnostics
  ^js [program]
  (.getConfigFileParsingDiagnostics ^js program))

(defn type-checker
  "Gets a type checker that can be used to semantically analyze source files in the program."
  ^js [program]
  (.getTypeChecker ^js program))

(defn node-count
  ^js [program]
  (.getNodeCount ^js program))

(defn identifier-count
  ^js [program]
  (.getIdentifierCount ^js program))

(defn symbol-count
  ^js [program]
  (.getSymbolCount ^js program))

(defn type-count
  ^js [program]
  (.getTypeCount ^js program))

(defn instantiation-count
  ^js [program]
  (.getInstantiationCount ^js program))

(defn relation-cache-sizes
  ^js [program]
  (.getRelationCacheSizes ^js program))

(defn source-file-from-external-library?
  ^js [program file]
  (.isSourceFileFromExternalLibrary ^js program file))

(defn source-file-default-library?
  ^js [program file]
  (.isSourceFileDefaultLibrary ^js program file))

(defn project-references
  ^js [program]
  (.getProjectReferences ^js program))

(defn resolved-project-references
  ^js [program]
  (.getResolvedProjectReferences ^js program))

(defn compiler-options
  ^js [program]
  (.getCompilerOptions ^js program))

(defn source-file
  ^js [program file-name]
  (.getSourceFile ^js program file-name))

(defn source-file-by-path
  ^js [program path]
  (.getSourceFileByPath ^js program path))
