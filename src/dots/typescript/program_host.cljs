(ns dots.typescript.program-host)

(defn create-program
  "Used to create the program when need for program creation or recreation detected"
  ^js [program-host]
  (.-createProgram ^js program-host))

(defn set-create-program!
  "Used to create the program when need for program creation or recreation detected"
  ^js [program-host value]
  (set! (.-createProgram ^js program-host) value))

(defn use-case-sensitive-file-names?
  ^js [program-host]
  (.useCaseSensitiveFileNames ^js program-host))

(defn new-line
  ^js [program-host]
  (.getNewLine ^js program-host))

(defn current-directory
  ^js [program-host]
  (.getCurrentDirectory ^js program-host))

(defn default-lib-file-name
  ^js [program-host options]
  (.getDefaultLibFileName ^js program-host options))

(defn default-lib-location
  ^js [program-host]
  (.getDefaultLibLocation ^js program-host))

(defn create-hash
  ^js [program-host data]
  (.createHash ^js program-host data))

(defn file-exists?
  "Use to check file presence for source files and
   if resolveModuleNames is not provided (complier is in charge of module resolution) then module files as well"
  ^js [program-host path]
  (.fileExists ^js program-host path))

(defn read-file
  "Use to read file text for source files and
   if resolveModuleNames is not provided (complier is in charge of module resolution) then module files as well"
  (^js [program-host path]
   (.readFile ^js program-host path))
  (^js [program-host path encoding]
   (.readFile ^js program-host path encoding)))

(defn directory-exists?
  "If provided, used for module resolution as well as to handle directory structure"
  ^js [program-host path]
  (.directoryExists ^js program-host path))

(defn directories
  "If provided, used in resolutions as well as handling directory structure"
  ^js [program-host path]
  (.getDirectories ^js program-host path))

(defn read-directory
  "If provided, used to cache and handle directory structure modifications"
  (^js [program-host path]
   (.readDirectory ^js program-host path))
  (^js [program-host path extensions]
   (.readDirectory ^js program-host path extensions))
  (^js [program-host path extensions exclude]
   (.readDirectory ^js program-host path extensions exclude))
  (^js [program-host path extensions exclude include]
   (.readDirectory ^js program-host path extensions exclude include))
  (^js [program-host path extensions exclude include depth]
   (.readDirectory ^js program-host path extensions exclude include depth)))

(defn realpath
  "Symbol links resolution"
  ^js [program-host path]
  (.realpath ^js program-host path))

(defn trace
  "If provided would be used to write log about compilation"
  ^js [program-host s]
  (.trace ^js program-host s))

(defn environment-variable
  "If provided is used to get the environment variable"
  ^js [program-host name]
  (.getEnvironmentVariable ^js program-host name))

(defn resolve-module-names
  "If provided, used to resolve the module names, otherwise typescript's default module resolution"
  (^js [program-host module-names containing-file]
   (.resolveModuleNames ^js program-host module-names containing-file))
  (^js [program-host module-names containing-file reused-names]
   (.resolveModuleNames ^js program-host module-names containing-file reused-names))
  (^js [program-host module-names containing-file reused-names redirected-reference]
   (.resolveModuleNames ^js program-host module-names containing-file reused-names redirected-reference))
  (^js [program-host module-names containing-file reused-names redirected-reference options]
   (.resolveModuleNames ^js program-host module-names containing-file reused-names redirected-reference options))
  (^js [program-host module-names containing-file reused-names redirected-reference options containing-source-file]
   (.resolveModuleNames ^js program-host module-names containing-file reused-names redirected-reference options containing-source-file)))

(defn resolve-type-reference-directives
  "If provided, used to resolve type reference directives, otherwise typescript's default resolution"
  (^js [program-host type-reference-directive-names containing-file]
   (.resolveTypeReferenceDirectives ^js program-host type-reference-directive-names containing-file))
  (^js [program-host type-reference-directive-names containing-file redirected-reference]
   (.resolveTypeReferenceDirectives ^js program-host type-reference-directive-names containing-file redirected-reference))
  (^js [program-host type-reference-directive-names containing-file redirected-reference options]
   (.resolveTypeReferenceDirectives ^js program-host type-reference-directive-names containing-file redirected-reference options))
  (^js [program-host type-reference-directive-names containing-file redirected-reference options containing-file-mode]
   (.resolveTypeReferenceDirectives ^js program-host type-reference-directive-names containing-file redirected-reference options containing-file-mode)))

(defn module-resolution-cache
  "Returns the module resolution cache used by a provided `resolveModuleNames` implementation so that any non-name module resolution operations (eg, package.json lookup) can reuse it"
  ^js [program-host]
  (.getModuleResolutionCache ^js program-host))
