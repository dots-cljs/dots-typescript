(ns dots.typescript.watch-compiler-host-of-files-and-compiler-options
  "Host to create watch with root files and options")

(defn root-files
  "root files to use to generate program"
  ^js [watch-compiler-host-of-files-and-compiler-options]
  (.-rootFiles ^js watch-compiler-host-of-files-and-compiler-options))

(defn set-root-files!
  "root files to use to generate program"
  ^js [watch-compiler-host-of-files-and-compiler-options value]
  (set! (.-rootFiles ^js watch-compiler-host-of-files-and-compiler-options) value))

(defn options
  "Compiler options"
  ^js [watch-compiler-host-of-files-and-compiler-options]
  (.-options ^js watch-compiler-host-of-files-and-compiler-options))

(defn set-options!
  "Compiler options"
  ^js [watch-compiler-host-of-files-and-compiler-options value]
  (set! (.-options ^js watch-compiler-host-of-files-and-compiler-options) value))

(defn watch-options
  ^js [watch-compiler-host-of-files-and-compiler-options]
  (.-watchOptions ^js watch-compiler-host-of-files-and-compiler-options))

(defn set-watch-options!
  ^js [watch-compiler-host-of-files-and-compiler-options value]
  (set! (.-watchOptions ^js watch-compiler-host-of-files-and-compiler-options) value))

(defn project-references
  "Project References"
  ^js [watch-compiler-host-of-files-and-compiler-options]
  (.-projectReferences ^js watch-compiler-host-of-files-and-compiler-options))

(defn set-project-references!
  "Project References"
  ^js [watch-compiler-host-of-files-and-compiler-options value]
  (set! (.-projectReferences ^js watch-compiler-host-of-files-and-compiler-options) value))

(defn use-source-of-project-reference-redirect?
  "Instead of using output d.ts file from project reference, use its source file"
  ^js [watch-compiler-host-of-files-and-compiler-options]
  (.useSourceOfProjectReferenceRedirect ^js watch-compiler-host-of-files-and-compiler-options))

(defn parsed-command-line
  "If provided, use this method to get parsed command lines for referenced projects"
  ^js [watch-compiler-host-of-files-and-compiler-options file-name]
  (.getParsedCommandLine ^js watch-compiler-host-of-files-and-compiler-options file-name))

(defn after-program-create
  "If provided, callback to invoke after every new program creation"
  ^js [watch-compiler-host-of-files-and-compiler-options program]
  (.afterProgramCreate ^js watch-compiler-host-of-files-and-compiler-options program))

(defn create-program
  "Used to create the program when need for program creation or recreation detected"
  ^js [watch-compiler-host-of-files-and-compiler-options]
  (.-createProgram ^js watch-compiler-host-of-files-and-compiler-options))

(defn set-create-program!
  "Used to create the program when need for program creation or recreation detected"
  ^js [watch-compiler-host-of-files-and-compiler-options value]
  (set! (.-createProgram ^js watch-compiler-host-of-files-and-compiler-options) value))

(defn use-case-sensitive-file-names?
  ^js [watch-compiler-host-of-files-and-compiler-options]
  (.useCaseSensitiveFileNames ^js watch-compiler-host-of-files-and-compiler-options))

(defn new-line
  ^js [watch-compiler-host-of-files-and-compiler-options]
  (.getNewLine ^js watch-compiler-host-of-files-and-compiler-options))

(defn current-directory
  ^js [watch-compiler-host-of-files-and-compiler-options]
  (.getCurrentDirectory ^js watch-compiler-host-of-files-and-compiler-options))

(defn default-lib-file-name
  ^js [watch-compiler-host-of-files-and-compiler-options options]
  (.getDefaultLibFileName ^js watch-compiler-host-of-files-and-compiler-options options))

(defn default-lib-location
  ^js [watch-compiler-host-of-files-and-compiler-options]
  (.getDefaultLibLocation ^js watch-compiler-host-of-files-and-compiler-options))

(defn create-hash
  ^js [watch-compiler-host-of-files-and-compiler-options data]
  (.createHash ^js watch-compiler-host-of-files-and-compiler-options data))

