(ns dots.typescript.resolved-module
  "Represents the result of module resolution.
   Module resolution will pick up tsx/jsx/js files even if '--jsx' and '--allowJs' are turned off.
   The Program will then filter results based on these flags.
   
   Prefer to return a `ResolvedModuleFull` so that the file type does not have to be inferred.")

(defn resolved-file-name
  "Path of the file the module was resolved to."
  ^js [resolved-module]
  (.-resolvedFileName ^js resolved-module))

(defn set-resolved-file-name!
  "Path of the file the module was resolved to."
  ^js [resolved-module value]
  (set! (.-resolvedFileName ^js resolved-module) value))

(defn external-library-import?
  "True if `resolvedFileName` comes from `node_modules`."
  ^js [resolved-module]
  (.-isExternalLibraryImport ^js resolved-module))

(defn set-is-external-library-import!
  "True if `resolvedFileName` comes from `node_modules`."
  ^js [resolved-module value]
  (set! (.-isExternalLibraryImport ^js resolved-module) value))

(defn resolved-using-ts-extension?
  "True if the original module reference used a .ts extension to refer directly to a .ts file,
   which should produce an error during checking if emit is enabled."
  ^js [resolved-module]
  (.-resolvedUsingTsExtension ^js resolved-module))

(defn set-resolved-using-ts-extension!
  "True if the original module reference used a .ts extension to refer directly to a .ts file,
   which should produce an error during checking if emit is enabled."
  ^js [resolved-module value]
  (set! (.-resolvedUsingTsExtension ^js resolved-module) value))
