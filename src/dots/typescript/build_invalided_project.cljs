(ns dots.typescript.build-invalided-project)

(defn kind
  ^js [build-invalided-project]
  (.-kind ^js build-invalided-project))

(defn builder-program
  ^js [build-invalided-project]
  (.getBuilderProgram ^js build-invalided-project))

(defn program
  ^js [build-invalided-project]
  (.getProgram ^js build-invalided-project))

(defn source-file
  ^js [build-invalided-project file-name]
  (.getSourceFile ^js build-invalided-project file-name))

(defn source-files
  ^js [build-invalided-project]
  (.getSourceFiles ^js build-invalided-project))

(defn options-diagnostics
  (^js [build-invalided-project]
   (.getOptionsDiagnostics ^js build-invalided-project))
  (^js [build-invalided-project cancellation-token]
   (.getOptionsDiagnostics ^js build-invalided-project cancellation-token)))

(defn global-diagnostics
  (^js [build-invalided-project]
   (.getGlobalDiagnostics ^js build-invalided-project))
  (^js [build-invalided-project cancellation-token]
   (.getGlobalDiagnostics ^js build-invalided-project cancellation-token)))

(defn config-file-parsing-diagnostics
  ^js [build-invalided-project]
  (.getConfigFileParsingDiagnostics ^js build-invalided-project))

(defn syntactic-diagnostics
  (^js [build-invalided-project]
   (.getSyntacticDiagnostics ^js build-invalided-project))
  (^js [build-invalided-project source-file]
   (.getSyntacticDiagnostics ^js build-invalided-project source-file))
  (^js [build-invalided-project source-file cancellation-token]
   (.getSyntacticDiagnostics ^js build-invalided-project source-file cancellation-token)))

(defn all-dependencies
  ^js [build-invalided-project source-file]
  (.getAllDependencies ^js build-invalided-project source-file))

(defn semantic-diagnostics
  (^js [build-invalided-project]
   (.getSemanticDiagnostics ^js build-invalided-project))
  (^js [build-invalided-project source-file]
   (.getSemanticDiagnostics ^js build-invalided-project source-file))
  (^js [build-invalided-project source-file cancellation-token]
   (.getSemanticDiagnostics ^js build-invalided-project source-file cancellation-token)))

(defn semantic-diagnostics-of-next-affected-file
  (^js [build-invalided-project]
   (.getSemanticDiagnosticsOfNextAffectedFile ^js build-invalided-project))
  (^js [build-invalided-project cancellation-token]
   (.getSemanticDiagnosticsOfNextAffectedFile ^js build-invalided-project cancellation-token))
  (^js [build-invalided-project cancellation-token ignore-source-file]
   (.getSemanticDiagnosticsOfNextAffectedFile ^js build-invalided-project cancellation-token ignore-source-file)))

(defn emit
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
  ^js [build-invalided-project]
  (.-project ^js build-invalided-project))

(defn done
  "To dispose this project and ensure that all the necessary actions are taken and state is updated accordingly"
  (^js [build-invalided-project]
   (.done ^js build-invalided-project))
  (^js [build-invalided-project cancellation-token]
   (.done ^js build-invalided-project cancellation-token))
  (^js [build-invalided-project cancellation-token write-file]
   (.done ^js build-invalided-project cancellation-token write-file))
  (^js [build-invalided-project cancellation-token write-file custom-transformers]
   (.done ^js build-invalided-project cancellation-token write-file custom-transformers)))

(defn compiler-options
  ^js [build-invalided-project]
  (.getCompilerOptions ^js build-invalided-project))

(defn current-directory
  ^js [build-invalided-project]
  (.getCurrentDirectory ^js build-invalided-project))