(defn file-exists?
  "Use to check file presence for source files and
   if resolveModuleNames is not provided (complier is in charge of module resolution) then module files as well"
  ^js [watch-compiler-host-of-files-and-compiler-options path]
  (.fileExists ^js watch-compiler-host-of-files-and-compiler-options path))

(defn read-file
  "Use to read file text for source files and
   if resolveModuleNames is not provided (complier is in charge of module resolution) then module files as well"
  (^js [watch-compiler-host-of-files-and-compiler-options path]
   (.readFile ^js watch-compiler-host-of-files-and-compiler-options path))
  (^js [watch-compiler-host-of-files-and-compiler-options path encoding]
   (.readFile ^js watch-compiler-host-of-files-and-compiler-options path encoding)))

(defn directory-exists?
  "If provided, used for module resolution as well as to handle directory structure"
  ^js [watch-compiler-host-of-files-and-compiler-options path]
  (.directoryExists ^js watch-compiler-host-of-files-and-compiler-options path))

(defn directories
  "If provided, used in resolutions as well as handling directory structure"
  ^js [watch-compiler-host-of-files-and-compiler-options path]
  (.getDirectories ^js watch-compiler-host-of-files-and-compiler-options path))

(defn read-directory
  "If provided, used to cache and handle directory structure modifications"
  (^js [watch-compiler-host-of-files-and-compiler-options path]
   (.readDirectory ^js watch-compiler-host-of-files-and-compiler-options path))
  (^js [watch-compiler-host-of-files-and-compiler-options path extensions]
   (.readDirectory ^js watch-compiler-host-of-files-and-compiler-options path extensions))
  (^js [watch-compiler-host-of-files-and-compiler-options path extensions exclude]
   (.readDirectory ^js watch-compiler-host-of-files-and-compiler-options path extensions exclude))
  (^js [watch-compiler-host-of-files-and-compiler-options path extensions exclude include]
   (.readDirectory ^js watch-compiler-host-of-files-and-compiler-options path extensions exclude include))
  (^js [watch-compiler-host-of-files-and-compiler-options path extensions exclude include depth]
   (.readDirectory ^js watch-compiler-host-of-files-and-compiler-options path extensions exclude include depth)))

(defn realpath
  "Symbol links resolution"
  ^js [watch-compiler-host-of-files-and-compiler-options path]
  (.realpath ^js watch-compiler-host-of-files-and-compiler-options path))

(defn trace
  "If provided would be used to write log about compilation"
  ^js [watch-compiler-host-of-files-and-compiler-options s]
  (.trace ^js watch-compiler-host-of-files-and-compiler-options s))

(defn environment-variable
  "If provided is used to get the environment variable"
  ^js [watch-compiler-host-of-files-and-compiler-options name]
  (.getEnvironmentVariable ^js watch-compiler-host-of-files-and-compiler-options name))

(defn resolve-module-names
  "If provided, used to resolve the module names, otherwise typescript's default module resolution"
  (^js [watch-compiler-host-of-files-and-compiler-options module-names containing-file]
   (.resolveModuleNames ^js watch-compiler-host-of-files-and-compiler-options module-names containing-file))
  (^js [watch-compiler-host-of-files-and-compiler-options module-names containing-file reused-names]
   (.resolveModuleNames ^js watch-compiler-host-of-files-and-compiler-options module-names containing-file reused-names))
  (^js [watch-compiler-host-of-files-and-compiler-options module-names containing-file reused-names redirected-reference]
   (.resolveModuleNames ^js watch-compiler-host-of-files-and-compiler-options module-names containing-file reused-names redirected-reference))
  (^js [watch-compiler-host-of-files-and-compiler-options module-names containing-file reused-names redirected-reference options]
   (.resolveModuleNames ^js watch-compiler-host-of-files-and-compiler-options module-names containing-file reused-names redirected-reference options))
  (^js [watch-compiler-host-of-files-and-compiler-options module-names containing-file reused-names redirected-reference options containing-source-file]
   (.resolveModuleNames ^js watch-compiler-host-of-files-and-compiler-options module-names containing-file reused-names redirected-reference options containing-source-file)))

