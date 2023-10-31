(ns dots.typescript.resolved-module-full
  "ResolvedModule with an explicitly provided `extension` property.
   Prefer this over `ResolvedModule`.
   If changing this, remember to change `moduleResolutionIsEqualTo`.")

(defn extension
  "Extension of resolvedFileName. This must match what's at the end of resolvedFileName.
   This is optional for backwards-compatibility, but will be added if not provided."
  ^js [resolved-module-full]
  (.-extension ^js resolved-module-full))

(defn set-extension!
  "Extension of resolvedFileName. This must match what's at the end of resolvedFileName.
   This is optional for backwards-compatibility, but will be added if not provided."
  ^js [resolved-module-full value]
  (set! (.-extension ^js resolved-module-full) value))

(defn package-id
  ^js [resolved-module-full]
  (.-packageId ^js resolved-module-full))

(defn set-package-id!
  ^js [resolved-module-full value]
  (set! (.-packageId ^js resolved-module-full) value))

(defn resolved-file-name
  "Path of the file the module was resolved to."
  ^js [resolved-module-full]
  (.-resolvedFileName ^js resolved-module-full))

(defn set-resolved-file-name!
  "Path of the file the module was resolved to."
  ^js [resolved-module-full value]
  (set! (.-resolvedFileName ^js resolved-module-full) value))

(defn external-library-import?
  "True if `resolvedFileName` comes from `node_modules`."
  ^js [resolved-module-full]
  (.-isExternalLibraryImport ^js resolved-module-full))

(defn set-is-external-library-import!
  "True if `resolvedFileName` comes from `node_modules`."
  ^js [resolved-module-full value]
  (set! (.-isExternalLibraryImport ^js resolved-module-full) value))
