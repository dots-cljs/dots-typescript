(ns dots.typescript.solution-builder-host-base)

(defn create-directory
  ^js [solution-builder-host-base path]
  (.createDirectory ^js solution-builder-host-base path))

(defn write-file
  "Should provide create directory and writeFile if done of invalidatedProjects is not invoked with
   writeFileCallback"
  (^js [solution-builder-host-base path data]
   (.writeFile ^js solution-builder-host-base path data))
  (^js [solution-builder-host-base path data write-byte-order-mark?]
   (.writeFile ^js solution-builder-host-base path data write-byte-order-mark?)))

(defn custom-transformers
  ^js [solution-builder-host-base]
  (.-getCustomTransformers ^js solution-builder-host-base))

(defn set-get-custom-transformers!
  ^js [solution-builder-host-base value]
  (set! (.-getCustomTransformers ^js solution-builder-host-base) value))

(defn modified-time
  ^js [solution-builder-host-base file-name]
  (.getModifiedTime ^js solution-builder-host-base file-name))

(defn set-modified-time
  ^js [solution-builder-host-base file-name date]
  (.setModifiedTime ^js solution-builder-host-base file-name date))

(defn delete-file
  ^js [solution-builder-host-base file-name]
  (.deleteFile ^js solution-builder-host-base file-name))

(defn parsed-command-line
  ^js [solution-builder-host-base file-name]
  (.getParsedCommandLine ^js solution-builder-host-base file-name))

(defn report-diagnostic
  ^js [solution-builder-host-base]
  (.-reportDiagnostic ^js solution-builder-host-base))

(defn set-report-diagnostic!
  ^js [solution-builder-host-base value]
  (set! (.-reportDiagnostic ^js solution-builder-host-base) value))

(defn report-solution-builder-status
  ^js [solution-builder-host-base]
  (.-reportSolutionBuilderStatus ^js solution-builder-host-base))

(defn set-report-solution-builder-status!
  ^js [solution-builder-host-base value]
  (set! (.-reportSolutionBuilderStatus ^js solution-builder-host-base) value))

(defn after-program-emit-and-diagnostics
  ^js [solution-builder-host-base program]
  (.afterProgramEmitAndDiagnostics ^js solution-builder-host-base program))

(defn create-program
  "Used to create the program when need for program creation or recreation detected"
  ^js [solution-builder-host-base]
  (.-createProgram ^js solution-builder-host-base))

(defn set-create-program!
  "Used to create the program when need for program creation or recreation detected"
  ^js [solution-builder-host-base value]
  (set! (.-createProgram ^js solution-builder-host-base) value))

(defn use-case-sensitive-file-names?
  ^js [solution-builder-host-base]
  (.useCaseSensitiveFileNames ^js solution-builder-host-base))

(defn new-line
  ^js [solution-builder-host-base]
  (.getNewLine ^js solution-builder-host-base))

(defn current-directory
  ^js [solution-builder-host-base]
  (.getCurrentDirectory ^js solution-builder-host-base))

(defn default-lib-file-name
  ^js [solution-builder-host-base options]
  (.getDefaultLibFileName ^js solution-builder-host-base options))

(defn default-lib-location
  ^js [solution-builder-host-base]
  (.getDefaultLibLocation ^js solution-builder-host-base))

(defn create-hash
  ^js [solution-builder-host-base data]
  (.createHash ^js solution-builder-host-base data))

(defn file-exists?
  "Use to check file presence for source files and
   if resolveModuleNames is not provided (complier is in charge of module resolution) then module files as well"
  ^js [solution-builder-host-base path]
  (.fileExists ^js solution-builder-host-base path))

(defn read-file
  "Use to read file text for source files and
   if resolveModuleNames is not provided (complier is in charge of module resolution) then module files as well"
  (^js [solution-builder-host-base path]
   (.readFile ^js solution-builder-host-base path))
  (^js [solution-builder-host-base path encoding]
   (.readFile ^js solution-builder-host-base path encoding)))