(defn resolve-type-reference-directives
  "If provided, used to resolve type reference directives, otherwise typescript's default resolution"
  (^js [watch-compiler-host-of-files-and-compiler-options type-reference-directive-names containing-file]
   (.resolveTypeReferenceDirectives ^js watch-compiler-host-of-files-and-compiler-options type-reference-directive-names containing-file))
  (^js [watch-compiler-host-of-files-and-compiler-options type-reference-directive-names containing-file redirected-reference]
   (.resolveTypeReferenceDirectives ^js watch-compiler-host-of-files-and-compiler-options type-reference-directive-names containing-file redirected-reference))
  (^js [watch-compiler-host-of-files-and-compiler-options type-reference-directive-names containing-file redirected-reference options]
   (.resolveTypeReferenceDirectives ^js watch-compiler-host-of-files-and-compiler-options type-reference-directive-names containing-file redirected-reference options))
  (^js [watch-compiler-host-of-files-and-compiler-options type-reference-directive-names containing-file redirected-reference options containing-file-mode]
   (.resolveTypeReferenceDirectives ^js watch-compiler-host-of-files-and-compiler-options type-reference-directive-names containing-file redirected-reference options containing-file-mode)))

(defn module-resolution-cache
  "Returns the module resolution cache used by a provided `resolveModuleNames` implementation so that any non-name module resolution operations (eg, package.json lookup) can reuse it"
  ^js [watch-compiler-host-of-files-and-compiler-options]
  (.getModuleResolutionCache ^js watch-compiler-host-of-files-and-compiler-options))

(defn on-watch-status-change
  "If provided, called with Diagnostic message that informs about change in watch status"
  (^js [watch-compiler-host-of-files-and-compiler-options diagnostic new-line options]
   (.onWatchStatusChange ^js watch-compiler-host-of-files-and-compiler-options diagnostic new-line options))
  (^js [watch-compiler-host-of-files-and-compiler-options diagnostic new-line options error-count]
   (.onWatchStatusChange ^js watch-compiler-host-of-files-and-compiler-options diagnostic new-line options error-count)))

(defn watch-file
  "Used to watch changes in source files, missing files needed to update the program or config file"
  (^js [watch-compiler-host-of-files-and-compiler-options path callback]
   (.watchFile ^js watch-compiler-host-of-files-and-compiler-options path callback))
  (^js [watch-compiler-host-of-files-and-compiler-options path callback polling-interval]
   (.watchFile ^js watch-compiler-host-of-files-and-compiler-options path callback polling-interval))
  (^js [watch-compiler-host-of-files-and-compiler-options path callback polling-interval options]
   (.watchFile ^js watch-compiler-host-of-files-and-compiler-options path callback polling-interval options)))

(defn watch-directory
  "Used to watch resolved module's failed lookup locations, config file specs, type roots where auto type reference directives are added"
  (^js [watch-compiler-host-of-files-and-compiler-options path callback]
   (.watchDirectory ^js watch-compiler-host-of-files-and-compiler-options path callback))
  (^js [watch-compiler-host-of-files-and-compiler-options path callback recursive?]
   (.watchDirectory ^js watch-compiler-host-of-files-and-compiler-options path callback recursive?))
  (^js [watch-compiler-host-of-files-and-compiler-options path callback recursive? options]
   (.watchDirectory ^js watch-compiler-host-of-files-and-compiler-options path callback recursive? options)))

(defn set-timeout
  "If provided, will be used to set delayed compilation, so that multiple changes in short span are compiled together"
  ^js [watch-compiler-host-of-files-and-compiler-options callback ms & args]
  (.. ^js watch-compiler-host-of-files-and-compiler-options -setTimeout (apply ^js watch-compiler-host-of-files-and-compiler-options (to-array (list* callback ms args)))))

(defn clear-timeout
  "If provided, will be used to reset existing delayed compilation"
  ^js [watch-compiler-host-of-files-and-compiler-options timeout-id]
  (.clearTimeout ^js watch-compiler-host-of-files-and-compiler-options timeout-id))
