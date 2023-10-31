(ns dots.typescript.compiler-host)

(defn source-file
  (^js [compiler-host file-name language-version-or-options]
   (.getSourceFile ^js compiler-host file-name language-version-or-options))
  (^js [compiler-host file-name language-version-or-options on-error]
   (.getSourceFile ^js compiler-host file-name language-version-or-options on-error))
  (^js [compiler-host file-name language-version-or-options on-error should-create-new-source-file?]
   (.getSourceFile ^js compiler-host file-name language-version-or-options on-error should-create-new-source-file?)))

(defn source-file-by-path
  (^js [compiler-host file-name path language-version-or-options]
   (.getSourceFileByPath ^js compiler-host file-name path language-version-or-options))
  (^js [compiler-host file-name path language-version-or-options on-error]
   (.getSourceFileByPath ^js compiler-host file-name path language-version-or-options on-error))
  (^js [compiler-host file-name path language-version-or-options on-error should-create-new-source-file?]
   (.getSourceFileByPath ^js compiler-host file-name path language-version-or-options on-error should-create-new-source-file?)))

(defn cancellation-token
  ^js [compiler-host]
  (.getCancellationToken ^js compiler-host))

(defn default-lib-file-name
  ^js [compiler-host options]
  (.getDefaultLibFileName ^js compiler-host options))

(defn default-lib-location
  ^js [compiler-host]
  (.getDefaultLibLocation ^js compiler-host))

(defn write-file
  ^js [compiler-host]
  (.-writeFile ^js compiler-host))

(defn set-write-file!
  ^js [compiler-host value]
  (set! (.-writeFile ^js compiler-host) value))

(defn current-directory
  ^js [compiler-host]
  (.getCurrentDirectory ^js compiler-host))

(defn canonical-file-name
  ^js [compiler-host file-name]
  (.getCanonicalFileName ^js compiler-host file-name))

(defn use-case-sensitive-file-names?
  ^js [compiler-host]
  (.useCaseSensitiveFileNames ^js compiler-host))

(defn new-line
  ^js [compiler-host]
  (.getNewLine ^js compiler-host))

(defn read-directory
  (^js [compiler-host root-dir extensions]
   (.readDirectory ^js compiler-host root-dir extensions))
  (^js [compiler-host root-dir extensions excludes]
   (.readDirectory ^js compiler-host root-dir extensions excludes))
  (^js [compiler-host root-dir extensions excludes includes]
   (.readDirectory ^js compiler-host root-dir extensions excludes includes))
  (^js [compiler-host root-dir extensions excludes includes depth]
   (.readDirectory ^js compiler-host root-dir extensions excludes includes depth)))

(defn resolve-module-names
  (^js [compiler-host module-names containing-file]
   (.resolveModuleNames ^js compiler-host module-names containing-file))
  (^js [compiler-host module-names containing-file reused-names]
   (.resolveModuleNames ^js compiler-host module-names containing-file reused-names))
  (^js [compiler-host module-names containing-file reused-names redirected-reference]
   (.resolveModuleNames ^js compiler-host module-names containing-file reused-names redirected-reference))
  (^js [compiler-host module-names containing-file reused-names redirected-reference options]
   (.resolveModuleNames ^js compiler-host module-names containing-file reused-names redirected-reference options))
  (^js [compiler-host module-names containing-file reused-names redirected-reference options containing-source-file]
   (.resolveModuleNames ^js compiler-host module-names containing-file reused-names redirected-reference options containing-source-file)))

(defn module-resolution-cache
  "Returns the module resolution cache used by a provided `resolveModuleNames` implementation so that any non-name module resolution operations (eg, package.json lookup) can reuse it"
  ^js [compiler-host]
  (.getModuleResolutionCache ^js compiler-host))

(defn resolve-type-reference-directives
  "This method is a companion for 'resolveModuleNames' and is used to resolve 'types' references to actual type declaration files"
  (^js [compiler-host type-reference-directive-names containing-file]
   (.resolveTypeReferenceDirectives ^js compiler-host type-reference-directive-names containing-file))
  (^js [compiler-host type-reference-directive-names containing-file redirected-reference]
   (.resolveTypeReferenceDirectives ^js compiler-host type-reference-directive-names containing-file redirected-reference))
  (^js [compiler-host type-reference-directive-names containing-file redirected-reference options]
   (.resolveTypeReferenceDirectives ^js compiler-host type-reference-directive-names containing-file redirected-reference options))
  (^js [compiler-host type-reference-directive-names containing-file redirected-reference options containing-file-mode]
   (.resolveTypeReferenceDirectives ^js compiler-host type-reference-directive-names containing-file redirected-reference options containing-file-mode)))

(defn environment-variable
  ^js [compiler-host name]
  (.getEnvironmentVariable ^js compiler-host name))

(defn create-hash
  ^js [compiler-host data]
  (.createHash ^js compiler-host data))

(defn parsed-command-line
  ^js [compiler-host file-name]
  (.getParsedCommandLine ^js compiler-host file-name))

(defn file-exists?
  ^js [compiler-host file-name]
  (.fileExists ^js compiler-host file-name))

(defn read-file
  ^js [compiler-host file-name]
  (.readFile ^js compiler-host file-name))

(defn trace
  ^js [compiler-host s]
  (.trace ^js compiler-host s))

(defn directory-exists?
  ^js [compiler-host directory-name]
  (.directoryExists ^js compiler-host directory-name))

(defn realpath
  "Resolve a symbolic link."
  ^js [compiler-host path]
  (.realpath ^js compiler-host path))

(defn directories
  ^js [compiler-host path]
  (.getDirectories ^js compiler-host path))