(defn directory-exists?
  "If provided, used for module resolution as well as to handle directory structure"
  ^js [solution-builder-host-base path]
  (.directoryExists ^js solution-builder-host-base path))

(defn directories
  "If provided, used in resolutions as well as handling directory structure"
  ^js [solution-builder-host-base path]
  (.getDirectories ^js solution-builder-host-base path))

(defn read-directory
  "If provided, used to cache and handle directory structure modifications"
  (^js [solution-builder-host-base path]
   (.readDirectory ^js solution-builder-host-base path))
  (^js [solution-builder-host-base path extensions]
   (.readDirectory ^js solution-builder-host-base path extensions))
  (^js [solution-builder-host-base path extensions exclude]
   (.readDirectory ^js solution-builder-host-base path extensions exclude))
  (^js [solution-builder-host-base path extensions exclude include]
   (.readDirectory ^js solution-builder-host-base path extensions exclude include))
  (^js [solution-builder-host-base path extensions exclude include depth]
   (.readDirectory ^js solution-builder-host-base path extensions exclude include depth)))

(defn realpath
  "Symbol links resolution"
  ^js [solution-builder-host-base path]
  (.realpath ^js solution-builder-host-base path))

(defn trace
  "If provided would be used to write log about compilation"
  ^js [solution-builder-host-base s]
  (.trace ^js solution-builder-host-base s))

(defn environment-variable
  "If provided is used to get the environment variable"
  ^js [solution-builder-host-base name]
  (.getEnvironmentVariable ^js solution-builder-host-base name))

(defn resolve-module-names
  "If provided, used to resolve the module names, otherwise typescript's default module resolution"
  (^js [solution-builder-host-base module-names containing-file]
   (.resolveModuleNames ^js solution-builder-host-base module-names containing-file))
  (^js [solution-builder-host-base module-names containing-file reused-names]
   (.resolveModuleNames ^js solution-builder-host-base module-names containing-file reused-names))
  (^js [solution-builder-host-base module-names containing-file reused-names redirected-reference]
   (.resolveModuleNames ^js solution-builder-host-base module-names containing-file reused-names redirected-reference))
  (^js [solution-builder-host-base module-names containing-file reused-names redirected-reference options]
   (.resolveModuleNames ^js solution-builder-host-base module-names containing-file reused-names redirected-reference options))
  (^js [solution-builder-host-base module-names containing-file reused-names redirected-reference options containing-source-file]
   (.resolveModuleNames ^js solution-builder-host-base module-names containing-file reused-names redirected-reference options containing-source-file)))

(defn resolve-type-reference-directives
  "If provided, used to resolve type reference directives, otherwise typescript's default resolution"
  (^js [solution-builder-host-base type-reference-directive-names containing-file]
   (.resolveTypeReferenceDirectives ^js solution-builder-host-base type-reference-directive-names containing-file))
  (^js [solution-builder-host-base type-reference-directive-names containing-file redirected-reference]
   (.resolveTypeReferenceDirectives ^js solution-builder-host-base type-reference-directive-names containing-file redirected-reference))
  (^js [solution-builder-host-base type-reference-directive-names containing-file redirected-reference options]
   (.resolveTypeReferenceDirectives ^js solution-builder-host-base type-reference-directive-names containing-file redirected-reference options))
  (^js [solution-builder-host-base type-reference-directive-names containing-file redirected-reference options containing-file-mode]
   (.resolveTypeReferenceDirectives ^js solution-builder-host-base type-reference-directive-names containing-file redirected-reference options containing-file-mode)))

(defn module-resolution-cache
  "Returns the module resolution cache used by a provided `resolveModuleNames` implementation so that any non-name module resolution operations (eg, package.json lookup) can reuse it"
  ^js [solution-builder-host-base]
  (.getModuleResolutionCache ^js solution-builder-host-base))
